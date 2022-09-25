package com.google.android.libraries.search.video.p3192b;

import android.widget.FrameLayout;
import com.google.android.libraries.search.video.conductor.C41478a;
import com.google.android.libraries.search.video.p3194d.C41500k;
import com.google.android.libraries.search.video.players.C41592w;

/* renamed from: com.google.android.libraries.search.video.b.i */
/* compiled from: PG */
public final /* synthetic */ class C41465i implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C41592w f108307a;

    /* renamed from: b */
    public final /* synthetic */ C41478a f108308b;

    /* renamed from: c */
    public final /* synthetic */ FrameLayout f108309c;

    /* renamed from: d */
    public final /* synthetic */ C41500k f108310d;

    public /* synthetic */ C41465i(C41592w wVar, C41478a aVar, FrameLayout frameLayout, C41500k kVar) {
        this.f108307a = wVar;
        this.f108308b = aVar;
        this.f108309c = frameLayout;
        this.f108310d = kVar;
    }

    public final void run() {
        C41592w wVar = this.f108307a;
        C41478a aVar = this.f108308b;
        FrameLayout frameLayout = this.f108309c;
        C41500k kVar = this.f108310d;
        wVar.mo44086i();
        aVar.mo43997e(frameLayout, wVar, kVar);
    }
}
