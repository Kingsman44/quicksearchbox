package com.google.android.libraries.gsa.conversation.p1850d;

import android.webkit.WebView;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.libraries.gsa.conversation.d.f */
/* compiled from: PG */
public final /* synthetic */ class C22556f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C22559i f62177a;

    public /* synthetic */ C22556f(C22559i iVar) {
        this.f62177a = iVar;
    }

    public final void run() {
        C22559i iVar = this.f62177a;
        if (!iVar.f62185f.get() && iVar.f62187h.mo56113h()) {
            ((WebView) iVar.f62187h.mo56107c()).destroy();
            iVar.f62187h = C58836b.f156633a;
        }
    }
}
