package com.google.android.libraries.notifications.p2292g;

import com.google.p4160bf.p4164b.p4165a.p4166a.C55540at;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.notifications.g.f */
/* compiled from: PG */
public final class C29998f extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C62962ci f81207b = new C29996d();

    /* renamed from: c */
    public static final C29998f f81208c;

    /* renamed from: d */
    private static volatile C63010eb f81209d;

    /* renamed from: a */
    public C62961ch f81210a = emptyIntList();

    static {
        C29998f fVar = new C29998f();
        f81208c = fVar;
        C62942bv.registerDefaultInstance(C29998f.class, fVar);
    }

    private C29998f() {
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
                return newMessageInfo(f81208c, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"a", C55540at.m87705b()});
            case 3:
                return new C29998f();
            case 4:
                return new C29997e();
            case 5:
                return f81208c;
            case 6:
                C63010eb ebVar = f81209d;
                if (ebVar == null) {
                    synchronized (C29998f.class) {
                        ebVar = f81209d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f81208c);
                            f81209d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
