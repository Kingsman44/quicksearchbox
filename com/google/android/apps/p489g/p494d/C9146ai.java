package com.google.android.apps.p489g.p494d;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.g.d.ai */
/* compiled from: PG */
public final class C9146ai extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C9146ai f31566f;

    /* renamed from: g */
    private static volatile C63010eb f31567g;

    /* renamed from: a */
    public int f31568a;

    /* renamed from: b */
    public String f31569b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f31570c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C62971cq f31571d = C62942bv.emptyProtobufList();

    /* renamed from: e */
    public boolean f31572e;

    static {
        C9146ai aiVar = new C9146ai();
        f31566f = aiVar;
        C62942bv.registerDefaultInstance(C9146ai.class, aiVar);
    }

    private C9146ai() {
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
                return newMessageInfo(f31566f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001a\u0005ဇ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C9146ai();
            case 4:
                return new C9145ah();
            case 5:
                return f31566f;
            case 6:
                C63010eb ebVar = f31567g;
                if (ebVar == null) {
                    synchronized (C9146ai.class) {
                        ebVar = f31567g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f31566f);
                            f31567g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
