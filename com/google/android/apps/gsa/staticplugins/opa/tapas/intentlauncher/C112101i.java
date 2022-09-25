package com.google.android.apps.gsa.staticplugins.opa.tapas.intentlauncher;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.support.p033v7.widget.RecyclerView;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageButton;
import androidx.core.content.C1878d;
import androidx.lifecycle.C2391v;
import com.google.android.apps.gsa.assistant.shared.C73841bf;
import com.google.android.apps.gsa.assistant.shared.p.h;
import com.google.android.apps.gsa.assistant.shared.p.l;
import com.google.android.apps.gsa.binaries.satin.app.C74258rl;
import com.google.android.apps.gsa.binaries.satin.app.C74259rn;
import com.google.android.apps.gsa.binaries.satin.app.C74261rq;
import com.google.android.apps.gsa.nga.shared.p6369ui.p6405b.C82193a;
import com.google.android.apps.gsa.search.shared.p6930h.C87568k;
import com.google.android.apps.gsa.search.shared.service.C87673aa;
import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.util.C90757ba;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.staticplugins.opa.C109717mv;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107698i;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107710u;
import com.google.android.apps.gsa.staticplugins.opa.tapas.intentlauncher.C112097f;
import com.google.android.apps.gsa.staticplugins.opa.tapas.intentlauncher.p8546a.C112081a;
import com.google.android.apps.gsa.staticplugins.opa.tapas.intentlauncher.p8547b.C112088b;
import com.google.android.apps.gsa.staticplugins.opa.tapas.intentlauncher.p8547b.C112089c;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113375dp;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.inject.C47266f;
import com.google.assistant.p3781ad.p3789d.p3791b.C48674ai;
import dagger.C68214a;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68225k;
import java.util.Random;
import org.chromium.net.PrivateKeyType;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.intentlauncher.i */
/* compiled from: PG */
public final class C112101i extends Fragment {

    /* renamed from: i */
    private static String[] f311304i = new String[0];

    /* renamed from: a */
    public C69464a f311305a;

    /* renamed from: b */
    public C68214a f311306b;

    /* renamed from: c */
    public C109717mv f311307c;

    /* renamed from: d */
    public C107698i f311308d;

    /* renamed from: e */
    public C107710u f311309e;

    /* renamed from: f */
    public C87568k f311310f;

    /* renamed from: g */
    public EditText f311311g;

    /* renamed from: h */
    public ImageButton f311312h;

    /* renamed from: j */
    private C87673aa f311313j;

    /* renamed from: k */
    private C112081a f311314k;

    /* renamed from: l */
    private C87682aj f311315l;

    /* renamed from: m */
    private ContextThemeWrapper f311316m;

    /* renamed from: a */
    public final C112081a mo99394a() {
        C112081a aVar = this.f311314k;
        if (aVar != null) {
            return aVar;
        }
        C112099g gVar = new C112099g(getActivity());
        C74258rl rlVar = (C74258rl) this.f311305a.mo17428b();
        rlVar.f207709b = new C112100h(this, gVar);
        rlVar.f207710c = gVar;
        rlVar.f207711d = this;
        rlVar.f207712e = new C112088b();
        C107698i iVar = this.f311308d;
        iVar.getClass();
        rlVar.f207713f = iVar;
        C107710u uVar = this.f311309e;
        uVar.getClass();
        rlVar.f207714g = uVar;
        ContextThemeWrapper contextThemeWrapper = this.f311316m;
        contextThemeWrapper.getClass();
        rlVar.f207715h = contextThemeWrapper;
        rlVar.f207716i = new C112089c();
        C48674ai aiVar = C48674ai.INTENT_LAUNCHER;
        aiVar.getClass();
        rlVar.f207717j = aiVar;
        C68225k.m98529a(rlVar.f207709b, l.class);
        C68225k.m98529a(rlVar.f207710c, C91097g.class);
        C68225k.m98529a(rlVar.f207711d, C2391v.class);
        C68225k.m98529a(rlVar.f207712e, h.class);
        C68225k.m98529a(rlVar.f207713f, C107698i.class);
        C68225k.m98529a(rlVar.f207714g, C107710u.class);
        C68225k.m98529a(rlVar.f207715h, Context.class);
        C68225k.m98529a(rlVar.f207716i, C113375dp.class);
        C68225k.m98529a(rlVar.f207717j, C48674ai.class);
        C112081a aVar2 = (C112081a) new C74259rn(rlVar.f207708a, rlVar.f207709b, rlVar.f207710c, rlVar.f207711d, rlVar.f207712e, rlVar.f207713f, rlVar.f207714g, rlVar.f207715h, rlVar.f207716i, rlVar.f207717j).f207932r.mo17428b();
        this.f311314k = aVar2;
        return aVar2;
    }

