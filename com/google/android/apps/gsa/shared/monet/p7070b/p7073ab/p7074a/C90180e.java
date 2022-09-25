package com.google.android.apps.gsa.shared.monet.p7070b.p7073ab.p7074a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.shared.monet.b.ab.a.e */
/* compiled from: PG */
public final class C90180e extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C62962ci f251948b = new C90176a();

    /* renamed from: c */
    public static final C90180e f251949c;

    /* renamed from: d */
    private static volatile C63010eb f251950d;

    /* renamed from: a */
    public C62961ch f251951a = emptyIntList();

    static {
        C90180e eVar = new C90180e();
        f251949c = eVar;
        C62942bv.registerDefaultInstance(C90180e.class, eVar);
    }

    private C90180e() {
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
                return newMessageInfo(f251949c, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"a", C90179d.m146749b()});
            case 3:
                return new C90180e();
            case 4:
                return new C90177b();
            case 5:
                return f251949c;
            case 6:
                C63010eb ebVar = f251950d;
                if (ebVar == null) {
                    synchronized (C90180e.class) {
                        ebVar = f251950d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f251949c);
                            f251950d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
