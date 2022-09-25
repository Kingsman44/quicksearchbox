package com.google.common.p4552o;

import com.google.common.p4552o.p4566l.C60218r;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.oy */
/* compiled from: PG */
public final class C60341oy extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C60341oy f163326c;

    /* renamed from: e */
    private static volatile C63010eb f163327e;

    /* renamed from: a */
    public int f163328a;

    /* renamed from: b */
    public C60218r f163329b;

    /* renamed from: d */
    private byte f163330d = 2;

    static {
        C60341oy oyVar = new C60341oy();
        f163326c = oyVar;
        C62942bv.registerDefaultInstance(C60341oy.class, oyVar);
    }

    private C60341oy() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f163330d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f163330d = b;
                return null;
            case 2:
                return newMessageInfo(f163326c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C60341oy();
            case 4:
                return new C60340ox();
            case 5:
                return f163326c;
            case 6:
                C63010eb ebVar = f163327e;
                if (ebVar == null) {
                    synchronized (C60341oy.class) {
                        ebVar = f163327e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f163326c);
                            f163327e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
