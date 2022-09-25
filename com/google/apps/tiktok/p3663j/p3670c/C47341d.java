package com.google.apps.tiktok.p3663j.p3670c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.apps.tiktok.j.c.d */
/* compiled from: PG */
public final class C47341d extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C47341d f123048f;

    /* renamed from: g */
    private static volatile C63010eb f123049g;

    /* renamed from: a */
    public int f123050a;

    /* renamed from: b */
    public long f123051b = -1;

    /* renamed from: c */
    public C62971cq f123052c = emptyProtobufList();

    /* renamed from: d */
    public long f123053d;

    /* renamed from: e */
    public C62961ch f123054e = emptyIntList();

    static {
        C47341d dVar = new C47341d();
        f123048f = dVar;
        C62942bv.registerDefaultInstance(C47341d.class, dVar);
    }

    private C47341d() {
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
                return newMessageInfo(f123048f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဂ\u0000\u0002\u001b\u0003ဂ\u0001\u0004\u0016", new Object[]{"a", "b", C45240c.f118157a, C47339b.class, "d", "e"});
            case 3:
                return new C47341d();
            case 4:
                return new C47340c();
            case 5:
                return f123048f;
            case 6:
                C63010eb ebVar = f123049g;
                if (ebVar == null) {
                    synchronized (C47341d.class) {
                        ebVar = f123049g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f123048f);
                            f123049g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
