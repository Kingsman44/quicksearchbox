package com.google.android.apps.search.assistant.surfaces.dictation.service.p9436f.p9437a;

import com.google.android.apps.search.assistant.surfaces.dictation.service.p9460m.C125931t;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.C126057bv;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9474p.C126181j;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9476q.p9477a.C126186a;
import com.google.android.libraries.search.assistant.performer.p2728a.C35472h;
import com.google.android.libraries.search.assistant.performer.p2767j.C36180b;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.p4522b.C58528ij;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.f.a.o */
/* compiled from: PG */
final class C125449o implements C35472h {

    /* renamed from: a */
    private final C126181j f345945a;

    /* renamed from: b */
    private final C70862aj f345946b;

    /* renamed from: c */
    private final C125931t f345947c;

    /* renamed from: d */
    private final C126057bv f345948d;

    /* renamed from: e */
    private final C58528ij f345949e;

    /* renamed from: f */
    private final int f345950f;

    public C125449o(C126181j jVar, int i, C70862aj ajVar, C125931t tVar, C126057bv bvVar, C58528ij ijVar) {
        this.f345945a = jVar;
        this.f345946b = ajVar;
        this.f345947c = tVar;
        this.f345950f = i;
        this.f345948d = bvVar;
        this.f345949e = ijVar;
    }

    /* renamed from: a */
    public final C60870cx mo20766a(C51809dy dyVar) {
        C125931t tVar = this.f345947c;
        C58528ij ijVar = this.f345949e;
        C69664n.m101061g(ijVar, "appPackages");
        if (ijVar.contains(tVar.mo107187f())) {
            this.f345945a.mo107441l(dyVar);
            this.f345948d.mo107295s();
        } else {
            this.f345945a.mo107443n(dyVar);
            int i = this.f345950f;
            if (i == 11 || i == 17) {
                this.f345948d.mo107279c();
            }
            C126186a.m206399b(this.f345950f, this.f345946b);
        }
        return C60856cj.m92900i(C36180b.f94544a);
    }
}
