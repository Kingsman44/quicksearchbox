package com.google.android.apps.search.googleapp.googleappbrowser.feature.p10284b;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.search.googleapp.p10318i.C136213b;
import com.google.android.apps.search.googleapp.p10318i.C136216e;
import com.google.android.apps.search.googleapp.p10318i.C136217f;
import com.google.android.apps.search.googleapp.p10318i.C136219h;
import com.google.android.apps.search.googleapp.p10318i.C136220i;
import com.google.android.apps.search.googleapp.p10318i.C136222k;
import com.google.android.apps.search.googleapp.p10318i.C136224m;
import com.google.android.apps.search.googleapp.p10318i.C136225n;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.web.base.C43262m;
import com.google.android.libraries.web.contrib.errorpage.C43514b;
import com.google.android.libraries.web.contrib.errorpage.C43516d;
import com.google.android.libraries.web.contrib.errorpage.C43531s;
import com.google.android.libraries.web.p3353c.C43363h;
import com.google.android.libraries.web.p3353c.C43376u;
import com.google.android.material.button.MaterialButton;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.b.f */
/* compiled from: PG */
public final class C135719f implements C43516d {

    /* renamed from: c */
    private static final C59071e f369668c = C59071e.m91332i("com.google.android.apps.search.googleapp.googleappbrowser.feature.b.f");

    /* renamed from: a */
    public final C43531s f369669a;

    /* renamed from: b */
    public final C43262m f369670b;

    /* renamed from: d */
    private final C135715b f369671d;

    /* renamed from: e */
    private final C136220i f369672e;

    /* renamed from: f */
    private final C136213b f369673f;

    /* renamed from: g */
    private final boolean f369674g;

    /* renamed from: h */
    private final C136225n f369675h;

    /* renamed from: i */
    private final C47770dh f369676i;

    /* renamed from: j */
    private final C28306ab f369677j;

    /* renamed from: k */
    private C136219h f369678k;

    public C135719f(C135715b bVar, C136220i iVar, C43531s sVar, C136213b bVar2, boolean z, C136225n nVar, C47770dh dhVar, C28306ab abVar, C43262m mVar) {
        this.f369671d = bVar;
        this.f369669a = sVar;
        this.f369672e = iVar;
        this.f369673f = bVar2;
        this.f369674g = z;
        this.f369675h = nVar;
        this.f369676i = dhVar;
        this.f369677j = abVar;
        this.f369670b = mVar;
    }

    /* renamed from: c */
    private static void m220176c(LottieAnimationView lottieAnimationView, int i) {
        ViewGroup.LayoutParams layoutParams = lottieAnimationView.getLayoutParams();
        int dimensionPixelSize = lottieAnimationView.getContext().getResources().getDimensionPixelSize(i);
        layoutParams.width = dimensionPixelSize;
        layoutParams.height = dimensionPixelSize;
        lottieAnimationView.setLayoutParams(layoutParams);
    }

