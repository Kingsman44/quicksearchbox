package com.google.assistant.p3863av.p3871d.p3872a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.av.d.a.f */
/* compiled from: PG */
public final class C50564f extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C50564f f131596a;

    /* renamed from: e */
    private static volatile C63010eb f131597e;

    /* renamed from: b */
    private int f131598b;

    /* renamed from: c */
    private C50560b f131599c;

    /* renamed from: d */
    private byte f131600d = 2;

    static {
        C50564f fVar = new C50564f();
        f131596a = fVar;
        C62942bv.registerDefaultInstance(C50564f.class, fVar);
    }

    private C50564f() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f131600d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f131600d = b;
                return null;
            case 2:
                return newMessageInfo(f131596a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0005", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C50564f();
            case 4:
                return new C50563e();
            case 5:
                return f131596a;
            case 6:
                C63010eb ebVar = f131597e;
                if (ebVar == null) {
                    synchronized (C50564f.class) {
                        ebVar = f131597e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131596a);
                            f131597e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
