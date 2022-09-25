package com.google.android.apps.gsa.staticplugins.p8774u.p8775a;

import com.google.android.libraries.gsa.monet.shared.C23117m;
import com.google.android.libraries.gsa.monet.shared.C23118n;
import com.google.android.libraries.gsa.monet.shared.C23120p;
import com.google.android.libraries.gsa.monet.tools.children.p1912a.C23186f;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;

/* renamed from: com.google.android.apps.gsa.staticplugins.u.a.r */
/* compiled from: PG */
final class C117482r implements C23118n {

    /* renamed from: a */
    public final String f326093a;

    /* renamed from: b */
    public final C23117m f326094b;

    /* renamed from: c */
    public C117465a f326095c;

    public C117482r(String str, C23117m mVar) {
        this.f326093a = str;
        this.f326094b = mVar;
        mVar.mo28343n(this);
    }

    /* renamed from: a */
    public final void mo28563a(C23120p pVar) {
        C117465a aVar;
        if (pVar.f63472a.containsKey(this.f326093a)) {
            if (!pVar.f63472a.getBoolean(this.f326093a) && (aVar = this.f326095c) != null) {
                C117469e eVar = aVar.f326033a;
                C117479o oVar = aVar.f326034b;
                if (((C23186f) eVar.f326041b.mo103329b()).mo28631l()) {
                    ((C23186f) eVar.f326041b.mo103329b()).mo28627h();
                }
                ((C23251a) eVar.f326041b.mo103333f()).mo28730f(false, false);
                eVar.f326044e = null;
                oVar.mo103320a();
                this.f326095c = null;
            }
        }
    }
}
