package com.google.p4242bp.p4257f.p4260b.p4261a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bp.f.b.a.v */
/* compiled from: PG */
public final class C56324v extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C56324v f150122c;

    /* renamed from: d */
    private static volatile C63010eb f150123d;

    /* renamed from: a */
    public int f150124a;

    /* renamed from: b */
    public int f150125b = 1;

    static {
        C56324v vVar = new C56324v();
        f150122c = vVar;
        C62942bv.registerDefaultInstance(C56324v.class, vVar);
    }

    private C56324v() {
        emptyLongList();
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
                return newMessageInfo(f150122c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဌ\u0000", new Object[]{"a", "b", C56323u.m87969b()});
            case 3:
                return new C56324v();
            case 4:
                return new C56321s();
            case 5:
                return f150122c;
            case 6:
                C63010eb ebVar = f150123d;
                if (ebVar == null) {
                    synchronized (C56324v.class) {
                        ebVar = f150123d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f150122c);
                            f150123d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
