package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.widget.RemoteViews;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88092ow;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88093ox;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88094oy;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.staticplugins.opa.C109133gv;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107698i;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107710u;
import com.google.android.apps.search.assistant.platform.p9139g.p9140a.C120904a;
import com.google.android.apps.search.assistant.platform.p9139g.p9140a.C120918an;
import com.google.android.apps.search.assistant.platform.p9139g.p9140a.C120941bj;
import com.google.assistant.p3795af.p3796a.p3797a.C48775a;
import com.google.assistant.p3897e.p3921j.C51803ds;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.apx;
import com.google.assistant.p3897e.p3921j.apy;
import com.google.assistant.p3931f.p3939c.C52813ac;
import com.google.assistant.p3931f.p3939c.C52829f;
import com.google.assistant.p3931f.p3939c.C52849z;
import com.google.assistant.p3931f.p3940d.p3941a.C52860aj;
import com.google.assistant.p3931f.p3940d.p3941a.C52866ap;
import com.google.assistant.p3931f.p3940d.p3941a.C52875ay;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;
import p3186j$.util.Optional;
import p3186j$.util.function.Supplier;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.gb */
/* compiled from: PG */
public final class C108367gb implements C120904a {

    /* renamed from: a */
    final /* synthetic */ Supplier f301414a;

    /* renamed from: b */
    final /* synthetic */ Optional f301415b;

    /* renamed from: c */
    final /* synthetic */ C107698i f301416c;

    /* renamed from: d */
    final /* synthetic */ C107710u f301417d;

    /* renamed from: e */
    final /* synthetic */ C108368gc f301418e;

    public C108367gb(Supplier supplier, Optional optional, C107698i iVar, C107710u uVar, C108368gc gcVar) {
        this.f301414a = supplier;
        this.f301415b = optional;
        this.f301416c = iVar;
        this.f301417d = uVar;
        this.f301418e = gcVar;
    }

    /* renamed from: a */
    public final void mo96810a(C52829f fVar) {
        C69664n.m101061g(fVar, "appActionsContext");
        C107698i iVar = this.f301416c;
        C69664n.m101061g(iVar, "opaClientEventSender");
        C69664n.m101061g(fVar, "appActionsContext");
        if (fVar.f138613a.size() > 0) {
            apx apx = (apx) apy.f135589f.createBuilder();
            apx.mo58885m(C48775a.f126209a, fVar);
            apx.copyOnWrite();
            apy apy = (apy) apx.instance;
            apy.f135591a |= 8;
            apy.f135595e = false;
            C62942bv build = apx.build();
            C69664n.m101060f(build, "newBuilder()\n        .se…minated)\n        .build()");
            C51803ds dsVar = (C51803ds) C51805du.f135924e.createBuilder();
            dsVar.copyOnWrite();
            C51805du duVar = (C51805du) dsVar.instance;
            duVar.f135926a |= 1;
            duVar.f135927b = "widget.DIALOG_INFO";
            C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
            jzVar.copyOnWrite();
            C52230ka kaVar = (C52230ka) jzVar.instance;
            kaVar.f137059a |= 1;
            kaVar.f137060b = "assistant.api.client_input.WidgetDialogInfoInput";
            C63088z byteString = ((apy) build).toByteString();
            jzVar.copyOnWrite();
            C52230ka kaVar2 = (C52230ka) jzVar.instance;
            byteString.getClass();
            kaVar2.f137059a |= 2;
            kaVar2.f137061c = byteString;
            dsVar.mo53729a("widget_dialog_info_input", (C52230ka) jzVar.build());
            C62942bv build2 = dsVar.build();
            C69664n.m101060f(build2, "newBuilder()\n        .se…       )\n        .build()");
            C88489j jVar = new C88489j(C87739bu.OPA_CLIENT_INPUT);
            C62940bt btVar = C88092ow.f238173a;
            C88093ox oxVar = (C88093ox) C88094oy.f238174g.createBuilder();
            C63088z byteString2 = ((C51805du) build2).toByteString();
            oxVar.copyOnWrite();
            C88094oy oyVar = (C88094oy) oxVar.instance;
            byteString2.getClass();
            oyVar.f238176a |= 1;
            oyVar.f238177b = byteString2;
            jVar.mo82014b(btVar, oxVar.build());
            iVar.mo96219b(jVar.mo82013a());
        }
    }

