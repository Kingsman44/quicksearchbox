package com.google.android.apps.gsa.staticplugins.nga.p8089t;

import com.google.android.apps.gsa.shared.p6973ad.C89085a;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.gr */
/* compiled from: PG */
public final class C104080gr implements C89085a {

    /* renamed from: a */
    public static final C58974d f289584a = C58974d.m91136j();

    /* renamed from: b */
    private final C104079gq f289585b;

    public C104080gr(C104079gq gqVar) {
        this.f289585b = gqVar;
    }

    /* renamed from: a */
    public final void mo83057a(String str) {
        ((C58970a) ((C58970a) f289584a.mo56224b()).mo56372aa(21781)).mo56389s("NGA Sync: MDD Task: %s done.", str);
        mo93941c();
    }

    /* renamed from: b */
    public final void mo83058b(String str, Throwable th) {
        ((C58970a) ((C58970a) ((C58970a) f289584a.mo56226d()).mo56382g(th)).mo56372aa(21782)).mo56389s("NGA Sync: MDD Task: %s failed.", str);
        mo93941c();
    }

    /* renamed from: c */
    public final void mo93941c() {
        ((C58970a) ((C58970a) f289584a.mo56224b()).mo56372aa(21778)).mo56359L("NGA Sync: isNgaSyncEnabled: %s; enableFileGroupPopulator: %s; requiresMddAssets: %s", Boolean.valueOf(this.f289585b.mo93939b()), Boolean.valueOf(this.f289585b.mo93938a()), Boolean.valueOf(this.f289585b.mo93940c()));
    }
}
