package com.google.assistant.p3803ag.p3804a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.a.h */
/* compiled from: PG */
public final class C48865h extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C48865h f126455f;

    /* renamed from: h */
    private static volatile C63010eb f126456h;

    /* renamed from: a */
    public int f126457a;

    /* renamed from: b */
    public int f126458b = 0;

    /* renamed from: c */
    public Object f126459c;

    /* renamed from: d */
    public int f126460d;

    /* renamed from: e */
    public C48869l f126461e;

    /* renamed from: g */
    private byte f126462g = 2;

    static {
        C48865h hVar = new C48865h();
        f126455f = hVar;
        C62942bv.registerDefaultInstance(C48865h.class, hVar);
    }

    private C48865h() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f126462g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f126462g = b;
                return null;
            case 2:
                return newMessageInfo(f126455f, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0002\u0001ဌ\u0000\u0002ᐉ\u0001\u0003ြ\u0000\u0004ᐼ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", C48864g.m85286b(), "e", C48851br.class, C48862e.class});
            case 3:
                return new C48865h();
            case 4:
                return new C48860c();
            case 5:
                return f126455f;
            case 6:
                C63010eb ebVar = f126456h;
                if (ebVar == null) {
                    synchronized (C48865h.class) {
                        ebVar = f126456h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126455f);
                            f126456h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
