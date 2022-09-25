package com.google.android.gms.cast.framework.media;

import com.google.android.gms.cast.internal.C143572ak;
import com.google.android.gms.cast.internal.C143573al;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.cast.framework.media.ak */
/* compiled from: PG */
final class C143478ak extends C143492ay {

    /* renamed from: a */
    final /* synthetic */ int[] f389098a;

    /* renamed from: b */
    final /* synthetic */ C143500bf f389099b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C143478ak(C143500bf bfVar, int[] iArr) {
        super(bfVar, true);
        this.f389099b = bfVar;
        this.f389098a = iArr;
    }

    /* renamed from: h */
    public final void mo118739h() {
        C143572ak akVar = this.f389099b.f389129d;
        C143573al i = mo118755i();
        int[] iArr = this.f389098a;
        JSONObject jSONObject = new JSONObject();
        long c = akVar.mo118916c();
        try {
            jSONObject.put("requestId", c);
            jSONObject.put("type", "QUEUE_GET_ITEMS");
            jSONObject.put("mediaSessionId", akVar.mo118893f());
            JSONArray jSONArray = new JSONArray();
            for (int put : iArr) {
                jSONArray.put(put);
            }
            jSONObject.put("itemIds", jSONArray);
        } catch (JSONException unused) {
        }
        akVar.mo118917d(jSONObject.toString(), c);
        akVar.f389298y.mo118905a(c, i);
    }
}
