package com.google.android.libraries.lens.view.p2066aj;

import com.airbnb.lottie.LottieAnimationView;
import com.google.android.libraries.lens.view.flags.C26239a;
import com.google.android.libraries.lens.view.flags.C26244b;

/* renamed from: com.google.android.libraries.lens.view.aj.d */
/* compiled from: PG */
public final class C25192d {

    /* renamed from: a */
    public static final int[] f68611a = {48, 78, 108, 138, 168};

    /* renamed from: b */
    public static final int[] f68612b = {168, 200, 232, 264, 296};

    /* renamed from: c */
    public final C26244b f68613c;

    /* renamed from: d */
    public boolean f68614d;

    /* renamed from: e */
    public int f68615e;

    /* renamed from: f */
    public LottieAnimationView f68616f;

    public C25192d(C26244b bVar) {
        this.f68613c = bVar;
    }

    /* renamed from: a */
    public final void mo30335a(int i, int i2) {
        this.f68616f.f15138d.mo9768h(i, i2);
        this.f68616f.f15138d.mo9763g(i);
        this.f68616f.mo9695f();
    }

    /* renamed from: b */
    public final void mo30336b(boolean z) {
        LottieAnimationView lottieAnimationView = this.f68616f;
        lottieAnimationView.getClass();
        if (!z) {
            this.f68614d = false;
            if (this.f68613c.mo31462g(C26239a.THINKING_GLEAMS_LOADING_STATE)) {
                mo30337c();
                return;
            }
            return;
        }
        this.f68615e = 0;
        this.f68614d = true;
        lottieAnimationView.f15138d.f15342b.setRepeatCount(-1);
        this.f68616f.setVisibility(0);
        mo30335a(0, f68611a[0] - 1);
    }

    /* renamed from: c */
    public final void mo30337c() {
        this.f68616f.mo9694e();
        this.f68616f.setVisibility(8);
    }
}