    /* renamed from: b */
    public final void mo96811b(RemoteViews remoteViews, C52860aj ajVar) {
        C69664n.m101061g(ajVar, "remoteViewsInfo");
        ((C109133gv) this.f301414a).f303901a.mo97713c().ifPresent(new C108361fw(remoteViews, ajVar));
    }

    /* renamed from: c */
    public final void mo96812c(C120918an anVar, C52813ac acVar) {
        C69664n.m101061g(anVar, "endingStatus");
        this.f301417d.mo96221d(this.f301418e, C88244um.TTS_PLAYBACK_DONE);
        if (anVar == C120918an.FAILED) {
            ((C109133gv) this.f301414a).f303901a.mo97713c().ifPresent(C108362fx.f301410a);
        }
        C107698i iVar = this.f301416c;
        apx apx = (apx) apy.f135589f.createBuilder();
        apx.copyOnWrite();
        apy apy = (apy) apx.instance;
        apy.f135591a |= 8;
        apy.f135595e = true;
        if (acVar != null) {
            apx.mo58885m(C48775a.f126210b, acVar);
        }
        C51803ds dsVar = (C51803ds) C51805du.f135924e.createBuilder();
        dsVar.copyOnWrite();
        C51805du duVar = (C51805du) dsVar.instance;
        duVar.f135926a |= 1;
        duVar.f135927b = "widget.DIALOG_INFO";
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = "assistant.api.client_input.WidgetDialogInfoInput";
        C63088z byteString = ((apy) apx.build()).toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        byteString.getClass();
        kaVar2.f137059a |= 2;
        kaVar2.f137061c = byteString;
        dsVar.mo53729a("widget_dialog_info_input", (C52230ka) jzVar.build());
        C62942bv build = dsVar.build();
        C69664n.m101060f(build, "newBuilder()\n        .se…       )\n        .build()");
        C88489j jVar = new C88489j(C87739bu.OPA_CLIENT_INPUT);
        C62940bt btVar = C88092ow.f238173a;
        C88093ox oxVar = (C88093ox) C88094oy.f238174g.createBuilder();
        C63088z byteString2 = ((C51805du) build).toByteString();
        oxVar.copyOnWrite();
        C88094oy oyVar = (C88094oy) oxVar.instance;
        byteString2.getClass();
        oyVar.f238176a = 1 | oyVar.f238176a;
        oyVar.f238177b = byteString2;
        jVar.mo82014b(btVar, oxVar.build());
        iVar.mo96219b(jVar.mo82013a());
    }

    /* renamed from: d */
    public final void mo96813d(C52866ap apVar) {
        C69664n.m101061g(apVar, "config");
        ((C109133gv) this.f301414a).f303901a.mo97713c().ifPresent(new C108363fy());
    }

    /* renamed from: e */
    public final void mo96814e(C120941bj bjVar) {
        C69664n.m101061g(bjVar, "responses");
        ((C109133gv) this.f301414a).f303901a.mo97713c().ifPresent(new C108364fz(bjVar));
    }

    /* renamed from: f */
    public final void mo96815f(C52849z zVar) {
        C69664n.m101061g(zVar, "speech");
        Optional optional = this.f301415b;
        C107698i iVar = this.f301416c;
        C107710u uVar = this.f301417d;
        C108368gc gcVar = this.f301418e;
        String str = zVar.f138660c;
        C69664n.m101060f(str, "speech.language");
        String str2 = zVar.f138658a == 1 ? (String) zVar.f138659b : BuildConfig.FLAVOR;
        C69664n.m101060f(str2, "speech.textToSpeech");
        C108371gf.m180144a(optional, iVar, uVar, gcVar, str, str2);
    }

    /* renamed from: g */
    public final void mo96816g(String str) {
        C69664n.m101061g(str, "text");
        ((C109133gv) this.f301414a).f303901a.mo97713c().ifPresent(new C108366ga(str));
    }

    /* renamed from: h */
    public final /* synthetic */ void mo96817h(C52875ay ayVar) {
        C69664n.m101061g(ayVar, "tileLayout");
    }
}
