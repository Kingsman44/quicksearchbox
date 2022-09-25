package com.google.android.apps.gsa.staticplugins.opa.tapas.shared;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.ed */
/* compiled from: PG */
public final class C113393ed extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C113393ed f313985i;

    /* renamed from: j */
    private static volatile C63010eb f313986j;

    /* renamed from: a */
    public int f313987a;

    /* renamed from: b */
    public boolean f313988b;

    /* renamed from: c */
    public boolean f313989c;

    /* renamed from: d */
    public float f313990d;

    /* renamed from: e */
    public float f313991e;

    /* renamed from: f */
    public float f313992f;

    /* renamed from: g */
    public float f313993g;

    /* renamed from: h */
    public float f313994h;

    static {
        C113393ed edVar = new C113393ed();
        f313985i = edVar;
        C62942bv.registerDefaultInstance(C113393ed.class, edVar);
    }

    private C113393ed() {
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
                return newMessageInfo(f313985i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ခ\u0005\u0007ခ\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C113393ed();
            case 4:
                return new C113392ec();
            case 5:
                return f313985i;
            case 6:
                C63010eb ebVar = f313986j;
                if (ebVar == null) {
                    synchronized (C113393ed.class) {
                        ebVar = f313986j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f313985i);
                            f313986j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
