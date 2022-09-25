package com.google.android.libraries.gsa.monet.tools.children.p1913b;

import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.shared.C23129y;
import com.google.android.libraries.gsa.monet.tools.p1897b.p1898a.p1899a.p1900a.C23141d;
import com.google.android.libraries.gsa.monet.tools.p1897b.p1904d.C23170g;
import com.google.android.libraries.gsa.monet.tools.p1897b.p1904d.C23171h;
import com.google.android.libraries.gsa.monet.tools.p1897b.p1904d.C23172i;
import com.google.android.libraries.gsa.monet.tools.p1897b.p1904d.C23174k;

/* renamed from: com.google.android.libraries.gsa.monet.tools.children.b.n */
/* compiled from: PG */
public final class C23217n implements C23225v {

    /* renamed from: a */
    final /* synthetic */ C23219p f63647a;

    public C23217n(C23219p pVar) {
        this.f63647a = pVar;
    }

    /* renamed from: a */
    public final void mo28682a(C23129y yVar) {
        C23219p pVar = this.f63647a;
        pVar.f63653d = pVar.mo28684b(yVar);
        C23219p pVar2 = this.f63647a;
        C23213j jVar = pVar2.f63652c;
        C22939d dVar = pVar2.f63653d;
        C23172i iVar = jVar.f63638b;
        C23174k kVar = iVar.f63550b;
        int i = kVar.f63553b;
        kVar.f63553b = ((C23141d) kVar.f63552a.f63498a.f63720e).f63491a.size();
        C23174k kVar2 = iVar.f63550b;
        int i2 = kVar2.f63553b;
        if (i2 == i) {
            iVar.f63549a.mo28614c(dVar);
        } else if (i2 > i) {
            C23170g gVar = iVar.f63549a;
            C22939d dVar2 = kVar2.f63554c;
            Runnable runnable = kVar2.f63555d;
            if (runnable == null) {
                runnable = C23171h.f63548a;
            }
            gVar.mo28613b(dVar2, dVar, runnable);
        } else {
            C23170g gVar2 = iVar.f63549a;
            C22939d dVar3 = kVar2.f63554c;
            dVar3.getClass();
            Runnable runnable2 = kVar2.f63555d;
            runnable2.getClass();
            gVar2.mo28612a(dVar, dVar3, runnable2);
        }
        C23174k kVar3 = iVar.f63550b;
        kVar3.f63554c = null;
        kVar3.f63555d = null;
    }

    /* renamed from: b */
    public final void mo28683b() {
        C23219p pVar = this.f63647a;
        C22939d dVar = pVar.f63653d;
        if (dVar != null) {
            pVar.f63653d = null;
            C23213j jVar = pVar.f63652c;
            C23216m mVar = new C23216m(this, dVar);
            C23172i iVar = jVar.f63638b;
            C23212i iVar2 = new C23212i(new C23211h(mVar), jVar.f63637a);
            C23174k kVar = iVar.f63550b;
            int i = kVar.f63553b;
            kVar.f63553b = ((C23141d) kVar.f63552a.f63498a.f63720e).f63491a.size();
            C23174k kVar2 = iVar.f63550b;
            int i2 = kVar2.f63553b;
            if (i2 >= i) {
                kVar2.f63554c = dVar;
                kVar2.f63555d = iVar2;
            } else if (i2 < i) {
                iVar.f63549a.mo28612a((C22939d) null, dVar, iVar2);
            }
        }
    }
}
