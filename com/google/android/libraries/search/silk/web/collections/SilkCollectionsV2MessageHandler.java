package com.google.android.libraries.search.silk.web.collections;

import androidx.lifecycle.C2391v;
import com.google.android.libraries.search.silk.web.C40769f;
import com.google.android.libraries.search.silk.web.core.SilkCoreFeature;
import com.google.android.libraries.silk.p3205a.p3219h.C41722a;
import com.google.android.libraries.web.base.C43269t;
import com.google.android.libraries.web.p3407g.C43773b;
import com.google.android.libraries.web.p3408h.p3409a.p3410a.C43775a;
import com.google.android.libraries.web.postmessage.C43952c;
import com.google.android.libraries.web.postmessage.internal.C43960g;
import com.google.android.libraries.web.shared.contrib.C44084b;
import com.google.android.libraries.web.shared.contrib.C44088f;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.Optional;

/* compiled from: PG */
public final class SilkCollectionsV2MessageHandler implements C44088f, C43773b {

    /* renamed from: a */
    static final C43775a f106822a = new C43775a("silk_collections_v2_port");

    /* renamed from: b */
    static final C58485gu f106823b = C58485gu.m89844l(new String[]{"openCollection", "save", "unsave", "setActiveList"});

    /* renamed from: e */
    public static final /* synthetic */ int f106824e = 0;

    /* renamed from: c */
    public final C43952c f106825c;

    /* renamed from: d */
    public final C40769f f106826d;

    /* renamed from: f */
    private final C44084b f106827f;

    /* renamed from: g */
    private final C43269t f106828g;

    /* renamed from: h */
    private final boolean f106829h;

    public SilkCollectionsV2MessageHandler(C44084b bVar, C40769f fVar, C43960g gVar, C43269t tVar, Optional optional) {
        this.f106827f = bVar;
        this.f106825c = gVar.mo46957a(f106822a);
        this.f106826d = fVar;
        this.f106828g = tVar;
        this.f106829h = ((Boolean) optional.orElse(false)).booleanValue();
    }

    /* renamed from: h */
    private final void m70599h() {
        C58838bb.m90887v(this.f106828g.mo46384b().mo46300c(SilkCoreFeature.class), "Silk %s API requires SilkCoreFeature to work in WebX. Please add SilkCoreFeature to your WebConfig", "CollectionsV2");
        this.f106827f.mo47055a(SilkCollectionsV2Feature.class, C41722a.class).ifPresent(new C40735d(this));
    }

    /* renamed from: g */
    public final void mo42597g() {
        if (!this.f106829h) {
            m70599h();
        }
    }

    /* renamed from: gV */
    public final void mo3520gV(C2391v vVar) {
        if (this.f106829h) {
            m70599h();
        }
    }

    /* renamed from: gW */
    public final /* synthetic */ void mo3521gW(C2391v vVar) {
    }

    /* renamed from: gX */
    public final /* synthetic */ void mo3522gX(C2391v vVar) {
    }

    /* renamed from: gY */
    public final /* synthetic */ void mo3523gY(C2391v vVar) {
    }

    /* renamed from: gZ */
    public final /* synthetic */ void mo3524gZ(C2391v vVar) {
    }

    /* renamed from: ha */
    public final /* synthetic */ void mo3525ha(C2391v vVar) {
    }
}
