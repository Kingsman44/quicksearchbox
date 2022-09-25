package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.p9413a.p9414a;

import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.frameworks.client.data.android.p4632a.C61346g;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.a.a.h */
/* compiled from: PG */
public final /* synthetic */ class C124794h implements C60931s {

    /* renamed from: a */
    public static final /* synthetic */ C124794h f344302a = new C124794h();

    private /* synthetic */ C124794h() {
    }

    public final C60870cx apply(Object obj) {
        C61346g gVar = (C61346g) obj;
        if (!(gVar instanceof C61346g) || !(gVar.getCause() instanceof UserRecoverableAuthException)) {
            ((C59052c) ((C59052c) ((C59052c) C124797k.f344308a.mo56226d()).mo56382g(gVar)).mo56372aa(36361)).mo56386p("Can't get auth token.");
            return C60856cj.m92900i(Optional.empty());
        }
        throw ((UserRecoverableAuthException) gVar.getCause());
    }
}
