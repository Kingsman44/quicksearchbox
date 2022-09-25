package com.google.android.apps.gsa.sidekick.shared.monet.p7250f;

import com.google.android.apps.gsa.shared.util.p7159c.C90904ba;
import com.google.android.apps.gsa.sidekick.shared.monet.visualelementslogger.C91866h;
import com.google.android.apps.gsa.sidekick.shared.monet.visualelementslogger.C91874p;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8112e.p8113a.C104711au;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8112e.p8113a.C104712av;
import com.google.android.apps.p489g.p494d.C9278v;
import com.google.android.apps.p489g.p494d.C9280x;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1923a.C23249a;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.common.base.C58833ax;
import com.google.p375ai.p378b.C7709ha;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7998rt;
import com.google.p375ai.p378b.C8178yk;
import com.google.protobuf.C62921ba;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.monet.f.e */
/* compiled from: PG */
final class C91828e extends C90904ba {

    /* renamed from: a */
    public final boolean f256093a;

    /* renamed from: b */
    public final int f256094b;

    /* renamed from: c */
    final /* synthetic */ C91830g f256095c;

    /* renamed from: d */
    private final long f256096d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C91828e(C91830g gVar, boolean z, int i, long j) {
        super("Scroll notifier");
        this.f256095c = gVar;
        this.f256093a = z;
        this.f256094b = i;
        this.f256096d = j;
    }

    public final void run() {
        C7709ha haVar;
        if (this.f256095c.f256100c.mo28316z()) {
            this.f256095c.f256103f.mo86301b(this.f256094b, this.f256096d);
            C104711au auVar = this.f256095c.f256107j;
            if (auVar != null) {
                int i = this.f256094b;
                long j = this.f256096d;
                C104712av avVar = auVar.f291592a;
                C9278v vVar = (C9278v) C23245b.m43557b((ProtoParcelable) ((C58833ax) ((C23249a) avVar.f291609a.mo94202e()).mo28725a()).mo56107c(), C9278v.f32165Z.getParserForType(), C62921ba.m95368a(), true);
                vVar.getClass();
                if (avVar.mo94319J(vVar)) {
                    C91866h hVar = avVar.f291623j;
                    C9280x xVar = vVar.f32211r;
                    if (xVar == null) {
                        xVar = C9280x.f32220d;
                    }
                    C7998rt rtVar = xVar.f32224c;
                    if (rtVar == null) {
                        rtVar = C7998rt.f28087v;
                    }
                    C8178yk ykVar = rtVar.f28103o;
                    if (ykVar == null) {
                        ykVar = C8178yk.f28736g;
                    }
                    C7718hj hjVar = vVar.f32174H;
                    if (hjVar == null) {
                        hjVar = C7718hj.f26927af;
                    }
                    if ((hjVar.f26955a & 64) != 0) {
                        C7718hj hjVar2 = vVar.f32174H;
                        if (hjVar2 == null) {
                            hjVar2 = C7718hj.f26927af;
                        }
                        haVar = hjVar2.f26972m;
                        if (haVar == null) {
                            haVar = C7709ha.f26910f;
                        }
                    } else {
                        haVar = null;
                    }
                    C8178yk b = hVar.mo86389b(ykVar, haVar);
                    if (b != null) {
                        ((C91874p) avVar.f291621h.mo56107c()).mo86403f(b, i, j);
                    }
                }
            }
            C91830g gVar = this.f256095c;
            if (gVar.f256105h == this) {
                gVar.f256105h = null;
            }
        }
    }
}
