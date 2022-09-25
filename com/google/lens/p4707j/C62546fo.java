package com.google.lens.p4707j;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.lens.p4698d.C62163b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.j.fo */
/* compiled from: PG */
public final class C62546fo extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C62546fo f168859g;

    /* renamed from: i */
    private static volatile C63010eb f168860i;

    /* renamed from: a */
    public int f168861a;

    /* renamed from: b */
    public float f168862b = -1.0f;

    /* renamed from: c */
    public int f168863c;

    /* renamed from: d */
    public float f168864d;

    /* renamed from: e */
    public C62163b f168865e;

    /* renamed from: f */
    public C62561gc f168866f;

    /* renamed from: h */
    private byte f168867h = 2;

    static {
        C62546fo foVar = new C62546fo();
        f168859g = foVar;
        C62942bv.registerDefaultInstance(C62546fo.class, foVar);
    }

    private C62546fo() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f168867h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f168867h = b;
                return null;
            case 2:
                return newMessageInfo(f168859g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ခ\u0000\u0002င\u0001\u0003ခ\u0002\u0004ဉ\u0003\u0005ᐉ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C62546fo();
            case 4:
                return new C62545fn();
            case 5:
                return f168859g;
            case 6:
                C63010eb ebVar = f168860i;
                if (ebVar == null) {
                    synchronized (C62546fo.class) {
                        ebVar = f168860i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168859g);
                            f168860i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
