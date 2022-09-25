package com.google.android.apps.gsa.sidekick.shared.monet.p7247c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p375ai.p378b.C7682ga;
import com.google.p4283bv.p4354e.p4356b.C57057b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.monet.c.al */
/* compiled from: PG */
public final class C91788al extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C91788al f255957d;

    /* renamed from: f */
    private static volatile C63010eb f255958f;

    /* renamed from: a */
    public int f255959a;

    /* renamed from: b */
    public C7682ga f255960b;

    /* renamed from: c */
    public C57057b f255961c;

    /* renamed from: e */
    private byte f255962e = 2;

    static {
        C91788al alVar = new C91788al();
        f255957d = alVar;
        C62942bv.registerDefaultInstance(C91788al.class, alVar);
    }

    private C91788al() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f255962e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f255962e = b;
                return null;
            case 2:
                return newMessageInfo(f255957d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C91788al();
            case 4:
                return new C91787ak();
            case 5:
                return f255957d;
            case 6:
                C63010eb ebVar = f255958f;
                if (ebVar == null) {
                    synchronized (C91788al.class) {
                        ebVar = f255958f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f255957d);
                            f255958f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
