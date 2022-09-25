package com.google.assistant.p3803ag.p3804a;

import com.google.assistant.p3994s.p3995a.C53121cd;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.assistant.ag.a.bz */
/* compiled from: PG */
public final class C48859bz extends C62937bq implements C62938br {

    /* renamed from: b */
    public static final C48859bz f126433b;

    /* renamed from: c */
    public static final C62940bt f126434c;

    /* renamed from: f */
    private static volatile C63010eb f126435f;

    /* renamed from: a */
    public int f126436a;

    /* renamed from: d */
    private int f126437d;

    /* renamed from: e */
    private byte f126438e = 2;

    static {
        C48859bz bzVar = new C48859bz();
        f126433b = bzVar;
        C62942bv.registerDefaultInstance(C48859bz.class, bzVar);
        f126434c = C62942bv.newSingularGeneratedExtension(C48877t.f126483b, bzVar, bzVar, (C62958ce) null, 202, C63066gd.MESSAGE, C48859bz.class);
    }

    private C48859bz() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f126438e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f126438e = b;
                return null;
            case 2:
                return newMessageInfo(f126433b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဌ\u0001", new Object[]{"d", "a", C53121cd.m86779b()});
            case 3:
                return new C48859bz();
            case 4:
                return new C48858by();
            case 5:
                return f126433b;
            case 6:
                C63010eb ebVar = f126435f;
                if (ebVar == null) {
                    synchronized (C48859bz.class) {
                        ebVar = f126435f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126433b);
                            f126435f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
