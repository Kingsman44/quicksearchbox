package com.google.android.libraries.lens.view.vision.p2175a;

import com.google.common.p4526f.p4527a.C58970a;
import com.google.lens.p4707j.C62424ba;
import com.google.lens.p4707j.C62425bb;
import com.google.lens.p4707j.C62427bd;
import com.google.lens.p4707j.C62533fb;
import com.google.lens.p4707j.C62536fe;
import com.google.lens.p4707j.C62569gk;
import com.google.lens.p4707j.C62571gm;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.libraries.lens.view.vision.a.c */
/* compiled from: PG */
public final /* synthetic */ class C28149c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C28156j f76581a;

    public /* synthetic */ C28149c(C28156j jVar) {
        this.f76581a = jVar;
    }

    public final void run() {
        C62569gk gkVar;
        C28156j jVar = this.f76581a;
        synchronized (jVar.f76594i) {
            C62571gm gmVar = null;
            if (!jVar.f76593h) {
                ((C58970a) ((C58970a) C28156j.f76591f.mo56226d()).mo56372aa(50303)).mo56386p("Ignoring duplicate call to stop tracking subsystem.");
            } else {
                C62424ba a = C28148b.m52458a();
                C62533fb fbVar = (C62533fb) C62536fe.f168839e.createBuilder();
                fbVar.copyOnWrite();
                C62536fe feVar = (C62536fe) fbVar.instance;
                feVar.f168844d = 2;
                feVar.f168841a |= 1;
                a.copyOnWrite();
                C62425bb bbVar = (C62425bb) a.instance;
                C62536fe feVar2 = (C62536fe) fbVar.build();
                C62425bb bbVar2 = C62425bb.f168506e;
                feVar2.getClass();
                bbVar.f168510c = feVar2;
                bbVar.f168509b = 2;
                if (!C28156j.m52468D(jVar.mo33610z((C62425bb) a.build(), (ByteBuffer) null))) {
                    ((C58970a) ((C58970a) C28156j.f76591f.mo56226d()).mo56372aa(50302)).mo56386p("Warning: tracking subsystem not successfully stopped.");
                }
                jVar.f76593h = false;
            }
            C62424ba a2 = C28148b.m52458a();
            C62533fb fbVar2 = (C62533fb) C62536fe.f168839e.createBuilder();
            fbVar2.copyOnWrite();
            C62536fe feVar3 = (C62536fe) fbVar2.instance;
            feVar3.f168844d = 7;
            feVar3.f168841a |= 1;
            a2.copyOnWrite();
            C62425bb bbVar3 = (C62425bb) a2.instance;
            C62536fe feVar4 = (C62536fe) fbVar2.build();
            C62425bb bbVar4 = C62425bb.f168506e;
            feVar4.getClass();
            bbVar3.f168510c = feVar4;
            bbVar3.f168509b = 2;
            C62427bd z = jVar.mo33610z((C62425bb) a2.build(), (ByteBuffer) null);
            if (C28156j.m52468D(z)) {
                if (z.f168516b == 3) {
                    gkVar = (C62569gk) z.f168517c;
                } else {
                    gkVar = C62569gk.f168922e;
                }
                gmVar = gkVar.f168926c;
                if (gmVar == null) {
                    gmVar = C62571gm.f168928b;
                }
            }
            jVar.f76603r = gmVar;
            jVar.f76592g.mo29451b();
        }
    }
}
