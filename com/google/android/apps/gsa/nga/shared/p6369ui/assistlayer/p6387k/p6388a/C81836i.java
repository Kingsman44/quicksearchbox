package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6387k.p6388a;

import android.content.Context;
import android.view.View;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6377e.C81564g;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6386j.C81810c;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6386j.C81819l;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6400q.C81984au;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6400q.C81993bc;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.shelfbackground.C82043c;
import com.google.android.apps.gsa.nga.shared.p6417x.C83363m;
import com.google.android.apps.gsa.nga.shared.p6417x.C83369s;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59071e;
import p3186j$.util.Optional;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.k.a.i */
/* compiled from: PG */
public final class C81836i implements C81810c, C82043c {

    /* renamed from: a */
    public static final C59071e f223801a = C59071e.m91332i("com.google.android.apps.gsa.nga.shared.ui.assistlayer.k.a.i");

    /* renamed from: b */
    public final C22871g f223802b;

    /* renamed from: c */
    public final C22871g f223803c;

    /* renamed from: d */
    public final C81841n f223804d;

    /* renamed from: e */
    private final C81819l f223805e;

    /* renamed from: f */
    private final C81984au f223806f;

    /* renamed from: g */
    private final C83363m f223807g = new C83363m();

    public C81836i(Context context, C22871g gVar, C22871g gVar2, C81819l lVar, C81564g gVar3, C81993bc bcVar, C81984au auVar) {
        C81841n nVar = new C81841n(context);
        this.f223804d = nVar;
        nVar.f223834e = Optional.m71637of(gVar3);
        nVar.f223835f = Optional.m71637of(bcVar);
        this.f223802b = gVar;
        this.f223803c = gVar2;
        this.f223805e = lVar;
        this.f223806f = auVar;
    }

    /* renamed from: b */
    public final View mo75197b() {
        return this.f223804d;
    }

    /* renamed from: d */
    public final void mo75129d() {
        this.f223807g.mo76663c(this.f223806f.mo75426a(R.string.nga_ambient_visual_search_gleam_description), new C81830c(this));
        this.f223807g.mo76663c(this.f223805e.mo75148a(), new C83369s(this.f223802b, "ambientVisualSearchGleamsStateChanged", new C81831d(this)));
        this.f223807g.mo76663c(this.f223805e.mo75150c(), new C83369s(this.f223802b, "androidConfigurationChanged", new C81832e(this)));
    }

    /* renamed from: e */
    public final void mo75130e() {
        this.f223807g.mo76661a();
    }

    /* renamed from: i */
    public final void mo75200i(Supplier supplier) {
    }
}
