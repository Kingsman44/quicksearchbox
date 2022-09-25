package com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b;

import com.google.android.libraries.search.assistant.p2705n.p2706a.C34820a;
import com.google.android.libraries.search.assistant.p2705n.p2706a.C34829c;
import com.google.common.p4526f.C59071e;
import java.util.concurrent.CancellationException;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70761fa;
import p5488io.grpc.Status;
import p5488io.grpc.StatusException;

/* renamed from: com.google.android.libraries.search.assistant.f.a.b.db */
/* compiled from: PG */
public final class C32687db {

    /* renamed from: a */
    public static final C32687db f87602a = new C32687db();

    /* renamed from: b */
    public static final C59071e f87603b = C59071e.m91331h();

    private C32687db() {
    }

    /* renamed from: b */
    public final Throwable mo38250b(Throwable th) {
        C70761fa faVar;
        C70761fa faVar2;
        if ((th instanceof C70761fa) || (th instanceof StatusException)) {
            return th;
        }
        if (th instanceof C32663ce) {
            C32663ce ceVar = (C32663ce) th;
            faVar2 = new C70761fa(ceVar.f87548a.withDescription(ceVar.getMessage()), C34829c.m63592a(ceVar.mo23265a()), true);
        } else {
            if (th instanceof CancellationException) {
                faVar = new C70761fa(Status.f186904b.mo61678e(th).withDescription(th.getMessage()), (C70334de) null, true);
            } else if (th instanceof C34820a) {
                faVar2 = new C70761fa(Status.m102100d(th).withDescription(th.getMessage()), C34829c.m63592a(((C34820a) th).mo23265a()), true);
            } else {
                faVar = new C70761fa(Status.m102100d(th).withDescription(th.getMessage()), (C70334de) null, true);
            }
            return faVar;
        }
        return faVar2;
    }

    /* renamed from: c */
    public final boolean mo38251c(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        if ((th instanceof StatusException) && ((StatusException) th).f186943a.getCode() == Status.f186904b.getCode()) {
            return true;
        }
        if (!(th instanceof C70761fa) || ((C70761fa) th).f188571a.getCode() != Status.f186904b.getCode()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo38249a(kotlinx.coroutines.p5573a.C71367au r5, java.lang.Object r6, p5462h.p5466c.C69577g r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32686da
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.google.android.libraries.search.assistant.f.a.b.da r0 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32686da) r0
            int r1 = r0.f87601c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f87601c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.assistant.f.a.b.da r0 = new com.google.android.libraries.search.assistant.f.a.b.da
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f87599a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f87601c
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            p5462h.C69714l.m101134b(r7)     // Catch:{ ah -> 0x003b }
            goto L_0x003b
        L_0x0027:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x002f:
            p5462h.C69714l.m101134b(r7)
            r0.f87601c = r3     // Catch:{ ah -> 0x003b }
            java.lang.Object r5 = r5.mo62729v(r6, r0)     // Catch:{ ah -> 0x003b }
            if (r5 != r1) goto L_0x003b
            return r1
        L_0x003b:
            h.q r5 = p5462h.C69788q.f186170a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32687db.mo38249a(kotlinx.coroutines.a.au, java.lang.Object, h.c.g):java.lang.Object");
    }
}
