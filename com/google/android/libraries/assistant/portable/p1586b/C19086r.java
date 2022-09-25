package com.google.android.libraries.assistant.portable.p1586b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.portable.b.r */
/* compiled from: PG */
public final class C19086r extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C19086r f53525f;

    /* renamed from: h */
    private static volatile C63010eb f53526h;

    /* renamed from: a */
    public int f53527a;

    /* renamed from: b */
    public int f53528b = 0;

    /* renamed from: c */
    public Object f53529c;

    /* renamed from: d */
    public int f53530d;

    /* renamed from: e */
    public int f53531e;

    /* renamed from: g */
    private byte f53532g = 2;

    static {
        C19086r rVar = new C19086r();
        f53525f = rVar;
        C62942bv.registerDefaultInstance(C19086r.class, rVar);
    }

    private C19086r() {
        emptyProtobufList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f53532g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f53532g = b;
                return null;
            case 2:
                return newMessageInfo(f53525f, "\u0001\u0005\u0001\u0001\u0003\b\u0005\u0000\u0000\u0002\u0003ᐼ\u0000\u0004ြ\u0000\u0005ᐼ\u0000\u0007ဌ\u0007\bဌ\b", new Object[]{C45240c.f118157a, "b", "a", C19061ae.class, C19079k.class, C19074f.class, "d", C19085q.f53524a, "e", C19083o.f53523a});
            case 3:
                return new C19086r();
            case 4:
                return new C19082n();
            case 5:
                return f53525f;
            case 6:
                C63010eb ebVar = f53526h;
                if (ebVar == null) {
                    synchronized (C19086r.class) {
                        ebVar = f53526h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f53525f);
                            f53526h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
