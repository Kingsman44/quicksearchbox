package com.google.android.gms.cast.framework.media;

import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.internal.C143572ak;
import com.google.android.gms.cast.internal.C143573al;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.cast.framework.media.ac */
/* compiled from: PG */
final class C143470ac extends C143492ay {

    /* renamed from: a */
    final /* synthetic */ C143500bf f389081a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C143470ac(C143500bf bfVar) {
        super(bfVar, false);
        this.f389081a = bfVar;
    }

    /* renamed from: h */
    public final void mo118739h() {
        C143572ak akVar = this.f389081a.f389129d;
        C143573al i = mo118755i();
        JSONObject jSONObject = new JSONObject();
        long c = akVar.mo118916c();
        try {
            jSONObject.put("requestId", c);
            jSONObject.put("type", "GET_STATUS");
            MediaStatus mediaStatus = akVar.f389280g;
            if (mediaStatus != null) {
                jSONObject.put("mediaSessionId", mediaStatus.f388700b);
            }
        } catch (JSONException unused) {
        }
        akVar.mo118917d(jSONObject.toString(), c);
        akVar.f389290q.mo118905a(c, i);
    }
}
