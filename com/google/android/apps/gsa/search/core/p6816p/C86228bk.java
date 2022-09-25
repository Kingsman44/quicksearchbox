package com.google.android.apps.gsa.search.core.p6816p;

import com.google.android.apps.gsa.shared.p6968aa.C89022at;
import com.google.android.apps.gsa.shared.p7127q.C90456c;
import com.google.android.apps.gsa.shared.util.C91043j;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.gsa.search.core.p.bk */
/* compiled from: PG */
public final class C86228bk {

    /* renamed from: a */
    public static final C59071e f233041a = C59071e.m91332i("com.google.android.apps.gsa.search.core.p.bk");

    /* renamed from: b */
    public final StringBuilder f233042b = new StringBuilder(2048);

    /* renamed from: c */
    public C91043j f233043c;

    /* renamed from: d */
    public String f233044d;

    /* renamed from: e */
    public boolean f233045e;

    /* renamed from: f */
    public volatile C89022at f233046f;

    /* renamed from: g */
    private volatile C90456c f233047g;

    /* renamed from: h */
    private final AtomicBoolean f233048h = new AtomicBoolean(false);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo79862a() {
        C58838bb.m90883r(this.f233045e);
        if (this.f233048h.compareAndSet(false, true)) {
            if (this.f233047g != null) {
                ((C59052c) ((C59052c) ((C59052c) f233041a.mo56226d()).mo56382g(this.f233047g.mo79845c())).mo56372aa(7777)).mo56386p("Error parsing response headers");
                ((C86227bj) this.f233043c).mo17709a((C89022at) null);
            }
            ((C86227bj) this.f233043c).mo17709a(this.f233046f);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo79863b(C90456c cVar) {
        this.f233047g = cVar;
        this.f233045e = true;
        mo79862a();
    }

    public final String toString() {
        boolean z = this.f233045e;
        String valueOf = String.valueOf(this.f233046f);
        return "S3HeaderProcessor{mComplete:" + z + ", mResponseData:" + valueOf + "}";
    }
}
