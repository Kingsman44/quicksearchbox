package com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9341a.p9344c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.wholehome.a.a.c.e */
/* compiled from: PG */
public final class C124189e extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C124189e f342942b;

    /* renamed from: c */
    private static volatile C63010eb f342943c;

    /* renamed from: a */
    public C124186b f342944a;

    static {
        C124189e eVar = new C124189e();
        f342942b = eVar;
        C62942bv.registerDefaultInstance(C124189e.class, eVar);
    }

    private C124189e() {
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
                return newMessageInfo(f342942b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            case 3:
                return new C124189e();
            case 4:
                return new C124188d();
            case 5:
                return f342942b;
            case 6:
                C63010eb ebVar = f342943c;
                if (ebVar == null) {
                    synchronized (C124189e.class) {
                        ebVar = f342943c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f342942b);
                            f342943c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
