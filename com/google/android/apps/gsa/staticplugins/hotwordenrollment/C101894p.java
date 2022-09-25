package com.google.android.apps.gsa.staticplugins.hotwordenrollment;

import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import android.view.View;
import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.p5855h.p5861s.C74555u;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90584f;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.C101503a;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.C101610b;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101770j;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7983g.C101835c;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7985h.C101860a;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.p */
/* compiled from: PG */
public final class C101894p {

    /* renamed from: a */
    public static final C59071e f284210a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.hotwordenrollment.p");

    /* renamed from: b */
    public final C101892n f284211b;

    /* renamed from: c */
    public final C101835c f284212c;

    /* renamed from: d */
    public final C89994f f284213d;

    /* renamed from: e */
    public final C68214a f284214e;

    /* renamed from: f */
    public final C101874l f284215f;

    /* renamed from: g */
    public final C101770j f284216g;

    /* renamed from: h */
    public final C74555u f284217h;

    /* renamed from: i */
    public final C101860a f284218i;

    /* renamed from: j */
    public final String f284219j;

    /* renamed from: k */
    public final C89859i f284220k;

    /* renamed from: l */
    public final C101503a f284221l;

    /* renamed from: m */
    public final bm f284222m;

    /* renamed from: n */
    public final C90584f f284223n;

    /* renamed from: o */
    View f284224o;

    public C101894p(C101892n nVar, String str, C101835c cVar, C101835c cVar2, C89994f fVar, C68214a aVar, C101770j jVar, C74555u uVar, C101860a aVar2, C89859i iVar, C101874l lVar, C101610b bVar, C101503a aVar3, bm bmVar, C90584f fVar2) {
        this.f284211b = nVar;
        this.f284213d = fVar;
        this.f284214e = aVar;
        this.f284215f = lVar;
        this.f284217h = uVar;
        this.f284216g = jVar;
        this.f284218i = aVar2;
        this.f284219j = str;
        this.f284220k = iVar;
        this.f284221l = aVar3;
        this.f284222m = bmVar;
        this.f284223n = fVar2;
        if (bVar.mo92420a()) {
            C58976aa aaVar = C58975e.f156826a;
            this.f284212c = cVar2;
            return;
        }
        C58976aa aaVar2 = C58975e.f156826a;
        this.f284212c = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Fragment mo92676a() {
        FragmentManager childFragmentManager = this.f284211b.getChildFragmentManager();
        if (childFragmentManager != null) {
            return childFragmentManager.f634a.mo670b(R.id.enrollment_controller_fragment);
        }
        C59104x c = f284210a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "EnrollmentRootFragm");
        ((C59052c) ((C59052c) c).mo56372aa(20233)).mo56386p("ChildFragmentManager of root fragment is null!");
        return null;
    }
}
