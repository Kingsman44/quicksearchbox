package com.google.android.libraries.places.api.model;

import java.util.List;

/* renamed from: com.google.android.libraries.places.api.model.b */
/* compiled from: PG */
public final class C31869b extends C31888u {

    /* renamed from: a */
    public String f85738a;

    /* renamed from: b */
    public Integer f85739b;

    /* renamed from: c */
    public List f85740c;

    /* renamed from: d */
    public String f85741d;

    /* renamed from: e */
    public String f85742e;

    /* renamed from: f */
    public String f85743f;

    /* renamed from: g */
    public List f85744g;

    /* renamed from: h */
    public List f85745h;

    /* renamed from: i */
    public List f85746i;

    /* renamed from: a */
    public final AutocompletePrediction mo37594a() {
        List list;
        String str;
        String str2;
        String str3;
        String str4 = this.f85738a;
        if (str4 != null && (list = this.f85740c) != null && (str = this.f85741d) != null && (str2 = this.f85742e) != null && (str3 = this.f85743f) != null) {
            return new AutoValue_AutocompletePrediction(str4, this.f85739b, list, str, str2, str3, this.f85744g, this.f85745h, this.f85746i);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f85738a == null) {
            sb.append(" placeId");
        }
        if (this.f85740c == null) {
            sb.append(" placeTypes");
        }
        if (this.f85741d == null) {
            sb.append(" fullText");
        }
        if (this.f85742e == null) {
            sb.append(" primaryText");
        }
        if (this.f85743f == null) {
            sb.append(" secondaryText");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
