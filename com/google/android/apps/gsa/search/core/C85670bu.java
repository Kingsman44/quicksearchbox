package com.google.android.apps.gsa.search.core;

import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.shared.util.p7159c.C90945k;

/* renamed from: com.google.android.apps.gsa.search.core.bu */
/* compiled from: PG */
final class C85670bu extends C90945k {

    /* renamed from: a */
    final /* synthetic */ C85671bv f231596a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C85670bu(C85671bv bvVar) {
        super("PersonShortcutSettingsTask", bvVar.f231598b, 2, 0);
        this.f231596a = bvVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo77936a(Object[] objArr) {
        C86337q b = this.f231596a.f231599c.mo80076b();
        b.mo80068c("person_shortcut_info", ((C85668bs[]) objArr)[0].toByteArray());
        b.apply();
        return null;
    }
}
