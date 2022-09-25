package com.google.android.libraries.gsa.monet.tools.model.shared.types;

import android.os.Bundle;
import com.google.android.libraries.gsa.monet.shared.C23120p;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.libraries.gsa.monet.tools.model.shared.types.m */
/* compiled from: PG */
public final class C23268m implements C23274s {

    /* renamed from: a */
    private final C23260e f63740a;

    public C23268m(C23260e eVar) {
        this.f63740a = eVar;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo28732a() {
        return C58836b.f156633a;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ boolean mo28735d(Object obj, Object obj2) {
        C58833ax axVar = (C58833ax) obj;
        C58833ax axVar2 = (C58833ax) obj2;
        if (axVar.mo56113h() != axVar2.mo56113h()) {
            return false;
        }
        if (axVar.mo56113h() || axVar2.mo56113h()) {
            return this.f63740a.mo28735d(axVar.mo56107c(), axVar2.mo56107c());
        }
        return true;
    }

    /* renamed from: e */
    public final C58833ax mo28733b(String str, C23120p pVar) {
        if (!pVar.f63472a.getBoolean(str.concat("_PRESENT"))) {
            return C58836b.f156633a;
        }
        Object b = this.f63740a.mo28733b(str, pVar);
        b.getClass();
        return C58833ax.m90834k(b);
    }

    /* renamed from: f */
    public final void mo28734c(String str, C58833ax axVar, Bundle bundle) {
        if (axVar.mo56113h()) {
            bundle.putBoolean(str.concat("_PRESENT"), true);
            this.f63740a.mo28734c(str, axVar.mo56107c(), bundle);
            return;
        }
        bundle.putBoolean(str.concat("_PRESENT"), false);
        bundle.putBoolean(str, false);
    }
}
