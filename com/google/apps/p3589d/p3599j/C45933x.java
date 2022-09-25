package com.google.apps.p3589d.p3599j;

import com.google.apps.p3589d.p3592c.C45725a;
import com.google.apps.p3589d.p3592c.C45731g;
import com.google.apps.p3589d.p3593d.C45755n;
import com.google.apps.p3589d.p3593d.C45763v;
import com.google.apps.p3589d.p3595f.C45821x;

/* renamed from: com.google.apps.d.j.x */
/* compiled from: PG */
final class C45933x extends C45917h {

    /* renamed from: a */
    final /* synthetic */ C45906ad f120713a;

    /* renamed from: b */
    final /* synthetic */ int f120714b;

    /* renamed from: c */
    final /* synthetic */ int f120715c;

    /* renamed from: d */
    final /* synthetic */ C45908af f120716d;

    /* renamed from: e */
    final /* synthetic */ C45908af f120717e;

    public C45933x(C45906ad adVar, int i, int i2, C45908af afVar, C45908af afVar2) {
        this.f120713a = adVar;
        this.f120714b = i;
        this.f120715c = i2;
        this.f120716d = afVar;
        this.f120717e = afVar2;
    }

    /* renamed from: a */
    public final C45916g mo50023a(C45731g gVar) {
        C45906ad adVar = this.f120713a;
        int i = this.f120714b;
        int i2 = this.f120715c;
        C45908af afVar = this.f120716d;
        C45908af afVar2 = this.f120717e;
        C45917h hVar = C45909ag.f120669a;
        int i3 = 0;
        while (i3 < ((C45725a) gVar).f120228c) {
            C45755n i4 = gVar.mo49854i(i3);
            if (i4.f120319h != 4 || i4.f120317f != C45821x.DEFAULT || !adVar.mo50025a(i4.f120314c.codePointAt(0))) {
                break;
            }
            C45763v vVar = i4.f120315d;
            C45763v vVar2 = i4.f120316e;
            if (vVar != null && !afVar.mo50029a(vVar)) {
                return null;
            }
            if (vVar2 != null && !afVar2.mo50029a(vVar2)) {
                return null;
            }
            i3++;
        }
        if (i > i3 || i3 > i2) {
            return null;
        }
        return new C45902a(gVar.mo49851f(0, i3));
    }
}
