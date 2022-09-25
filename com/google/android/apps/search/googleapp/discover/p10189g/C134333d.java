package com.google.android.apps.search.googleapp.discover.p10189g;

import com.google.android.apps.search.googleapp.discover.p10214s.C134589g;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4359a.C57080av;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.discover.g.d */
/* compiled from: PG */
public final class C134333d extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C134333d f365899d;

    /* renamed from: f */
    private static volatile C63010eb f365900f;

    /* renamed from: a */
    public int f365901a;

    /* renamed from: b */
    public C57080av f365902b;

    /* renamed from: c */
    public C134589g f365903c;

    /* renamed from: e */
    private byte f365904e = 2;

    static {
        C134333d dVar = new C134333d();
        f365899d = dVar;
        C62942bv.registerDefaultInstance(C134333d.class, dVar);
    }

    private C134333d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f365904e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f365904e = b;
                return null;
            case 2:
                return newMessageInfo(f365899d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C134333d();
            case 4:
                return new C134332c();
            case 5:
                return f365899d;
            case 6:
                C63010eb ebVar = f365900f;
                if (ebVar == null) {
                    synchronized (C134333d.class) {
                        ebVar = f365900f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f365899d);
                            f365900f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
