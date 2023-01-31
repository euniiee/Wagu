<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
  <head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>WAGU - 마이페이지</title>
    <link rel="apple-touch-icon" sizes="57x57"  href="../images/favicon.png"/>
    <link rel="shortcut icon" sizes="72x72" href="../images/favicon.png" type="image/x-icon">
    <link rel="stylesheet" href="../fonts/SUIT/SUIT.css">
    <link rel="stylesheet" href="../css/reset.css">
    <link rel="stylesheet" href="../css/common.css">
    <link rel="stylesheet" href="../css/mypage.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/swiper/swiper-bundle.min.css">
    <script src="https://cdn.jsdelivr.net/npm/swiper/swiper-bundle.min.js"></script>
    <script src="https://kit.fontawesome.com/df844253b1.js" crossorigin="anonymous"></script>
    <script src="../js/jquery-3.6.3.min.js"></script>
    <script src="../js/common.js" defer></script>
    <script src="../js/mypage.js"></script>
    <style>
      @media screen and (max-width: 768px) {
        .header_user_info > i {
          display: none;
        }
      }
    </style>
  </head>
  <body>
    <div class="wrap">
      <header class="header sub">
        <jsp:include page="top.jsp"></jsp:include>
      </header>
      <main class="main sub">
        <h2 class="mypage_tit">내 정보</h2>
        <section class="mypage_left">
          <jsp:include page="mypageLeft.jsp"></jsp:include>
        </section>
        <section class="mypage_content hotel">
          <h3 class="mypage_content_tit">열차 승차권</h3>
          <article class="mypage_content_korail">
            <ul class="mypage_content_korail_list">
              <li>
                <a href="mypageKorailDetail.jsp" class="link">
                  <div class="mypage_content_korail_reservation">
                    <p class="korail_reservation_status status_cancel">취소완료</p>
                    <p class="korail_reservation_number">예약번호 <span>20220926138142</span></p>
                  </div>
                  <div class="mypage_content_korail_info">
                    <div class="info_train train">
                      <div class="info_train_station">
                        <p class="station">용산</p>
                        <p class="time">05:10</p>
                      </div>
                      <i class="fa-solid fa-arrow-right"></i>
                      <div class="info_train_station">
                        <p class="station">광명</p>
                        <p class="time">05:24</p>
                      </div>
                    </div>
                    <div class="info_train">
                      <p class="tit">열차</p>
                      <p class="txt">KTX</p>
                    </div>
                    <div class="info_train">
                      <p class="tit">출발일</p>
                      <p class="txt">2022년 12월 11일 (일)</p>
                    </div>
                    <div class="info_train">
                      <p class="tit">인원</p>
                      <p class="txt">성인1</p>
                    </div>
                    <div class="info_train">
                      <p class="tit">좌석</p>
                      <p class="txt">15호차 2B</p>
                    </div>
                  </div>
                </a>
              </li>
              <li>
                <a href="mypageKorailDetail.html" class="link">
                  <div class="mypage_content_korail_reservation">
                    <p class="korail_reservation_status status_available">탑승예정</p>
                    <p class="korail_reservation_number">예약번호 <span>20220926138142</span></p>
                  </div>
                  <div class="mypage_content_korail_info">
                    <div class="info_train train">
                      <div class="info_train_station">
                        <p class="station">용산</p>
                        <p class="time">05:10</p>
                      </div>
                      <i class="fa-solid fa-arrow-right"></i>
                      <div class="info_train_station">
                        <p class="station">광명</p>
                        <p class="time">05:24</p>
                      </div>
                    </div>
                    <div class="info_train">
                      <p class="tit">열차</p>
                      <p class="txt">KTX</p>
                    </div>
                    <div class="info_train">
                      <p class="tit">출발일</p>
                      <p class="txt">2022년 12월 11일 (일)</p>
                    </div>
                    <div class="info_train">
                      <p class="tit">인원</p>
                      <p class="txt">성인1</p>
                    </div>
                    <div class="info_train">
                      <p class="tit">좌석</p>
                      <p class="txt">15호차 2B</p>
                    </div>
                  </div>
                </a>
              </li>
              <li>
                <a href="mypageKorailDetail.html" class="link">
                  <div class="mypage_content_korail_reservation">
                    <p class="korail_reservation_status status_complete">탑승완료</p>
                    <p class="korail_reservation_number">예약번호 <span>20220926138142</span></p>
                  </div>
                  <div class="mypage_content_korail_info">
                    <div class="info_train train">
                      <div class="info_train_station">
                        <p class="station">용산</p>
                        <p class="time">05:10</p>
                      </div>
                      <i class="fa-solid fa-arrow-right"></i>
                      <div class="info_train_station">
                        <p class="station">광명</p>
                        <p class="time">05:24</p>
                      </div>
                    </div>
                    <div class="info_train">
                      <p class="tit">열차</p>
                      <p class="txt">KTX</p>
                    </div>
                    <div class="info_train">
                      <p class="tit">출발일</p>
                      <p class="txt">2022년 12월 11일 (일)</p>
                    </div>
                    <div class="info_train">
                      <p class="tit">인원</p>
                      <p class="txt">성인1</p>
                    </div>
                    <div class="info_train">
                      <p class="tit">좌석</p>
                      <p class="txt">15호차 2B</p>
                    </div>
                  </div>
                </a>
              </li>
              <li>
                <a href="mypageKorailDetail.html" class="link">
                  <div class="mypage_content_korail_reservation">
                    <p class="korail_reservation_status status_cancel">취소완료</p>
                    <p class="korail_reservation_number">예약번호 <span>20220926138142</span></p>
                  </div>
                  <div class="mypage_content_korail_info">
                    <div class="info_train train">
                      <div class="info_train_station">
                        <p class="station">용산</p>
                        <p class="time">05:10</p>
                      </div>
                      <i class="fa-solid fa-arrow-right"></i>
                      <div class="info_train_station">
                        <p class="station">광명</p>
                        <p class="time">05:24</p>
                      </div>
                    </div>
                    <div class="info_train">
                      <p class="tit">열차</p>
                      <p class="txt">KTX</p>
                    </div>
                    <div class="info_train">
                      <p class="tit">출발일</p>
                      <p class="txt">2022년 12월 11일 (일)</p>
                    </div>
                    <div class="info_train">
                      <p class="tit">인원</p>
                      <p class="txt">성인1</p>
                    </div>
                    <div class="info_train">
                      <p class="tit">좌석</p>
                      <p class="txt">15호차 2B</p>
                    </div>
                  </div>
                </a>
              </li>
            </ul>
            <div class="mypage_content_activity_none">
              <img src="../images/myPage/reservation_noimg.svg" alt="" class="none_img">
              <p class="none_tit">탑승 예정인 열차 승차권이 없습니다</p>
              <p class="none_txt">와그와 여행을 떠나보세요!</p>
              <a href="#n" class="link">열차 승차권 예매하기</a>
            </div>
          </article>
        </section>
      </main>
      <footer class="footer">
        <jsp:include page="bottom.jsp"></jsp:include>
      </footer>
    </div>
  </body>
</html>
