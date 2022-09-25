package com.google.android.libraries.search.assistant.appactions.p2502b.p2503a;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32810be;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.libraries.search.assistant.appactions.b.a.d */
/* compiled from: PG */
public final class C32491d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C32491d f87062c;

    /* renamed from: d */
    public static final C62940bt f87063d;

    /* renamed from: e */
    private static volatile C63010eb f87064e;

    /* renamed from: a */
    public int f87065a;

    /* renamed from: b */
    public C32490c f87066b;

    static {
        C32491d dVar = new C32491d();
        f87062c = dVar;
        C62942bv.registerDefaultInstance(C32491d.class, dVar);
        f87063d = C62942bv.newSingularGeneratedExtension(C32810be.f87993c, dVar, dVar, (C62958ce) null, 391179243, C63066gd.MESSAGE, C32491d.class);
    }

    private C32491d() {
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
                return newMessageInfo(f87062c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C32491d();
            case 4:
                return new C32488a();
            case 5:
                return f87062c;
            case 6:
                C63010eb ebVar = f87064e;
                if (ebVar == null) {
                    synchronized (C32491d.class) {
                        ebVar = f87064e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f87062c);
                            f87064e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
