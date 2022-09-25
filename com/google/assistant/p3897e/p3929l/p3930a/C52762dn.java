package com.google.assistant.p3897e.p3929l.p3930a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.l.a.dn */
/* compiled from: PG */
public final class C52762dn extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C52762dn f138454a;

    /* renamed from: e */
    private static volatile C63010eb f138455e;

    /* renamed from: b */
    private C62995dn f138456b = C62995dn.f170057a;

    /* renamed from: c */
    private C62995dn f138457c;

    /* renamed from: d */
    private C62995dn f138458d;

    static {
        C52762dn dnVar = new C52762dn();
        f138454a = dnVar;
        C62942bv.registerDefaultInstance(C52762dn.class, dnVar);
    }

    private C52762dn() {
        C62995dn dnVar = C62995dn.f170057a;
        this.f138457c = dnVar;
        this.f138458d = dnVar;
        emptyProtobufList();
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
                return newMessageInfo(f138454a, "\u0001\u0003\u0000\u0000\u0002\u0006\u0003\u0003\u0000\u0000\u00022\u00052\u00062", new Object[]{"b", C52761dm.f138453a, C45240c.f118157a, C52759dk.f138451a, "d", C52760dl.f138452a});
            case 3:
                return new C52762dn();
            case 4:
                return new C52758dj();
            case 5:
                return f138454a;
            case 6:
                C63010eb ebVar = f138455e;
                if (ebVar == null) {
                    synchronized (C52762dn.class) {
                        ebVar = f138455e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138454a);
                            f138455e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
