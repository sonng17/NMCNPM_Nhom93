# 1 số tool, phần mềm cần thiết để cài đặt và sử dụng chương trình
-	IDE: NetBeans
-	MySQLWorkBench
-	Git
# Hướng dẫn cài đặt
-	Bước 1: Mở 1 folder bất kỳ trong máy, click chuột phải và chọn Git bash here, sau đó gõ dòng lệnh trong dấu nháy kép sau đây vào màn hình console:
“git clone https://github.com/sonng17/NMCNPM_Nhom93.git”
 
-	Bước 2: Mở project
File -> Open Project -> Mở project vừa clone về, mở ra và chọn cốc cà phê -> Open Project
 
-	Bước 3: Vào QuanLyNhanKhau/src/services/MysqlConnection sửa username và password thành username và password trong mysql của mình
 
-	Bước 4: Mở MySQL Workbench, chọn File -> Open SQL Script -> Mở folder chứa project lên và chọn file quan_ly_nhan_khau.sql -> Open
-> Sau khi mở ấn nút ⚡ Execute để tạo csdl cho phần mềm
 
-	Bước 5: Để kết nối csdl MySQL, cần có 1 drive Mysql Connector phù hợp với phiên bản trong máy, Project đã hỗ trợ Mysql Connector phiên bản 8.0.21 và 8.0.22 (Xem phiên bản bằng cách chọn Help -> About Workbench)
  ->	Nếu phiên bản khác cần tải drive phù hợp dưới link sau
      https://downloads.mysql.com/archives/c-j/
  ->	Mục Product version chọn phiên bản giống như trong máy của mình, còn mục Operating System chọn “Platform Independent”.
  ->	Sau đó click vào nút download file zip để tải về rồi giải nén ra.
  ->	Vào Netbeans, click chuột phải vào Libraries -> Add JAR/Folder… Tìm đến folder vừa giải nén, chọn file.jar và ấn open
-	Bước 6: Chạy project bằng IDE, với tài khoản = admin, mật khẩu = 1.
