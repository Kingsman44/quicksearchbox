package com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9341a.p9344c;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.wholehome.a.a.c.b */
/* compiled from: PG */
public final class C124186b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C124186b f342938c;

    /* renamed from: d */
    private static volatile C63010eb f342939d;

    /* renamed from: a */
    public C32849cq f342940a;

    /* renamed from: b */
    public C124192h f342941b;

    static {
        C124186b bVar = new C124186b();
        f342938c = bVar;
        C62942bv.registerDefaultInstance(C124186b.class, bVar);
    }

    private C124186b() {
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
                return newMessageInfo(f342938c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"a", "b"});
            case 3:
                return new C124186b();
            case 4:
                return new C124185a();
            case 5:
                return f342938c;
            case 6:
                C63010eb ebVar = f342939d;
                if (ebVar == null) {
                    synchronized (C124186b.class) {
                        ebVar = f342939d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f342938c);
                            f342939d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
