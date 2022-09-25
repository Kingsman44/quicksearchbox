package com.google.android.libraries.lens.ondevice.p2034k;

import com.google.p4172bg.p4174b.C55715d;
import com.google.p4172bg.p4174b.C55734w;
import com.google.p4172bg.p4174b.C55735x;
import com.google.protos.p5132q.C65861d;
import com.google.protos.p5132q.C65871n;
import com.google.protos.p5132q.C65874q;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.lens.ondevice.k.dk */
/* compiled from: PG */
public final /* synthetic */ class C24627dk implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C24627dk f67373a = new C24627dk();

    private /* synthetic */ C24627dk() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C65874q qVar = (C65874q) obj;
        C55734w wVar = (C55734w) C55735x.f147083i.createBuilder();
        C65861d dVar = qVar.f179084c;
        if (dVar == null) {
            dVar = C65861d.f179033c;
        }
        C55715d b = C24629dm.m45716b(dVar);
        wVar.copyOnWrite();
        C55735x xVar = (C55735x) wVar.instance;
        b.getClass();
        xVar.f147086b = b;
        xVar.f147085a |= 1;
        String str = qVar.f179089h;
        wVar.copyOnWrite();
        C55735x xVar2 = (C55735x) wVar.instance;
        str.getClass();
        xVar2.f147085a |= 4;
        xVar2.f147087c = str;
        if ((qVar.f179082a & 16384) != 0) {
            C65871n nVar = qVar.f179091j;
            if (nVar == null) {
                nVar = C65871n.f179055f;
            }
            int i = nVar.f179060d;
            wVar.copyOnWrite();
            C55735x xVar3 = (C55735x) wVar.instance;
            xVar3.f147085a |= 16384;
            xVar3.f147092h = i;
            C65871n nVar2 = qVar.f179091j;
            if (nVar2 == null) {
                nVar2 = C65871n.f179055f;
            }
            int i2 = nVar2.f179059c;
            wVar.copyOnWrite();
            C55735x xVar4 = (C55735x) wVar.instance;
            xVar4.f147085a |= 8192;
            xVar4.f147091g = i2;
            C65871n nVar3 = qVar.f179091j;
            if (nVar3 == null) {
                nVar3 = C65871n.f179055f;
            }
            int i3 = nVar3.f179057a;
            wVar.copyOnWrite();
            C55735x xVar5 = (C55735x) wVar.instance;
            xVar5.f147085a |= 2048;
            xVar5.f147089e = i3;
            C65871n nVar4 = qVar.f179091j;
            if (nVar4 == null) {
                nVar4 = C65871n.f179055f;
            }
            int i4 = nVar4.f179058b;
            wVar.copyOnWrite();
            C55735x xVar6 = (C55735x) wVar.instance;
            xVar6.f147085a |= 4096;
            xVar6.f147090f = i4;
            C65871n nVar5 = qVar.f179091j;
            if (nVar5 == null) {
                nVar5 = C65871n.f179055f;
            }
            int i5 = nVar5.f179061e;
            wVar.copyOnWrite();
            C55735x xVar7 = (C55735x) wVar.instance;
            xVar7.f147085a |= 1024;
            xVar7.f147088d = i5;
        }
        return wVar;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
