package com.google.android.apps.gsa.staticplugins.p7565bu.p7566a;

import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90851k;
import com.google.android.libraries.mdi.download.p2248h.p2250b.C29552be;
import com.google.android.libraries.mdi.download.p2248h.p2250b.C29554bg;
import com.google.android.libraries.mdi.download.p2248h.p2250b.C29559f;
import com.google.android.libraries.mdi.download.p2248h.p2250b.C29561h;
import com.google.android.libraries.mdi.download.p2248h.p2250b.C29562i;
import com.google.common.util.concurrent.C60888db;

/* renamed from: com.google.android.apps.gsa.staticplugins.bu.a.i */
/* compiled from: PG */
public final class C96790i {

    /* renamed from: a */
    private final C29554bg f270703a;

    /* renamed from: b */
    private final C90851k f270704b;

    public C96790i(C90851k kVar, C29554bg bgVar) {
        this.f270704b = kVar;
        this.f270703a = bgVar;
    }

    /* renamed from: a */
    public final C29562i mo90347a(C29552be beVar, String str) {
        C60888db c = this.f270704b.mo85210c(String.format("[NGA] %sMultiVariantTargeter", new Object[]{str}));
        C29561h hVar = new C29561h();
        hVar.f80100c = c;
        hVar.f80098a = this.f270703a;
        hVar.f80099b = beVar;
        return hVar.mo34769a();
    }

    /* renamed from: b */
    public final C29562i mo90348b(C29554bg bgVar, String str) {
        C60888db c = this.f270704b.mo85210c(String.format("[NGA] %sTargeter", new Object[]{str}));
        C29561h hVar = new C29561h();
        hVar.f80100c = c;
        hVar.f80098a = this.f270703a;
        hVar.f80099b = new C29559f(bgVar);
        return hVar.mo34769a();
    }
}
