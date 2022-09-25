package com.google.android.libraries.assistant.portable.p1586b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.portable.b.f */
/* compiled from: PG */
public final class C19074f extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C19074f f53505a;

    /* renamed from: c */
    private static volatile C63010eb f53506c;

    /* renamed from: b */
    private byte f53507b = 2;

    static {
        C19074f fVar = new C19074f();
        f53505a = fVar;
        C62942bv.registerDefaultInstance(C19074f.class, fVar);
    }

    private C19074f() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f53507b);
            case 1:
                this.f53507b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f53505a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C19074f();
            case 4:
                return new C19073e();
            case 5:
                return f53505a;
            case 6:
                C63010eb ebVar = f53506c;
                if (ebVar == null) {
                    synchronized (C19074f.class) {
                        ebVar = f53506c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f53505a);
                            f53506c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
