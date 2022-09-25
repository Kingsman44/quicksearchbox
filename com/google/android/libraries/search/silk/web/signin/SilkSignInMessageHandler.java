package com.google.android.libraries.search.silk.web.signin;

import androidx.lifecycle.C2391v;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.silk.web.C40769f;
import com.google.android.libraries.search.silk.web.core.SilkCoreFeature;
import com.google.android.libraries.silk.p3205a.p3236y.C41740a;
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
public final class SilkSignInMessageHandler implements C44088f, C43773b {

    /* renamed from: a */
    static final C43775a f107177a = new C43775a("silk_sign_in_port");

    /* renamed from: b */
    static final C58485gu f107178b = C58485gu.m89844l(new String[]{"chooseAccount"});

    /* renamed from: d */
    public static final /* synthetic */ int f107179d = 0;

    /* renamed from: c */
    public final C40769f f107180c;

    /* renamed from: e */
    private final C44084b f107181e;

    /* renamed from: f */
    private final C43952c f107182f;

    /* renamed from: g */
    private final C43269t f107183g;

    /* renamed from: h */
    private final boolean f107184h;

    public SilkSignInMessageHandler(C44084b bVar, C40769f fVar, C43960g gVar, C43269t tVar, Optional optional) {
        this.f107181e = bVar;
        this.f107182f = gVar.mo46957a(f107177a);
        this.f107180c = fVar;
        this.f107183g = tVar;
        this.f107184h = ((Boolean) optional.orElse(false)).booleanValue();
    }

    /* renamed from: i */
    private final void m71023i() {
        C58838bb.m90887v(this.f107183g.mo46384b().mo46300c(SilkCoreFeature.class), "Silk %s API requires SilkCoreFeature to work in WebX. Please add SilkCoreFeature to your WebConfig", "SignIn");
        this.f107181e.mo47055a(SilkSignInFeature.class, C41740a.class).ifPresent(new C40929g(this));
    }

    /* renamed from: g */
    public final void mo42597g() {
        if (!this.f107184h) {
            m71023i();
        }
    }

    /* renamed from: gV */
    public final void mo3520gV(C2391v vVar) {
        if (this.f107184h) {
            m71023i();
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
    public final void mo42933h(C41740a aVar) {
        ((PostMessageMixinImpl) this.f107182f).mo46952c(R.id.choose_account, C40927e.f107186a, new C40928f(this, aVar), true, C41743a.f109088b);
    }

    /* renamed from: ha */
    public final /* synthetic */ void mo3525ha(C2391v vVar) {
    }
}
