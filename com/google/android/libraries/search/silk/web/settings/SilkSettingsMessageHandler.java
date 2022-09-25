package com.google.android.libraries.search.silk.web.settings;

import androidx.lifecycle.C2391v;
import com.google.android.libraries.search.silk.web.C40769f;
import com.google.android.libraries.search.silk.web.core.SilkCoreFeature;
import com.google.android.libraries.silk.p3205a.p3234w.C41737a;
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
public final class SilkSettingsMessageHandler implements C44088f, C43773b {

    /* renamed from: a */
    static final C43775a f107132a = new C43775a("silk_settings_port");

    /* renamed from: b */
    static final C58485gu f107133b = C58485gu.m89844l(new String[]{"updateSettingValue"});

    /* renamed from: e */
    public static final /* synthetic */ int f107134e = 0;

    /* renamed from: c */
    public final C43952c f107135c;

    /* renamed from: d */
    public final C40769f f107136d;

    /* renamed from: f */
    private final C44084b f107137f;

    /* renamed from: g */
    private final C43269t f107138g;

    /* renamed from: h */
    private final boolean f107139h;

    public SilkSettingsMessageHandler(C44084b bVar, C40769f fVar, C43960g gVar, C43269t tVar, Optional optional) {
        this.f107137f = bVar;
        this.f107135c = gVar.mo46957a(f107132a);
        this.f107136d = fVar;
        this.f107138g = tVar;
        this.f107139h = ((Boolean) optional.orElse(false)).booleanValue();
    }

    /* renamed from: h */
    private final void m70967h() {
        C58838bb.m90887v(this.f107138g.mo46384b().mo46300c(SilkCoreFeature.class), "Silk %s API requires SilkCoreFeature to work in WebX. Please add SilkCoreFeature to your WebConfig", "Settings");
        this.f107137f.mo47055a(SilkSettingsFeature.class, C41737a.class).ifPresent(new C40904f(this));
    }

    /* renamed from: g */
    public final void mo42597g() {
        if (!this.f107139h) {
            m70967h();
        }
    }

    /* renamed from: gV */
    public final void mo3520gV(C2391v vVar) {
        if (this.f107139h) {
            m70967h();
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
