package com.google.android.apps.gsa.staticplugins.opa;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.core.app.C1800aq;
import androidx.core.app.C1837x;
import androidx.core.app.C1839z;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.settings.shared.ae;
import com.google.android.apps.gsa.assistant.shared.C73842bi;
import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.assistant.shared.n.l;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6513aj.C84516aa;
import com.google.android.apps.gsa.search.core.p6805i.C86109e;
import com.google.android.apps.gsa.search.core.p6805i.C86117m;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p6974ae.C89094c;
import com.google.android.apps.gsa.shared.p6974ae.C89095d;
import com.google.android.apps.gsa.shared.p7066m.C90037cp;
import com.google.android.apps.gsa.staticplugins.opa.util.C113764ag;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58833ax;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import java.util.Locale;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.me */
/* compiled from: PG */
public final class C109466me implements C86109e {

    /* renamed from: a */
    private final Context f304903a;

    /* renamed from: b */
    private final C69464a f304904b;

    /* renamed from: c */
    private final C68214a f304905c;

    /* renamed from: d */
    private final C68214a f304906d;

    /* renamed from: e */
    private final C68214a f304907e;

    /* renamed from: f */
    private final C68214a f304908f;

    /* renamed from: g */
    private final C68214a f304909g;

    /* renamed from: h */
    private final C68214a f304910h;

    public C109466me(Context context, C69464a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5, C68214a aVar6, C68214a aVar7) {
        this.f304903a = context;
        this.f304904b = aVar;
        this.f304905c = aVar2;
        this.f304906d = aVar3;
        this.f304909g = aVar4;
        this.f304907e = aVar5;
        this.f304908f = aVar6;
        this.f304910h = aVar7;
    }

    /* renamed from: a */
    public final void mo70818a(C86124t tVar, C86117m mVar) {
        Account a;
        Account a2;
        Locale d;
        boolean isDeviceLocked = ((C84516aa) this.f304910h.mo27525b()).f230023b.isDeviceLocked();
        C58976aa aaVar = C58975e.f156826a;
        if (!isDeviceLocked) {
            ((bm) this.f304904b.mo17428b()).e(this.f304903a);
            if (((C58833ax) this.f304905c.mo27525b()).mo56113h()) {
                ((C73842bi) ((C58833ax) this.f304905c.mo27525b()).mo56107c()).mo65324a();
            }
            if (!tVar.mo79746e(C90037cp.f248418Z)) {
                C86054o oVar = (C86054o) this.f304906d.mo27525b();
                ae aeVar = (ae) this.f304908f.mo27525b();
                SharedPreferences sharedPreferences = (SharedPreferences) this.f304907e.mo27525b();
                l lVar = (l) this.f304909g.mo27525b();
                if (!tVar.mo79746e(C90037cp.f248418Z) && sharedPreferences.contains("opa_fre_language_picker_user_selection") && (a2 = oVar.mo79668a()) != null && (d = aeVar.d(a2.name)) != null) {
                    String languageTag = d.toLanguageTag();
                    String string = sharedPreferences.getString("opa_fre_language_picker_user_selection", BuildConfig.FLAVOR);
                    sharedPreferences.edit().remove("opa_fre_language_picker_user_selection").remove("opa_fre_language_picker_shown").remove("opa_fre_language_picker_dismiss_count").remove("opa_fre_language_picker_phone_language_supported_shown").remove("opa_fre_language_picker_phone_language_supported_notification_sent").apply();
                    if (TextUtils.equals(languageTag, string)) {
                        C113764ag.m188331b(aeVar, lVar, a2, Locale.getDefault().toLanguageTag());
                    }
                }
            }
            if (tVar.mo79746e(C90037cp.f248570cs)) {
                C86054o oVar2 = (C86054o) this.f304906d.mo27525b();
                ae aeVar2 = (ae) this.f304908f.mo27525b();
                SharedPreferences sharedPreferences2 = (SharedPreferences) this.f304907e.mo27525b();
                Context context = this.f304903a;
                if (tVar.mo79746e(C90037cp.f248570cs) && (a = oVar2.mo79668a()) != null && !sharedPreferences2.getBoolean("opa_fre_language_picker_phone_language_supported_notification_sent", false)) {
                    String string2 = sharedPreferences2.getString("opa_fre_language_picker_user_selection", BuildConfig.FLAVOR);
                    if (!C58837ba.m90859h(string2)) {
                        String languageTag2 = aeVar2.d(a.name).toLanguageTag();
                        if (string2.equals(languageTag2) && !sharedPreferences2.getBoolean("opa_fre_language_picker_phone_language_supported_shown", false)) {
                            String languageTag3 = Locale.getDefault().toLanguageTag();
                            if (!languageTag3.equals(languageTag2) && C113764ag.m188330a(languageTag3, tVar)) {
                                String languageTag4 = Locale.getDefault().toLanguageTag();
                                PendingIntent service = PendingIntent.getService(context, 0, new Intent().setClassName(context, "com.google.android.apps.gsa.search.core.service.SearchService").setAction("com.google.android.search.core.action.OPA_NOTIFICATION_TAPPED").putExtra("com.google.android.search.core.extra.NOTIFICATION_FLAG", 256), 335544320);
                                C1839z a3 = C89095d.m144923a(context, (String) null);
                                a3.f5679J.icon = R.drawable.ic_assistant_light;
                                a3.f5670A = context.getResources().getColor(R.color.google_blue);
                                a3.f5671B = 1;
                                a3.mo5015d(16, true);
                                a3.f5685e = C1839z.m5037c(context.getResources().getString(R.string.opa_language_picker_notification_title));
                                a3.f5686f = C1839z.m5037c(context.getResources().getString(R.string.opa_language_picker_notification_content, new Object[]{Locale.forLanguageTag(languageTag4).getDisplayName()}));
                                C1837x xVar = new C1837x();
                                xVar.f5669a = C1839z.m5037c(context.getResources().getString(R.string.opa_language_picker_notification_expanded_text, new Object[]{Locale.forLanguageTag(languageTag4).getDisplayName()}));
                                a3.mo5022k(xVar);
                                a3.f5690j = 0;
                                a3.f5687g = service;
                                a3.mo5015d(16, true);
                                new C1800aq(context).mo5003b((String) null, C89094c.OPA_FRE_LANGUAGE_NOW_SUPPORTED.f241522aD, a3.mo5013a());
                                sharedPreferences2.edit().putBoolean("opa_fre_language_picker_phone_language_supported_notification_sent", true).apply();
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo70819b(C86124t tVar) {
        mo70818a(tVar, C86117m.f232762a);
    }
}