    /* renamed from: b */
    public final void mo99395b() {
        Window window = getActivity().getWindow();
        window.setStatusBarColor(C1878d.m5128a(getContext(), R.color.intent_launcher_background));
        int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
        if (C82193a.m130503a(getContext())) {
            window.getDecorView().setSystemUiVisibility(systemUiVisibility & -8193);
        } else {
            window.getDecorView().setSystemUiVisibility(systemUiVisibility | 8192);
        }
    }

    /* renamed from: c */
    public final void mo99396c(String str) {
        mo99394a().mo99362g(str);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C112097f fVar = new C112097f(getContext());
        if (fVar.f311301b == null) {
            ((C112097f.C112098a) C47266f.m84076a(fVar.f311300a, C112097f.C112098a.class)).mo99384qN(fVar);
        }
        C74261rq rqVar = new C74261rq(fVar.f311301b.f207941a);
        this.f311305a = rqVar.f207942a.b.f200232fh;
        this.f311306b = C68219e.m98518a(rqVar.f207943b);
        this.f311307c = (C109717mv) rqVar.f207944c.mo17428b();
        this.f311308d = (C107698i) rqVar.f207945d.mo17428b();
        this.f311309e = (C107710u) rqVar.f207946e.mo17428b();
        this.f311310f = (C87568k) rqVar.f207942a.a.f202812eD.mo17428b();
        f311304i = ((C73841bf) this.f311306b.mo27525b()).mo65322a().getStringArray(R.array.intent_launcher_input_rotational_hints);
        this.f311316m = new ContextThemeWrapper(getContext(), 2132150873);
        this.f311307c.mo98048b((C90757ba) null);
        C87673aa a = this.f311307c.mo98047a();
        this.f311313j = a;
        a.mo81932c();
        C112092d dVar = new C112092d(this);
        this.f311315l = dVar;
        this.f311309e.mo96220c(dVar, C88244um.ON_SERVICE_CONNECTED);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.cloneInContext(this.f311316m).inflate(R.layout.intent_launcher_fragment_layout, viewGroup, false);
        this.f311311g = (EditText) inflate.findViewById(R.id.input_text);
        this.f311312h = (ImageButton) inflate.findViewById(R.id.clear_button);
        mo99394a().mo99361f((RecyclerView) inflate.findViewById(R.id.suggestions_container));
        String[] strArr = f311304i;
        int length = strArr.length;
        if (length > 0) {
            EditText editText = this.f311311g;
            editText.getClass();
            editText.setHint(strArr[new Random().nextInt(length)]);
        }
        ImageButton imageButton = this.f311312h;
        imageButton.getClass();
        imageButton.setOnClickListener(new C112086b(this));
        EditText editText2 = this.f311311g;
        editText2.getClass();
        editText2.addTextChangedListener(new C112094e(this));
        EditText editText3 = this.f311311g;
        editText3.getClass();
        editText3.requestFocus();
        EditText editText4 = this.f311311g;
        editText4.getClass();
        mo99396c(editText4.getText().toString());
        return inflate;
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f311313j.mo81934f();
        this.f311309e.mo96221d(this.f311315l, new C88244um[0]);
        mo99394a().mo99356a();
    }

    public final void onDestroyView() {
        super.onDestroyView();
        this.f311311g = null;
        this.f311312h = null;
    }

    public final void onPause() {
        super.onPause();
        this.f311313j.mo81948t(false);
        this.f311313j.mo81933e();
        mo99394a().mo99357b();
    }

    public final void onResume() {
        super.onResume();
        if (!this.f311313j.mo81951w()) {
            this.f311313j.mo81932c();
        }
        if (!this.f311313j.mo81953y()) {
            this.f311313j.mo81947s((Bundle) null);
        }
        mo99394a().mo99358c();
    }

    public final void onStop() {
        super.onStop();
        mo99394a().mo99360e();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, PrivateKeyType.INVALID});
        ofInt.setDuration(300);
        ofInt.addUpdateListener(new C112080a(this, view));
        ofInt.addListener(new C112090c(this, view));
        ofInt.start();
    }
}
