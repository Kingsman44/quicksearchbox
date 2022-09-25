package com.google.android.gms.cast.framework.media;

import com.google.android.gms.cast.C143368az;
import com.google.android.gms.cast.internal.C143567af;
import com.google.android.gms.cast.internal.C143572ak;
import com.google.android.gms.cast.internal.C143573al;
import com.google.android.gms.cast.internal.C143596v;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.cast.framework.media.ao */
/* compiled from: PG */
final class C143482ao extends C143492ay {

    /* renamed from: a */
    final /* synthetic */ C143368az f389103a;

    /* renamed from: b */
    final /* synthetic */ C143500bf f389104b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C143482ao(C143500bf bfVar, C143368az azVar) {
        super(bfVar, false);
        this.f389104b = bfVar;
        this.f389103a = azVar;
    }

    /* renamed from: h */
    public final void mo118739h() {
        C143572ak akVar = this.f389104b.f389129d;
        C143573al i = mo118755i();
        C143368az azVar = this.f389103a;
        JSONObject jSONObject = new JSONObject();
        long c = akVar.mo118916c();
        long j = azVar.f388822a;
        try {
            jSONObject.put("requestId", c);
            jSONObject.put("type", "SEEK");
            jSONObject.put("mediaSessionId", akVar.mo118893f());
            jSONObject.put("currentTime", C143596v.m233268a(j));
        } catch (JSONException unused) {
        }
        akVar.mo118917d(jSONObject.toString(), c);
        akVar.f389281h = Long.valueOf(j);
        akVar.f389287n.mo118905a(c, new C143567af(akVar, i));
    }
}
