package com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8105a;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.MotionEvent;
import com.google.android.apps.p489g.p494d.C9141ad;
import com.google.android.apps.p489g.p494d.C9222dd;
import com.google.android.apps.p489g.p494d.C9268l;
import com.google.android.libraries.gsa.monet.shared.C23112h;
import com.google.android.libraries.gsa.monet.shared.LazyParcelable;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23266k;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23268m;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.common.base.C58833ax;
import com.google.p375ai.p378b.C7530ar;
import com.google.p375ai.p378b.C7593ct;
import com.google.p375ai.p378b.C7621du;
import com.google.p375ai.p378b.C7642eo;
import com.google.p375ai.p378b.C7850mg;
import com.google.p375ai.p378b.C8194z;
import com.google.p4140ba.p4141a.p4142a.p4144b.C54806z;
import com.google.protobuf.C62921ba;
import p5451f.p5452a.p5453a.p5454a.C69399au;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.a.h */
/* compiled from: PG */
public final class C104445h implements C104444g {

    /* renamed from: a */
    private final C23112h f290570a;

    public C104445h(C23112h hVar) {
        this.f290570a = hVar;
    }

    /* renamed from: c */
    public final void mo94159c(C7530ar arVar, String str) {
        Bundle bundle = new Bundle();
        C7530ar.f26069f.getParserForType();
        C62921ba.m95368a();
        bundle.putParcelable("adDismissSurveyAction", C23245b.m43556a(arVar));
        bundle.putString("actionTakenMessage", str);
        this.f290570a.mo28345s("onShowAdDismissSurvey_com.google.geo.sidekick.ClientActionProto.AdDismissSurveyAction_java.lang.String", "CapModuleEventsDispatcher", bundle);
    }

    /* renamed from: d */
    public final void mo94160d(C7621du duVar) {
        Bundle bundle = new Bundle();
        C7621du.f26333f.getParserForType();
        C62921ba.m95368a();
        bundle.putParcelable("whyThisAdAction", C23245b.m43556a(duVar));
        this.f290570a.mo28345s("onShowWhyThisAd_com.google.geo.sidekick.ClientActionProto.WhyThisAdAction", "CapModuleEventsDispatcher", bundle);
    }

    /* renamed from: e */
    public final void mo94161e(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("hasSwappedHeaderAction", Boolean.valueOf(z).booleanValue());
        this.f290570a.mo28345s("onBackOfCardStateUpdated_boolean", "CapModuleEventsDispatcher", bundle);
    }

    /* renamed from: f */
    public final void mo94162f(C8194z zVar) {
        Bundle bundle = new Bundle();
        C8194z.f28777k.getParserForType();
        C62921ba.m95368a();
        bundle.putParcelable("cardAction", C23245b.m43556a(zVar));
        this.f290570a.mo28345s("recordVeAction_com.google.geo.sidekick.CardActionProto.CardAction", "CapModuleEventsDispatcher", bundle);
    }

    /* renamed from: g */
    public final void mo94163g(C54806z zVar) {
        Bundle bundle = new Bundle();
        C54806z.f143773n.getParserForType();
        C62921ba.m95368a();
        bundle.putParcelable("videoWatchData", C23245b.m43556a(zVar));
        this.f290570a.mo28345s("logVideoWatchData_com.google.logs.proto.now.video.VideoWatchDataProto.VideoWatchData", "CapModuleEventsDispatcher", bundle);
    }

    /* renamed from: h */
    public final void mo94164h(int i, C9268l lVar) {
        Bundle bundle = new Bundle();
        bundle.putInt("tipId", Integer.valueOf(i).intValue());
        C9268l.f32065f.getParserForType();
        C62921ba.m95368a();
        bundle.putParcelable("boundingBox", C23245b.m43556a(lVar));
        this.f290570a.mo28345s("maybeShowTooltip_int_com.google.android.apps.sidekick.quantum.Modules.BoundingBox", "CapModuleEventsDispatcher", bundle);
    }

