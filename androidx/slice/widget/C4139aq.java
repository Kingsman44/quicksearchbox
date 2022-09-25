package androidx.slice.widget;

import androidx.slice.C4110i;

/* renamed from: androidx.slice.widget.aq */
/* compiled from: PG */
final class C4139aq implements Runnable {

    /* renamed from: a */
    final /* synthetic */ SliceView f13322a;

    public C4139aq(SliceView sliceView) {
        this.f13322a = sliceView;
    }

    public final void run() {
        C4110i iVar = this.f13322a.f13199f;
        if (iVar != null && iVar.mo8621j()) {
            this.f13322a.f13196c.mo8702fu(true);
            SliceView sliceView = this.f13322a;
            sliceView.f13196c.mo8705fx(sliceView.f13195b);
        }
        this.f13322a.f13198e.postDelayed(this, 60000);
    }
}
