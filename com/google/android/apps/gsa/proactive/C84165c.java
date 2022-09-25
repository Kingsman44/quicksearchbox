package com.google.android.apps.gsa.proactive;

import android.net.Uri;
import com.google.common.base.C58825ap;
import com.google.common.base.C58827ar;
import com.google.p375ai.p378b.C7669fo;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7746ik;
import com.google.p375ai.p378b.C7874nd;
import java.util.Arrays;

/* renamed from: com.google.android.apps.gsa.proactive.c */
/* compiled from: PG */
public final class C84165c {

    /* renamed from: c */
    private static final C58827ar f229112c = C58827ar.m90818c('/');

    /* renamed from: a */
    public final C7874nd f229113a;

    /* renamed from: b */
    public final C7718hj f229114b;

    public C84165c(C7874nd ndVar, C7718hj hjVar) {
        this.f229113a = ndVar;
        this.f229114b = hjVar;
    }

    /* renamed from: b */
    public static Uri m134178b(C7669fo foVar) {
        C58827ar arVar = f229112c;
        String str = foVar.f26636b;
        return Uri.parse(arVar.mo56097d(new C58825ap(new Object[]{Long.valueOf(foVar.f26638d)}, str, 'n')));
    }

    /* renamed from: a */
    public final Uri mo77615a() {
        C7874nd ndVar = this.f229113a;
        C7718hj hjVar = this.f229114b;
        if ((ndVar.f27589a & 8388608) != 0) {
            C7669fo foVar = ndVar.f27612x;
            if (foVar == null) {
                foVar = C7669fo.f26633e;
            }
            return m134178b(foVar);
        }
        C58827ar arVar = f229112c;
        String str = hjVar.f26947S;
        Object[] objArr = new Object[2];
        C7746ik a = C7746ik.m22834a(hjVar.f26966g);
        if (a == null) {
            a = C7746ik.UNKNOWN;
        }
        objArr[0] = Integer.valueOf(a.f27108J);
        objArr[1] = Long.valueOf(hjVar.f26969j);
        return Uri.parse(arVar.mo56097d(new C58825ap(objArr, str, 'n')));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C84165c)) {
            return false;
        }
        C84165c cVar = (C84165c) obj;
        if (((this.f229114b == null) ^ (cVar.f229114b == null)) || !this.f229113a.equals(cVar.f229113a)) {
            return false;
        }
        C7718hj hjVar = this.f229114b;
        if (hjVar == null || hjVar.equals(cVar.f229114b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = {this.f229113a.hashCode(), 0};
        C7718hj hjVar = this.f229114b;
        if (hjVar != null) {
            iArr[1] = hjVar.hashCode();
        }
        return Arrays.hashCode(iArr);
    }
}
