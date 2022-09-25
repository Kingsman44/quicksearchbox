package com.google.android.apps.gsa.staticplugins.opa;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7066m.C90037cp;
import com.google.android.apps.gsa.shared.util.p7171i.C91042a;
import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59687cb;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.mf */
/* compiled from: PG */
public final class C109467mf {

    /* renamed from: a */
    public boolean f304911a = true;

    /* renamed from: b */
    public boolean f304912b = false;

    /* renamed from: c */
    public String f304913c;

    /* renamed from: d */
    private final C68214a f304914d;

    /* renamed from: e */
    private final C86124t f304915e;

    public C109467mf(C68214a aVar, C86124t tVar) {
        this.f304914d = aVar;
        this.f304915e = tVar;
    }

    /* renamed from: a */
    public final void mo97846a(C89849ae aeVar, boolean z) {
        String str;
        if (!this.f304915e.mo79746e(C90037cp.f248446aa) || !z || (str = this.f304913c) == null) {
            ((C89859i) this.f304914d.mo27525b()).mo83702b(aeVar);
            return;
        }
        if (this.f304915e.mo79746e(C90037cp.f248606dx)) {
            String str2 = this.f304913c;
            str2.getClass();
            str = Integer.toString(C91042a.m148717a(str2));
        }
        C59582aj ajVar = (C59582aj) C59687cb.f160034bf.createBuilder();
        str.getClass();
        ajVar.copyOnWrite();
        C59687cb cbVar = (C59687cb) ajVar.instance;
        cbVar.f160062a |= 256;
        cbVar.f160132m = str;
        C89856f fVar = new C89856f();
        fVar.f246201a = aeVar;
        fVar.f246203c = (C59687cb) ajVar.build();
        ((C89859i) this.f304914d.mo27525b()).mo74236a(fVar.mo83699a());
    }

    /* renamed from: b */
    public final void mo97847b(C89849ae aeVar) {
        if (this.f304912b) {
            mo97846a(aeVar, true);
            this.f304911a = true;
            this.f304912b = false;
        }
    }
}
