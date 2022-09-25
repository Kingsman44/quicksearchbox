package com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9341a.p9344c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.wholehome.a.a.c.f */
/* compiled from: PG */
public final class C124190f extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C124190f f342945c;

    /* renamed from: d */
    private static volatile C63010eb f342946d;

    /* renamed from: a */
    public int f342947a = 0;

    /* renamed from: b */
    public Object f342948b;

    static {
        C124190f fVar = new C124190f();
        f342945c = fVar;
        C62942bv.registerDefaultInstance(C124190f.class, fVar);
    }

    private C124190f() {
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
                return newMessageInfo(f342945c, "\u0000\u0002\u0001\u0000\u0001\u0005\u0002\u0000\u0000\u0000\u0001<\u0000\u0005<\u0000", new Object[]{"b", "a", C124189e.class, C124206v.class});
            case 3:
                return new C124190f();
            case 4:
                return new C124187c();
            case 5:
                return f342945c;
            case 6:
                C63010eb ebVar = f342946d;
                if (ebVar == null) {
                    synchronized (C124190f.class) {
                        ebVar = f342946d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f342945c);
                            f342946d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
