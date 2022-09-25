package com.google.p395al.p398b.p399a.p400a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.al.b.a.a.g */
/* compiled from: PG */
public final class C8423g extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C8423g f29294f;

    /* renamed from: i */
    private static volatile C63010eb f29295i;

    /* renamed from: a */
    public int f29296a;

    /* renamed from: b */
    public C8421e f29297b;

    /* renamed from: c */
    public C8427k f29298c;

    /* renamed from: d */
    public C8419c f29299d;

    /* renamed from: e */
    public boolean f29300e;

    /* renamed from: g */
    private C8425i f29301g;

    /* renamed from: h */
    private byte f29302h = 2;

    static {
        C8423g gVar = new C8423g();
        f29294f = gVar;
        C62942bv.registerDefaultInstance(C8423g.class, gVar);
    }

    private C8423g() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f29302h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f29302h = b;
                return null;
            case 2:
                return newMessageInfo(f29294f, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0002\u0001ᐉ\u0000\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဇ\u0004\u0007ᐉ\u0007", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C30325g.f82003a});
            case 3:
                return new C8423g();
            case 4:
                return new C8422f();
            case 5:
                return f29294f;
            case 6:
                C63010eb ebVar = f29295i;
                if (ebVar == null) {
                    synchronized (C8423g.class) {
                        ebVar = f29295i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29294f);
                            f29295i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
