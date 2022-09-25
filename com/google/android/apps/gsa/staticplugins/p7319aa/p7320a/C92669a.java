package com.google.android.apps.gsa.staticplugins.p7319aa.p7320a;

import android.content.SharedPreferences;
import com.google.android.apps.gsa.search.core.logging.eventprocessor.C86177a;
import com.google.android.apps.gsa.shared.search.C90507o;
import com.google.android.apps.search.googleapp.discover.p10182e.p10183a.C134238a;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4522b.C58759qy;
import dagger.C68214a;
import dagger.p5294a.C68220f;
import dagger.p5294a.C68225k;
import java.util.Set;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.aa.a.a */
/* compiled from: PG */
public final class C92669a implements C68220f {
    /* renamed from: a */
    public static Set m152630a(C69464a aVar, C68214a aVar2, C68214a aVar3) {
        Set set;
        long j = ((SharedPreferences) aVar2.mo27525b()).getLong(C90507o.f253034x, 0);
        ((C134238a) aVar3.mo27525b()).mo111659b(j);
        if (j == 0) {
            set = new C58759qy((C86177a) aVar.mo17428b());
        } else {
            set = C58733pz.f156496a;
        }
        C68225k.m98532d(set);
        return set;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        throw null;
    }
}
