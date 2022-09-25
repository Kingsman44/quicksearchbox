package com.google.android.apps.gsa.opaonboarding.p6463ui.p6464a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import com.airbnb.lottie.C4963j;
import com.airbnb.lottie.C4964k;
import com.airbnb.lottie.C4972s;
import com.airbnb.lottie.LottieAnimationView;
import com.google.common.base.C58837ba;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.opaonboarding.ui.a.h */
/* compiled from: PG */
public final class C83966h {

    /* renamed from: a */
    public final LottieAnimationView f228750a;

    /* renamed from: b */
    public boolean f228751b;

    /* renamed from: c */
    private final List f228752c = new ArrayList();

    public C83966h(LottieAnimationView lottieAnimationView) {
        this.f228750a = lottieAnimationView;
    }

    /* renamed from: a */
    public final void mo77395a(C83960b bVar, boolean z) {
        bVar.mo77388g();
        bVar.mo77389h();
        C83965g gVar = new C83965g(bVar.mo77388g(), bVar.mo77389h(), bVar.mo77387f(), bVar.mo77384c(), bVar.mo77386e(), bVar.mo77385d(), z);
        String h = bVar.mo77389h();
        if (h != null) {
            C4972s.m13752j(this.f228750a.getContext(), h).mo9793e(new C83961c(gVar));
        } else {
            Context context = this.f228750a.getContext();
            String g = bVar.mo77388g();
            C4972s.m13748f(context, g).mo9793e(new C4963j(new C83962d(gVar)));
        }
        this.f228752c.add(gVar);
    }

    /* renamed from: b */
    public final void mo77396b() {
        Integer num;
        Drawable drawable;
        NetworkCapabilities networkCapabilities;
        if (this.f228751b) {
            this.f228750a.mo9697h();
        } else if (!this.f228752c.isEmpty()) {
            C83965g gVar = (C83965g) this.f228752c.remove(0);
            boolean z = gVar.f228746e;
            C4964k kVar = gVar.f228749h;
            if (kVar != null) {
                this.f228750a.mo9703m(kVar);
            } else if (gVar.f228743b != null) {
                int i = gVar.f228745d;
                ConnectivityManager connectivityManager = (ConnectivityManager) this.f228750a.getContext().getSystemService("connectivity");
                boolean z2 = true;
                if (!(connectivityManager == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork())) == null || networkCapabilities.getLinkDownstreamBandwidthKbps() < i)) {
                    z2 = false;
                }
                Integer num2 = gVar.f228747f;
                if (num2 != null) {
                    if (z2) {
                        this.f228750a.setImageResource(num2.intValue());
                    } else {
                        this.f228750a.f15137c = num2.intValue();
                    }
                }
                if (z2 && (drawable = gVar.f228748g) != null) {
                    this.f228750a.setImageDrawable(drawable);
                }
                if (z2 && !C58837ba.m90859h(gVar.f228742a)) {
                    this.f228750a.mo9700j(gVar.f228742a);
                } else if (!z2 || (num = gVar.f228744c) == null) {
                    this.f228750a.mo9702l(gVar.f228743b);
                } else {
                    this.f228750a.mo9698i(num.intValue());
                }
            } else {
                Integer num3 = gVar.f228744c;
                if (num3 != null) {
                    this.f228750a.mo9698i(num3.intValue());
                } else {
                    this.f228750a.mo9700j(gVar.f228742a);
                }
            }
            this.f228750a.mo9693d(z);
            this.f228750a.f15138d.mo9773j(0.0f);
            this.f228750a.post(new C83963e(this));
        }
        this.f228751b = false;
    }

    /* renamed from: c */
    public final void mo77397c() {
        this.f228750a.mo9693d(false);
    }
}
