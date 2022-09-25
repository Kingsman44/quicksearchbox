package com.google.p4102au.p4103a.p4104a.p4105a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.au.a.a.a.b */
/* compiled from: PG */
public final class C54564b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C54564b f143253a;

    /* renamed from: g */
    private static volatile C63010eb f143254g;

    /* renamed from: b */
    private int f143255b;

    /* renamed from: c */
    private int f143256c;

    /* renamed from: d */
    private String f143257d = BuildConfig.FLAVOR;

    /* renamed from: e */
    private int f143258e;

    /* renamed from: f */
    private byte f143259f = 2;

    static {
        C54564b bVar = new C54564b();
        f143253a = bVar;
        C62942bv.registerDefaultInstance(C54564b.class, bVar);
    }

    private C54564b() {
        emptyProtobufList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f143259f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f143259f = b;
                return null;
            case 2:
                return newMessageInfo(f143253a, "\u0001\u0003\u0000\u0001\u0003\u0005\u0003\u0000\u0000\u0003\u0003ᔄ\u0000\u0004ᔈ\u0002\u0005ᔄ\u0003", new Object[]{"b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C54564b();
            case 4:
                return new C54563a();
            case 5:
                return f143253a;
            case 6:
                C63010eb ebVar = f143254g;
                if (ebVar == null) {
                    synchronized (C54564b.class) {
                        ebVar = f143254g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143253a);
                            f143254g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
