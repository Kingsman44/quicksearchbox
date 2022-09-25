package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.km */
/* compiled from: PG */
public final class C14472km extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C14472km f43745c;

    /* renamed from: d */
    private static volatile C63010eb f43746d;

    /* renamed from: a */
    public int f43747a;

    /* renamed from: b */
    public C62971cq f43748b = emptyProtobufList();

    static {
        C14472km kmVar = new C14472km();
        f43745c = kmVar;
        C62942bv.registerDefaultInstance(C14472km.class, kmVar);
    }

    private C14472km() {
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
                return newMessageInfo(f43745c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0004\u0002\u001b", new Object[]{"a", "b", C14270d.class});
            case 3:
                return new C14472km();
            case 4:
                return new C14471kl();
            case 5:
                return f43745c;
            case 6:
                C63010eb ebVar = f43746d;
                if (ebVar == null) {
                    synchronized (C14472km.class) {
                        ebVar = f43746d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43745c);
                            f43746d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
