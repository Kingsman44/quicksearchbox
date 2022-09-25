package com.google.android.apps.search.googleapp.searchwidget.p10479c;

import com.google.common.base.C58817ah;
import com.google.p337aa.C6619f;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62948a;
import com.google.protobuf.p4750c.C62953e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.searchwidget.c.ar */
/* compiled from: PG */
public final /* synthetic */ class C138948ar implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C138963bf f377900a;

    /* renamed from: b */
    public final /* synthetic */ C6619f f377901b;

    public /* synthetic */ C138948ar(C138963bf bfVar, C6619f fVar) {
        this.f377900a = bfVar;
        this.f377901b = fVar;
    }

    public final Object apply(Object obj) {
        long j;
        C138963bf bfVar = this.f377900a;
        C6619f fVar = this.f377901b;
        Optional optional = (Optional) obj;
        if (optional.isEmpty() || fVar.equals(C6619f.f19675e)) {
            return Optional.empty();
        }
        C63042fg fgVar = (C63042fg) optional.get();
        C63042fg i = C62953e.m95484i(fVar.f19678b);
        if (C62953e.m95476a(fgVar, i) > 0 && C62953e.m95476a(fgVar, C62953e.m95484i(fVar.f19679c)) < 0) {
            return Optional.m71637of(C62948a.f169987b);
        }
        C62910ar arVar = bfVar.f377930l;
        if (bfVar.f377928j) {
            j = 0;
        } else {
            j = (long) bfVar.f377931m.nextInt((int) C62948a.m95453d(bfVar.f377929k));
        }
        return Optional.m71637of(C62953e.m95480e(C62953e.m95481f(C62953e.m95481f(i, arVar), C62948a.m95459j(j)), fgVar));
    }
}
