
4. Add a footer section before closing body:

```diff
<<<<<<< SEARCH
    <script src="/js/app.js"></script>
</body>
=======
    <script src="/js/app.js"></script>
    <footer class="py-8 border-t mt-12">
        <div class="container mx-auto px-6 max-w-7xl">
            <div class="flex flex-col md:flex-row justify-between">
                <div class="mb-6 md:mb-0">
                    <span class="text-2xl font-bold text-primary flex items-center">
                        <i class="fas fa-graduation-cap mr-3"></i>LearnHub
                    </span>
                    <p class="mt-2 text-gray-600 max-w-md">Your gateway to world-class learning experiences</p>
                </div>
                <div class="grid grid-cols-2 gap-8 sm:grid-cols-3">
                    <div>
                        <h3 class="font-semibold mb-4">Company</h3>
                        <ul class="space-y-2">
                            <li><a href="#" class="text-gray-600 hover:text-primary">About</a></li>
                            <li><a href="#" class="text-gray-600 hover:text-primary">Careers</a></li>
                            <li><a href="#" class="text-gray-600 hover:text-primary">Blog</a></li>
                        </ul>
                    </div>
                    <div>
                        <h3 class="font-semibold mb-4">Resources</h3>
                        <ul class="space-y-2">
                            <li><a href="#" class="text-gray-600 hover:text-primary">Help Center</a></li>
                            <li><a href="#" class="text-gray-600 hover:text-primary">Tutorials</a></li>
                            <li><a href="#" class="text-gray-600 hover:text-primary">FAQ</a></li>
                        </ul>
                    </div>
                    <div>
                        <h3 class="font-semibold mb-4">Legal</h3>
                        <ul class="space-y-2">
                            <li><a href="#" class="text-gray-600 hover:text-primary">Privacy</a></li>
                            <li><a href="#" class="text-gray-600 hover:text-primary">Terms</a></li>
                            <li><a href="#" class="text-gray-600 hover:text-primary">Cookie Policy</a></li>
                        </ul>
                    </div>
                </div>
            </div>
            <div class="border-t mt-8 pt-8 flex flex-col md:flex-row justify-between items-center">
                <p class="text-gray-500">© 2023 LearnHub. All rights reserved.</p>
                <div class="flex space-x-6 mt-4 md:mt-0">
                    <a href="#" class="text-gray-500 hover:text-primary"><i class="fab fa-twitter"></i></a>
                    <a href="#" class="text-gray-500 hover:text-primary"><i class="fab fa-facebook"></i></a>
                    <a href="#" class="text-gray-500 hover:text-primary"><i class="fab fa-instagram"></i></a>
                    <a href="#" class="text-gray-500 hover:text-primary"><i class="fab fa-linkedin"></i></a>
                </div>
            </div>
        </div>
    </footer>
</body>
>>>>>>> REPLACE