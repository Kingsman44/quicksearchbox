package com.google.android.apps.search.assistant.surfaces.p9372b.p9379d.p9380a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.b.d.a.i */
/* compiled from: PG */
public final class C124484i extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C124484i f343528c;

    /* renamed from: d */
    private static volatile C63010eb f343529d;

    /* renamed from: a */
    public int f343530a;

    /* renamed from: b */
    public int f343531b;

    static {
        C124484i iVar = new C124484i();
        f343528c = iVar;
        C62942bv.registerDefaultInstance(C124484i.class, iVar);
    }

    private C124484i() {
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
                return newMessageInfo(f343528c, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C124484i();
            case 4:
                return new C124483h();
            case 5:
                return f343528c;
            case 6:
                C63010eb ebVar = f343529d;
                if (ebVar == null) {
                    synchronized (C124484i.class) {
                        ebVar = f343529d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f343528c);
                            f343529d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
