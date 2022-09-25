package com.google.android.apps.gsa.staticplugins.languagesettings.p8029a;

import android.accounts.Account;
import android.content.SharedPreferences;
import com.google.android.apps.gsa.assistant.p510b.p511a.C9439b;
import com.google.android.apps.gsa.assistant.settings.shared.ae;
import com.google.android.apps.gsa.assistant.shared.n.l;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6513aj.C84559s;
import com.google.android.apps.gsa.search.core.p6519al.p6572az.C84765a;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.speech.microdetection.C92486a;
import com.google.android.apps.gsa.staticplugins.languagesettings.C102677u;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.assistant.p3861at.C49951fa;
import com.google.assistant.p3861at.C49952fb;
import com.google.assistant.p3861at.acw;
import com.google.assistant.p3861at.acx;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4479cg.C58075g;
import com.google.protos.p4816ai.p4818b.C63196b;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.languagesettings.a.e */
/* compiled from: PG */
public final class C102653e extends C86734a implements C84765a {

    /* renamed from: a */
    public static final C58974d f286532a = C58974d.m91135i("LanguageSettingsWorker");

    /* renamed from: b */
    public final ae f286533b;

    /* renamed from: c */
    private final C102677u f286534c;

    /* renamed from: f */
    private final C84559s f286535f;

    /* renamed from: g */
    private final l f286536g;

    /* renamed from: h */
    private final C86054o f286537h;

    /* renamed from: i */
    private final SharedPreferences f286538i;

    /* renamed from: j */
    private final C42876ab f286539j;

    /* renamed from: k */
    private final C68214a f286540k;

    /* renamed from: l */
    private final C92486a f286541l;

    public C102653e(C102677u uVar, C84559s sVar, l lVar, ae aeVar, C86054o oVar, SharedPreferences sharedPreferences, C42876ab abVar, C68214a aVar, C92486a aVar2) {
        super(C118575h.WORKER_LANGUAGE_SETTINGS, "languagesettings");
        this.f286534c = uVar;
        this.f286535f = sVar;
        this.f286536g = lVar;
        this.f286533b = aeVar;
        this.f286537h = oVar;
        this.f286538i = sharedPreferences;
        this.f286539j = abVar;
        this.f286540k = aVar;
        this.f286541l = aVar2;
    }

    /* renamed from: g */
    private final void m170223g(String str) {
        Account a = this.f286537h.mo79668a();
        if (a != null && !str.isEmpty()) {
            acw acw = (acw) acx.f128971H.createBuilder();
            C49951fa faVar = (C49951fa) C49952fb.f129857j.createBuilder();
            faVar.copyOnWrite();
            C49952fb fbVar = (C49952fb) faVar.instance;
            fbVar.f129859a |= 8;
            fbVar.f129863e = false;
            acw.copyOnWrite();
            acx acx = (acx) acw.instance;
            C49952fb fbVar2 = (C49952fb) faVar.build();
            fbVar2.getClass();
            acx.f128999p = fbVar2;
            acx.f128984a |= 65536;
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            C49952fb fbVar3 = ((acx) acw.instance).f128999p;
            if (fbVar3 == null) {
                fbVar3 = C49952fb.f129857j;
            }
            C49951fa faVar2 = (C49951fa) fbVar3.toBuilder();
            faVar2.mo53375a(arrayList);
            C49952fb fbVar4 = (C49952fb) faVar2.build();
            acw.copyOnWrite();
            acx acx2 = (acx) acw.instance;
            fbVar4.getClass();
            acx2.f128999p = fbVar4;
            acx2.f128984a |= 65536;
            this.f286536g.n(this.f286537h.mo79668a(), (acx) acw.build(), new C102652d(this, a, str), getClass().getSimpleName());
        }
    }

    /* renamed from: h */
    private final void m170224h(String str) {
        ((C89994f) this.f286540k.mo27525b()).mo83880aQ(str);
    }

    /* renamed from: a */
    public final C60870cx mo78466a() {
        return this.f286539j.mo46042d();
    }

    /* renamed from: b */
    public final C60870cx mo78467b(String str, String str2) {
        m170223g(str);
        Locale forLanguageTag = Locale.forLanguageTag(str);
        String ab = ((C89994f) this.f286540k.mo27525b()).mo83882ab();
        boolean J = ((C89994f) this.f286540k.mo27525b()).mo83847J(ab);
        this.f286538i.edit().putString("selected_search_language", forLanguageTag.getDisplayLanguage(forLanguageTag)).putString("hl_parameter", str2).apply();
        this.f286535f.mo78313d(str2, Locale.getDefault());
        if (J && ((C89994f) this.f286540k.mo27525b()).mo83841D(ab) == null && ((C89994f) this.f286540k.mo27525b()).mo83823l()) {
            C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
            tzVar.copyOnWrite();
            C60555uf ufVar = (C60555uf) tzVar.instance;
            ufVar.f164093a |= 2;
            ufVar.f164258m = 815;
            C9439b bVar = C9439b.HOTWORD_RETRAINING_NOTIFICATION_LANGUAGE_CHANGED;
            tzVar.copyOnWrite();
            C60555uf ufVar2 = (C60555uf) tzVar.instance;
            ufVar2.f164109aP = bVar.f32835aq;
            ufVar2.f164251f |= 16;
            C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
            this.f286538i.edit().putInt("hands_free_hotword_retraining_notification_source", 14).apply();
            this.f286541l.mo87235i();
        }
        m170224h(str);
        return this.f286534c.mo93378a(str2);
    }

    /* renamed from: c */
    public final void mo78468c(int i) {
        this.f286539j.mo46039a(new C102648a(i), C60826bg.f164896a);
    }

    /* renamed from: d */
    public final void mo78469d(Boolean bool) {
        this.f286539j.mo46039a(new C102650b(bool), C60826bg.f164896a);
    }

    /* renamed from: e */
    public final void mo78470e(C58075g gVar) {
        this.f286539j.mo46039a(new C102651c(gVar), C60826bg.f164896a);
    }

    /* renamed from: f */
    public final void mo78471f(String str) {
        m170223g(str);
        m170224h(str);
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return true;
    }
}
