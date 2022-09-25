package com.google.assistant.p3886c.p3887a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.c.a.j */
/* compiled from: PG */
public final class C50674j extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C50674j f131821d;

    /* renamed from: e */
    private static volatile C63010eb f131822e;

    /* renamed from: a */
    public int f131823a;

    /* renamed from: b */
    public C50672h f131824b;

    /* renamed from: c */
    public C50680p f131825c;

    static {
        C50674j jVar = new C50674j();
        f131821d = jVar;
        C62942bv.registerDefaultInstance(C50674j.class, jVar);
    }

    private C50674j() {
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
                return newMessageInfo(f131821d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C50674j();
            case 4:
                return new C50673i();
            case 5:
                return f131821d;
            case 6:
                C63010eb ebVar = f131822e;
                if (ebVar == null) {
                    synchronized (C50674j.class) {
                        ebVar = f131822e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131821d);
                            f131822e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
