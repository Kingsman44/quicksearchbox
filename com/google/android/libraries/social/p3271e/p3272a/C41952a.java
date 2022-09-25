package com.google.android.libraries.social.p3271e.p3272a;

import com.google.android.libraries.p1623at.p1632e.C19555c;
import com.google.android.libraries.social.p3260a.p3265d.C41908a;
import com.google.android.libraries.social.p3260a.p3265d.C41911d;
import java.util.Locale;

/* renamed from: com.google.android.libraries.social.e.a.a */
/* compiled from: PG */
public final class C41952a extends C41908a {

    /* renamed from: b */
    public Integer f109502b;

    public C41952a(C41911d dVar) {
        super(dVar);
    }

    public final boolean equals(Object obj) {
        if (!super.equals(obj) || !C19555c.m37297b(this.f109502b, ((C41952a) obj).f109502b) || !C19555c.m37297b((Object) null, (Object) null) || !C19555c.m37297b((Object) null, (Object) null)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C19555c.m37296a(this.f109502b, C19555c.m37296a((Object) null, C19555c.m37296a((Object) null, super.hashCode())));
    }

    public final String toString() {
        return String.format(Locale.US, "SendKitVisualElement {tag: %s, index: %d, intent class name: %s, first in flow: %b}", new Object[]{this.f109313a, this.f109502b, null, null});
    }
}
