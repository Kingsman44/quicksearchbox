package com.google.assistant.p3858ar.p3859a;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62964ck;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ar.a.d */
/* compiled from: PG */
public final class C49714d extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C49714d f128299g;

    /* renamed from: h */
    private static volatile C63010eb f128300h;

    /* renamed from: a */
    public int f128301a;

    /* renamed from: b */
    public boolean f128302b;

    /* renamed from: c */
    public C62964ck f128303c = emptyLongList();

    /* renamed from: d */
    public long f128304d;

    /* renamed from: e */
    public boolean f128305e;

    /* renamed from: f */
    public long f128306f;

    static {
        C49714d dVar = new C49714d();
        f128299g = dVar;
        C62942bv.registerDefaultInstance(C49714d.class, dVar);
    }

    private C49714d() {
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
                return newMessageInfo(f128299g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဇ\u0000\u0002&\u0003ဃ\u0001\u0004ဇ\u0002\u0005ဃ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C49714d();
            case 4:
                return new C49713c();
            case 5:
                return f128299g;
            case 6:
                C63010eb ebVar = f128300h;
                if (ebVar == null) {
                    synchronized (C49714d.class) {
                        ebVar = f128300h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f128299g);
                            f128300h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
