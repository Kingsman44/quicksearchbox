package com.google.android.apps.gsa.staticplugins.fedass.p7949h;

import com.google.assistant.p3861at.C49875cf;
import com.google.assistant.p3861at.C49879cj;
import com.google.assistant.p3861at.C49891cv;
import com.google.common.p4526f.C59052c;
import com.google.protobuf.C63042fg;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.h.i */
/* compiled from: PG */
public final /* synthetic */ class C100870i implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C100870i f281853a = new C100870i();

    private /* synthetic */ C100870i() {
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate.CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        return Predicate.CC.$default$negate(this);
    }

    /* renamed from: or */
    public final /* synthetic */ Predicate mo17950or(Predicate predicate) {
        return Predicate.CC.$default$or(this, predicate);
    }

    public final boolean test(Object obj) {
        C49879cj cjVar = (C49879cj) obj;
        C49875cf a = C49875cf.m85755a(cjVar.f129638i);
        if (a == null) {
            a = C49875cf.UNKNOWN;
        }
        if (a.equals(C49875cf.MANHATTAN)) {
            C59052c cVar = (C59052c) ((C59052c) C100872k.f281855a.mo56224b()).mo56372aa(19654);
            String str = cjVar.f129631b;
            C49891cv cvVar = cjVar.f129639j;
            if (cvVar == null) {
                cvVar = C49891cv.f129647N;
            }
            cVar.mo56355H("Manhattan device %s; supportsFaceMatch: %b", str, cvVar.f129654E);
            C49891cv cvVar2 = cjVar.f129639j;
            if (cvVar2 == null) {
                cvVar2 = C49891cv.f129647N;
            }
            if (cvVar2.f129654E) {
                return true;
            }
        }
        C49875cf a2 = C49875cf.m85755a(cjVar.f129638i);
        if (a2 == null) {
            a2 = C49875cf.UNKNOWN;
        }
        if (!a2.equals(C49875cf.NEXUS)) {
            return false;
        }
        C59052c cVar2 = (C59052c) ((C59052c) C100872k.f281855a.mo56224b()).mo56372aa(19655);
        String str2 = cjVar.f129631b;
        Boolean valueOf = Boolean.valueOf(cjVar.f129637h);
        C63042fg fgVar = cjVar.f129640k;
        if (fgVar == null) {
            fgVar = C63042fg.f170152c;
        }
        cVar2.mo56359L("Nexus device %s; isSelf: %b; isWithinLastTwoMonths: %b", str2, valueOf, Boolean.valueOf(C100872k.m167106d(fgVar)));
        if (cjVar.f129637h) {
            return true;
        }
        C63042fg fgVar2 = cjVar.f129640k;
        if (fgVar2 == null) {
            fgVar2 = C63042fg.f170152c;
        }
        return C100872k.m167106d(fgVar2);
    }
}
