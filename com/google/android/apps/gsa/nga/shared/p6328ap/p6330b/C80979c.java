package com.google.android.apps.gsa.nga.shared.p6328ap.p6330b;

import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82455fv;
import com.google.android.libraries.gsa.p1876k.C22870f;
import com.google.common.p4526f.p4527a.C58970a;

/* renamed from: com.google.android.apps.gsa.nga.shared.ap.b.c */
/* compiled from: PG */
public final /* synthetic */ class C80979c implements C22870f {

    /* renamed from: a */
    public final /* synthetic */ C80982f f221981a;

    /* renamed from: b */
    public final /* synthetic */ long f221982b;

    public /* synthetic */ C80979c(C80982f fVar, long j) {
        this.f221981a = fVar;
        this.f221982b = j;
    }

    public final void run() {
        C80982f fVar = this.f221981a;
        ((C58970a) ((C58970a) C80982f.f221986a.mo56225c()).mo56372aa(6569)).mo56388r("Assistant invocation failure: VoiceInteractionSession onShow() wasn't called in %dms after onCreate()", this.f221982b);
        String c = fVar.mo74761c();
        if (c != null) {
            String str = fVar.f221987b;
            if (str != null) {
                fVar.mo74762d(new C82455fv("NGA_VIS_CREATED_WITHOUT_SHOWING", c, str));
                return;
            }
            throw new NullPointerException("Null processName");
        }
        throw new NullPointerException("Null mobileAssistantExperience");
    }
}
