package com.google.protos.p5127o;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.o.f */
/* compiled from: PG */
public final class C65680f extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C65680f f178455c;

    /* renamed from: d */
    private static volatile C63010eb f178456d;

    /* renamed from: a */
    public int f178457a;

    /* renamed from: b */
    public String f178458b = BuildConfig.FLAVOR;

    static {
        C65680f fVar = new C65680f();
        f178455c = fVar;
        C62942bv.registerDefaultInstance(C65680f.class, fVar);
    }

    private C65680f() {
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
                return newMessageInfo(f178455c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C65680f();
            case 4:
                return new C65679e();
            case 5:
                return f178455c;
            case 6:
                C63010eb ebVar = f178456d;
                if (ebVar == null) {
                    synchronized (C65680f.class) {
                        ebVar = f178456d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178455c);
                            f178456d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
