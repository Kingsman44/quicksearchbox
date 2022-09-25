package com.google.p5277z.p5282c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4850an.p4854c.C63437z;
import com.google.protos.p4883as.p4885b.C63785f;

/* renamed from: com.google.z.c.aj */
/* compiled from: PG */
public final class C68000aj extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C68000aj f184246a;

    /* renamed from: f */
    private static volatile C63010eb f184247f;

    /* renamed from: b */
    private int f184248b;

    /* renamed from: c */
    private C63437z f184249c;

    /* renamed from: d */
    private C63785f f184250d;

    /* renamed from: e */
    private byte f184251e = 2;

    static {
        C68000aj ajVar = new C68000aj();
        f184246a = ajVar;
        C62942bv.registerDefaultInstance(C68000aj.class, ajVar);
    }

    private C68000aj() {
        C62942bv.emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f184251e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f184251e = b;
                return null;
            case 2:
                return newMessageInfo(f184246a, "\u0001\u0002\u0000\u0001\b\u0012\u0002\u0000\u0000\u0001\bᐉ\u0005\u0012ဉ\t", new Object[]{"b", C45240c.f118157a, "d"});
            case 3:
                return new C68000aj();
            case 4:
                return new C67999ai();
            case 5:
                return f184246a;
            case 6:
                C63010eb ebVar = f184247f;
                if (ebVar == null) {
                    synchronized (C68000aj.class) {
                        ebVar = f184247f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f184246a);
                            f184247f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
