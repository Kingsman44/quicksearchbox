package com.google.android.apps.search.googleapp.p10544z.p10546b;

import com.google.p4283bv.p4354e.C57528m;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.z.b.g */
/* compiled from: PG */
public final class C139912g extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C62962ci f380329b = new C139910e();

    /* renamed from: c */
    public static final C139912g f380330c;

    /* renamed from: d */
    private static volatile C63010eb f380331d;

    /* renamed from: a */
    public C62961ch f380332a = emptyIntList();

    static {
        C139912g gVar = new C139912g();
        f380330c = gVar;
        C62942bv.registerDefaultInstance(C139912g.class, gVar);
    }

    private C139912g() {
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
                return newMessageInfo(f380330c, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"a", C57528m.m88370b()});
            case 3:
                return new C139912g();
            case 4:
                return new C139911f();
            case 5:
                return f380330c;
            case 6:
                C63010eb ebVar = f380331d;
                if (ebVar == null) {
                    synchronized (C139912g.class) {
                        ebVar = f380331d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f380330c);
                            f380331d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
