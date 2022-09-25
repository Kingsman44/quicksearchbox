package com.google.assistant.p3994s.p3995a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.hz */
/* compiled from: PG */
public final class C53278hz extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C53278hz f139680c;

    /* renamed from: e */
    private static volatile C63010eb f139681e;

    /* renamed from: a */
    public String f139682a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f139683b = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f139684d;

    static {
        C53278hz hzVar = new C53278hz();
        f139680c = hzVar;
        C62942bv.registerDefaultInstance(C53278hz.class, hzVar);
    }

    private C53278hz() {
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
                return newMessageInfo(f139680c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C53278hz();
            case 4:
                return new C53277hy();
            case 5:
                return f139680c;
            case 6:
                C63010eb ebVar = f139681e;
                if (ebVar == null) {
                    synchronized (C53278hz.class) {
                        ebVar = f139681e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139680c);
                            f139681e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
