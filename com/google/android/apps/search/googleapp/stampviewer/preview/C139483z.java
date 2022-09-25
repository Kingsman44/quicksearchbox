package com.google.android.apps.search.googleapp.stampviewer.preview;

import androidx.lifecycle.C2344as;
import androidx.lifecycle.C2358bf;
import com.google.android.apps.search.googleapp.stampviewer.p10488b.C139343y;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.p5490b.p5519k.C70118f;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.preview.z */
/* compiled from: PG */
public final class C139483z extends C2358bf {

    /* renamed from: a */
    public final C2344as f379262a;

    /* renamed from: b */
    public final String f379263b = "VIEWER_MODE_KEY";

    /* renamed from: c */
    public C139343y f379264c = C139343y.VIEWER_MODE_INLINE;

    /* renamed from: d */
    public final C70118f f379265d = new C70118f();

    /* renamed from: e */
    public final C70118f f379266e = new C70118f();

    public C139483z(C2344as asVar) {
        C69664n.m101061g(asVar, "savedState");
        this.f379262a = asVar;
        if (asVar.mo5755b("VIEWER_MODE_KEY") != null) {
            C139343y yVar = (C139343y) asVar.mo5755b("VIEWER_MODE_KEY");
            this.f379264c = yVar == null ? C139343y.VIEWER_MODE_INLINE : yVar;
        }
    }

    /* renamed from: a */
    public final void mo115002a() {
        this.f379266e.mo25988lL(true);
    }
}
