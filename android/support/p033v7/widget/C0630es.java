package android.support.p033v7.widget;

import android.widget.PopupWindow;
import com.google.android.libraries.web.contrib.p3375f.p3376a.C43534b;

/* renamed from: android.support.v7.widget.es */
/* compiled from: PG */
final class C0630es implements PopupWindow.OnDismissListener {

    /* renamed from: a */
    final /* synthetic */ C0632eu f2393a;

    public C0630es(C0632eu euVar) {
        this.f2393a = euVar;
    }

    public final void onDismiss() {
        C0632eu euVar = this.f2393a;
        C43534b bVar = euVar.f2397d;
        if (bVar != null) {
            bVar.f113683a.mo33911e(euVar);
        }
    }
}
