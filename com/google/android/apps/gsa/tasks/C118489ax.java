package com.google.android.apps.gsa.tasks;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.tasks.ax */
/* compiled from: PG */
public final class C118489ax extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C118489ax f328877b;

    /* renamed from: d */
    private static volatile C63010eb f328878d;

    /* renamed from: a */
    public C62971cq f328879a = emptyProtobufList();

    /* renamed from: c */
    private byte f328880c = 2;

    static {
        C118489ax axVar = new C118489ax();
        f328877b = axVar;
        C62942bv.registerDefaultInstance(C118489ax.class, axVar);
    }

    private C118489ax() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f328880c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f328880c = b;
                return null;
            case 2:
                return newMessageInfo(f328877b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C118488aw.class});
            case 3:
                return new C118489ax();
            case 4:
                return new C118486au();
            case 5:
                return f328877b;
            case 6:
                C63010eb ebVar = f328878d;
                if (ebVar == null) {
                    synchronized (C118489ax.class) {
                        ebVar = f328878d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f328877b);
                            f328878d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
