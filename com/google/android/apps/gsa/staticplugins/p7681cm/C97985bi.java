package com.google.android.apps.gsa.staticplugins.p7681cm;

import android.content.Context;
import android.preference.Preference;
import com.google.android.apps.gsa.search.core.google.C85929cw;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.sidekick.shared.p7241j.C91748d;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.cm.bi */
/* compiled from: PG */
public final class C97985bi extends C97996bt {
    public C97985bi(Context context, C85929cw cwVar, C91748d dVar, String str, C86124t tVar) {
        super(context, cwVar, dVar, str, tVar);
    }

    /* renamed from: l */
    public final boolean mo82950l(Preference preference) {
        return !Locale.getDefault().getCountry().equals("KR");
    }
}
