package com.google.assistant.p3988o;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.o.f */
/* compiled from: PG */
public final class C53036f extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C53036f f139002d;

    /* renamed from: f */
    private static volatile C63010eb f139003f;

    /* renamed from: a */
    public int f139004a;

    /* renamed from: b */
    public String f139005b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f139006c = C62942bv.emptyProtobufList();

    /* renamed from: e */
    private byte f139007e = 2;

    static {
        C53036f fVar = new C53036f();
        f139002d = fVar;
        C62942bv.registerDefaultInstance(C53036f.class, fVar);
    }

    private C53036f() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f139007e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f139007e = b;
                return null;
            case 2:
                return newMessageInfo(f139002d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001a", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C53036f();
            case 4:
                return new C53035e();
            case 5:
                return f139002d;
            case 6:
                C63010eb ebVar = f139003f;
                if (ebVar == null) {
                    synchronized (C53036f.class) {
                        ebVar = f139003f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139002d);
                            f139003f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
