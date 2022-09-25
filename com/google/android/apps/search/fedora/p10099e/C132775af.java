package com.google.android.apps.search.fedora.p10099e;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.fedora.e.af */
/* compiled from: PG */
public final class C132775af extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C132775af f362231g;

    /* renamed from: h */
    private static volatile C63010eb f362232h;

    /* renamed from: a */
    public int f362233a;

    /* renamed from: b */
    public boolean f362234b;

    /* renamed from: c */
    public long f362235c;

    /* renamed from: d */
    public boolean f362236d;

    /* renamed from: e */
    public boolean f362237e;

    /* renamed from: f */
    public boolean f362238f;

    static {
        C132775af afVar = new C132775af();
        f362231g = afVar;
        C62942bv.registerDefaultInstance(C132775af.class, afVar);
    }

    private C132775af() {
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
                return newMessageInfo(f362231g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဂ\u0001\u0003ဇ\u0002\u0004ဇ\u0004\u0005ဇ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", C10662f.f35572a, "e"});
            case 3:
                return new C132775af();
            case 4:
                return new C132774ae();
            case 5:
                return f362231g;
            case 6:
                C63010eb ebVar = f362232h;
                if (ebVar == null) {
                    synchronized (C132775af.class) {
                        ebVar = f362232h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f362231g);
                            f362232h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
