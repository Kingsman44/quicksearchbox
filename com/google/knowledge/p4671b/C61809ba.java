package com.google.knowledge.p4671b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.knowledge.b.ba */
/* compiled from: PG */
public final class C61809ba extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C61809ba f166976e;

    /* renamed from: f */
    private static volatile C63010eb f166977f;

    /* renamed from: a */
    public int f166978a;

    /* renamed from: b */
    public String f166979b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f166980c = C62942bv.emptyProtobufList();

    /* renamed from: d */
    public String f166981d = BuildConfig.FLAVOR;

    static {
        C61809ba baVar = new C61809ba();
        f166976e = baVar;
        C62942bv.registerDefaultInstance(C61809ba.class, baVar);
    }

    private C61809ba() {
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
                return newMessageInfo(f166976e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001a\u0003ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C61809ba();
            case 4:
                return new C61807az();
            case 5:
                return f166976e;
            case 6:
                C63010eb ebVar = f166977f;
                if (ebVar == null) {
                    synchronized (C61809ba.class) {
                        ebVar = f166977f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f166976e);
                            f166977f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
