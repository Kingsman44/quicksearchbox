package com.google.p5277z.p5282c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.z.c.z */
/* compiled from: PG */
public final class C68036z extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C68036z f184326f;

    /* renamed from: h */
    private static volatile C63010eb f184327h;

    /* renamed from: a */
    public int f184328a;

    /* renamed from: b */
    public C68032v f184329b;

    /* renamed from: c */
    public long f184330c;

    /* renamed from: d */
    public C62961ch f184331d = emptyIntList();

    /* renamed from: e */
    public int f184332e;

    /* renamed from: g */
    private byte f184333g = 2;

    static {
        C68036z zVar = new C68036z();
        f184326f = zVar;
        C62942bv.registerDefaultInstance(C68036z.class, zVar);
    }

    private C68036z() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f184333g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f184333g = b;
                return null;
            case 2:
                return newMessageInfo(f184326f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0001\u0001ᐉ\u0000\u0003ဂ\u0002\u0004\u001e\u0005ဌ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", C68035y.f184325a, "e", C68034x.f184324a});
            case 3:
                return new C68036z();
            case 4:
                return new C68033w();
            case 5:
                return f184326f;
            case 6:
                C63010eb ebVar = f184327h;
                if (ebVar == null) {
                    synchronized (C68036z.class) {
                        ebVar = f184327h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f184326f);
                            f184327h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
