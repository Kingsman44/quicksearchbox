package com.google.android.gms.cast;

import java.util.List;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.cast.ao */
/* compiled from: PG */
public final class C143357ao {

    /* renamed from: a */
    public int f388801a = -1;

    /* renamed from: b */
    public String f388802b;

    /* renamed from: c */
    public MediaMetadata f388803c;

    /* renamed from: d */
    public String f388804d;

    /* renamed from: e */
    private String f388805e;

    /* renamed from: f */
    private String f388806f;

    public C143357ao() {
    }

    public C143357ao(String str) {
        this.f388805e = str;
    }

    /* renamed from: a */
    public final MediaInfo mo118504a() {
        return new MediaInfo(this.f388805e, this.f388801a, this.f388802b, this.f388803c, -1, (List) null, (TextTrackStyle) null, this.f388806f, (List) null, (List) null, (String) null, (VastAdsRequest) null, -1, (String) null, this.f388804d, (String) null, (String) null);
    }

    /* renamed from: b */
    public final void mo118505b(JSONObject jSONObject) {
        this.f388806f = jSONObject == null ? null : jSONObject.toString();
    }
}
