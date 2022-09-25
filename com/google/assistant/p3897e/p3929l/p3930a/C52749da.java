package com.google.assistant.p3897e.p3929l.p3930a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.assistant.e.l.a.da */
/* compiled from: PG */
public final class C52749da extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C52749da f138434d;

    /* renamed from: f */
    private static volatile C63010eb f138435f;

    /* renamed from: a */
    public boolean f138436a;

    /* renamed from: b */
    public C63042fg f138437b;

    /* renamed from: c */
    public boolean f138438c;

    /* renamed from: e */
    private int f138439e;

    static {
        C52749da daVar = new C52749da();
        f138434d = daVar;
        C62942bv.registerDefaultInstance(C52749da.class, daVar);
    }

    private C52749da() {
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
                return newMessageInfo(f138434d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဉ\u0001\u0003ဇ\u0002", new Object[]{"e", "a", "b", C45240c.f118157a});
            case 3:
                return new C52749da();
            case 4:
                return new C52747cz();
            case 5:
                return f138434d;
            case 6:
                C63010eb ebVar = f138435f;
                if (ebVar == null) {
                    synchronized (C52749da.class) {
                        ebVar = f138435f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138434d);
                            f138435f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
