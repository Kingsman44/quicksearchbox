package com.google.android.apps.gsa.staticplugins.bisto.p7488f;

import android.content.Context;
import com.google.android.apps.gsa.search.core.p6513aj.C84516aa;
import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.android.apps.gsa.shared.notificationlistening.common.C90421b;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60237lk;
import com.google.common.p4552o.C60239lm;
import com.google.common.p4552o.C60241lo;
import com.google.common.p4552o.C60291nd;
import com.google.common.p4552o.C60292ne;
import com.google.common.p4552o.C60303np;
import com.google.common.p4552o.C60305nr;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.f.q */
/* compiled from: PG */
public final class C95311q {

    /* renamed from: a */
    public static final Map f266691a = new HashMap();

    /* renamed from: a */
    public static C60303np m157567a(Collection collection) {
        Iterator it = collection.iterator();
        String str = null;
        String str2 = null;
        boolean z = true;
        while (it.hasNext()) {
            C90421b bVar = (C90421b) it.next();
            if (!z) {
                if (str2 != null && !str2.equals(bVar.f252591l)) {
                    str2 = null;
                }
                if (str != null && !str.equals(bVar.f252581b)) {
                    str = null;
                }
                if (str2 == null && str == null) {
                    break;
                }
            } else {
                str2 = bVar.f252591l;
                str = bVar.f252581b;
            }
            z = false;
        }
        C60303np npVar = (C60303np) C60305nr.f163179e.createBuilder();
        npVar.copyOnWrite();
        C60305nr nrVar = (C60305nr) npVar.instance;
        nrVar.f163182b = 2;
        nrVar.f163181a = 1 | nrVar.f163181a;
        if (str2 != null) {
            npVar.copyOnWrite();
            C60305nr nrVar2 = (C60305nr) npVar.instance;
            nrVar2.f163181a |= 4;
            nrVar2.f163184d = str2;
        }
        if (str != null) {
            npVar.copyOnWrite();
            C60305nr nrVar3 = (C60305nr) npVar.instance;
            nrVar3.f163181a |= 2;
            nrVar3.f163183c = str;
        }
        return npVar;
    }

    /* renamed from: b */
    public static void m157568b(Context context, C95293ae aeVar, C60237lk lkVar, int i) {
        C60239lm lmVar;
        C58800sl lA = aeVar.f266621c.keySet().iterator();
        while (true) {
            if (!lA.hasNext()) {
                lmVar = C60239lm.f162973e;
                break;
            }
            Integer num = (Integer) lA.next();
            if (!(num == null || aeVar.f266624f == null)) {
                C95296b bVar = aeVar.f266624f;
                List c = C95296b.m157528c(num.intValue());
                if (c != null && c.contains(Integer.valueOf(i))) {
                    lmVar = aeVar.mo89213e(num.intValue(), context.getString(i));
                    break;
                }
            }
        }
        lkVar.mo57077a(lmVar);
    }

    /* renamed from: c */
    public static void m157569c(C95293ae aeVar, C60237lk lkVar, int i, String str) {
        lkVar.mo57077a(aeVar.mo89213e(i, str));
    }

    /* renamed from: d */
    public static void m157570d(C60237lk lkVar, int i) {
        if (i == 1) {
            int i2 = ((C60241lo) lkVar.instance).f163002u;
            lkVar.copyOnWrite();
            C60241lo loVar = (C60241lo) lkVar.instance;
            loVar.f162982a |= 16777216;
            loVar.f163002u = i2 + 1;
        } else if (i == 2) {
            int i3 = ((C60241lo) lkVar.instance).f163003v;
            lkVar.copyOnWrite();
            C60241lo loVar2 = (C60241lo) lkVar.instance;
            loVar2.f162982a |= 33554432;
            loVar2.f163003v = i3 + 1;
        }
    }

    /* renamed from: e */
    public static void m157571e(C84516aa aaVar, C89656k kVar, C60291nd ndVar) {
        boolean isDeviceLocked = aaVar.f230023b.isDeviceLocked();
        C58976aa aaVar2 = C58975e.f156826a;
        if (isDeviceLocked) {
            ndVar.copyOnWrite();
            C60292ne neVar = (C60292ne) ndVar.instance;
            C60292ne neVar2 = C60292ne.f163113l;
            neVar.f163115a |= 1024;
            neVar.f163123i = true;
        }
        if (kVar.mo83553h("key_personal_results_enabled")) {
            ndVar.copyOnWrite();
            C60292ne neVar3 = (C60292ne) ndVar.instance;
            C60292ne neVar4 = C60292ne.f163113l;
            neVar3.f163115a |= 256;
            neVar3.f163121g = true;
        }
        if (kVar.mo83553h("key_personal_results_headphones_enabled")) {
            ndVar.copyOnWrite();
            C60292ne neVar5 = (C60292ne) ndVar.instance;
            C60292ne neVar6 = C60292ne.f163113l;
            neVar5.f163115a |= 512;
            neVar5.f163122h = true;
        }
    }
}
