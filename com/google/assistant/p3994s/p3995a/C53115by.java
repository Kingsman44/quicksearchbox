package com.google.assistant.p3994s.p3995a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.by */
/* compiled from: PG */
public final class C53115by extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C53115by f139186f;

    /* renamed from: h */
    private static volatile C63010eb f139187h;

    /* renamed from: a */
    public int f139188a;

    /* renamed from: b */
    public String f139189b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C51012dc f139190c;

    /* renamed from: d */
    public String f139191d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f139192e = BuildConfig.FLAVOR;

    /* renamed from: g */
    private byte f139193g = 2;

    static {
        C53115by byVar = new C53115by();
        f139186f = byVar;
        C62942bv.registerDefaultInstance(C53115by.class, byVar);
    }

    private C53115by() {
        C62942bv.emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f139193g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f139193g = b;
                return null;
            case 2:
                return newMessageInfo(f139186f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C53115by();
            case 4:
                return new C53114bx();
            case 5:
                return f139186f;
            case 6:
                C63010eb ebVar = f139187h;
                if (ebVar == null) {
                    synchronized (C53115by.class) {
                        ebVar = f139187h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139186f);
                            f139187h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
