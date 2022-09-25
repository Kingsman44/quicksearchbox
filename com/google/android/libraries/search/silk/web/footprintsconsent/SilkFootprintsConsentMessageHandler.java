package com.google.android.libraries.search.silk.web.footprintsconsent;

import androidx.lifecycle.C2391v;
import com.google.android.libraries.search.silk.web.C40769f;
import com.google.android.libraries.search.silk.web.core.SilkCoreFeature;
import com.google.android.libraries.silk.p3205a.p3222k.C41725a;
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
public final class SilkFootprintsConsentMessageHandler implements C44088f, C43773b {

    /* renamed from: a */
    static final C43775a f106906a = new C43775a("silk_footprints_consent_port");

    /* renamed from: b */
    static final C58485gu f106907b = C58485gu.m89844l(new String[]{"sendLoadingResult", "sendConsentResult"});

    /* renamed from: e */
    public static final /* synthetic */ int f106908e = 0;

    /* renamed from: c */
    public final C43952c f106909c;

    /* renamed from: d */
    public final C40769f f106910d;

    /* renamed from: f */
    private final C44084b f106911f;

    /* renamed from: g */
    private final C43269t f106912g;

    /* renamed from: h */
    private final boolean f106913h;

    public SilkFootprintsConsentMessageHandler(C44084b bVar, C40769f fVar, C43960g gVar, C43269t tVar, Optional optional) {
        this.f106911f = bVar;
        this.f106909c = gVar.mo46957a(f106906a);
        this.f106910d = fVar;
        this.f106912g = tVar;
        this.f106913h = ((Boolean) optional.orElse(false)).booleanValue();
    }

    /* renamed from: h */
    private final void m70693h() {
        C58838bb.m90887v(this.f106912g.mo46384b().mo46300c(SilkCoreFeature.class), "Silk %s API requires SilkCoreFeature to work in WebX. Please add SilkCoreFeature to your WebConfig", "FootprintsConsent");
        this.f106911f.mo47055a(SilkFootprintsConsentFeature.class, C41725a.class).ifPresent(new C40784i(this));
    }

    /* renamed from: g */
    public final void mo42597g() {
        if (!this.f106913h) {
            m70693h();
        }
    }

    /* renamed from: gV */
    public final void mo3520gV(C2391v vVar) {
        if (this.f106913h) {
            m70693h();
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
