package com.google.android.apps.gsa.staticplugins.p8025l.p8027b;

import android.content.Context;
import android.content.res.Configuration;
import com.google.android.apps.gsa.assistant.settings.shared.ae;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.libraries.assistant.assistantactions.p621c.C11055a;
import com.google.android.libraries.assistant.assistantactions.p621c.C11251e;
import com.google.common.base.C58837ba;
import dagger.C68214a;
import dagger.p5294a.C68220f;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.l.b.a */
/* compiled from: PG */
public final class C102627a implements C68220f {
    /* renamed from: a */
    public static C11055a m170182a(Context context, C68214a aVar, C68214a aVar2, C11251e eVar) {
        Locale d = ((ae) aVar2.mo27525b()).d(C58837ba.m90858g(((C86054o) aVar.mo27525b()).mo79659F()));
        if (d == null) {
            return eVar.mo19674a(context);
        }
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLocale(d);
        return eVar.mo19674a(context.createConfigurationContext(configuration));
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        throw null;
    }
}
