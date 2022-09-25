package com.google.android.apps.gsa.staticplugins.opa.p8296ar;

import com.google.android.apps.gsa.opa.p6443g.p6445b.C83683b;
import com.google.android.apps.gsa.opa.p6443g.p6446c.C83693b;
import com.google.android.apps.gsa.staticplugins.opa.p8296ar.p8299c.C107431k;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3803ag.p3804a.C48851br;
import com.google.assistant.p3803ag.p3804a.C48865h;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60866ct;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ar.o */
/* compiled from: PG */
public final /* synthetic */ class C107447o implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C107458z f298999a;

    /* renamed from: b */
    public final /* synthetic */ C48865h f299000b;

    /* renamed from: c */
    public final /* synthetic */ C83683b f299001c;

    public /* synthetic */ C107447o(C107458z zVar, C48865h hVar, C83683b bVar) {
        this.f298999a = zVar;
        this.f299000b = hVar;
        this.f299001c = bVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C48851br brVar;
        C107458z zVar = this.f298999a;
        C48865h hVar = this.f299000b;
        C83683b bVar = this.f299001c;
        C58833ax axVar = (C58833ax) obj;
        if (C107431k.m178347e(axVar)) {
            return C60866ct.f164955a;
        }
        if (C107431k.m178346d(axVar)) {
            return C60866ct.f164955a;
        }
        C22871g gVar = zVar.f299022e;
        C83693b bVar2 = zVar.f299023f;
        if (hVar.f126458b == 3) {
            brVar = (C48851br) hVar.f126459c;
        } else {
            brVar = C48851br.f126412f;
        }
        return gVar.mo28210j(bVar2.mo77019e(brVar.toByteString(), bVar), "updateContentSelectorStatusInStore", new C107449q(zVar, hVar));
    }
}
