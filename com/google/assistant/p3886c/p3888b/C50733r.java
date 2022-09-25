package com.google.assistant.p3886c.p3888b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.c.b.r */
/* compiled from: PG */
public final class C50733r extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C50733r f132021d;

    /* renamed from: e */
    private static volatile C63010eb f132022e;

    /* renamed from: a */
    public int f132023a;

    /* renamed from: b */
    public int f132024b;

    /* renamed from: c */
    public String f132025c = BuildConfig.FLAVOR;

    static {
        C50733r rVar = new C50733r();
        f132021d = rVar;
        C62942bv.registerDefaultInstance(C50733r.class, rVar);
    }

    private C50733r() {
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
                return newMessageInfo(f132021d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C50731p.m85908b(), C45240c.f118157a});
            case 3:
                return new C50733r();
            case 4:
                return new C50732q();
            case 5:
                return f132021d;
            case 6:
                C63010eb ebVar = f132022e;
                if (ebVar == null) {
                    synchronized (C50733r.class) {
                        ebVar = f132022e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132021d);
                            f132022e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
