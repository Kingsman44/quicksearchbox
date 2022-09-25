package com.google.android.libraries.lens.view.feedback;

import android.graphics.Bitmap;
import android.view.PixelCopy;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.libraries.lens.view.feedback.aa */
/* compiled from: PG */
final class C25808aa implements PixelCopy.OnPixelCopyFinishedListener {

    /* renamed from: a */
    final /* synthetic */ SettableFuture f70120a;

    /* renamed from: b */
    final /* synthetic */ Bitmap f70121b;

    public C25808aa(SettableFuture settableFuture, Bitmap bitmap) {
        this.f70120a = settableFuture;
        this.f70121b = bitmap;
    }

    public final void onPixelCopyFinished(int i) {
        if (i == 0) {
            this.f70120a.mo57356n(this.f70121b);
        } else {
            this.f70120a.mo57356n((Object) null);
        }
    }
}
