package com.google.android.libraries.gsa.monet.tools.model.shared.types;

import android.os.Bundle;
import com.google.android.libraries.gsa.monet.shared.C23120p;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23093g;

/* renamed from: com.google.android.libraries.gsa.monet.tools.model.shared.types.l */
/* compiled from: PG */
public final class C23267l implements C23274s {

    /* renamed from: a */
    private final C23260e f63739a;

    public C23267l(C23260e eVar) {
        this.f63739a = eVar;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo28732a() {
        return C23093g.f63435a;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo28733b(String str, C23120p pVar) {
        if (!pVar.f63472a.getBoolean(str.concat("_PRESENT"))) {
            return C23093g.f63435a;
        }
        String string = pVar.f63472a.getString(str);
        string.getClass();
        return new C23093g(string);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo28734c(String str, Object obj, Bundle bundle) {
        C23093g gVar = (C23093g) obj;
        if (gVar.mo28554c()) {
            bundle.putBoolean(str.concat("_PRESENT"), true);
            bundle.putString(str, (String) gVar.mo28552a());
            return;
        }
        bundle.putBoolean(str.concat("_PRESENT"), false);
        bundle.putBoolean(str, false);
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ boolean mo28735d(Object obj, Object obj2) {
        C23093g gVar = (C23093g) obj;
        C23093g gVar2 = (C23093g) obj2;
        if (gVar.mo28554c() != gVar2.mo28554c()) {
            return false;
        }
        if (gVar.mo28554c() || gVar2.mo28554c()) {
            return this.f63739a.mo28735d(gVar.mo28552a(), gVar2.mo28552a());
        }
        return true;
    }
}
