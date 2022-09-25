package com.google.android.libraries.search.silk.web.initialization;

import androidx.lifecycle.C2391v;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.silk.web.C40769f;
import com.google.android.libraries.search.silk.web.core.SilkCoreFeature;
import com.google.android.libraries.silk.p3205a.p3225n.C41728a;
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
import org.json.JSONObject;
import p3186j$.util.Optional;

/* compiled from: PG */
public final class SilkInitializationMessageHandler implements C44088f, C43773b {

    /* renamed from: a */
    static final C43775a f106963a = new C43775a("silk_initialization_port");

    /* renamed from: b */
    static final C58485gu f106964b = C58485gu.m89848p("getDynamicRequestHttpHeaders", "setEventId", "setSearchRefinementSuggestions");

    /* renamed from: e */
    public static final /* synthetic */ int f106965e = 0;

    /* renamed from: c */
    public final C41728a f106966c;

    /* renamed from: d */
    public final C40769f f106967d;

    /* renamed from: f */
    private final C43952c f106968f;

    /* renamed from: g */
    private final C43269t f106969g;

    /* renamed from: h */
    private final boolean f106970h;

    public SilkInitializationMessageHandler(C44084b bVar, C43960g gVar, C40769f fVar, C43269t tVar, Optional optional) {
        this.f106966c = (C41728a) bVar.mo47055a(SilkInitializationFeature.class, C41728a.class).get();
        this.f106968f = gVar.mo46957a(f106963a);
        this.f106967d = fVar;
        this.f106969g = tVar;
        this.f106970h = ((Boolean) optional.orElse(false)).booleanValue();
    }

    /* renamed from: h */
    private final void m70765h() {
        C58838bb.m90887v(this.f106969g.mo46384b().mo46300c(SilkCoreFeature.class), "Silk %s API requires SilkCoreFeature to work in WebX. Please add SilkCoreFeature to your WebConfig", "Initialization");
        ((PostMessageMixinImpl) this.f106968f).mo46952c(R.id.silk_initialization_get_dynamic_request_http_headers, C40810e.f106972a, new C40811f(this), true, C41743a.f109088b);
        ((PostMessageMixinImpl) this.f106968f).mo46952c(R.id.silk_initialization_set_event_id, C40812g.f106974a, new C40813h(this), false, (JSONObject) null);
        ((PostMessageMixinImpl) this.f106968f).mo46952c(R.id.silk_initialization_set_search_refinement_suggestions, C40814i.f106976a, new C40815j(this), false, (JSONObject) null);
    }

    /* renamed from: g */
    public final void mo42597g() {
        if (!this.f106970h) {
            m70765h();
        }
    }

    /* renamed from: gV */
    public final void mo3520gV(C2391v vVar) {
        if (this.f106970h) {
            m70765h();
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
