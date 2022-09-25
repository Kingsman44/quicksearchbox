package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p855d.p862c.p867c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.d.c.c.b */
/* compiled from: PG */
public final class C12896b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C12896b f40155c;

    /* renamed from: d */
    private static volatile C63010eb f40156d;

    /* renamed from: a */
    public int f40157a;

    /* renamed from: b */
    public C63088z f40158b = C63088z.f170246b;

    static {
        C12896b bVar = new C12896b();
        f40155c = bVar;
        C62942bv.registerDefaultInstance(C12896b.class, bVar);
    }

    private C12896b() {
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
                return newMessageInfo(f40155c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"a", "b"});
            case 3:
                return new C12896b();
            case 4:
                return new C12895a();
            case 5:
                return f40155c;
            case 6:
                C63010eb ebVar = f40156d;
                if (ebVar == null) {
                    synchronized (C12896b.class) {
                        ebVar = f40156d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f40155c);
                            f40156d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
