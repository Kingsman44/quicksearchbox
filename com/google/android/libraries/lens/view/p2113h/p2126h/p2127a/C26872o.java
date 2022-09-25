package com.google.android.libraries.lens.view.p2113h.p2126h.p2127a;

import android.util.Size;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26750b;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26754f;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26773y;
import com.google.android.libraries.lens.view.p2113h.p2122e.C26783ah;
import com.google.android.libraries.lens.view.p2113h.p2122e.C26784ai;
import com.google.android.libraries.lens.view.p2152n.C27449b;
import com.google.android.libraries.lens.view.p2152n.C27456i;
import com.google.android.libraries.lens.view.p2173u.C28095a;
import com.google.android.libraries.lens.view.p2173u.C28096b;
import com.google.android.libraries.lens.view.p2173u.C28097c;
import com.google.android.libraries.lens.view.vision.C28181w;
import com.google.common.util.concurrent.SettableFuture;
import java.io.File;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.libraries.lens.view.h.h.a.o */
/* compiled from: PG */
final class C26872o implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C26878u f73197a;

    /* renamed from: b */
    private final C28097c f73198b;

    public C26872o(C26878u uVar, C28097c cVar) {
        this.f73197a = uVar;
        this.f73198b = cVar;
    }

    /* renamed from: a */
    public final boolean mo32238a(C28097c cVar) {
        C26750b bVar;
        this.f73197a.f73261w.mo32219a("analyzer/process");
        this.f73197a.f73212A.rewind();
        C26878u uVar = this.f73197a;
        C26783ah ahVar = uVar.f73237Z;
        ByteBuffer byteBuffer = uVar.f73212A;
        int e = uVar.f73228Q.mo33628e();
        C26878u uVar2 = this.f73197a;
        Size size = uVar2.f73240b.f72878a;
        int i = uVar2.f73217F;
        C26873p pVar = uVar2.f73224M;
        boolean z = pVar.f73199a || pVar.f73201c.f73226O.mo56113h();
        C26784ai aiVar = ahVar.f72970a;
        long j = cVar.f76484b;
        if (cVar.f76487e < aiVar.f73013e.get()) {
            cVar.mo33562e(C28096b.DROPPED);
            bVar = C26750b.m49463b(j);
        } else {
            SettableFuture settableFuture = new SettableFuture();
            if (z) {
                C28181w wVar = aiVar.f72975C;
                synchronized (wVar.f76694a) {
                    wVar.f76694a.mo3682i(j, settableFuture);
                }
            }
            aiVar.f72974B.mo33606v(byteBuffer, e, size, i, cVar);
            aiVar.f72977E.f73047d = j;
            C28096b a = cVar.mo33558a();
            if (a == C28096b.TRACKED) {
                aiVar.f73026r.mo31953b();
            }
            if (z && a != C28096b.TRACKED) {
                aiVar.f72975C.mo33698a(j);
            }
            if (!a.f76481e) {
                bVar = C26750b.m49463b(j);
            } else if (a == C28096b.INTERPOLATED) {
                bVar = C26750b.m49464c(j);
            } else if (!z) {
                bVar = C26750b.m49464c(j);
            } else if (aiVar.f73012d.getAndSet(false)) {
                aiVar.f72976D.mo32188c(cVar);
                aiVar.f72977E.f73046c = j;
                C26754f fVar = new C26754f();
                fVar.mo32043e(true);
                fVar.mo32044f(true);
                fVar.mo32042d(false);
                fVar.mo32041c(j);
                fVar.mo32040b(true);
                fVar.f72883a = settableFuture;
                bVar = fVar.mo32039a();
            } else if (aiVar.f72986N) {
                C26754f fVar2 = new C26754f();
                fVar2.mo32043e(true);
                fVar2.mo32044f(true);
                fVar2.mo32042d(true);
                fVar2.mo32041c(j);
                fVar2.mo32040b(true);
                fVar2.f72883a = settableFuture;
                bVar = fVar2.mo32039a();
            } else {
                aiVar.f72975C.mo33698a(j);
                bVar = C26750b.m49464c(j);
            }
        }
        cVar.f76490h = bVar;
        this.f73197a.f73261w.mo32220b();
        if (this.f73197a.f73226O.mo56113h()) {
            C26750b bVar2 = cVar.f76490h;
            bVar2.getClass();
            if (!bVar2.mo32087h()) {
                cVar.mo33560c(C28095a.NOT_SELECTABLE);
            }
        }
        C26878u uVar3 = this.f73197a;
        C27456i iVar = uVar3.f73262x;
        ByteBuffer asReadOnlyBuffer = uVar3.f73212A.asReadOnlyBuffer();
        int width = this.f73197a.f73240b.f72878a.getWidth();
        int height = this.f73197a.f73240b.f72878a.getHeight();
        int e2 = this.f73197a.f73228Q.mo33628e();
        long j2 = cVar.f76484b;
        if (iVar.f75112e) {
            if (!iVar.f75116i.getAndSet(true)) {
                iVar.f75109b.execute(new C27449b(iVar, C27456i.m51111c(width, height, C26773y.m49578a(e2))));
            }
            if (iVar.f75113f) {
                File file = iVar.f75110c;
                long a2 = iVar.mo32987a(j2);
                iVar.mo32990e(asReadOnlyBuffer, new File(file, a2 + ".bb").getAbsolutePath());
            }
        }
        if (this.f73197a.f73260v.mo56113h()) {
            C26750b bVar3 = cVar.f76490h;
            bVar3.getClass();
            if (!bVar3.mo32084e()) {
                this.f73197a.f73223L = false;
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007f, code lost:
        if (r0.mo32085f() == false) goto L_0x0087;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r4 = this;
            com.google.android.libraries.lens.view.h.h.a.u r0 = r4.f73197a
            com.google.common.base.ax r0 = r0.f73260v
            boolean r0 = r0.mo56113h()
            if (r0 != 0) goto L_0x0014
            com.google.android.libraries.lens.view.u.c r0 = r4.f73198b
            boolean r0 = r4.mo32238a(r0)
            if (r0 == 0) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            return
        L_0x0014:
            com.google.android.libraries.lens.view.h.h.a.u r0 = r4.f73197a
            boolean r0 = r0.mo32250g()
            r1 = 0
            if (r0 == 0) goto L_0x0033
            com.google.android.libraries.lens.view.h.h.a.u r0 = r4.f73197a
            com.google.common.base.ax r0 = r0.f73226O
            boolean r0 = r0.mo56113h()
            if (r0 == 0) goto L_0x002e
            com.google.android.libraries.lens.view.u.c r0 = r4.f73198b
            com.google.android.libraries.lens.view.u.a r2 = com.google.android.libraries.lens.view.p2173u.C28095a.NOT_SELECTABLE_WAITING_FOR_USER_VISIBLE_REGION
            r0.mo33560c(r2)
        L_0x002e:
            com.google.android.libraries.lens.view.h.h.a.u r0 = r4.f73197a
            r0.f73223L = r1
            return
        L_0x0033:
            com.google.android.libraries.lens.view.u.c r0 = r4.f73198b
            com.google.android.libraries.lens.view.h.d.b r0 = r0.f76490h
            r0.getClass()
            com.google.android.libraries.lens.view.h.h.a.u r0 = r4.f73197a
            com.google.android.libraries.lens.view.h.h.a.p r0 = r0.f73224M
            r0.mo32240a()
            com.google.android.libraries.lens.view.u.c r0 = r4.f73198b
            com.google.android.libraries.lens.view.h.d.b r0 = r0.f76490h
            r0.getClass()
            boolean r0 = r0.mo32086g()
            if (r0 != 0) goto L_0x005a
            com.google.android.libraries.lens.view.h.h.a.u r0 = r4.f73197a
            com.google.android.libraries.lens.view.n.i r2 = r0.f73262x
            boolean r2 = r2.f75112e
            if (r2 == 0) goto L_0x0057
            goto L_0x005a
        L_0x0057:
            r0.f73223L = r1
            return
        L_0x005a:
            com.google.android.libraries.lens.view.h.h.a.u r0 = r4.f73197a
            com.google.android.libraries.lens.view.h.h.a.p r0 = r0.f73224M
            boolean r0 = r0.mo32240a()
            if (r0 != 0) goto L_0x0087
            com.google.android.libraries.lens.view.h.h.a.u r0 = r4.f73197a
            com.google.common.base.ax r0 = r0.f73226O
            boolean r0 = r0.mo56113h()
            if (r0 == 0) goto L_0x0082
            com.google.android.libraries.lens.view.u.c r0 = r4.f73198b
            com.google.android.libraries.lens.view.h.d.b r0 = r0.f76490h
            r0.getClass()
            boolean r2 = r0.mo32087h()
            if (r2 == 0) goto L_0x0082
            boolean r0 = r0.mo32085f()
            if (r0 != 0) goto L_0x0082
            goto L_0x0087
        L_0x0082:
            com.google.android.libraries.lens.view.h.h.a.u r0 = r4.f73197a
            r0.f73223L = r1
            return
        L_0x0087:
            com.google.android.libraries.lens.view.h.h.a.u r0 = r4.f73197a
            java.util.concurrent.ExecutorService r1 = r0.f73252n
            com.google.android.libraries.lens.view.h.h.a.r r2 = new com.google.android.libraries.lens.view.h.h.a.r
            com.google.android.libraries.lens.view.u.c r3 = r4.f73198b
            r2.<init>(r0, r3)
            r1.execute(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.view.p2113h.p2126h.p2127a.C26872o.run():void");
    }
}
