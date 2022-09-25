package com.google.android.libraries.mdi.download;

import androidx.core.app.C1800aq;
import androidx.core.app.C1839z;
import com.google.android.libraries.mdi.C29690f;
import com.google.android.libraries.mdi.download.foreground.C29421a;
import com.google.android.libraries.mdi.download.foreground.C29422b;
import com.google.android.libraries.mdi.download.foreground.C29423c;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.android.libraries.mdi.download.p2247g.C29441e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.libraries.mdi.download.hn */
/* compiled from: PG */
public final /* synthetic */ class C29643hn implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C29645hp f80272a;

    /* renamed from: b */
    public final /* synthetic */ C28740br f80273b;

    /* renamed from: c */
    public final /* synthetic */ C29690f f80274c;

    /* renamed from: d */
    public final /* synthetic */ C1839z f80275d;

    /* renamed from: e */
    public final /* synthetic */ C1800aq f80276e;

    /* renamed from: f */
    public final /* synthetic */ int f80277f;

    /* renamed from: g */
    public final /* synthetic */ C29422b f80278g;

    public /* synthetic */ C29643hn(C29645hp hpVar, C28740br brVar, C29690f fVar, C1839z zVar, C1800aq aqVar, int i, C29422b bVar) {
        this.f80272a = hpVar;
        this.f80273b = brVar;
        this.f80274c = fVar;
        this.f80275d = zVar;
        this.f80276e = aqVar;
        this.f80277f = i;
        this.f80278g = bVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        boolean z;
        C29645hp hpVar = this.f80272a;
        C28740br brVar = this.f80273b;
        C29690f fVar = this.f80274c;
        C1839z zVar = this.f80275d;
        C1800aq aqVar = this.f80276e;
        int i = this.f80277f;
        C29422b bVar = this.f80278g;
        if (brVar.mo34348g().mo56113h()) {
            try {
                ((C28742bt) brVar.mo34348g().mo56107c()).mo33124a(fVar);
            } catch (Exception e) {
                z = true;
                C29045l.m53946r(e, "%s: Delegate onComplete failed for group %s, showing failure notification.", "DownloadListener", fVar.f80411b);
            }
        }
        z = false;
        if (brVar.mo34353l() == 2) {
            zVar.f5682b.clear();
            if (z) {
                zVar.f5705y = "status";
                zVar.f5686f = C1839z.m5037c(C29423c.m54380c(hpVar.f80292g.f80295a));
                zVar.mo5015d(2, false);
                zVar.f5679J.icon = 17301642;
                zVar.mo5020i(0, 0, false);
                aqVar.mo5003b((String) null, i, zVar.mo5013a());
            } else {
                C29423c.m54384g(hpVar.f80292g.f80295a, brVar.mo34350i());
            }
        }
        ((C29441e) hpVar.f80292g.f80302h.mo56107c()).mo34741k(brVar.mo34350i());
        return hpVar.f80292g.f80299e.mo34568e(((C29421a) bVar).f79765a);
    }
}
