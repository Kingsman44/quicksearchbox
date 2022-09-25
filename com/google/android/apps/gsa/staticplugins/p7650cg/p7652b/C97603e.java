package com.google.android.apps.gsa.staticplugins.p7650cg.p7652b;

import android.content.Context;
import android.text.Html;
import android.text.TextUtils;
import androidx.core.app.C1786ac;
import androidx.core.app.C1789af;
import androidx.core.app.C1837x;
import androidx.core.app.C1839z;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7000au.p7002b.C89291a;
import com.google.android.googlequicksearchbox.R;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7746ik;
import com.google.p375ai.p378b.C7861mr;
import com.google.p375ai.p378b.C7874nd;
import com.google.p375ai.p378b.C8150xj;
import com.google.p4283bv.p4345d.p4346a.p4347a.C56954d;
import com.google.p4283bv.p4345d.p4346a.p4347a.C56956f;
import dagger.C68214a;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.cg.b.e */
/* compiled from: PG */
public final class C97603e extends C97600b {
    public C97603e(C7718hj hjVar, C7874nd ndVar, C89291a aVar, C86124t tVar, C68214a aVar2) {
        super(hjVar, ndVar, aVar, tVar, aVar2);
    }

    /* renamed from: C */
    public final CharSequence mo85871C(Context context) {
        String str;
        C7874nd ndVar = this.f272626b;
        if ((ndVar.f27589a & 128) != 0) {
            C89291a aVar = this.f272628d;
            C8150xj xjVar = ndVar.f27597i;
            if (xjVar == null) {
                xjVar = C8150xj.f28657d;
            }
            str = aVar.mo83231a(context, xjVar);
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str;
    }

    /* renamed from: D */
    public final CharSequence mo85872D(Context context) {
        String str;
        C7874nd ndVar = this.f272626b;
        if ((ndVar.f27589a & 512) != 0) {
            C89291a aVar = this.f272628d;
            C8150xj xjVar = ndVar.f27600l;
            if (xjVar == null) {
                xjVar = C8150xj.f28657d;
            }
            str = aVar.mo83231a(context, xjVar);
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        C7874nd ndVar2 = this.f272626b;
        if ((ndVar2.f27589a & 2) != 0) {
            return ndVar2.f27592d;
        }
        return null;
    }

    /* renamed from: E */
    public final CharSequence mo85873E() {
        C7874nd ndVar = this.f272626b;
        if ((ndVar.f27589a & 2) == 0 || ndVar.f27592d.isEmpty()) {
            return null;
        }
        return this.f272626b.f27592d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final int mo90756G() {
        C7746ik ikVar = C7746ik.UNKNOWN;
        C7746ik a = C7746ik.m22834a(mo90760K().f26966g);
        if (a == null) {
            a = C7746ik.UNKNOWN;
        }
        int ordinal = a.ordinal();
        if (ordinal == 2) {
            return C89885b.S3_NEXT_RESPONSE_TIMEOUT_VALUE;
        }
        if (ordinal == 4) {
            return 65548;
        }
        if (ordinal == 6) {
            return C89885b.S3_CREATE_INPUT_STREAM_FAILED_VALUE;
        }
        if (ordinal == 8) {
            return 65540;
        }
        if (ordinal == 9) {
            return 65544;
        }
        if (ordinal == 13 || ordinal == 14) {
            return C89885b.S3_UNPARSABLE_RESPONSE_HEADERS_VALUE;
        }
        int a2 = C56956f.m88243a(this.f272626b.f27591c);
        if (a2 == 0) {
            a2 = 1;
        }
        int i = a2 - 1;
        if (i == 1) {
            return C89885b.S3_CANCELLED_VALUE;
        }
        if (i != 2) {
            return 65539;
        }
        return C89885b.S3_STREAM_FAILED_VALUE;
    }

    /* renamed from: a */
    public final int mo85875a() {
        C7746ik a = C7746ik.m22834a(mo90760K().f26966g);
        if (a == null) {
            a = C7746ik.UNKNOWN;
        }
        if (a == C7746ik.REMINDER) {
            return 2;
        }
        return super.mo85875a();
    }

    /* renamed from: b */
    public final int mo85876b() {
        C7746ik ikVar = C7746ik.UNKNOWN;
        int a = C7861mr.m22880a(this.f272626b.f27602n);
        if (a == 0) {
            return R.drawable.quantum_ic_google_white_24;
        }
        switch (a) {
            case 2:
                return R.drawable.ic_stock_up;
            case 3:
                return R.drawable.ic_stock_down;
            case 4:
                return R.drawable.quantum_ic_news_white_24;
            case 5:
                return R.drawable.ic_event;
            case 6:
                return R.drawable.ic_place;
            case 7:
                return R.drawable.stat_notify_calendar;
            case 8:
            case 9:
                return R.drawable.stat_notify_reminder_time;
            case 11:
                return R.drawable.ic_bp_notification;
            case 12:
                return R.drawable.stat_notify_flight_depart;
            case 13:
                return R.drawable.stat_notify_public_alert;
            case 14:
                return R.drawable.ic_reminder;
            case 15:
                return R.drawable.ic_baseball;
            case 16:
                return R.drawable.ic_basketball;
            case 17:
                return R.drawable.ic_cricket;
            case 18:
                return R.drawable.ic_football;
            case 19:
                return R.drawable.ic_hockey;
            case 20:
                return R.drawable.ic_soccer;
            case 21:
                return R.drawable.ic_rugby;
            case 22:
                return R.drawable.stat_notify_road_closure;
            case 23:
            case 24:
            case 25:
            case 32:
                return R.drawable.stat_notify_traffic_heavy;
            case 26:
                return R.drawable.stat_notify_traffic_disruption_other_triangle;
            case 27:
                return R.drawable.stat_notify_public_transit;
            case 28:
                return R.drawable.stat_notify_bike;
            case 29:
                return R.drawable.stat_notify_walk;
            case 30:
                return R.drawable.stat_notify_traffic_light;
            case 31:
                return R.drawable.stat_notify_traffic_normal;
            case 33:
                return R.drawable.stat_notify_traffic;
            case 34:
                return R.drawable.stat_notify_weather;
            case 35:
            case 42:
                return R.drawable.quantum_ic_play_arrow_white_24;
            case 36:
                return R.drawable.quantum_ic_trending_up_white_24;
            case 37:
                return R.drawable.quantum_ic_trending_down_white_24;
            case 38:
                return R.drawable.quantum_ic_trending_flat_white_24;
            case 39:
                return R.drawable.quantum_ic_movie_white_24;
            case 40:
                return R.drawable.quantum_ic_music_note_white_24;
            case 41:
                return R.drawable.quantum_ic_local_activity_white_24;
            case 43:
                return R.drawable.ic_email;
            case 44:
                return R.drawable.quantum_ic_search_white_24;
            case 45:
                return R.drawable.ic_globe;
            case 46:
                return R.drawable.ic_local_shipping;
            case 47:
                return R.drawable.quantum_ic_payment_white_24;
            case 48:
                return R.drawable.ic_elections_ballotbox;
            case 49:
                return R.drawable.ic_elections_democratic;
            case 50:
                return R.drawable.ic_elections_republican;
            case 51:
                return R.drawable.ic_medal;
            case 54:
                return R.drawable.ic_tag;
            case 55:
                return R.drawable.quantum_ic_g_translate_white_24;
            case 56:
                return R.drawable.quantum_ic_my_location_white_24;
            case 57:
                return R.drawable.stat_my_location_bullseye;
            case 58:
                return R.drawable.quantum_ic_assignment_white_24;
            case 59:
                return R.drawable.quantum_ic_local_play_white_24;
            case 60:
                return R.drawable.quantum_ic_hotel_white_24;
            case 61:
            case 63:
                return R.drawable.quantum_ic_account_balance_white_24;
            case 62:
                return R.drawable.quantum_ic_local_mall_white_24;
            case 64:
                return R.drawable.quantum_ic_restaurant_white_24;
            case 65:
                return R.drawable.quantum_ic_store_white_24;
            case 66:
                return R.drawable.quantum_ic_shopping_cart_white_24;
            case 67:
                return R.drawable.quantum_ic_shopping_basket_white_24;
            case 68:
                return R.drawable.quantum_ic_tv_white_24;
            case 70:
                return R.drawable.ic_assistant_light;
            case 71:
                return R.drawable.quantum_ic_book_white_24;
            case 73:
                return R.drawable.stat_notify_word_coach;
            case 74:
                return R.drawable.quantum_ic_sports_tennis_white_24;
            case 75:
                return R.drawable.quantum_ic_music_video_white_24;
            case 76:
                return R.drawable.ic_australian_football;
            case 77:
                return R.drawable.quantum_ic_finance_white_24;
            case 78:
                return R.drawable.ic_travel_planning;
            case 79:
                return R.drawable.quantum_ic_sports_esports_white_24;
            case 80:
                return R.drawable.quantum_ic_sports_golf_white_24;
            default:
                return R.drawable.quantum_ic_google_white_24;
        }
    }

    /* renamed from: h */
    public final C1789af mo85882h(Context context) {
        ArrayList<String> arrayList;
        String str;
        String str2;
        C1786ac acVar = null;
        if (this.f272626b.f27598j.size() > 0) {
            arrayList = new ArrayList<>();
            for (C8150xj a : this.f272626b.f27598j) {
                String a2 = this.f272628d.mo83231a(context, a);
                if (!TextUtils.isEmpty(a2)) {
                    arrayList.add(a2);
                }
            }
        } else {
            arrayList = null;
        }
        C7874nd ndVar = this.f272626b;
        if ((ndVar.f27589a & 256) != 0) {
            C89291a aVar = this.f272628d;
            C8150xj xjVar = ndVar.f27599k;
            if (xjVar == null) {
                xjVar = C8150xj.f28657d;
            }
            str = aVar.mo83231a(context, xjVar);
        } else {
            str = null;
        }
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        C7874nd ndVar2 = this.f272626b;
        if ((ndVar2.f27589a & 1024) != 0) {
            C89291a aVar2 = this.f272628d;
            C8150xj xjVar2 = ndVar2.f27601m;
            if (xjVar2 == null) {
                xjVar2 = C8150xj.f28657d;
            }
            str2 = aVar2.mo83231a(context, xjVar2);
        } else {
            str2 = null;
        }
        if (true == TextUtils.isEmpty(str2)) {
            str2 = null;
        }
        if (str != null) {
            C1837x xVar = new C1837x();
            xVar.f5669a = C1839z.m5037c(Html.fromHtml(str));
            if (str2 != null) {
                xVar.f5581g = C1839z.m5037c(Html.fromHtml(str2));
                xVar.f5582h = true;
            }
            return xVar;
        }
        if (arrayList != null) {
            acVar = new C1786ac();
            for (String fromHtml : arrayList) {
                acVar.mo4992g(Html.fromHtml(fromHtml));
            }
            if (str2 != null) {
                acVar.f5581g = C1839z.m5037c(Html.fromHtml(str2));
                acVar.f5582h = true;
            }
        }
        return acVar;
    }

    /* renamed from: n */
    public final String mo85888n() {
        C7746ik a = C7746ik.m22834a(mo90760K().f26966g);
        if (a == null) {
            a = C7746ik.UNKNOWN;
        }
        if (a == C7746ik.REMINDER) {
            return "reminder";
        }
        return null;
    }

    /* renamed from: p */
    public final String mo85890p() {
        C7874nd ndVar = this.f272626b;
        if ((ndVar.f27589a & 16384) == 0) {
            return null;
        }
        C56954d dVar = ndVar.f27603o;
        if (dVar == null) {
            dVar = C56954d.f152000c;
        }
        return dVar.f152002a == 1 ? (String) dVar.f152003b : BuildConfig.FLAVOR;
    }

    /* renamed from: v */
    public final boolean mo85896v() {
        C7746ik a = C7746ik.m22834a(mo90760K().f26966g);
        if (a == null) {
            a = C7746ik.UNKNOWN;
        }
        return a != C7746ik.REMINDER;
    }
}
