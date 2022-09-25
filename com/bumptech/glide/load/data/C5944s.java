package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.data.s */
/* compiled from: PG */
public final class C5944s extends C5927b {
    public C5944s(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    /* renamed from: b */
    public final Class mo11922b() {
        return InputStream.class;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final /* synthetic */ Object mo12380f(AssetManager assetManager, String str) {
        return assetManager.open(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final /* synthetic */ void mo12381g(Object obj) {
        ((InputStream) obj).close();
    }
}
