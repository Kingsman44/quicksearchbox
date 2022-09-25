package com.google.knowledge.p4671b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.knowledge.b.ak */
/* compiled from: PG */
public final class C61792ak extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C61792ak f166916d;

    /* renamed from: f */
    private static volatile C63010eb f166917f;

    /* renamed from: a */
    public int f166918a;

    /* renamed from: b */
    public String f166919b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C61800as f166920c;

    /* renamed from: e */
    private byte f166921e = 2;

    static {
        C61792ak akVar = new C61792ak();
        f166916d = akVar;
        C62942bv.registerDefaultInstance(C61792ak.class, akVar);
    }

    private C61792ak() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f166921e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f166921e = b;
                return null;
            case 2:
                return newMessageInfo(f166916d, "\u0001\u0002\u0000\u0001\u0004\u0005\u0002\u0000\u0000\u0001\u0004ᐉ\u0004\u0005ဈ\u0000", new Object[]{"a", C45240c.f118157a, "b"});
            case 3:
                return new C61792ak();
            case 4:
                return new C61791aj();
            case 5:
                return f166916d;
            case 6:
                C63010eb ebVar = f166917f;
                if (ebVar == null) {
                    synchronized (C61792ak.class) {
                        ebVar = f166917f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f166916d);
                            f166917f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
