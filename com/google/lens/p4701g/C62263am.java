package com.google.lens.p4701g;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4172bg.C55747h;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.g.am */
/* compiled from: PG */
public final class C62263am extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C62263am f168101d;

    /* renamed from: f */
    private static volatile C63010eb f168102f;

    /* renamed from: a */
    public int f168103a;

    /* renamed from: b */
    public String f168104b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f168105c = emptyProtobufList();

    /* renamed from: e */
    private byte f168106e = 2;

    static {
        C62263am amVar = new C62263am();
        f168101d = amVar;
        C62942bv.registerDefaultInstance(C62263am.class, amVar);
    }

    private C62263am() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f168106e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f168106e = b;
                return null;
            case 2:
                return newMessageInfo(f168101d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ဈ\u0000\u0002Л", new Object[]{"a", "b", C45240c.f118157a, C55747h.class});
            case 3:
                return new C62263am();
            case 4:
                return new C62262al();
            case 5:
                return f168101d;
            case 6:
                C63010eb ebVar = f168102f;
                if (ebVar == null) {
                    synchronized (C62263am.class) {
                        ebVar = f168102f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168101d);
                            f168102f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
