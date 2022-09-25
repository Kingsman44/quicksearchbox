package com.google.android.libraries.lens.view.p2085ax;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.C119075a;
import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.C119094ac;
import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.C119096ae;
import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.C119126h;
import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.p8927e.C119122a;
import com.google.android.libraries.lens.common.p2003f.C24114a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58869cf;
import com.google.common.base.C58890d;
import com.google.common.base.C58903m;
import com.google.common.base.C58911u;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.C59052c;
import com.google.p440an.p441a.C8841h;
import dagger.p5294a.C68220f;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p5285d.p5290b.p5291a.p5292a.C68182br;
import p5285d.p5290b.p5291a.p5292a.C68183bs;
import p5285d.p5290b.p5291a.p5292a.C68184bt;
import p5285d.p5290b.p5291a.p5292a.C68185bu;
import p5285d.p5290b.p5291a.p5292a.C68186bv;
import p5285d.p5290b.p5291a.p5292a.C68187bw;
import p5285d.p5290b.p5291a.p5292a.C68188bx;
import p5285d.p5290b.p5291a.p5292a.C68189by;
import p5285d.p5290b.p5291a.p5292a.C68201n;
import p5285d.p5290b.p5291a.p5292a.C68202o;
import p5285d.p5290b.p5291a.p5292a.C68203p;

/* renamed from: com.google.android.libraries.lens.view.ax.h */
/* compiled from: PG */
public final class C25606h implements C68220f {
    /* renamed from: a */
    public static void m47228a(String str, String str2, C119096ae aeVar, C68202o oVar) {
        int a = C68203p.m98509a(oVar.f184553a);
        if (a == 0) {
            a = 1;
        }
        int i = a - 2;
        if (i == 2 || i == 3) {
            if (!C119122a.f332260a) {
                Log.i("AbstractSpeakr", "Requested format OPUS is not supported, falling back to MP3");
                C68201n nVar = (C68201n) oVar.toBuilder();
                nVar.copyOnWrite();
                ((C68202o) nVar.instance).f184553a = 1;
                oVar = (C68202o) nVar.build();
            } else {
                C68201n nVar2 = (C68201n) oVar.toBuilder();
                nVar2.copyOnWrite();
                ((C68202o) nVar2.instance).f184553a = 2;
                oVar = (C68202o) nVar2.build();
            }
        }
        C119075a aVar = (C119075a) aeVar;
        aVar.f332174i = oVar;
        C119094ac acVar = aVar.f332166a;
        acVar.f332213i = 0.8f;
        if (acVar.f332216l == 1) {
            acVar.mo104175b();
        }
        C58490gz gzVar = new C58490gz(4);
        if (!TextUtils.isEmpty(str2)) {
            for (String str3 : C58869cf.m90936b(new C58903m(',')).mo56153g(str2)) {
                List i2 = C58869cf.m90936b(new C58903m('=')).mo56152f(C58911u.f156751b).mo56155i(str3);
                if (i2.size() != 2 || TextUtils.isEmpty((CharSequence) i2.get(0)) || TextUtils.isEmpty((CharSequence) i2.get(1))) {
                    ((C59052c) ((C59052c) C24114a.f65842a.mo56225c()).mo56372aa(48715)).mo56389s("Unexpected language-voice entry: %s", str3);
                } else {
                    gzVar.mo55429h((String) i2.get(0), (String) i2.get(1));
                }
            }
        }
        if (!TextUtils.isEmpty(str)) {
            gzVar.mo55429h("en", str);
        }
        C58800sl lA = gzVar.mo55427f(true).entrySet().iterator();
        while (lA.hasNext()) {
            Map.Entry entry = (Map.Entry) lA.next();
            String str4 = (String) entry.getKey();
            String str5 = (String) entry.getValue();
            C68184bt btVar = (C68184bt) C68185bu.f184497d.createBuilder();
            btVar.copyOnWrite();
            str5.getClass();
            ((C68185bu) btVar.instance).f184499a = str5;
            C68185bu buVar = (C68185bu) btVar.build();
            C8841h.m23466a(str4);
            ArrayList arrayList = new ArrayList();
            C119126h hVar = (C119126h) aeVar;
            for (C68183bs bsVar : ((C68189by) hVar.f332263l.mo56109e(C68189by.f184505b)).f184507a) {
                C68187bw bwVar = bsVar.f184495a;
                if (bwVar == null) {
                    bwVar = C68187bw.f184502b;
                }
                if (!C58890d.m90990e(bwVar.f184504a, str4)) {
                    arrayList.add(bsVar);
                }
            }
            C68188bx bxVar = (C68188bx) C68189by.f184505b.createBuilder();
            bxVar.mo60283a(arrayList);
            C68182br brVar = (C68182br) C68183bs.f184493c.createBuilder();
            C68186bv bvVar = (C68186bv) C68187bw.f184502b.createBuilder();
            bvVar.copyOnWrite();
            str4.getClass();
            ((C68187bw) bvVar.instance).f184504a = str4;
            brVar.copyOnWrite();
            C68187bw bwVar2 = (C68187bw) bvVar.build();
            bwVar2.getClass();
            ((C68183bs) brVar.instance).f184495a = bwVar2;
            brVar.copyOnWrite();
            buVar.getClass();
            ((C68183bs) brVar.instance).f184496b = buVar;
            bxVar.copyOnWrite();
            C68189by byVar = (C68189by) bxVar.instance;
            C68183bs bsVar2 = (C68183bs) brVar.build();
            bsVar2.getClass();
            byVar.mo60285a();
            byVar.f184507a.add(bsVar2);
            hVar.f332263l = C58833ax.m90834k((C68189by) bxVar.build());
        }
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        throw null;
    }
}
