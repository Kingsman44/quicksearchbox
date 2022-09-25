package com.google.android.apps.gsa.search.shared.media;

import android.content.ComponentName;
import android.os.Bundle;
import android.support.p031v4.media.MediaBrowserCompat;
import com.google.android.libraries.gsa.p1876k.C22870f;

/* renamed from: com.google.android.apps.gsa.search.shared.media.e */
/* compiled from: PG */
public final /* synthetic */ class C87581e implements C22870f {

    /* renamed from: a */
    public final /* synthetic */ C87583g f236623a;

    /* renamed from: b */
    public final /* synthetic */ String f236624b;

    /* renamed from: c */
    public final /* synthetic */ String f236625c;

    public /* synthetic */ C87581e(C87583g gVar, String str, String str2) {
        this.f236623a = gVar;
        this.f236624b = str;
        this.f236625c = str2;
    }

    public final void run() {
        C87583g gVar = this.f236623a;
        gVar.f236628c = new MediaBrowserCompat(gVar.f236627b, new ComponentName(this.f236624b, this.f236625c), new C87582f(), (Bundle) null);
        if (!gVar.f236628c.mo805i()) {
            gVar.f236628c.mo800d();
        }
    }
}
