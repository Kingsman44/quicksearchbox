package com.google.android.libraries.web.contrib.p3384g.p3385a;

import com.google.android.libraries.web.contrib.p3384g.C43561a;
import com.google.android.libraries.web.contrib.p3384g.C43581b;
import com.google.android.libraries.web.profile.Profile;
import com.google.common.base.C58838bb;
import java.util.Map;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.web.contrib.g.a.b */
/* compiled from: PG */
public final /* synthetic */ class C43574b implements C43561a {

    /* renamed from: a */
    public final /* synthetic */ Map f113762a;

    public /* synthetic */ C43574b(Map map) {
        this.f113762a = map;
    }

    /* renamed from: a */
    public final C43581b mo46624a(Profile profile) {
        C69464a aVar = (C69464a) this.f113762a.get(profile.f114484b);
        C58838bb.m90867b(aVar, "No ProfilePrewarmer exists for %s, make sure you injected the associated module.", profile.f114484b);
        return ((C43561a) aVar.mo17428b()).mo46624a(profile);
    }
}
