package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p787c.p790b.p791a.p792a;

import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2169h;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.p4456g.C57974a;
import com.google.p4449cd.p4456g.C57996c;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.speech.p5208h.C66611ci;
import com.google.speech.p5224k.p5225a.C67237o;
import com.google.speech.p5224k.p5225a.C67238p;
import com.google.speech.recognizer.p5233a.C67437af;
import com.google.speech.recognizer.p5233a.C67438ag;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.a.c.b.a.a.j */
/* compiled from: PG */
final class C12335j implements C57974a {

    /* renamed from: a */
    public final C60870cx f39142a;

    /* renamed from: b */
    public C2164c f39143b;

    /* renamed from: c */
    private final C57974a f39144c;

    /* renamed from: d */
    private boolean f39145d = false;

    public C12335j(C57974a aVar) {
        this.f39144c = aVar;
        this.f39142a = C2169h.m6027a(new C12334i(this));
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo20337c(Object obj) {
        Object obj2;
        Object obj3;
        C67438ag agVar;
        C66611ci ciVar = (C66611ci) obj;
        if (!this.f39145d) {
            C62940bt r0 = C62942bv.checkIsLite(C67238p.f182737f);
            ciVar.mo58887l(r0);
            if (ciVar.f169962ag.mo58857o(r0.f169971d)) {
                C62940bt r02 = C62942bv.checkIsLite(C67238p.f182737f);
                ciVar.mo58887l(r02);
                Object l = ciVar.f169962ag.mo58854l(r02.f169971d);
                if (l == null) {
                    obj2 = r02.f169969b;
                } else {
                    obj2 = r02.mo58889c(l);
                }
                int a = C67237o.m97442a(((C67238p) obj2).f182740b);
                if (a == 0) {
                    throw null;
                } else if (a == 2) {
                    C62940bt r03 = C62942bv.checkIsLite(C67238p.f182737f);
                    ciVar.mo58887l(r03);
                    Object l2 = ciVar.f169962ag.mo58854l(r03.f169971d);
                    if (l2 == null) {
                        obj3 = r03.f169969b;
                    } else {
                        obj3 = r03.mo58889c(l2);
                    }
                    C67238p pVar = (C67238p) obj3;
                    if (pVar.f182740b == 1) {
                        agVar = (C67438ag) pVar.f182741c;
                    } else {
                        agVar = C67438ag.f183256k;
                    }
                    this.f39144c.mo20337c(agVar);
                    int a2 = C67437af.m97466a(agVar.f183259b);
                    if (a2 != 0 && a2 == 2) {
                        mo20339gQ(false);
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo20338d(C57996c cVar) {
        this.f39144c.mo20338d(cVar);
    }

    /* renamed from: gQ */
    public final void mo20339gQ(boolean z) {
        if (!this.f39145d) {
            this.f39145d = true;
            this.f39144c.mo20339gQ(z);
            C2164c cVar = this.f39143b;
            if (cVar != null) {
                cVar.mo5437b(C118826c.f331422a);
            }
        }
    }

    /* renamed from: gR */
    public final void mo20340gR(Throwable th) {
        if (!this.f39145d) {
            this.f39145d = true;
            this.f39144c.mo20340gR(th);
            C2164c cVar = this.f39143b;
            if (cVar != null) {
                cVar.mo5439d(th);
            }
        }
    }
}
