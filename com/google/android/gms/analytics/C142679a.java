package com.google.android.gms.analytics;

import android.text.TextUtils;
import com.google.android.gms.analytics.internal.C142703a;
import com.google.android.gms.analytics.internal.C142740j;
import com.google.android.gms.analytics.p10733a.C142689j;
import com.google.android.gms.p10725a.p10730b.C142676c;

/* renamed from: com.google.android.gms.analytics.a */
/* compiled from: PG */
public class C142679a extends C142758k {

    /* renamed from: a */
    public final C142740j f387167a;

    /* renamed from: b */
    public boolean f387168b;

    public C142679a(C142740j jVar) {
        super(jVar.mo117542b(), jVar.f387340h);
        this.f387167a = jVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo117460a(C142701h hVar) {
        C142689j jVar = (C142689j) hVar.mo117482a(C142689j.class);
        if (TextUtils.isEmpty(jVar.f387193b)) {
            jVar.f387193b = this.f387167a.mo117546f().mo117491b();
        }
        if (this.f387168b && TextUtils.isEmpty(jVar.f387195d)) {
            C142703a c = this.f387167a.mo117543c();
            c.mo117537k();
            C142676c b = c.mo117489b();
            String str = null;
            String str2 = b != null ? b.f387158a : null;
            boolean z = true;
            if (true != TextUtils.isEmpty(str2)) {
                str = str2;
            }
            jVar.f387195d = str;
            c.mo117537k();
            C142676c b2 = c.mo117489b();
            if (b2 == null || b2.f387159b) {
                z = false;
            }
            jVar.f387196e = z;
        }
    }
}
