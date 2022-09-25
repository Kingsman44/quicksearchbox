package com.google.common.p4526f.p4532d;

import com.google.common.p4526f.p4528b.C58981a;
import com.google.common.p4526f.p4528b.C59028c;
import com.google.common.p4526f.p4528b.C59035j;
import java.util.Calendar;
import java.util.Date;

/* renamed from: com.google.common.f.d.b */
/* compiled from: PG */
public final class C59067b extends C59068c {

    /* renamed from: c */
    private final C59066a f157032c;

    public C59067b(C59028c cVar, int i, C59066a aVar) {
        super(cVar, i);
        this.f157032c = aVar;
        StringBuilder sb = new StringBuilder("%");
        cVar.mo56298f(sb);
        sb.append(true != cVar.mo56295d() ? 't' : 'T');
        sb.append(aVar.f157031G);
    }

    /* renamed from: a */
    public final void mo56336a(C59069d dVar, Object obj) {
        C59066a aVar = this.f157032c;
        C59028c cVar = this.f157034b;
        if ((obj instanceof Date) || (obj instanceof Calendar) || (obj instanceof Long)) {
            StringBuilder sb = new StringBuilder("%");
            cVar.mo56298f(sb);
            sb.append(true != cVar.mo56295d() ? 't' : 'T');
            sb.append(aVar.f157031G);
            ((C58981a) dVar).f156843b.append(String.format(C59035j.f156957a, sb.toString(), new Object[]{obj}));
            return;
        }
        StringBuilder sb2 = ((C58981a) dVar).f156843b;
        char c = aVar.f157031G;
        C58981a.m91150a(sb2, obj, "%t" + c);
    }
}
