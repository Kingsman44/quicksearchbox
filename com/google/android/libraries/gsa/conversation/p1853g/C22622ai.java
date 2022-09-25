package com.google.android.libraries.gsa.conversation.p1853g;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.libraries.gsa.conversation.C22727l;
import com.google.android.libraries.gsa.conversation.p1855h.C22721y;
import com.google.android.libraries.gsa.conversation.p1855h.C22722z;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.libraries.gsa.conversation.g.ai */
/* compiled from: PG */
public final /* synthetic */ class C22622ai implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f62319a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f62320b;

    /* renamed from: c */
    public final /* synthetic */ C22618ae f62321c;

    /* renamed from: d */
    public final /* synthetic */ C52081en f62322d;

    /* renamed from: e */
    public final /* synthetic */ boolean f62323e;

    public /* synthetic */ C22622ai(C60870cx cxVar, C60870cx cxVar2, C22618ae aeVar, C52081en enVar, boolean z) {
        this.f62319a = cxVar;
        this.f62320b = cxVar2;
        this.f62321c = aeVar;
        this.f62322d = enVar;
        this.f62323e = z;
    }

    public final Object call() {
        C22721y yVar;
        C60870cx cxVar = this.f62319a;
        C60870cx cxVar2 = this.f62320b;
        C22618ae aeVar = this.f62321c;
        C52081en enVar = this.f62322d;
        boolean z = this.f62323e;
        C58485gu m = C58485gu.m89845m();
        try {
            m = (C58485gu) C60856cj.m92909r(cxVar);
        } catch (Throwable th) {
            C59104x c = C22654bn.f62403a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "ProcessorHelper");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(48371)).mo56386p("Failed to retrieve list of client op result metadata from completed execution.");
        }
        try {
            C60856cj.m92909r(cxVar2);
            C58976aa aaVar = C58975e.f156826a;
            aeVar.mo27741b(C22722z.m42355e(C22654bn.m42174f(enVar), C22721y.SUCCESS, m));
            if (z) {
                try {
                    ((C22727l) aeVar).f62547a.mo27706j(false);
                } catch (Throwable th2) {
                    th = th2;
                    z = true;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            boolean z2 = th instanceof CancellationException;
            if (!z2) {
                C59104x c2 = C22654bn.f62403a.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "ProcessorHelper");
                ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(th)).mo56372aa(48370)).mo56386p("ProcessDeltaFuture failed");
            }
            C58833ax f = C22654bn.m42174f(enVar);
            if (z2) {
                yVar = C22721y.CANCEL;
            } else {
                yVar = C22721y.FAILURE;
            }
            aeVar.mo27741b(C22722z.m42355e(f, yVar, m));
            if (z) {
                ((C22727l) aeVar).f62547a.mo27706j(false);
                aeVar.mo27740a();
            }
            return C118826c.f331422a;
        }
        return C118826c.f331422a;
    }
}
