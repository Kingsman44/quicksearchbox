package com.google.p4017at.p4060h.p4061a.p4062a.p4066d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.h.a.a.d.z */
/* compiled from: PG */
public final class C54174z extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C54174z f142179b;

    /* renamed from: e */
    private static volatile C63010eb f142180e;

    /* renamed from: a */
    public C54149ad f142181a;

    /* renamed from: c */
    private int f142182c;

    /* renamed from: d */
    private byte f142183d = 2;

    static {
        C54174z zVar = new C54174z();
        f142179b = zVar;
        C62942bv.registerDefaultInstance(C54174z.class, zVar);
    }

    private C54174z() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f142183d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f142183d = b;
                return null;
            case 2:
                return newMessageInfo(f142179b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0001", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C54174z();
            case 4:
                return new C54173y();
            case 5:
                return f142179b;
            case 6:
                C63010eb ebVar = f142180e;
                if (ebVar == null) {
                    synchronized (C54174z.class) {
                        ebVar = f142180e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142179b);
                            f142180e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
