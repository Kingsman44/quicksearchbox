package com.google.android.libraries.mdi.download;

import androidx.core.app.C1800aq;
import androidx.core.app.C1839z;
import com.google.android.libraries.mdi.download.foreground.C29421a;
import com.google.android.libraries.mdi.download.foreground.C29422b;
import com.google.android.libraries.mdi.download.foreground.C29423c;
import com.google.android.libraries.mdi.download.p2247g.C29441e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.libraries.mdi.download.ho */
/* compiled from: PG */
public final /* synthetic */ class C29644ho implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C29645hp f80279a;

    /* renamed from: b */
    public final /* synthetic */ C28740br f80280b;

    /* renamed from: c */
    public final /* synthetic */ C1839z f80281c;

    /* renamed from: d */
    public final /* synthetic */ C1800aq f80282d;

    /* renamed from: e */
    public final /* synthetic */ int f80283e;

    /* renamed from: f */
    public final /* synthetic */ Throwable f80284f;

    /* renamed from: g */
    public final /* synthetic */ C29422b f80285g;

    public /* synthetic */ C29644ho(C29645hp hpVar, C28740br brVar, C1839z zVar, C1800aq aqVar, int i, Throwable th, C29422b bVar) {
        this.f80279a = hpVar;
        this.f80280b = brVar;
        this.f80281c = zVar;
        this.f80282d = aqVar;
        this.f80283e = i;
        this.f80284f = th;
        this.f80285g = bVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C29645hp hpVar = this.f80279a;
        C28740br brVar = this.f80280b;
        C1839z zVar = this.f80281c;
        C1800aq aqVar = this.f80282d;
        int i = this.f80283e;
        Throwable th = this.f80284f;
        C29422b bVar = this.f80285g;
        if (brVar.mo34353l() == 2) {
            zVar.f5682b.clear();
            zVar.f5705y = "status";
            zVar.f5686f = C1839z.m5037c(C29423c.m54380c(hpVar.f80292g.f80295a));
            zVar.mo5015d(2, false);
            zVar.f5679J.icon = 17301642;
            zVar.mo5020i(0, 0, false);
            aqVar.mo5003b((String) null, i, zVar.mo5013a());
        }
        if (brVar.mo34348g().mo56113h()) {
            ((C28742bt) brVar.mo34348g().mo56107c()).mo33125b(th);
        }
        ((C29441e) hpVar.f80292g.f80302h.mo56107c()).mo34741k(brVar.mo34350i());
        return hpVar.f80292g.f80299e.mo34568e(((C29421a) bVar).f79765a);
    }
}
