package com.google.android.libraries.mdi.download.p2230c;

import android.net.Uri;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.mdi.download.c.o */
/* compiled from: PG */
public abstract class C28780o {
    /* renamed from: a */
    public abstract C28781p mo34388a();

    /* renamed from: b */
    public abstract C58833ax mo34389b();

    /* renamed from: c */
    public abstract String mo34390c();

    /* renamed from: d */
    public abstract void mo34391d(C28779n nVar);

    /* renamed from: e */
    public abstract void mo34392e(C58485gu guVar);

    /* renamed from: f */
    public abstract void mo34393f(Uri uri);

    /* renamed from: g */
    public abstract void mo34394g(int i);

    /* renamed from: h */
    public abstract void mo34395h(String str);

    /* renamed from: i */
    public final C28781p mo34409i() {
        if (mo34390c().startsWith("inlinefile")) {
            C58838bb.m90869d(mo34389b().mo56113h(), "InlineDownloadParams must be set when using inlinefile: scheme");
            mo34391d(C28779n.f78234a);
        }
        return mo34388a();
    }
}
