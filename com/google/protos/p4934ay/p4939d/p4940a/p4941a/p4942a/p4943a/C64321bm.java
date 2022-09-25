package com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ay.d.a.a.a.a.bm */
/* compiled from: PG */
public final class C64321bm extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C64321bm f173901c;

    /* renamed from: e */
    private static volatile C63010eb f173902e;

    /* renamed from: a */
    public String f173903a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C62971cq f173904b = emptyProtobufList();

    /* renamed from: d */
    private int f173905d;

    static {
        C64321bm bmVar = new C64321bm();
        f173901c = bmVar;
        C62942bv.registerDefaultInstance(C64321bm.class, bmVar);
    }

    private C64321bm() {
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
                return newMessageInfo(f173901c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"d", "a", "b", C64319bk.class});
            case 3:
                return new C64321bm();
            case 4:
                return new C64320bl();
            case 5:
                return f173901c;
            case 6:
                C63010eb ebVar = f173902e;
                if (ebVar == null) {
                    synchronized (C64321bm.class) {
                        ebVar = f173902e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173901c);
                            f173902e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
