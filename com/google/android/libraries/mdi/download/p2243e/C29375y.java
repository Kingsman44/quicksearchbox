package com.google.android.libraries.mdi.download.p2243e;

import androidx.core.app.C1800aq;
import androidx.core.app.C1839z;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.mdi.download.e.y */
/* compiled from: PG */
public final /* synthetic */ class C29375y implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C1839z f79628a;

    /* renamed from: b */
    public final /* synthetic */ C29359i f79629b;

    /* renamed from: c */
    public final /* synthetic */ long f79630c;

    /* renamed from: d */
    public final /* synthetic */ C1800aq f79631d;

    /* renamed from: e */
    public final /* synthetic */ int f79632e;

    public /* synthetic */ C29375y(C1839z zVar, C29359i iVar, long j, C1800aq aqVar, int i) {
        this.f79628a = zVar;
        this.f79629b = iVar;
        this.f79630c = j;
        this.f79631d = aqVar;
        this.f79632e = i;
    }

    public final C60870cx apply(Object obj) {
        C1839z zVar = this.f79628a;
        C29359i iVar = this.f79629b;
        long j = this.f79630c;
        C1800aq aqVar = this.f79631d;
        int i = this.f79632e;
        if (((Boolean) obj).booleanValue()) {
            zVar.f5705y = "progress";
            zVar.f5686f = C1839z.m5037c((CharSequence) iVar.mo34675f().mo56109e(iVar.mo34679i()));
            zVar.f5679J.icon = 17301633;
            zVar.mo5020i(iVar.mo34669a(), (int) j, iVar.mo34669a() <= 0);
            aqVar.mo5003b((String) null, i, zVar.mo5013a());
        }
        if (iVar.mo34673e().mo56113h()) {
            ((C29353c) iVar.mo34673e().mo56107c()).mo34577d(j);
        }
        return C60866ct.f164955a;
    }
}
