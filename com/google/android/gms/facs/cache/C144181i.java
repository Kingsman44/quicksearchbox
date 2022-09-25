package com.google.android.gms.facs.cache;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C143811de;
import com.google.android.gms.tasks.C146010af;
import com.google.p4184bj.p4193c.p4197c.C55966bm;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.gms.facs.cache.i */
/* compiled from: PG */
final class C144181i extends C144183k {

    /* renamed from: a */
    final /* synthetic */ C146010af f390492a;

    public C144181i(C146010af afVar) {
        this.f390492a = afVar;
    }

    /* renamed from: b */
    public final void mo119710b(Status status, UpdateActivityControlsSettingsResult updateActivityControlsSettingsResult) {
        if (status.mo119097c()) {
            try {
                C143811de.m233724a(status, (C55966bm) C62942bv.parseFrom((C62942bv) C55966bm.f149040b, updateActivityControlsSettingsResult.f390485a), this.f390492a);
            } catch (C62974ct e) {
                this.f390492a.f394698a.mo122507u(e);
            }
        } else {
            C143811de.m233724a(status, (Object) null, this.f390492a);
        }
    }
}
