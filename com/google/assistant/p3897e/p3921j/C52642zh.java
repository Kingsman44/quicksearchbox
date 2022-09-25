package com.google.assistant.p3897e.p3921j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.zh */
/* compiled from: PG */
public final class C52642zh extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C52642zh f138218e;

    /* renamed from: f */
    private static volatile C63010eb f138219f;

    /* renamed from: a */
    public int f138220a;

    /* renamed from: b */
    public long f138221b;

    /* renamed from: c */
    public int f138222c;

    /* renamed from: d */
    public C52236kg f138223d;

    static {
        C52642zh zhVar = new C52642zh();
        f138218e = zhVar;
        C62942bv.registerDefaultInstance(C52642zh.class, zhVar);
    }

    private C52642zh() {
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
                return newMessageInfo(f138218e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဌ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, C52635za.f138203a, "d"});
            case 3:
                return new C52642zh();
            case 4:
                return new C52641zg();
            case 5:
                return f138218e;
            case 6:
                C63010eb ebVar = f138219f;
                if (ebVar == null) {
                    synchronized (C52642zh.class) {
                        ebVar = f138219f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138218e);
                            f138219f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
