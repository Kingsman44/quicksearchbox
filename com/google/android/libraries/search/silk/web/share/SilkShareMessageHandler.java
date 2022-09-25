package com.google.android.libraries.search.silk.web.share;

import androidx.lifecycle.C2391v;
import com.google.android.libraries.search.silk.web.C40769f;
import com.google.android.libraries.search.silk.web.core.SilkCoreFeature;
import com.google.android.libraries.silk.event.C41889a;
import com.google.android.libraries.silk.event.C41896d;
import com.google.android.libraries.silk.p3205a.p3235x.C41739b;
import com.google.android.libraries.web.base.C43269t;
import com.google.android.libraries.web.p3407g.C43773b;
import com.google.android.libraries.web.p3408h.p3409a.p3410a.C43775a;
import com.google.android.libraries.web.postmessage.C43952c;
import com.google.android.libraries.web.postmessage.internal.C43960g;
import com.google.android.libraries.web.shared.contrib.C44084b;
import com.google.android.libraries.web.shared.contrib.C44088f;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4320y.C56837b;
import p3186j$.util.Optional;

/* compiled from: PG */
public final class SilkShareMessageHandler implements C44088f, C43773b {

    /* renamed from: a */
    static final C43775a f107147a = new C43775a("silk_share_port");

    /* renamed from: b */
    static final C58485gu f107148b = C58485gu.m89844l(new String[]{"showShareSheet", "bindCallbackToNativeShareButton", "removeBindingToNativeShareButton"});

    /* renamed from: c */
    static final C58485gu f107149c = C58485gu.m89844l(new String[]{"ShareButtonTap"});

    /* renamed from: g */
    public static final /* synthetic */ int f107150g = 0;

    /* renamed from: d */
    public final C43952c f107151d;

    /* renamed from: e */
    public final C40769f f107152e;

    /* renamed from: f */
    public final C41896d f107153f;

    /* renamed from: h */
    private final C44084b f107154h;

    /* renamed from: i */
    private final C43269t f107155i;

    /* renamed from: j */
    private final boolean f107156j;

    public SilkShareMessageHandler(C44084b bVar, C40769f fVar, C43960g gVar, C41889a aVar, C43269t tVar, Optional optional) {
        this.f107154h = bVar;
        this.f107151d = gVar.mo46957a(f107147a);
        this.f107152e = fVar;
        this.f107153f = aVar.mo44349a(C56837b.class);
        this.f107155i = tVar;
        this.f107156j = ((Boolean) optional.orElse(false)).booleanValue();
    }

    /* renamed from: h */
    private final void m70989h() {
        C58838bb.m90887v(this.f107155i.mo46384b().mo46300c(SilkCoreFeature.class), "Silk %s API requires SilkCoreFeature to work in WebX. Please add SilkCoreFeature to your WebConfig", "Share");
        this.f107154h.mo47055a(SilkShareFeature.class, C41739b.class).ifPresent(new C40914j(this));
    }

    /* renamed from: g */
    public final void mo42597g() {
        if (!this.f107156j) {
            m70989h();
        }
    }

    /* renamed from: gV */
    public final void mo3520gV(C2391v vVar) {
        if (this.f107156j) {
            m70989h();
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
