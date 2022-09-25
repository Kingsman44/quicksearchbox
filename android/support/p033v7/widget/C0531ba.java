package android.support.p033v7.widget;

import android.view.ViewTreeObserver;
import androidx.core.p098j.C2043bi;

/* renamed from: android.support.v7.widget.ba */
/* compiled from: PG */
final class C0531ba implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ C0533bc f2098a;

    public C0531ba(C0533bc bcVar) {
        this.f2098a = bcVar;
    }

    public final void onGlobalLayout() {
        C0533bc bcVar = this.f2098a;
        AppCompatSpinner appCompatSpinner = bcVar.f2104d;
        if (!C2043bi.m5569aw(appCompatSpinner) || !appCompatSpinner.getGlobalVisibleRect(bcVar.f2103c)) {
            this.f2098a.mo1575m();
            return;
        }
        this.f2098a.mo2563n();
        C0531ba.super.mo1576v();
    }
}
