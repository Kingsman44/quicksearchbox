package com.google.android.libraries.search.assistant.performer.p2757g.p2758a;

import android.content.ComponentName;
import android.os.Bundle;
import android.support.p031v4.media.MediaBrowserCompat;
import androidx.p104d.p105a.C2164c;

/* renamed from: com.google.android.libraries.search.assistant.performer.g.a.g */
/* compiled from: PG */
public final /* synthetic */ class C36024g implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C36029l f94235a;

    /* renamed from: b */
    public final /* synthetic */ C2164c f94236b;

    /* renamed from: c */
    public final /* synthetic */ ComponentName f94237c;

    public /* synthetic */ C36024g(C36029l lVar, C2164c cVar, ComponentName componentName) {
        this.f94235a = lVar;
        this.f94236b = cVar;
        this.f94237c = componentName;
    }

    public final void run() {
        C36029l lVar = this.f94235a;
        C2164c cVar = this.f94236b;
        ComponentName componentName = this.f94237c;
        C36028k kVar = new C36028k(lVar, cVar);
        MediaBrowserCompat mediaBrowserCompat = new MediaBrowserCompat(lVar.f94247b, componentName, kVar, (Bundle) null);
        kVar.f94243d = mediaBrowserCompat;
        mediaBrowserCompat.mo800d();
    }
}
