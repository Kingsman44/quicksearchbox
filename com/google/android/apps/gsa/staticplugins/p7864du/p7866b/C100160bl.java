package com.google.android.apps.gsa.staticplugins.p7864du.p7866b;

import com.google.android.apps.gsa.store.C118302a;
import com.google.android.apps.gsa.store.C118336y;
import com.google.common.base.C58833ax;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.du.b.bl */
/* compiled from: PG */
final class C100160bl implements C100158bj {

    /* renamed from: a */
    private final C118336y f280075a;

    /* renamed from: b */
    private final String f280076b;

    public C100160bl(C118336y yVar, String str) {
        this.f280075a = yVar;
        this.f280076b = str;
    }

    /* renamed from: a */
    public final void mo91779a(C58833ax axVar, C58833ax axVar2, StringBuilder sb, List list) {
        C118302a a = C118302a.m196461a(Integer.parseInt(this.f280075a.mo103656b()));
        if (axVar2.mo56113h() && ((C100187m) axVar2.mo56107c()).mo91797e(a)) {
            sb.append(((C100187m) axVar2.mo56107c()).mo91794b(a));
            sb.append(".");
        }
        sb.append(this.f280076b);
    }
}
