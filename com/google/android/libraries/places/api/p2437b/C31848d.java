package com.google.android.libraries.places.api.p2437b;

import com.google.android.gms.tasks.C146004a;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.TypeFilter;
import java.util.List;

/* renamed from: com.google.android.libraries.places.api.b.d */
/* compiled from: PG */
public final class C31848d extends C31857m {

    /* renamed from: a */
    public String f85482a;

    /* renamed from: b */
    public LocationBias f85483b;

    /* renamed from: c */
    public LocationRestriction f85484c;

    /* renamed from: d */
    public List f85485d;

    /* renamed from: e */
    public AutocompleteSessionToken f85486e;

    /* renamed from: f */
    public TypeFilter f85487f;

    /* renamed from: g */
    public List f85488g;

    /* renamed from: h */
    public C146004a f85489h;

    /* renamed from: a */
    public final C31858n mo37417a() {
        List list;
        List list2 = this.f85485d;
        if (list2 != null && (list = this.f85488g) != null) {
            return new C31849e(this.f85482a, this.f85483b, this.f85484c, list2, this.f85486e, this.f85487f, list, this.f85489h);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f85485d == null) {
            sb.append(" countries");
        }
        if (this.f85488g == null) {
            sb.append(" typesFilter");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final List mo37418b() {
        List list = this.f85485d;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("Property \"countries\" has not been set");
    }

    /* renamed from: c */
    public final List mo37419c() {
        List list = this.f85488g;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("Property \"typesFilter\" has not been set");
    }

    /* renamed from: d */
    public final void mo37420d(List list) {
        if (list != null) {
            this.f85485d = list;
            return;
        }
        throw new NullPointerException("Null countries");
    }

    /* renamed from: e */
    public final void mo37421e(List list) {
        if (list != null) {
            this.f85488g = list;
            return;
        }
        throw new NullPointerException("Null typesFilter");
    }
}
