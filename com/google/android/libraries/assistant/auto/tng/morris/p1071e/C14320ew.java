package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.ew */
/* compiled from: PG */
public final class C14320ew extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C62962ci f43316c = new C14314eq();

    /* renamed from: e */
    public static final C14320ew f43317e;

    /* renamed from: f */
    private static volatile C63010eb f43318f;

    /* renamed from: a */
    public int f43319a;

    /* renamed from: b */
    public C62961ch f43320b = emptyIntList();

    /* renamed from: d */
    public C62971cq f43321d = emptyProtobufList();

    static {
        C14320ew ewVar = new C14320ew();
        f43317e = ewVar;
        C62942bv.registerDefaultInstance(C14320ew.class, ewVar);
    }

    private C14320ew() {
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
                return newMessageInfo(f43317e, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0002\u0000\u0001\f\u0002,\u0003\u001b", new Object[]{"a", "b", "d", C14317et.class});
            case 3:
                return new C14320ew();
            case 4:
                return new C14315er();
            case 5:
                return f43317e;
            case 6:
                C63010eb ebVar = f43318f;
                if (ebVar == null) {
                    synchronized (C14320ew.class) {
                        ebVar = f43318f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43317e);
                            f43318f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
