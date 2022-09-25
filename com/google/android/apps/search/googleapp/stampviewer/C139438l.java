package com.google.android.apps.search.googleapp.stampviewer;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.googleapp.stampviewer.p10488b.C139343y;
import com.google.android.apps.search.googleapp.stampviewer.viewpager.C139491b;
import p5488io.p5490b.p5496d.C69821c;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.l */
/* compiled from: PG */
public final /* synthetic */ class C139438l implements C69821c {

    /* renamed from: a */
    public final /* synthetic */ C139439m f379145a;

    public /* synthetic */ C139438l(C139439m mVar) {
        this.f379145a = mVar;
    }

    /* renamed from: a */
    public final void mo25818a(Object obj) {
        C139491b bVar;
        C139439m mVar = this.f379145a;
        if (((C139343y) obj).equals(C139343y.VIEWER_MODE_FULLSCREEN) && (bVar = mVar.f379162p) != null) {
            bVar.f379276d = C139343y.VIEWER_MODE_FULLSCREEN;
            C139439m.m226587c(BuildConfig.FLAVOR, (ConstraintLayout) mVar.f379149c.requireView());
        }
    }
}
