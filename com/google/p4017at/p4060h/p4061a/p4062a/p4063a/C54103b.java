package com.google.p4017at.p4060h.p4061a.p4062a.p4063a;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.h.a.a.a.b */
/* compiled from: PG */
public final class C54103b extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C54103b f141956g;

    /* renamed from: h */
    private static volatile C63010eb f141957h;

    /* renamed from: a */
    public int f141958a;

    /* renamed from: b */
    public float f141959b = 1.0f;

    /* renamed from: c */
    public float f141960c;

    /* renamed from: d */
    public float f141961d;

    /* renamed from: e */
    public long f141962e;

    /* renamed from: f */
    public boolean f141963f;

    static {
        C54103b bVar = new C54103b();
        f141956g = bVar;
        C62942bv.registerDefaultInstance(C54103b.class, bVar);
    }

    private C54103b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f141956g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ဃ\u0003\u0005ဇ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C54103b();
            case 4:
                return new C54076a();
            case 5:
                return f141956g;
            case 6:
                C63010eb ebVar = f141957h;
                if (ebVar == null) {
                    synchronized (C54103b.class) {
                        ebVar = f141957h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141956g);
                            f141957h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
