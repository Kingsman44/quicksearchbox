package com.google.android.apps.gsa.staticplugins.opa;

import com.google.android.apps.gsa.assistant.settings.shared.ae;
import com.google.android.apps.gsa.assistant.shared.bn;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90044cw;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.play.core.p3538g.C45187v;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.mj */
/* compiled from: PG */
public final class C109471mj implements bn {

    /* renamed from: a */
    public static final C59071e f304920a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.mj");

    /* renamed from: b */
    public final C45187v f304921b;

    /* renamed from: c */
    private final C68214a f304922c;

    /* renamed from: d */
    private final C68214a f304923d;

    /* renamed from: e */
    private final C68214a f304924e;

    /* renamed from: f */
    private final C22871g f304925f;

    public C109471mj(C68214a aVar, C68214a aVar2, C68214a aVar3, C45187v vVar, C22871g gVar) {
        this.f304922c = aVar;
        this.f304923d = aVar2;
        this.f304924e = aVar3;
        this.f304921b = vVar;
        this.f304925f = gVar;
    }

    /* renamed from: d */
    private final void m182172d(Locale locale) {
        if (!mo97849b(locale)) {
            this.f304925f.mo28207g("OpaLanguageSplitter", new C109470mi(this, locale));
        }
        C59104x b = f304920a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "OpaLanguageSplitter");
        ((C59052c) ((C59052c) b).mo56372aa(22975)).mo56389s("schedule language deferred installation %s", locale);
        C45187v vVar = this.f304921b;
        locale.getClass();
        vVar.mo48995b(C58485gu.m89846n(locale));
    }

    /* renamed from: a */
    public final void mo97848a(String str) {
        if (((C90021c) this.f304922c.mo27525b()).mo79746e(C90014bt.f247175cG)) {
            C59104x b = f304920a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "OpaLanguageSplitter");
            ((C59052c) ((C59052c) b).mo56372aa(22973)).mo56386p("#onAccountChange");
            m182172d(((ae) this.f304924e.mo27525b()).d(str));
        }
    }

    /* renamed from: b */
    public final boolean mo97849b(Locale locale) {
        boolean z = true;
        if (!((C90021c) this.f304922c.mo27525b()).mo79746e(C90014bt.f247175cG) || !((C90021c) this.f304922c.mo27525b()).mo79746e(C90044cw.f248743r)) {
            return true;
        }
        int i = 0;
        if (!locale.getLanguage().equals(Locale.getDefault().getLanguage()) && (this.f304921b.mo48999f() == null || !this.f304921b.mo48999f().contains(locale.getLanguage()))) {
            z = false;
        }
        C59104x b = f304920a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "OpaLanguageSplitter");
        C59052c cVar = (C59052c) ((C59052c) b).mo56372aa(22980);
        if (this.f304921b.mo48999f() != null) {
            i = this.f304921b.mo48999f().size();
        }
        cVar.mo56356I("#isLanguageInstalled: %b, installed language's size: %d", z, i);
        for (String s : this.f304921b.mo48999f()) {
            C59104x b2 = f304920a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "OpaLanguageSplitter");
            ((C59052c) ((C59052c) b2).mo56372aa(22981)).mo56389s("Installed language: %s", s);
        }
        return z;
    }

    /* renamed from: c */
    public final void mo97850c(Locale locale, Locale locale2) {
        if (((C90021c) this.f304922c.mo27525b()).mo79746e(C90014bt.f247175cG)) {
            C59071e eVar = f304920a;
            C59104x b = eVar.mo56224b();
            b.mo56378ag(C58975e.f156826a, "OpaLanguageSplitter");
            ((C59052c) ((C59052c) b).mo56372aa(22974)).mo56354G("#onLanguageChange before: %s after: %s.", locale, locale2);
            m182172d(locale2);
            if (locale.getLanguage().equals(Locale.getDefault().getLanguage())) {
                C59104x b2 = eVar.mo56224b();
                b2.mo56378ag(C58975e.f156826a, "OpaLanguageSplitter");
                ((C59052c) ((C59052c) b2).mo56372aa(22979)).mo56386p("isLanguageInUse: true because of same language code of device language.");
                return;
            }
            for (String d : ((C86054o) this.f304923d.mo27525b()).mo79685s()) {
                if (locale.getLanguage().equals(((ae) this.f304924e.mo27525b()).d(d).getLanguage())) {
                    C59104x b3 = f304920a.mo56224b();
                    b3.mo56378ag(C58975e.f156826a, "OpaLanguageSplitter");
                    ((C59052c) ((C59052c) b3).mo56372aa(22978)).mo56386p("isLanguageInUse: true because other accounts use it.");
                    return;
                }
            }
            C59071e eVar2 = f304920a;
            C59104x b4 = eVar2.mo56224b();
            b4.mo56378ag(C58975e.f156826a, "OpaLanguageSplitter");
            ((C59052c) ((C59052c) b4).mo56372aa(22977)).mo56386p("isLanguageInUse: false");
            C59104x b5 = eVar2.mo56224b();
            b5.mo56378ag(C58975e.f156826a, "OpaLanguageSplitter");
            ((C59052c) ((C59052c) b5).mo56372aa(22976)).mo56389s("schedule language deferred uninstallation %s", locale);
            C45187v vVar = this.f304921b;
            locale.getClass();
            vVar.mo48996c(C58485gu.m89846n(locale));
        }
    }
}
