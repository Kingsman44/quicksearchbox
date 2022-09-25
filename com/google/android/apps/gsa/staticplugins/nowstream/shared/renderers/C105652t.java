package com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers;

import com.google.android.apps.gsa.shared.monet.p7113e.C90321e;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1923a.C23249a;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.t */
/* compiled from: PG */
final class C105652t implements C90321e {

    /* renamed from: a */
    final /* synthetic */ C105474ab f294752a;

    public C105652t(C105474ab abVar) {
        this.f294752a = abVar;
    }

    /* renamed from: a */
    public final void mo84002a() {
        C105474ab abVar = this.f294752a;
        abVar.f294202j = true;
        abVar.f294209q.suppressLayout(true);
    }

    /* renamed from: b */
    public final void mo84003b() {
        C105474ab abVar = this.f294752a;
        abVar.f294202j = false;
        if (abVar.f294206n) {
            abVar.f294206n = false;
            abVar.mo94835Q();
        }
        C105474ab abVar2 = this.f294752a;
        abVar2.f294207o.mo8794l(((Boolean) ((C23249a) abVar2.f294216x.mo94547l()).mo28725a()).booleanValue(), false);
        C105474ab abVar3 = this.f294752a;
        abVar3.f294209q.suppressLayout(abVar3.f294202j);
    }
}
