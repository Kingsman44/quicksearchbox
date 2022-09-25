package com.google.android.apps.gsa.staticplugins.opa.tapas.shared;

import android.graphics.drawable.Drawable;
import android.util.LruCache;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.fc */
/* compiled from: PG */
final class C113422fc extends LruCache {
    public C113422fc() {
        super(4194304);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ int sizeOf(Object obj, Object obj2) {
        String str = (String) obj;
        Drawable drawable = (Drawable) obj2;
        return drawable.getIntrinsicWidth() * drawable.getIntrinsicWidth() * 4;
    }
}
