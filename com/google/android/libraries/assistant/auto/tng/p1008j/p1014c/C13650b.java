package com.google.android.libraries.assistant.auto.tng.p1008j.p1014c;

import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12973ae;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.j.c.b */
/* compiled from: PG */
public final class C13650b extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C13650b f41690e;

    /* renamed from: g */
    private static volatile C63010eb f41691g;

    /* renamed from: a */
    public int f41692a;

    /* renamed from: b */
    public int f41693b = 0;

    /* renamed from: c */
    public Object f41694c;

    /* renamed from: d */
    public C12991i f41695d;

    /* renamed from: f */
    private byte f41696f = 2;

    static {
        C13650b bVar = new C13650b();
        f41690e = bVar;
        C62942bv.registerDefaultInstance(C13650b.class, bVar);
    }

    private C13650b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f41696f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f41696f = b;
                return null;
            case 2:
                return newMessageInfo(f41690e, "\u0000\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002<\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", C12973ae.class});
            case 3:
                return new C13650b();
            case 4:
                return new C13648a();
            case 5:
                return f41690e;
            case 6:
                C63010eb ebVar = f41691g;
                if (ebVar == null) {
                    synchronized (C13650b.class) {
                        ebVar = f41691g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f41690e);
                            f41691g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
