package com.google.android.libraries.mdi.download.p2243e;

import androidx.core.app.C1800aq;
import androidx.core.app.C1839z;
import com.google.android.libraries.mdi.download.foreground.C29423c;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.mdi.download.e.u */
/* compiled from: PG */
public final /* synthetic */ class C29371u implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29376z f79608a;

    /* renamed from: b */
    public final /* synthetic */ C29359i f79609b;

    /* renamed from: c */
    public final /* synthetic */ C1839z f79610c;

    /* renamed from: d */
    public final /* synthetic */ C1800aq f79611d;

    /* renamed from: e */
    public final /* synthetic */ int f79612e;

    public /* synthetic */ C29371u(C29376z zVar, C29359i iVar, C1839z zVar2, C1800aq aqVar, int i) {
        this.f79608a = zVar;
        this.f79609b = iVar;
        this.f79610c = zVar2;
        this.f79611d = aqVar;
        this.f79612e = i;
    }

    public final C60870cx apply(Object obj) {
        C29376z zVar = this.f79608a;
        C29359i iVar = this.f79609b;
        C1839z zVar2 = this.f79610c;
        C1800aq aqVar = this.f79611d;
        int i = this.f79612e;
        C29045l.m53946r((Exception) obj, "%s: Delegate onComplete failed for uri: %s, showing failure notification.", "DownloadListener", iVar.mo34671c());
        zVar2.f5682b.clear();
        if (iVar.mo34680j()) {
            zVar2.f5705y = "status";
            zVar2.f5686f = C1839z.m5037c(C29423c.m54380c(zVar.f79639g.f79553a));
            zVar2.mo5015d(2, false);
            zVar2.f5679J.icon = 17301642;
            zVar2.mo5020i(0, 0, false);
            aqVar.mo5003b((String) null, i, zVar2.mo5013a());
        } else {
            C29423c.m54384g(zVar.f79639g.f79553a, iVar.mo34671c().toString());
        }
        return C60866ct.f164955a;
    }
}
