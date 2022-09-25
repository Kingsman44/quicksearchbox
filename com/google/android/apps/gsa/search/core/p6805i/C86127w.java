package com.google.android.apps.gsa.search.core.p6805i;

import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.shared.search.C90507o;
import com.google.android.apps.gsa.shared.util.debug.C91022f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90748e;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.common.base.C58881cr;
import com.google.common.base.C58885cv;
import com.google.common.base.C58886cw;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.C59052c;
import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.search.core.i.w */
/* compiled from: PG */
public final class C86127w implements C90991b {

    /* renamed from: b */
    private static final C58881cr f232788b = C58886cw.m90973a(new C58885cv(new C58759qy("zero_query_web_results")));

    /* renamed from: c */
    private static final C58881cr f232789c = C58886cw.m90973a(new C58885cv(new C58759qy("selected_search_country_code")));

    /* renamed from: a */
    public final C86101aa f232790a;

    public C86127w(C86101aa aaVar, C91022f fVar) {
        this.f232790a = aaVar;
        fVar.mo85301a(this);
    }

    /* renamed from: b */
    public static boolean m138509b(String str) {
        C90748e.m148224b();
        synchronized (C86101aa.class) {
            if (C86101aa.f232727b == null) {
                C86101aa.f232727b = new HashSet();
                for (Field field : C90507o.class.getDeclaredFields()) {
                    try {
                        Object obj = field.get((Object) null);
                        if (obj instanceof String) {
                            C86101aa.f232727b.add((String) obj);
                        }
                    } catch (IllegalAccessException e) {
                        ((C59052c) ((C59052c) ((C59052c) C86101aa.f232726a.mo56226d()).mo56382g(e)).mo56372aa(7611)).mo56386p("Error reading StartupPreferenceKeys.Key's fields");
                    }
                }
            }
        }
        return C86101aa.f232727b.contains(str);
    }

    /* renamed from: c */
    private static void m138510c(C91006f fVar, String str, C86338r rVar) {
        C91006f e = fVar.mo85281e((Object) null);
        e.mo85291r(str);
        for (Map.Entry entry : rVar.getAll().entrySet()) {
            String str2 = (String) entry.getKey();
            if (((C58528ij) f232789c.mo6453a()).contains(str2)) {
                e.mo85293t("%s: %s", C90752i.m148229c(str2), C90752i.m148229c(String.valueOf(entry.getValue())));
            } else if (((C58528ij) f232788b.mo6453a()).contains(str2)) {
                e.mo85293t("%s: %s", C90752i.m148233g(str2), C90752i.m148229c("REDACTED"));
            } else {
                e.mo85293t("%s: %s", C90752i.m148233g(str2), C90752i.m148233g(String.valueOf(entry.getValue())));
            }
        }
    }

    /* renamed from: a */
    public final C86338r mo79761a() {
        return this.f232790a.mo79722a();
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("GsaPreferenceController");
        m138510c(fVar, "MainPreferences", this.f232790a.mo79722a());
        m138510c(fVar, "StartupPreferences", this.f232790a.mo79723b());
    }
}
