package com.google.android.apps.gsa.tasks;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.tasks.aw */
/* compiled from: PG */
public final class C118488aw extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C118488aw f328871d;

    /* renamed from: f */
    private static volatile C63010eb f328872f;

    /* renamed from: a */
    public int f328873a;

    /* renamed from: b */
    public int f328874b;

    /* renamed from: c */
    public int f328875c;

    /* renamed from: e */
    private byte f328876e = 2;

    static {
        C118488aw awVar = new C118488aw();
        f328871d = awVar;
        C62942bv.registerDefaultInstance(C118488aw.class, awVar);
    }

    private C118488aw() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f328876e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f328876e = b;
                return null;
            case 2:
                return newMessageInfo(f328871d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔌ\u0000\u0002ᔄ\u0001", new Object[]{"a", "b", C118522by.m196759c(), C45240c.f118157a});
            case 3:
                return new C118488aw();
            case 4:
                return new C118487av();
            case 5:
                return f328871d;
            case 6:
                C63010eb ebVar = f328872f;
                if (ebVar == null) {
                    synchronized (C118488aw.class) {
                        ebVar = f328872f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f328871d);
                            f328872f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
