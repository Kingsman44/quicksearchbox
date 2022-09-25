package com.google.android.libraries.social.p3260a.p3265d;

import java.io.Serializable;
import java.util.Locale;

/* renamed from: com.google.android.libraries.social.a.d.a */
/* compiled from: PG */
public class C41908a implements Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: a */
    public final C41911d f109313a;

    public C41908a(C41911d dVar) {
        this.f109313a = dVar;
    }

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f109313a.equals(((C41908a) obj).f109313a);
    }

    public int hashCode() {
        return this.f109313a.f109315a + 1054;
    }

    public String toString() {
        return String.format(Locale.US, "VisualElement {tag: %s}", new Object[]{this.f109313a});
    }
}
