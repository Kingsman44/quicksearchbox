package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6375d.p6376a;

import android.content.Context;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6371a.C81519a;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6375d.C81553a;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6386j.C81810c;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6386j.C81819l;
import com.google.android.apps.gsa.nga.shared.p6369ui.p6405b.C82193a;
import com.google.android.apps.gsa.nga.shared.p6417x.C83357g;
import com.google.android.apps.gsa.nga.shared.p6417x.C83358h;
import com.google.android.apps.gsa.nga.shared.p6417x.C83361k;
import com.google.android.apps.gsa.nga.shared.p6417x.C83363m;
import com.google.android.apps.gsa.shared.p7066m.C90110fh;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.d.a.c */
/* compiled from: PG */
public final class C81556c implements C81810c, C81553a {

    /* renamed from: b */
    private static final C59071e f223091b = C59071e.m91332i("com.google.android.apps.gsa.nga.shared.ui.assistlayer.d.a.c");

    /* renamed from: a */
    public final C83357g f223092a = new C83361k(false, C81519a.class);

    /* renamed from: c */
    private final Context f223093c;

    /* renamed from: d */
    private final C91142g f223094d;

    /* renamed from: e */
    private final C83363m f223095e = new C83363m();

    /* renamed from: f */
    private final C81819l f223096f;

    public C81556c(Context context, C81819l lVar, C91142g gVar) {
        this.f223093c = context;
        this.f223094d = gVar;
        this.f223096f = lVar;
    }

    /* renamed from: a */
    public final C83358h mo75136a() {
        return this.f223092a;
    }

    /* renamed from: b */
    public final boolean mo75137b() {
        if (this.f223094d.mo85405j(C90110fh.f250632ad)) {
            boolean a = C82193a.m130503a(this.f223093c);
            ((C59052c) ((C59052c) f223091b.mo56224b()).mo56372aa(6149)).mo56389s("Dark mode updated to %b", Boolean.valueOf(a));
            return a;
        }
        ((C59052c) ((C59052c) f223091b.mo56224b()).mo56372aa(6148)).mo56386p("Dark mode disabled by flag.");
        return false;
    }

    /* renamed from: d */
    public final void mo75129d() {
        this.f223095e.mo76663c(this.f223096f.mo75150c(), new C81554a(this));
        this.f223095e.mo76663c(this.f223096f.mo75151d(), new C81555b(this));
    }

    /* renamed from: e */
    public final void mo75130e() {
        this.f223095e.mo76661a();
    }
}
