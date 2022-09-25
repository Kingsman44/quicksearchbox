package com.bumptech.glide.load.p297b;

import android.content.res.AssetManager;
import android.net.Uri;
import com.bumptech.glide.load.C5960s;
import com.bumptech.glide.p290g.C5602e;
import java.util.Collections;

/* renamed from: com.bumptech.glide.load.b.d */
/* compiled from: PG */
public final class C5796d implements C5764ap {

    /* renamed from: a */
    private final AssetManager f17389a;

    /* renamed from: b */
    private final C5735a f17390b;

    public C5796d(AssetManager assetManager, C5735a aVar) {
        this.f17389a = assetManager;
        this.f17390b = aVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C5763ao mo11928a(Object obj, int i, int i2, C5960s sVar) {
        Uri uri = (Uri) obj;
        String substring = uri.toString().substring(22);
        return new C5763ao(new C5602e(uri), Collections.emptyList(), this.f17390b.mo12248a(this.f17389a, substring));
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo11929b(Object obj) {
        Uri uri = (Uri) obj;
        if (!"file".equals(uri.getScheme()) || uri.getPathSegments().isEmpty() || !"android_asset".equals(uri.getPathSegments().get(0))) {
            return false;
        }
        return true;
    }
}
