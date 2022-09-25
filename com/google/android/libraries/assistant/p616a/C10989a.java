package com.google.android.libraries.assistant.p616a;

import com.google.android.apps.gsa.contacts.cl;
import com.google.assistant.p3897e.p3921j.C52629yv;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58890d;
import com.google.common.p4537i.C59294s;
import com.google.common.p4575r.C60763t;
import java.nio.charset.Charset;

/* renamed from: com.google.android.libraries.assistant.a.a */
/* compiled from: PG */
public final class C10989a {
    /* renamed from: a */
    public static C58833ax m25985a(C52629yv yvVar) {
        int i = yvVar.f138182a;
        if ((i & 8) != 0) {
            return C58833ax.m90834k(m25986b(yvVar.f138186e));
        }
        if ((i & 2) == 0 || yvVar.f138184c.isEmpty()) {
            return C58836b.f156633a;
        }
        C58833ax b = cl.b(yvVar.f138184c);
        if (b.mo56113h()) {
            return C58833ax.m90834k(m25986b((String) b.mo56107c()));
        }
        return C58833ax.m90834k(m25986b(yvVar.f138184c));
    }

    /* renamed from: b */
    public static String m25986b(String str) {
        return C60763t.m92767d(C59294s.m92132b().mo56759a(C58890d.m90988c(str), Charset.forName("UTF-8")).mo56773c(), 10);
    }
}
