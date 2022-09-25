package com.google.android.libraries.lens.view.vision.p2175a;

import com.google.android.libraries.lens.view.vision.C28170l;
import com.google.android.libraries.lens.view.vision.C28174p;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60845bz;
import com.google.lens.p4707j.C62403ag;
import com.google.lens.p4707j.C62405ai;
import com.google.lens.p4707j.C62424ba;
import com.google.lens.p4707j.C62425bb;
import com.google.lens.p4707j.C62427bd;
import com.google.lens.p4707j.C62431bh;
import com.google.lens.p4707j.C62446bw;
import com.google.lens.p4707j.C62447bx;
import com.google.lens.p4707j.C62521eq;
import com.google.lens.p4707j.C62522er;
import com.google.lens.p4707j.C62533fb;
import com.google.lens.p4707j.C62536fe;
import com.google.lens.p4707j.C62567gi;
import com.google.lens.p4707j.C62569gk;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.lens.view.vision.a.i */
/* compiled from: PG */
final class C28155i implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C28174p f76589a;

    /* renamed from: b */
    final /* synthetic */ C28156j f76590b;

    public C28155i(C28156j jVar, C28174p pVar) {
        this.f76590b = jVar;
        this.f76589a = pVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C58970a) ((C58970a) ((C58970a) C28156j.f76591f.mo56225c()).mo56382g(th)).mo56372aa(50277)).mo56386p("failed to initialize tracking");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C62569gk gkVar;
        C62569gk gkVar2;
        int i;
        Void voidR = (Void) obj;
        if (!this.f76590b.f76597l.get()) {
            ((C58970a) ((C58970a) C28156j.f76591f.mo56224b()).mo56372aa(50279)).mo56386p("Stopped while waiting for imagingSessionInitializedFuture");
            return;
        }
        long e = this.f76590b.f76599n.mo26873e();
        C28156j jVar = this.f76590b;
        C28174p pVar = jVar.f76601p;
        synchronized (jVar.f76594i) {
            jVar.f76592g.mo29452c(C28148b.m52460c(1), new C28151e(jVar));
            jVar.f76592g.mo29452c(C28148b.m52460c(3), new C28152f(jVar));
            jVar.f76592g.mo29452c(C28148b.m52460c(2), new C28153g(jVar));
            jVar.f76592g.mo29452c(C28148b.m52460c(4), new C28154h(jVar));
            if (jVar.f76593h) {
                ((C58970a) ((C58970a) C28156j.f76591f.mo56226d()).mo56372aa(50299)).mo56386p("Ignoring duplicate call to start tracking subsystem.");
            } else {
                C62424ba a = C28148b.m52458a();
                C62533fb fbVar = (C62533fb) C62536fe.f168839e.createBuilder();
                fbVar.copyOnWrite();
                C62536fe feVar = (C62536fe) fbVar.instance;
                feVar.f168844d = 1;
                feVar.f168841a |= 1;
                C62521eq eqVar = (C62521eq) C62522er.f168810d.createBuilder();
                C62403ag agVar = (C62403ag) C62405ai.f168456f.createBuilder();
                int d = pVar.mo33627d();
                agVar.copyOnWrite();
                C62405ai aiVar = (C62405ai) agVar.instance;
                aiVar.f168458a |= 1;
                aiVar.f168459b = d;
                int c = pVar.mo33626c();
                agVar.copyOnWrite();
                C62405ai aiVar2 = (C62405ai) agVar.instance;
                aiVar2.f168458a |= 2;
                aiVar2.f168460c = c;
                int b = pVar.mo33625b();
                agVar.copyOnWrite();
                C62405ai aiVar3 = (C62405ai) agVar.instance;
                aiVar3.f168458a |= 4;
                aiVar3.f168461d = b;
                int e2 = pVar.mo33628e();
                int i2 = e2 - 1;
                if (e2 != 0) {
                    if (i2 == 0) {
                        i = 1;
                    } else if (i2 == 1) {
                        i = 2;
                    } else {
                        throw new IllegalArgumentException(String.format("Unexpected image frame type: %s", new Object[]{C28170l.m52584a(e2)}));
                    }
                    agVar.copyOnWrite();
                    C62405ai aiVar4 = (C62405ai) agVar.instance;
                    aiVar4.f168462e = i - 1;
                    aiVar4.f168458a |= 8;
                    eqVar.copyOnWrite();
                    C62522er erVar = (C62522er) eqVar.instance;
                    C62405ai aiVar5 = (C62405ai) agVar.build();
                    aiVar5.getClass();
                    erVar.f168814c = aiVar5;
                    erVar.f168812a |= 2;
                    float a2 = pVar.mo33624a();
                    eqVar.copyOnWrite();
                    C62522er erVar2 = (C62522er) eqVar.instance;
                    erVar2.f168812a |= 1;
                    erVar2.f168813b = a2;
                    C62522er erVar3 = (C62522er) eqVar.build();
                    fbVar.copyOnWrite();
                    C62536fe feVar2 = (C62536fe) fbVar.instance;
                    erVar3.getClass();
                    feVar2.f168843c = erVar3;
                    feVar2.f168842b = 3;
                    a.copyOnWrite();
                    C62425bb bbVar = (C62425bb) a.instance;
                    C62536fe feVar3 = (C62536fe) fbVar.build();
                    C62425bb bbVar2 = C62425bb.f168506e;
                    feVar3.getClass();
                    bbVar.f168510c = feVar3;
                    bbVar.f168509b = 2;
                    if (!C28156j.m52468D(jVar.mo33610z((C62425bb) a.build(), (ByteBuffer) null))) {
                        ((C58970a) ((C58970a) C28156j.f76591f.mo56226d()).mo56372aa(50298)).mo56386p("Warning: tracking subsystem not successfully started.");
                    } else {
                        jVar.f76593h = true;
                    }
                } else {
                    throw null;
                }
            }
            if (!jVar.f76593h) {
                ((C58970a) ((C58970a) C28156j.f76591f.mo56226d()).mo56372aa(50290)).mo56386p("Tracking subsystem should be started before loading tracking camera.");
            } else {
                C62424ba a3 = C28148b.m52458a();
                C62533fb fbVar2 = (C62533fb) C62536fe.f168839e.createBuilder();
                fbVar2.copyOnWrite();
                C62536fe feVar4 = (C62536fe) fbVar2.instance;
                feVar4.f168844d = 9;
                feVar4.f168841a = 1 | feVar4.f168841a;
                a3.copyOnWrite();
                C62425bb bbVar3 = (C62425bb) a3.instance;
                C62536fe feVar5 = (C62536fe) fbVar2.build();
                C62425bb bbVar4 = C62425bb.f168506e;
                feVar5.getClass();
                bbVar3.f168510c = feVar5;
                bbVar3.f168509b = 2;
                C62427bd z = jVar.mo33610z((C62425bb) a3.build(), (ByteBuffer) null);
                if (!C28156j.m52468D(z)) {
                    C58970a aVar = (C58970a) ((C58970a) C28156j.f76591f.mo56226d()).mo56372aa(50289);
                    C62431bh bhVar = z.f168518d;
                    if (bhVar == null) {
                        bhVar = C62431bh.f168521d;
                    }
                    aVar.mo56387q("Warning: could not retrieve tracking camera. Status: %d", bhVar.f168524b);
                } else {
                    if (z.f168516b == 3) {
                        gkVar = (C62569gk) z.f168517c;
                    } else {
                        gkVar = C62569gk.f168922e;
                    }
                    if ((gkVar.f168924a & 4) != 0) {
                        if (z.f168516b == 3) {
                            gkVar2 = (C62569gk) z.f168517c;
                        } else {
                            gkVar2 = C62569gk.f168922e;
                        }
                        C62567gi giVar = gkVar2.f168927d;
                        if (giVar == null) {
                            giVar = C62567gi.f168918c;
                        }
                        C62446bw bwVar = (C62446bw) C62447bx.f168624b.createBuilder();
                        bwVar.mo58497a(giVar.f168920a);
                        jVar.f76604s = (C62447bx) bwVar.build();
                        C62446bw bwVar2 = (C62446bw) C62447bx.f168624b.createBuilder();
                        bwVar2.mo58497a(giVar.f168921b);
                        jVar.f76605t = (C62447bx) bwVar2.build();
                    } else {
                        ((C58970a) ((C58970a) C28156j.f76591f.mo56226d()).mo56372aa(50288)).mo56386p("Warning: tracking camera result does not have a valid tracking result");
                    }
                }
            }
        }
        this.f76590b.f76577e += TimeUnit.NANOSECONDS.toMicros(this.f76590b.f76599n.mo26873e() - e);
        Integer valueOf = Integer.valueOf(this.f76589a.mo33627d());
        Integer valueOf2 = Integer.valueOf(this.f76589a.mo33626c());
        C28156j jVar2 = this.f76590b;
        double d2 = (double) jVar2.f76576d;
        Double.isNaN(d2);
        Double valueOf3 = Double.valueOf(d2 / 1000.0d);
        double d3 = (double) jVar2.f76577e;
        Double.isNaN(d3);
        ((C58970a) ((C58970a) C28156j.f76591f.mo56224b()).mo56372aa(50278)).mo56360M("***** buffer for single channel(%d, %d) (%.3f, %.3f)", valueOf, valueOf2, valueOf3, Double.valueOf(d3 / 1000.0d));
    }
}
