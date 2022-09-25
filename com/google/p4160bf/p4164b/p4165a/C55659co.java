package com.google.p4160bf.p4164b.p4165a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bf.b.a.co */
/* compiled from: PG */
public final class C55659co extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C55659co f146861f;

    /* renamed from: g */
    private static volatile C63010eb f146862g;

    /* renamed from: a */
    public int f146863a;

    /* renamed from: b */
    public int f146864b = 0;

    /* renamed from: c */
    public Object f146865c;

    /* renamed from: d */
    public String f146866d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C62971cq f146867e = C62942bv.emptyProtobufList();

    static {
        C55659co coVar = new C55659co();
        f146861f = coVar;
        C62942bv.registerDefaultInstance(C55659co.class, coVar);
    }

    private C55659co() {
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
                return newMessageInfo(f146861f, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ြ\u0000\u0002ဿ\u0000\u0003\u001a\u0004ဈ\u0002", new Object[]{C45240c.f118157a, "b", "a", C55657cm.class, C55681u.f146906a, "e", "d"});
            case 3:
                return new C55659co();
            case 4:
                return new C55658cn();
            case 5:
                return f146861f;
            case 6:
                C63010eb ebVar = f146862g;
                if (ebVar == null) {
                    synchronized (C55659co.class) {
                        ebVar = f146862g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146861f);
                            f146862g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
