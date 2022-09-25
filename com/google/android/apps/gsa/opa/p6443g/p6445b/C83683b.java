package com.google.android.apps.gsa.opa.p6443g.p6445b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3803ag.p3804a.C48851br;
import com.google.assistant.p3803ag.p3804a.C48871n;
import com.google.assistant.p3803ag.p3804a.C48875r;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.opa.g.b.b */
/* compiled from: PG */
public final class C83683b extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C83683b f228105f;

    /* renamed from: h */
    private static volatile C63010eb f228106h;

    /* renamed from: a */
    public int f228107a;

    /* renamed from: b */
    public int f228108b = 1;

    /* renamed from: c */
    public C48871n f228109c;

    /* renamed from: d */
    public C48851br f228110d;

    /* renamed from: e */
    public int f228111e;

    /* renamed from: g */
    private byte f228112g = 2;

    static {
        C83683b bVar = new C83683b();
        f228105f = bVar;
        C62942bv.registerDefaultInstance(C83683b.class, bVar);
    }

    private C83683b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f228112g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f228112g = b;
                return null;
            case 2:
                return newMessageInfo(f228105f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ဌ\u0000\u0002ᐉ\u0001\u0003ဉ\u0002\u0004ဌ\u0003", new Object[]{"a", "b", C83686e.f228121a, C45240c.f118157a, "d", "e", C48875r.f126482a});
            case 3:
                return new C83683b();
            case 4:
                return new C83682a();
            case 5:
                return f228105f;
            case 6:
                C63010eb ebVar = f228106h;
                if (ebVar == null) {
                    synchronized (C83683b.class) {
                        ebVar = f228106h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f228105f);
                            f228106h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
