package com.google.android.libraries.lens.view.livingsurfaces;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.livingsurfaces.p2150ui.LivingSurfaceAudioButton;
import com.google.android.libraries.lens.view.livingsurfaces.p2150ui.PlanarGleamAttributionView;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4522b.C58758qx;
import java.util.Set;

/* renamed from: com.google.android.libraries.lens.view.livingsurfaces.o */
/* compiled from: PG */
public final class C27256o implements C27251j {

    /* renamed from: a */
    private final C47770dh f74555a;

    /* renamed from: b */
    private final Set f74556b = C58758qx.m90653k();

    /* renamed from: c */
    private C58833ax f74557c = C58836b.f156633a;

    /* renamed from: d */
    private LivingSurfaceAudioButton f74558d;

    /* renamed from: e */
    private ViewGroup f74559e;

    /* renamed from: f */
    private PlanarGleamAttributionView f74560f;

    /* renamed from: g */
    private Runnable f74561g = C27253l.f74551a;

    public C27256o(C47770dh dhVar) {
        this.f74555a = dhVar;
    }

    /* renamed from: k */
    private final void m50723k() {
        String a;
        PlanarGleamAttributionView planarGleamAttributionView;
        if (this.f74559e != null) {
            C58833ax c = C58557jl.m90122c(this.f74556b, C27252k.f74550a);
            if (!this.f74557c.equals(c)) {
                if (this.f74557c.mo56113h() && (planarGleamAttributionView = this.f74560f) != null) {
                    this.f74559e.removeView(planarGleamAttributionView);
                    this.f74560f = null;
                }
                if (c.mo56113h()) {
                    C27250i iVar = (C27250i) c.mo56107c();
                    if (!(this.f74559e == null || (a = iVar.mo32757a()) == null)) {
                        PlanarGleamAttributionView planarGleamAttributionView2 = (PlanarGleamAttributionView) LayoutInflater.from(this.f74559e.getContext()).inflate(R.layout.planar_gleam_attribution_view, this.f74559e, false);
                        this.f74559e.addView(planarGleamAttributionView2);
                        planarGleamAttributionView2.mo17754z().mo32792a(this.f74559e.getRootWindowInsets());
                        planarGleamAttributionView2.mo17754z().mo32794c(a, iVar.mo32758b());
                        this.f74560f = planarGleamAttributionView2;
                    }
                }
                this.f74557c = c;
            }
        }
    }

    /* renamed from: l */
    private final void m50724l() {
        if (this.f74558d != null) {
            boolean s = C58557jl.m90138s(this.f74556b, C27255n.f74554a);
            if (s != (this.f74558d.getVisibility() == 0)) {
                if (s) {
                    this.f74558d.mo48051g(0, true);
                    this.f74558d.setAlpha(0.0f);
                    this.f74558d.animate().alpha(1.0f).setDuration(250);
                    return;
                }
                this.f74558d.mo48051g(8, true);
            }
        }
    }

    /* renamed from: a */
    public final void mo32776a(C27250i iVar) {
        if (this.f74558d == null) {
            this.f74561g.run();
        }
        this.f74556b.add(iVar);
        m50724l();
        m50723k();
    }

    /* renamed from: b */
    public final void mo32777b(Runnable runnable) {
        this.f74561g = runnable;
    }

    /* renamed from: c */
    public final void mo32778c() {
        mo32783h(true);
        for (C27250i c : this.f74556b) {
            c.mo32759c();
        }
        this.f74556b.clear();
        m50724l();
        m50723k();
    }

    /* renamed from: d */
    public final void mo32779d() {
        m50724l();
        m50723k();
    }

    /* renamed from: e */
    public final void mo32780e(C27250i iVar) {
        this.f74556b.remove(iVar);
        m50724l();
        m50723k();
    }

    /* renamed from: f */
    public final void mo32781f(ViewGroup viewGroup) {
        this.f74559e = viewGroup;
        m50723k();
    }

    /* renamed from: g */
    public final void mo32782g(LivingSurfaceAudioButton livingSurfaceAudioButton) {
        this.f74558d = livingSurfaceAudioButton;
        livingSurfaceAudioButton.setOnClickListener(new C47591co(this.f74555a, "Click living surface audio", new C27254m(this, livingSurfaceAudioButton)));
        livingSurfaceAudioButton.mo48051g(8, true);
        if (mo32784i()) {
            livingSurfaceAudioButton.mo48051g(0, true);
        }
    }

    /* renamed from: h */
    public final void mo32783h(boolean z) {
        for (C27250i d : this.f74556b) {
            d.mo32760d(z);
        }
        LivingSurfaceAudioButton livingSurfaceAudioButton = this.f74558d;
        if (livingSurfaceAudioButton != null) {
            livingSurfaceAudioButton.mo32788b(z);
        }
    }

    /* renamed from: i */
    public final boolean mo32784i() {
        return C58557jl.m90138s(this.f74556b, C27255n.f74554a);
    }

    /* renamed from: j */
    public final boolean mo32785j() {
        LivingSurfaceAudioButton livingSurfaceAudioButton = this.f74558d;
        if (livingSurfaceAudioButton != null) {
            return livingSurfaceAudioButton.f74565a;
        }
        return true;
    }
}
