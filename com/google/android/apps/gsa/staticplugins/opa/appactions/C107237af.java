package com.google.android.apps.gsa.staticplugins.opa.appactions;

import android.os.Bundle;
import android.util.Base64;
import android.view.View;
import android.widget.ImageView;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.shared.appactions.C73828m;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.p7066m.C90019by;
import com.google.android.apps.gsa.staticplugins.opa.appactions.p8289b.C107260b;
import com.google.android.apps.gsa.staticplugins.opa.appactions.p8291d.C107279c;
import com.google.android.libraries.assistant.p1535p.C18509a;
import com.google.android.libraries.assistant.p1535p.C18522b;
import com.google.android.libraries.assistant.p1535p.C18523c;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.apps.tiktok.concurrent.futuresmixin.C46436b;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.assistant.p3825an.p3830c.p3831a.C49323co;
import com.google.assistant.p3825an.p3830c.p3831a.C49324cp;
import com.google.assistant.p3861at.C49838aw;
import com.google.assistant.p3861at.C50463y;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.appactions.af */
/* compiled from: PG */
final class C107237af implements C73828m {

    /* renamed from: a */
    final /* synthetic */ C107238ag f298440a;

    public C107237af(C107238ag agVar) {
        this.f298440a = agVar;
    }

    /* renamed from: a */
    public final void mo18321a(View view) {
        this.f298440a.f298455o.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(view));
    }

    /* renamed from: b */
    public final void mo18322b(View view) {
        this.f298440a.f298455o.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(view));
        C107308i iVar = this.f298440a.f298461u;
        iVar.getClass();
        if (!iVar.mo95865o().isPresent()) {
            ((C59052c) ((C59052c) C107238ag.f298441a.mo56224b()).mo56372aa(23551)).mo56386p("Starting shortcut query dialog");
            C107238ag agVar = this.f298440a;
            agVar.f298458r.mo95888a(agVar.f298442b.getActivity(), this.f298440a.f298442b.getContext(), (String) this.f298440a.f298461u.mo95857h().orElse(BuildConfig.FLAVOR), new C107236ae(this)).e();
        } else if (this.f298440a.f298457q.mo79746e(C90019by.f248053C)) {
            C107308i iVar2 = this.f298440a.f298461u;
            iVar2.getClass();
            if (iVar2.mo95855f().isPresent() && this.f298440a.f298461u.mo95865o().isPresent()) {
                C49323co coVar = (C49323co) C49324cp.f127477d.createBuilder();
                String str = (String) this.f298440a.f298461u.mo95855f().get();
                coVar.copyOnWrite();
                str.getClass();
                ((C49324cp) coVar.instance).f127481c = str;
                C63088z zVar = (C63088z) this.f298440a.f298461u.mo95865o().get();
                coVar.copyOnWrite();
                C49324cp cpVar = (C49324cp) coVar.instance;
                zVar.getClass();
                cpVar.f127479a = 3;
                cpVar.f127480b = zVar;
                Bundle bundle = new Bundle();
                bundle.putString("assistant_settings_app_shortcut_detailed_page_extra", Base64.encodeToString(((C49324cp) coVar.build()).toByteArray(), 10));
                C107324y yVar = this.f298440a.f298442b;
                C18509a c = C18522b.m35986c();
                C18523c cVar = (C18523c) c;
                cVar.f52492a = "app_actions";
                cVar.f52493b = bundle;
                yVar.startActivityForResult(c.mo24020b().mo24031a(), 0);
                C47393f.m84236g(new C107260b(), this.f298440a.f298442b);
            }
        }
    }

    /* renamed from: c */
    public final void mo18323c(ImageView imageView) {
        if (imageView != null && this.f298440a.f298462v.mo56113h()) {
            imageView.setVisibility(0);
            C107238ag agVar = this.f298440a;
            agVar.f298456p.mo85421i(((C49838aw) agVar.f298462v.mo56107c()).f129509d, imageView);
        }
    }

    /* renamed from: d */
    public final void mo18324d(ImageView imageView) {
        C58833ax j = C58833ax.m90833j(((C86054o) this.f298440a.f298453m.mo27525b()).mo79659F());
        if (imageView != null && j.mo56113h()) {
            this.f298440a.f298452l.b((String) j.mo56107c(), imageView);
        }
    }

    /* renamed from: e */
    public final void mo18325e(View view) {
        this.f298440a.f298455o.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(view));
        C47393f.m84236g(new C107260b(), this.f298440a.f298442b);
    }

    /* renamed from: f */
    public final void mo18326f(View view) {
        this.f298440a.f298454n.f76997b.mo33800a(C28427h.m53115a(105506)).mo33811d(view);
    }

    /* renamed from: g */
    public final void mo18327g() {
        if (this.f298440a.f298457q.mo79746e(C90019by.f248053C)) {
            C107238ag agVar = this.f298440a;
            C107279c cVar = agVar.f298446f;
            C107308i iVar = agVar.f298461u;
            iVar.getClass();
            C50463y a = cVar.mo95891a(iVar, true);
            C107238ag agVar2 = this.f298440a;
            C46439e eVar = agVar2.f298449i;
            C46438d a2 = C46438d.m82809a(agVar2.f298443c.mo95894b(a));
            C46436b a3 = C46436b.m82808a(a);
            C107305f fVar = this.f298440a.f298459s;
            fVar.getClass();
            eVar.mo50445g(a2, a3, fVar);
        }
    }

    /* renamed from: h */
    public final void mo18328h(View view) {
        this.f298440a.f298454n.f76997b.mo33800a(C28427h.m53115a(118768)).mo33811d(view);
    }

    /* renamed from: i */
    public final void mo18329i(View view) {
        this.f298440a.f298454n.f76997b.mo33800a(C28427h.m53115a(118769)).mo33811d(view);
    }

    /* renamed from: j */
    public final /* synthetic */ void mo18330j(View view) {
    }

    /* renamed from: k */
    public final void mo18331k(View view) {
        this.f298440a.f298455o.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(view));
        this.f298440a.f298448h.mo65296c(C89849ae.APP_ACTIONS_OVERLAY_SHORTCUT_SAVE_CLICKED);
        this.f298440a.mo95844c();
    }

    /* renamed from: l */
    public final void mo18332l(View view) {
        this.f298440a.f298454n.f76997b.mo33800a(C28427h.m53115a(105510)).mo33811d(view);
    }

    /* renamed from: m */
    public final /* synthetic */ void mo18333m(View view) {
    }

    /* renamed from: n */
    public final /* synthetic */ void mo18334n(View view) {
    }
}
