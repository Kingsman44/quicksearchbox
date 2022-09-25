package com.google.android.apps.gsa.staticplugins.p7864du.p7865a;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90085ej;
import com.google.android.apps.gsa.staticplugins.p7864du.p7866b.C100180f;
import com.google.android.apps.gsa.store.C118333v;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import java.io.File;

/* renamed from: com.google.android.apps.gsa.staticplugins.du.a.w */
/* compiled from: PG */
final class C100117w implements C100180f {

    /* renamed from: a */
    final /* synthetic */ C58881cr f279945a;

    /* renamed from: b */
    final /* synthetic */ C86124t f279946b;

    /* renamed from: c */
    private final C58881cr f279947c;

    public C100117w(C58881cr crVar, C86124t tVar) {
        this.f279945a = crVar;
        this.f279946b = tVar;
        this.f279947c = C58886cw.m90973a(new C100116v(crVar));
    }

    /* renamed from: a */
    public final File mo91742a(C118333v vVar) {
        byte[] bArr = vVar.f328466c;
        if (bArr == null || bArr.length < ((int) this.f279946b.mo79743a(C90085ej.f250235m)) * 1024) {
            return null;
        }
        return (File) this.f279947c.mo6453a();
    }

    /* renamed from: b */
    public final File[] mo91743b() {
        return new File[]{(File) this.f279947c.mo6453a()};
    }
}
