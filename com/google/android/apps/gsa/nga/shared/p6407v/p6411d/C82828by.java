package com.google.android.apps.gsa.nga.shared.p6407v.p6411d;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80386p;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80388r;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.d.by */
/* compiled from: PG */
public final class C82828by extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C82828by f225698e;

    /* renamed from: g */
    private static volatile C63010eb f225699g;

    /* renamed from: a */
    public int f225700a;

    /* renamed from: b */
    public C80386p f225701b;

    /* renamed from: c */
    public C80388r f225702c;

    /* renamed from: d */
    public C80388r f225703d;

    /* renamed from: f */
    private byte f225704f = 2;

    static {
        C82828by byVar = new C82828by();
        f225698e = byVar;
        C62942bv.registerDefaultInstance(C82828by.class, byVar);
    }

    private C82828by() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f225704f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f225704f = b;
                return null;
            case 2:
                return newMessageInfo(f225698e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C82828by();
            case 4:
                return new C82827bx();
            case 5:
                return f225698e;
            case 6:
                C63010eb ebVar = f225699g;
                if (ebVar == null) {
                    synchronized (C82828by.class) {
                        ebVar = f225699g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f225698e);
                            f225699g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
