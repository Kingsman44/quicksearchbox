package com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.p9624b;

import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34038ba;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34039bb;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34076cl;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34080cp;
import java.util.Map;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.g.g.b.af */
/* compiled from: PG */
public final class C127644af {
    /* renamed from: a */
    public static final C34080cp m208664a(C34076cl clVar) {
        C34039bb bbVar;
        C69664n.m101061g(clVar, "<this>");
        if (clVar.f90799a == 1) {
            bbVar = (C34039bb) clVar.f90800b;
        } else {
            bbVar = C34039bb.f90716f;
        }
        C34038ba baVar = bbVar.f90721d;
        if (baVar == null) {
            baVar = C34038ba.f90707h;
        }
        C34080cp cpVar = baVar.f90713e;
        if (cpVar == null) {
            cpVar = C34080cp.f90803i;
        }
        C69664n.m101060f(cpVar, "invocation.payload.sessionMetadata");
        return cpVar;
    }

    /* renamed from: b */
    public static final e m208665b(C34080cp cpVar) {
        C69664n.m101061g(cpVar, "<this>");
        e eVar = e.a;
        int i = cpVar.f90805a;
        if ((i & 64) != 0 && (eVar = e.a(cpVar.f90812h)) == null) {
            eVar = e.a;
        }
        if ((i & 2) != 0 && (eVar = (e) C127645ag.f351404a.get(Integer.valueOf(cpVar.f90807c))) == null) {
            eVar = e.a;
        }
        if (eVar != e.a) {
            return eVar;
        }
        if ((cpVar.f90806b & 4) != 0) {
            eVar = e.bu;
        }
        int i2 = cpVar.f90811g;
        if (i2 == 1) {
            return e.aL;
        }
        if (i2 == 2) {
            return e.aN;
        }
        if (i2 == 3) {
            return e.aP;
        }
        if (i2 == 4) {
            return e.aR;
        }
        if (i2 == 5) {
            return e.aO;
        }
        Map map = C127645ag.f351404a;
        return eVar;
    }
}
