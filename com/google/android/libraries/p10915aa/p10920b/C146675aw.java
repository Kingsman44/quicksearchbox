package com.google.android.libraries.p10915aa.p10920b;

import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import p3186j$.util.Collection;
import p3186j$.util.Comparator;
import p3186j$.util.Optional;
import p3186j$.util.stream.IntStream;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.libraries.aa.b.aw */
/* compiled from: PG */
public final class C146675aw {

    /* renamed from: a */
    public static final C58974d f396108a = C58974d.m91136j();

    /* renamed from: a */
    public static Optional m238932a(C146672at atVar, C146660ah ahVar) {
        try {
            Stream b = m238933b(atVar, ahVar.mo123439a(), C146703z.m238987a(atVar, ahVar.mo123439a()));
            int b2 = ahVar.mo123440b();
            int i = b2 - 1;
            if (b2 == 0) {
                throw null;
            } else if (i == 0 || i == 1) {
                return b.findFirst();
            } else {
                if (i != 2) {
                    return b.findFirst();
                }
                return b.max(Comparator.CC.comparingInt(C146674av.f396107a));
            }
        } catch (IllegalArgumentException e) {
            ((C58970a) ((C58970a) ((C58970a) f396108a.mo56225c()).mo56382g(e)).mo56372aa(48697)).mo56386p("Unable to find the matching nodes, returning no match");
            return Optional.empty();
        }
    }

    /* renamed from: b */
    public static Stream m238933b(C146672at atVar, C146659ag agVar, C58495hd hdVar) {
        Stream empty = Stream.CC.empty();
        if (agVar.mo123438f(atVar, hdVar)) {
            empty = Stream.CC.concat(empty, Stream.CC.m71935of(atVar));
        }
        return Stream.CC.concat(empty, Collection.EL.stream((C58485gu) IntStream.CC.range(0, atVar.mo123451a()).mapToObj(new C146669aq(atVar)).filter(C146670ar.f396103a).map(C146671as.f396104a).collect(C58370cn.f155946a)).flatMap(new C146673au(agVar, hdVar)));
    }
}
