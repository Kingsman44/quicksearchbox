package com.google.android.apps.gsa.staticplugins.opa.appintegration.service;

import android.os.IBinder;
import com.google.android.apps.search.assistant.platform.appintegration.p8997e.C119532a;
import com.google.android.libraries.assistant.p1467d.p1472c.p1473a.C17845h;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17873ac;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17880aj;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.appintegration.service.h */
/* compiled from: PG */
final class C107357h extends C17845h {

    /* renamed from: a */
    final C17873ac f298772a = ((C17873ac) C17880aj.f51221i.createBuilder());

    /* renamed from: b */
    final String f298773b;

    /* renamed from: c */
    final Set f298774c = new HashSet();

    /* renamed from: d */
    public boolean f298775d;

    /* renamed from: e */
    final /* synthetic */ C107359j f298776e;

    public C107357h(C107359j jVar, String str) {
        this.f298776e = jVar;
        this.f298773b = str;
        jVar.f298796s.mo104418a(C119532a.MAESTRO, str);
    }

    /* renamed from: a */
    public final void mo23480a(byte[] bArr) {
        C58976aa aaVar = C58975e.f156826a;
        this.f298776e.f298779b.post(new C107356g(this, bArr));
    }

    /* renamed from: b */
    public final void mo23481b(IBinder iBinder) {
    }
}
