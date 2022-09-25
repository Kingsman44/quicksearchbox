package com.google.android.libraries.assistant.p1363c.p1398g.p1441n.p1443b;

import androidx.p104d.p105a.C2164c;
import com.google.android.libraries.assistant.p1363c.p1398g.p1405d.C17377g;
import com.google.android.libraries.assistant.p1363c.p1398g.p1444o.p1447c.C17586a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.libraries.assistant.c.g.n.b.t */
/* compiled from: PG */
public final /* synthetic */ class C17570t implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C17571u f50652a;

    /* renamed from: b */
    public final /* synthetic */ Exception f50653b;

    public /* synthetic */ C17570t(C17571u uVar, Exception exc) {
        this.f50652a = uVar;
        this.f50653b = exc;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C17571u uVar = this.f50652a;
        Exception exc = this.f50653b;
        C59104x d = C17572v.f50658a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "TTS.Server");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(exc)).mo56372aa(42789)).mo56351D("Server synthesis timed out after %d ms for sessionToken %s", uVar.f50654a, C17377g.m34655c(uVar.f50655b.f50659b));
        uVar.f50655b.f50663f.f155056f.mo54590g(exc);
        uVar.f50655b.f50664g.f155056f.mo54590g(exc);
        ((C2164c) uVar.f50655b.f50665h.get()).mo5437b(C17586a.m34876c(202));
        return C60866ct.f164955a;
    }
}
