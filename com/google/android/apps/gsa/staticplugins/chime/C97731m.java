package com.google.android.apps.gsa.staticplugins.chime;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import androidx.core.app.C1839z;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90081ef;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.sidekick.main.notifications.p7220a.p7221a.C91485a;
import com.google.android.apps.gsa.sidekick.shared.util.C91992k;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.notifications.data.C29789c;
import com.google.android.libraries.notifications.data.C29820k;
import com.google.android.libraries.notifications.data.C29824o;
import com.google.android.libraries.notifications.data.C29827r;
import com.google.android.libraries.notifications.p2293h.C30013f;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p375ai.p378b.C7539b;
import com.google.p375ai.p378b.C7856mm;
import com.google.p375ai.p378b.C7857mn;
import com.google.p375ai.p378b.C7861mr;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55530aj;
import com.google.p4283bv.p4345d.p4350b.p4351a.C56968d;
import com.google.p4283bv.p4345d.p4350b.p4351a.C56984t;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p3186j$.util.DesugarArrays;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.chime.m */
/* compiled from: PG */
public final class C97731m implements C30013f {

    /* renamed from: a */
    private static final C59071e f272881a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.chime.m");

    /* renamed from: b */
    private final C90021c f272882b;

    /* renamed from: c */
    private final C97741w f272883c;

    public C97731m(C90021c cVar, C97741w wVar) {
        this.f272882b = cVar;
        this.f272883c = wVar;
    }

    /* renamed from: d */
    private static int m161985d(int i) {
        switch (i) {
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
                return R.drawable.ic_white_googleg;
        }
    }

    /* renamed from: a */
    public final void mo35331a(C29820k kVar, C29827r rVar, C1839z zVar) {
        int i;
        List list;
        C7856mm mmVar;
        C58833ax a = C97735q.m162004a(rVar);
        if (a.mo56113h()) {
            C56968d dVar = (C56968d) a.mo56107c();
            if ((dVar.f152038a & 64) != 0) {
                int a2 = C7861mr.m22880a(dVar.f152045h);
                if (a2 == 0) {
                    a2 = 1;
                }
                zVar.f5679J.icon = m161985d(a2);
            }
            if (this.f272882b.mo79746e(C90081ef.f249840i)) {
                C97741w wVar = this.f272883c;
                if ((dVar.f152038a & 64) == 0 || (i = C7861mr.m22880a(dVar.f152045h)) == 0) {
                    i = 1;
                }
                int d = m161985d(i);
                C58833ax a3 = C97735q.m162004a(rVar);
                if (a3.mo56113h()) {
                    C56968d dVar2 = (C56968d) a3.mo56107c();
                    if (rVar.mo35052a().f146663d.size() == 0) {
                        return;
                    }
                    if (C97658aa.m161901a(zVar.mo5013a()) != null || zVar.mo5013a().actions == null || wVar.f272910b.mo79746e(C90081ef.f249842k)) {
                        C91485a aVar = wVar.f272911c;
                        C7857mn mnVar = dVar2.f152049l;
                        if (mnVar == null) {
                            mnVar = C7857mn.f27537c;
                        }
                        if (aVar.mo85829b(mnVar, ((C55530aj) rVar.mo35052a().f146663d.get(0)).f146538a)) {
                            try {
                                Bitmap a4 = C97658aa.m161901a(zVar.mo5013a());
                                if (a4 == null) {
                                    if ((dVar2.f152038a & 256) != 0) {
                                        byte[] N = dVar2.f152047j.mo59174N();
                                        a4 = BitmapFactory.decodeByteArray(N, 0, N.length);
                                        if (a4 == null) {
                                            throw new IllegalArgumentException("Could not extract bitmap from payload.");
                                        }
                                    } else {
                                        a4 = null;
                                    }
                                }
                                Bitmap bitmap = a4;
                                if (bitmap == null) {
                                    C97744z zVar2 = wVar.f272912d;
                                    C91189au auVar = zVar2.f272921d;
                                    C7857mn mnVar2 = dVar2.f152049l;
                                    if (mnVar2 == null) {
                                        mnVar2 = C7857mn.f27537c;
                                    }
                                    if (mnVar2.f27539a == 1) {
                                        mmVar = (C7856mm) mnVar2.f27540b;
                                    } else {
                                        mmVar = C7856mm.f27533b;
                                    }
                                    new C90873ag(auVar.mo85425m(Uri.parse(mmVar.f27535a), C58836b.f156633a, 61), zVar2.f272919b, "Image downloading for chime notification completed", new C97742x(zVar2, dVar2, kVar, rVar)).mo85223a(C97743y.f272917a);
                                    return;
                                }
                                C91485a aVar2 = wVar.f272911c;
                                long millis = TimeUnit.MICROSECONDS.toMillis(rVar.mo35052a().f146665f);
                                String str = rVar.mo35052a().f146661b;
                                String str2 = rVar.mo35052a().f146662c;
                                if (zVar.mo5013a().actions == null) {
                                    list = C58485gu.m89845m();
                                } else {
                                    list = (List) DesugarArrays.stream((T[]) zVar.mo5013a().actions).map(C97740v.f272908a).collect(Collectors.toList());
                                }
                                aVar2.mo85828a(zVar, d, millis, bitmap, str, str2, list);
                            } catch (IllegalArgumentException e) {
                                C59104x d2 = C97741w.f272909a.mo56226d();
                                d2.mo56378ag(C58975e.f156826a, "ChimeCustomNotifsHelper");
                                ((C59052c) ((C59052c) d2).mo56372aa(18963)).mo56389s("%s", e.getMessage());
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final List mo35332b(C29827r rVar, List list) {
        C58833ax a = C97735q.m162004a(rVar);
        if (!a.mo56113h() || !((C56968d) a.mo56107c()).f152053p) {
            C58480gp e = C58485gu.m89837e();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C29824o oVar = (C29824o) it.next();
                C56984t c = C97735q.m162006c(oVar);
                int i = c.f152116a;
                if ((i & 1) != 0) {
                    if ((i & 2) != 0) {
                        C29789c j = oVar.mo35031j();
                        int a2 = C7539b.m22781a(c.f152119e);
                        if (a2 == 0) {
                            a2 = 1;
                        }
                        j.mo35016b(C91992k.m150980h(a2));
                        oVar = j.mo35015a();
                    }
                    e.mo55395g(oVar);
                }
            }
            return e.mo55394f();
        }
        C59104x d = f272881a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "ChimeNotifCustomizer");
        ((C59052c) ((C59052c) d).mo56372aa(18955)).mo56386p("All notification actions are being removed due to should_remove_inline_actions");
        return C58485gu.m89845m();
    }

    /* renamed from: c */
    public final void mo35333c(List list, C1839z zVar) {
        C58724pq pqVar = (C58724pq) list;
        int i = 1;
        if (pqVar.f156474d > 1) {
            zVar.f5687g = null;
        }
        if (this.f272882b.mo79746e(C90081ef.f249836e) && pqVar.f156474d > 0) {
            C58833ax a = C97735q.m162004a((C29827r) C58557jl.m90131l(list));
            if (a.mo56113h() && (((C56968d) a.mo56107c()).f152038a & 64) != 0) {
                int a2 = C7861mr.m22880a(((C56968d) a.mo56107c()).f152045h);
                if (a2 != 0) {
                    i = a2;
                }
                zVar.f5679J.icon = m161985d(i);
            }
        }
    }
}
