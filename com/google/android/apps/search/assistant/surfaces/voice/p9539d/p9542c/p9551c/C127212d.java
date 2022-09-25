package com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9551c;

import com.google.android.apps.search.assistant.surfaces.voice.p9539d.C127369n;
import com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9575d.C127289i;
import com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9575d.C127294n;
import com.google.android.apps.search.assistant.verticals.p9880a.p9884c.C130353c;
import com.google.android.apps.search.assistant.verticals.p9880a.p9884c.p9886b.C130352d;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32801aw;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32810be;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32836cd;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.d.c.c.d */
/* compiled from: PG */
public final class C127212d implements C127369n {

    /* renamed from: a */
    public static final C32836cd f350255a = C130352d.f357258a;

    /* renamed from: b */
    private static final C59071e f350256b = C59071e.m91331h();

    /* renamed from: c */
    private final C68214a f350257c;

    public C127212d(C68214a aVar) {
        C69664n.m101061g(aVar, "appDataAccessor");
        this.f350257c = aVar;
    }

    /* renamed from: a */
    public final C60870cx mo107986a(C127289i iVar, C32810be beVar) {
        C69664n.m101061g(iVar, "queryContext");
        C69664n.m101061g(beVar, "request");
        C59052c cVar = (C59052c) f350256b.mo56224b();
        cVar.mo56379ah(new C59094n(37260));
        cVar.mo56386p("Fetches app actions context.");
        C127294n nVar = iVar.f350567e;
        if (nVar == null) {
            nVar = C127294n.f350576c;
        }
        if ((nVar.f350578a & 1) == 0) {
            return C60856cj.m92900i(C32801aw.f87978c);
        }
        C130353c cVar2 = (C130353c) this.f350257c.mo27525b();
        C127294n nVar2 = iVar.f350567e;
        if (nVar2 == null) {
            nVar2 = C127294n.f350576c;
        }
        C34053bp bpVar = nVar2.f350579b;
        if (bpVar == null) {
            bpVar = C34053bp.f90753a;
        }
        return C47633f.m84733g(cVar2.mo106973c(bpVar)).mo51515h(C127211c.f350254a, C60826bg.f164896a);
    }
}
