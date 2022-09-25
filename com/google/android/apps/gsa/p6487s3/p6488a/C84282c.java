package com.google.android.apps.gsa.p6487s3.p6488a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.p6968aa.C89040bk;
import com.google.android.apps.gsa.shared.p6968aa.C89051g;
import com.google.android.libraries.p1733g.C21407a;
import com.google.common.base.C58838bb;
import com.google.speech.p5208h.C66607ce;

/* renamed from: com.google.android.apps.gsa.s3.a.c */
/* compiled from: PG */
public final class C84282c {

    /* renamed from: a */
    static final byte[] f229357a = {0, 0};

    /* renamed from: b */
    public static final /* synthetic */ int f229358b = 0;

    /* renamed from: c */
    private final C89040bk f229359c;

    /* renamed from: d */
    private boolean f229360d;

    public C84282c(C89040bk bkVar, String str) {
        this.f229359c = bkVar;
        byte[] b = C21407a.m40531b(str.replace("_", BuildConfig.FLAVOR));
        bkVar.mo83009g(b.length + 2, new C84280a(b));
    }

    /* renamed from: a */
    public final void mo77820a(C66607ce ceVar, boolean z) {
        C58838bb.m90883r(!this.f229360d);
        int serializedSize = ceVar.getSerializedSize();
        this.f229359c.mo83009g(serializedSize + 4, new C84281b(serializedSize, ceVar));
        if (z && !this.f229360d) {
            this.f229359c.mo83008c(C89051g.f241328a);
            this.f229360d = true;
        }
    }
}
