package com.google.android.apps.search.assistant.platform.pcp.p9325b;

import android.database.Cursor;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123731ay;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123732az;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123777f;
import com.google.android.libraries.storage.p3315b.C42844bc;
import com.google.android.libraries.storage.p3315b.C42847bf;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.b.x */
/* compiled from: PG */
public final /* synthetic */ class C123647x implements C42844bc {

    /* renamed from: a */
    public final /* synthetic */ C123610ac f341583a;

    /* renamed from: b */
    public final /* synthetic */ List f341584b;

    /* renamed from: c */
    public final /* synthetic */ C53306j f341585c;

    /* renamed from: d */
    public final /* synthetic */ boolean f341586d;

    /* renamed from: e */
    public final /* synthetic */ C123777f f341587e;

    public /* synthetic */ C123647x(C123610ac acVar, List list, C53306j jVar, boolean z, C123777f fVar) {
        this.f341583a = acVar;
        this.f341584b = list;
        this.f341585c = jVar;
        this.f341586d = z;
        this.f341587e = fVar;
    }

    /* renamed from: a */
    public final Object mo45922a(C42847bf bfVar) {
        C123610ac acVar = this.f341583a;
        List list = this.f341584b;
        C53306j jVar = this.f341585c;
        boolean z = this.f341586d;
        C123777f fVar = this.f341587e;
        Cursor d = bfVar.mo45932d(C123611ad.m202951j(new ArrayList(), list, jVar, z));
        try {
            C58490gz gzVar = new C58490gz(4);
            while (d.moveToNext()) {
                if (!acVar.mo106069m(d, fVar)) {
                    C123731ay ayVar = (C123731ay) C123732az.f341771d.createBuilder();
                    gzVar.mo55429h(C123610ac.m202927o(d, ayVar), (C123732az) ayVar.build());
                }
            }
            C58495hd f = gzVar.mo55427f(false);
            if (d != null) {
                d.close();
            }
            return f;
        } catch (Throwable th) {
            C123633j.m203004a(th, th);
        }
        throw th;
    }
}
