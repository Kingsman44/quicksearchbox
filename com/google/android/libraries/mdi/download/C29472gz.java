package com.google.android.libraries.mdi.download;

import com.google.android.libraries.mdi.C29690f;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.android.libraries.mdi.download.p2247g.C29441e;
import com.google.android.libraries.mdi.download.p2257l.C29670b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.mdi.download.gz */
/* compiled from: PG */
public final /* synthetic */ class C29472gz implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29647hr f79884a;

    /* renamed from: b */
    public final /* synthetic */ C29670b f79885b;

    /* renamed from: c */
    public final /* synthetic */ C28740br f79886c;

    /* renamed from: d */
    public final /* synthetic */ String f79887d;

    public /* synthetic */ C29472gz(C29647hr hrVar, C29670b bVar, C28740br brVar, String str) {
        this.f79884a = hrVar;
        this.f79885b = bVar;
        this.f79886c = brVar;
        this.f79887d = str;
    }

    public final C60870cx apply(Object obj) {
        C29647hr hrVar = this.f79884a;
        C29670b bVar = this.f79885b;
        C28740br brVar = this.f79886c;
        String str = this.f79887d;
        Void voidR = (Void) obj;
        C29690f fVar = (C29690f) C60856cj.m92909r(bVar);
        if (brVar.mo34348g().mo56113h()) {
            try {
                ((C28742bt) brVar.mo34348g().mo56107c()).mo33124a(fVar);
            } catch (Exception e) {
                C29045l.m53946r(e, "%s: Listener onComplete failed for group %s", "MobileDataDownload", fVar.f80411b);
            }
            if (hrVar.f80302h.mo56113h()) {
                ((C29441e) hrVar.f80302h.mo56107c()).mo34741k(str);
            }
        }
        return C60856cj.m92900i(fVar);
    }
}
