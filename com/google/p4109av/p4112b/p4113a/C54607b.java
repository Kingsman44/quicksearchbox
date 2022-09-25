package com.google.p4109av.p4112b.p4113a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.av.b.a.b */
/* compiled from: PG */
public final class C54607b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C54607b f143366d;

    /* renamed from: f */
    private static volatile C63010eb f143367f;

    /* renamed from: a */
    public String f143368a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public boolean f143369b;

    /* renamed from: c */
    public boolean f143370c;

    /* renamed from: e */
    private int f143371e;

    static {
        C54607b bVar = new C54607b();
        f143366d = bVar;
        C62942bv.registerDefaultInstance(C54607b.class, bVar);
    }

    private C54607b() {
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
                return newMessageInfo(f143366d, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"e", "a", "b", C45240c.f118157a});
            case 3:
                return new C54607b();
            case 4:
                return new C54606a();
            case 5:
                return f143366d;
            case 6:
                C63010eb ebVar = f143367f;
                if (ebVar == null) {
                    synchronized (C54607b.class) {
                        ebVar = f143367f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143366d);
                            f143367f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
