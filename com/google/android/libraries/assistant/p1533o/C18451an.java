package com.google.android.libraries.assistant.p1533o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.o.an */
/* compiled from: PG */
public final class C18451an extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C18451an f52363e;

    /* renamed from: f */
    private static volatile C63010eb f52364f;

    /* renamed from: a */
    public C62971cq f52365a = C62942bv.emptyProtobufList();

    /* renamed from: b */
    public C62971cq f52366b = emptyProtobufList();

    /* renamed from: c */
    public boolean f52367c;

    /* renamed from: d */
    public boolean f52368d;

    static {
        C18451an anVar = new C18451an();
        f52363e = anVar;
        C62942bv.registerDefaultInstance(C18451an.class, anVar);
    }

    private C18451an() {
    }

    /* renamed from: a */
    public final void mo23992a() {
        C62971cq cqVar = this.f52365a;
        if (!cqVar.mo58948c()) {
            this.f52365a = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f52363e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0002\u0000\u0001Ț\u0002\u001c\u0003\u0007\u0004\u0007", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C18451an();
            case 4:
                return new C18450am();
            case 5:
                return f52363e;
            case 6:
                C63010eb ebVar = f52364f;
                if (ebVar == null) {
                    synchronized (C18451an.class) {
                        ebVar = f52364f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f52363e);
                            f52364f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
