package com.google.android.libraries.gsa.monet.internal.shared;

import android.os.Bundle;
import com.google.android.libraries.gsa.monet.shared.C23084ao;
import com.google.android.libraries.gsa.monet.shared.C23117m;
import com.google.android.libraries.gsa.monet.shared.C23118n;
import com.google.android.libraries.gsa.monet.shared.C23120p;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.gsa.monet.internal.shared.e */
/* compiled from: PG */
public final class C23040e implements C23117m {

    /* renamed from: a */
    private final List f63384a = new ArrayList();

    /* renamed from: b */
    private final C23084ao f63385b;

    /* renamed from: c */
    private C23042g f63386c;

    public C23040e(C23084ao aoVar) {
        this.f63385b = aoVar;
    }

    /* renamed from: B */
    public final void mo28332B(Bundle bundle) {
        this.f63385b.mo28328a();
        C23042g gVar = this.f63386c;
        gVar.getClass();
        gVar.mo28476l(bundle);
    }

    /* renamed from: a */
    public final void mo28462a(Bundle bundle) {
        this.f63385b.mo28328a();
        this.f63386c.getClass();
        C23120p pVar = new C23120p(bundle);
        C23088b bVar = new C23088b(this.f63384a);
        int size = bVar.size();
        for (int i = 0; i < size; i++) {
            ((C23118n) bVar.get(i)).mo28563a(pVar);
        }
    }

    /* renamed from: b */
    public final void mo28463b(C23042g gVar) {
        this.f63386c = gVar;
        if (gVar != null) {
            mo28462a(gVar.f63390c);
        }
    }

    /* renamed from: e */
    public final C23120p mo28336e() {
        this.f63385b.mo28328a();
        C23042g gVar = this.f63386c;
        if (gVar != null) {
            return new C23120p(gVar.f63390c);
        }
        return new C23120p(new Bundle());
    }

    /* renamed from: n */
    public final void mo28343n(C23118n nVar) {
        this.f63385b.mo28328a();
        if (!this.f63384a.contains(nVar)) {
            this.f63384a.add(nVar);
        }
    }
}
