package com.google.android.apps.gsa.staticplugins.opa.translator.offline;

import android.text.TextUtils;
import androidx.p104d.p105a.C2169h;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.translator.offline.ab */
/* compiled from: PG */
public final /* synthetic */ class C113617ab implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C113620ae f314614a;

    /* renamed from: b */
    public final /* synthetic */ String f314615b;

    /* renamed from: c */
    public final /* synthetic */ String f314616c;

    /* renamed from: d */
    public final /* synthetic */ boolean f314617d;

    /* renamed from: e */
    public final /* synthetic */ String f314618e;

    public /* synthetic */ C113617ab(C113620ae aeVar, String str, String str2, boolean z, String str3) {
        this.f314614a = aeVar;
        this.f314615b = str;
        this.f314616c = str2;
        this.f314617d = z;
        this.f314618e = str3;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C60870cx cxVar;
        C113620ae aeVar = this.f314614a;
        String str = this.f314615b;
        String str2 = this.f314616c;
        boolean z = this.f314617d;
        String str3 = this.f314618e;
        boolean z2 = false;
        if (TextUtils.equals(aeVar.f314623e, str) && TextUtils.equals(aeVar.f314624f, str2)) {
            z2 = true;
        }
        if ((!z2 || !z || (cxVar = aeVar.f314621c) == null) && (!z2 || z || (cxVar = aeVar.f314622d) == null)) {
            aeVar.f314623e = str;
            aeVar.f314624f = str2;
            if (z) {
                aeVar.f314621c = C2169h.m6027a(new C113647z(aeVar, str, str2));
                cxVar = aeVar.f314621c;
            } else {
                aeVar.f314622d = C2169h.m6027a(new C113616aa(aeVar, str2, str));
                cxVar = aeVar.f314622d;
            }
        }
        return C60922j.m93045h(C60838bs.m92859i(cxVar), new C113643v(aeVar, str3), aeVar.f314619a);
    }
}
