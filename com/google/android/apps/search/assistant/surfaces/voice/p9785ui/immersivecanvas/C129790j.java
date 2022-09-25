package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas;

import android.support.p031v4.app.C0154a;
import android.view.View;
import com.google.android.apps.search.assistant.surfaces.voice.p9590e.C127406c;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.uielements.suggestion.C129320i;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.p9848d.C129758b;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.webapp.AutoValue_CanvasWebAppFragmentPeer_CanvasPostMessageConfig;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.webapp.C129836c;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.webapp.CanvasWebAppFragmentPeer;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.webapp.CanvasWebAppViewModel;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.web.base.C43259j;
import com.google.android.libraries.web.base.C43264o;
import com.google.android.libraries.web.base.C43265p;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.p3926e.C51870cd;
import com.google.assistant.p3897e.p3921j.p3926e.C51885cs;
import com.google.common.p4526f.C59052c;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5100a.p5101a.p5102a.C65504a;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5100a.p5101a.p5102a.C65505b;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5100a.p5103b.p5104a.C65518b;
import dagger.hilt.android.internal.managers.C68324h;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.j */
/* compiled from: PG */
public final /* synthetic */ class C129790j implements Function {

    /* renamed from: a */
    public final /* synthetic */ C129739aa f356130a;

    public /* synthetic */ C129790j(C129739aa aaVar) {
        this.f356130a = aaVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C129739aa aaVar = this.f356130a;
        C51885cs csVar = (C51885cs) obj;
        if (csVar.f136104w) {
            ((C59052c) ((C59052c) C129739aa.f356023a.mo56224b()).mo56372aa(38424)).mo56386p("switchToPauseMode");
            aaVar.mo109209e(true);
            View view = aaVar.f356025b.getView();
            view.getClass();
            View findViewById = view.findViewById(R.id.assistant_canvas_container);
            View findViewById2 = view.findViewById(R.id.assistant_canvas_header_container);
            View findViewById3 = view.findViewById(R.id.assistant_canvas_paused_content);
            findViewById.setVisibility(4);
            findViewById2.setVisibility(4);
            findViewById3.setVisibility(0);
            ((C59052c) ((C59052c) C129739aa.f356023a.mo56224b()).mo56372aa(38412)).mo56386p("Immersive canvas paused");
            return C127406c.f350821b;
        }
        if (aaVar.mo109211g()) {
            C129320i iVar = (C129320i) aaVar.f356025b.getChildFragmentManager().f634a.mo670b(R.id.assistant_canvas_suggestion_chip_wrapper);
            if (iVar != null) {
                iVar.mo17754z().mo108972e();
            }
            aaVar.mo109210f();
            ((C59052c) ((C59052c) C129739aa.f356023a.mo56224b()).mo56372aa(38411)).mo56386p("Immersive canvas unpaused");
        }
        if (((C129758b) aaVar.f356025b.getChildFragmentManager().f634a.mo670b(R.id.assistant_canvas_header_container)) == null) {
            AccountId accountId = aaVar.f356028e;
            C51870cd cdVar = csVar.f136105x;
            if (cdVar == null) {
                cdVar = C51870cd.f136053c;
            }
            C65504a aVar = (C65504a) C65505b.f178063b.createBuilder();
            aVar.copyOnWrite();
            cdVar.getClass();
            ((C65505b) aVar.instance).f178065a = cdVar;
            C129758b bVar = new C129758b();
            C68324h.m98669f(bVar);
            C47247a.m84047b(bVar, accountId);
            C47243l.m84039a(bVar, (C65505b) aVar.build());
            C0154a aVar2 = new C0154a(aaVar.f356025b.getChildFragmentManager());
            aVar2.mo511h(R.id.assistant_canvas_header_container, bVar, "CanvasHeaderFragment", 1);
            aVar2.mo509f();
        }
        C43264o oVar = (C43264o) aaVar.f356025b.getChildFragmentManager().f634a.mo670b(R.id.assistant_canvas_container);
        if (oVar == null) {
            AccountId accountId2 = aaVar.f356028e;
            C43259j jVar = new C43259j();
            jVar.mo46374d(new AutoValue_CanvasWebAppFragmentPeer_CanvasPostMessageConfig());
            C43264o a = C43265p.m76349a(accountId2, jVar.mo46371a());
            C0154a aVar3 = new C0154a(aaVar.f356025b.getChildFragmentManager());
            aVar3.mo511h(R.id.assistant_canvas_container, a, "ApaWebFragment", 1);
            aVar3.mo509f();
            AccountId accountId3 = aaVar.f356028e;
            C65518b a2 = CanvasWebAppFragmentPeer.m211923a(csVar);
            C129836c cVar = new C129836c();
            C68324h.m98669f(cVar);
            C47247a.m84047b(cVar, accountId3);
            C47243l.m84039a(cVar, a2);
            a.mo17754z().mo46380b(cVar);
            if (csVar.f136099r) {
                CanvasWebAppViewModel canvasWebAppViewModel = cVar.mo17754z().f356170x;
                canvasWebAppViewModel.getClass();
                canvasWebAppViewModel.f356177b = true;
            }
            return C129739aa.m211808b(csVar, cVar);
        }
        try {
            C129836c cVar2 = (C129836c) oVar.mo17754z().mo46379a();
            cVar2.mo17754z().f356171y = CanvasWebAppFragmentPeer.m211923a(csVar);
            return C129739aa.m211808b(csVar, cVar2);
        } catch (NullPointerException unused) {
            ((C59052c) ((C59052c) C129739aa.f356023a.mo56226d()).mo56372aa(38410)).mo56386p("Web app fragment cannot be found.");
            return C127406c.m208359a(C52235kf.INTERNAL);
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
