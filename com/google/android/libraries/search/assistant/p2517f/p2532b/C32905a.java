package com.google.android.libraries.search.assistant.p2517f.p2532b;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32805b;
import com.google.android.libraries.search.assistant.p2705n.C34819a;
import com.google.android.libraries.search.assistant.p2705n.p2706a.C34830d;
import com.google.android.libraries.search.assistant.p2705n.p2708b.C34834b;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.common.p4537i.C59289n;
import com.google.common.p4537i.C59294s;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protobuf.C62972cr;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.f.b.a */
/* compiled from: PG */
public final class C32905a {
    /* renamed from: a */
    public static final String m60895a(C32805b bVar) {
        C69664n.m101061g(bVar, "accessSessionKey");
        String str = bVar.f87987b;
        C59289n b = C59294s.m92132b().mo56760b(bVar.f87986a.mo59170I(C62972cr.f170009a));
        return str + "@" + b;
    }

    /* renamed from: b */
    public static final void m60896b(C37252a aVar, Throwable th) {
        if (th == null) {
            aVar.mo40781e(C62722b.OK);
            return;
        }
        C34834b bVar = C34830d.m63595b(th).f92362c;
        if (bVar == null) {
            bVar = C34834b.f92401c;
        }
        C34819a b = C34819a.m63579b(bVar);
        aVar.mo40780d(b.mo39520a(), b.mo39522e());
    }

    /* renamed from: c */
    public static final void m60897c(C37252a aVar, C32805b bVar) {
        String a = m60895a(bVar);
        C37253b bVar2 = (C37253b) aVar;
        bVar2.mo40795s("access_session_key_tag", a);
        bVar2.mo40794r(a);
    }

    /* renamed from: d */
    public static final void m60898d(C37252a aVar, C32805b bVar, long j) {
        String a = m60895a(bVar);
        String str = m60895a(bVar) + "_" + j;
        C37253b bVar2 = (C37253b) aVar;
        bVar2.mo40795s("access_session_key_tag", a);
        bVar2.mo40795s("context_fetch", str);
        bVar2.mo40794r(str);
    }
}
