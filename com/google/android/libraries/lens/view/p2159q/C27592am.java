package com.google.android.libraries.lens.view.p2159q;

import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24439aa;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24440ab;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24446ah;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24465t;
import com.google.android.libraries.mdi.C29690f;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.lens.view.q.am */
/* compiled from: PG */
public final /* synthetic */ class C27592am implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C27608bb f75398a;

    /* renamed from: b */
    public final /* synthetic */ C24465t f75399b;

    /* renamed from: c */
    public final /* synthetic */ int f75400c;

    public /* synthetic */ C27592am(C27608bb bbVar, int i, C24465t tVar) {
        this.f75398a = bbVar;
        this.f75400c = i;
        this.f75399b = tVar;
    }

    public final C60870cx apply(Object obj) {
        C27608bb bbVar = this.f75398a;
        int i = this.f75400c;
        C24465t tVar = this.f75399b;
        C29690f fVar = (C29690f) obj;
        if (fVar == null) {
            bbVar.mo33135l(i, C24446ah.STATUS_MODEL_UNKNOWN, tVar.f66967b);
            C24439aa aaVar = (C24439aa) C24440ab.f66917g.createBuilder();
            aaVar.copyOnWrite();
            C24440ab abVar = (C24440ab) aaVar.instance;
            tVar.getClass();
            abVar.f66920b = tVar;
            abVar.f66919a |= 1;
            C24446ah ahVar = C24446ah.STATUS_MODEL_UNKNOWN;
            aaVar.copyOnWrite();
            C24440ab abVar2 = (C24440ab) aaVar.instance;
            abVar2.f66922d = ahVar.f66939g;
            abVar2.f66919a |= 2;
            aaVar.copyOnWrite();
            C24440ab abVar3 = (C24440ab) aaVar.instance;
            abVar3.f66924f = 0;
            abVar3.f66919a |= 8;
            return C60856cj.m92900i((C24440ab) aaVar.build());
        }
        String str = tVar.f66967b;
        return bbVar.mo33134k(fVar, tVar, i);
    }
}
