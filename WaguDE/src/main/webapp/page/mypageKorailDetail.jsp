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
        <section class="mypage_content korail">
          <h3 class="mypage_detail_tit">예약 상세</h3>
          <article class="mypage_detail_sec">
            <p class="mypage_detail_sec_tit">예약 정보</p>
            <ul class="mypage_detail_sec_list">
              <li>
                <p class="tit">예약번호</p>
                <p class="txt">20220926138142</p>
              </li>
              <li>
                <p class="tit">진행상태</p>
                <p class="txt">취소완료</p>
              </li>
              <li>
                <p class="tit">가는편</p>
                <p class="txt">용산 05:10 - 광명 05:24 (14분), KTX-산천 401열차</p>
              </li>
              <li>
                <p class="tit">출발일</p>
                <p class="txt">2022년 09월 28일 (수)</p>
              </li>
              <li>
                <p class="tit">인원</p>
                <p class="txt">성인 1</p>
              </li>
              <li>
                <p class="tit">좌석</p>
                <p class="txt">15호차2B</p>
              </li>
            </ul>
          </article>
          <article class="mypage_detail_sec">
            <p class="mypage_detail_sec_tit">예약자 정보</p>
            <ul class="mypage_detail_sec_list">
              <li>
                <p class="tit">예약자명</p>
                <p class="txt">오다현</p>
              </li>
              <li>
                <p class="tit">휴대전화번호</p>
                <p class="txt">01044716388</p>
              </li>
              <li>
                <p class="tit">이메일</p>
                <p class="txt">odh550@naver.com</p>
              </li>
            </ul>
          </article>
          <article class="mypage_detail_sec">
            <p class="mypage_detail_sec_tit">대표 탑승객 정보</p>
            <ul class="mypage_detail_sec_list">
              <li>
                <p class="tit">예약자명</p>
                <p class="txt">오다현</p>
              </li>
              <li>
                <p class="tit">생년월일</p>
                <p class="txt">1991-01-29</p>
              </li>
              <li>
                <p class="tit">휴대전화번호</p>
                <p class="txt">01044716388</p>
              </li>
              <li>
                <p class="tit">이메일</p>
                <p class="txt">odh550@naver.com</p>
              </li>
            </ul>
          </article>
          <article class="mypage_detail_sec">
            <p class="mypage_detail_sec_tit">와그 서포트</p>
            <ul class="mypage_detail_sec_list">
              <li>
                <p class="tit">전화 문의</p>
                <p class="txt"><a href="tel:070-1234-1234">(+82) 070-1234-1234</a></p>
              </li>
              <li>
                <p class="tit">메일 문의</p>
                <p class="txt">customer@wagu.team</p>
              </li>
              <li>
                <p class="tit">운영 시간</p>
                <p class="txt">
                  유선상담 : 평일 ㅣ AM 10 : 00 - PM 06: 00 (GMT+9) 주말 및 공휴일 ㅣ AM 10 : 00 - PM 05: 00 (GMT+9)
                </p>
              </li>
            </ul>
          </article>
          <article class="mypage_detail_sec">
            <p class="mypage_detail_sec_tit">예약 취소 안내</p>
            <p class="mypage_detail_sec_txt">
              • 예약하신 열차 승차권의 경우 결제 완료 후 구매내역 페이지를 통해 직접 취소(승차권 전체 또는 부분 취소) 요청 할 수 있습니다.<br>
              <br>
              • 취소/환불 규칙은 예매하신 승차권의 출발일로부터 일 단위 기준으로 적용됩니다.<br>
              • 취소 수수료는 승차권별 예매 금액을 기준으로 계산됩니다.<br>
              <br>
              • 열차 출발일 3일전 취소 시 전액 환불<br>
              • 열차 출발일 2일전 취소 시 10% 수수료 부과<br>
              • 열차 출발일 1일전 취소 시 20% 수수료 부과<br>
              • 열차 출발 당일, 열차 탑승 1시간 전까지 취소 시 30% 수수 료 부과<br>
              <br>
              ※ 당일 열차 출발 1시간 전부터는 취소/환불 불가<br>
              당일 열차 출발 시각까지 미도착 혹은 부재중 시 취소/환불 불가<br>
              단, 결제 후 10분 이내 취소 시 취소 수수료는 없습니다.<br>
              <br>
              ※ 복합구매 방식으로 함께 구매된 액티비티 상품의 경우 단순 변심에 의한 취소/환불은 개개의 상품 별도로 처리되니 액티비티 상품과 관련된 취소/환불 문의는 와그 고객 센터로 주시기 바랍니다.<br>
              <br>
              ※ 액티비티 상품 취소 진행 시 이미 사용된 승차권인 경우를 제외하고는 함께 구매한 열차 승차권도 일괄 취소 처리됩니다.<br>
              <br>
              • 복합구매 진행 시 복수의 액티비티 상품을 구매하였을 경우에는 액티비티 상품의 부분 취소는 가능합니다.
            </p>
          </article>
          <p class="mypage_detail_sec_confirm">취소 완료</p>
        </section>
      </main>
      <footer class="footer">
        <jsp:include page="bottom.jsp"></jsp:include>
      </footer>
    </div>
  </body>
</html>
