package com.google.android.libraries.lens.view.p2113h.p2126h.p2127a;

import android.content.Context;
import android.util.Size;
import com.google.android.libraries.lens.view.p2073ao.C25459e;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26751c;
import com.google.android.libraries.lens.view.p2113h.p2126h.p2127a.p2128a.C26843d;
import com.google.android.libraries.lens.view.p2113h.p2126h.p2127a.p2128a.C26844e;
import com.google.android.libraries.lens.view.p2113h.p2126h.p2127a.p2130c.C26860b;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.p4527a.C58970a;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.libraries.lens.view.h.h.a.f */
/* compiled from: PG */
public final /* synthetic */ class C26863f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C26878u f73184a;

    public /* synthetic */ C26863f(C26878u uVar) {
        this.f73184a = uVar;
    }

    public final void run() {
        C26878u uVar = this.f73184a;
        C26843d d = C26844e.m49704d();
        C26843d d2 = C26844e.m49704d();
        C26843d d3 = C26844e.m49704d();
        int[] x = C26847ac.m49733x();
        d.mo32208d(x[0]);
        int i = 1;
        d2.mo32208d(x[1]);
        d3.mo32208d(x[2]);
        int[] y = C26847ac.m49734y();
        d.mo32210f(y[0]);
        int a = uVar.mo32244a();
        uVar.f73225N = ByteBuffer.allocateDirect(a);
        C26847ac.m49729t(uVar.f73257s, uVar.f73246h, d.mo32205a(), d.mo32206b());
        if (uVar.f73245g) {
            int b = C26847ac.m49711b();
            C26847ac.m49713d(a);
            d.mo32209e(b);
            if (uVar.f73226O.mo56113h()) {
                C26876s sVar = (C26876s) uVar.f73226O.mo56107c();
                C58838bb.m90884s(sVar.f73206b.f73245g, "Must have GL3 for FSIQ.");
                sVar.f73205a.add(Integer.valueOf(b));
                for (int i2 = 0; i2 < 3; i2++) {
                    int b2 = C26847ac.m49711b();
                    C26847ac.m49713d(a);
                    sVar.f73205a.add(Integer.valueOf(b2));
                }
                ((C58970a) ((C58970a) C26878u.f73209a.mo56224b()).mo56372aa(49238)).mo56389s("***** FSIQ setupPboBufferPoolForFSIQ %s", sVar.f73205a);
            }
        }
        uVar.f73216E = d.mo32207c();
        d2.mo32210f(y[1]);
        if (!uVar.f73245g || !uVar.f73232U) {
            uVar.f73219H = uVar.f73240b.f72878a.getWidth();
            uVar.f73218G = uVar.f73217F;
        } else {
            int i3 = ((uVar.f73217F + 63) / 64) * 64;
            uVar.f73218G = i3;
            uVar.f73219H = i3 / (true != uVar.f73247i ? 4 : 1);
            uVar.f73213B = new byte[i3];
        }
        C26751c cVar = uVar.f73240b;
        int width = cVar.f72878a.getWidth() * cVar.f72878a.getHeight();
        if (true != uVar.f73247i) {
            i = 4;
        }
        uVar.f73212A = ByteBuffer.allocateDirect(width * i);
        C26847ac.m49730u(uVar.f73246h, uVar.f73247i, d2, new Size(uVar.f73219H, uVar.f73240b.f72878a.getHeight()), d2.mo32206b());
        if (uVar.f73245g) {
            int b3 = C26847ac.m49711b();
            C26847ac.m49713d(uVar.f73218G * uVar.f73240b.f72878a.getHeight());
            d2.mo32209e(b3);
        }
        ((C58970a) ((C58970a) C26878u.f73209a.mo56224b()).mo56372aa(49247)).mo56362O("***** setUpAnalyzerTexture %dx%d (org width: %d); stride %d (%d); (es3: %b)", Integer.valueOf(uVar.f73219H), Integer.valueOf(uVar.f73240b.f72878a.getHeight()), Integer.valueOf(uVar.f73240b.f72878a.getWidth()), Integer.valueOf(uVar.f73218G), Integer.valueOf(uVar.f73217F), Boolean.valueOf(uVar.f73245g));
        uVar.f73214C = d2.mo32207c();
        d3.mo32210f(y[2]);
        uVar.f73215D = d3.mo32207c();
        if (uVar.f73248j) {
            C26847ac.m49731v(uVar.f73258t, uVar.f73246h, uVar.f73215D.mo32211a(), uVar.f73215D.mo32213c());
        }
        C26847ac.m49716g();
        if (uVar.f73235X) {
            C25459e eVar = (C25459e) uVar.f73255q.mo17428b();
            boolean z = uVar.f73246h;
            Context context = uVar.f73249k;
            C26862e eVar2 = new C26862e(uVar);
            eVar.f69394i = 2;
            eVar.f69386a = z;
            eVar.f69389d = context;
            eVar.f69395j = eVar2;
            eVar.f69393h = null;
        }
        uVar.f73221J = C26847ac.m49712c(uVar.f73249k);
        uVar.f73220I = C26847ac.m49732w(uVar.f73249k, uVar.f73248j);
        C26860b.m49758c(uVar.f73246h);
        uVar.mo32246c();
    }
}
