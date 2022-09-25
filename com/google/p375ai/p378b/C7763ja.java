package com.google.p375ai.p378b;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.ja */
/* compiled from: PG */
public final class C7763ja extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C7763ja f27187g;

    /* renamed from: i */
    private static volatile C63010eb f27188i;

    /* renamed from: a */
    public int f27189a;

    /* renamed from: b */
    public C7998rt f27190b;

    /* renamed from: c */
    public C7998rt f27191c;

    /* renamed from: d */
    public C7998rt f27192d;

    /* renamed from: e */
    public boolean f27193e;

    /* renamed from: f */
    public C7765jc f27194f;

    /* renamed from: h */
    private byte f27195h = 2;

    static {
        C7763ja jaVar = new C7763ja();
        f27187g = jaVar;
        C62942bv.registerDefaultInstance(C7763ja.class, jaVar);
    }

    private C7763ja() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f27195h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f27195h = b;
                return null;
            case 2:
                return newMessageInfo(f27187g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ဇ\u0003\u0004ᐉ\u0002\u0005ᐉ\u0004", new Object[]{"a", "b", C45240c.f118157a, "e", "d", C10662f.f35572a});
            case 3:
                return new C7763ja();
            case 4:
                return new C7761iz();
            case 5:
                return f27187g;
            case 6:
                C63010eb ebVar = f27188i;
                if (ebVar == null) {
                    synchronized (C7763ja.class) {
                        ebVar = f27188i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f27187g);
                            f27188i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
