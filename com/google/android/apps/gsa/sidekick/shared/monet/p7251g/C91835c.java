package com.google.android.apps.gsa.sidekick.shared.monet.p7251g;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.monet.g.c */
/* compiled from: PG */
public final class C91835c extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C91835c f256110a;

    /* renamed from: c */
    private static volatile C63010eb f256111c;

    /* renamed from: b */
    private byte f256112b = 2;

    static {
        C91835c cVar = new C91835c();
        f256110a = cVar;
        C62942bv.registerDefaultInstance(C91835c.class, cVar);
    }

    private C91835c() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f256112b);
            case 1:
                this.f256112b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f256110a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C91835c();
            case 4:
                return new C91834b();
            case 5:
                return f256110a;
            case 6:
                C63010eb ebVar = f256111c;
                if (ebVar == null) {
                    synchronized (C91835c.class) {
                        ebVar = f256111c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f256110a);
                            f256111c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
