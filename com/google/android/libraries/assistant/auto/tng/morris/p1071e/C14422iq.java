package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.iq */
/* compiled from: PG */
public final class C14422iq extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C14422iq f43621c;

    /* renamed from: e */
    private static volatile C63010eb f43622e;

    /* renamed from: a */
    public int f43623a = 0;

    /* renamed from: b */
    public Object f43624b;

    /* renamed from: d */
    private byte f43625d = 2;

    static {
        C14422iq iqVar = new C14422iq();
        f43621c = iqVar;
        C62942bv.registerDefaultInstance(C14422iq.class, iqVar);
    }

    private C14422iq() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f43625d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f43625d = b;
                return null;
            case 2:
                return newMessageInfo(f43621c, "\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001м\u0000", new Object[]{"b", "a", C14421ip.class});
            case 3:
                return new C14422iq();
            case 4:
                return new C14418im();
            case 5:
                return f43621c;
            case 6:
                C63010eb ebVar = f43622e;
                if (ebVar == null) {
                    synchronized (C14422iq.class) {
                        ebVar = f43622e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43621c);
                            f43622e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
