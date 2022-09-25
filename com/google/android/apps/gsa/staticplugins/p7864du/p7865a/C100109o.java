package com.google.android.apps.gsa.staticplugins.p7864du.p7865a;

import com.google.android.apps.gsa.staticplugins.p7864du.p7866b.C100180f;
import com.google.android.apps.gsa.store.C118333v;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import java.io.File;

/* renamed from: com.google.android.apps.gsa.staticplugins.du.a.o */
/* compiled from: PG */
final class C100109o implements C100180f {

    /* renamed from: a */
    final /* synthetic */ C58881cr f279942a;

    /* renamed from: b */
    private final C58881cr f279943b;

    public C100109o(C58881cr crVar) {
        this.f279942a = crVar;
        this.f279943b = C58886cw.m90973a(new C100108n(crVar));
    }

    /* renamed from: a */
    public final File mo91742a(C118333v vVar) {
        byte[] bArr = vVar.f328466c;
        if (bArr == null || bArr.length < 102400) {
            return null;
        }
        return (File) this.f279943b.mo6453a();
    }

    /* renamed from: b */
    public final File[] mo91743b() {
        return new File[]{(File) this.f279943b.mo6453a()};
    }
}
