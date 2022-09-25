package com.google.android.apps.gsa.nga.shared.p6364s3.p6365a;

import com.google.android.apps.gsa.nga.shared.p6296ab.p6299b.C80542d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.speech.p5224k.p5225a.C67238p;
import com.google.speech.recognizer.p5233a.C67464l;

/* renamed from: com.google.android.apps.gsa.nga.shared.s3.a.j */
/* compiled from: PG */
public final class C81475j extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C81475j f222893c;

    /* renamed from: e */
    private static volatile C63010eb f222894e;

    /* renamed from: a */
    public int f222895a = 0;

    /* renamed from: b */
    public Object f222896b;

    /* renamed from: d */
    private byte f222897d = 2;

    static {
        C81475j jVar = new C81475j();
        f222893c = jVar;
        C62942bv.registerDefaultInstance(C81475j.class, jVar);
    }

    private C81475j() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f222897d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f222897d = b;
                return null;
            case 2:
                return newMessageInfo(f222893c, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0001\u0001<\u0000\u0002м\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"b", "a", C81467b.class, C67238p.class, C81469d.class, C67464l.class, C81471f.class, C80542d.class});
            case 3:
                return new C81475j();
            case 4:
                return new C81474i();
            case 5:
                return f222893c;
            case 6:
                C63010eb ebVar = f222894e;
                if (ebVar == null) {
                    synchronized (C81475j.class) {
                        ebVar = f222894e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f222893c);
                            f222894e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
