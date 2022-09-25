package com.google.android.apps.gsa.search.shared.media;

import android.content.ComponentName;
import android.os.Bundle;
import android.support.p031v4.media.MediaBrowserCompat;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.search.shared.media.k */
/* compiled from: PG */
public final /* synthetic */ class C87587k implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C87594r f236634a;

    /* renamed from: b */
    public final /* synthetic */ ComponentName f236635b;

    public /* synthetic */ C87587k(C87594r rVar, ComponentName componentName) {
        this.f236634a = rVar;
        this.f236635b = componentName;
    }

    public final void run() {
        C87594r rVar = this.f236634a;
        ComponentName componentName = this.f236635b;
        C87592p pVar = new C87592p(rVar);
        MediaBrowserCompat mediaBrowserCompat = new MediaBrowserCompat(rVar.f236649b, componentName, pVar, (Bundle) null);
        pVar.f236643c = mediaBrowserCompat;
        pVar.mo81720d();
        mediaBrowserCompat.mo800d();
    }
}
