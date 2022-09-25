package com.google.assistant.p4008y.p4009a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.y.a.o */
/* compiled from: PG */
public final class C53606o extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C53606o f140698f;

    /* renamed from: h */
    private static volatile C63010eb f140699h;

    /* renamed from: a */
    public int f140700a;

    /* renamed from: b */
    public C53615x f140701b;

    /* renamed from: c */
    public C53602k f140702c;

    /* renamed from: d */
    public C53610s f140703d;

    /* renamed from: e */
    public String f140704e = BuildConfig.FLAVOR;

    /* renamed from: g */
    private byte f140705g = 2;

    static {
        C53606o oVar = new C53606o();
        f140698f = oVar;
        C62942bv.registerDefaultInstance(C53606o.class, oVar);
    }

    private C53606o() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f140705g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f140705g = b;
                return null;
            case 2:
                return newMessageInfo(f140698f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001\u0003ဈ\u0003\u0004ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "e", "d"});
            case 3:
                return new C53606o();
            case 4:
                return new C53605n();
            case 5:
                return f140698f;
            case 6:
                C63010eb ebVar = f140699h;
                if (ebVar == null) {
                    synchronized (C53606o.class) {
                        ebVar = f140699h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140698f);
                            f140699h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
