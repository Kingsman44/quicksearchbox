package com.google.assistant.p3994s.p3995a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.in */
/* compiled from: PG */
public final class C53293in extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C53293in f139718e;

    /* renamed from: f */
    private static volatile C63010eb f139719f;

    /* renamed from: a */
    public int f139720a;

    /* renamed from: b */
    public String f139721b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f139722c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C62971cq f139723d = emptyProtobufList();

    static {
        C53293in inVar = new C53293in();
        f139718e = inVar;
        C62942bv.registerDefaultInstance(C53293in.class, inVar);
    }

    private C53293in() {
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
                return newMessageInfo(f139718e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001b", new Object[]{"a", "b", C45240c.f118157a, "d", C53292im.class});
            case 3:
                return new C53293in();
            case 4:
                return new C53290ik();
            case 5:
                return f139718e;
            case 6:
                C63010eb ebVar = f139719f;
                if (ebVar == null) {
                    synchronized (C53293in.class) {
                        ebVar = f139719f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139718e);
                            f139719f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
