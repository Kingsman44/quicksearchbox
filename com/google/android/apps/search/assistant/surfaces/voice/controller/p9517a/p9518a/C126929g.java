package com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9518a;

import com.google.assistant.p3897e.p3921j.C51785da;
import java.util.List;
import p5460g.p5461a.C69464a;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.controller.a.a.g */
/* compiled from: PG */
public final class C126929g {
    /* renamed from: b */
    public static final C126930h m207621b(C51785da daVar, C69464a aVar) {
        C69664n.m101061g(daVar, "supportedClientOp");
        C69664n.m101061g(aVar, "performer");
        List b = C69540x.m100944b(daVar);
        C69664n.m101061g(aVar, "performer");
        return new C126930h(b, new C126924b(aVar));
    }

    /* renamed from: c */
    public static final C126930h m207622c(C51785da daVar, C69626l lVar) {
        C69664n.m101061g(daVar, "supportedClientOp");
        C69664n.m101061g(lVar, "fn");
        List b = C69540x.m100944b(daVar);
        C69664n.m101061g(lVar, "fn");
        return new C126930h(b, new C126925c(lVar));
    }

    /* renamed from: d */
    public static final C126930h m207623d(C51785da daVar, C69464a aVar) {
        C69664n.m101061g(daVar, "supportedClientOp");
        C69664n.m101061g(aVar, "prefetcher");
        return new C126930h(C69540x.m100944b(daVar), C126927e.m207619a(aVar));
    }

    /* renamed from: a */
    public final C126928f mo107855a(C126928f fVar, String str) {
        if (!(fVar instanceof C126931i)) {
            return fVar;
        }
        Object obj = ((C126931i) fVar).f349462a.get(str);
        C69664n.m101058d(obj);
        return mo107855a((C126928f) obj, str);
    }
}
