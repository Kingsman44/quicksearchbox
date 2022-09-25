package com.google.android.libraries.search.p2904c.p2906aa;

import com.google.android.libraries.search.p2904c.C37465cn;
import com.google.android.libraries.search.p2904c.p2933j.C37772b;
import com.google.android.libraries.search.p2904c.p2933j.C37773c;
import com.google.android.libraries.search.p2904c.p2933j.p2934a.C37731b;
import com.google.android.libraries.search.p2904c.p2933j.p2934a.p2935a.C37730x;
import com.google.android.libraries.search.p2904c.p2933j.p2934a.p2937c.C37771n;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5483m.C69748a;

/* renamed from: com.google.android.libraries.search.c.aa.f */
/* compiled from: PG */
public final class C37331f {
    /* renamed from: a */
    public static final String m66337a(Object obj) {
        C69664n.m101061g(obj, "<this>");
        StringBuilder sb = new StringBuilder();
        sb.append(obj.getClass().getSimpleName());
        sb.append('@');
        int identityHashCode = System.identityHashCode(obj);
        C69748a.m101208b(16);
        String num = Integer.toString(identityHashCode, 16);
        C69664n.m101060f(num, "toString(this, checkRadix(radix))");
        sb.append(num);
        return sb.toString();
    }

    /* renamed from: b */
    public static final String m66338b(C37773c cVar) {
        C37731b bVar;
        C37730x xVar;
        C37771n nVar;
        C69664n.m101061g(cVar, "<this>");
        StringBuilder sb = new StringBuilder();
        sb.append("ClientInfo[name=".concat(String.valueOf(C37772b.m66674a(cVar.f100245a).name())));
        C37772b a = C37772b.m66674a(cVar.f100245a);
        C37465cn cnVar = C37465cn.BLUETOOTH_AUDIO_ROUTE;
        int ordinal = a.ordinal();
        if (ordinal == 0) {
            if (cVar.f100245a == 1) {
                bVar = (C37731b) cVar.f100246b;
            } else {
                bVar = C37731b.f100162b;
            }
            sb.append(",extraInfo=".concat(String.valueOf(bVar.f100164a)));
        } else if (ordinal == 11) {
            if (cVar.f100245a == 12) {
                xVar = (C37730x) cVar.f100246b;
            } else {
                xVar = C37730x.f100158c;
            }
            sb.append(",entryPoint=".concat(String.valueOf(xVar.f100161b)));
        } else if (ordinal == 19) {
            if (cVar.f100245a == 20) {
                nVar = (C37771n) cVar.f100246b;
            } else {
                nVar = C37771n.f100204c;
            }
            sb.append(",entryPoint=".concat(String.valueOf(nVar.f100207b)));
        }
        sb.append("]");
        return sb.toString();
    }
}
