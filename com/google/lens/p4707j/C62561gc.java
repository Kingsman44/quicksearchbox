package com.google.lens.p4707j;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4488cj.p4489a.p4490a.p4491a.C58122b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.j.gc */
/* compiled from: PG */
public final class C62561gc extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C62561gc f168901g;

    /* renamed from: i */
    private static volatile C63010eb f168902i;

    /* renamed from: a */
    public int f168903a;

    /* renamed from: b */
    public int f168904b;

    /* renamed from: c */
    public C58122b f168905c;

    /* renamed from: d */
    public int f168906d;

    /* renamed from: e */
    public C62411ao f168907e;

    /* renamed from: f */
    public float f168908f = 1.0f;

    /* renamed from: h */
    private byte f168909h = 2;

    static {
        C62561gc gcVar = new C62561gc();
        f168901g = gcVar;
        C62942bv.registerDefaultInstance(C62561gc.class, gcVar);
    }

    private C62561gc() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f168909h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f168909h = b;
                return null;
            case 2:
                return newMessageInfo(f168901g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ဌ\u0000\u0002ᐉ\u0001\u0003ဌ\u0002\u0004ဉ\u0003\u0005ခ\u0004", new Object[]{"a", "b", C62556fy.f168893a, C45240c.f118157a, "d", C62559ga.f168900a, "e", C10662f.f35572a});
            case 3:
                return new C62561gc();
            case 4:
                return new C62555fx();
            case 5:
                return f168901g;
            case 6:
                C63010eb ebVar = f168902i;
                if (ebVar == null) {
                    synchronized (C62561gc.class) {
                        ebVar = f168902i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168901g);
                            f168902i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
