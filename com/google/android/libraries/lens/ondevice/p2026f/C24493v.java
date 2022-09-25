package com.google.android.libraries.lens.ondevice.p2026f;

import com.google.android.libraries.lens.ondevice.p2018b.p2019a.C24270b;
import com.google.android.libraries.lens.ondevice.p2032i.C24530h;
import com.google.android.libraries.lens.ondevice.p2037n.C24805p;
import com.google.android.libraries.lens.ondevice.p2037n.C24808s;
import com.google.android.libraries.lens.p1994b.C24067a;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;

/* renamed from: com.google.android.libraries.lens.ondevice.f.v */
/* compiled from: PG */
public final class C24493v {

    /* renamed from: b */
    private static final C58974d f67021b = C58974d.m91135i("NativeLibLoader");

    /* renamed from: a */
    public final C24067a f67022a;

    /* renamed from: c */
    private final C24530h f67023c;

    public C24493v(C24067a aVar, C24530h hVar) {
        this.f67022a = aVar;
        this.f67023c = hVar;
    }

    /* renamed from: a */
    public final void mo29923a() {
        if (mo29924b()) {
            this.f67023c.mo29947f(C24805p.FEATURE_SPLIT_MODULE_AVAILABLE, (C24808s) null);
            this.f67023c.mo29947f(C24805p.DYNAMIC_LOADING_START, (C24808s) null);
            try {
                this.f67022a.mo29461d();
                this.f67023c.mo29947f(C24805p.DYNAMIC_LOADING_SUCCESS, (C24808s) null);
            } catch (UnsatisfiedLinkError e) {
                this.f67023c.mo29947f(C24805p.DYNAMIC_LOADING_ERROR, (C24808s) null);
                ((C58970a) ((C58970a) ((C58970a) f67021b.mo56225c()).mo56382g(e)).mo56372aa(48797)).mo56386p("Failed to load native library.");
            }
        } else {
            this.f67022a.mo29462e();
            this.f67023c.mo29947f(C24805p.FEATURE_SPLIT_INSTALL_REQUESTED, (C24808s) null);
            throw new C24270b();
        }
    }

    /* renamed from: b */
    public final boolean mo29924b() {
        return this.f67022a.mo29460c();
    }
}
