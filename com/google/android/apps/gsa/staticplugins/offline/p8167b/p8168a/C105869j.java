package com.google.android.apps.gsa.staticplugins.offline.p8167b.p8168a;

import com.google.android.libraries.mdi.C28595b;
import com.google.android.libraries.mdi.C29690f;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.offline.b.a.j */
/* compiled from: PG */
public final /* synthetic */ class C105869j implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C105871l f295495a;

    public /* synthetic */ C105869j(C105871l lVar) {
        this.f295495a = lVar;
    }

    public final Object apply(Object obj) {
        C105871l lVar = this.f295495a;
        String str = null;
        String str2 = null;
        for (C28595b bVar : ((C29690f) obj).f80416g) {
            String str3 = bVar.f77799c;
            C58976aa aaVar = C58975e.f156826a;
            if (str3.contains("third_party_license_metadata")) {
                str2 = lVar.mo95122a(str3).getAbsolutePath();
            } else if (str3.contains("third_party_license")) {
                str = lVar.mo95122a(str3).getAbsolutePath();
            }
            if (str2 != null && str != null) {
                return C58833ax.m90834k(new C105860a(str2, str));
            }
        }
        return C58836b.f156633a;
    }
}
