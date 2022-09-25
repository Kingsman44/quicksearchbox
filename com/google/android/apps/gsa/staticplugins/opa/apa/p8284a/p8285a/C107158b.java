package com.google.android.apps.gsa.staticplugins.opa.apa.p8284a.p8285a;

import com.google.assistant.p3897e.p3921j.C51715bm;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.apa.a.a.b */
/* compiled from: PG */
public final class C107158b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C107158b f298279c;

    /* renamed from: e */
    private static volatile C63010eb f298280e;

    /* renamed from: a */
    public C63042fg f298281a;

    /* renamed from: b */
    public C51715bm f298282b;

    /* renamed from: d */
    private byte f298283d = 2;

    static {
        C107158b bVar = new C107158b();
        f298279c = bVar;
        C62942bv.registerDefaultInstance(C107158b.class, bVar);
    }

    private C107158b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f298283d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f298283d = b;
                return null;
            case 2:
                return newMessageInfo(f298279c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0001\u0001\t\u0002Љ", new Object[]{"a", "b"});
            case 3:
                return new C107158b();
            case 4:
                return new C107157a();
            case 5:
                return f298279c;
            case 6:
                C63010eb ebVar = f298280e;
                if (ebVar == null) {
                    synchronized (C107158b.class) {
                        ebVar = f298280e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f298279c);
                            f298280e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
