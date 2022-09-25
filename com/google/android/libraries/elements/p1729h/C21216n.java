package com.google.android.libraries.elements.p1729h;

import com.facebook.p313c.C6037d;
import com.google.android.libraries.elements.interfaces.C21259bb;
import com.google.android.libraries.elements.interfaces.C21319z;
import com.google.protos.youtube.elements.C66260r;

/* renamed from: com.google.android.libraries.elements.h.n */
/* compiled from: PG */
public final class C21216n implements C6037d {

    /* renamed from: a */
    private final C21259bb f59536a;

    public C21216n(C21259bb bbVar) {
        this.f59536a = bbVar;
    }

    /* renamed from: b */
    public final void mo12567b(String str, Throwable th) {
        mo12566a(2, "LITHO:NPE:UNSET_PADDING", str);
    }

    /* renamed from: c */
    public final void mo12568c(int i, String str) {
        mo12566a(i, "TextureTooBig", str);
    }

    /* renamed from: d */
    public final void mo12585d(int i, String str, String str2, Throwable th) {
        throw null;
    }

    /* renamed from: a */
    public final void mo12566a(int i, String str, String str2) {
        C66260r rVar;
        C21259bb bbVar = this.f59536a;
        int i2 = i - 1;
        if (i2 == 1 || i2 == 2) {
            rVar = C66260r.LOG_TYPE_INTERNAL_ERROR;
        } else {
            rVar = C66260r.LOG_LEVEL_WARN;
        }
        bbVar.mo25782a(rVar, str2, C21319z.f59680u, (Throwable) null);
    }
}
