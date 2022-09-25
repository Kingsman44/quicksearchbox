package com.google.p4283bv.p4354e.p4356b.p4358b.p4359a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.b.b.a.af */
/* compiled from: PG */
public final class C57064af extends C62937bq implements C62938br {

    /* renamed from: e */
    public static final C57064af f152334e;

    /* renamed from: g */
    private static volatile C63010eb f152335g;

    /* renamed from: a */
    public int f152336a;

    /* renamed from: b */
    public String f152337b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public boolean f152338c;

    /* renamed from: d */
    public boolean f152339d;

    /* renamed from: f */
    private byte f152340f = 2;

    static {
        C57064af afVar = new C57064af();
        f152334e = afVar;
        C62942bv.registerDefaultInstance(C57064af.class, afVar);
    }

    private C57064af() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f152340f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f152340f = b;
                return null;
            case 2:
                return newMessageInfo(f152334e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဇ\u0001\u0004ဇ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C57064af();
            case 4:
                return new C57063ae();
            case 5:
                return f152334e;
            case 6:
                C63010eb ebVar = f152335g;
                if (ebVar == null) {
                    synchronized (C57064af.class) {
                        ebVar = f152335g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152334e);
                            f152335g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
