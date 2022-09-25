package com.facebook.litho;

import com.facebook.yoga.C6575k;

/* renamed from: com.facebook.litho.am */
/* compiled from: PG */
public final class C6102am {
    /* renamed from: a */
    public static String m15872a(C6411u uVar) {
        if (uVar == null) {
            return "ComponentContext is null";
        }
        C6110au d = C6110au.m15898d(uVar.f19017j);
        if (d == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        m15873b(d, 0, sb);
        return sb.toString();
    }

    /* renamed from: b */
    private static void m15873b(C6110au auVar, int i, StringBuilder sb) {
        if (auVar != null) {
            sb.append(auVar.mo12861b().mo13461q());
            sb.append('{');
            LithoView g = auVar.mo12863g();
            C6120ba f = auVar.mo12862f();
            sb.append((g == null || g.getVisibility() != 0) ? "H" : "V");
            if (!(f == null || f.mo12873a() == null)) {
                sb.append(" [clickable]");
            }
            if (f != null) {
                sb.append(" ");
                C6575k aE = f.f18060a.mo12906aE();
                float f2 = -1.0f;
                sb.append(aE != null ? aE.mo13680b() : -1.0f);
                sb.append("x");
                C6575k aE2 = f.f18060a.mo12906aE();
                if (aE2 != null) {
                    f2 = aE2.mo13676a();
                }
                sb.append(f2);
            }
            sb.append('}');
            for (C6110au auVar2 : auVar.mo12867l()) {
                sb.append("\n");
                for (int i2 = 0; i2 <= i; i2++) {
                    sb.append("  ");
                }
                m15873b(auVar2, i + 1, sb);
            }
        }
    }
}
