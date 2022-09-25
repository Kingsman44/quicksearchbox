package com.google.android.libraries.assistant.auto.tng.p1008j.p1014c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.j.c.p */
/* compiled from: PG */
public final class C13703p extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C13703p f41793f;

    /* renamed from: h */
    private static volatile C63010eb f41794h;

    /* renamed from: a */
    public int f41795a;

    /* renamed from: b */
    public int f41796b = 0;

    /* renamed from: c */
    public Object f41797c;

    /* renamed from: d */
    public String f41798d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f41799e = BuildConfig.FLAVOR;

    /* renamed from: g */
    private byte f41800g = 2;

    static {
        C13703p pVar = new C13703p();
        f41793f = pVar;
        C62942bv.registerDefaultInstance(C13703p.class, pVar);
    }

    private C13703p() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f41800g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f41800g = b;
                return null;
            case 2:
                return newMessageInfo(f41793f, "\u0000\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0002\u0001ለ\u0000\u0002<\u0000\u0003<\u0000\u0004м\u0000\u0005<\u0000\u0006ለ\u0001\u0007м\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", C13697j.class, C13701n.class, C13658d.class, C13690f.class, "e", C13650b.class});
            case 3:
                return new C13703p();
            case 4:
                return new C13702o();
            case 5:
                return f41793f;
            case 6:
                C63010eb ebVar = f41794h;
                if (ebVar == null) {
                    synchronized (C13703p.class) {
                        ebVar = f41794h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f41793f);
                            f41794h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
