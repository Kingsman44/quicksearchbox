package com.google.android.libraries.search.logging.p3034a.p3035a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.web.profile.Profile;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.search.logging.a.a.d */
/* compiled from: PG */
public final /* synthetic */ class C38732d implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C38737i f102255a;

    public /* synthetic */ C38732d(C38737i iVar) {
        this.f102255a = iVar;
    }

    public final C60870cx apply(Object obj) {
        C38737i iVar = this.f102255a;
        Profile profile = (Profile) obj;
        if (profile != null) {
            return iVar.f102269d.mo47022b(profile).mo47012a("https://www.google.com/search");
        }
        return C60856cj.m92900i(BuildConfig.FLAVOR);
    }
}
