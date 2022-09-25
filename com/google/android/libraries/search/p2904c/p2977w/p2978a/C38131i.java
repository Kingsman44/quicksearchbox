package com.google.android.libraries.search.p2904c.p2977w.p2978a;

import com.google.android.libraries.search.p2904c.C37402bg;
import com.google.android.libraries.search.p2904c.C37403bh;
import com.google.android.libraries.search.p2904c.C37410bo;
import com.google.android.libraries.search.p2904c.C37458cg;
import com.google.android.libraries.search.p2904c.C37639gr;
import com.google.android.libraries.search.p2904c.C37679hz;
import com.google.android.libraries.search.p2904c.p2942m.C37895i;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.search.c.w.a.i */
/* compiled from: PG */
public final class C38131i implements C37403bh {

    /* renamed from: a */
    private static final C59071e f101031a = C59071e.m91332i("com.google.android.libraries.search.c.w.a.i");

    /* renamed from: b */
    private final C37895i f101032b;

    /* renamed from: c */
    private final C37458cg f101033c;

    /* renamed from: d */
    private final C60870cx f101034d;

    public C38131i(C37458cg cgVar, C60870cx cxVar, C37895i iVar) {
        this.f101033c = cgVar;
        this.f101032b = iVar;
        this.f101034d = cxVar;
    }

    /* renamed from: a */
    public final C37402bg mo40933a(C37410bo boVar) {
        C59104x b = f101031a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ALT.AudioRouteSession");
        C59052c cVar = (C59052c) ((C59052c) b).mo56372aa(52976);
        C37639gr grVar = this.f101033c.f99436b;
        if (grVar == null) {
            grVar = C37639gr.f100004c;
        }
        int i = grVar.f100007b;
        C37679hz hzVar = this.f101033c.f99437c;
        if (hzVar == null) {
            hzVar = C37679hz.f100067c;
        }
        cVar.mo56393w("#audio# start listening for audio request client(token(%s)) on route(token(%s))", i, hzVar.f100070b);
        return this.f101032b.mo41110k(this.f101033c, boVar).mo41093b();
    }

    /* renamed from: b */
    public final C60870cx mo40934b() {
        return C60856cj.m92901j(this.f101034d);
    }
}
