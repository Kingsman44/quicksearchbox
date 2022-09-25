package com.google.android.libraries.search.assistant.p2825x.p2827b;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.x.b.b */
/* compiled from: PG */
public final class C36822b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C36822b f95965b;

    /* renamed from: d */
    private static volatile C63010eb f95966d;

    /* renamed from: a */
    public C34053bp f95967a;

    /* renamed from: c */
    private byte f95968c = 2;

    static {
        C36822b bVar = new C36822b();
        f95965b = bVar;
        C62942bv.registerDefaultInstance(C36822b.class, bVar);
    }

    private C36822b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 0;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f95968c);
            case 1:
                if (obj != null) {
                    b = 1;
                }
                this.f95968c = b;
                return null;
            case 2:
                return newMessageInfo(f95965b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001Љ", new Object[]{"a"});
            case 3:
                return new C36822b();
            case 4:
                return new C36821a();
            case 5:
                return f95965b;
            case 6:
                C63010eb ebVar = f95966d;
                if (ebVar == null) {
                    synchronized (C36822b.class) {
                        ebVar = f95966d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f95965b);
                            f95966d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
