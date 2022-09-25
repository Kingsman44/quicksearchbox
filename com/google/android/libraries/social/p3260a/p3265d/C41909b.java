package com.google.android.libraries.social.p3260a.p3265d;

import com.google.android.libraries.p1623at.p1632e.C19555c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.social.a.d.b */
/* compiled from: PG */
public final class C41909b implements Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: a */
    public final List f109314a = new ArrayList();

    /* renamed from: a */
    public final void mo44369a(C41908a aVar) {
        aVar.getClass();
        this.f109314a.add(aVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C41909b)) {
            return false;
        }
        return C19555c.m37297b(((C41909b) obj).f109314a, this.f109314a);
    }

    public final int hashCode() {
        return this.f109314a.hashCode();
    }

    public final String toString() {
        return C41912e.m73437a(this.f109314a);
    }
}
