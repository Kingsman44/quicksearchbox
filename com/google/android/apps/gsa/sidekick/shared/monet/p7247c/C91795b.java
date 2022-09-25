package com.google.android.apps.gsa.sidekick.shared.monet.p7247c;

import com.google.android.apps.gsa.shared.monet.p7070b.p7086e.C90229e;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.monet.c.b */
/* compiled from: PG */
public final class C91795b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C91795b f255983c;

    /* renamed from: d */
    private static volatile C63010eb f255984d;

    /* renamed from: a */
    public int f255985a;

    /* renamed from: b */
    public int f255986b;

    static {
        C91795b bVar = new C91795b();
        f255983c = bVar;
        C62942bv.registerDefaultInstance(C91795b.class, bVar);
    }

    private C91795b() {
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
                return newMessageInfo(f255983c, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004ဌ\u0001", new Object[]{"a", "b", C90229e.m146772b()});
            case 3:
                return new C91795b();
            case 4:
                return new C91776a();
            case 5:
                return f255983c;
            case 6:
                C63010eb ebVar = f255984d;
                if (ebVar == null) {
                    synchronized (C91795b.class) {
                        ebVar = f255984d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f255983c);
                            f255984d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
