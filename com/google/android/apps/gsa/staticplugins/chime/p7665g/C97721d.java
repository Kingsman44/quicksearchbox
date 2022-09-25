package com.google.android.apps.gsa.staticplugins.chime.p7665g;

import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.libraries.gsa.p1876k.C22870f;
import com.google.android.libraries.notifications.data.C29820k;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.apps.gsa.staticplugins.chime.g.d */
/* compiled from: PG */
public final /* synthetic */ class C97721d implements C22870f {

    /* renamed from: a */
    public final /* synthetic */ C97722e f272846a;

    /* renamed from: b */
    public final /* synthetic */ C91006f f272847b;

    public /* synthetic */ C97721d(C97722e eVar, C91006f fVar) {
        this.f272846a = eVar;
        this.f272847b = fVar;
    }

    public final void run() {
        C97722e eVar = this.f272846a;
        C91006f fVar = this.f272847b;
        C58485gu a = eVar.f272849b.mo35111a((C29820k) null);
        if (!a.isEmpty()) {
            fVar.mo85279c("account").mo85276a(C90752i.m148229c("none"));
            C97722e.m161971a(fVar.mo85281e((Object) null), a);
        }
        for (C29820k kVar : eVar.f272848a.mo35089c()) {
            fVar.mo85279c("account").mo85276a(C90752i.m148233g(kVar.mo35009h()));
            fVar.mo85279c("last_registration").mo85276a(C90752i.m148230d(kVar.mo35005e()));
            fVar.mo85279c("registration_status").mo85276a(C90752i.m148229c(kVar.mo35002b().name()));
            C97722e.m161971a(fVar.mo85281e((Object) null), eVar.f272849b.mo35111a(kVar));
        }
    }
}
