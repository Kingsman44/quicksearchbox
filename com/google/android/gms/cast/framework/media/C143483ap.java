package com.google.android.gms.cast.framework.media;

import com.google.android.gms.cast.internal.C143570ai;
import com.google.android.gms.cast.internal.C143572ak;
import com.google.android.gms.cast.internal.C143573al;
import com.google.android.gms.common.internal.C143919bh;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.cast.framework.media.ap */
/* compiled from: PG */
final class C143483ap extends C143492ay {

    /* renamed from: a */
    final /* synthetic */ double f389105a;

    /* renamed from: b */
    final /* synthetic */ C143500bf f389106b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C143483ap(C143500bf bfVar, double d) {
        super(bfVar, false);
        this.f389106b = bfVar;
        this.f389105a = d;
    }

    /* renamed from: h */
    public final void mo118739h() {
        C143572ak akVar = this.f389106b.f389129d;
        C143573al i = mo118755i();
        double d = this.f389105a;
        if (akVar.f389280g != null) {
            JSONObject jSONObject = new JSONObject();
            long c = akVar.mo118916c();
            try {
                jSONObject.put("requestId", c);
                jSONObject.put("type", "SET_PLAYBACK_RATE");
                jSONObject.put("playbackRate", d);
                C143919bh.m233971n(akVar.f389280g, "mediaStatus should not be null");
                jSONObject.put("mediaSessionId", akVar.f389280g.f388700b);
            } catch (JSONException unused) {
            }
            akVar.mo118917d(jSONObject.toString(), c);
            akVar.f389274A.mo118905a(c, i);
            return;
        }
        throw new C143570ai();
    }
}
