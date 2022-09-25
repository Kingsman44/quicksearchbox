package com.google.android.gms.car.p10768k;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.car.C143206dw;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58801sm;

/* renamed from: com.google.android.gms.car.k.a */
/* compiled from: PG */
public final class C143322a {
    /* renamed from: a */
    public static final void m232522a(Object obj, String str, StringBuilder sb, C143206dw dwVar) {
        C58485gu guVar;
        View view = (View) obj;
        sb.append(C143206dw.m232327a(view));
        if (!(view instanceof ViewGroup)) {
            guVar = C58485gu.m89845m();
        } else {
            ViewGroup viewGroup = (ViewGroup) view;
            C58480gp gpVar = new C58480gp(4);
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                gpVar.mo55395g(viewGroup.getChildAt(i));
            }
            guVar = gpVar.mo55394f();
        }
        C58801sm G = guVar.listIterator(0);
        while (G.hasNext()) {
            Object next = G.next();
            sb.append(10);
            sb.append(str);
            if (G.hasNext()) {
                sb.append("├── ");
                m232522a(next, str.concat("│   "), sb, dwVar);
            } else {
                sb.append("└── ");
                m232522a(next, str.concat("    "), sb, dwVar);
            }
        }
    }
}
