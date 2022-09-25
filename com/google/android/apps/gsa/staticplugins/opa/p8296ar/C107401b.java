package com.google.android.apps.gsa.staticplugins.opa.p8296ar;

import com.google.assistant.p3803ag.p3804a.C48865h;
import com.google.assistant.p3803ag.p3807b.p3808a.C48904f;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ar.b */
/* compiled from: PG */
public final class C107401b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C107401b f298911c;

    /* renamed from: d */
    public static final C62940bt f298912d;

    /* renamed from: f */
    private static volatile C63010eb f298913f;

    /* renamed from: a */
    public int f298914a;

    /* renamed from: b */
    public C48865h f298915b;

    /* renamed from: e */
    private byte f298916e = 2;

    static {
        C107401b bVar = new C107401b();
        f298911c = bVar;
        C62942bv.registerDefaultInstance(C107401b.class, bVar);
        f298912d = C62942bv.newSingularGeneratedExtension(C48904f.f126552a, bVar, bVar, (C62958ce) null, 269972701, C63066gd.MESSAGE, C107401b.class);
    }

    private C107401b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f298916e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f298916e = b;
                return null;
            case 2:
                return newMessageInfo(f298911c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C107401b();
            case 4:
                return new C107386a();
            case 5:
                return f298911c;
            case 6:
                C63010eb ebVar = f298913f;
                if (ebVar == null) {
                    synchronized (C107401b.class) {
                        ebVar = f298913f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f298911c);
                            f298913f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
