package com.google.android.libraries.mdi.download;

import androidx.core.app.C1800aq;
import androidx.core.app.C1839z;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.mdi.download.hm */
/* compiled from: PG */
public final /* synthetic */ class C29642hm implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C28740br f80267a;

    /* renamed from: b */
    public final /* synthetic */ C1839z f80268b;

    /* renamed from: c */
    public final /* synthetic */ String f80269c;

    /* renamed from: d */
    public final /* synthetic */ C1800aq f80270d;

    /* renamed from: e */
    public final /* synthetic */ int f80271e;

    public /* synthetic */ C29642hm(C28740br brVar, C1839z zVar, String str, C1800aq aqVar, int i) {
        this.f80267a = brVar;
        this.f80268b = zVar;
        this.f80269c = str;
        this.f80270d = aqVar;
        this.f80271e = i;
    }

    public final C60870cx apply(Object obj) {
        C28740br brVar = this.f80267a;
        C1839z zVar = this.f80268b;
        String str = this.f80269c;
        C1800aq aqVar = this.f80270d;
        int i = this.f80271e;
        if (((Boolean) obj).booleanValue() && brVar.mo34353l() == 2) {
            zVar.f5705y = "status";
            zVar.f5686f = C1839z.m5037c(str);
            zVar.f5679J.icon = 17301633;
            zVar.mo5015d(2, true);
            zVar.mo5020i(0, 0, false);
            aqVar.mo5003b((String) null, i, zVar.mo5013a());
        }
        if (brVar.mo34348g().mo56113h()) {
            ((C28742bt) brVar.mo34348g().mo56107c()).mo33127d();
        }
        return C60866ct.f164955a;
    }
}
