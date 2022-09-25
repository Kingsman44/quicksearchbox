package com.google.android.libraries.componentview.components.base.p1687a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.componentview.components.base.a.v */
/* compiled from: PG */
public final class C19999v extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C19999v f56041b;

    /* renamed from: c */
    private static volatile C63010eb f56042c;

    /* renamed from: a */
    public C62961ch f56043a = emptyIntList();

    static {
        C19999v vVar = new C19999v();
        f56041b = vVar;
        C62942bv.registerDefaultInstance(C19999v.class, vVar);
    }

    private C19999v() {
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
                return newMessageInfo(f56041b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"a", C19997t.f56040a});
            case 3:
                return new C19999v();
            case 4:
                return new C19996s();
            case 5:
                return f56041b;
            case 6:
                C63010eb ebVar = f56042c;
                if (ebVar == null) {
                    synchronized (C19999v.class) {
                        ebVar = f56042c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f56041b);
                            f56042c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
