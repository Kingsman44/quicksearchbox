package com.google.android.apps.search.assistant.verticals.automation.routines.p10021a.p10022a;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.verticals.automation.routines.a.a.d */
/* compiled from: PG */
public final class C131843d extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C131843d f360054e;

    /* renamed from: g */
    private static volatile C63010eb f360055g;

    /* renamed from: a */
    public float f360056a;

    /* renamed from: b */
    public C62910ar f360057b;

    /* renamed from: c */
    public C62910ar f360058c;

    /* renamed from: d */
    public C62910ar f360059d;

    /* renamed from: f */
    private int f360060f;

    static {
        C131843d dVar = new C131843d();
        f360054e = dVar;
        C62942bv.registerDefaultInstance(C131843d.class, dVar);
    }

    private C131843d() {
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
                return newMessageInfo(f360054e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ခ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{C10662f.f35572a, "a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C131843d();
            case 4:
                return new C131842c();
            case 5:
                return f360054e;
            case 6:
                C63010eb ebVar = f360055g;
                if (ebVar == null) {
                    synchronized (C131843d.class) {
                        ebVar = f360055g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f360054e);
                            f360055g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