    /* renamed from: d */
    private final void m220177d(C136219h hVar) {
        View view = this.f369671d.getView();
        if (view != null) {
            C59052c cVar = (C59052c) ((C59052c) f369668c.mo56226d()).mo56372aa(40603);
            int a = C136222k.m221355a(hVar.f370980b);
            if (a == 0) {
                a = 1;
            }
            cVar.mo56387q("Showing error card for type: %d", a - 1);
            this.f369678k = hVar;
            TextView textView = (TextView) view.findViewById(R.id.googleapp_browser_errorcard_title);
            if ((hVar.f370979a & 2) != 0) {
                textView.setVisibility(0);
                textView.setText(hVar.f370981c);
            } else {
                textView.setVisibility(8);
            }
            TextView textView2 = (TextView) view.findViewById(R.id.googleapp_browser_errorcard_explanation);
            if ((hVar.f370979a & 4) != 0) {
                textView2.setVisibility(0);
                textView2.setText(hVar.f370982d);
            } else {
                textView2.setVisibility(8);
            }
            C136225n nVar = this.f369675h;
            LottieAnimationView lottieAnimationView = (LottieAnimationView) view.findViewById(R.id.googleapp_browser_errorcard_animation);
            ImageView imageView = (ImageView) view.findViewById(R.id.googleapp_browser_errorcard_icon);
            int i = hVar.f370979a;
            if ((i & 16) != 0) {
                imageView.setVisibility(8);
                lottieAnimationView.setVisibility(0);
                int a2 = C136222k.m221355a(hVar.f370980b);
                if (a2 != 0 && a2 == 11) {
                    m220176c(lottieAnimationView, R.dimen.googleapp_browser_width_errorcard_small_puffy);
                    lottieAnimationView.setOnClickListener((View.OnClickListener) null);
                } else {
                    m220176c(lottieAnimationView, R.dimen.googleapp_browser_width_errorcard_content);
                    lottieAnimationView.setOnClickListener(new C135716c(nVar));
                }
                C136224m b = C136224m.m221358b(hVar.f370985g);
                lottieAnimationView.mo9700j(b.f371000h);
                lottieAnimationView.f15138d.mo9763g(0);
                lottieAnimationView.f15138d.mo9768h(0, Integer.MAX_VALUE);
                lottieAnimationView.f15138d.f15342b.setRepeatCount(-1);
                lottieAnimationView.f15138d.f15342b.removeAllListeners();
                if (b.mo112850a() != null) {
                    lottieAnimationView.mo9689a(new C135718e(lottieAnimationView));
                }
                lottieAnimationView.mo9695f();
            } else if ((i & 8) != 0) {
                lottieAnimationView.setVisibility(8);
                imageView.setVisibility(0);
                imageView.setImageResource(hVar.f370983e);
            } else {
                imageView.setVisibility(8);
                lottieAnimationView.setVisibility(8);
            }
            if ((hVar.f370979a & 32) != 0) {
                C28306ab abVar = this.f369677j;
                abVar.mo33803d(view, abVar.f76990a.mo33805a(C28427h.m53115a(hVar.f370986h)));
            }
            if (!hVar.f370984f.isEmpty()) {
                C136216e a3 = C136216e.m221349a(((C136217f) hVar.f370984f.get(0)).f370973b);
                if (a3 == null) {
                    a3 = C136216e.GRANT_MIC_PERMISSION;
                }
                if (a3 == C136216e.REFRESH) {
                    C136217f fVar = (C136217f) hVar.f370984f.get(0);
                    MaterialButton materialButton = (MaterialButton) view.findViewById(R.id.googleapp_browser_errorcard_button);
                    materialButton.setVisibility(0);
                    if ((fVar.f370972a & 2) != 0) {
                        materialButton.setText(fVar.f370974c);
                    }
                    if ((fVar.f370972a & 4) != 0) {
                        materialButton.mo47553j(fVar.f370975d);
                    }
                    if ((fVar.f370972a & 8) != 0) {
                        C28306ab abVar2 = this.f369677j;
                        abVar2.mo33801b(materialButton, abVar2.f76990a.mo33805a(C28427h.m53115a(fVar.f370976e)));
                    }
                    materialButton.setOnClickListener(new C47591co(this.f369676i, "reload after renderer gone error", new C135717d(this)));
                    return;
                }
            }
            view.findViewById(R.id.googleapp_browser_errorcard_button).setVisibility(8);
        }
    }

    /* renamed from: a */
    public final void mo46581a() {
        View view = this.f369671d.getView();
        if (view != null && this.f369678k != null) {
            View findViewById = view.findViewById(R.id.googleapp_browser_errorcard_button);
            if (findViewById.getVisibility() == 0) {
                C136219h hVar = this.f369678k;
                hVar.getClass();
                if ((((C136217f) hVar.f370984f.get(0)).f370972a & 8) != 0) {
                    C28306ab.m52929e(findViewById);
                }
            }
            C136219h hVar2 = this.f369678k;
            hVar2.getClass();
            if ((hVar2.f370979a & 32) != 0) {
                C28306ab.m52929e(view);
            }
            this.f369678k = null;
        }
    }

    /* renamed from: b */
    public final /* synthetic */ void mo46582b(C43376u uVar, Optional optional) {
        if (C43514b.m76781b(uVar) == C43514b.RENDERER_GONE) {
            m220177d(this.f369673f.mo112846a(11, this.f369674g, false));
            return;
        }
        C136213b bVar = this.f369673f;
        C136220i iVar = this.f369672e;
        C43363h hVar = uVar.f113331d;
        if (hVar == null) {
            hVar = C43363h.f113275f;
        }
        m220177d(bVar.mo112846a(iVar.mo112849a(hVar), this.f369674g, false));
    }
}
