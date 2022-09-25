package com.google.assistant.p3998u.p3999a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.u.a.b */
/* compiled from: PG */
public final class C53491b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C53491b f140380a;

    /* renamed from: c */
    private static volatile C63010eb f140381c;

    /* renamed from: b */
    private byte f140382b = 2;

    static {
        C53491b bVar = new C53491b();
        f140380a = bVar;
        C62942bv.registerDefaultInstance(C53491b.class, bVar);
    }

    private C53491b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f140382b);
            case 1:
                this.f140382b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f140380a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C53491b();
            case 4:
                return new C53490a();
            case 5:
                return f140380a;
            case 6:
                C63010eb ebVar = f140381c;
                if (ebVar == null) {
                    synchronized (C53491b.class) {
                        ebVar = f140381c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140380a);
                            f140381c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
