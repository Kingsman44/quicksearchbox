package com.google.android.apps.search.assistant.surfaces.dictation.service.p9474p;

import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125112cm;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125127da;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125135di;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.p9480a.C126288a;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.android.libraries.search.p2871b.p2895i.C37258g;
import com.google.common.p4526f.C59052c;
import p5488io.grpc.p5533i.C70862aj;
import p5535j.p5536a.p5545c.p5548c.p5549a.C70993at;
import p5535j.p5536a.p5545c.p5548c.p5549a.C70994au;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.p.m */
/* compiled from: PG */
final class C126184m implements C70862aj {

    /* renamed from: a */
    private final C126177f f347708a;

    /* renamed from: b */
    private final C70862aj f347709b;

    public C126184m(C126177f fVar, C70862aj ajVar) {
        this.f347708a = fVar;
        this.f347709b = ajVar;
    }

    /* renamed from: a */
    public final void mo20121a() {
        this.f347709b.mo20121a();
    }

    /* renamed from: b */
    public final void mo20122b(Throwable th) {
        this.f347709b.mo20122b(th);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo20123c(Object obj) {
        C125135di diVar = (C125135di) obj;
        if (diVar.f345209a == 3) {
            C126177f fVar = this.f347708a;
            C125127da daVar = (C125127da) diVar.f345210b;
            C125112cm a = C125112cm.m205002a(daVar.f345194a);
            if (a == null) {
                a = C125112cm.UNRECOGNIZED;
            }
            if (a.equals(C125112cm.UNRECOGNIZED)) {
                C59052c cVar = (C59052c) ((C59052c) C126178g.f347682a.mo56226d()).mo56372aa(36862);
                C125112cm a2 = C125112cm.m205002a(daVar.f345194a);
                if (a2 == null) {
                    a2 = C125112cm.UNRECOGNIZED;
                }
                cVar.mo56389s("Unrecognized keyboard interaction type %s [SD]", C126288a.m206491c(a2));
            } else {
                C37258g gVar = C37176a.f96970ci;
                C70993at atVar = (C70993at) C70994au.f189311p.createBuilder();
                C125112cm a3 = C125112cm.m205002a(daVar.f345194a);
                if (a3 == null) {
                    a3 = C125112cm.UNRECOGNIZED;
                }
                atVar.copyOnWrite();
                C70994au auVar = (C70994au) atVar.instance;
                auVar.f189323j = a3.getNumber();
                auVar.f189314a |= 256;
                fVar.mo107436g(gVar, (C70994au) atVar.build());
            }
        }
        this.f347709b.mo20123c(diVar);
    }
}
