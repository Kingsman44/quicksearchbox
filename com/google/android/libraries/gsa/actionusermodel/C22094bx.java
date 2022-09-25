package com.google.android.libraries.gsa.actionusermodel;

import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;

/* renamed from: com.google.android.libraries.gsa.actionusermodel.bx */
/* compiled from: PG */
public final class C22094bx implements C22087bq {

    /* renamed from: a */
    public static final C58974d f60897a = C58974d.m91136j();

    /* renamed from: b */
    public volatile int f60898b = 100;

    /* renamed from: c */
    private final C42876ab f60899c;

    /* renamed from: d */
    private final C22871g f60900d;

    public C22094bx(C42876ab abVar, C22871g gVar) {
        this.f60899c = abVar;
        this.f60900d = gVar;
    }

    /* renamed from: a */
    public final C60870cx mo27347a() {
        return this.f60900d.mo28209i(this.f60899c.mo46042d(), "AumStateManagerImpl.getActionHistoryData", C22093bw.f60896a);
    }

    /* renamed from: b */
    public final void mo27348b(int i) {
        this.f60898b = i;
    }

    /* renamed from: c */
    public final void mo27349c(List list, boolean z) {
        C90875ai.m148465b(C22089bs.f60892a, this.f60899c.mo46040b(new C22088br(this, z, list), C60826bg.f164896a), this.f60900d, "Update AUM request to PDS").mo85223a(C22090bt.f60893a);
    }
}
