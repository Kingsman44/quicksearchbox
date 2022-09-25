package com.google.android.libraries.assistant.p1533o;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.o.al */
/* compiled from: PG */
public final class C18449al extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C18449al f52359c;

    /* renamed from: d */
    private static volatile C63010eb f52360d;

    /* renamed from: a */
    public String f52361a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C18448ak f52362b;

    static {
        C18449al alVar = new C18449al();
        f52359c = alVar;
        C62942bv.registerDefaultInstance(C18449al.class, alVar);
    }

    private C18449al() {
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
                return newMessageInfo(f52359c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"a", "b"});
            case 3:
                return new C18449al();
            case 4:
                return new C18445ah();
            case 5:
                return f52359c;
            case 6:
                C63010eb ebVar = f52360d;
                if (ebVar == null) {
                    synchronized (C18449al.class) {
                        ebVar = f52360d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f52359c);
                            f52360d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
