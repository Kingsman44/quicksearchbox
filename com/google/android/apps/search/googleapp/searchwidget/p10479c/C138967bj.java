package com.google.android.apps.search.googleapp.searchwidget.p10479c;

import com.google.android.apps.search.googleapp.searchwidget.C139031i;
import com.google.common.base.C58817ah;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62948a;
import com.google.protobuf.p4750c.C62953e;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.googleapp.searchwidget.c.bj */
/* compiled from: PG */
public final /* synthetic */ class C138967bj implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C138970bm f377938a;

    public /* synthetic */ C138967bj(C138970bm bmVar) {
        this.f377938a = bmVar;
    }

    public final Object apply(Object obj) {
        C138970bm bmVar = this.f377938a;
        C139031i iVar = (C139031i) obj;
        int i = iVar.f378100a;
        boolean z = false;
        if (!((i & 16) == 0 || (i & 8) == 0)) {
            C63042fg fgVar = iVar.f378106g;
            if (fgVar == null) {
                fgVar = C63042fg.f170152c;
            }
            if (C138970bm.m225783c(fgVar, C62953e.m95487l(C62953e.m95484i(bmVar.f377947c.mo26870b()), C62948a.m95459j(bmVar.f377947c.mo26871c()))).compareTo(Duration.ofMinutes(1)) <= 0) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
