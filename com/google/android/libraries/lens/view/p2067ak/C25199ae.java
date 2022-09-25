package com.google.android.libraries.lens.view.p2067ak;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p3723ar.imp.view.C48004n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.view.ak.ae */
/* compiled from: PG */
public final class C25199ae extends C62942bv implements C63001dt {

    /* renamed from: o */
    public static final C25199ae f68626o;

    /* renamed from: p */
    private static volatile C63010eb f68627p;

    /* renamed from: a */
    public boolean f68628a;

    /* renamed from: b */
    public C25262cn f68629b;

    /* renamed from: c */
    public C25258cj f68630c;

    /* renamed from: d */
    public C25274m f68631d;

    /* renamed from: e */
    public C25231bj f68632e;

    /* renamed from: f */
    public C25264cp f68633f;

    /* renamed from: g */
    public C25244bw f68634g;

    /* renamed from: h */
    public C25246by f68635h;

    /* renamed from: i */
    public C25267f f68636i;

    /* renamed from: j */
    public C25249ca f68637j;

    /* renamed from: k */
    public C25277p f68638k;

    /* renamed from: l */
    public C25233bl f68639l;

    /* renamed from: m */
    public C25271j f68640m;

    /* renamed from: n */
    public C25282u f68641n;

    static {
        C25199ae aeVar = new C25199ae();
        f68626o = aeVar;
        C62942bv.registerDefaultInstance(C25199ae.class, aeVar);
    }

    private C25199ae() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f68626o, "\u0000\u000e\u0000\u0000\u0001\u0014\u000e\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t\u0004\t\u0005\t\u0006\t\b\t\t\t\n\t\u000b\t\f\t\u0011\u0007\u0012\t\u0014\t", new Object[]{"b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a, "l", "a", "m", C48004n.f124238a});
            case 3:
                return new C25199ae();
            case 4:
                return new C25198ad();
            case 5:
                return f68626o;
            case 6:
                C63010eb ebVar = f68627p;
                if (ebVar == null) {
                    synchronized (C25199ae.class) {
                        ebVar = f68627p;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f68626o);
                            f68627p = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
