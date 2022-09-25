package com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8105a;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.MotionEvent;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8108d.p8109a.C104535ac;
import com.google.android.apps.p489g.p494d.C9141ad;
import com.google.android.apps.p489g.p494d.C9222dd;
import com.google.android.apps.p489g.p494d.C9268l;
import com.google.android.libraries.gsa.monet.shared.C23113i;
import com.google.android.libraries.gsa.monet.shared.C23120p;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23259d;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23266k;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23268m;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23269n;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23271p;
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

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.a.i */
/* compiled from: PG */
public final class C104446i implements C23113i {

    /* renamed from: a */
    private final C104444g f290571a;

    public C104446i(C104444g gVar) {
        this.f290571a = gVar;
    }

    /* renamed from: a */
    public final void mo28561a(String str, String str2, Parcelable parcelable) {
        if ("CapModuleEventsDispatcher".equals(str2) && (parcelable instanceof Bundle)) {
            C23120p pVar = new C23120p((Bundle) parcelable);
            if (str.equals("dismissEntry_com.google.android.apps.sidekick.quantum.Modules.ClientAction")) {
                this.f290571a.mo94166iX((C9141ad) new C23271p(C9141ad.f31521K.getParserForType(), C62921ba.m95368a(), C9141ad.f31521K).mo28733b("clientAction", pVar));
            } else if (str.equals("dismissSnackbar")) {
                this.f290571a.mo94167iY();
            } else if (str.equals("logVideoWatchData_com.google.logs.proto.now.video.VideoWatchDataProto.VideoWatchData")) {
                ((C104535ac) this.f290571a).f290762i.mo85745e((C54806z) new C23271p(C54806z.f143773n.getParserForType(), C62921ba.m95368a(), C54806z.f143773n).mo28733b("videoWatchData", pVar));
            } else if (str.equals("maybeShowTooltip_int_com.google.android.apps.sidekick.quantum.Modules.BoundingBox")) {
                this.f290571a.mo94164h(Integer.valueOf(pVar.f63472a.getInt("tipId")).intValue(), (C9268l) new C23271p(C9268l.f32065f.getParserForType(), C62921ba.m95368a(), C9268l.f32065f).mo28733b("boundingBox", pVar));
            } else if (str.equals("onAdTouchEvent_android.view.MotionEvent")) {
                this.f290571a.mo94165i((MotionEvent) new C23269n().mo28733b("motionEvent", pVar));
            } else if (str.equals("onBackOfCardStateUpdated_boolean")) {
                this.f290571a.mo94161e(Boolean.valueOf(pVar.f63472a.getBoolean("hasSwappedHeaderAction")).booleanValue());
            } else if (str.equals("onInjectCollectionComponents_int")) {
                this.f290571a.mo94158j(Integer.valueOf(pVar.f63472a.getInt("minClickTimeSeconds")).intValue());
            } else if (str.equals("onMultiStateIconNextState_java.lang.String_com.google.geo.sidekick.MultiState.MultiStateIcon.StateData_com.google.geo.sidekick.MultiState.MultiStateIcon.StateData_boolean")) {
                String string = pVar.f63472a.getString("multiStateIconId");
                string.getClass();
                boolean booleanValue = Boolean.valueOf(pVar.f63472a.getBoolean("isInteraction")).booleanValue();
                this.f290571a.mo94168k(string, (C7850mg) new C23271p(C7850mg.f27512e.getParserForType(), C62921ba.m95368a(), C7850mg.f27512e).mo28733b("oldState", pVar), (C7850mg) new C23271p(C7850mg.f27512e.getParserForType(), C62921ba.m95368a(), C7850mg.f27512e).mo28733b("newState", pVar), booleanValue);
            } else if (str.equals("onSearchAction_com.google.android.libraries.gsa.monet.shared.ProtoParcelable")) {
                this.f290571a.mo94169l((ProtoParcelable) new C23269n().mo28733b("clientAction", pVar));
            } else if (str.equals("onShowAdDismissSurvey_com.google.geo.sidekick.ClientActionProto.AdDismissSurveyAction_java.lang.String")) {
                String string2 = pVar.f63472a.getString("actionTakenMessage");
                string2.getClass();
                this.f290571a.mo94159c((C7530ar) new C23271p(C7530ar.f26069f.getParserForType(), C62921ba.m95368a(), C7530ar.f26069f).mo28733b("adDismissSurveyAction", pVar), string2);
            } else if (str.equals("onShowReactionWidget_int_int_com.google.android.libraries.gsa.monet.shared.ProtoParcelable_java.lang.String")) {
                String string3 = pVar.f63472a.getString("multiStateIconId");
                string3.getClass();
                this.f290571a.mo94170m(Integer.valueOf(pVar.f63472a.getInt("x")).intValue(), Integer.valueOf(pVar.f63472a.getInt("y")).intValue(), (ProtoParcelable) new C23269n().mo28733b("reactAction", pVar), string3);
            } else if (str.equals("onShowReportContentDialog_com.google.geo.sidekick.ClientActionProto.ReportAction_java.lang.String")) {
                String string4 = pVar.f63472a.getString("actionTakenMessage");
                string4.getClass();
                this.f290571a.mo94171n((C7593ct) new C23271p(C7593ct.f26245g.getParserForType(), C62921ba.m95368a(), C7593ct.f26245g).mo28733b("reportAction", pVar), string4);
            } else if (str.equals("onShowWhyThisAd_com.google.geo.sidekick.ClientActionProto.WhyThisAdAction")) {
                this.f290571a.mo94160d((C7621du) new C23271p(C7621du.f26333f.getParserForType(), C62921ba.m95368a(), C7621du.f26333f).mo28733b("whyThisAdAction", pVar));
            } else if (str.equals("onToggleSaveAction_com.google.android.apps.sidekick.quantum.Modules.SaveAction_java.lang.String_boolean_boolean_boolean")) {
                String string5 = pVar.f63472a.getString("multiStateIconId");
                string5.getClass();
                boolean booleanValue2 = Boolean.valueOf(pVar.f63472a.getBoolean("useNightMode")).booleanValue();
                boolean booleanValue3 = Boolean.valueOf(pVar.f63472a.getBoolean("lightStatusBar")).booleanValue();
                boolean booleanValue4 = Boolean.valueOf(pVar.f63472a.getBoolean("lightNavBar")).booleanValue();
                this.f290571a.mo94172o((C9222dd) new C23271p(C9222dd.f31875c.getParserForType(), C62921ba.m95368a(), C9222dd.f31875c).mo28733b("saveAction", pVar), string5, booleanValue2, booleanValue3, booleanValue4);
            } else if (str.equals("onToggleToDefaultState_java.lang.String")) {
                String string6 = pVar.f63472a.getString("multiStateIconId");
                string6.getClass();
                ((C104535ac) this.f290571a).mo94244M(string6, 1);
            } else if (str.equals("openSilkMediaPane_java.lang.String")) {
                String string7 = pVar.f63472a.getString("url");
                string7.getClass();
                this.f290571a.mo94174q(string7);
            } else if (str.equals("openUrl_com.google.android.libraries.gsa.monet.shared.ProtoParcelable_com.google.common.base.Optional<java.lang.Long>")) {
                C58833ax e = new C23268m(new C23266k()).mo28733b("rvdt", pVar);
                this.f290571a.mo94175r((ProtoParcelable) new C23269n().mo28733b("clientAction", pVar), e);
            } else if (str.equals("openVideoInNewApp_com.google.android.libraries.gsa.monet.shared.ProtoParcelable")) {
                this.f290571a.mo94176s((ProtoParcelable) new C23269n().mo28733b("playVideoAction", pVar));
            } else if (str.equals("openVideoSettings")) {
                this.f290571a.mo94177t();
            } else if (str.equals("recordVeAction_com.google.geo.sidekick.CardActionProto.CardAction")) {
                ((C104535ac) this.f290571a).f290762i.mo85744d((C8194z) new C23271p(C8194z.f28777k.getParserForType(), C62921ba.m95368a(), C8194z.f28777k).mo28733b("cardAction", pVar));
            } else if (str.equals("resolveTooltipActionClick_gws.plugins.searchapp.proto.AwareTipProto.FeedTooltip.TipType")) {
                C23259d dVar = new C23259d(C69399au.values());
                int i = pVar.f63472a.getInt("type");
                this.f290571a.mo94178u((C69399au) dVar.f63738a[i]);
            } else if (str.equals("showSnackbarAndRefresh_java.lang.String_com.google.geo.sidekick.ClientTraceProto.@org.checkerframework.checker.nullness.qual.Nullable ClientTrace")) {
                String string8 = pVar.f63472a.getString("text");
                string8.getClass();
                C23259d dVar2 = new C23259d(C7642eo.values());
                int i2 = pVar.f63472a.getInt("clientTrace");
                this.f290571a.mo94179v(string8, (C7642eo) dVar2.f63738a[i2]);
            } else if (str.equals("showSnackbarWithRefreshAction_java.lang.String_java.lang.String_com.google.geo.sidekick.ClientTraceProto.@org.checkerframework.checker.nullness.qual.Nullable ClientTrace")) {
                String string9 = pVar.f63472a.getString("text");
                string9.getClass();
                String string10 = pVar.f63472a.getString("actionText");
                string10.getClass();
                C23259d dVar3 = new C23259d(C7642eo.values());
                int i3 = pVar.f63472a.getInt("clientTrace");
                this.f290571a.mo94180w(string9, string10, (C7642eo) dVar3.f63738a[i3]);
            }
        }
    }
}
