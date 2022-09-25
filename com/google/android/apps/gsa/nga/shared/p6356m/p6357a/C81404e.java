package com.google.android.apps.gsa.nga.shared.p6356m.p6357a;

import com.google.android.apps.gsa.nga.api.a.ab;
import com.google.android.apps.gsa.nga.api.a.ad;
import com.google.android.apps.gsa.nga.api.a.cr;
import com.google.android.apps.gsa.nga.api.a.de;
import com.google.android.apps.gsa.nga.api.a.df;
import com.google.android.apps.gsa.nga.api.a.di;
import com.google.android.apps.gsa.nga.api.p5883a.C74677cq;
import com.google.android.apps.gsa.nga.api.p5883a.C74678cw;
import com.google.android.apps.gsa.nga.shared.p6339f.p6343d.C81062c;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.libraries.search.p2904c.C37672hs;
import com.google.common.p4526f.p4527a.C58970a;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.shared.m.a.e */
/* compiled from: PG */
public final /* synthetic */ class C81404e implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C81412m f222781a;

    /* renamed from: b */
    public final /* synthetic */ C37672hs f222782b;

    public /* synthetic */ C81404e(C81412m mVar, C37672hs hsVar) {
        this.f222781a = mVar;
        this.f222782b = hsVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        df dfVar;
        C81412m mVar = this.f222781a;
        C37672hs hsVar = this.f222782b;
        di diVar = (di) obj;
        int i = diVar.a;
        int a = C74677cq.m120748a(i);
        int i2 = a - 1;
        if (a != 0) {
            if (i2 == 0) {
                ((C58970a) ((C58970a) C81412m.f222799a.mo56224b()).mo56372aa(5884)).mo56389s("Transcription invocation for %s succeeded", C81062c.m129010a(Optional.m71637of(hsVar)));
            } else if (i2 == 1) {
                if (i == 2) {
                    dfVar = (df) diVar.b;
                } else {
                    dfVar = df.c;
                }
                C58970a aVar = (C58970a) ((C58970a) C81412m.f222799a.mo56224b()).mo56372aa(5885);
                String a2 = C81062c.m129010a(Optional.m71637of(hsVar));
                int b = C74678cw.m120750b(dfVar.a);
                String a3 = C74678cw.m120749a(b);
                if (b != 0) {
                    aVar.mo56354G("Transcription invocation for %s failed with status %s", a2, a3);
                    ab createBuilder = ad.d.createBuilder();
                    createBuilder.copyOnWrite();
                    hsVar.getClass();
                    createBuilder.instance.c = hsVar;
                    createBuilder.copyOnWrite();
                    ad adVar = createBuilder.instance;
                    dfVar.getClass();
                    adVar.b = dfVar;
                    adVar.a = 4;
                    mVar.mo75061c(createBuilder.build());
                } else {
                    throw null;
                }
            } else if (i2 == 2) {
                ((C58970a) ((C58970a) C81412m.f222799a.mo56226d()).mo56372aa(5886)).mo56386p("Transcription result not set");
                cr createBuilder2 = df.c.createBuilder();
                de deVar = de.a;
                createBuilder2.copyOnWrite();
                df dfVar2 = createBuilder2.instance;
                deVar.getClass();
                dfVar2.b = deVar;
                dfVar2.a = 6;
                df build = createBuilder2.build();
                ab createBuilder3 = ad.d.createBuilder();
                createBuilder3.copyOnWrite();
                hsVar.getClass();
                createBuilder3.instance.c = hsVar;
                createBuilder3.copyOnWrite();
                ad adVar2 = createBuilder3.instance;
                build.getClass();
                adVar2.b = build;
                adVar2.a = 4;
                mVar.mo75061c(createBuilder3.build());
            }
            mVar.f222804f.mo74835e(diVar);
            return;
        }
        throw null;
    }
}
