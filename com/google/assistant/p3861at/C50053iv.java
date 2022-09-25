package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.iv */
/* compiled from: PG */
public final class C50053iv extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C50053iv f130129c;

    /* renamed from: d */
    private static volatile C63010eb f130130d;

    /* renamed from: a */
    public int f130131a;

    /* renamed from: b */
    public String f130132b = BuildConfig.FLAVOR;

    static {
        C50053iv ivVar = new C50053iv();
        f130129c = ivVar;
        C62942bv.registerDefaultInstance(C50053iv.class, ivVar);
    }

    private C50053iv() {
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
                return newMessageInfo(f130129c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C50053iv();
            case 4:
                return new C50052iu();
            case 5:
                return f130129c;
            case 6:
                C63010eb ebVar = f130130d;
                if (ebVar == null) {
                    synchronized (C50053iv.class) {
                        ebVar = f130130d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130129c);
                            f130130d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
