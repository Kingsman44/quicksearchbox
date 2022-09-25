package com.google.android.apps.gsa.staticplugins.nga.p8089t;

import com.evernote.android.state.BuildConfig;
import com.evernote.android.state.StateSaver;
import com.google.android.apps.gsa.nga.shared.p6407v.C83305i;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82436fc;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82665np;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82666nq;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import java.io.IOException;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.w */
/* compiled from: PG */
public final class C104126w {

    /* renamed from: a */
    private static final C58974d f289662a = C58974d.m91136j();

    /* renamed from: b */
    private final C83305i f289663b;

    public C104126w(C83305i iVar) {
        this.f289663b = iVar;
    }

    /* renamed from: a */
    public final void mo93948a(int i, String str) {
        C58970a aVar = (C58970a) f289662a.mo56225c();
        aVar.mo56380ai(C58979ad.SMALL);
        ((C58970a) aVar.mo56372aa(21685)).mo56389s("%s", str);
        C83305i iVar = this.f289663b;
        C82665np f = C82666nq.m132005f();
        f.mo76215b(i);
        ((C82436fc) f).f225245b = BuildConfig.FLAVOR;
        iVar.mo75579d(f.mo76214a());
    }

    /* renamed from: b */
    public final void mo93949b(int i, Throwable th, String str) {
        String str2;
        ((C58970a) ((C58970a) ((C58970a) f289662a.mo56225c()).mo56382g(th)).mo56372aa(21686)).mo56389s("%s", str);
        C83305i iVar = this.f289663b;
        C82665np f = C82666nq.m132005f();
        f.mo76215b(i);
        Class<?> cls = th.getClass();
        if (th instanceof IOException) {
            str2 = "java.io.IOException";
        } else if (th instanceof NullPointerException) {
            str2 = "java.lang.NullPointerException";
        } else if (th instanceof IllegalArgumentException) {
            str2 = "java.lang.IllegalArgumentException";
        } else if (th instanceof IllegalStateException) {
            str2 = "java.lang.IllegalStateException";
        } else {
            String name = cls.getName();
            if (name.startsWith(StateSaver.JAVA_PREFIX)) {
                str2 = "java.*";
            } else if (name.startsWith("com.google.android.libraries.mdi.")) {
                str2 = "com.google.android.libraries.mdi.*";
            } else if (name.startsWith("com.google.android.apps.gsa.")) {
                str2 = "com.google.android.apps.gsa.*";
            } else if (name.startsWith("com.google.")) {
                str2 = "com.google.*";
            } else {
                str2 = name.startsWith(StateSaver.ANDROID_PREFIX) ? "android.*" : "java.lang.Exception";
            }
        }
        ((C82436fc) f).f225245b = str2;
        iVar.mo75579d(f.mo76214a());
    }
}
