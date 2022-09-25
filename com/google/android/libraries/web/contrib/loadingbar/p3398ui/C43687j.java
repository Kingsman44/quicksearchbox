package com.google.android.libraries.web.contrib.loadingbar.p3398ui;

import android.widget.ProgressBar;
import com.google.android.libraries.p10982ad.C147446j;
import com.google.android.libraries.p10982ad.C147454r;

/* renamed from: com.google.android.libraries.web.contrib.loadingbar.ui.j */
/* compiled from: PG */
public final class C43687j {

    /* renamed from: d */
    private static final C147454r f113985d = new C147454r(300.0f, 2.0f);

    /* renamed from: e */
    private static final C147454r f113986e = new C147454r(300.0f, 1.0f);

    /* renamed from: a */
    public final C147446j f113987a;

    /* renamed from: b */
    public final C147446j f113988b;

    /* renamed from: c */
    int f113989c = 10;

    /* renamed from: f */
    private final ProgressBar f113990f;

    /* renamed from: g */
    private boolean f113991g = true;

    public C43687j(LoadingBarView loadingBarView) {
        C147446j jVar = new C147446j(1.0f);
        this.f113987a = jVar;
        C147446j jVar2 = new C147446j(0.0f);
        this.f113988b = jVar2;
        this.f113990f = loadingBarView;
        loadingBarView.setMax(1000);
        jVar2.mo124188n(new C43683f(this, loadingBarView));
        C147454r rVar = f113985d;
        jVar2.f397996b = rVar;
        jVar.mo124188n(new C43684g(this, loadingBarView));
        jVar.f397996b = rVar;
    }

    /* renamed from: a */
    public final void mo46701a(int i) {
        if (!this.f113991g || i != 100) {
            this.f113991g = false;
            int max = Math.max(i, this.f113989c) * 10;
            float f = (float) max;
            if (this.f113988b.mo124176b() != f) {
                if (max == 1000) {
                    this.f113988b.mo124184j(new C43686i(this)).mo124173c(f113986e).mo124174a(1000.0f);
                    return;
                }
                this.f113990f.setVisibility(0);
                this.f113987a.mo124186l(1.0f);
                if (max > this.f113990f.getProgress()) {
                    this.f113988b.mo124179e(f);
                } else {
                    this.f113988b.mo124186l(f);
                }
            }
        } else {
            mo46702b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo46702b() {
        this.f113990f.setVisibility(8);
        this.f113987a.mo124186l(1.0f);
        this.f113988b.mo124186l(0.0f);
    }
}
