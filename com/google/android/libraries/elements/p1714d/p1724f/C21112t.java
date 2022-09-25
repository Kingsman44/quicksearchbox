package com.google.android.libraries.elements.p1714d.p1724f;

import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58800sl;
import com.google.protobuf.C63088z;
import com.google.protos.youtube.elements.C66130bi;
import com.google.protos.youtube.elements.C66132bk;
import com.google.protos.youtube.elements.C66133bl;
import com.google.protos.youtube.elements.C66134bm;
import java.util.Map;
import p5488io.p5490b.p5496d.C69822d;

/* renamed from: com.google.android.libraries.elements.d.f.t */
/* compiled from: PG */
final class C21112t implements C69822d {

    /* renamed from: a */
    private final C58495hd f59154a;

    /* renamed from: b */
    private final C66132bk f59155b;

    public C21112t(C58495hd hdVar, C66132bk bkVar) {
        this.f59154a = hdVar;
        this.f59155b = bkVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo25875a(Object obj) {
        C66130bi biVar = (C66130bi) C66132bk.f179834b.createBuilder(this.f59155b);
        C58800sl lA = ((C58495hd) obj).entrySet().iterator();
        while (lA.hasNext()) {
            Map.Entry entry = (Map.Entry) lA.next();
            String str = (String) this.f59154a.get(entry.getKey());
            str.getClass();
            C66133bl blVar = (C66133bl) C66134bm.f179838c.createBuilder();
            C63088z A = C63088z.m96139A((byte[]) entry.getValue());
            blVar.copyOnWrite();
            C66134bm bmVar = (C66134bm) blVar.instance;
            bmVar.f179840a = 5;
            bmVar.f179841b = A;
            biVar.mo59442a(str, (C66134bm) blVar.build());
        }
        return (C66132bk) biVar.build();
    }
}
