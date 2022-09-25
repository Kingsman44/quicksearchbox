package com.google.android.libraries.lens.view.livingsurfaces;

import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.google.android.libraries.lens.view.p2073ao.C25459e;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.search.p2871b.C37215b;

/* renamed from: com.google.android.libraries.lens.view.livingsurfaces.y */
/* compiled from: PG */
final class C27271y extends C27245d {

    /* renamed from: c */
    final /* synthetic */ C27242ae f74588c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27271y(C27242ae aeVar, View view, FrameLayout.LayoutParams layoutParams, C27251j jVar, C37215b bVar, C25459e eVar, C27268v vVar, C28310af afVar, C28443m mVar, C28306ab abVar) {
        super(view, layoutParams, jVar, bVar, eVar, vVar, afVar, mVar, abVar);
        this.f74588c = aeVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo32762a() {
        return 87474;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo32773m() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo32770j(boolean z) {
        C27242ae aeVar = this.f74588c;
        synchronized (aeVar.f74520b) {
            WebView webView = aeVar.f74521c;
            if (webView != null) {
                webView.loadUrl("javascript:setMuted(" + z + ")");
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo32764d() {
        C27242ae aeVar = this.f74588c;
        synchronized (aeVar.f74520b) {
            WebView webView = aeVar.f74521c;
            if (webView != null) {
                webView.clearCache(true);
                aeVar.f74521c.destroy();
                aeVar.f74521c = null;
            }
        }
    }
}
