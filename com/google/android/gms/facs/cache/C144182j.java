package com.google.android.gms.facs.cache;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C143811de;
import com.google.android.gms.tasks.C146010af;
import com.google.p4184bj.p4193c.p4197c.C55944ar;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.gms.facs.cache.j */
/* compiled from: PG */
final class C144182j extends C144183k {

    /* renamed from: a */
    final /* synthetic */ C146010af f390493a;

    public C144182j(C146010af afVar) {
        this.f390493a = afVar;
    }

    /* renamed from: c */
    public final void mo119711c(Status status, GetActivityControlsSettingsResult getActivityControlsSettingsResult) {
        if (status.mo119097c()) {
            try {
                C143811de.m233724a(status, (C55944ar) C62942bv.parseFrom((C62942bv) C55944ar.f148910d, getActivityControlsSettingsResult.f390483a), this.f390493a);
            } catch (C62974ct e) {
                this.f390493a.f394698a.mo122507u(e);
            }
        } else {
            C143811de.m233724a(status, (Object) null, this.f390493a);
        }
    }
}
