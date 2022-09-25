package com.google.p4152bb.p4153a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.bb.a.ar */
/* compiled from: PG */
public final class C54960ar extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C54960ar f144578c;

    /* renamed from: d */
    public static final C62940bt f144579d;

    /* renamed from: e */
    private static volatile C63010eb f144580e;

    /* renamed from: a */
    public int f144581a;

    /* renamed from: b */
    public int f144582b;

    static {
        C54960ar arVar = new C54960ar();
        f144578c = arVar;
        C62942bv.registerDefaultInstance(C54960ar.class, arVar);
        f144579d = C62942bv.newSingularGeneratedExtension(C54946ad.f144531h, arVar, arVar, (C62958ce) null, 47931889, C63066gd.MESSAGE, C54960ar.class);
    }

    private C54960ar() {
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
                return newMessageInfo(f144578c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002င\u0001", new Object[]{"a", "b"});
            case 3:
                return new C54960ar();
            case 4:
                return new C54959aq();
            case 5:
                return f144578c;
            case 6:
                C63010eb ebVar = f144580e;
                if (ebVar == null) {
                    synchronized (C54960ar.class) {
                        ebVar = f144580e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144578c);
                            f144580e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
