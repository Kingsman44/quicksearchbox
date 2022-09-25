package com.google.android.libraries.appactions.p11035a;

import com.google.android.libraries.appactions.p11035a.p11036a.C147817b;
import com.google.common.p4522b.C58486gv;
import java.util.Locale;
import p3186j$.util.Collection;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.appactions.a.j */
/* compiled from: PG */
public final /* synthetic */ class C147842j implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C58486gv f398861a;

    public /* synthetic */ C147842j(C58486gv gvVar) {
        this.f398861a = gvVar;
    }

    public final void accept(Object obj) {
        C58486gv gvVar = this.f398861a;
        C147817b bVar = (C147817b) obj;
        if (!bVar.mo124483f().isEmpty()) {
            gvVar.mo55419c(bVar.mo124483f().toLowerCase(Locale.US), bVar);
        }
        Collection.EL.stream(bVar.mo124478a()).filter(C147850r.f398874a).map(C147851s.f398875a).forEach(new C147852t(gvVar, bVar));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
