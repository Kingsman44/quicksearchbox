package com.google.android.libraries.assistant.auto.tng.suggestions.p1263k;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.k.bk */
/* compiled from: PG */
public final class C16364bk extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C16364bk f48168g;

    /* renamed from: h */
    private static volatile C63010eb f48169h;

    /* renamed from: a */
    public int f48170a;

    /* renamed from: b */
    public int f48171b;

    /* renamed from: c */
    public boolean f48172c;

    /* renamed from: d */
    public int f48173d = 1;

    /* renamed from: e */
    public long f48174e;

    /* renamed from: f */
    public boolean f48175f;

    static {
        C16364bk bkVar = new C16364bk();
        f48168g = bkVar;
        C62942bv.registerDefaultInstance(C16364bk.class, bkVar);
    }

    private C16364bk() {
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
                return newMessageInfo(f48168g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဌ\u0002\u0004ဂ\u0003\u0005ဇ\u0004", new Object[]{"a", "b", C16389y.m33346b(), C45240c.f118157a, "d", C16362bi.f48167a, "e", C10662f.f35572a});
            case 3:
                return new C16364bk();
            case 4:
                return new C16361bh();
            case 5:
                return f48168g;
            case 6:
                C63010eb ebVar = f48169h;
                if (ebVar == null) {
                    synchronized (C16364bk.class) {
                        ebVar = f48169h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f48168g);
                            f48169h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
