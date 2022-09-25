package androidx.viewpager2.adapter;

import android.view.View;
import android.widget.FrameLayout;

/* renamed from: androidx.viewpager2.adapter.a */
/* compiled from: PG */
final class C4286a implements View.OnLayoutChangeListener {

    /* renamed from: a */
    final /* synthetic */ FrameLayout f13876a;

    /* renamed from: b */
    final /* synthetic */ C4296k f13877b;

    /* renamed from: c */
    final /* synthetic */ FragmentStateAdapter f13878c;

    public C4286a(FragmentStateAdapter fragmentStateAdapter, FrameLayout frameLayout, C4296k kVar) {
        this.f13878c = fragmentStateAdapter;
        this.f13876a = frameLayout;
        this.f13877b = kVar;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.f13876a.getParent() != null) {
            this.f13876a.removeOnLayoutChangeListener(this);
            this.f13878c.mo9194d(this.f13877b);
        }
    }
}
