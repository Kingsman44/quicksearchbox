package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b.C33259r;
import java.io.FileNotFoundException;

/* renamed from: com.bumptech.glide.load.data.a */
/* compiled from: PG */
public final class C5920a extends C5942q {
    public C5920a(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    /* renamed from: b */
    public final Class mo11922b() {
        return AssetFileDescriptor.class;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ Object mo12377f(Uri uri, ContentResolver contentResolver) {
        AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, C33259r.f88929b);
        if (openAssetFileDescriptor != null) {
            return openAssetFileDescriptor;
        }
        throw new FileNotFoundException("FileDescriptor is null for: ".concat(String.valueOf(String.valueOf(uri))));
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final /* synthetic */ void mo12378g(Object obj) {
        ((AssetFileDescriptor) obj).close();
    }
}
