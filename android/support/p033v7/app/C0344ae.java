package android.support.p033v7.app;

import android.support.p033v7.view.C0434b;
import android.support.p033v7.view.C0435c;
import android.support.p033v7.view.C0438f;
import android.view.Menu;
import androidx.core.p098j.C2043bi;
import androidx.core.p098j.C2058bx;

/* renamed from: android.support.v7.app.ae */
/* compiled from: PG */
final class C0344ae implements C0434b {

    /* renamed from: a */
    final /* synthetic */ C0356aq f1139a;

    /* renamed from: b */
    private final C0434b f1140b;

    public C0344ae(C0356aq aqVar, C0434b bVar) {
        this.f1139a = aqVar;
        this.f1140b = bVar;
    }

    /* renamed from: a */
    public final void mo1123a(C0435c cVar) {
        C0438f fVar = (C0438f) this.f1140b;
        fVar.f1450a.onDestroyActionMode(fVar.mo1409e(cVar));
        C0356aq aqVar = this.f1139a;
        if (aqVar.f1220t != null) {
            aqVar.f1213m.getDecorView().removeCallbacks(this.f1139a.f1221u);
        }
        C0356aq aqVar2 = this.f1139a;
        if (aqVar2.f1219s != null) {
            aqVar2.mo1161N();
            C0356aq aqVar3 = this.f1139a;
            C2058bx x = C2043bi.m5595x(aqVar3.f1219s);
            x.mo5201c(0.0f);
            aqVar3.f1222v = x;
            this.f1139a.f1222v.mo5203e(new C0343ad(this));
        }
        C0356aq aqVar4 = this.f1139a;
        C0396q qVar = aqVar4.f1214n;
        if (qVar != null) {
            qVar.mo1204l(aqVar4.f1218r);
        }
        C0356aq aqVar5 = this.f1139a;
        aqVar5.f1218r = null;
        C2043bi.m5524R(aqVar5.f1224x);
        this.f1139a.mo1165R();
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [androidx.core.b.a.b, android.view.MenuItem] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo1124b(android.support.p033v7.view.C0435c r4, android.view.MenuItem r5) {
        /*
            r3 = this;
            android.support.v7.view.b r0 = r3.f1140b
            android.support.v7.view.f r0 = (android.support.p033v7.view.C0438f) r0
            android.view.ActionMode$Callback r1 = r0.f1450a
            android.view.ActionMode r4 = r0.mo1409e(r4)
            android.support.v7.view.menu.z r2 = new android.support.v7.view.menu.z
            android.content.Context r0 = r0.f1451b
            r2.<init>(r0, r5)
            boolean r4 = r1.onActionItemClicked(r4, r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p033v7.app.C0344ae.mo1124b(android.support.v7.view.c, android.view.MenuItem):boolean");
    }

    /* renamed from: c */
    public final boolean mo1125c(C0435c cVar, Menu menu) {
        C0438f fVar = (C0438f) this.f1140b;
        return fVar.f1450a.onCreateActionMode(fVar.mo1409e(cVar), fVar.mo1410f(menu));
    }

    /* renamed from: d */
    public final void mo1126d(C0435c cVar, Menu menu) {
        C2043bi.m5524R(this.f1139a.f1224x);
        C0438f fVar = (C0438f) this.f1140b;
        fVar.f1450a.onPrepareActionMode(fVar.mo1409e(cVar), fVar.mo1410f(menu));
    }
}
