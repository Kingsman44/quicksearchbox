package com.google.android.libraries.notifications.platform.p2318f.p2325c.p2326a.p2327a;

import com.bumptech.glide.load.p297b.C5752ad;
import com.google.android.libraries.notifications.platform.p2307a.C30058b;

/* renamed from: com.google.android.libraries.notifications.platform.f.c.a.a.b */
/* compiled from: PG */
public final /* synthetic */ class C30129b implements C5752ad {

    /* renamed from: a */
    public final /* synthetic */ C30130c f81497a;

    /* renamed from: b */
    public final /* synthetic */ String f81498b;

    /* renamed from: c */
    public final /* synthetic */ String f81499c;

    public /* synthetic */ C30129b(C30130c cVar, String str, String str2) {
        this.f81497a = cVar;
        this.f81498b = str;
        this.f81499c = str2;
    }

    /* renamed from: a */
    public final String mo12254a() {
        C30130c cVar = this.f81497a;
        String str = this.f81498b;
        String str2 = this.f81499c;
        try {
            String a = cVar.f81500a.mo35515a(str, "oauth2:https://www.googleapis.com/auth/photos.image.readonly").mo35514a();
            return "Bearer " + a;
        } catch (Exception e) {
            C30058b.m55792d("GlideMediaFetcherImpl", e, "Error authenticating image request. url: %s", str2);
            return null;
        }
    }
}
