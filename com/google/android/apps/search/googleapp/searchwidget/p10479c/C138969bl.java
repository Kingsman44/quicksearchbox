package com.google.android.apps.search.googleapp.searchwidget.p10479c;

import com.google.android.apps.search.googleapp.searchwidget.C139031i;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62948a;
import com.google.protobuf.p4750c.C62953e;
import java.util.concurrent.Callable;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.searchwidget.c.bl */
/* compiled from: PG */
public final /* synthetic */ class C138969bl implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C138970bm f377941a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f377942b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f377943c;

    public /* synthetic */ C138969bl(C138970bm bmVar, C60870cx cxVar, C60870cx cxVar2) {
        this.f377941a = bmVar;
        this.f377942b = cxVar;
        this.f377943c = cxVar2;
    }

    public final Object call() {
        C138970bm bmVar = this.f377941a;
        C60870cx cxVar = this.f377942b;
        C60870cx cxVar2 = this.f377943c;
        boolean booleanValue = ((Boolean) C60856cj.m92909r(cxVar)).booleanValue();
        C139031i iVar = (C139031i) C60856cj.m92909r(cxVar2);
        if (!booleanValue) {
            return Optional.empty();
        }
        C63042fg fgVar = iVar.f378105f;
        if (fgVar == null) {
            fgVar = C63042fg.f170152c;
        }
        return Optional.m71637of(C62953e.m95481f(fgVar, C62948a.m95459j(bmVar.f377947c.mo26871c())));
    }
}
