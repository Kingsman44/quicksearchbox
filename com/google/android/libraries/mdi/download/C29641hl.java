package com.google.android.libraries.mdi.download;

import androidx.core.app.C1800aq;
import androidx.core.app.C1839z;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.mdi.download.hl */
/* compiled from: PG */
public final /* synthetic */ class C29641hl implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C28740br f80262a;

    /* renamed from: b */
    public final /* synthetic */ C1839z f80263b;

    /* renamed from: c */
    public final /* synthetic */ long f80264c;

    /* renamed from: d */
    public final /* synthetic */ C1800aq f80265d;

    /* renamed from: e */
    public final /* synthetic */ int f80266e;

    public /* synthetic */ C29641hl(C28740br brVar, C1839z zVar, long j, C1800aq aqVar, int i) {
        this.f80262a = brVar;
        this.f80263b = zVar;
        this.f80264c = j;
        this.f80265d = aqVar;
        this.f80266e = i;
    }

    public final C60870cx apply(Object obj) {
        C28740br brVar = this.f80262a;
        C1839z zVar = this.f80263b;
        long j = this.f80264c;
        C1800aq aqVar = this.f80265d;
        int i = this.f80266e;
        if (((Boolean) obj).booleanValue() && brVar.mo34353l() == 2) {
            zVar.f5705y = "progress";
            zVar.f5679J.icon = 17301633;
            zVar.mo5020i(brVar.mo34342a(), (int) j, brVar.mo34342a() <= 0);
            aqVar.mo5003b((String) null, i, zVar.mo5013a());
        }
        if (brVar.mo34348g().mo56113h()) {
            ((C28742bt) brVar.mo34348g().mo56107c()).mo33126c(j);
        }
        return C60866ct.f164955a;
    }
}
