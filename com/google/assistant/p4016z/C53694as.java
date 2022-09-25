package com.google.assistant.p4016z;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4479cg.C58079k;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.z.as */
/* compiled from: PG */
public final class C53694as extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C53694as f140951e;

    /* renamed from: f */
    private static volatile C63010eb f140952f;

    /* renamed from: a */
    public int f140953a;

    /* renamed from: b */
    public float f140954b;

    /* renamed from: c */
    public C58079k f140955c;

    /* renamed from: d */
    public long f140956d;

    static {
        C53694as asVar = new C53694as();
        f140951e = asVar;
        C62942bv.registerDefaultInstance(C53694as.class, asVar);
    }

    private C53694as() {
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
                return newMessageInfo(f140951e, "\u0001\u0003\u0000\u0001\u0001\u0007\u0003\u0000\u0000\u0000\u0001ခ\u0000\u0006ဉ\u0001\u0007ဂ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C53694as();
            case 4:
                return new C53693ar();
            case 5:
                return f140951e;
            case 6:
                C63010eb ebVar = f140952f;
                if (ebVar == null) {
                    synchronized (C53694as.class) {
                        ebVar = f140952f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140951e);
                            f140952f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
