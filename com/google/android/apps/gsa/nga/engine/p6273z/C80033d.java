package com.google.android.apps.gsa.nga.engine.p6273z;

import com.google.android.apps.gsa.nga.engine.p6044n.C76248a;
import com.google.android.apps.gsa.nga.engine.p6044n.C76401e;
import com.google.android.apps.gsa.nga.engine.p6056o.C77422p;
import com.google.android.apps.gsa.nga.shared.p6358n.C81442m;
import com.google.android.apps.gsa.nga.shared.p6407v.C83305i;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82342bq;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82572kd;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82573ke;

/* renamed from: com.google.android.apps.gsa.nga.engine.z.d */
/* compiled from: PG */
public final class C80033d implements C77422p {

    /* renamed from: a */
    private final C83305i f219626a;

    public C80033d(C83305i iVar) {
        this.f219626a = iVar;
    }

    /* renamed from: c */
    public final void mo71390c(C76401e eVar) {
        C76248a aVar = (C76248a) eVar;
        if (C81442m.m129547i(aVar.f211268a.mo72528e()).isPresent()) {
            C83305i iVar = this.f219626a;
            C82572kd c = C82573ke.m131562c();
            ((C82342bq) c).f224937b = "CLOUD_HANDOVER_EXECUTION";
            iVar.mo75579d(c.mo75784a());
        } else if (aVar.f211270c) {
            C83305i iVar2 = this.f219626a;
            C82572kd c2 = C82573ke.m131562c();
            ((C82342bq) c2).f224937b = "ON_DEVICE_FAST_EXECUTION";
            iVar2.mo75579d(c2.mo75784a());
        } else {
            C83305i iVar3 = this.f219626a;
            C82572kd c3 = C82573ke.m131562c();
            ((C82342bq) c3).f224937b = "ON_DEVICE_NON_FAST_EXECUTION";
            iVar3.mo75579d(c3.mo75784a());
        }
    }

    /* renamed from: d */
    public final /* synthetic */ void mo71391d(C76401e eVar) {
    }

    /* renamed from: e */
    public final /* synthetic */ void mo71392e() {
    }

    /* renamed from: f */
    public final /* synthetic */ void mo71393f() {
    }
}
