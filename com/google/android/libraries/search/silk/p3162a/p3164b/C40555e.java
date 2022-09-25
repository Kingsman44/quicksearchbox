package com.google.android.libraries.search.silk.p3162a.p3164b;

import com.google.android.libraries.search.p2904c.C37418bw;
import com.google.android.libraries.search.p2904c.C37514du;
import com.google.android.libraries.search.p2904c.p2927f.C37587a;
import com.google.android.libraries.silk.p3238b.C41742a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4299d.C56677e;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4299d.C56678f;
import com.google.p4283bv.p4287b.p4288a.p4322b.C56847c;
import com.google.p4283bv.p4287b.p4288a.p4322b.C56848d;
import com.google.p4283bv.p4412k.p4413a.C57833a;
import com.google.p4283bv.p4412k.p4413a.C57834b;
import com.google.p4283bv.p4412k.p4413a.C57836d;
import com.google.protobuf.C63088z;
import java.io.IOException;

/* renamed from: com.google.android.libraries.search.silk.a.b.e */
/* compiled from: PG */
public final /* synthetic */ class C40555e implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C40562l f106435a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f106436b;

    public /* synthetic */ C40555e(C40562l lVar, C60870cx cxVar) {
        this.f106435a = lVar;
        this.f106436b = cxVar;
    }

    public final C60870cx apply(Object obj) {
        C40562l lVar = this.f106435a;
        C60870cx cxVar = this.f106436b;
        C37514du duVar = ((C37418bw) obj).f99354b;
        if (duVar == null) {
            duVar = C37514du.f99629c;
        }
        if (duVar.f99631a != 1) {
            return C60856cj.m92899h(new C41742a(C40562l.f106448d));
        }
        try {
            C37587a aVar = new C37587a(cxVar);
            C56677e eVar = (C56677e) C56678f.f151288c.createBuilder();
            C57833a aVar2 = (C57833a) C57834b.f154523d.createBuilder();
            C63088z F = C63088z.m96144F(aVar);
            aVar2.copyOnWrite();
            C57834b bVar = (C57834b) aVar2.instance;
            F.getClass();
            bVar.f154525a |= 1;
            bVar.f154526b = F;
            C57836d dVar = lVar.f106460p;
            dVar.getClass();
            int i = dVar.f154530a;
            aVar2.copyOnWrite();
            C57834b bVar2 = (C57834b) aVar2.instance;
            bVar2.f154525a |= 2;
            bVar2.f154527c = i;
            eVar.copyOnWrite();
            C56678f fVar = (C56678f) eVar.instance;
            C57834b bVar3 = (C57834b) aVar2.build();
            bVar3.getClass();
            fVar.f151291b = bVar3;
            fVar.f151290a |= 1;
            return C60856cj.m92900i((C56678f) eVar.build());
        } catch (IOException e) {
            C56847c cVar = (C56847c) C56848d.f151669d.createBuilder();
            cVar.copyOnWrite();
            C56848d dVar2 = (C56848d) cVar.instance;
            dVar2.f151671a = 1 | dVar2.f151671a;
            dVar2.f151672b = "input_stream_read_failed";
            String message = e.getMessage() != null ? e.getMessage() : "Failed to read input stream.";
            cVar.copyOnWrite();
            C56848d dVar3 = (C56848d) cVar.instance;
            message.getClass();
            dVar3.f151671a |= 2;
            dVar3.f151673c = message;
            return C60856cj.m92899h(new C41742a((C56848d) cVar.build()));
        }
    }
}
