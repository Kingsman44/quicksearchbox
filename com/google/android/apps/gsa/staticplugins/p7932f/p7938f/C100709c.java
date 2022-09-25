package com.google.android.apps.gsa.staticplugins.p7932f.p7938f;

import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.p6519al.p6733g.C85472a;
import com.google.android.apps.gsa.search.core.p6519al.p6733g.C85476b;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.shared.p7066m.C90140s;
import com.google.assistant.p3897e.p3921j.acy;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.f.f.c */
/* compiled from: PG */
public final class C100709c extends C86734a implements C85476b {

    /* renamed from: a */
    private final C69464a f281584a;

    /* renamed from: b */
    private final C69464a f281585b;

    /* renamed from: c */
    private final C86124t f281586c;

    /* renamed from: f */
    private C100715i f281587f;

    /* renamed from: g */
    private C100707a f281588g;

    public C100709c(C69464a aVar, C69464a aVar2, C86124t tVar) {
        super(C118575h.WORKER_AMP_ACTIONS, "ampactions");
        this.f281584a = aVar;
        this.f281585b = aVar2;
        this.f281586c = tVar;
        if (tVar.mo79746e(C90140s.f251873f)) {
            this.f281587f = (C100715i) aVar2.mo17428b();
            this.f281588g = null;
            return;
        }
        this.f281587f = null;
        this.f281588g = (C100707a) aVar.mo17428b();
    }

    /* renamed from: e */
    private final C85476b m166897e() {
        if (this.f281586c.mo79746e(C90140s.f251873f)) {
            if (this.f281587f == null) {
                this.f281588g = null;
                this.f281587f = (C100715i) this.f281585b.mo17428b();
            }
            return this.f281587f;
        }
        if (this.f281588g == null) {
            C100715i iVar = this.f281587f;
            if (iVar != null) {
                iVar.mo79108hY();
            }
            this.f281587f = null;
            this.f281588g = (C100707a) this.f281584a.mo17428b();
        }
        return this.f281588g;
    }

    /* renamed from: a */
    public final void mo78995a(List list) {
        m166897e().mo78995a(list);
    }

    /* renamed from: c */
    public final void mo78996c(acy acy, C85472a aVar) {
        m166897e().mo78996c(acy, aVar);
    }

    /* renamed from: hY */
    public final void mo79108hY() {
        C100715i iVar = this.f281587f;
        if (iVar != null) {
            iVar.mo79108hY();
        }
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return true;
    }
}
