package com.google.android.libraries.mdi.download.p2243e;

import androidx.core.app.C1800aq;
import androidx.core.app.C1839z;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.mdi.download.e.w */
/* compiled from: PG */
public final /* synthetic */ class C29373w implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C1839z f79616a;

    /* renamed from: b */
    public final /* synthetic */ String f79617b;

    /* renamed from: c */
    public final /* synthetic */ C1800aq f79618c;

    /* renamed from: d */
    public final /* synthetic */ int f79619d;

    /* renamed from: e */
    public final /* synthetic */ C29359i f79620e;

    public /* synthetic */ C29373w(C1839z zVar, String str, C1800aq aqVar, int i, C29359i iVar) {
        this.f79616a = zVar;
        this.f79617b = str;
        this.f79618c = aqVar;
        this.f79619d = i;
        this.f79620e = iVar;
    }

    public final C60870cx apply(Object obj) {
        C1839z zVar = this.f79616a;
        String str = this.f79617b;
        C1800aq aqVar = this.f79618c;
        int i = this.f79619d;
        C29359i iVar = this.f79620e;
        if (((Boolean) obj).booleanValue()) {
            zVar.f5705y = "status";
            zVar.f5686f = C1839z.m5037c(str);
            zVar.f5679J.icon = 17301633;
            zVar.mo5015d(2, true);
            zVar.mo5020i(0, 0, false);
            aqVar.mo5003b((String) null, i, zVar.mo5013a());
        }
        if (iVar.mo34673e().mo56113h()) {
            ((C29353c) iVar.mo34673e().mo56107c()).mo34576c();
        }
        return C60866ct.f164955a;
    }
}
