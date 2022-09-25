package com.google.android.apps.search.assistant.surfaces.dictation.service.p9436f.p9437a;

import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126324be;
import com.google.android.libraries.search.assistant.performer.p2728a.C35472h;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.f.a.s */
/* compiled from: PG */
public final class C125453s implements C35472h {

    /* renamed from: a */
    public final C70862aj f345953a;

    /* renamed from: b */
    public final C126324be f345954b;

    /* renamed from: c */
    private final C71422aw f345955c;

    public C125453s(C70862aj ajVar, C126324be beVar, C71422aw awVar) {
        C69664n.m101061g(ajVar, "requests");
        C69664n.m101061g(beVar, "textState");
        C69664n.m101061g(awVar, "lightweightScope");
        this.f345953a = ajVar;
        this.f345954b = beVar;
        this.f345955c = awVar;
    }

    /* renamed from: a */
    public final C60870cx mo20766a(C51809dy dyVar) {
        C69664n.m101061g(dyVar, "clientOp");
        return C71663i.m104688a(C71803m.m105042c(this.f345955c, (C69585o) null, (C71424ay) null, new C125452r(this, (C69577g) null), 3));
    }
}
