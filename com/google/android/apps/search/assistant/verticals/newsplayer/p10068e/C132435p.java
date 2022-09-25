package com.google.android.apps.search.assistant.verticals.newsplayer.p10068e;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.search.assistant.verticals.newsplayer.e.p */
/* compiled from: PG */
final class C132435p implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C132441v f361457a;

    public C132435p(C132441v vVar) {
        this.f361457a = vVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C132441v.f361464a.mo56226d()).mo56382g(th)).mo56372aa(39646)).mo56386p("NewsPlayer failed to fetch playback speed");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Float f = (Float) obj;
        float floatValue = f.floatValue();
        C59071e eVar = C132441v.f361464a;
        if (floatValue > 0.0f && floatValue <= 2.0f && floatValue % 0.25f == 0.0f) {
            this.f361457a.mo110708j(f.floatValue());
        }
    }
}
