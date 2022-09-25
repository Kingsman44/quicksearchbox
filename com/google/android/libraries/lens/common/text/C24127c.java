package com.google.android.libraries.lens.common.text;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.common.text.c */
/* compiled from: PG */
public final class C24127c extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C24127c f65871c;

    /* renamed from: d */
    private static volatile C63010eb f65872d;

    /* renamed from: a */
    public float f65873a;

    /* renamed from: b */
    public float f65874b;

    static {
        C24127c cVar = new C24127c();
        f65871c = cVar;
        C62942bv.registerDefaultInstance(C24127c.class, cVar);
    }

    private C24127c() {
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
                return newMessageInfo(f65871c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0001\u0002\u0001", new Object[]{"a", "b"});
            case 3:
                return new C24127c();
            case 4:
                return new C24126b();
            case 5:
                return f65871c;
            case 6:
                C63010eb ebVar = f65872d;
                if (ebVar == null) {
                    synchronized (C24127c.class) {
                        ebVar = f65872d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f65871c);
                            f65872d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
