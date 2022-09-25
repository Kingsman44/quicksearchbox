package com.google.speech.p5228m;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.m.cd */
/* compiled from: PG */
public final class C67327cd extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C67327cd f182998h;

    /* renamed from: i */
    private static volatile C63010eb f182999i;

    /* renamed from: a */
    public int f183000a;

    /* renamed from: b */
    public C67325cb f183001b;

    /* renamed from: c */
    public boolean f183002c;

    /* renamed from: d */
    public boolean f183003d;

    /* renamed from: e */
    public double f183004e;

    /* renamed from: f */
    public double f183005f;

    /* renamed from: g */
    public double f183006g;

    static {
        C67327cd cdVar = new C67327cd();
        f182998h = cdVar;
        C62942bv.registerDefaultInstance(C67327cd.class, cdVar);
    }

    private C67327cd() {
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
                return newMessageInfo(f182998h, "\u0001\u0006\u0000\u0001\u0002\u0007\u0006\u0000\u0000\u0000\u0002ဉ\u0000\u0003ဇ\u0001\u0004ဇ\u0002\u0005က\u0003\u0006က\u0004\u0007က\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C67327cd();
            case 4:
                return new C67326cc();
            case 5:
                return f182998h;
            case 6:
                C63010eb ebVar = f182999i;
                if (ebVar == null) {
                    synchronized (C67327cd.class) {
                        ebVar = f182999i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182998h);
                            f182999i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
