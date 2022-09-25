package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105930ak;
import com.google.android.libraries.logging.C28292j;
import com.google.common.p4552o.aqp;
import com.google.common.p4552o.aqs;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.ci */
/* compiled from: PG */
final class C108265ci {

    /* renamed from: a */
    public final C105930ak f301179a;

    /* renamed from: b */
    public CharSequence f301180b;

    /* renamed from: c */
    public C108232bc f301181c;

    /* renamed from: d */
    private final int f301182d;

    /* renamed from: e */
    private final SparseArray f301183e;

    /* renamed from: f */
    private final C108267ck f301184f;

    public C108265ci(int i, C105930ak akVar, SparseArray sparseArray, C108267ck ckVar) {
        this.f301182d = i;
        this.f301179a = akVar;
        this.f301183e = sparseArray;
        this.f301184f = ckVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C108232bc mo96720a() {
        if (this.f301181c == null) {
            C108232bc a = this.f301184f.mo96721a(this.f301179a);
            if (!TextUtils.isEmpty(this.f301180b)) {
                a.f301036r = this.f301180b;
            }
            if (this.f301183e.get(this.f301182d) == null) {
                C28292j jVar = new C28292j(a.mo95829g());
                int i = this.f301182d;
                aqp aqp = jVar.f76974b;
                aqp.copyOnWrite();
                aqs aqs = (aqs) aqp.instance;
                aqs aqs2 = aqs.f159780k;
                aqs.f159782a |= 2;
                aqs.f159784c = i;
                this.f301183e.put(this.f301182d, jVar);
                if (a.mo96597d()) {
                    jVar.f76976d = true;
                }
            }
            a.mo96608r((C28292j) this.f301183e.get(this.f301182d));
            this.f301181c = a;
        }
        return this.f301181c;
    }
}
