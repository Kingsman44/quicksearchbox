package com.google.android.apps.search.pronunciationlearning.p10630c.p10631a;

import com.google.android.libraries.search.p2904c.p2952o.p2959e.C37935b;
import com.google.common.base.C58894dd;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.android.apps.search.pronunciationlearning.c.a.b */
/* compiled from: PG */
public final /* synthetic */ class C141335b implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C141345l f383699a;

    public /* synthetic */ C141335b(C141345l lVar) {
        this.f383699a = lVar;
    }

    public final C60870cx apply(Object obj) {
        try {
            C37935b.m66967e((InputStream) obj, C141345l.f383710a, new C141337d(this.f383699a));
            return C60866ct.f164955a;
        } catch (IOException unused) {
            return C60856cj.m92899h(new C58894dd("failed to get speechlevel"));
        }
    }
}
