package com.google.android.libraries.assistant.portable.p1586b;

import com.google.assistant.p3745ab.C48292ct;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.portable.b.ag */
/* compiled from: PG */
public final class C19063ag extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C19063ag f53477c;

    /* renamed from: e */
    private static volatile C63010eb f53478e;

    /* renamed from: a */
    public int f53479a;

    /* renamed from: b */
    public int f53480b;

    /* renamed from: d */
    private byte f53481d = 2;

    static {
        C19063ag agVar = new C19063ag();
        f53477c = agVar;
        C62942bv.registerDefaultInstance(C19063ag.class, agVar);
    }

    private C19063ag() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f53481d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f53481d = b;
                return null;
            case 2:
                return newMessageInfo(f53477c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C48292ct.m85217b()});
            case 3:
                return new C19063ag();
            case 4:
                return new C19062af();
            case 5:
                return f53477c;
            case 6:
                C63010eb ebVar = f53478e;
                if (ebVar == null) {
                    synchronized (C19063ag.class) {
                        ebVar = f53478e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f53477c);
                            f53478e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
