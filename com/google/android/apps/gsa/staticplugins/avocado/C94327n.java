package com.google.android.apps.gsa.staticplugins.avocado;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.assistant.p3897e.p3929l.p3930a.C52692ay;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.avocado.n */
/* compiled from: PG */
public final class C94327n extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C62962ci f263597c = new C94325l();

    /* renamed from: g */
    public static final C94327n f263598g;

    /* renamed from: h */
    private static volatile C63010eb f263599h;

    /* renamed from: a */
    public int f263600a;

    /* renamed from: b */
    public C62961ch f263601b = emptyIntList();

    /* renamed from: d */
    public boolean f263602d;

    /* renamed from: e */
    public int f263603e;

    /* renamed from: f */
    public boolean f263604f;

    static {
        C94327n nVar = new C94327n();
        f263598g = nVar;
        C62942bv.registerDefaultInstance(C94327n.class, nVar);
    }

    private C94327n() {
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
                return newMessageInfo(f263598g, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001e\u0002ဇ\u0000\u0003ဌ\u0001\u0004ဇ\u0002", new Object[]{"a", "b", C52692ay.m86690b(), "d", "e", C94303fa.m155613b(), C10662f.f35572a});
            case 3:
                return new C94327n();
            case 4:
                return new C94326m();
            case 5:
                return f263598g;
            case 6:
                C63010eb ebVar = f263599h;
                if (ebVar == null) {
                    synchronized (C94327n.class) {
                        ebVar = f263599h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f263598g);
                            f263599h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
