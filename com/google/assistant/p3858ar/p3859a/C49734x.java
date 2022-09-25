package com.google.assistant.p3858ar.p3859a;

import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4881ar.p4882a.C63771b;

/* renamed from: com.google.assistant.ar.a.x */
/* compiled from: PG */
public final class C49734x extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C49734x f128410g;

    /* renamed from: j */
    private static volatile C63010eb f128411j;

    /* renamed from: a */
    public int f128412a;

    /* renamed from: b */
    public long f128413b;

    /* renamed from: c */
    public C49720j f128414c;

    /* renamed from: d */
    public boolean f128415d;

    /* renamed from: e */
    public C49732v f128416e;

    /* renamed from: f */
    public C49730t f128417f;

    /* renamed from: h */
    private C63771b f128418h;

    /* renamed from: i */
    private byte f128419i = 2;

    static {
        C49734x xVar = new C49734x();
        f128410g = xVar;
        C62942bv.registerDefaultInstance(C49734x.class, xVar);
    }

    private C49734x() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f128419i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f128419i = b;
                return null;
            case 2:
                return newMessageInfo(f128410g, "\u0001\u0006\u0000\u0001\u0001\n\u0006\u0000\u0000\u0002\u0001ဂ\u0000\u0002ᐉ\u0001\u0005ဇ\u0003\bဉ\u0006\tᐉ\u0007\nဉ\b", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C19618h.f54585a, C10662f.f35572a});
            case 3:
                return new C49734x();
            case 4:
                return new C49733w();
            case 5:
                return f128410g;
            case 6:
                C63010eb ebVar = f128411j;
                if (ebVar == null) {
                    synchronized (C49734x.class) {
                        ebVar = f128411j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f128410g);
                            f128411j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
