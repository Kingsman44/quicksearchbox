package com.google.android.libraries.gsa.monet.tools.model.shared.p1924b;

import android.os.Bundle;
import com.google.android.libraries.gsa.monet.shared.C23117m;
import com.google.android.libraries.gsa.monet.shared.C23120p;
import com.google.android.libraries.gsa.monet.shared.C23123s;
import com.google.android.libraries.gsa.monet.shared.p1891a.C23067b;
import com.google.android.libraries.gsa.monet.tools.model.shared.C23250b;
import com.google.android.libraries.gsa.monet.tools.model.shared.C23254d;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1923a.C23249a;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23274s;

/* renamed from: com.google.android.libraries.gsa.monet.tools.model.shared.b.a */
/* compiled from: PG */
public final class C23251a implements C23249a, C23254d, C23250b {

    /* renamed from: a */
    public final C23274s f63716a;

    /* renamed from: b */
    public final C23117m f63717b;

    /* renamed from: c */
    public final String f63718c;

    /* renamed from: d */
    public final boolean f63719d;

    /* renamed from: e */
    public Object f63720e;

    /* renamed from: f */
    public boolean f63721f;

    /* renamed from: g */
    public boolean f63722g;

    /* renamed from: h */
    public C23123s f63723h;

    /* renamed from: i */
    private final boolean f63724i;

    /* renamed from: j */
    private final boolean f63725j;

    /* renamed from: k */
    private final String f63726k;

    public C23251a(C23117m mVar, String str, C23274s sVar) {
        this(mVar, str, sVar, true, true, false);
    }

    /* renamed from: a */
    public final Object mo28725a() {
        return this.f63720e;
    }

    /* renamed from: b */
    public final void mo28726b(C23123s sVar) {
        C23067b.m43233f(this.f63725j, "Field does not support listeners.");
        this.f63723h = sVar;
    }

    /* renamed from: c */
    public final void mo28727c(C23120p pVar) {
        if (pVar.f63472a.containsKey(this.f63718c)) {
            mo28728d(pVar);
        }
    }

    /* renamed from: d */
    public final void mo28728d(C23120p pVar) {
        boolean z;
        Object b = this.f63716a.mo28733b(this.f63718c, pVar);
        boolean z2 = false;
        if (!this.f63716a.mo28735d(this.f63720e, b)) {
            this.f63720e = b;
            z = true;
        } else {
            z = false;
        }
        if (!this.f63719d) {
            this.f63721f |= z;
        } else {
            String str = this.f63726k;
            str.getClass();
            boolean z3 = pVar.f63472a.getBoolean(str);
            boolean z4 = this.f63721f;
            if (z && (!z3 || !this.f63722g)) {
                z2 = true;
            }
            this.f63721f = z4 | z2;
        }
        this.f63722g = true;
    }

    /* renamed from: e */
    public final void mo28729e(Object obj) {
        C23067b.m43233f(this.f63719d, "Field does not support silent updates.");
        mo28730f(obj, true);
    }

    /* renamed from: f */
    public final void mo28730f(Object obj, boolean z) {
        C23067b.m43233f(this.f63724i, "Field does not support writing.");
        C23067b.m43236i(obj, "Null values are not supported. Use Optional if needed.");
        this.f63720e = obj;
        mo28731g(z);
    }

    /* renamed from: g */
    public final void mo28731g(boolean z) {
        Bundle bundle = new Bundle();
        this.f63716a.mo28734c(this.f63718c, this.f63720e, bundle);
        if (this.f63719d) {
            String str = this.f63726k;
            str.getClass();
            bundle.putBoolean(str, z);
        } else {
            C23067b.m43233f(!z, "shouldSilence should only be true for silenceable.");
        }
        this.f63717b.mo28332B(bundle);
    }

    public C23251a(C23117m mVar, String str, C23274s sVar, boolean z, boolean z2, boolean z3) {
        this.f63721f = true;
        this.f63722g = true;
        this.f63717b = mVar;
        this.f63718c = str;
        this.f63716a = sVar;
        this.f63720e = sVar.mo28732a();
        this.f63724i = z;
        this.f63725j = z2;
        this.f63719d = z3;
        this.f63726k = z3 ? str.concat("_SILENT") : null;
    }
}
