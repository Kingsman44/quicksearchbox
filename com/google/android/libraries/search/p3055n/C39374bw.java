package com.google.android.libraries.search.p3055n;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.speech.p5218j.C66964g;

/* renamed from: com.google.android.libraries.search.n.bw */
/* compiled from: PG */
public final class C39374bw extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C39374bw f103686d;

    /* renamed from: e */
    public static final C62940bt f103687e;

    /* renamed from: f */
    private static volatile C63010eb f103688f;

    /* renamed from: a */
    public int f103689a;

    /* renamed from: b */
    public C39276az f103690b;

    /* renamed from: c */
    public int f103691c;

    static {
        C39374bw bwVar = new C39374bw();
        f103686d = bwVar;
        C62942bv.registerDefaultInstance(C39374bw.class, bwVar);
        f103687e = C62942bv.newSingularGeneratedExtension(C39670cx.f104424a, bwVar, bwVar, (C62958ce) null, 413019260, C63066gd.MESSAGE, C39374bw.class);
    }

    private C39374bw() {
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
                return newMessageInfo(f103686d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C45240c.f118157a, C66964g.m97397b()});
            case 3:
                return new C39374bw();
            case 4:
                return new C39373bv();
            case 5:
                return f103686d;
            case 6:
                C63010eb ebVar = f103688f;
                if (ebVar == null) {
                    synchronized (C39374bw.class) {
                        ebVar = f103688f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f103686d);
                            f103688f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
