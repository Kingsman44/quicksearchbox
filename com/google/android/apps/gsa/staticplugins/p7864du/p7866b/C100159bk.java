package com.google.android.apps.gsa.staticplugins.p7864du.p7866b;

import com.google.android.apps.gsa.store.C118302a;
import com.google.android.apps.gsa.store.C118336y;
import com.google.common.base.C58833ax;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.du.b.bk */
/* compiled from: PG */
final class C100159bk implements C100158bj {

    /* renamed from: a */
    private final C118336y f280073a;

    /* renamed from: b */
    private final String f280074b;

    public C100159bk(C118336y yVar, String str) {
        this.f280073a = yVar;
        this.f280074b = str;
    }

    /* renamed from: a */
    public final void mo91779a(C58833ax axVar, C58833ax axVar2, StringBuilder sb, List list) {
        C118302a a = C118302a.m196461a(Integer.parseInt(this.f280073a.mo103656b()));
        if (axVar2.mo56113h() && ((C100187m) axVar2.mo56107c()).mo91797e(a)) {
            sb.append(((C100187m) axVar2.mo56107c()).mo91794b(a));
            sb.append("_");
        }
        sb.append(this.f280074b);
    }
}
