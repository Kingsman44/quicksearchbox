package com.google.android.gms.cast.framework.media;

import com.google.android.gms.cast.internal.C143572ak;
import com.google.android.gms.cast.internal.C143573al;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.cast.framework.media.am */
/* compiled from: PG */
public final class C143480am extends C143492ay {

    /* renamed from: a */
    final /* synthetic */ C143500bf f389101a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C143480am(C143500bf bfVar) {
        super(bfVar, false);
        this.f389101a = bfVar;
    }

    /* renamed from: h */
    public final void mo118739h() {
        C143572ak akVar = this.f389101a.f389129d;
        C143573al i = mo118755i();
        JSONObject jSONObject = new JSONObject();
        long c = akVar.mo118916c();
        try {
            jSONObject.put("requestId", c);
            jSONObject.put("type", "STOP");
            jSONObject.put("mediaSessionId", akVar.mo118893f());
        } catch (JSONException unused) {
        }
        akVar.mo118917d(jSONObject.toString(), c);
        akVar.f389286m.mo118905a(c, i);
    }
}
