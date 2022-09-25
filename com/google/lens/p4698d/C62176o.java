package com.google.lens.p4698d;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.d.o */
/* compiled from: PG */
public final class C62176o extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C62176o f167863g;

    /* renamed from: i */
    private static volatile C63010eb f167864i;

    /* renamed from: a */
    public int f167865a;

    /* renamed from: b */
    public long f167866b;

    /* renamed from: c */
    public int f167867c;

    /* renamed from: d */
    public int f167868d;

    /* renamed from: e */
    public int f167869e;

    /* renamed from: f */
    public C62178q f167870f;

    /* renamed from: h */
    private byte f167871h = 2;

    static {
        C62176o oVar = new C62176o();
        f167863g = oVar;
        C62942bv.registerDefaultInstance(C62176o.class, oVar);
    }

    private C62176o() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f167871h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f167871h = b;
                return null;
            case 2:
                return newMessageInfo(f167863g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ဂ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဌ\u0003\u0005ᐉ\u0004", new Object[]{"a", "b", C45240c.f118157a, C62172k.f167860a, "d", C62173l.f167861a, "e", C62174m.f167862a, C10662f.f35572a});
            case 3:
                return new C62176o();
            case 4:
                return new C62175n();
            case 5:
                return f167863g;
            case 6:
                C63010eb ebVar = f167864i;
                if (ebVar == null) {
                    synchronized (C62176o.class) {
                        ebVar = f167864i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167863g);
                            f167864i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
