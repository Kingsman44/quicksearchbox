package com.google.android.libraries.gsa.monet.tools.children.shared.p1915a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.gsa.monet.tools.children.shared.a.b */
/* compiled from: PG */
public final class C23232b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C23232b f63678c;

    /* renamed from: d */
    private static volatile C63010eb f63679d;

    /* renamed from: a */
    public int f63680a;

    /* renamed from: b */
    public boolean f63681b;

    static {
        C23232b bVar = new C23232b();
        f63678c = bVar;
        C62942bv.registerDefaultInstance(C23232b.class, bVar);
    }

    private C23232b() {
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
                return newMessageInfo(f63678c, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C23232b();
            case 4:
                return new C23231a();
            case 5:
                return f63678c;
            case 6:
                C63010eb ebVar = f63679d;
                if (ebVar == null) {
                    synchronized (C23232b.class) {
                        ebVar = f63679d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f63678c);
                            f63679d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
