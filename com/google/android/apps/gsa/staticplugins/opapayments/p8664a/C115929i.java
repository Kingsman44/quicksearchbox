package com.google.android.apps.gsa.staticplugins.opapayments.p8664a;

import android.os.Bundle;
import com.google.android.apps.gsa.opaonboarding.C83875ai;
import com.google.android.apps.gsa.opaonboarding.C84036z;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.p4129b.p4130a.p4131a.p4132a.C54685bb;
import com.google.p4129b.p4130a.p4131a.p4132a.C54691bh;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opapayments.a.i */
/* compiled from: PG */
public final class C115929i extends C84036z {

    /* renamed from: a */
    public C54691bh f321457a;

    /* renamed from: b */
    private final List f321458b;

    /* renamed from: c */
    private final C69464a f321459c;

    /* renamed from: d */
    private final C69464a f321460d;

    /* renamed from: e */
    private final C69464a f321461e;

    /* renamed from: f */
    private final C69464a f321462f;

    public C115929i(List list, C69464a aVar, C69464a aVar2, C69464a aVar3, C69464a aVar4) {
        this.f321458b = list;
        this.f321459c = aVar;
        this.f321460d = aVar2;
        this.f321461e = aVar3;
        this.f321462f = aVar4;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C58485gu mo77495h() {
        C58480gp gpVar = new C58480gp(4);
        for (C54685bb bbVar : this.f321458b) {
            int i = bbVar.f143543a;
            int i2 = 5;
            if (i != 0) {
                i2 = i != 2 ? i != 3 ? i != 4 ? i != 5 ? 0 : 4 : 3 : 2 : 1;
            }
            int i3 = i2 - 1;
            if (i2 == 0) {
                throw null;
            } else if (i3 == 0) {
                Bundle bundle = new Bundle();
                bundle.putByteArray("welcome_page_extra", bbVar.toByteArray());
                gpVar.mo55395g(C83875ai.m133541f((C115921ai) this.f321459c.mo17428b(), bundle, new C115925e(this)));
            } else if (i3 == 1) {
                Bundle bundle2 = new Bundle();
                bundle2.putByteArray("setup_summary_page_extra", bbVar.toByteArray());
                gpVar.mo55395g(C83875ai.m133541f((C115914ab) this.f321462f.mo17428b(), bundle2, new C115928h(this)));
            } else if (i3 == 2) {
                Bundle bundle3 = new Bundle();
                bundle3.putByteArray("select_instrument_page_extra", bbVar.toByteArray());
                gpVar.mo55395g(C83875ai.m133541f((C115942v) this.f321460d.mo17428b(), bundle3, new C115926f(this)));
            } else if (i3 == 3) {
                Bundle bundle4 = new Bundle();
                bundle4.putByteArray("select_address_page_extra", bbVar.toByteArray());
                gpVar.mo55395g(C83875ai.m133541f((C115937q) this.f321461e.mo17428b(), bundle4, new C115927g(this)));
            }
        }
        return gpVar.mo55394f();
    }
}
