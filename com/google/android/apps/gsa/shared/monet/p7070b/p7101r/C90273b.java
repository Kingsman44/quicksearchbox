package com.google.android.apps.gsa.shared.monet.p7070b.p7101r;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p375ai.p378b.C7681g;
import com.google.p375ai.p378b.C7718hj;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.shared.monet.b.r.b */
/* compiled from: PG */
public final class C90273b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C90273b f252145d;

    /* renamed from: f */
    private static volatile C63010eb f252146f;

    /* renamed from: a */
    public int f252147a;

    /* renamed from: b */
    public C7718hj f252148b;

    /* renamed from: c */
    public int f252149c;

    /* renamed from: e */
    private byte f252150e = 2;

    static {
        C90273b bVar = new C90273b();
        f252145d = bVar;
        C62942bv.registerDefaultInstance(C90273b.class, bVar);
    }

    private C90273b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f252150e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f252150e = b;
                return null;
            case 2:
                return newMessageInfo(f252145d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C45240c.f118157a, C7681g.m22803b()});
            case 3:
                return new C90273b();
            case 4:
                return new C90272a();
            case 5:
                return f252145d;
            case 6:
                C63010eb ebVar = f252146f;
                if (ebVar == null) {
                    synchronized (C90273b.class) {
                        ebVar = f252146f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f252145d);
                            f252146f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
