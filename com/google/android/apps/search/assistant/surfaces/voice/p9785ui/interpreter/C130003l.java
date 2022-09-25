package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter;

import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.p9535a.C127122b;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.p9535a.C127125e;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.p9535a.C127126f;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.p9535a.C127128h;
import com.google.android.apps.search.assistant.surfaces.voice.p9590e.C127405b;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129565ag;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129566ah;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129676j;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9729a.C128547d;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9729a.C128548e;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.p3926e.C51910dq;
import com.google.assistant.p3897e.p3921j.p3926e.C52042in;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import p3186j$.util.function.Consumer;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.l */
/* compiled from: PG */
final /* synthetic */ class C130003l implements Consumer {

    /* renamed from: a */
    final /* synthetic */ C129868c f356525a;

    public C130003l(C129868c cVar) {
        this.f356525a = cVar;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        C128548e eVar = (C128548e) obj;
        C69664n.m101061g(eVar, "p0");
        C129868c cVar = this.f356525a;
        C127122b bVar = (C127122b) eVar.f353476a;
        C59052c cVar2 = (C59052c) C129868c.f356274a.mo56224b();
        C51809dy dyVar = bVar.f350027b;
        if (dyVar == null) {
            dyVar = C51809dy.f135933f;
        }
        String str = dyVar.f135936b;
        cVar2.mo56379ah(new C59094n(38577));
        cVar2.mo56389s("Received ClientOp : %s", str);
        C51809dy dyVar2 = bVar.f350027b;
        if (dyVar2 == null) {
            dyVar2 = C51809dy.f135933f;
        }
        String str2 = dyVar2.f135936b;
        int hashCode = str2.hashCode();
        if (hashCode != -1106977946) {
            if (hashCode == 717469746 && str2.equals("ui.SHOW_INTERPRETER")) {
                C128547d b = eVar.mo108513b((Runnable) null);
                C127125e eVar2 = (C127125e) C127126f.f350033d.createBuilder();
                C69664n.m101060f(eVar2, "newBuilder()");
                C127128h a = C69664n.m101061g(eVar2, "builder");
                C51809dy dyVar3 = bVar.f350027b;
                if (dyVar3 == null) {
                    dyVar3 = C51809dy.f135933f;
                }
                C52070ec a2 = C127405b.m208357a(dyVar3, "show_interpreter_args", C51910dq.f136159t.getParserForType(), new C129976f(cVar));
                C69664n.m101060f(a2, "private fun handleShowIn…esults.ignore()\n    }\n  }");
                a.mo107954b(a2);
                long d = cVar.f356282i.mo26872d();
                C127125e eVar3 = a.f350038a;
                eVar3.copyOnWrite();
                C127126f fVar = (C127126f) eVar3.instance;
                fVar.f350035a |= 2;
                fVar.f350037c = d;
                b.mo108511a(a.mo107953a());
                return;
            }
        } else if (str2.equals("ui.CURRENT_ACTION_INDICATOR")) {
            C128547d b2 = eVar.mo108513b((Runnable) null);
            C127125e eVar4 = (C127125e) C127126f.f350033d.createBuilder();
            C69664n.m101060f(eVar4, "newBuilder()");
            C127128h a3 = C69664n.m101061g(eVar4, "builder");
            C51809dy dyVar4 = bVar.f350027b;
            if (dyVar4 == null) {
                dyVar4 = C51809dy.f135933f;
            }
            C52070ec a4 = C127405b.m208357a(dyVar4, "ui_current_action_indicator_args", C52042in.f136592c.getParserForType(), C129889e.f356322a);
            C69664n.m101060f(a4, "performSync(\n      reque…lientOpResults.ignore() }");
            a3.mo107954b(a4);
            b2.mo108511a(a3.mo107953a());
            return;
        }
        C129566ah ahVar = cVar.f356276c;
        C129676j jVar = bVar.f350028c;
        if (jVar == null) {
            jVar = C129676j.f355890c;
        }
        C69664n.m101060f(jVar, "request.navigationHint");
        C129565ag.m211551a(ahVar, jVar);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
