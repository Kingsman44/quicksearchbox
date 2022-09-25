package androidx.media3.p174ui;

import android.graphics.Bitmap;

/* renamed from: androidx.media3.ui.k */
/* compiled from: PG */
public final class C3647k {

    /* renamed from: a */
    final /* synthetic */ C3652p f11710a;

    /* renamed from: b */
    private final int f11711b;

    public C3647k(C3652p pVar, int i) {
        this.f11710a = pVar;
        this.f11711b = i;
    }

    /* renamed from: a */
    public final void mo7690a(Bitmap bitmap) {
        if (bitmap != null) {
            C3652p pVar = this.f11710a;
            pVar.f11724a.obtainMessage(1, this.f11711b, -1, bitmap).sendToTarget();
        }
    }
}
