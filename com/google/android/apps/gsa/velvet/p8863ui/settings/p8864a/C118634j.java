package com.google.android.apps.gsa.velvet.p8863ui.settings.p8864a;

import com.google.android.apps.gsa.search.core.preferences.SearchWidgetSettingsFragment;
import com.google.android.apps.gsa.search.core.preferences.p6817a.C86283a;
import com.google.android.apps.gsa.settingsui.C88992g;
import com.google.android.apps.gsa.velvet.p8863ui.settings.C118651e;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58729pv;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.velvet.ui.settings.a.j */
/* compiled from: PG */
public final class C118634j implements C88992g {

    /* renamed from: a */
    private final C86283a f330967a;

    public C118634j(C86283a aVar) {
        this.f330967a = aVar;
    }

    /* renamed from: a */
    public final C58495hd mo17755a() {
        return this.f330967a.mo79994a() ? C58495hd.m89900n(Integer.valueOf(R.xml.search_widget_settings), SearchWidgetSettingsFragment.class.getName()) : C58729pv.f156485a;
    }

    /* renamed from: b */
    public final /* synthetic */ C60870cx mo17756b() {
        return null;
    }

    /* renamed from: c */
    public final /* synthetic */ List mo17757c() {
        return C58485gu.m89845m();
    }

    /* renamed from: d */
    public final List mo17758d(C118651e eVar) {
        if (this.f330967a.mo79994a()) {
            return eVar.mo103835a(R.xml.search_widget_settings_header);
        }
        return new ArrayList();
    }
}
