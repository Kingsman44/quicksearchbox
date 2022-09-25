package androidx.p198v.p199a.p200a;

import android.graphics.drawable.Drawable;

/* renamed from: androidx.v.a.a.d */
/* compiled from: PG */
final class C4245d implements Drawable.Callback {

    /* renamed from: a */
    final /* synthetic */ C4250i f13690a;

    public C4245d(C4250i iVar) {
        this.f13690a = iVar;
    }

    public final void invalidateDrawable(Drawable drawable) {
        this.f13690a.invalidateSelf();
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        this.f13690a.scheduleSelf(runnable, j);
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        this.f13690a.unscheduleSelf(runnable);
    }
}
