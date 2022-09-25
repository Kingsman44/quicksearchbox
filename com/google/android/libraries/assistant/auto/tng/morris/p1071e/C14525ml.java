package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.ml */
/* compiled from: PG */
public final class C14525ml extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C14525ml f43904d;

    /* renamed from: e */
    private static volatile C63010eb f43905e;

    /* renamed from: a */
    public String f43906a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public int f43907b;

    /* renamed from: c */
    public String f43908c = BuildConfig.FLAVOR;

    static {
        C14525ml mlVar = new C14525ml();
        f43904d = mlVar;
        C62942bv.registerDefaultInstance(C14525ml.class, mlVar);
    }

    private C14525ml() {
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
                return newMessageInfo(f43904d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003Ȉ", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C14525ml();
            case 4:
                return new C14524mk();
            case 5:
                return f43904d;
            case 6:
                C63010eb ebVar = f43905e;
                if (ebVar == null) {
                    synchronized (C14525ml.class) {
                        ebVar = f43905e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43904d);
                            f43905e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
