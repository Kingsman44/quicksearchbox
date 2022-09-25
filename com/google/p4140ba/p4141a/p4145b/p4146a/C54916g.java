package com.google.p4140ba.p4141a.p4145b.p4146a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ba.a.b.a.g */
/* compiled from: PG */
public final class C54916g extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C54916g f144353d;

    /* renamed from: e */
    private static volatile C63010eb f144354e;

    /* renamed from: a */
    public int f144355a;

    /* renamed from: b */
    public float f144356b;

    /* renamed from: c */
    public float f144357c;

    static {
        C54916g gVar = new C54916g();
        f144353d = gVar;
        C62942bv.registerDefaultInstance(C54916g.class, gVar);
    }

    private C54916g() {
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
                return newMessageInfo(f144353d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C54916g();
            case 4:
                return new C54915f();
            case 5:
                return f144353d;
            case 6:
                C63010eb ebVar = f144354e;
                if (ebVar == null) {
                    synchronized (C54916g.class) {
                        ebVar = f144354e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144353d);
                            f144354e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
