package com.google.assistant.p3838ao.p3839a;

import com.google.android.apps.gsa.nga.shared.p6274a.C80047aa;
import com.google.android.apps.gsa.nga.shared.p6274a.C80053ag;
import com.google.assistant.p3838ao.p3839a.p3845e.C49579ci;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58759qy;
import java.util.Collections;

/* renamed from: com.google.assistant.ao.a.i */
/* compiled from: PG */
public final class C49669i {

    /* renamed from: a */
    public static final C58528ij f128184a = C58528ij.m90012L("/collection/restaurants", "/collection/tourist_attractions", "/collection/venues");

    /* renamed from: b */
    public static final C58528ij f128185b = new C58759qy("/collection/locations");

    /* renamed from: c */
    public static final C58528ij f128186c = C58528ij.m90013M("/collection/continents", "/collection/planets", "/collection/countries", "/collection/tv_networks");

    /* renamed from: d */
    public static final C58528ij f128187d = C58528ij.m90011K("/collection/films", "/collection/films_with_showtimes");

    /* renamed from: e */
    public static final C58528ij f128188e = new C58759qy("/collection/tv_programs");

    /* renamed from: f */
    public final C49579ci f128189f;

    public C49669i(C49579ci ciVar) {
        this.f128189f = ciVar;
    }

    /* renamed from: a */
    public static boolean m85660a(C80047aa aaVar) {
        C80053ag agVar;
        C80053ag agVar2;
        if (aaVar.f219657a == 10) {
            agVar = (C80053ag) aaVar.f219658b;
        } else {
            agVar = C80053ag.f219675f;
        }
        if (agVar.f219677a.equals("/m/09nm_")) {
            return false;
        }
        if (aaVar.f219657a == 10) {
            agVar2 = (C80053ag) aaVar.f219658b;
        } else {
            agVar2 = C80053ag.f219675f;
        }
        return Collections.disjoint(agVar2.f219679c, f128186c);
    }

    /* renamed from: b */
    public static boolean m85661b(C80047aa aaVar) {
        C80053ag agVar;
        if (aaVar.f219657a == 10) {
            agVar = (C80053ag) aaVar.f219658b;
        } else {
            agVar = C80053ag.f219675f;
        }
        return !Collections.disjoint(agVar.f219679c, f128185b) && m85660a(aaVar);
    }

    /* renamed from: c */
    public static boolean m85662c(C80047aa aaVar) {
        C80053ag agVar;
        if (aaVar.f219657a == 10) {
            agVar = (C80053ag) aaVar.f219658b;
        } else {
            agVar = C80053ag.f219675f;
        }
        return !Collections.disjoint(agVar.f219679c, f128187d);
    }

    /* renamed from: d */
    public static boolean m85663d(C80047aa aaVar) {
        C80053ag agVar;
        if (aaVar.f219657a == 10) {
            agVar = (C80053ag) aaVar.f219658b;
        } else {
            agVar = C80053ag.f219675f;
        }
        return !Collections.disjoint(agVar.f219679c, f128184a) && m85660a(aaVar);
    }

    /* renamed from: e */
    public static boolean m85664e(C80047aa aaVar) {
        C80053ag agVar;
        if (aaVar.f219657a == 10) {
            agVar = (C80053ag) aaVar.f219658b;
        } else {
            agVar = C80053ag.f219675f;
        }
        return !Collections.disjoint(agVar.f219679c, f128188e);
    }
}
