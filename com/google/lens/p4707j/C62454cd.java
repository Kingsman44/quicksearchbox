package com.google.lens.p4707j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.j.cd */
/* compiled from: PG */
public final class C62454cd extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C62454cd f168644f;

    /* renamed from: g */
    private static volatile C63010eb f168645g;

    /* renamed from: a */
    public int f168646a;

    /* renamed from: b */
    public C62441br f168647b;

    /* renamed from: c */
    public int f168648c;

    /* renamed from: d */
    public int f168649d;

    /* renamed from: e */
    public float f168650e;

    static {
        C62454cd cdVar = new C62454cd();
        f168644f = cdVar;
        C62942bv.registerDefaultInstance(C62454cd.class, cdVar);
    }

    private C62454cd() {
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
                return newMessageInfo(f168644f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001\u0003င\u0002\u0004ခ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C62454cd();
            case 4:
                return new C62453cc();
            case 5:
                return f168644f;
            case 6:
                C63010eb ebVar = f168645g;
                if (ebVar == null) {
                    synchronized (C62454cd.class) {
                        ebVar = f168645g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168644f);
                            f168645g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
