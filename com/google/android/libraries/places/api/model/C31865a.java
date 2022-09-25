package com.google.android.libraries.places.api.model;

import java.util.List;

/* renamed from: com.google.android.libraries.places.api.model.a */
/* compiled from: PG */
public final class C31865a extends C31873f {

    /* renamed from: a */
    public String f85735a;

    /* renamed from: b */
    public String f85736b;

    /* renamed from: c */
    public List f85737c;

    /* renamed from: a */
    public final AddressComponent mo37587a() {
        List list;
        String str = this.f85735a;
        if (str != null && (list = this.f85737c) != null) {
            return new AutoValue_AddressComponent(str, this.f85736b, list);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f85735a == null) {
            sb.append(" name");
        }
        if (this.f85737c == null) {
            sb.append(" types");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
