package com.google.assistant.p3944g.p3948b.p3949a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.g.b.a.n */
/* compiled from: PG */
public final class C52949n extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C52949n f138829c;

    /* renamed from: d */
    private static volatile C63010eb f138830d;

    /* renamed from: a */
    public int f138831a;

    /* renamed from: b */
    public String f138832b = BuildConfig.FLAVOR;

    static {
        C52949n nVar = new C52949n();
        f138829c = nVar;
        C62942bv.registerDefaultInstance(C52949n.class, nVar);
    }

    private C52949n() {
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
                return newMessageInfo(f138829c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C52949n();
            case 4:
                return new C52948m();
            case 5:
                return f138829c;
            case 6:
                C63010eb ebVar = f138830d;
                if (ebVar == null) {
                    synchronized (C52949n.class) {
                        ebVar = f138830d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138829c);
                            f138830d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
