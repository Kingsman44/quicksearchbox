package com.google.protos.p5068j.p5069a.p5070a.p5071a.p5072a.p5073a.p5074a.p5075a;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80295aq;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.j.a.a.a.a.a.a.a.d */
/* compiled from: PG */
public final class C65477d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C65477d f177983c;

    /* renamed from: e */
    private static volatile C63010eb f177984e;

    /* renamed from: a */
    public C80295aq f177985a;

    /* renamed from: b */
    public C65475b f177986b;

    /* renamed from: d */
    private byte f177987d = 2;

    static {
        C65477d dVar = new C65477d();
        f177983c = dVar;
        C62942bv.registerDefaultInstance(C65477d.class, dVar);
    }

    private C65477d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f177987d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f177987d = b;
                return null;
            case 2:
                return newMessageInfo(f177983c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0001\u0001Љ\u0002\t", new Object[]{"a", "b"});
            case 3:
                return new C65477d();
            case 4:
                return new C65476c();
            case 5:
                return f177983c;
            case 6:
                C63010eb ebVar = f177984e;
                if (ebVar == null) {
                    synchronized (C65477d.class) {
                        ebVar = f177984e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f177983c);
                            f177984e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
