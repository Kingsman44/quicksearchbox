package com.bumptech.glide;

import android.content.Context;
import android.util.Log;
import com.bumptech.glide.manager.C5985q;
import com.google.apps.tiktok.media.TikTokAppGlideModule;
import java.util.Collections;
import java.util.Set;

/* compiled from: PG */
final class GeneratedAppGlideModuleImpl extends GeneratedAppGlideModule {

    /* renamed from: a */
    private final TikTokAppGlideModule f16649a = new TikTokAppGlideModule();

    public GeneratedAppGlideModuleImpl(Context context) {
        if (Log.isLoggable("Glide", 3)) {
            Log.d("Glide", "Discovered AppGlideModule from annotation: com.google.apps.tiktok.media.TikTokAppGlideModule");
        }
    }

    /* renamed from: a */
    public final /* synthetic */ C5985q mo11834a() {
        return new C5501a();
    }

    /* renamed from: b */
    public final Set mo11835b() {
        return Collections.emptySet();
    }

    /* renamed from: c */
    public final void mo11836c(Context context, C5635k kVar) {
        this.f16649a.mo11836c(context, kVar);
    }

    /* renamed from: d */
    public final void mo11837d(Context context, C5543d dVar, C6003v vVar) {
        this.f16649a.mo11837d(context, dVar, vVar);
    }

    /* renamed from: e */
    public final boolean mo11838e() {
        return true;
    }
}
