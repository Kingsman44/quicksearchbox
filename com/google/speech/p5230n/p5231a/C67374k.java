package com.google.speech.p5230n.p5231a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.n.a.k */
/* compiled from: PG */
public final class C67374k extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C67374k f183133d;

    /* renamed from: f */
    private static volatile C63010eb f183134f;

    /* renamed from: a */
    public int f183135a;

    /* renamed from: b */
    public String f183136b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f183137c = emptyProtobufList();

    /* renamed from: e */
    private byte f183138e = 2;

    static {
        C67374k kVar = new C67374k();
        f183133d = kVar;
        C62942bv.registerDefaultInstance(C67374k.class, kVar);
    }

    private C67374k() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f183138e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f183138e = b;
                return null;
            case 2:
                return newMessageInfo(f183133d, "\u0001\u0002\u0000\u0001\u0002\u0005\u0002\u0000\u0001\u0001\u0002ဈ\u0002\u0005Л", new Object[]{"a", "b", C45240c.f118157a, C67379p.class});
            case 3:
                return new C67374k();
            case 4:
                return new C67373j();
            case 5:
                return f183133d;
            case 6:
                C63010eb ebVar = f183134f;
                if (ebVar == null) {
                    synchronized (C67374k.class) {
                        ebVar = f183134f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183133d);
                            f183134f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
