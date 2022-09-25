package com.google.android.libraries.web.contrib.fullscreen.internal;

import android.support.p031v4.app.C0167am;
import android.support.p031v4.app.Fragment;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.C2391v;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.web.base.C43269t;
import com.google.android.libraries.web.p3407g.C43773b;
import com.google.android.libraries.web.p3420k.C43861g;
import com.google.android.libraries.web.shared.lifecycle.WebModelProvider;
import com.google.android.libraries.web.shared.p3443c.C44082a;
import com.google.common.base.C58893dc;
import java.util.Map;
import p3186j$.util.function.Supplier;
import p5460g.p5461a.C69464a;

/* compiled from: PG */
public final class FullScreenWebFragmentObserver implements C43773b, C43558a {

    /* renamed from: a */
    private final C43861g f113729a;

    /* renamed from: b */
    private C43558a f113730b;

    /* renamed from: c */
    private View f113731c;

    /* renamed from: d */
    private int f113732d;

    public FullScreenWebFragmentObserver(C43861g gVar, C43269t tVar, Map map) {
        this.f113729a = gVar;
        C69464a aVar = (C69464a) map.get(tVar.mo46385c());
        if (aVar != null) {
            this.f113730b = (C43558a) aVar.mo17428b();
        }
    }

    /* renamed from: i */
    private final int m76868i(int i) {
        C0167am activity = this.f113729a.getActivity();
        if (activity == null) {
            return 0;
        }
        View decorView = activity.getWindow().getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(i);
        return systemUiVisibility;
    }

    /* renamed from: j */
    private final ViewGroup m76869j() {
        ViewGroup viewGroup = (ViewGroup) this.f113729a.requireActivity().findViewById(16908290);
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            if (viewGroup.getChildAt(i).getId() == R.id.webx_full_screen_container) {
                return (ViewGroup) viewGroup.getChildAt(i);
            }
        }
        FrameLayout frameLayout = new FrameLayout(this.f113729a.requireActivity());
        frameLayout.setId(R.id.webx_full_screen_container);
        frameLayout.setBackgroundColor(-16777216);
        viewGroup.addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    /* renamed from: k */
    private final C43560b m76870k() {
        return (C43560b) new WebModelProvider((Fragment) this.f113729a).mo47072a(C43560b.class);
    }

    /* renamed from: g */
    public final void mo46619g() {
        this.f113731c = null;
        this.f113729a.mo17754z().mo46873a(C44082a.f114755a).mo46404c();
        m76868i(this.f113732d);
        ViewGroup j = m76869j();
        j.removeAllViews();
        j.setVisibility(8);
        C43558a aVar = this.f113730b;
        if (aVar != null) {
            aVar.mo46619g();
        }
    }

    /* renamed from: gV */
    public final /* synthetic */ void mo3520gV(C2391v vVar) {
    }

    /* renamed from: gW */
    public final void mo3521gW(C2391v vVar) {
        ViewGroup viewGroup;
        View view = this.f113731c;
        if (view != null && (viewGroup = (ViewGroup) view.getParent()) != null) {
            View view2 = this.f113731c;
            C58893dc.m90996a(view2);
            viewGroup.removeView(view2);
        }
    }

    /* renamed from: gX */
    public final /* synthetic */ void mo3522gX(C2391v vVar) {
    }

    /* renamed from: gY */
    public final void mo3523gY(C2391v vVar) {
        if (m76870k().mo46623g()) {
            m76868i(3846);
        }
    }

    /* renamed from: gZ */
    public final void mo3524gZ(C2391v vVar) {
        C43560b k = m76870k();
        boolean g = k.mo46623g();
        if (g != (this.f113731c != null)) {
            if (g) {
                Supplier supplier = k.f113737b;
                supplier.getClass();
                mo46620h((View) supplier.get());
            } else {
                mo46619g();
            }
        }
        k.f113736a = this;
    }

    /* renamed from: h */
    public final void mo46620h(View view) {
        this.f113731c = view;
        this.f113729a.mo17754z().mo46873a(C44082a.f114755a).mo46404c();
        C43558a aVar = this.f113730b;
        if (aVar != null) {
            aVar.mo46620h(view);
        }
        ViewGroup j = m76869j();
        j.addView(view, new FrameLayout.LayoutParams(-1, -1));
        j.setVisibility(0);
        this.f113732d = m76868i(3846);
        int i = m76870k().f113738c;
    }

    /* renamed from: ha */
    public final void mo3525ha(C2391v vVar) {
        m76870k().f113736a = null;
    }
}
