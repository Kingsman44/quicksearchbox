package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas;

import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.p9535a.C127122b;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.p9535a.C127125e;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.p9535a.C127126f;
import com.google.android.apps.search.assistant.surfaces.voice.p9590e.C127405b;
import com.google.android.apps.search.assistant.surfaces.voice.p9590e.C127406c;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.C129146c;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.C129228e;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.uielements.suggestion.C129320i;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129662i;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129676j;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.p9849e.C129766b;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9729a.C128547d;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9729a.C128548e;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.akz;
import com.google.assistant.p3897e.p3921j.p3926e.C51885cs;
import com.google.assistant.p3897e.p3921j.p3926e.C51986gl;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59052c;
import p3186j$.util.Optional;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.z */
/* compiled from: PG */
public final /* synthetic */ class C129852z implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C129739aa f356251a;

    public /* synthetic */ C129852z(C129739aa aaVar) {
        this.f356251a = aaVar;
    }

    public final void accept(Object obj) {
        C52070ec ecVar;
        C129739aa aaVar = this.f356251a;
        C128548e eVar = (C128548e) obj;
        C59052c cVar = (C59052c) ((C59052c) C129739aa.f356023a.mo56224b()).mo56372aa(38416);
        C51809dy dyVar = ((C127122b) eVar.f353476a).f350027b;
        if (dyVar == null) {
            dyVar = C51809dy.f135933f;
        }
        cVar.mo56389s("onClientOp: %s", dyVar.f135936b);
        aaVar.f356030g.mo109226b(false);
        C127122b bVar = (C127122b) eVar.f353476a;
        C129676j jVar = bVar.f350028c;
        if (jVar == null) {
            jVar = C129676j.f355890c;
        }
        C129676j jVar2 = bVar.f350028c;
        if (jVar2 == null) {
            jVar2 = C129676j.f355890c;
        }
        C51809dy dyVar2 = bVar.f350027b;
        if (dyVar2 == null) {
            dyVar2 = C51809dy.f135933f;
        }
        String str = dyVar2.f135936b;
        C129662i a = C129662i.m211713a(jVar2.f355893b);
        if (a == null) {
            a = C129662i.DEFAULT_NOT_VISIBLE;
        }
        if (!a.equals(C129662i.DEFAULT_NOT_VISIBLE)) {
            C129662i a2 = C129662i.m211713a(jVar2.f355893b);
            if (a2 == null) {
                a2 = C129662i.DEFAULT_NOT_VISIBLE;
            }
            if (!a2.equals(C129662i.IMMERSIVE_CANVAS) && !C58528ij.m90015O("ui.SHOW_HTML_IMMERSIVE", "storybooks.PERFORM_OPERATION", "ui.THIRD_PARTY_START_INDICATOR", "ui.THIRD_PARTY_EXIT_INDICATOR", "ui.SHOW_SUGGESTIONS", "ui.HIGHLIGHT_USER_QUERY", new String[0]).contains(str) && (!aaVar.f356029f.containsKey(str) || !aaVar.mo109211g())) {
                aaVar.f356027d.mo109105a(jVar);
                return;
            }
        }
        C128547d b = eVar.mo108513b((Runnable) null);
        C51809dy dyVar3 = bVar.f350027b;
        if (dyVar3 == null) {
            dyVar3 = C51809dy.f135933f;
        }
        String str2 = dyVar3.f135936b;
        aaVar.mo109208d();
        C51809dy dyVar4 = bVar.f350027b;
        if (dyVar4 == null) {
            dyVar4 = C51809dy.f135933f;
        }
        String str3 = dyVar4.f135936b;
        if (str3.equals("ui.SHOW_HTML_IMMERSIVE")) {
            C51809dy dyVar5 = bVar.f350027b;
            if (dyVar5 == null) {
                dyVar5 = C51809dy.f135933f;
            }
            C52070ec a3 = C127405b.m208357a(dyVar5, "show_html_immersive_args", C51885cs.f136078y.getParserForType(), new C129790j(aaVar));
            C127125e eVar2 = (C127125e) C127126f.f350033d.createBuilder();
            eVar2.copyOnWrite();
            C127126f fVar = (C127126f) eVar2.instance;
            a3.getClass();
            fVar.f350036b = a3;
            fVar.f350035a |= 1;
            long d = aaVar.f356036m.mo26872d();
            eVar2.copyOnWrite();
            C127126f fVar2 = (C127126f) eVar2.instance;
            fVar2.f350035a |= 2;
            fVar2.f350037c = d;
            b.mo108511a((C127126f) eVar2.build());
        } else if (str3.equals("storybooks.PERFORM_OPERATION")) {
            if (aaVar.f356025b.getChildFragmentManager().f634a.mo670b(R.id.assistant_canvas_container) == null) {
                ecVar = C127406c.f350821b;
            } else {
                C51809dy dyVar6 = bVar.f350027b;
                if (dyVar6 == null) {
                    dyVar6 = C51809dy.f135933f;
                }
                ecVar = C127405b.m208357a(dyVar6, "storybooks_perform_operation_args", akz.f135298c.getParserForType(), new C129802v(aaVar));
            }
            C129739aa.m211810h(b, ecVar);
        } else if (str3.equals("ui.SHOW_SUGGESTIONS")) {
            C129676j jVar3 = bVar.f350028c;
            if (jVar3 == null) {
                jVar3 = C129676j.f355890c;
            }
            C129662i a4 = C129662i.m211713a(jVar3.f355893b);
            if (a4 == null) {
                a4 = C129662i.DEFAULT_NOT_VISIBLE;
            }
            if (a4.equals(C129662i.ESCAPE_HATCH)) {
                aaVar.f356027d.mo109105a(jVar3);
            } else {
                C129320i iVar = (C129320i) aaVar.f356025b.getChildFragmentManager().f634a.mo670b(R.id.assistant_canvas_suggestion_chip_wrapper);
                C51809dy dyVar7 = bVar.f350027b;
                if (dyVar7 == null) {
                    dyVar7 = C51809dy.f135933f;
                }
                C129739aa.m211810h(b, C127405b.m208357a(dyVar7, "show_suggestions_args", C51986gl.f136421f.getParserForType(), new C129797q(iVar)));
            }
        } else if (str3.equals("ui.THIRD_PARTY_START_INDICATOR")) {
            C129739aa.m211810h(b, C127406c.f350821b);
        } else if (str3.equals("ui.HIGHLIGHT_USER_QUERY")) {
            C129739aa.m211810h(b, C127406c.f350821b);
        } else if (str3.equals("ui.THIRD_PARTY_EXIT_INDICATOR")) {
            C129739aa.m211810h(b, C127406c.f350821b);
            aaVar.f356035l.mo109262g();
        } else {
            try {
                C129146c cVar2 = (C129146c) aaVar.f356029f.get(str3);
                if (cVar2 == null) {
                    C129739aa.m211810h(b, C127406c.m208359a(C52235kf.NOT_FOUND));
                } else {
                    C51809dy dyVar8 = bVar.f350027b;
                    if (dyVar8 == null) {
                        dyVar8 = C51809dy.f135933f;
                    }
                    C129228e a5 = cVar2.mo108791a(dyVar8);
                    Fragment fragment = a5.f354976d;
                    if (fragment != null) {
                        C0154a aVar = new C0154a(aaVar.f356025b.getChildFragmentManager());
                        aVar.mo511h(R.id.assistant_canvas_paused_content, fragment, (String) null, 1);
                        aVar.mo509f();
                    }
                    C129739aa.m211810h(b, a5.f354975c);
                }
            } catch (Throwable th) {
                ((C59052c) ((C59052c) ((C59052c) C129739aa.f356023a.mo56225c()).mo56382g(th)).mo56372aa(38421)).mo56386p("Error while processing client op.");
                C129739aa.m211810h(b, C127406c.m208359a(C52235kf.INTERNAL));
            }
        }
        Optional.ofNullable((C129766b) aaVar.f356025b.getChildFragmentManager().f634a.mo671c("ImmersiveCanvasPlateFragment")).ifPresent(C129801u.f356141a);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
