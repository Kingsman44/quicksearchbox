package com.google.android.libraries.lens.view.session.ondevice.p2167b;

import android.icu.text.BreakIterator;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.lens.p4699e.C62207at;
import com.google.lens.p4699e.C62208au;
import com.google.lens.p4699e.C62209av;
import com.google.lens.p4699e.C62210aw;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import java.util.Locale;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.lens.view.session.ondevice.b.b */
/* compiled from: PG */
public final class C27924b {

    /* renamed from: a */
    private static final C58974d f76072a = C58974d.m91135i("TextDistributionHelper");

    /* renamed from: b */
    private Locale f76073b;

    /* renamed from: c */
    private BreakIterator f76074c;

    /* renamed from: b */
    private static void m51987b(C58480gp gpVar, C62207at atVar) {
        int i = ((C62209av) ((C62210aw) atVar.instance).f167968d.get(((C62210aw) atVar.instance).f167968d.size() - 1)).f167962c;
        atVar.copyOnWrite();
        C62210aw awVar = (C62210aw) atVar.instance;
        awVar.f167965a |= 2;
        awVar.f167967c = i;
        gpVar.mo55395g((C62210aw) atVar.build());
    }

    /* renamed from: a */
    public final synchronized C58485gu mo33398a(String str, C58485gu guVar, Locale locale) {
        if (!str.isEmpty()) {
            if (locale.equals(this.f76073b)) {
                this.f76074c.getClass();
            } else {
                this.f76074c = BreakIterator.getLineInstance(locale);
                this.f76073b = locale;
            }
            this.f76074c.setText(str);
            C58480gp e = C58485gu.m89837e();
            int size = guVar.size();
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                i2 += ((String) guVar.get(i3)).length();
                e.mo55395g(Integer.valueOf(i2));
            }
            C58485gu f = e.mo55394f();
            if (((Integer) C58557jl.m90131l(f)).intValue() != 0) {
                C58485gu guVar2 = (C58485gu) Collection.EL.stream(f).map(new C27923a(str.length(), ((Integer) C58557jl.m90131l(f)).intValue())).collect(C58370cn.f155946a);
                this.f76074c.getClass();
                C58480gp e2 = C58485gu.m89837e();
                C62207at atVar = (C62207at) C62210aw.f167963i.createBuilder();
                atVar.copyOnWrite();
                C62210aw awVar = (C62210aw) atVar.instance;
                awVar.f167965a |= 1;
                awVar.f167966b = 0;
                int first = this.f76074c.first();
                int next = this.f76074c.next();
                while (true) {
                    int i4 = next;
                    int i5 = first;
                    first = i4;
                    if (first == -1) {
                        break;
                    }
                    int intValue = ((Integer) guVar2.get(i)).intValue();
                    int i6 = intValue - i5;
                    int i7 = first - intValue;
                    if (i5 > ((C62210aw) atVar.instance).f167966b && i6 < i7) {
                        m51987b(e2, atVar);
                        i++;
                        atVar = (C62207at) C62210aw.f167963i.createBuilder();
                        atVar.copyOnWrite();
                        C62210aw awVar2 = (C62210aw) atVar.instance;
                        awVar2.f167965a |= 1;
                        awVar2.f167966b = i5;
                    }
                    C62208au auVar = (C62208au) C62209av.f167958d.createBuilder();
                    auVar.copyOnWrite();
                    C62209av avVar = (C62209av) auVar.instance;
                    avVar.f167960a |= 1;
                    avVar.f167961b = i5;
                    auVar.copyOnWrite();
                    C62209av avVar2 = (C62209av) auVar.instance;
                    avVar2.f167960a |= 2;
                    avVar2.f167962c = first;
                    atVar.copyOnWrite();
                    C62210aw awVar3 = (C62210aw) atVar.instance;
                    C62209av avVar3 = (C62209av) auVar.build();
                    avVar3.getClass();
                    C62971cq cqVar = awVar3.f167968d;
                    if (!cqVar.mo58948c()) {
                        awVar3.f167968d = C62942bv.mutableCopy(cqVar);
                    }
                    awVar3.f167968d.add(avVar3);
                    next = this.f76074c.next();
                }
                m51987b(e2, atVar);
                for (int i8 = ((C58724pq) e2.mo55394f()).f156474d; i8 < guVar.size(); i8++) {
                    e2.mo55395g(C62210aw.f167963i);
                }
                return e2.mo55394f();
            }
            ((C58970a) ((C58970a) f76072a.mo56224b()).mo56372aa(50115)).mo56386p("No text found in text block");
            return C58485gu.m89845m();
        }
        ((C58970a) ((C58970a) f76072a.mo56224b()).mo56372aa(50116)).mo56386p("No translation found");
        return C58485gu.m89845m();
    }
}
