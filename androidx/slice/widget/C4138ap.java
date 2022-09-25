package androidx.slice.widget;

import android.view.View;

/* renamed from: androidx.slice.widget.ap */
/* compiled from: PG */
final class C4138ap implements Runnable {

    /* renamed from: a */
    final /* synthetic */ SliceView f13321a;

    public C4138ap(SliceView sliceView) {
        this.f13321a = sliceView;
    }

    public final void run() {
        View.OnLongClickListener onLongClickListener;
        SliceView sliceView = this.f13321a;
        if (sliceView.f13204k && (onLongClickListener = sliceView.f13197d) != null) {
            sliceView.f13205l = true;
            onLongClickListener.onLongClick(sliceView);
            this.f13321a.performHapticFeedback(0);
        }
    }
}
