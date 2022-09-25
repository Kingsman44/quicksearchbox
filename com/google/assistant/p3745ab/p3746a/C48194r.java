package com.google.assistant.p3745ab.p3746a;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.a.r */
/* compiled from: PG */
public final class C48194r extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C48194r f124712g;

    /* renamed from: i */
    private static volatile C63010eb f124713i;

    /* renamed from: a */
    public int f124714a;

    /* renamed from: b */
    public C48178b f124715b;

    /* renamed from: c */
    public C48184h f124716c;

    /* renamed from: d */
    public C48186j f124717d;

    /* renamed from: e */
    public C48193q f124718e;

    /* renamed from: f */
    public C48190n f124719f;

    /* renamed from: h */
    private byte f124720h = 2;

    static {
        C48194r rVar = new C48194r();
        f124712g = rVar;
        C62942bv.registerDefaultInstance(C48194r.class, rVar);
    }

    private C48194r() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f124720h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f124720h = b;
                return null;
            case 2:
                return newMessageInfo(f124712g, "\u0001\u0005\u0000\u0001\u0001\n\u0005\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001\u0005ဉ\u0004\u0006ဉ\u0005\nဉ\t", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C48194r();
            case 4:
                return new C48179c();
            case 5:
                return f124712g;
            case 6:
                C63010eb ebVar = f124713i;
                if (ebVar == null) {
                    synchronized (C48194r.class) {
                        ebVar = f124713i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124712g);
                            f124713i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
