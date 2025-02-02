<!DOCTYPE html>
<html lang="ar" dir="rtl">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>ماكدونالدز السعودية</title>
    <script src="https://cdn.tailwindcss.com"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css"></script>
    <script src="https://cdn.jsdelivr.net/npm/alpinejs@3.9.1/dist/cdn.min.js" defer></script>
    <link href="https://fonts.googleapis.com/css2?family=Tajawal:wght@400;700&display=swap" rel="stylesheet">
    <style>
        body {
            font-family: 'Tajawal', sans-serif;
            background-color: #121212;
            color: #ffffff;
        }
        .cart-btn {
            position: fixed;
            bottom: 20px;
            right: 20px;
            background: #FFD700;
            color: #000;
            border-radius: 50%;
            width: 60px;
            height: 60px;
            display: flex;
            justify-content: center;
            align-items: center;
            box-shadow: 0 4px 8px rgba(0,0,0,0.2);
            cursor: pointer;
            font-size: 24px;
            font-weight: bold;
        }
    </style>
</head>
<body class="bg-gray-900" x-data="order">
    <div class="max-w-3xl mx-auto bg-gray-800 shadow-2xl rounded-2xl overflow-hidden animate__animated animate__fadeIn">
        <header class="relative">
            <img src="imgs/MM.jpg" alt="مطعم ماكدونالدز" class="w-full h-72 object-cover rounded-t-2xl">
        </header>
        
        <div class="p-8 bg-gray-700 shadow-lg rounded-lg flex flex-col md:flex-row justify-between items-center animate__animated animate__fadeInDown">
            <div class="text-center md:text-right">
                <h1 class="text-4xl font-bold text-white">ماكدونالدز السعودية</h1>
                <p class="text-gray-400 text-lg mt-3">🕒 تجهيز الطلبات: <span class="font-bold">15 - 20 دقيقة</span></p>
                <p class="text-gray-400 text-lg mt-3"> الانتقال الئ الموقع 📍<A href="https://maps.app.goo.gl/YWk5M2uecdxfApP28">   <span class="text-blue-400 underline cursor-pointer hover:text-blue-300 transition-all">اضغط هنا</span></A></p>
                <p class="text-gray-400 text-lg mt-3">🚗 خدمات التوصيل <span class="text-blue-400 underline cursor-pointer hover:text-blue-300 transition-all">اضغط هنا</span></p>
            </div>
            <span id="status" class="text-white bg-green-500 px-8 py-4 rounded-full font-bold text-xl mt-6 md:mt-0">مفتوح</span>
        </div>
        
        <script>
            function checkStatus() {
                const now = new Date();
                const hour = now.getHours();
                const statusElement = document.getElementById('status');
                if (hour >= 10 && hour <= 23) {
                    statusElement.textContent = 'مفتوح';
                    statusElement.classList.add('bg-green-500');
                } else {
                    statusElement.textContent = 'مغلق';
                    statusElement.classList.add('bg-red-500');
                }
            }
            checkStatus();
        </script>

        <div class="p-8 flex flex-wrap justify-center gap-4 bg-gray-700 rounded-lg mt-6">
            <button @click="section = 'meals'" class="bg-gray-600 px-10 py-4 rounded-full text-xl font-semibold text-white hover:bg-gray-500 transition-all">وجبات</button>
            <button @click="section = 'sauces'" class="bg-gray-600 px-10 py-4 rounded-full text-xl font-semibold text-white hover:bg-gray-500 transition-all">الصوصات</button>
            <button @click="section = 'drinks'" class="bg-gray-600 px-10 py-4 rounded-full text-xl font-semibold text-white hover:bg-gray-500 transition-all">مشروبات</button>
        </div>

        <main class="p-8">
            <div x-show="section === 'sauces'" class="space-y-8 animate__animated animate__fadeIn">
                <div class="bg-gray-700 p-8 rounded-lg shadow-lg flex flex-col md:flex-row items-center">
                    <img src="imgs/MACSOS2.PNG" alt="صوص كاتشب" class="w-24 h-24 rounded-lg object-cover">
                    <div class="ml-0 md:ml-8 mt-4 md:mt-0 text-center md:text-right">
                        <h3 class="text-3xl font-semibold text-white">صوص كاتشب</h3>
                        <span class="text-green-400 font-bold text-2xl">2 ريال</span>
                    </div>
                    <button class="mt-4 md:mt-0 ml-auto bg-green-500 hover:bg-green-600 text-white px-6 py-3 rounded-full font-bold transition-all">إضافة</button>
                </div>
                <div class="bg-gray-700 p-8 rounded-lg shadow-lg flex flex-col md:flex-row items-center">
                    <img src="imgs/MACSOS.PNG" alt="صوص باربكيو" class="w-24 h-24 rounded-lg object-cover">
                    <div class="ml-0 md:ml-8 mt-4 md:mt-0 text-center md:text-right">
                        <h3 class="text-3xl font-semibold text-white">صوص باربكيو</h3>
                        <span class="text-green-400 font-bold text-2xl">3 ريال</span>
                    </div>
                    <button class="mt-4 md:mt-0 ml-auto bg-green-500 hover:bg-green-600 text-white px-6 py-3 rounded-full font-bold transition-all">إضافة</button>
                </div>
            </div>
            <div x-show="section === 'meals'" class="space-y-8 animate__animated animate__fadeIn">
                <div class="bg-gray-700 p-8 rounded-lg shadow-lg flex flex-col md:flex-row items-center">
                    <img src="imgs/MACROEAL.PNG" alt="وجبة ماك رويال" class="w-40 h-40 rounded-lg object-cover">
                    <div class="ml-0 md:ml-8 mt-4 md:mt-0 text-center md:text-right">
                        <h3 class="text-3xl font-semibold text-white">وجبة ماك رويال</h3>
                        <p class="text-gray-400 text-lg">لحم بقري مع الجبن والخضروات 25 ريال</p>
                        <span class="text-green-400 font-bold text-2xl">25 ريال</span>
                    </div>
                    <button @click="cart.push({name: 'وجبة ماك رويال', price: 25, img: 'imgs/mcroyal.jpeg'})" class="mt-4 md:mt-0 ml-auto bg-green-500 hover:bg-green-600 text-white px-8 py-4 rounded-full font-bold transition-all">إضافة</button>
                </div>
                <div class="bg-gray-700 p-8 rounded-lg shadow-lg flex flex-col md:flex-row items-center">
                    <img src="imgs/MACRUAP.PNG" alt="وجبة ماك راب" class="w-40 h-40 rounded-lg object-cover">
                    <div class="ml-0 md:ml-8 mt-4 md:mt-0 text-center md:text-right">
                        <h3 class="text-3xl font-semibold text-white">وجبة ماك راب</h3>
                        <p class="text-gray-400 text-lg">راب الدجاج مع الخضروات والصوص 18 ريال</p>
                        <span class="text-green-400 font-bold text-2xl">18 ريال</span>
                    </div>
                    <button @click="cart.push({name: 'وجبة ماك راب', price: 18, img: 'imgs/mcwrap.jpeg'})" class="mt-4 md:mt-0 ml-auto bg-green-500 hover:bg-green-600 text-white px-8 py-4 rounded-full font-bold transition-all">إضافة</button>
                </div>
                <div class="bg-gray-700 p-8 rounded-lg shadow-lg flex flex-col md:flex-row items-center">
                    <img src="imgs/NAGS.PNG" alt="وجبة ناغتس" class="w-40 h-40 rounded-lg object-cover">
                    <div class="ml-0 md:ml-8 mt-4 md:mt-0 text-center md:text-right">
                        <h3 class="text-3xl font-semibold text-white">وجبة ناغتس</h3>
                        <p class="text-gray-400 text-lg">قطع دجاج مقرمشة مع الصوص 20 ريال</p>
                        <span class="text-green-400 font-bold text-2xl">20 ريال</span>
                    </div>
                    <button @click="cart.push({name: 'وجبة ناغتس', price: 20, img: 'imgs/nuggets.jpeg'})" class="mt-4 md:mt-0 ml-auto bg-green-500 hover:bg-green-600 text-white px-8 py-4 rounded-full font-bold transition-all">إضافة</button>
                </div>
                <div class="bg-gray-700 p-8 rounded-lg shadow-lg flex flex-col md:flex-row items-center">
                    <img src="imgs/MACWJPH.PNG" alt="وجبة فيليه فيش" class="w-40 h-40 rounded-lg object-cover">
                    <div class="ml-0 md:ml-8 mt-4 md:mt-0 text-center md:text-right">
                        <h3 class="text-3xl font-semibold text-white">وجبة فيليه فيش</h3>
                        <p class="text-gray-400 text-lg">ساندويتش السمك مع البطاطس 21 ريال</p>
                        <span class="text-green-400 font-bold text-2xl">21 ريال</span>
                    </div>
                    <button @click="cart.push({name: 'وجبة فيليه فيش', price: 21, img: 'imgs/fish.jpeg'})" class="mt-4 md:mt-0 ml-auto bg-green-500 hover:bg-green-600 text-white px-8 py-4 rounded-full font-bold transition-all">إضافة</button>
                </div>
                <div class="bg-gray-700 p-8 rounded-lg shadow-lg flex flex-col md:flex-row items-center">
                    <img src="imgs/BIGMACK.PNG" alt="وجبة البيج ماك" class="w-40 h-40 rounded-lg object-cover">
                    <div class="ml-0 md:ml-8 mt-4 md:mt-0 text-center md:text-right">
                        <h3 class="text-3xl font-semibold text-white">وجبة البيج ماك</h3>
                        <p class="text-gray-400 text-lg">الحجم والبطاطس والمشروب 19 ريال</p>
                        <span class="text-green-400 font-bold text-2xl">19 ريال</span>
                    </div>
                    <button @click="cart.push({name: 'وجبة البيج ماك', price: 19, img: 'imgs/bigmac.jpeg'})" class="mt-4 md:mt-0 ml-auto bg-green-500 hover:bg-green-600 text-white px-8 py-4 rounded-full font-bold transition-all">إضافة</button>
                </div>
                <div class="bg-gray-700 p-8 rounded-lg shadow-lg flex flex-col md:flex-row items-center">
                    <img src="imgs/TCHEMAC.PNG" alt="وجبة ماك تشيكن" class="w-40 h-40 rounded-lg object-cover">
                    <div class="ml-0 md:ml-8 mt-4 md:mt-0 text-center md:text-right">
                        <h3 class="text-3xl font-semibold text-white">وجبة ماك تشيكن</h3>
                        <p class="text-gray-400 text-lg">ساندويتش الدجاج والبطاطس والمشروب 22 ريال</p>
                        <span class="text-green-400 font-bold text-2xl">22 ريال</span>
                    </div>
                    <button @click="cart.push({name: 'وجبة ماك تشيكن', price: 22, img: 'imgs/mcchicken.jpeg'})" class="mt-4 md:mt-0 ml-auto bg-green-500 hover:bg-green-600 text-white px-8 py-4 rounded-full font-bold transition-all">إضافة</button>
                </div>
            </div>
        </main>
    </div>

    <div x-show="cart.length > 0" class="cart-btn animate__animated animate__bounceIn" @click="showCart = true">
        🛒
    </div>

    <div x-show="showCart" class="fixed inset-0 bg-gray-900 bg-opacity-75 flex items-center justify-center" @click.away="showCart = false">
        <div class="bg-white p-8 rounded-lg shadow-lg w-96 text-gray-900">
            <h2 class="text-2xl font-bold mb-4">سلة المشتريات</h2>
            <ul>
                <template x-for="item in cart" :key="item.name">
                    <li class="flex justify-between border-b border-gray-300 py-2">
                        <span x-text="item.name"></span>
                        <span x-text="item.price + ' ريال'" class="text-green-500 font-bold"></span>
                    </li>
                </template>
            </ul>
            <div class="flex justify-between mt-4">
                <button @click="cart = []; showCart = false" class="bg-red-500 text-white px-6 py-2 rounded-lg hover:bg-red-600 transition-all">مسح السلة</button>
                <button @click="showOrderForm = true" class="bg-green-500 text-white px-6 py-2 rounded-lg hover:bg-green-600 transition-all">تجهيز الطلب</button>
            </div>
        </div>
    </div>

    <div x-show="showOrderForm" class="fixed inset-0 bg-gray-900 bg-opacity-75 flex items-center justify-center" @click.away="showOrderForm = false">
        <div class="bg-gray-800 p-8 rounded-lg shadow-lg w-96 text-white">
            <h2 class="text-2xl font-bold mb-4">تفاصيل الطلب</h2>
            <label class="block text-gray-300 mb-2">اسم المستلم</label>
            <input type="text" x-model="recipientName" class="w-full p-2 border border-gray-600 rounded mb-4 bg-gray-700 text-white placeholder-gray-400" placeholder="ادخل اسم المستلم">
            <label class="block text-gray-300 mb-2">رقم الهاتف</label>
            <input type="tel" x-model="recipientPhone" class="w-full p-2 border border-gray-600 rounded mb-4 bg-gray-700 text-white placeholder-gray-400" placeholder="ادخل رقم الهاتف">
            <h3 class="text-lg font-bold mb-2 text-gray-300">الوقت المتوقع للاستلام</h3>
            <div class="grid grid-cols-2 gap-4" x-data="{ selectedTime: '' }">
                <label class="flex items-center justify-center p-4 rounded-lg cursor-pointer transition-all"
                       :class="selectedTime === '10د' ? 'bg-green-500 text-white' : 'bg-gray-700 text-gray-300 hover:bg-gray-600'">
                    <input type="radio" name="time" value="10د" class="hidden" x-model="selectedTime">
                    <span class="font-semibold">10 دقائق</span>
                </label>
                <label class="flex items-center justify-center p-4 rounded-lg cursor-pointer transition-all"
                       :class="selectedTime === '15د' ? 'bg-green-500 text-white' : 'bg-gray-700 text-gray-300 hover:bg-gray-600'">
                    <input type="radio" name="time" value="15د" class="hidden" x-model="selectedTime">
                    <span class="font-semibold">15 دقيقة</span>
                </label>
                <label class="flex items-center justify-center p-4 rounded-lg cursor-pointer transition-all"
                       :class="selectedTime === '20د' ? 'bg-green-500 text-white' : 'bg-gray-700 text-gray-300 hover:bg-gray-600'">
                    <input type="radio" name="time" value="20د" class="hidden" x-model="selectedTime">
                    <span class="font-semibold">20 دقيقة</span>
                </label>
                <label class="flex items-center justify-center p-4 rounded-lg cursor-pointer transition-all"
                       :class="selectedTime === '40د' ? 'bg-green-500 text-white' : 'bg-gray-700 text-gray-300 hover:bg-gray-600'">
                    <input type="radio" name="time" value="40د" class="hidden" x-model="selectedTime">
                    <span class="font-semibold">40 دقيقة</span>
                </label>
            </div>
            <div class="flex justify-between mt-6">
                <button @click="showOrderForm = false" class="bg-red-500 text-white px-6 py-2 rounded-lg hover:bg-red-600 transition-all">إلغاء</button>
                <button @click="submitOrder()" class="bg-green-500 text-white px-6 py-2 rounded-lg hover:bg-green-600 transition-all">إرسال الطلب</button>
            </div>
        </div>
    </div>

    <div x-show="showConfirmation" class="fixed inset-0 bg-gray-900 bg-opacity-75 flex items-center justify-center">
        <div class="bg-gray-800 p-8 rounded-lg shadow-lg w-96 text-white relative">
            <!-- علامة الإغلاق (✖️) -->
            <button @click="showConfirmation = false" class="absolute top-2 right-2 text-gray-400 hover:text-red-500 transition-all">
                ✖️
            </button>
    
            <h2 class="text-2xl font-bold mb-4 text-green-500">تم تقديم الطلب بنجاح! 🎉</h2>
            <div class="space-y-4">
                <p><span class="font-bold">اسم المستلم:</span> <span x-text="recipientName" class="text-gray-300"></span></p>
                <p><span class="font-bold">رقم الهاتف:</span> <span x-text="recipientPhone" class="text-gray-300"></span></p>
                <p><span class="font-bold">رقم الفاتورة:</span> <span x-text="invoiceNumber" class="text-gray-300"></span></p>
                <p><span class="font-bold">السعر النهائي:</span> <span x-text="totalPrice + ' ريال'" class="text-green-400 font-bold"></span></p>
                <div class="mt-4">
                    <h3 class="font-bold text-lg mb-2">تفاصيل الوجبات:</h3>
                    <ul class="list-disc list-inside text-gray-300">
                        <template x-for="item in cart" :key="item.name">
                            <li x-text="item.name + ': ' + item.price + ' ريال'"></li>
                        </template>
                    </ul>
                </div>
            </div>
            <div class="mt-6">
                <button @click="redirectToGoogleMaps()" class="bg-blue-500 text-white px-6 py-2 rounded-lg hover:bg-blue-600 transition-all w-full flex items-center justify-center">
                    <span>📍</span> <span class="ml-2">الانتقال إلى الموقع</span>
                </button>
            </div>
        </div>
    </div>

    <script>
        document.addEventListener('alpine:init', () => {
            Alpine.data('order', () => ({
                section: 'meals',
                cart: [],
                showCart: false,
                showOrderForm: false,
                showConfirmation: false,
                recipientName: '',
                recipientPhone: '',
                selectedTime: '',
                invoiceNumber: '',
                totalPrice: 0,

                generateInvoiceNumber() {
                    return 'INV-' + Math.floor(Math.random() * 1000000);
                },

                submitOrder() {
                    if (this.recipientName && this.recipientPhone) {
                        // حساب السعر النهائي
                        this.totalPrice = this.cart.reduce((sum, item) => sum + item.price, 0);

                        // إنشاء رقم فاتورة عشوائي
                        this.invoiceNumber = this.generateInvoiceNumber();

                        // عرض قسم التأكيد
                        this.showConfirmation = true;

                        // إغلاق النموذج وتفريغ السلة
                        this.showOrderForm = false;
                        this.cart = [];
                    } else {
                        alert('يرجى ملء جميع الحقول المطلوبة.');
                    }
                },
                redirectToGoogleMaps() {
                    const googleMapsLink = "https://www.google.com/maps";
                    window.open(googleMapsLink, "_blank");
                }
            }));
        });
    </script>
</body>
</html>
