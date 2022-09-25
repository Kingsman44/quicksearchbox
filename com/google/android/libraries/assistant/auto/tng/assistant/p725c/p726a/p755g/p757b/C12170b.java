package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p755g.p757b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.speech.p5208h.p5210b.C66572b;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.a.g.b.b */
/* compiled from: PG */
public final class C12170b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C12170b f38866c;

    /* renamed from: e */
    private static volatile C63010eb f38867e;

    /* renamed from: a */
    public int f38868a;

    /* renamed from: b */
    public C66572b f38869b;

    /* renamed from: d */
    private byte f38870d = 2;

    static {
        C12170b bVar = new C12170b();
        f38866c = bVar;
        C62942bv.registerDefaultInstance(C12170b.class, bVar);
    }

    private C12170b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f38870d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f38870d = b;
                return null;
            case 2:
                return newMessageInfo(f38866c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C12170b();
            case 4:
                return new C12169a();
            case 5:
                return f38866c;
            case 6:
                C63010eb ebVar = f38867e;
                if (ebVar == null) {
                    synchronized (C12170b.class) {
                        ebVar = f38867e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f38866c);
                            f38867e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
