package com.google.apps.tiktok.account.data.p3611a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.apps.tiktok.account.data.a.z */
/* compiled from: PG */
public final class C46148z extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C46148z f121055e;

    /* renamed from: f */
    private static volatile C63010eb f121056f;

    /* renamed from: a */
    public int f121057a;

    /* renamed from: b */
    public boolean f121058b;

    /* renamed from: c */
    public C62971cq f121059c = C62942bv.emptyProtobufList();

    /* renamed from: d */
    public int f121060d;

    static {
        C46148z zVar = new C46148z();
        f121055e = zVar;
        C62942bv.registerDefaultInstance(C46148z.class, zVar);
    }

    private C46148z() {
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
                return newMessageInfo(f121055e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဇ\u0000\u0002\u001a\u0003ဌ\u0001", new Object[]{"a", "b", C45240c.f118157a, "d", C46146x.f121054a});
            case 3:
                return new C46148z();
            case 4:
                return new C46145w();
            case 5:
                return f121055e;
            case 6:
                C63010eb ebVar = f121056f;
                if (ebVar == null) {
                    synchronized (C46148z.class) {
                        ebVar = f121056f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f121055e);
                            f121056f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
