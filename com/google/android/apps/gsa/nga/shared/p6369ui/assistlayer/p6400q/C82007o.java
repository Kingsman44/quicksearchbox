package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6400q;

import android.view.View;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.q.o */
/* compiled from: PG */
public final /* synthetic */ class C82007o implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C82012t f224190a;

    public /* synthetic */ C82007o(C82012t tVar) {
        this.f224190a = tVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C82012t tVar = this.f224190a;
        Optional optional = (Optional) obj;
        if (optional.isPresent()) {
            View view = (View) optional.get();
            view.setAlpha(0.0f);
            tVar.f224197b.addView(view);
            C82011s sVar = tVar.f224200e;
            if (sVar != null) {
                sVar.mo75243a(view);
                tVar.f224200e = null;
            }
            view.animate().alpha(1.0f);
            tVar.f224202g = true;
        }
    }
}
