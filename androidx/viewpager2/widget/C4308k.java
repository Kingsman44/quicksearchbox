package androidx.viewpager2.widget;

import android.support.p033v7.widget.C0654fp;
import android.support.p033v7.widget.C0655fq;
import android.view.View;

/* renamed from: androidx.viewpager2.widget.k */
/* compiled from: PG */
final class C4308k implements C0655fq {
    /* renamed from: a */
    public final void mo2457a(View view) {
        C0654fp fpVar = (C0654fp) view.getLayoutParams();
        if (fpVar.width != -1 || fpVar.height != -1) {
            throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
        }
    }

    /* renamed from: b */
    public final void mo2458b(View view) {
    }
}
