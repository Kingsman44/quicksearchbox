package com.google.android.apps.gsa.staticplugins.p7681cm;

import android.preference.Preference;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.settingsui.C88994i;
import com.google.android.apps.gsa.shared.p6995aq.C89257aa;
import com.google.android.apps.gsa.tasks.C118471af;
import com.google.android.apps.gsa.tasks.C118472ag;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.android.apps.gsa.tasks.C118561t;

/* renamed from: com.google.android.apps.gsa.staticplugins.cm.cd */
/* compiled from: PG */
public final class C98007cd extends C88994i implements Preference.OnPreferenceChangeListener {

    /* renamed from: a */
    private final C86338r f273663a;

    /* renamed from: b */
    private final C118561t f273664b;

    /* renamed from: c */
    private final C89257aa f273665c;

    public C98007cd(C86338r rVar, C118561t tVar, C89257aa aaVar) {
        this.f273663a = rVar;
        this.f273664b = tVar;
        this.f273665c = aaVar;
    }

    /* renamed from: c */
    public final void mo82941c(Preference preference) {
        preference.setOnPreferenceChangeListener(this);
    }

    /* renamed from: l */
    public final boolean mo82950l(Preference preference) {
        return this.f273665c.mo83227t().length == 0;
    }

    public final boolean onPreferenceChange(Preference preference, Object obj) {
        if (this.f273663a.contains("search_widget_doodle_image")) {
            C118471af afVar = (C118471af) C118472ag.f328819i.createBuilder();
            afVar.copyOnWrite();
            C118472ag agVar = (C118472ag) afVar.instance;
            agVar.f328821a |= 1;
            agVar.f328822b = 500;
            afVar.copyOnWrite();
            C118472ag agVar2 = (C118472ag) afVar.instance;
            agVar2.f328821a |= 2;
            agVar2.f328823c = 500;
            this.f273664b.mo103754e(C118522by.SEARCH_WIDGET_REFRESH_TASK, (C118472ag) afVar.build());
        }
        return true;
    }
}
