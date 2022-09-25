package com.google.android.apps.search.assistant.verticals.automation.routines.p10028d;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.verticals.automation.routines.d.n */
/* compiled from: PG */
public final class C131871n extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C131871n f360106g;

    /* renamed from: h */
    private static volatile C63010eb f360107h;

    /* renamed from: a */
    public int f360108a;

    /* renamed from: b */
    public float f360109b;

    /* renamed from: c */
    public C62910ar f360110c;

    /* renamed from: d */
    public C62910ar f360111d;

    /* renamed from: e */
    public C62910ar f360112e;

    /* renamed from: f */
    public boolean f360113f;

    static {
        C131871n nVar = new C131871n();
        f360106g = nVar;
        C62942bv.registerDefaultInstance(C131871n.class, nVar);
    }

    private C131871n() {
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
                return newMessageInfo(f360106g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ခ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဇ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C131871n();
            case 4:
                return new C131870m();
            case 5:
                return f360106g;
            case 6:
                C63010eb ebVar = f360107h;
                if (ebVar == null) {
                    synchronized (C131871n.class) {
                        ebVar = f360107h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f360106g);
                            f360107h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
