package com.google.android.libraries.assistant.contexttrigger.p1466j;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3803ag.p3809c.C49156z;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.j.u */
/* compiled from: PG */
public final class C17805u extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C17805u f51097g;

    /* renamed from: h */
    private static volatile C63010eb f51098h;

    /* renamed from: a */
    public int f51099a;

    /* renamed from: b */
    public int f51100b = 0;

    /* renamed from: c */
    public Object f51101c;

    /* renamed from: d */
    public int f51102d = 0;

    /* renamed from: e */
    public Object f51103e;

    /* renamed from: f */
    public int f51104f;

    static {
        C17805u uVar = new C17805u();
        f51097g = uVar;
        C62942bv.registerDefaultInstance(C17805u.class, uVar);
    }

    private C17805u() {
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
                return newMessageInfo(f51097g, "\u0001\u0005\u0002\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ျ\u0000\u0002ျ\u0000\u0003ြ\u0001\u0004ြ\u0001\u0005ဌ\u0004", new Object[]{C45240c.f118157a, "b", "e", "d", "a", C49156z.class, C63042fg.class, C10662f.f35572a, C17802r.f51096a});
            case 3:
                return new C17805u();
            case 4:
                return new C17804t();
            case 5:
                return f51097g;
            case 6:
                C63010eb ebVar = f51098h;
                if (ebVar == null) {
                    synchronized (C17805u.class) {
                        ebVar = f51098h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f51097g);
                            f51098h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
