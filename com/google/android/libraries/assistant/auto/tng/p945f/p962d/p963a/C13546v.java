package com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.d.a.v */
/* compiled from: PG */
public final class C13546v extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C13546v f41508e;

    /* renamed from: f */
    private static volatile C63010eb f41509f;

    /* renamed from: a */
    public int f41510a;

    /* renamed from: b */
    public int f41511b;

    /* renamed from: c */
    public C62971cq f41512c = emptyProtobufList();

    /* renamed from: d */
    public C13532h f41513d;

    static {
        C13546v vVar = new C13546v();
        f41508e = vVar;
        C62942bv.registerDefaultInstance(C13546v.class, vVar);
    }

    private C13546v() {
    }

    /* renamed from: a */
    public final void mo21162a() {
        C62971cq cqVar = this.f41512c;
        if (!cqVar.mo58948c()) {
            this.f41512c = C62942bv.mutableCopy(cqVar);
        }
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
                return newMessageInfo(f41508e, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\f\u0002\u001b\u0003ဉ\u0000", new Object[]{"a", "b", C45240c.f118157a, C13530f.class, "d"});
            case 3:
                return new C13546v();
            case 4:
                return new C13544t();
            case 5:
                return f41508e;
            case 6:
                C63010eb ebVar = f41509f;
                if (ebVar == null) {
                    synchronized (C13546v.class) {
                        ebVar = f41509f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f41508e);
                            f41509f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
