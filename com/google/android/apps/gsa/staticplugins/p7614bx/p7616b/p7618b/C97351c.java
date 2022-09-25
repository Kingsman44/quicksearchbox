package com.google.android.apps.gsa.staticplugins.p7614bx.p7616b.p7618b;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.gsa.shared.p7129r.C90461c;
import com.google.android.apps.gsa.shared.p7129r.C90464f;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.staticplugins.p7614bx.p7616b.p7617a.C97320ae;
import com.google.android.apps.gsa.staticplugins.p7614bx.p7616b.p7617a.C97326d;
import com.google.android.apps.gsa.staticplugins.p7614bx.p7616b.p7617a.C97327e;
import com.google.android.apps.gsa.staticplugins.p7614bx.p7616b.p7617a.C97330h;
import com.google.android.apps.gsa.staticplugins.p7614bx.p7616b.p7617a.C97331i;
import com.google.android.apps.gsa.staticplugins.p7614bx.p7616b.p7617a.C97345w;
import com.google.android.apps.gsa.staticplugins.p7614bx.p7621d.p7622a.C97420a;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.shared.C23113i;
import com.google.android.libraries.gsa.monet.shared.C23120p;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23268m;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23269n;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23272q;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;

/* renamed from: com.google.android.apps.gsa.staticplugins.bx.b.b.c */
/* compiled from: PG */
public final class C97351c implements C23113i {

    /* renamed from: a */
    private final C97349a f271881a;

    public C97351c(C97349a aVar) {
        this.f271881a = aVar;
    }

    /* renamed from: a */
    public final void mo28561a(String str, String str2, Parcelable parcelable) {
        if ("ParticleDiscEventsDispatcher".equals(str2) && (parcelable instanceof Bundle)) {
            C23120p pVar = new C23120p((Bundle) parcelable);
            if (str.equals("onAccountChanged_com.google.common.base.Optional<java.lang.String>")) {
                this.f271881a.mo90651m(new C23268m(new C23272q()).mo28733b("accountNameOptional", pVar));
            } else if (str.equals("onChromeIncognitoSearchMenuItemClicked")) {
                C97320ae aeVar = (C97320ae) this.f271881a;
                aeVar.mo90647i(1455);
                if (aeVar.f271807q) {
                    aeVar.mo90646h();
                } else {
                    ((C23251a) aeVar.f271793c.mo90633f()).mo28730f(true, false);
                }
            } else if (str.equals("onGoogleAppIncognitoModeMenuItemClicked")) {
                C97349a aVar = this.f271881a;
                C97320ae aeVar2 = (C97320ae) aVar;
                aeVar2.f271804n.mo77506a(aeVar2.f271795e, ((C23056g) aVar).f63405W, new C97345w(aeVar2), 2, aeVar2.f271805o);
            } else if (str.equals("onIncognitoInterstitialCancelled")) {
                C97320ae aeVar3 = (C97320ae) this.f271881a;
                aeVar3.mo90647i(1457);
                ((C23251a) aeVar3.f271793c.mo90633f()).mo28730f(false, false);
            } else if (str.equals("onIncognitoInterstitialContinueClicked")) {
                C97320ae aeVar4 = (C97320ae) this.f271881a;
                aeVar4.mo90647i(1454);
                ((C23251a) aeVar4.f271793c.mo90633f()).mo28730f(false, false);
                if (((Boolean) ((C23251a) aeVar4.f271793c.mo90632e()).f63720e).booleanValue()) {
                    aeVar4.f271807q = true;
                    new C90873ag(aeVar4.f271797g.mo90725d(), aeVar4.f271796f, "Update interstitial bypass preference.", C97330h.f271857a).mo85223a(C97331i.f271858a);
                }
                aeVar4.mo90646h();
            } else if (str.equals("onIncognitoInterstitialDoNotShowClicked_boolean")) {
                boolean booleanValue = Boolean.valueOf(pVar.f63472a.getBoolean("isChecked")).booleanValue();
                C97320ae aeVar5 = (C97320ae) this.f271881a;
                ((C23251a) aeVar5.f271793c.mo90632e()).mo28730f(Boolean.valueOf(booleanValue), false);
                new C90873ag(aeVar5.f271797g.mo90724c(booleanValue), aeVar5.f271796f, "Update interstitial do not show checkbox preference.", C97326d.f271853a).mo85223a(C97327e.f271854a);
            } else if (str.equals("onIncognitoInterstitialLearnMoreClicked")) {
                C97320ae aeVar6 = (C97320ae) this.f271881a;
                aeVar6.mo90647i(1456);
                C90464f fVar = aeVar6.f271802l;
                C90461c cVar = new C90461c();
                cVar.f252690b = "agsa_chrome_incognito";
                fVar.mo84209b(cVar, 0);
                ((C23251a) aeVar6.f271793c.mo90633f()).mo28730f(false, false);
            } else if (str.equals("onParticleDiscBoundsChanged_android.graphics.Rect")) {
                C97320ae aeVar7 = (C97320ae) this.f271881a;
                boolean h = ((C58833ax) aeVar7.f271793c.mo90639l().f63720e).mo56113h();
                aeVar7.f271793c.mo90639l().mo28730f(C58833ax.m90834k((Rect) new C23269n().mo28733b("bounds", pVar)), false);
                if (aeVar7.mo90655q()) {
                    aeVar7.mo90649k();
                } else if (!h) {
                    aeVar7.mo90657s(2);
                    aeVar7.mo90657s(3);
                }
            } else if (str.equals("onParticleDiscClicked")) {
                this.f271881a.mo90652n();
            } else if (str.equals("onRestrictedAccountLogoutDialogButtonClicked")) {
                C97320ae aeVar8 = (C97320ae) this.f271881a;
                aeVar8.f271792b.mo79679m();
                aeVar8.mo90652n();
            } else if (str.equals("onSearchActivityClicked")) {
                C97320ae aeVar9 = (C97320ae) this.f271881a;
                C58833ax axVar = (C58833ax) ((C23251a) aeVar9.f271793c.mo90638k()).f63720e;
                C58838bb.m90883r(axVar.mo56113h());
                C97420a.m161246a(aeVar9.f271795e, (String) axVar.mo56107c(), "particle");
            }
        }
    }
}
