package com.google.android.libraries.appactions.p11035a;

import com.google.common.p4522b.C58486gv;
import com.google.common.p4522b.C58526ih;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.function.Consumer;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.libraries.appactions.a.w */
/* compiled from: PG */
public final /* synthetic */ class C147855w implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C147828ad f398880a;

    /* renamed from: b */
    public final /* synthetic */ C58486gv f398881b;

    public /* synthetic */ C147855w(C147828ad adVar, C58486gv gvVar) {
        this.f398880a = adVar;
        this.f398881b = gvVar;
    }

    public final void accept(Object obj) {
        C147828ad adVar = this.f398880a;
        C58486gv gvVar = this.f398881b;
        String str = (String) obj;
        C58526ih ihVar = new C58526ih();
        Stream map = Collection.EL.stream(adVar.f398831b.mo55543v(str).values()).map(C147841i.f398860a);
        Objects.requireNonNull(ihVar);
        map.forEach(new C147849q(ihVar));
        gvVar.mo55421e(str, ihVar.mo55486f());
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
