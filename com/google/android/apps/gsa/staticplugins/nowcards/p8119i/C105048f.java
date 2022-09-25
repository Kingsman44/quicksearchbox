package com.google.android.apps.gsa.staticplugins.nowcards.p8119i;

import android.content.Context;
import com.google.android.apps.gsa.sidekick.shared.util.C91992k;
import com.google.android.apps.p489g.p494d.C9137a;
import com.google.android.apps.p489g.p494d.C9164b;
import com.google.android.apps.p489g.p494d.C9246ea;
import com.google.android.apps.p489g.p494d.C9247eb;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p375ai.p378b.C7539b;
import com.google.p375ai.p378b.C7810ku;
import com.google.p375ai.p378b.C7811kv;
import com.google.p375ai.p378b.C7817la;
import com.google.p375ai.p378b.C7837lu;
import com.google.p375ai.p378b.C7838lv;
import com.google.p375ai.p378b.C7840lx;
import com.google.p375ai.p378b.C8152xl;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.i.f */
/* compiled from: PG */
public final class C105048f {

    /* renamed from: a */
    static final C58495hd f292754a;

    /* renamed from: b */
    static final C58495hd f292755b = C58495hd.m89900n(C7817la.LOTIC_SMALL_TITLE, C7817la.LOTIC_SMALL_ARTICLE_TITLE);

    /* renamed from: c */
    static final C58495hd f292756c = C58495hd.m89900n(C7817la.LOTIC_SMALL_TITLE, C7817la.LOTIC_SMALL_CAROUSEL_TITLE);

    /* renamed from: d */
    private static final C59071e f292757d = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.nowcards.i.f");

    static {
        C7817la laVar = C7817la.LOTIC_SMALL_TITLE;
        C7817la laVar2 = C7817la.LOTIC_SMALL_LIST_ITEM_TITLE;
        f292754a = C58495hd.m89901o(laVar, laVar2, C7817la.LOTIC_EXTRA_INFO, laVar2);
    }

    /* renamed from: b */
    public static C7810ku m174269b(C7811kv kvVar) {
        C7810ku a = C7810ku.m22854a(kvVar.f27310d);
        if (a == null) {
            a = C7810ku.STRING;
        }
        if (a != C7810ku.STRING) {
            return a;
        }
        int i = kvVar.f27308b;
        if (i == 1) {
            return C7810ku.STRING;
        }
        if (i == 2) {
            return C7810ku.STATUS_BADGE;
        }
        if (i == 3) {
            return C7810ku.RATING;
        }
        if (i == 9) {
            return C7810ku.RATING;
        }
        if (i == 4) {
            return C7810ku.DISTANCE;
        }
        if (i == 7) {
            return C7810ku.ICON;
        }
        if (i == 5) {
            return C7810ku.ICON;
        }
        ((C59052c) ((C59052c) f292757d.mo56225c()).mo56372aa(22091)).mo56386p("Uncertain of the Chunk type, no data found");
        return a;
    }

    /* renamed from: c */
    public static int m174270c(int i) {
        switch (i - 1) {
            case 0:
                return R.drawable.ip_generic;
            case 1:
                return R.drawable.ip_bills;
            case 2:
                return R.drawable.ip_commute;
            case 3:
                return R.drawable.ip_day;
            case 4:
                return R.drawable.ip_finance;
            case 5:
                return R.drawable.ip_food;
            case 6:
                return R.drawable.ip_movies;
            case 7:
                return R.drawable.ip_music;
            case 8:
                return R.drawable.ip_people;
            case 9:
                return R.drawable.ip_sports;
            case 10:
                return R.drawable.ip_travel;
            case 11:
                return R.drawable.ip_update;
            case 12:
                return R.drawable.training_profile;
            case 13:
                return R.drawable.quantum_ic_event_white_48;
            case 14:
                return R.drawable.quantum_ic_local_attraction_white_48;
            case 15:
                return R.drawable.quantum_ic_local_gas_station_white_48;
            case 16:
                return R.drawable.quantum_ic_local_movies_white_48;
            case 17:
                return R.drawable.quantum_ic_news_white_48;
            case 18:
                return R.drawable.quantum_ic_place_white_48;
            case 19:
                return R.drawable.quantum_ic_local_restaurant_white_48;
            case 20:
                return R.drawable.quantum_ic_tv_white_48;
            case 21:
                return R.drawable.sign_in_lure_icon;
            case 22:
                return R.drawable.hq_agenda;
            case 23:
                return R.drawable.hq_order;
            case 24:
                return R.drawable.hq_shoppinglist;
            case 25:
                return R.drawable.hq_reminders;
            case 26:
                return R.drawable.hq_transportation;
            case 27:
                return R.drawable.hq_shortcut;
            case 28:
                return R.drawable.hq_agenda_v1p5;
            case 29:
                return R.drawable.hq_order_v1p5;
            case 30:
                return R.drawable.hq_shoppinglist_v1p5;
            case 31:
                return R.drawable.hq_reminders_v1p5;
            default:
                return R.drawable.hq_shortcut_v1p5;
        }
    }

