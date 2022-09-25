package com.google.android.apps.gsa.staticplugins.inappwebpage;

import android.webkit.ValueCallback;
import com.google.common.p4541l.C59317ae;

/* renamed from: com.google.android.apps.gsa.staticplugins.inappwebpage.g */
/* compiled from: PG */
public final class C102481g {

    /* renamed from: a */
    public final C102488n f286029a;

    /* renamed from: b */
    public int f286030b = 0;

    /* renamed from: c */
    public C102475as f286031c;

    /* renamed from: d */
    public boolean f286032d = false;

    public C102481g(C102488n nVar) {
        this.f286029a = nVar;
    }

    /* renamed from: a */
    public final void mo93297a() {
        C102475as asVar = this.f286031c;
        if (!(asVar == null || this.f286030b == 1)) {
            asVar.f285991c.mo80922a();
            C59317ae.m92163a(asVar.f285993e.f285934b);
        }
        this.f286031c = null;
    }

    /* renamed from: b */
    public final void mo93298b() {
        if (this.f286030b == 0) {
            C102488n nVar = this.f286029a;
            nVar.f286046f.animate().cancel();
            nVar.f286046f.setVisibility(0);
            nVar.f286046f.animate().alpha(1.0f).setDuration((long) nVar.f286047g);
            this.f286030b = 2;
        }
    }

    /* renamed from: c */
    public final void mo93299c() {
        C102475as asVar = this.f286031c;
        if (asVar != null) {
            boolean z = false;
            if (this.f286032d && this.f286030b == 1) {
                z = true;
            }
            boolean z2 = asVar.f286002n;
            asVar.f286002n = z;
            if (z != z2) {
                synchronized (asVar.f286001m) {
                    for (String b : asVar.f286001m) {
                        asVar.f285991c.mo80923b(b, (ValueCallback) null);
                    }
                }
            }
        }
    }
}
