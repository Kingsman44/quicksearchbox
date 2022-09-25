package com.google.android.apps.gsa.staticplugins.p7445bf.p7450c;

import com.google.android.apps.gsa.shared.util.p7159c.C90888av;
import com.google.android.apps.gsa.shared.util.p7159c.C90892az;
import com.google.android.apps.gsa.shared.util.p7159c.C90932cb;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bf.c.z */
/* compiled from: PG */
final class C94589z extends C90888av {

    /* renamed from: a */
    final /* synthetic */ String f264567a;

    /* renamed from: b */
    final /* synthetic */ Runnable f264568b;

    /* renamed from: c */
    final /* synthetic */ C94564ab f264569c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C94589z(C94564ab abVar, String str, String str2, Runnable runnable) {
        super(str, 1, 0);
        this.f264569c = abVar;
        this.f264567a = str2;
        this.f264568b = runnable;
    }

    public final void run() {
        C58976aa aaVar = C58975e.f156826a;
        C90932cb cbVar = this.f264569c.f264507d;
        String str = this.f264567a;
        cbVar.mo85151p(new C90892az(str.concat(":fg"), this.f264568b));
    }
}
