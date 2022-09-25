package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.window;

import android.content.Intent;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.window.u */
/* compiled from: PG */
public final /* synthetic */ class C82187u implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C82192z f224619a;

    public /* synthetic */ C82187u(C82192z zVar) {
        this.f224619a = zVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C82192z zVar = this.f224619a;
        if (((Boolean) obj).booleanValue()) {
            while (!zVar.f224645r.isEmpty()) {
                zVar.f224635h.mo75146a((Intent) zVar.f224645r.remove());
            }
        }
    }
}
