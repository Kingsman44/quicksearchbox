package com.bumptech.glide.load.data;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;

/* renamed from: com.bumptech.glide.load.data.l */
/* compiled from: PG */
public final class C5937l extends C5927b {
    public C5937l(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    /* renamed from: b */
    public final Class mo11922b() {
        return AssetFileDescriptor.class;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final /* synthetic */ Object mo12380f(AssetManager assetManager, String str) {
        return assetManager.openFd(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final /* synthetic */ void mo12381g(Object obj) {
        ((AssetFileDescriptor) obj).close();
    }
}
