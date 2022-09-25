package com.google.assistant.p3861at;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.pa */
/* compiled from: PG */
public final class C50221pa extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C50221pa f130586d;

    /* renamed from: e */
    private static volatile C63010eb f130587e;

    /* renamed from: a */
    public int f130588a;

    /* renamed from: b */
    public C50219oz f130589b;

    /* renamed from: c */
    public boolean f130590c;

    static {
        C50221pa paVar = new C50221pa();
        f130586d = paVar;
        C62942bv.registerDefaultInstance(C50221pa.class, paVar);
    }

    private C50221pa() {
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
                return newMessageInfo(f130586d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C50221pa();
            case 4:
                return new C50217ox();
            case 5:
                return f130586d;
            case 6:
                C63010eb ebVar = f130587e;
                if (ebVar == null) {
                    synchronized (C50221pa.class) {
                        ebVar = f130587e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130586d);
                            f130587e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
