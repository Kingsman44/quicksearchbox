package com.google.android.apps.gsa.nga.engine.recognition.p6123j.p6124a;

import com.google.android.apps.gsa.nga.engine.p6260x.C79856d;
import com.google.android.apps.gsa.nga.engine.recognition.C77566as;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.p4527a.C58970a;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.j.a.at */
/* compiled from: PG */
public final /* synthetic */ class C77696at implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C77701ay f214019a;

    /* renamed from: b */
    public final /* synthetic */ C77566as f214020b;

    /* renamed from: c */
    public final /* synthetic */ C79856d f214021c;

    public /* synthetic */ C77696at(C77701ay ayVar, C77566as asVar, C79856d dVar) {
        this.f214019a = ayVar;
        this.f214020b = asVar;
        this.f214021c = dVar;
    }

    public final void run() {
        C77701ay ayVar = this.f214019a;
        C77566as asVar = this.f214020b;
        C79856d dVar = this.f214021c;
        if (asVar.mo72694s() || asVar.mo72698w()) {
            ayVar.mo72780g();
        }
        if (!ayVar.mo72781h(asVar, dVar)) {
            ((C58970a) ((C58970a) C77701ay.f214029a.mo56226d()).mo56372aa(4405)).mo56386p("S3 Session is already active, discarding speech params.");
            ayVar.f214030b.mo72746b(asVar);
        }
    }
}
