package com.google.p4283bv.p4354e.p4356b.p4365c.p4366a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.b.c.a.cm */
/* compiled from: PG */
public final class C57285cm extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C57285cm f152919f;

    /* renamed from: g */
    private static volatile C63010eb f152920g;

    /* renamed from: a */
    public int f152921a;

    /* renamed from: b */
    public String f152922b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public long f152923c;

    /* renamed from: d */
    public String f152924d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C62971cq f152925e = C62942bv.emptyProtobufList();

    static {
        C57285cm cmVar = new C57285cm();
        f152919f = cmVar;
        C62942bv.registerDefaultInstance(C57285cm.class, cmVar);
    }

    private C57285cm() {
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
                return newMessageInfo(f152919f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004\u001a", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C57285cm();
            case 4:
                return new C57284cl();
            case 5:
                return f152919f;
            case 6:
                C63010eb ebVar = f152920g;
                if (ebVar == null) {
                    synchronized (C57285cm.class) {
                        ebVar = f152920g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152919f);
                            f152920g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
