package com.google.android.apps.search.podcasts.p10550b.p10557g;

import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97894at;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97927q;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97929s;
import com.google.p4017at.p4082j.p4083a.C54366bs;
import com.google.p4017at.p4082j.p4083a.C54370bw;
import com.google.p4017at.p4082j.p4083a.C54394ct;
import com.google.p4017at.p4082j.p4083a.C54459x;
import com.google.p4017at.p4082j.p4083a.C54460y;

/* renamed from: com.google.android.apps.search.podcasts.b.g.ak */
/* compiled from: PG */
public final class C140135ak {
    /* renamed from: a */
    public static C54460y m227799a(C97894at atVar) {
        C54394ct ctVar;
        C54459x xVar = (C54459x) C54460y.f143004c.createBuilder();
        int i = atVar.f273334b;
        if (i == 2) {
            C54366bs bsVar = (C54366bs) atVar.f273335c;
            xVar.copyOnWrite();
            bsVar.getClass();
            ((C54460y) xVar.instance).f143007b = bsVar;
        } else {
            if (i == 1) {
                ctVar = (C54394ct) atVar.f273335c;
            } else {
                ctVar = C54394ct.f142866c;
            }
            xVar.copyOnWrite();
            ctVar.getClass();
            ((C54460y) xVar.instance).f143006a = ctVar;
        }
        return (C54460y) xVar.build();
    }

    /* renamed from: b */
    public static boolean m227800b(C97927q qVar, C97894at atVar) {
        C54366bs bsVar;
        C54370bw bwVar = qVar.f273449b;
        if (bwVar == null) {
            bwVar = C54370bw.f142816b;
        }
        String str = bwVar.f142818a;
        if (atVar.f273334b == 2) {
            bsVar = (C54366bs) atVar.f273335c;
        } else {
            bsVar = C54366bs.f142811b;
        }
        return str.equals(bsVar.f142813a);
    }

    /* renamed from: c */
    public static boolean m227801c(C97929s sVar, C97894at atVar) {
        C54394ct ctVar;
        C54394ct ctVar2;
        String str = sVar.f273456d;
        String str2 = sVar.f273455c;
        if (atVar.f273334b == 1) {
            ctVar = (C54394ct) atVar.f273335c;
        } else {
            ctVar = C54394ct.f142866c;
        }
        String str3 = ctVar.f142869b;
        if (atVar.f273334b == 1) {
            ctVar2 = (C54394ct) atVar.f273335c;
        } else {
            ctVar2 = C54394ct.f142866c;
        }
        String str4 = ctVar2.f142868a;
        if (str.equals(str3)) {
            return true;
        }
        if (str2.isEmpty() || !str2.equals(str4)) {
            return false;
        }
        return true;
    }
}
