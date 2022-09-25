package com.google.android.libraries.search.silk.web.uimodes;

import androidx.lifecycle.C2391v;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.silk.web.C40769f;
import com.google.android.libraries.search.silk.web.core.SilkCoreFeature;
import com.google.android.libraries.silk.p3205a.p3207aa.C41710a;
import com.google.android.libraries.silk.p3238b.p3239a.C41743a;
import com.google.android.libraries.web.base.C43269t;
import com.google.android.libraries.web.p3407g.C43773b;
import com.google.android.libraries.web.p3408h.p3409a.p3410a.C43775a;
import com.google.android.libraries.web.postmessage.C43952c;
import com.google.android.libraries.web.postmessage.internal.C43960g;
import com.google.android.libraries.web.postmessage.internal.PostMessageMixinImpl;
import com.google.android.libraries.web.shared.contrib.C44084b;
import com.google.android.libraries.web.shared.contrib.C44088f;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.Optional;

/* compiled from: PG */
public final class SilkUiModesMessageHandler implements C44088f, C43773b {

    /* renamed from: a */
    static final C43775a f107208a = new C43775a("silk_ui_modes_port");

    /* renamed from: b */
    static final C58485gu f107209b = C58485gu.m89844l(new String[]{"enterBasicMode", "exitBasicMode"});

    /* renamed from: d */
    public static final /* synthetic */ int f107210d = 0;

    /* renamed from: c */
    public final C40769f f107211c;

    /* renamed from: e */
    private final C44084b f107212e;

    /* renamed from: f */
    private final C43952c f107213f;

    /* renamed from: g */
    private final C43269t f107214g;

    /* renamed from: h */
    private final boolean f107215h;

    public SilkUiModesMessageHandler(C44084b bVar, C40769f fVar, C43960g gVar, C43269t tVar, Optional optional) {
        this.f107212e = bVar;
        this.f107213f = gVar.mo46957a(f107208a);
        this.f107211c = fVar;
        this.f107214g = tVar;
        this.f107215h = ((Boolean) optional.orElse(false)).booleanValue();
    }

    /* renamed from: i */
    private final void m71071i() {
        C58838bb.m90887v(this.f107214g.mo46384b().mo46300c(SilkCoreFeature.class), "Silk %s API requires SilkCoreFeature to work in WebX. Please add SilkCoreFeature to your WebConfig", "UiModes");
        this.f107212e.mo47055a(SilkUiModesFeature.class, C41710a.class).ifPresent(new C40944h(this));
    }

    /* renamed from: g */
    public final void mo42597g() {
        if (!this.f107215h) {
            m71071i();
        }
    }

    /* renamed from: gV */
    public final void mo3520gV(C2391v vVar) {
        if (this.f107215h) {
            m71071i();
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

    /* renamed from: h */
    public final void mo42963h(C41710a aVar) {
        ((PostMessageMixinImpl) this.f107213f).mo46952c(R.id.enter_basic_mode, C40940d.f107217a, new C40941e(this, aVar), true, C41743a.f109088b);
        ((PostMessageMixinImpl) this.f107213f).mo46952c(R.id.exit_basic_mode, C40942f.f107220a, new C40943g(this, aVar), true, C41743a.f109088b);
    }

    /* renamed from: ha */
    public final /* synthetic */ void mo3525ha(C2391v vVar) {
    }
}
