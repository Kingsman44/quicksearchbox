package com.google.assistant.p3897e.p3912f;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.f.q */
/* compiled from: PG */
public final class C51222q extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C51222q f133364c;

    /* renamed from: d */
    private static volatile C63010eb f133365d;

    /* renamed from: a */
    public int f133366a;

    /* renamed from: b */
    public String f133367b = BuildConfig.FLAVOR;

    static {
        C51222q qVar = new C51222q();
        f133364c = qVar;
        C62942bv.registerDefaultInstance(C51222q.class, qVar);
    }

    private C51222q() {
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
                return newMessageInfo(f133364c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C51222q();
            case 4:
                return new C51221p();
            case 5:
                return f133364c;
            case 6:
                C63010eb ebVar = f133365d;
                if (ebVar == null) {
                    synchronized (C51222q.class) {
                        ebVar = f133365d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133364c);
                            f133365d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
