package com.google.android.libraries.places.api.model;

import java.util.List;

/* renamed from: com.google.android.libraries.places.api.model.c */
/* compiled from: PG */
public final class C31870c extends C31890w {

    /* renamed from: a */
    public List f85747a;

    /* renamed from: b */
    public List f85748b;

    /* renamed from: a */
    public final OpeningHours mo37595a() {
        List list;
        List list2 = this.f85747a;
        if (list2 != null && (list = this.f85748b) != null) {
            return new AutoValue_OpeningHours(list2, list);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f85747a == null) {
            sb.append(" periods");
        }
        if (this.f85748b == null) {
            sb.append(" weekdayText");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
