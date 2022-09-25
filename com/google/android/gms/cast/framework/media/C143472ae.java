package com.google.android.gms.cast.framework.media;

import com.google.android.gms.cast.internal.C143569ah;
import com.google.android.gms.cast.internal.C143572ak;
import com.google.android.gms.cast.internal.C143573al;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.cast.framework.media.ae */
/* compiled from: PG */
public final class C143472ae extends C143492ay {

    /* renamed from: a */
    final /* synthetic */ int[] f389088a;

    /* renamed from: b */
    final /* synthetic */ C143500bf f389089b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C143472ae(C143500bf bfVar, int[] iArr) {
        super(bfVar, false);
        this.f389089b = bfVar;
        this.f389088a = iArr;
    }

    /* renamed from: h */
    public final void mo118739h() {
        C143572ak akVar = this.f389089b.f389129d;
        C143573al i = mo118755i();
        int[] iArr = this.f389088a;
        if (iArr == null || iArr.length == 0) {
            throw new IllegalArgumentException("itemIdsToRemove must not be null or empty.");
        }
        JSONObject jSONObject = new JSONObject();
        long c = akVar.mo118916c();
        try {
            jSONObject.put("requestId", c);
            jSONObject.put("type", "QUEUE_REMOVE");
            jSONObject.put("mediaSessionId", akVar.mo118893f());
            JSONArray jSONArray = new JSONArray();
            for (int i2 = 0; i2 < iArr.length; i2++) {
                jSONArray.put(i2, iArr[i2]);
            }
            jSONObject.put("itemIds", jSONArray);
            if (akVar.mo118902p()) {
                jSONObject.put("sequenceNumber", akVar.f389282i);
            }
        } catch (JSONException unused) {
        }
        akVar.mo118917d(jSONObject.toString(), c);
        akVar.f389295v.mo118905a(c, new C143569ah(akVar, i));
    }
}
