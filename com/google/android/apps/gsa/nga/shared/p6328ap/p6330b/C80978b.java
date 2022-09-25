package com.google.android.apps.gsa.nga.shared.p6328ap.p6330b;

import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82454fu;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.nga.shared.ap.b.b */
/* compiled from: PG */
public final /* synthetic */ class C80978b implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C80982f f221980a;

    public /* synthetic */ C80978b(C80982f fVar) {
        this.f221980a = fVar;
    }

    public final void run() {
        C80982f fVar = this.f221980a;
        String c = fVar.mo74761c();
        if (c != null) {
            String str = fVar.f221987b;
            if (str != null) {
                fVar.mo74762d(new C82454fu("NGA_VIS_CREATED", c, str));
                return;
            }
            throw new NullPointerException("Null processName");
        }
        throw new NullPointerException("Null mobileAssistantExperience");
    }
}
