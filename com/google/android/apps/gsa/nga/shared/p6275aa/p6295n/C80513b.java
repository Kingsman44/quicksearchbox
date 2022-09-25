package com.google.android.apps.gsa.nga.shared.p6275aa.p6295n;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.knowledge.p4661a.p4662a.C61752n;
import com.google.nlp.p4735b.p4736a.C62841h;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.n.b */
/* compiled from: PG */
public final class C80513b extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C80513b f221014e;

    /* renamed from: g */
    private static volatile C63010eb f221015g;

    /* renamed from: a */
    public C61752n f221016a;

    /* renamed from: b */
    public C62841h f221017b;

    /* renamed from: c */
    public float f221018c;

    /* renamed from: d */
    public int f221019d;

    /* renamed from: f */
    private byte f221020f = 2;

    static {
        C80513b bVar = new C80513b();
        f221014e = bVar;
        C62942bv.registerDefaultInstance(C80513b.class, bVar);
    }

    private C80513b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f221020f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f221020f = b;
                return null;
            case 2:
                return newMessageInfo(f221014e, "\u0000\u0004\u0000\u0000\u0001\u0005\u0004\u0000\u0000\u0002\u0001Љ\u0003\u0001\u0004\f\u0005Љ", new Object[]{"a", C45240c.f118157a, "d", "b"});
            case 3:
                return new C80513b();
            case 4:
                return new C80512a();
            case 5:
                return f221014e;
            case 6:
                C63010eb ebVar = f221015g;
                if (ebVar == null) {
                    synchronized (C80513b.class) {
                        ebVar = f221015g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f221014e);
                            f221015g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
