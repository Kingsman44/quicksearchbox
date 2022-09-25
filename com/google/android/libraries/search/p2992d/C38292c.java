package com.google.android.libraries.search.p2992d;

import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.frameworks.client.data.android.p4632a.C61346g;

/* renamed from: com.google.android.libraries.search.d.c */
/* compiled from: PG */
public final /* synthetic */ class C38292c implements C60931s {

    /* renamed from: a */
    public static final /* synthetic */ C38292c f101446a = new C38292c();

    private /* synthetic */ C38292c() {
    }

    public final C60870cx apply(Object obj) {
        C61346g gVar = (C61346g) obj;
        if (!(gVar instanceof C61346g) || !(gVar.getCause() instanceof UserRecoverableAuthException)) {
            ((C59052c) ((C59052c) ((C59052c) C38296g.f101458a.mo56226d()).mo56382g(gVar)).mo56372aa(53084)).mo56386p("Can't get auth token.");
            return C60856cj.m92900i(C58836b.f156633a);
        }
        throw gVar;
    }
}
