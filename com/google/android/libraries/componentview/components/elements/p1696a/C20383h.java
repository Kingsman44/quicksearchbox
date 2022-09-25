package com.google.android.libraries.componentview.components.elements.p1696a;

import com.google.p4271bq.C56425d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.libraries.componentview.components.elements.a.h */
/* compiled from: PG */
public final class C20383h extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C20383h f57312c;

    /* renamed from: d */
    public static final C62940bt f57313d;

    /* renamed from: f */
    private static volatile C63010eb f57314f;

    /* renamed from: a */
    public int f57315a;

    /* renamed from: b */
    public C56425d f57316b;

    /* renamed from: e */
    private byte f57317e = 2;

    static {
        C20383h hVar = new C20383h();
        f57312c = hVar;
        C62942bv.registerDefaultInstance(C20383h.class, hVar);
        f57313d = C62942bv.newSingularGeneratedExtension(C56425d.f150537g, hVar, hVar, (C62958ce) null, 121133791, C63066gd.MESSAGE, C20383h.class);
    }

    private C20383h() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f57317e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f57317e = b;
                return null;
            case 2:
                return newMessageInfo(f57312c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C20383h();
            case 4:
                return new C20382g();
            case 5:
                return f57312c;
            case 6:
                C63010eb ebVar = f57314f;
                if (ebVar == null) {
                    synchronized (C20383h.class) {
                        ebVar = f57314f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f57312c);
                            f57314f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
