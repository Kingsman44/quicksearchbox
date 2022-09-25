package com.google.android.apps.search.googleapp.discover.secondscreen;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4359a.C57060ab;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.discover.secondscreen.e */
/* compiled from: PG */
public final class C134614e extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C134614e f366576d;

    /* renamed from: f */
    private static volatile C63010eb f366577f;

    /* renamed from: a */
    public int f366578a;

    /* renamed from: b */
    public C57060ab f366579b;

    /* renamed from: c */
    public boolean f366580c;

    /* renamed from: e */
    private byte f366581e = 2;

    static {
        C134614e eVar = new C134614e();
        f366576d = eVar;
        C62942bv.registerDefaultInstance(C134614e.class, eVar);
    }

    private C134614e() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f366581e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f366581e = b;
                return null;
            case 2:
                return newMessageInfo(f366576d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C134614e();
            case 4:
                return new C134613d();
            case 5:
                return f366576d;
            case 6:
                C63010eb ebVar = f366577f;
                if (ebVar == null) {
                    synchronized (C134614e.class) {
                        ebVar = f366577f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f366576d);
                            f366577f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
