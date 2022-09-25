package com.google.android.libraries.web.profile.p3440c;

import com.google.android.libraries.web.profile.C44070e;
import com.google.android.libraries.web.profile.C44071f;
import com.google.android.libraries.web.profile.Profile;
import com.google.common.base.C58838bb;
import java.util.Map;

/* renamed from: com.google.android.libraries.web.profile.c.a */
/* compiled from: PG */
public final class C44067a implements C44070e {

    /* renamed from: a */
    private final Map f114734a;

    public C44067a(Map map) {
        this.f114734a = map;
    }

    /* renamed from: a */
    public final C44071f mo47027a(Profile profile) {
        C44070e eVar = (C44070e) this.f114734a.get(profile.f114484b);
        C58838bb.m90867b(eVar, "No ProfileManager found for %s.", profile.f114484b);
        return eVar.mo47027a(profile);
    }
}
