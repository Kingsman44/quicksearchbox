package com.google.android.libraries.assistant.p1363c.p1398g.p1436k;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3929l.p3930a.C52796x;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.speech.p5208h.C66607ce;
import com.google.speech.p5208h.p5210b.C66572b;
import com.google.speech.p5224k.p5225a.C67190ah;
import com.google.speech.p5230n.p5232b.C67402ar;

/* renamed from: com.google.android.libraries.assistant.c.g.k.au */
/* compiled from: PG */
public final class C17485au extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C17485au f50481h;

    /* renamed from: j */
    private static volatile C63010eb f50482j;

    /* renamed from: a */
    public int f50483a;

    /* renamed from: b */
    public int f50484b = 0;

    /* renamed from: c */
    public Object f50485c;

    /* renamed from: d */
    public int f50486d;

    /* renamed from: e */
    public C52796x f50487e;

    /* renamed from: f */
    public long f50488f = 10000;

    /* renamed from: g */
    public C66607ce f50489g;

    /* renamed from: i */
    private byte f50490i = 2;

    static {
        C17485au auVar = new C17485au();
        f50481h = auVar;
        C62942bv.registerDefaultInstance(C17485au.class, auVar);
    }

    private C17485au() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f50490i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f50490i = b;
                return null;
            case 2:
                return newMessageInfo(f50481h, "\u0001\u0007\u0001\u0001\u0002\b\u0007\u0000\u0000\u0004\u0002ᐼ\u0000\u0003ᐼ\u0000\u0004ᐼ\u0000\u0005ဌ\u0003\u0006ဉ\u0004\u0007ဂ\u0005\bᐉ\u0006", new Object[]{C45240c.f118157a, "b", "a", C67402ar.class, C67190ah.class, C66572b.class, "d", C17484at.m34787b(), "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C17485au();
            case 4:
                return new C17482ar();
            case 5:
                return f50481h;
            case 6:
                C63010eb ebVar = f50482j;
                if (ebVar == null) {
                    synchronized (C17485au.class) {
                        ebVar = f50482j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f50481h);
                            f50482j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
