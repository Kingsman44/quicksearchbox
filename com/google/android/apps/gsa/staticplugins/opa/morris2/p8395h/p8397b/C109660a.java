package com.google.android.apps.gsa.staticplugins.opa.morris2.p8395h.p8397b;

import com.google.assistant.p3897e.p3929l.p3930a.C52686as;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.protos.p5129p.p5131b.C65849r;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.morris2.h.b.a */
/* compiled from: PG */
public final /* synthetic */ class C109660a implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C109660a f305416a = new C109660a();

    private /* synthetic */ C109660a() {
    }

    public final Object apply(Object obj) {
        Optional findFirst = Collection.EL.stream((C58485gu) obj).findFirst();
        if (!findFirst.isPresent() || ((C65849r) findFirst.get()).f179004a != 10) {
            ((C59052c) ((C59052c) C109662c.f305417a.mo56226d()).mo56372aa(25131)).mo56386p("Geller data doesn't have driving settings.");
            return C52686as.f138291q;
        }
        C65849r rVar = (C65849r) findFirst.get();
        if (rVar.f179004a == 10) {
            return (C52686as) rVar.f179005b;
        }
        return C52686as.f138291q;
    }
}
