package com.google.assistant.p3897e.p3902c.p3907c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.c.c.id */
/* compiled from: PG */
public final class C51148id extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C51148id f133140f;

    /* renamed from: h */
    private static volatile C63010eb f133141h;

    /* renamed from: a */
    public int f133142a;

    /* renamed from: b */
    public String f133143b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C51146ib f133144c;

    /* renamed from: d */
    public C51141hx f133145d;

    /* renamed from: e */
    public C62971cq f133146e = emptyProtobufList();

    /* renamed from: g */
    private byte f133147g = 2;

    static {
        C51148id idVar = new C51148id();
        f133140f = idVar;
        C62942bv.registerDefaultInstance(C51148id.class, idVar);
    }

    private C51148id() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f133147g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f133147g = b;
                return null;
            case 2:
                return newMessageInfo(f133140f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0003\u0001ဈ\u0000\u0002ᐉ\u0001\u0003Л\u0004ᐉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "e", C51146ib.class, "d"});
            case 3:
                return new C51148id();
            case 4:
                return new C51147ic();
            case 5:
                return f133140f;
            case 6:
                C63010eb ebVar = f133141h;
                if (ebVar == null) {
                    synchronized (C51148id.class) {
                        ebVar = f133141h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133140f);
                            f133141h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