    /* renamed from: i */
    public final void mo94165i(MotionEvent motionEvent) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("motionEvent", new LazyParcelable((Parcelable) motionEvent));
        this.f290570a.mo28345s("onAdTouchEvent_android.view.MotionEvent", "CapModuleEventsDispatcher", bundle);
    }

    /* renamed from: iX */
    public final void mo94166iX(C9141ad adVar) {
        Bundle bundle = new Bundle();
        C9141ad.f31521K.getParserForType();
        C62921ba.m95368a();
        bundle.putParcelable("clientAction", C23245b.m43556a(adVar));
        this.f290570a.mo28345s("dismissEntry_com.google.android.apps.sidekick.quantum.Modules.ClientAction", "CapModuleEventsDispatcher", bundle);
    }

    /* renamed from: iY */
    public final void mo94167iY() {
        throw null;
    }

    /* renamed from: j */
    public final void mo94158j(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("minClickTimeSeconds", Integer.valueOf(i).intValue());
        this.f290570a.mo28345s("onInjectCollectionComponents_int", "CapModuleEventsDispatcher", bundle);
    }

    /* renamed from: k */
    public final void mo94168k(String str, C7850mg mgVar, C7850mg mgVar2, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putString("multiStateIconId", str);
        C7850mg.f27512e.getParserForType();
        C62921ba.m95368a();
        bundle.putParcelable("oldState", C23245b.m43556a(mgVar));
        C7850mg.f27512e.getParserForType();
        C62921ba.m95368a();
        bundle.putParcelable("newState", C23245b.m43556a(mgVar2));
        bundle.putBoolean("isInteraction", Boolean.valueOf(z).booleanValue());
        this.f290570a.mo28345s("onMultiStateIconNextState_java.lang.String_com.google.geo.sidekick.MultiState.MultiStateIcon.StateData_com.google.geo.sidekick.MultiState.MultiStateIcon.StateData_boolean", "CapModuleEventsDispatcher", bundle);
    }

    /* renamed from: l */
    public final void mo94169l(ProtoParcelable protoParcelable) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("clientAction", new LazyParcelable((Parcelable) protoParcelable));
        this.f290570a.mo28345s("onSearchAction_com.google.android.libraries.gsa.monet.shared.ProtoParcelable", "CapModuleEventsDispatcher", bundle);
    }

    /* renamed from: m */
    public final void mo94170m(int i, int i2, ProtoParcelable protoParcelable, String str) {
        Bundle bundle = new Bundle();
        bundle.putInt("x", Integer.valueOf(i).intValue());
        bundle.putInt("y", Integer.valueOf(i2).intValue());
        bundle.putParcelable("reactAction", new LazyParcelable((Parcelable) protoParcelable));
        bundle.putString("multiStateIconId", str);
        this.f290570a.mo28345s("onShowReactionWidget_int_int_com.google.android.libraries.gsa.monet.shared.ProtoParcelable_java.lang.String", "CapModuleEventsDispatcher", bundle);
    }

    /* renamed from: n */
    public final void mo94171n(C7593ct ctVar, String str) {
        Bundle bundle = new Bundle();
        C7593ct.f26245g.getParserForType();
        C62921ba.m95368a();
        bundle.putParcelable("reportAction", C23245b.m43556a(ctVar));
        bundle.putString("actionTakenMessage", str);
        this.f290570a.mo28345s("onShowReportContentDialog_com.google.geo.sidekick.ClientActionProto.ReportAction_java.lang.String", "CapModuleEventsDispatcher", bundle);
    }

    /* renamed from: o */
    public final void mo94172o(C9222dd ddVar, String str, boolean z, boolean z2, boolean z3) {
        Bundle bundle = new Bundle();
        C9222dd.f31875c.getParserForType();
        C62921ba.m95368a();
        bundle.putParcelable("saveAction", C23245b.m43556a(ddVar));
        bundle.putString("multiStateIconId", str);
        bundle.putBoolean("useNightMode", Boolean.valueOf(z).booleanValue());
        bundle.putBoolean("lightStatusBar", Boolean.valueOf(z2).booleanValue());
        bundle.putBoolean("lightNavBar", Boolean.valueOf(z3).booleanValue());
        this.f290570a.mo28345s("onToggleSaveAction_com.google.android.apps.sidekick.quantum.Modules.SaveAction_java.lang.String_boolean_boolean_boolean", "CapModuleEventsDispatcher", bundle);
    }

    /* renamed from: p */
    public final void mo94173p(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("multiStateIconId", str);
        this.f290570a.mo28345s("onToggleToDefaultState_java.lang.String", "CapModuleEventsDispatcher", bundle);
    }

    /* renamed from: q */
    public final void mo94174q(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("url", str);
        this.f290570a.mo28345s("openSilkMediaPane_java.lang.String", "CapModuleEventsDispatcher", bundle);
    }

    /* renamed from: r */
    public final void mo94175r(ProtoParcelable protoParcelable, C58833ax axVar) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("clientAction", new LazyParcelable((Parcelable) protoParcelable));
        new C23268m(new C23266k()).mo28734c("rvdt", axVar, bundle);
        this.f290570a.mo28345s("openUrl_com.google.android.libraries.gsa.monet.shared.ProtoParcelable_com.google.common.base.Optional<java.lang.Long>", "CapModuleEventsDispatcher", bundle);
    }

    /* renamed from: s */
    public final void mo94176s(ProtoParcelable protoParcelable) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("playVideoAction", new LazyParcelable((Parcelable) protoParcelable));
        this.f290570a.mo28345s("openVideoInNewApp_com.google.android.libraries.gsa.monet.shared.ProtoParcelable", "CapModuleEventsDispatcher", bundle);
    }

    /* renamed from: t */
    public final void mo94177t() {
        this.f290570a.mo28345s("openVideoSettings", "CapModuleEventsDispatcher", new Bundle());
    }

    /* renamed from: u */
    public final void mo94178u(C69399au auVar) {
        throw null;
    }

    /* renamed from: v */
    public final void mo94179v(String str, C7642eo eoVar) {
        throw null;
    }

    /* renamed from: w */
    public final void mo94180w(String str, String str2, C7642eo eoVar) {
        throw null;
    }
}
