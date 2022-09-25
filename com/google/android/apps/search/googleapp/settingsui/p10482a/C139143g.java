package com.google.android.apps.search.googleapp.settingsui.p10482a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.settingsui.a.g */
/* compiled from: PG */
public final class C139143g extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C139143g f378433c;

    /* renamed from: d */
    private static volatile C63010eb f378434d;

    /* renamed from: a */
    public int f378435a = 0;

    /* renamed from: b */
    public Object f378436b;

    static {
        C139143g gVar = new C139143g();
        f378433c = gVar;
        C62942bv.registerDefaultInstance(C139143g.class, gVar);
    }

    private C139143g() {
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
                return newMessageInfo(f378433c, "\u0001\u0002\u0001\u0000\u0004\u0005\u0002\u0000\u0000\u0000\u0004ြ\u0000\u0005ြ\u0000", new Object[]{"b", "a", C139140d.class, C139145i.class});
            case 3:
                return new C139143g();
            case 4:
                return new C139141e();
            case 5:
                return f378433c;
            case 6:
                C63010eb ebVar = f378434d;
                if (ebVar == null) {
                    synchronized (C139143g.class) {
                        ebVar = f378434d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f378433c);
                            f378434d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
