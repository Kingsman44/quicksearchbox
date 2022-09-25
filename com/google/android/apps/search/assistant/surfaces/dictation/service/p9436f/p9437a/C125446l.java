package com.google.android.apps.search.assistant.surfaces.dictation.service.p9436f.p9437a;

import com.google.android.apps.gsa.binaries.satin.app.aov;
import com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.C125314ab;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9436f.C125463d;
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

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.f.a.l */
/* compiled from: PG */
public final class C125446l implements C35472h {

    /* renamed from: a */
    public final C125314ab f345939a;

    /* renamed from: b */
    public final C60870cx f345940b;

    /* renamed from: c */
    public final aov f345941c;

    /* renamed from: d */
    private final C71422aw f345942d;

    public C125446l(aov aov, C125314ab abVar, C71422aw awVar, C125463d dVar) {
        C69664n.m101061g(aov, "appControlPerformerFactory");
        C69664n.m101061g(awVar, "lightweightScope");
        this.f345941c = aov;
        this.f345939a = abVar;
        this.f345942d = awVar;
        this.f345940b = dVar.f345992f;
    }

    /* renamed from: a */
    public final C60870cx mo20766a(C51809dy dyVar) {
        C69664n.m101061g(dyVar, "clientOp");
        return C71663i.m104688a(C71803m.m105042c(this.f345942d, (C69585o) null, (C71424ay) null, new C125445k(this, dyVar, (C69577g) null), 3));
    }
}
