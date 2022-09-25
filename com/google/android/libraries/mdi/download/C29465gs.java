package com.google.android.libraries.mdi.download;

import com.google.android.libraries.mdi.C29690f;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.android.libraries.mdi.download.p2247g.C29441e;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.libraries.mdi.download.gs */
/* compiled from: PG */
public final /* synthetic */ class C29465gs implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C29647hr f79869a;

    /* renamed from: b */
    public final /* synthetic */ boolean f79870b;

    /* renamed from: c */
    public final /* synthetic */ C28740br f79871c;

    /* renamed from: d */
    public final /* synthetic */ String f79872d;

    public /* synthetic */ C29465gs(C29647hr hrVar, boolean z, C28740br brVar, String str) {
        this.f79869a = hrVar;
        this.f79870b = z;
        this.f79871c = brVar;
        this.f79872d = str;
    }

    public final Object apply(Object obj) {
        C29647hr hrVar = this.f79869a;
        boolean z = this.f79870b;
        C28740br brVar = this.f79871c;
        String str = this.f79872d;
        C29690f fVar = (C29690f) obj;
        if (z) {
            try {
                ((C28742bt) brVar.mo34348g().mo56107c()).mo33124a(fVar);
            } catch (Exception e) {
                C29045l.m53946r(e, "%s: Listener onComplete failed for group %s", "MobileDataDownload", fVar.f80411b);
            }
            ((C29441e) hrVar.f80302h.mo56107c()).mo34741k(str);
        }
        return fVar;
    }
}
