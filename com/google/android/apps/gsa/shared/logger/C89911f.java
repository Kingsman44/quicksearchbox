package com.google.android.apps.gsa.shared.logger;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7127q.C90452a;
import com.google.android.apps.gsa.shared.p7127q.C90456c;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.shared.logger.f */
/* compiled from: PG */
public final class C89911f {

    /* renamed from: a */
    public static final C59071e f246338a = C59071e.m91332i("com.google.android.apps.gsa.shared.logger.f");

    /* renamed from: b */
    private final C68214a f246339b;

    /* renamed from: c */
    private final C68214a f246340c;

    /* renamed from: d */
    private final C89953u f246341d;

    public C89911f(C68214a aVar, C68214a aVar2, C89953u uVar) {
        this.f246339b = aVar;
        this.f246340c = aVar2;
        this.f246341d = uVar;
    }

    @Deprecated
    /* renamed from: c */
    public static void m146435c(int i) {
        C89886e eVar = new C89886e(new C90452a(29, C89885b.INTERNAL_ERROR_GENERIC_BUG_VALUE));
        eVar.f246282c = i;
        eVar.mo83724c();
        eVar.mo83723b();
    }

    /* renamed from: a */
    public final C89886e mo83755a(Throwable th, int i, int i2) {
        C89886e b = mo83756b(new C90452a(th, i2, C89885b.INTERNAL_ERROR_GENERIC_BUG_VALUE));
        b.f246282c = i;
        return b;
    }

    /* renamed from: b */
    public final C89886e mo83756b(C90456c cVar) {
        return new C89883d(cVar, this.f246339b, this.f246340c, this.f246341d);
    }
}
