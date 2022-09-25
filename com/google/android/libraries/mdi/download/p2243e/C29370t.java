package com.google.android.libraries.mdi.download.p2243e;

import androidx.core.app.C1800aq;
import androidx.core.app.C1839z;
import com.google.android.libraries.mdi.download.foreground.C29421a;
import com.google.android.libraries.mdi.download.foreground.C29422b;
import com.google.android.libraries.mdi.download.foreground.C29423c;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.mdi.download.e.t */
/* compiled from: PG */
public final /* synthetic */ class C29370t implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29376z f79602a;

    /* renamed from: b */
    public final /* synthetic */ C1839z f79603b;

    /* renamed from: c */
    public final /* synthetic */ C29359i f79604c;

    /* renamed from: d */
    public final /* synthetic */ C1800aq f79605d;

    /* renamed from: e */
    public final /* synthetic */ int f79606e;

    /* renamed from: f */
    public final /* synthetic */ C29422b f79607f;

    public /* synthetic */ C29370t(C29376z zVar, C1839z zVar2, C29359i iVar, C1800aq aqVar, int i, C29422b bVar) {
        this.f79602a = zVar;
        this.f79603b = zVar2;
        this.f79604c = iVar;
        this.f79605d = aqVar;
        this.f79606e = i;
        this.f79607f = bVar;
    }

    public final C60870cx apply(Object obj) {
        C29376z zVar = this.f79602a;
        C1839z zVar2 = this.f79603b;
        C29359i iVar = this.f79604c;
        C1800aq aqVar = this.f79605d;
        int i = this.f79606e;
        C29422b bVar = this.f79607f;
        Void voidR = (Void) obj;
        zVar2.f5682b.clear();
        if (iVar.mo34680j()) {
            zVar2.f5705y = "status";
            zVar2.f5686f = C1839z.m5037c(C29423c.m54383f(zVar.f79639g.f79553a));
            zVar2.mo5015d(2, false);
            zVar2.f5679J.icon = 17301634;
            zVar2.mo5020i(0, 0, false);
            aqVar.mo5003b((String) null, i, zVar2.mo5013a());
        } else {
            C29423c.m54384g(zVar.f79639g.f79553a, ((C29421a) bVar).f79765a);
        }
        return C60866ct.f164955a;
    }
}
