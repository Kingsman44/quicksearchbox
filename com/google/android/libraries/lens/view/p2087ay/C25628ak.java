package com.google.android.libraries.lens.view.p2087ay;

import com.google.android.libraries.lens.view.gleam.C26504ci;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import java.util.List;

/* renamed from: com.google.android.libraries.lens.view.ay.ak */
/* compiled from: PG */
public final /* synthetic */ class C25628ak implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C25637at f69717a;

    /* renamed from: b */
    public final /* synthetic */ Runnable f69718b;

    /* renamed from: c */
    public final /* synthetic */ C58485gu f69719c;

    /* renamed from: d */
    public final /* synthetic */ C58485gu f69720d;

    /* renamed from: e */
    public final /* synthetic */ long f69721e;

    /* renamed from: f */
    public final /* synthetic */ long f69722f;

    /* renamed from: g */
    public final /* synthetic */ long f69723g;

    /* renamed from: h */
    public final /* synthetic */ boolean f69724h;

    /* renamed from: i */
    public final /* synthetic */ boolean f69725i;

    public /* synthetic */ C25628ak(C25637at atVar, Runnable runnable, C58485gu guVar, C58485gu guVar2, long j, long j2, long j3, boolean z, boolean z2) {
        this.f69717a = atVar;
        this.f69718b = runnable;
        this.f69719c = guVar;
        this.f69720d = guVar2;
        this.f69721e = j;
        this.f69722f = j2;
        this.f69723g = j3;
        this.f69724h = z;
        this.f69725i = z2;
    }

    public final void run() {
        long j;
        long j2;
        C26504ci ciVar;
        C25637at atVar = this.f69717a;
        Runnable runnable = this.f69718b;
        C58485gu guVar = this.f69719c;
        C58485gu guVar2 = this.f69720d;
        long j3 = this.f69721e;
        long j4 = this.f69722f;
        long j5 = this.f69723g;
        boolean z = this.f69724h;
        boolean z2 = this.f69725i;
        runnable.run();
        C25618aa aaVar = atVar.f69743e;
        if (aaVar != null) {
            if (j3 == aaVar.f69686d || !aaVar.mo30730c()) {
                j = j4;
            } else {
                j = j4;
                ((C58970a) ((C58970a) C25618aa.f69683a.mo56226d()).mo56372aa(50229)).mo56360M("*****acceptRemoveOrAddUpdateOperation: UNEXPECTED new Results: %d->%d; pending:(%d, %d)", Long.valueOf(aaVar.f69686d), Long.valueOf(j3), Integer.valueOf(aaVar.f69685c.size()), Integer.valueOf(aaVar.f69684b.size()));
                aaVar.mo30729b();
            }
            if (j3 != aaVar.f69686d) {
                aaVar.f69688f = j5;
                aaVar.f69689g = C58836b.f156633a;
            }
            if (z && !aaVar.f69689g.mo56113h()) {
                aaVar.f69689g = C58833ax.m90834k(Long.valueOf(j5));
            }
            long j6 = aaVar.f69686d;
            C25618aa.m47256a(aaVar.f69684b, guVar);
            C25618aa.m47256a(aaVar.f69685c, guVar2);
            aaVar.f69686d = j3;
            if (!z2) {
                List list = aaVar.f69684b;
                if (list.isEmpty()) {
                    ciVar = null;
                } else {
                    ciVar = (C26504ci) list.get(list.size() - 1);
                }
                j2 = ciVar == null ? 0 : ciVar.f72215i.mo33666i();
            } else {
                j2 = j;
            }
            aaVar.f69687e = j2;
            ((C58970a) ((C58970a) C25618aa.f69683a.mo56224b()).mo56372aa(50228)).mo56366S("*****acceptRemoveOrAddUpdateOperation: detection: %d -> %d ; baseline: %d new objects: (toRemove: %d, toAdd: %d); updated pending: (%d, %d) mergeStart: %d (%d %s)", Long.valueOf(j6), Long.valueOf(aaVar.f69686d), Long.valueOf(aaVar.f69687e), Integer.valueOf(guVar2.size()), Integer.valueOf(guVar.size()), Integer.valueOf(aaVar.f69685c.size()), Integer.valueOf(aaVar.f69684b.size()), Long.valueOf(j5), Long.valueOf(aaVar.f69688f), aaVar.f69689g);
        }
    }
}
