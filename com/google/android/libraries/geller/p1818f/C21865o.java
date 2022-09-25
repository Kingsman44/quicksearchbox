package com.google.android.libraries.geller.p1818f;

import com.google.android.libraries.geller.portable.C21947am;
import com.google.android.libraries.geller.portable.C21952d;
import com.google.common.base.C58817ah;
import com.google.protos.p5129p.p5131b.C65753ak;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.geller.f.o */
/* compiled from: PG */
public final /* synthetic */ class C21865o implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C21875y f60340a;

    /* renamed from: b */
    public final /* synthetic */ C65753ak f60341b;

    public /* synthetic */ C21865o(C21875y yVar, C65753ak akVar) {
        this.f60340a = yVar;
        this.f60341b = akVar;
    }

    public final Object apply(Object obj) {
        C21875y yVar = this.f60340a;
        C65753ak akVar = this.f60341b;
        ArrayList arrayList = new ArrayList();
        for (C21952d dVar : (List) obj) {
            if (dVar != null) {
                arrayList.add(dVar);
            }
        }
        yVar.f60361e.mo27209t(yVar.f60363g, akVar, C21875y.m40977b(C21947am.DELETION_SYNCED, arrayList));
        return null;
    }
}
