package com.google.android.apps.gsa.staticplugins.actions.p7353a;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.apps.gsa.p8889z.p8891b.p8892a.C118850a;
import com.google.android.apps.gsa.search.core.C85741ce;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.shared.actions.C87501w;
import com.google.android.apps.gsa.search.shared.actions.PermissionPuntAction;
import com.google.android.apps.gsa.search.shared.actions.PuntAction;
import com.google.android.apps.gsa.search.shared.actions.SearchError;
import com.google.android.apps.gsa.search.shared.actions.SoundSearchResult;
import com.google.android.apps.gsa.search.shared.actions.VoiceInteractionAction;
import com.google.android.apps.gsa.search.shared.actions.core.ButtonAction;
import com.google.android.apps.gsa.search.shared.actions.core.C87407f;
import com.google.android.apps.gsa.search.shared.actions.core.HelpAction;
import com.google.android.apps.gsa.search.shared.actions.core.ModularAnswer;
import com.google.android.apps.gsa.search.shared.actions.core.NarrativeNewsAction;
import com.google.android.apps.gsa.search.shared.actions.core.ReadNotificationAction;
import com.google.android.apps.gsa.search.shared.actions.core.ShowContactInformationAction;
import com.google.android.apps.gsa.search.shared.actions.core.VoiceDelightAction;
import com.google.android.apps.gsa.search.shared.actions.modular.ModularAction;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.C87449m;
import com.google.android.apps.gsa.shared.p6968aa.C89037bh;
import com.google.android.apps.gsa.shared.p7066m.C90110fh;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.staticplugins.actions.p7358d.C93327n;
import com.google.android.apps.gsa.staticplugins.actions.p7361g.C93391e;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.android.libraries.search.p3047m.p3054d.C39239a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58881cr;

/* renamed from: com.google.android.apps.gsa.staticplugins.actions.a.b */
/* compiled from: PG */
final class C93270b implements C87501w, C87407f {

    /* renamed from: a */
    final /* synthetic */ C93271c f260061a;

    /* renamed from: b */
    private final C58833ax f260062b;

    public C93270b(C93271c cVar, C58833ax axVar) {
        this.f260061a = cVar;
        this.f260062b = axVar;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo81494a(PermissionPuntAction permissionPuntAction) {
        return mo87601n();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo81495b(PuntAction puntAction) {
        return mo87601n();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo81496c(SearchError searchError) {
        if (searchError.mo81138R(16384)) {
            return new C93293y(this.f260061a.f260075a, "android.settings.DATE_SETTINGS");
        }
        if (searchError.mo81138R(2048)) {
            C93271c cVar = this.f260061a;
            return new C93294z(cVar.f260075a, cVar.f260089o.mo79758x(C90110fh.f250714t));
        } else if (searchError.mo81138R(8)) {
            C93271c cVar2 = this.f260061a;
            return new C93292x(cVar2.f260087m, cVar2.f260088n);
        } else if (searchError.mo81138R(16) && ((C89037bh) this.f260061a.f260093s.mo27525b()).mo27384j()) {
            return new C93293y(this.f260061a.f260075a, "android.settings.AIRPLANE_MODE_SETTINGS");
        } else {
            C93271c cVar3 = this.f260061a;
            if (cVar3.f260066D == null) {
                cVar3.f260066D = new C93254ab(cVar3.f260075a, cVar3.f260076b);
            }
            return cVar3.f260066D;
        }
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ Object mo81497d(SoundSearchResult soundSearchResult) {
        C93271c cVar = this.f260061a;
        if (cVar.f260065C == null) {
            cVar.f260065C = new C93267ao(cVar.f260075a, cVar.f260076b);
        }
        return cVar.f260065C;
    }

    /* renamed from: e */
    public final /* synthetic */ Object mo81498e(VoiceInteractionAction voiceInteractionAction) {
        return this.f260061a.mo87603b();
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ Object mo81499f(ModularAction modularAction) {
        ContentResolver contentResolver;
        C93271c cVar = this.f260061a;
        C91097g gVar = cVar.f260076b;
        C58833ax axVar = cVar.f260077c;
        Context context = cVar.f260075a;
        C87449m mVar = new C87449m(context);
        C93271c cVar2 = this.f260061a;
        PackageManager packageManager = cVar2.f260078d;
        C118850a aVar = (C118850a) cVar2.f260081g.mo27525b();
        C93271c cVar3 = this.f260061a;
        C58881cr crVar = cVar3.f260082h;
        if (cVar3.f260068F == null) {
            cVar3.f260068F = new C93327n((SharedPreferences) cVar3.f260094t.mo27525b());
        }
        C93327n nVar = cVar3.f260068F;
        C85741ce ceVar = (C85741ce) this.f260061a.f260083i.mo27525b();
        C93271c cVar4 = this.f260061a;
        if (cVar4.f260067E == null) {
            C86054o oVar = cVar4.f260095u;
            if (Build.VERSION.SDK_INT >= 30) {
                contentResolver = C39239a.m68666a(cVar4.f260075a, C39226b.TAG_CLASSIC_ASSISTANT_LEGACY).getContentResolver();
            } else {
                contentResolver = cVar4.f260075a.getContentResolver();
            }
            cVar4.f260067E = new C93391e(oVar, contentResolver);
        }
        C93391e eVar = cVar4.f260067E;
        C93271c cVar5 = this.f260061a;
        return new C93286r(gVar, axVar, context, mVar, packageManager, aVar, crVar, nVar, ceVar, eVar, cVar5.f260099y, cVar5.f260079e, cVar5.f260080f, cVar5.f260091q, cVar5.f260092r, cVar5.f260084j, cVar5.f260085k, cVar5.f260086l, this.f260062b, cVar5.f260096v, cVar5.f260089o, cVar5.f260090p, cVar5.f260097w, cVar5.f260070H, cVar5.f260073K, cVar5.f260094t, cVar5.f260069G, cVar5.f260071I, cVar5.f260072J, cVar5.f260100z);
    }

    /* renamed from: g */
    public final /* synthetic */ Object mo81162g(ButtonAction buttonAction) {
        return this.f260061a.mo87603b();
    }

    /* renamed from: h */
    public final /* synthetic */ Object mo81163h(HelpAction helpAction) {
        return this.f260061a.mo87603b();
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ Object mo81164i(ModularAnswer modularAnswer) {
        return (C93249a) this.f260061a.f260098x.mo27525b();
    }

    /* renamed from: j */
    public final /* synthetic */ Object mo81165j(NarrativeNewsAction narrativeNewsAction) {
        return new C93290v();
    }

    /* renamed from: k */
    public final /* synthetic */ Object mo81166k(ReadNotificationAction readNotificationAction) {
        return this.f260061a.mo87603b();
    }

    /* renamed from: l */
    public final /* bridge */ /* synthetic */ Object mo81167l(ShowContactInformationAction showContactInformationAction) {
        C93271c cVar = this.f260061a;
        if (cVar.f260064B == null) {
            cVar.f260064B = new C93255ac(cVar.f260076b, cVar.f260075a);
        }
        return cVar.f260064B;
    }

    /* renamed from: m */
    public final /* synthetic */ Object mo81168m(VoiceDelightAction voiceDelightAction) {
        return this.f260061a.mo87603b();
    }

    /* renamed from: n */
    public final C93249a mo87601n() {
        C93271c cVar = this.f260061a;
        if (cVar.f260063A == null) {
            cVar.f260063A = new C93253aa(cVar.f260075a, cVar.f260076b);
        }
        return cVar.f260063A;
    }
}
