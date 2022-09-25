package com.google.assistant.p3897e.p3921j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.jk */
/* compiled from: PG */
public final class C52213jk extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C52213jk f137019a;

    /* renamed from: e */
    private static volatile C63010eb f137020e;

    /* renamed from: b */
    private int f137021b;

    /* renamed from: c */
    private C52219jq f137022c;

    /* renamed from: d */
    private C52227jy f137023d;

    static {
        C52213jk jkVar = new C52213jk();
        f137019a = jkVar;
        C62942bv.registerDefaultInstance(C52213jk.class, jkVar);
    }

    private C52213jk() {
    }

    /* renamed from: d */
    public static C63010eb m86542d() {
        return f137019a.getParserForType();
    }

    /* renamed from: a */
    public final boolean mo53814a() {
        return (this.f137021b & 1) != 0;
    }

    /* renamed from: b */
    public final C52219jq mo53815b() {
        C52219jq jqVar = this.f137022c;
        return jqVar == null ? C52219jq.f137030b : jqVar;
    }

    /* renamed from: c */
    public final C52227jy mo53816c() {
        C52227jy jyVar = this.f137023d;
        return jyVar == null ? C52227jy.f137049b : jyVar;
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
                return newMessageInfo(f137019a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဉ\u0002", new Object[]{"b", C45240c.f118157a, "d"});
            case 3:
                return new C52213jk();
            case 4:
                return new C52212jj();
            case 5:
                return f137019a;
            case 6:
                C63010eb ebVar = f137020e;
                if (ebVar == null) {
                    synchronized (C52213jk.class) {
                        ebVar = f137020e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137019a);
                            f137020e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
