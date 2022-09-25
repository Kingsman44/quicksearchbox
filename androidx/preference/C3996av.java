package androidx.preference;

import android.os.Bundle;
import android.support.p033v7.widget.C0640fb;
import android.view.View;
import androidx.core.p098j.C2061c;
import androidx.core.p098j.p099a.C1991k;

/* renamed from: androidx.preference.av */
/* compiled from: PG */
final class C3996av extends C2061c {

    /* renamed from: a */
    final /* synthetic */ C3997aw f12840a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3996av(C3997aw awVar) {
        super(C2061c.DEFAULT_DELEGATE);
        this.f12840a = awVar;
    }

    public final void onInitializeAccessibilityNodeInfo(View view, C1991k kVar) {
        this.f12840a.f12842d.onInitializeAccessibilityNodeInfo(view, kVar);
        int childAdapterPosition = this.f12840a.f12841c.getChildAdapterPosition(view);
        C0640fb fbVar = this.f12840a.f12841c.mAdapter;
        if (fbVar instanceof C3990ap) {
            ((C3990ap) fbVar).mo8426d(childAdapterPosition);
        }
    }

    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return this.f12840a.f12842d.performAccessibilityAction(view, i, bundle);
    }
}
