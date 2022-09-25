package com.google.assistant.p3739a.p3740a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.speech.p5218j.C67050je;

/* renamed from: com.google.assistant.a.a.cd */
/* compiled from: PG */
public final class C48097cd extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C48097cd f124466h;

    /* renamed from: i */
    private static volatile C63010eb f124467i;

    /* renamed from: a */
    public C48090bx f124468a;

    /* renamed from: b */
    public int f124469b;

    /* renamed from: c */
    public int f124470c;

    /* renamed from: d */
    public boolean f124471d;

    /* renamed from: e */
    public int f124472e;

    /* renamed from: f */
    public int f124473f;

    /* renamed from: g */
    public C67050je f124474g;

    static {
        C48097cd cdVar = new C48097cd();
        f124466h = cdVar;
        C62942bv.registerDefaultInstance(C48097cd.class, cdVar);
    }

    private C48097cd() {
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
                return newMessageInfo(f124466h, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\t\u0002\u0004\u0003\u0004\u0004\u0007\u0005\f\u0006\f\u0007\t", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C48097cd();
            case 4:
                return new C48096cc();
            case 5:
                return f124466h;
            case 6:
                C63010eb ebVar = f124467i;
                if (ebVar == null) {
                    synchronized (C48097cd.class) {
                        ebVar = f124467i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124466h);
                            f124467i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
