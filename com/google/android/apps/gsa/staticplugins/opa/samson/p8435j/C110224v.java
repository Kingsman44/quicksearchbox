package com.google.android.apps.gsa.staticplugins.opa.samson.p8435j;

import android.os.Bundle;
import android.support.p033v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C2382m;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2391v;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.assistant.shared.C73845bq;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.C83893b;
import com.google.android.apps.gsa.opaonboarding.C83907bm;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m;
import com.google.android.apps.gsa.opaonboarding.p6463ui.FooterLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.OpaPageLayout;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90851k;
import com.google.android.apps.gsa.staticplugins.opa.samson.photos.C110340az;
import com.google.android.apps.gsa.staticplugins.opa.samson.photos.C110370cb;
import com.google.android.apps.gsa.staticplugins.opa.samson.photos.C110374d;
import com.google.android.apps.gsa.staticplugins.opa.samson.photos.C110375e;
import com.google.android.apps.gsa.staticplugins.opa.samson.photos.C110382l;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.common.base.C58881cr;
import dagger.C68214a;
import java.util.HashSet;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.j.v */
/* compiled from: PG */
public final class C110224v extends C83907bm implements C2391v {

    /* renamed from: i */
    public static final /* synthetic */ int f307131i = 0;

    /* renamed from: b */
    public C68214a f307132b;

    /* renamed from: c */
    public C83893b f307133c;

    /* renamed from: d */
    public C58881cr f307134d;

    /* renamed from: e */
    public C110340az f307135e;

    /* renamed from: f */
    public C110375e f307136f;

    /* renamed from: g */
    public OpaPageLayout f307137g;

    /* renamed from: h */
    public C110370cb f307138h;

    /* renamed from: j */
    private final C2393x f307139j = new C2393x(this);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    public final C2384o getLifecycle() {
        return this.f307139j;
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        HashSet hashSet = new HashSet();
        RecyclerView recyclerView = (RecyclerView) this.f307137g.findViewById(R.id.album_list);
        recyclerView.getClass();
        C110375e eVar = this.f307136f;
        C110370cb cbVar = this.f307138h;
        C110382l lVar = (C110382l) eVar.f307623a.mo17428b();
        lVar.getClass();
        C90851k kVar = (C90851k) eVar.f307624b.mo17428b();
        kVar.getClass();
        cbVar.getClass();
        C110374d dVar = new C110374d(lVar, kVar, cbVar, hashSet);
        recyclerView.setAdapter(dVar);
        recyclerView.addOnScrollListener(new C110223u(this, recyclerView));
        this.f307138h.f307609a.mo5704e(this, new C110218p(dVar));
        this.f307138h.f307610b.mo5704e(this, new C110219q(this, hashSet, dVar));
        this.f307138h.f307611c.mo5704e(this, new C110220r(this));
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f307139j.mo5793e(C2382m.ON_CREATE);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f307137g = (OpaPageLayout) layoutInflater.inflate(R.layout.photos_onboarding, (ViewGroup) null);
        C28295m.m52919e(this.f307137g, new C28292j(true != C73845bq.m108431e((C73845bq) this.f307134d.mo6453a()) ? 58296 : 75819));
        OpaPageLayout opaPageLayout = this.f307137g;
        opaPageLayout.getClass();
        FooterLayout footerLayout = opaPageLayout.f228726a;
        footerLayout.mo77362c(2);
        C84018m.m133907b(footerLayout.mo77360a(), R.string.photo_onboarding_action_text, footerLayout);
        C84018m.m133907b(footerLayout.mo77361b(), R.string.photo_onboarding_cancel_text, footerLayout);
        footerLayout.mo77360a().setOnClickListener(new C89943l(new C110221s(this)));
        footerLayout.mo77361b().setOnClickListener(new C89943l(new C110222t(this)));
        return this.f307137g;
    }

    public final void onDestroy() {
        this.f307139j.mo5793e(C2382m.ON_DESTROY);
        super.onDestroy();
    }

    public final void onPause() {
        this.f307139j.mo5793e(C2382m.ON_PAUSE);
        super.onPause();
    }

    public final void onResume() {
        super.onResume();
        this.f307139j.mo5793e(C2382m.ON_RESUME);
    }

    public final void onStart() {
        super.onStart();
        this.f307139j.mo5793e(C2382m.ON_START);
    }

    public final void onStop() {
        this.f307139j.mo5793e(C2382m.ON_STOP);
        super.onStop();
    }
}
