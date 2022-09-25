package com.google.android.libraries.mdi.download;

import com.google.android.libraries.mdi.C29690f;
import com.google.android.libraries.mdi.download.foreground.C29421a;
import com.google.android.libraries.mdi.download.foreground.C29422b;
import com.google.android.libraries.mdi.download.p2247g.C29441e;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.mdi.download.hi */
/* compiled from: PG */
final class C29638hi implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C28740br f80254a;

    /* renamed from: b */
    final /* synthetic */ String f80255b;

    /* renamed from: c */
    final /* synthetic */ C29422b f80256c;

    /* renamed from: d */
    final /* synthetic */ C29647hr f80257d;

    public C29638hi(C29647hr hrVar, C28740br brVar, String str, C29422b bVar) {
        this.f80257d = hrVar;
        this.f80254a = brVar;
        this.f80255b = str;
        this.f80256c = bVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        if (this.f80254a.mo34348g().mo56113h()) {
            ((C28742bt) this.f80254a.mo34348g().mo56107c()).mo33125b(th);
            if (this.f80257d.f80302h.mo56113h()) {
                ((C29441e) this.f80257d.f80302h.mo56107c()).mo34741k(this.f80255b);
            }
        }
        this.f80257d.f80300f.mo34568e(((C29421a) this.f80256c).f79765a);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C29690f fVar = (C29690f) obj;
    }
}
