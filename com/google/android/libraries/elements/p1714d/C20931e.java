package com.google.android.libraries.elements.p1714d;

import com.facebook.litho.C6405o;
import com.facebook.litho.C6411u;
import com.google.android.libraries.elements.interfaces.C21319z;
import com.google.android.libraries.elements.internal.C21359t;
import com.google.android.libraries.elements.p1705a.p1706a.C20677a;
import com.google.p370af.C7490c;
import com.youtube.p5283a.p5284a.C68037a;
import com.youtube.p5283a.p5284a.C68045ah;
import com.youtube.p5283a.p5284a.C68050am;
import com.youtube.p5283a.p5284a.C68089k;
import java.util.List;

/* renamed from: com.google.android.libraries.elements.d.e */
/* compiled from: PG */
public final /* synthetic */ class C20931e implements C20870cu {

    /* renamed from: a */
    public static final /* synthetic */ C20931e f58701a = new C20931e();

    private /* synthetic */ C20931e() {
    }

    /* renamed from: a */
    public final C6405o mo25823a(C6411u uVar, C21319z zVar, Object obj, String str, C68045ah ahVar, C21125o oVar, List list) {
        C20800am b = C20801an.m39050b(uVar);
        b.mo25886f(C20804aq.m39057c(ahVar));
        b.mo25884d(list);
        int g = (int) new C20677a((C68089k) obj).f57960a.mo60238g();
        if (g != 0) {
            b.f58233a.f58248e = Integer.valueOf(g);
        }
        C68050am b2 = C20804aq.m39056b(ahVar);
        if (!(b2 == null || b2.mo60121h() == null)) {
            b.f58233a.f58249f = b2.mo60121h();
        }
        C68037a aVar = new C68037a();
        if (!C21359t.m40388n(ahVar, aVar) || !C7490c.m22726p(aVar, 14)) {
            b.mo13447u(true);
        } else {
            b.mo13447u(aVar.mo60082h());
        }
        return b;
    }
}
