package com.google.android.apps.search.assistant.verticals.newsplayer.p10068e;

import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.framework.media.C143484aq;
import com.google.android.gms.cast.framework.media.C143500bf;
import com.google.common.p4526f.C59052c;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.apps.search.assistant.verticals.newsplayer.e.r */
/* compiled from: PG */
final class C132437r extends C143484aq {

    /* renamed from: a */
    final /* synthetic */ C143500bf f361460a;

    /* renamed from: b */
    final /* synthetic */ C132441v f361461b;

    public C132437r(C132441v vVar, C143500bf bfVar) {
        this.f361461b = vVar;
        this.f361460a = bfVar;
    }

    /* renamed from: p */
    public final void mo6047p() {
        MediaInfo f;
        if (this.f361461b.f361475j && (f = this.f361460a.mo118778f()) != null && f.f388651r != null && this.f361460a.mo118779g() != null) {
            this.f361461b.f361480o = this.f361460a.mo118775c() == 3 ? 1 : 2;
            try {
                C132441v vVar = this.f361461b;
                JSONObject jSONObject = f.f388651r;
                jSONObject.getClass();
                vVar.mo110729x(jSONObject.getInt("periodIndex"));
            } catch (JSONException e) {
                ((C59052c) ((C59052c) ((C59052c) C132441v.f361464a.mo56226d()).mo56382g(e)).mo56372aa(39647)).mo56386p("NewsPlayer failed to update unifiedPeriodIndex from RMC.");
            }
        }
    }
}
