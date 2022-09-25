package com.google.assistant.p3861at;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.assistant.at.hp */
/* compiled from: PG */
public final class C50020hp extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C50020hp f130037f;

    /* renamed from: g */
    private static volatile C63010eb f130038g;

    /* renamed from: a */
    public int f130039a;

    /* renamed from: b */
    public boolean f130040b;

    /* renamed from: c */
    public C50139m f130041c;

    /* renamed from: d */
    public C63088z f130042d = C63088z.f170246b;

    /* renamed from: e */
    public boolean f130043e;

    static {
        C50020hp hpVar = new C50020hp();
        f130037f = hpVar;
        C62942bv.registerDefaultInstance(C50020hp.class, hpVar);
    }

    private C50020hp() {
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
                return newMessageInfo(f130037f, "\u0001\u0004\u0000\u0001\u0001\b\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0004ဉ\u0002\u0005ည\u0003\bဇ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C50020hp();
            case 4:
                return new C50019ho();
            case 5:
                return f130037f;
            case 6:
                C63010eb ebVar = f130038g;
                if (ebVar == null) {
                    synchronized (C50020hp.class) {
                        ebVar = f130038g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130037f);
                            f130038g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
