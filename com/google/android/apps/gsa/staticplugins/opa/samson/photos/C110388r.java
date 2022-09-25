package com.google.android.apps.gsa.staticplugins.opa.samson.photos;

import android.net.Uri;
import com.google.android.apps.gsa.shared.p6968aa.C89009ag;
import com.google.android.apps.gsa.shared.p6968aa.C89018ap;
import com.google.android.apps.gsa.shared.p6968aa.C89019aq;
import com.google.android.apps.gsa.shared.p6968aa.C89020ar;
import com.google.android.apps.gsa.shared.p6968aa.C89066v;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.photos.r */
/* compiled from: PG */
public final /* synthetic */ class C110388r implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C110318ad f307663a;

    /* renamed from: b */
    public final /* synthetic */ Uri f307664b;

    public /* synthetic */ C110388r(C110318ad adVar, Uri uri) {
        this.f307663a = adVar;
        this.f307664b = uri;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C110318ad adVar = this.f307663a;
        Uri uri = this.f307664b;
        C58976aa aaVar = C58975e.f156826a;
        C89356b a = adVar.f307483j.mo78025a("photos request", 131, 200);
        C89019aq c = C89020ar.m144758c();
        c.mo82994f(uri.toString());
        c.f241245k = 68;
        c.mo82991c((Map) obj);
        return adVar.f307481h.mo80852a(a, C89066v.f241382a, new C89018ap(c.mo82989a(), C89009ag.f241207b));
    }
}
