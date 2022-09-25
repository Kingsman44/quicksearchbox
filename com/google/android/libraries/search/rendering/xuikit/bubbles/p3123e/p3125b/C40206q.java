package com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.p3125b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4287b.p4342b.C56943g;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.bubbles.e.b.q */
/* compiled from: PG */
public final class C40206q extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C40206q f105631f;

    /* renamed from: g */
    private static volatile C63010eb f105632g;

    /* renamed from: a */
    public int f105633a;

    /* renamed from: b */
    public C63088z f105634b = C63088z.f170246b;

    /* renamed from: c */
    public C56943g f105635c;

    /* renamed from: d */
    public C62995dn f105636d = C62995dn.f170057a;

    /* renamed from: e */
    public int f105637e;

    static {
        C40206q qVar = new C40206q();
        f105631f = qVar;
        C62942bv.registerDefaultInstance(C40206q.class, qVar);
    }

    private C40206q() {
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
                return newMessageInfo(f105631f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0001\u0000\u0000\u0001ည\u0000\u0002ဉ\u0001\u00032\u0004ဌ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d", C40205p.f105630a, "e", C40194e.f105605a});
            case 3:
                return new C40206q();
            case 4:
                return new C40204o();
            case 5:
                return f105631f;
            case 6:
                C63010eb ebVar = f105632g;
                if (ebVar == null) {
                    synchronized (C40206q.class) {
                        ebVar = f105632g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f105631f);
                            f105632g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
