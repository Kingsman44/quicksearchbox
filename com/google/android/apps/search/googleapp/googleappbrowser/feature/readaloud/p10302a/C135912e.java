package com.google.android.apps.search.googleapp.googleappbrowser.feature.readaloud.p10302a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.readaloud.a.e */
/* compiled from: PG */
public final class C135912e extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C135912e f370156c;

    /* renamed from: d */
    private static volatile C63010eb f370157d;

    /* renamed from: a */
    public int f370158a;

    /* renamed from: b */
    public int f370159b;

    static {
        C135912e eVar = new C135912e();
        f370156c = eVar;
        C62942bv.registerDefaultInstance(C135912e.class, eVar);
    }

    private C135912e() {
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
                return newMessageInfo(f370156c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C135909b.f370155a});
            case 3:
                return new C135912e();
            case 4:
                return new C135911d();
            case 5:
                return f370156c;
            case 6:
                C63010eb ebVar = f370157d;
                if (ebVar == null) {
                    synchronized (C135912e.class) {
                        ebVar = f370157d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f370156c);
                            f370157d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
