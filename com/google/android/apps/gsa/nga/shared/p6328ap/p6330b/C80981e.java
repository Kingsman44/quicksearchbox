package com.google.android.apps.gsa.nga.shared.p6328ap.p6330b;

import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82456fw;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.nga.shared.ap.b.e */
/* compiled from: PG */
public final /* synthetic */ class C80981e implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C80982f f221984a;

    /* renamed from: b */
    public final /* synthetic */ long f221985b;

    public /* synthetic */ C80981e(C80982f fVar, long j) {
        this.f221984a = fVar;
        this.f221985b = j;
    }

    public final void run() {
        C80982f fVar = this.f221984a;
        long j = this.f221985b;
        String c = fVar.mo74761c();
        if (c != null) {
            String str = fVar.f221987b;
            if (str != null) {
                fVar.mo74762d(new C82456fw("NGA_VIS_SHOW_AFTER_CREATED", Double.valueOf((double) j), c, str));
                fVar.f221988c = true;
                return;
            }
            throw new NullPointerException("Null processName");
        }
        throw new NullPointerException("Null mobileAssistantExperience");
    }
}
