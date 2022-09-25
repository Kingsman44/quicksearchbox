package com.google.android.apps.gsa.assistant.settings.features.p545ag;

import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79570b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ag.ag */
/* compiled from: PG */
public final class C10008ag extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C62962ci f34204b = new C10006ae();

    /* renamed from: c */
    public static final C10008ag f34205c;

    /* renamed from: d */
    private static volatile C63010eb f34206d;

    /* renamed from: a */
    public C62961ch f34207a = emptyIntList();

    static {
        C10008ag agVar = new C10008ag();
        f34205c = agVar;
        C62942bv.registerDefaultInstance(C10008ag.class, agVar);
    }

    private C10008ag() {
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
                return newMessageInfo(f34205c, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"a", C79570b.m127649b()});
            case 3:
                return new C10008ag();
            case 4:
                return new C10007af();
            case 5:
                return f34205c;
            case 6:
                C63010eb ebVar = f34206d;
                if (ebVar == null) {
                    synchronized (C10008ag.class) {
                        ebVar = f34206d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f34205c);
                            f34206d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
