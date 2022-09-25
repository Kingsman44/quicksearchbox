package com.google.android.libraries.assistant.pcp.p1573k.p1574a;

import android.content.ComponentName;
import android.os.Bundle;
import android.support.p031v4.media.MediaBrowserCompat;
import androidx.p104d.p105a.C2164c;

/* renamed from: com.google.android.libraries.assistant.pcp.k.a.cv */
/* compiled from: PG */
public final /* synthetic */ class C18876cv implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C18887df f53139a;

    /* renamed from: b */
    public final /* synthetic */ ComponentName f53140b;

    /* renamed from: c */
    public final /* synthetic */ C2164c f53141c;

    /* renamed from: d */
    public final /* synthetic */ Bundle f53142d;

    public /* synthetic */ C18876cv(C18887df dfVar, ComponentName componentName, C2164c cVar, Bundle bundle) {
        this.f53139a = dfVar;
        this.f53140b = componentName;
        this.f53141c = cVar;
        this.f53142d = bundle;
    }

    public final void run() {
        C18887df dfVar = this.f53139a;
        ComponentName componentName = this.f53140b;
        C2164c cVar = this.f53141c;
        Bundle bundle = this.f53142d;
        C18878cx cxVar = new C18878cx(dfVar, cVar);
        MediaBrowserCompat mediaBrowserCompat = new MediaBrowserCompat(dfVar.f53162b, componentName, cxVar, bundle);
        cxVar.f53145c = mediaBrowserCompat;
        cxVar.mo24205d();
        mediaBrowserCompat.mo800d();
    }
}
