package com.google.android.libraries.notifications.platform.p2310d;

import java.util.Map;

/* renamed from: com.google.android.libraries.notifications.platform.d.d */
/* compiled from: PG */
public final class C30081d extends C30087j {

    /* renamed from: a */
    public Integer f81406a;

    /* renamed from: b */
    public Map f81407b;

    /* renamed from: c */
    public byte[] f81408c;

    /* renamed from: d */
    public Exception f81409d;

    /* renamed from: f */
    private byte[] f81410f;

    /* renamed from: a */
    public final C30088k mo35470a() {
        Map map = this.f81407b;
        if (map != null) {
            return new C30082e(this.f81406a, map, this.f81408c, this.f81410f, this.f81409d);
        }
        throw new IllegalStateException("Missing required properties: headers");
    }

    /* renamed from: b */
    public final Map mo35471b() {
        Map map = this.f81407b;
        if (map != null) {
            return map;
        }
        throw new IllegalStateException("Property \"headers\" has not been set");
    }

    /* renamed from: c */
    public final byte[] mo35472c() {
        return this.f81408c;
    }

    /* renamed from: d */
    public final void mo35473d(byte[] bArr) {
        this.f81410f = bArr;
    }

    /* renamed from: e */
    public final void mo35474e(Exception exc) {
        this.f81409d = exc;
    }
}
