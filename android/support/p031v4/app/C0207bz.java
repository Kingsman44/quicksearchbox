package android.support.p031v4.app;

import android.view.View;
import androidx.core.p098j.C2043bi;

/* renamed from: android.support.v4.app.bz */
/* compiled from: PG */
final class C0207bz implements View.OnAttachStateChangeListener {

    /* renamed from: a */
    final /* synthetic */ View f784a;

    public C0207bz(View view) {
        this.f784a = view;
    }

    public final void onViewAttachedToWindow(View view) {
        this.f784a.removeOnAttachStateChangeListener(this);
        C2043bi.m5524R(this.f784a);
    }

    public final void onViewDetachedFromWindow(View view) {
    }
}
