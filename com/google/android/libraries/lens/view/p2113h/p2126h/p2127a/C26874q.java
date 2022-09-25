package com.google.android.libraries.lens.view.p2113h.p2126h.p2127a;

import com.google.android.libraries.lens.view.p2113h.p2121d.C26750b;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26773y;
import com.google.android.libraries.lens.view.p2113h.p2126h.p2127a.p2130c.C26860b;
import com.google.android.libraries.lens.view.p2152n.C27452e;
import com.google.android.libraries.lens.view.p2152n.C27454g;
import com.google.android.libraries.lens.view.p2152n.C27456i;
import com.google.android.libraries.lens.view.p2173u.C28097c;
import com.google.common.p4526f.p4527a.C58970a;
import java.io.File;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.libraries.lens.view.h.h.a.q */
/* compiled from: PG */
public final /* synthetic */ class C26874q implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C26875r f73202a;

    public /* synthetic */ C26874q(C26875r rVar) {
        this.f73202a = rVar;
    }

    public final void run() {
        C26875r rVar = this.f73202a;
        ByteBuffer byteBuffer = rVar.f73204b.f73225N;
        if (byteBuffer == null) {
            byteBuffer = ByteBuffer.allocateDirect(rVar.f73204b.mo32244a());
            rVar.f73204b.f73225N = byteBuffer;
        }
        C28097c cVar = rVar.f73203a;
        Integer num = cVar.f76488f;
        long j = cVar.f76484b;
        if (!rVar.f73204b.f73226O.mo56113h()) {
            C26878u uVar = rVar.f73204b;
            if (uVar.f73245g) {
                C26847ac.m49725p(uVar.f73216E, uVar.f73257s, uVar.f73261w);
                C26847ac.m49723n(rVar.f73204b.f73216E.mo32212b(), byteBuffer, rVar.f73204b.f73261w);
            } else {
                int a = uVar.f73216E.mo32211a();
                C26878u uVar2 = rVar.f73204b;
                C26847ac.m49724o(a, byteBuffer, uVar2.f73257s, uVar2.f73261w);
            }
        } else if (num != null) {
            C26847ac.m49723n(num.intValue(), byteBuffer, rVar.f73204b.f73261w);
            rVar.f73203a.mo33561d();
        } else {
            ((C58970a) ((C58970a) C26878u.f73209a.mo56226d()).mo56372aa(49234)).mo56388r("***** FSIQ CaptureToByteBufferRunnable nil pbo for frame[%d]", rVar.f73203a.f76484b);
        }
        C26860b.m49758c(rVar.f73204b.f73246h);
        C27456i iVar = rVar.f73204b.f73262x;
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        int width = rVar.f73204b.f73257s.getWidth();
        int height = rVar.f73204b.f73257s.getHeight();
        C26750b bVar = rVar.f73203a.f76490h;
        bVar.getClass();
        long a2 = bVar.mo32082a();
        if (iVar.f75112e) {
            if (!iVar.f75117j.getAndSet(true)) {
                iVar.f75109b.execute(new C27454g(iVar, C27456i.m51111c(width, height, C26773y.m49578a(2))));
            }
            if (iVar.f75114g) {
                File file = iVar.f75111d;
                long a3 = iVar.mo32987a(a2);
                iVar.mo32990e(asReadOnlyBuffer, new File(file, a3 + ".bb").getAbsolutePath());
            }
        }
        C26750b bVar2 = rVar.f73203a.f76490h;
        bVar2.getClass();
        if (bVar2.mo32086g()) {
            C27456i iVar2 = rVar.f73204b.f73262x;
            long a4 = bVar2.mo32082a();
            if (iVar2.f75112e) {
                iVar2.f75109b.execute(new C27452e(iVar2, a4));
            }
            C26878u uVar3 = rVar.f73204b;
            uVar3.f73251m.execute(new C26877t(uVar3, rVar.f73203a));
            return;
        }
        rVar.f73204b.f73223L = false;
    }
}