    /* renamed from: d */
    public static Map m174271d(int i) {
        int i2 = i - 1;
        if (i2 == 1) {
            return f292754a;
        }
        if (i2 == 2) {
            return f292755b;
        }
        if (i2 != 3) {
            return null;
        }
        return f292756c;
    }

    /* renamed from: e */
    static final int m174272e(Context context, int i, int i2) {
        return i2 != 0 ? i2 : C91992k.m150981i(context, i);
    }

    /* renamed from: a */
    public final C9164b mo94488a(Context context, C7838lv lvVar) {
        C8152xl xlVar;
        C8152xl xlVar2;
        C8152xl xlVar3;
        C8152xl xlVar4;
        C8152xl xlVar5;
        C8152xl xlVar6;
        C9137a aVar = (C9137a) C9164b.f31642o.createBuilder();
        if (lvVar.f27477b == 2) {
            String str = (String) lvVar.f27478c;
            aVar.copyOnWrite();
            C9164b bVar = (C9164b) aVar.instance;
            str.getClass();
            bVar.f31644a |= 4;
            bVar.f31647d = str;
        }
        int i = 1;
        if (lvVar.f27477b == 1) {
            int a = C7539b.m22781a(((Integer) lvVar.f27478c).intValue());
            if (a == 0) {
                a = 1;
            }
            int h = C91992k.m150980h(a);
            aVar.copyOnWrite();
            C9164b bVar2 = (C9164b) aVar.instance;
            bVar2.f31644a |= 1;
            bVar2.f31645b = h;
        }
        boolean z = false;
        if (lvVar.f27477b == 10) {
            C9246ea eaVar = (C9246ea) C9247eb.f31972f.createBuilder();
            if (lvVar.f27477b == 10) {
                xlVar4 = (C8152xl) lvVar.f27478c;
            } else {
                xlVar4 = C8152xl.f28662d;
            }
            String str2 = xlVar4.f28664a;
            eaVar.copyOnWrite();
            C9247eb ebVar = (C9247eb) eaVar.instance;
            str2.getClass();
            ebVar.f31974a |= 1;
            ebVar.f31975b = str2;
            if (lvVar.f27477b == 10) {
                xlVar5 = (C8152xl) lvVar.f27478c;
            } else {
                xlVar5 = C8152xl.f28662d;
            }
            int i2 = xlVar5.f28665b;
            eaVar.copyOnWrite();
            C9247eb ebVar2 = (C9247eb) eaVar.instance;
            ebVar2.f31974a |= 2;
            ebVar2.f31976c = i2;
            if (lvVar.f27477b == 10) {
                xlVar6 = (C8152xl) lvVar.f27478c;
            } else {
                xlVar6 = C8152xl.f28662d;
            }
            int i3 = xlVar6.f28666c;
            eaVar.copyOnWrite();
            C9247eb ebVar3 = (C9247eb) eaVar.instance;
            ebVar3.f31974a |= 8;
            ebVar3.f31978e = i3;
            int a2 = C7837lu.m22864a(lvVar.f27481f);
            boolean z2 = a2 == 0 || a2 != 2;
            eaVar.copyOnWrite();
            C9247eb ebVar4 = (C9247eb) eaVar.instance;
            ebVar4.f31974a |= 4;
            ebVar4.f31977d = z2;
            C9247eb ebVar5 = (C9247eb) eaVar.build();
            aVar.copyOnWrite();
            C9164b bVar3 = (C9164b) aVar.instance;
            ebVar5.getClass();
            bVar3.f31655l = ebVar5;
            bVar3.f31644a |= 2048;
        }
        if (lvVar.f27479d == 15) {
            String str3 = (String) lvVar.f27480e;
            aVar.copyOnWrite();
            C9164b bVar4 = (C9164b) aVar.instance;
            str3.getClass();
            bVar4.f31644a |= 8;
            bVar4.f31648e = str3;
        }
        if (lvVar.f27479d == 14) {
            int a3 = C7539b.m22781a(((Integer) lvVar.f27480e).intValue());
            if (a3 == 0) {
                a3 = 1;
            }
            int h2 = C91992k.m150980h(a3);
            aVar.copyOnWrite();
            C9164b bVar5 = (C9164b) aVar.instance;
            bVar5.f31644a |= 2;
            bVar5.f31646c = h2;
        }
        if (lvVar.f27479d == 16) {
            C9246ea eaVar2 = (C9246ea) C9247eb.f31972f.createBuilder();
            if (lvVar.f27479d == 16) {
                xlVar = (C8152xl) lvVar.f27480e;
            } else {
                xlVar = C8152xl.f28662d;
            }
            String str4 = xlVar.f28664a;
            eaVar2.copyOnWrite();
            C9247eb ebVar6 = (C9247eb) eaVar2.instance;
            str4.getClass();
            ebVar6.f31974a |= 1;
            ebVar6.f31975b = str4;
            if (lvVar.f27479d == 16) {
                xlVar2 = (C8152xl) lvVar.f27480e;
            } else {
                xlVar2 = C8152xl.f28662d;
            }
            int i4 = xlVar2.f28665b;
            eaVar2.copyOnWrite();
            C9247eb ebVar7 = (C9247eb) eaVar2.instance;
            ebVar7.f31974a |= 2;
            ebVar7.f31976c = i4;
            if (lvVar.f27479d == 16) {
                xlVar3 = (C8152xl) lvVar.f27480e;
            } else {
                xlVar3 = C8152xl.f28662d;
            }
            int i5 = xlVar3.f28666c;
            eaVar2.copyOnWrite();
            C9247eb ebVar8 = (C9247eb) eaVar2.instance;
            ebVar8.f31974a |= 8;
            ebVar8.f31978e = i5;
            int a4 = C7837lu.m22864a(lvVar.f27481f);
            if (a4 == 0 || a4 != 2) {
                z = true;
            }
            eaVar2.copyOnWrite();
            C9247eb ebVar9 = (C9247eb) eaVar2.instance;
            ebVar9.f31974a |= 4;
            ebVar9.f31977d = z;
            C9247eb ebVar10 = (C9247eb) eaVar2.build();
            aVar.copyOnWrite();
            C9164b bVar6 = (C9164b) aVar.instance;
            ebVar10.getClass();
            bVar6.f31656m = ebVar10;
            bVar6.f31644a |= 4096;
        }
        int a5 = C7840lx.m22875a(lvVar.f27484i);
        if (a5 == 0) {
            a5 = 1;
        }
        int e = m174272e(context, a5, lvVar.f27485j);
        aVar.copyOnWrite();
        C9164b bVar7 = (C9164b) aVar.instance;
        bVar7.f31644a |= 16;
        bVar7.f31649f = e;
        int a6 = C7840lx.m22875a(lvVar.f27482g);
        if (a6 != 0) {
            i = a6;
        }
        int e2 = m174272e(context, i, lvVar.f27483h);
        aVar.copyOnWrite();
        C9164b bVar8 = (C9164b) aVar.instance;
        bVar8.f31644a |= 128;
        bVar8.f31652i = e2;
        int i6 = lvVar.f27486k;
        aVar.copyOnWrite();
        C9164b bVar9 = (C9164b) aVar.instance;
        bVar9.f31644a |= 256;
        bVar9.f31653j = i6;
        int i7 = lvVar.f27487l;
        aVar.copyOnWrite();
        C9164b bVar10 = (C9164b) aVar.instance;
        bVar10.f31644a |= 64;
        bVar10.f31651h = i7;
        boolean z3 = lvVar.f27488m;
        aVar.copyOnWrite();
        C9164b bVar11 = (C9164b) aVar.instance;
        bVar11.f31644a |= 512;
        bVar11.f31654k = z3;
        return (C9164b) aVar.build();
    }
}
