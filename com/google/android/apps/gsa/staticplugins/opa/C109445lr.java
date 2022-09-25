package com.google.android.apps.gsa.staticplugins.opa;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import com.google.android.apps.gsa.assistant.settings.shared.ae;
import com.google.android.apps.gsa.assistant.shared.C73841bf;
import com.google.android.apps.gsa.assistant.shared.bn;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.common.base.C58833ax;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.lr */
/* compiled from: PG */
public final class C109445lr implements C73841bf {

    /* renamed from: a */
    private static final C59071e f304775a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.lr");

    /* renamed from: b */
    private final Context f304776b;

    /* renamed from: c */
    private final C68214a f304777c;

    /* renamed from: d */
    private final C68214a f304778d;

    /* renamed from: e */
    private final C68214a f304779e;

    /* renamed from: f */
    private final C68214a f304780f;

    /* renamed from: g */
    private final C58833ax f304781g;

    public C109445lr(Context context, C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C58833ax axVar) {
        this.f304776b = context;
        this.f304777c = aVar;
        this.f304778d = aVar2;
        this.f304779e = aVar3;
        this.f304780f = aVar4;
        this.f304781g = axVar;
    }

    /* renamed from: c */
    private final Resources m182124c(Locale locale) {
        m182125d(locale);
        Configuration configuration = new Configuration(this.f304776b.getResources().getConfiguration());
        configuration.setLocale(locale);
        return this.f304776b.createConfigurationContext(configuration).getResources();
    }

    /* renamed from: d */
    private final void m182125d(Locale locale) {
        C59104x b = f304775a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "OpaAsLangResDelegate");
        ((C59052c) ((C59052c) b).mo56372aa(22922)).mo56389s("Setting the display assistant language %s to use.", locale);
        ((SharedPreferences) this.f304777c.mo27525b()).edit().putString("current_display_assistant_language", locale.toLanguageTag()).apply();
    }

    /* renamed from: a */
    public final Resources mo65322a() {
        if (!((C86124t) this.f304778d.mo27525b()).mo79746e(C90014bt.f247174cF)) {
            m182125d(Locale.getDefault());
            return this.f304776b.getResources();
        }
        String g = C58837ba.m90858g(((C86054o) this.f304780f.mo27525b()).mo79659F());
        if (g.isEmpty() || Locale.getDefault().toLanguageTag().equals(((ae) this.f304779e.mo27525b()).d(g).toLanguageTag())) {
            m182125d(Locale.getDefault());
            return this.f304776b.getResources();
        }
        Locale d = ((ae) this.f304779e.mo27525b()).d(g);
        if (!this.f304781g.mo56113h()) {
            return m182124c(d);
        }
        bn bnVar = (bn) this.f304781g.mo56107c();
        if (bnVar.b(d)) {
            return m182124c(d);
        }
        String string = ((SharedPreferences) this.f304777c.mo27525b()).getString("current_display_assistant_language", Locale.getDefault().toLanguageTag());
        C59104x b = f304775a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "OpaAsLangResDelegate");
        ((C59052c) ((C59052c) b).mo56372aa(22921)).mo56389s("Retrieved the display assistant language %s to use.", string);
        Locale forLanguageTag = Locale.forLanguageTag(string);
        if (bnVar.b(forLanguageTag)) {
            return m182124c(forLanguageTag);
        }
        m182125d(Locale.getDefault());
        return this.f304776b.getResources();
    }

    /* renamed from: b */
    public final Resources mo65323b() {
        return this.f304776b.getResources();
    }
}
