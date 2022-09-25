package com.google.android.libraries.places.api.p2437b;

import com.google.android.gms.tasks.C146004a;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import java.util.List;

/* renamed from: com.google.android.libraries.places.api.b.a */
/* compiled from: PG */
public final class C31845a extends C31854j {

    /* renamed from: a */
    public String f85473a;

    /* renamed from: b */
    public AutocompleteSessionToken f85474b;

    /* renamed from: c */
    public C146004a f85475c;

    /* renamed from: d */
    private List f85476d;

    /* renamed from: a */
    public final C31855k mo37405a() {
        List list;
        String str = this.f85473a;
        if (str != null && (list = this.f85476d) != null) {
            return new C31846b(str, list, this.f85474b, this.f85475c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f85473a == null) {
            sb.append(" placeId");
        }
        if (this.f85476d == null) {
            sb.append(" placeFields");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo37406b(List list) {
        if (list != null) {
            this.f85476d = list;
            return;
        }
        throw new NullPointerException("Null placeFields");
    }
}
