package com.google.android.libraries.geller.p1815c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.geller.c.e */
/* compiled from: PG */
public final class C21764e extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C21764e f60067e;

    /* renamed from: f */
    private static volatile C63010eb f60068f;

    /* renamed from: a */
    public int f60069a;

    /* renamed from: b */
    public C62971cq f60070b = emptyProtobufList();

    /* renamed from: c */
    public C62971cq f60071c = emptyProtobufList();

    /* renamed from: d */
    public String f60072d = BuildConfig.FLAVOR;

    static {
        C21764e eVar = new C21764e();
        f60067e = eVar;
        C62942bv.registerDefaultInstance(C21764e.class, eVar);
    }

    private C21764e() {
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
                return newMessageInfo(f60067e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003ဈ\u0000", new Object[]{"a", "b", C21763d.class, C45240c.f118157a, C21763d.class, "d"});
            case 3:
                return new C21764e();
            case 4:
                return new C21761b();
            case 5:
                return f60067e;
            case 6:
                C63010eb ebVar = f60068f;
                if (ebVar == null) {
                    synchronized (C21764e.class) {
                        ebVar = f60068f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f60067e);
                            f60068f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
