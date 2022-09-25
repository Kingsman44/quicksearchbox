package com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9683d;

import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70715et;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5531h.p5532a.C70850d;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.j.b.a.d.s */
/* compiled from: PG */
public final class C128187s {

    /* renamed from: a */
    private static volatile C70338di f352637a;

    /* renamed from: b */
    private static volatile C70338di f352638b;

    /* renamed from: c */
    private static volatile C70716eu f352639c;

    private C128187s() {
    }

    /* renamed from: a */
    public static C70338di m209272a() {
        C70338di diVar = f352637a;
        if (diVar == null) {
            synchronized (C128187s.class) {
                diVar = f352637a;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("com.google.android.apps.search.assistant.surfaces.voice.input.fre.service.proto.FreSuggestionsService", "FetchFreSuggestions");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C128174f.f352598e);
                    d.f187486b = C70850d.m103697c(C128176h.f352604d);
                    diVar = d.mo62040a();
                    f352637a = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: b */
    public static C70338di m209273b() {
        C70338di diVar = f352638b;
        if (diVar == null) {
            synchronized (C128187s.class) {
                diVar = f352638b;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("com.google.android.apps.search.assistant.surfaces.voice.input.fre.service.proto.FreSuggestionsService", "RegisterFreSuggestionImpressions");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C128191w.f352648d);
                    d.f187486b = C70850d.m103697c(C128193y.f352653a);
                    diVar = d.mo62040a();
                    f352638b = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: c */
    public static C70716eu m209274c() {
        C70716eu euVar = f352639c;
        if (euVar == null) {
            synchronized (C128187s.class) {
                euVar = f352639c;
                if (euVar == null) {
                    C70715et etVar = new C70715et("com.google.android.apps.search.assistant.surfaces.voice.input.fre.service.proto.FreSuggestionsService");
                    etVar.mo62433a(m209272a());
                    etVar.mo62433a(m209273b());
                    euVar = new C70716eu(etVar);
                    f352639c = euVar;
                }
            }
        }
        return euVar;
    }
}
