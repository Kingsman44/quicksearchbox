package com.google.android.libraries.onegoogle.popovercontainer;

import android.animation.ObjectAnimator;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.p033v7.app.C0359at;
import android.util.Property;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.core.p098j.C2043bi;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30306o;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30313v;
import com.google.android.libraries.onegoogle.accountmenu.p2353c.C30331a;
import com.google.android.libraries.onegoogle.accountmenu.p2377h.C30692r;
import com.google.android.libraries.onegoogle.accountmenu.p2377h.C30694t;
import com.google.android.libraries.onegoogle.common.C30928o;
import com.google.android.libraries.onegoogle.common.C30929p;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.common.base.C58838bb;

/* renamed from: com.google.android.libraries.onegoogle.popovercontainer.ak */
/* compiled from: PG */
public final class C31036ak extends C0359at implements C30928o {

    /* renamed from: a */
    public static final String f83597a = "com.google.android.libraries.onegoogle.popovercontainer.ak";

    /* renamed from: b */
    public static final Property f83598b = new C31063y(Float.class);

    /* renamed from: c */
    public static final Property f83599c = new C31064z(Integer.class);

    /* renamed from: d */
    public C31054p f83600d;

    /* renamed from: e */
    public boolean f83601e;

    /* renamed from: f */
    public SparseArray f83602f;

    /* renamed from: g */
    public C31039an f83603g;

    /* renamed from: h */
    public ExpandableDialogView f83604h;

    /* renamed from: i */
    public C31031af f83605i;

    /* renamed from: j */
    public final C30929p f83606j = new C30929p(this);

    /* renamed from: k */
    public C30692r f83607k;

    /* renamed from: l */
    private C31035aj f83608l;

    /* renamed from: f */
    private static void m57940f(ViewGroup viewGroup, C31032ag agVar) {
        viewGroup.removeAllViews();
        viewGroup.addView(agVar.mo36355a(LayoutInflater.from(viewGroup.getContext()), viewGroup));
    }

    /* renamed from: a */
    public final void mo36728a(C31039an anVar, View view) {
        C19559g.m37304c();
        C31042d dVar = (C31042d) anVar;
        m57940f((ViewGroup) view.findViewById(R.id.og_container_footer), dVar.f83628c);
        m57940f((ViewGroup) view.findViewById(R.id.og_header_container), dVar.f83626a);
        m57940f((ViewGroup) view.findViewById(R.id.og_container_content_view), dVar.f83627b);
        C2043bi.m5528V(view.findViewById(R.id.og_header_close_button), view.getResources().getString(dVar.f83629d));
        view.setVisibility(0);
        C31035aj ajVar = this.f83608l;
        if (ajVar != null) {
            C31036ak akVar = ((C30331a) ajVar).f82016a;
            C30694t.m57350a(view);
            akVar.mo36731d((C31035aj) null);
        }
    }

    /* renamed from: c */
    public final void mo36730c() {
        ExpandableDialogView expandableDialogView;
        View view;
        C31031af afVar = this.f83605i;
        if (afVar != null && (expandableDialogView = this.f83604h) != null && (view = expandableDialogView.f83580h) != null) {
            ((C31041c) afVar).f83622d.mo35826f(C28442l.m53142h(), view);
        }
    }

    /* renamed from: d */
    public final void mo36731d(C31035aj ajVar) {
        boolean z = true;
        if (!(this.f83603g == null || ajVar == null)) {
            z = false;
        }
        C58838bb.m90884s(z, "setOnBindViewProvidersToLayoutListener must be called before setViewProviders.");
        this.f83608l = ajVar;
    }

    public final void dismiss() {
        if (getDialog() == null || getDialog().getWindow() == null) {
            mo36729b();
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(getDialog().getWindow().getDecorView(), f83598b, new float[]{1.0f, 0.0f});
        ofFloat.setDuration(83);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addListener(new C31062x(this));
        ofFloat.start();
    }

    /* renamed from: e */
    public final boolean mo36411e() {
        return this.f83605i != null;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ExpandableDialogView expandableDialogView = this.f83604h;
        if (expandableDialogView != null) {
            expandableDialogView.onConfigurationChanged(configuration);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(2, 2132149664);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        this.f83606j.mo36610c(new C31060v(this, layoutInflater, viewGroup, frameLayout, bundle));
        return frameLayout;
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f83607k = null;
        this.f83603g = null;
        this.f83605i = null;
        this.f83608l = null;
    }

    public final void onDestroyView() {
        super.onDestroyView();
        C31054p pVar = this.f83600d;
        if (pVar != null) {
            pVar.f83640d.getViewTreeObserver().removeOnScrollChangedListener(pVar.f83638b);
            View view = pVar.f83640d;
            view.getViewTreeObserver().removeOnGlobalLayoutListener(pVar.f83639c);
            this.f83600d = null;
        }
        C31031af afVar = this.f83605i;
        if (afVar != null) {
            ((C31041c) afVar).f83621c.mo36373a();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.f83604h != null) {
            SparseArray sparseArray = new SparseArray();
            this.f83602f = sparseArray;
            this.f83604h.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("viewHierarchyState", this.f83602f);
        }
    }

    public final void onStart() {
        super.onStart();
        this.f83601e = true;
        C30692r rVar = this.f83607k;
        if (rVar != null) {
            rVar.mo36376a();
        }
    }

    public final void onStop() {
        super.onStop();
        this.f83601e = false;
        C30692r rVar = this.f83607k;
        if (rVar != null) {
            C30306o i = rVar.f82844b.mo35858i();
            i.f81934a.f81880a.remove(rVar.f82845c.f82848b);
            if (rVar.f82844b.mo35866q().mo56113h()) {
                ((C30313v) rVar.f82844b.mo35866q().mo56107c()).f81975a.remove(rVar.f82843a);
            }
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C19559g.m37304c();
        View view2 = getView();
        C58838bb.m90866a(view2, "tagWithLifecycleOwner() is only allowed when fragment.getView() is not null");
        view2.getRootView().setTag(R.id.og_fragment_lifecycle_tag, getViewLifecycleOwner());
        view.setSystemUiVisibility(view.getSystemUiVisibility() | 1280);
        view.setSystemUiVisibility(view.getSystemUiVisibility() | 512);
        this.f83606j.mo36610c(new C31055q(this, view, bundle));
    }

    /* renamed from: b */
    public final void mo36729b() {
        if (isAdded()) {
            if (isStateSaved()) {
                super.dismissAllowingStateLoss();
            } else {
                super.dismiss();
            }
            C31031af afVar = this.f83605i;
            if (afVar != null) {
                ((C31041c) afVar).f83620b.mo36372a();
            }
        }
    }
}
