package com.google.android.libraries.mdi.download.p2248h;

import com.google.android.libraries.mdi.download.C28708an;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.google.android.libraries.mdi.download.h.n */
/* compiled from: PG */
public final /* synthetic */ class C29617n implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C29627x f80215a;

    /* renamed from: b */
    public final /* synthetic */ Map f80216b;

    public /* synthetic */ C29617n(C29627x xVar, Map map) {
        this.f80215a = xVar;
        this.f80216b = map;
    }

    public final Object apply(Object obj) {
        C29627x xVar = this.f80215a;
        Map map = this.f80216b;
        C58833ax axVar = (C58833ax) xVar.f80230c.apply((Locale) obj, map.keySet());
        if (axVar.mo56113h()) {
            Locale locale = (Locale) axVar.mo56107c();
            C29045l.m53931c("%s: chosenLocale: %s", "LocaleOverrider", locale);
            if (map.containsKey(locale)) {
                C29045l.m53940l("%s: matched groups %s", "LocaleOverrider", map.get(locale));
                return C58833ax.m90834k((C28708an) map.get(locale));
            }
            C29045l.m53936h("%s: Strategy applied retured invalid locale: : %s", "LocaleOverrider", locale);
        }
        return C58836b.f156633a;
    }
}
