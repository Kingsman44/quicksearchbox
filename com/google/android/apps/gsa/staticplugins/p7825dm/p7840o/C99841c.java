package com.google.android.apps.gsa.staticplugins.p7825dm.p7840o;

import android.content.Context;
import android.webkit.JavascriptInterface;
import com.google.android.apps.gsa.search.core.google.gaia.p6800c.p6801a.C86034c;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.dm.o.c */
/* compiled from: PG */
public final class C99841c {

    /* renamed from: a */
    public static final C59071e f279310a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.dm.o.c");

    /* renamed from: b */
    public final C91097g f279311b;

    /* renamed from: c */
    public final Context f279312c;

    /* renamed from: d */
    private final C86034c f279313d;

    /* renamed from: e */
    private final C22871g f279314e;

    public C99841c(C91097g gVar, C22871g gVar2, C86034c cVar, Context context) {
        this.f279311b = gVar;
        this.f279313d = cVar;
        this.f279314e = gVar2;
        this.f279312c = context;
    }

    @JavascriptInterface
    public void chooseAccount() {
        new C90873ag(this.f279313d.mo79697b(), this.f279314e, "onParticleDiscClicked", new C99839a(this)).mo85223a(C99840b.f279309a);
    }
}
