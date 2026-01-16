Java Console Employee Management App
Java Console Application yazılacaq. Bu tətbiq real database istifadə etmədən, List strukturu üzərindən işləyəcək və işçi məlumatlarını in-memory database kimi saxlayacaq. OOP prinsipləri tətbiq olunmalıdır. Enum istifadə olunmalıdır. Kod oxunaqlı və strukturlaşdırılmış olmalıdır.
Console menyu vasitəsilə aşağıdakı əməliyyatlar yerinə yetirilməlidir:
✅ 1. Yeni işçi əlavə et
• Ad
• Soyad
• Vəzifə (enum-dan seçilməlidir)
• Maaş
⸻
📋 2. Bütün işçiləri göstər
• ID
• Ad Soyad
• Vəzifə
• Maaş
⸻
❌ 3. İşçi sil
• ID üzrə silinməlidir
• Əgər ID tapılmazsa xəbərdarlıq verilməlidir
⸻
💰 4. Maaş dəyiş
• ID üzrə
• Yeni maaş təyin et
⸻
⬆️ 5. Vəzifə artımı (Promotion)
• Məsələn:
• INTERN → JUNIOR
• JUNIOR → MIDDLE
• və s.
• Əgər artıq ən yüksək vəzifədədirsə, xəbərdarlıq göstərilməlidir
⸻
🔍 6. ID ilə işçi axtar
• Tapılarsa məlumatlarını göstər
• Tapılmazsa mesaj ver
⸻
🚪 0. Çıxış
• Proqramı düzgün şəkildə bağlasın
⸻
📌 Əlavə
• Maaş mənfi ola bilməz (validation)
• Eyni ID-li işçi olmamalıdır
• Scanner input-larında səhv daxilolmalar handle edilməlidir
• Service layer (EmployeeService) istifadə oluna bilər
