package p5488io.grpc.p5527g;

import com.google.common.base.C58838bb;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import p5488io.grpc.p5527g.p5528a.p5529a.C70774c;
import p5589m.C71828e;

/* renamed from: io.grpc.g.am */
/* compiled from: PG */
public final class C70819am {

    /* renamed from: a */
    public final C70817ak f188874a;

    /* renamed from: b */
    public final C70774c f188875b;

    /* renamed from: c */
    public int f188876c = 65535;

    /* renamed from: d */
    public final C70816aj f188877d = new C70816aj(this, 0, 65535, (C70815ai) null);

    public C70819am(C70817ak akVar, C70774c cVar) {
        this.f188874a = akVar;
        C58838bb.m90866a(cVar, "frameWriter");
        this.f188875b = cVar;
    }

    /* renamed from: a */
    public final void mo62530a(boolean z, C70816aj ajVar, C71828e eVar, boolean z2) {
        C58838bb.m90866a(eVar, "source");
        int b = ajVar.mo62523b();
        boolean d = ajVar.mo62525d();
        int i = (int) eVar.f191356b;
        if (d || b < i) {
            if (!d && b > 0) {
                ajVar.mo62524c(eVar, b, false);
            }
            ajVar.f188866a.mo62538mq(eVar, (long) ((int) eVar.f191356b));
            ajVar.f188869d = z | ajVar.f188869d;
        } else {
            ajVar.mo62524c(eVar, i, z);
        }
        if (z2) {
            mo62531b();
        }
    }

    /* renamed from: c */
    public final void mo62532c() {
        C70816aj[] s = this.f188874a.mo62528s();
        Collections.shuffle(Arrays.asList(s));
        int i = this.f188877d.f188867b;
        int length = s.length;
        while (true) {
            int i2 = 0;
            if (length <= 0 || i <= 0) {
                C70818al alVar = new C70818al();
            } else {
                int ceil = (int) Math.ceil((double) (((float) i) / ((float) length)));
                for (int i3 = 0; i3 < length && i > 0; i3++) {
                    C70816aj ajVar = s[i3];
                    int min = Math.min(i, Math.min(ajVar.mo62522a() - ajVar.f188868c, ceil));
                    if (min > 0) {
                        ajVar.f188868c += min;
                        i -= min;
                    }
                    if (ajVar.mo62522a() - ajVar.f188868c > 0) {
                        s[i2] = ajVar;
                        i2++;
                    }
                }
                length = i2;
            }
        }
        C70818al alVar2 = new C70818al();
        for (C70816aj ajVar2 : this.f188874a.mo62528s()) {
            ajVar2.mo62526e(ajVar2.f188868c, alVar2);
            ajVar2.f188868c = 0;
        }
        if (alVar2.mo62529a()) {
            mo62531b();
        }
    }

    /* renamed from: d */
    public final void mo62533d(C70816aj ajVar, int i) {
        if (ajVar == null) {
            this.f188877d.mo62527f(i);
            mo62532c();
            return;
        }
        ajVar.mo62527f(i);
        C70818al alVar = new C70818al();
        ajVar.mo62526e(ajVar.mo62523b(), alVar);
        if (alVar.mo62529a()) {
            mo62531b();
        }
    }

    /* renamed from: b */
    public final void mo62531b() {
        try {
            this.f188875b.mo62453d();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
