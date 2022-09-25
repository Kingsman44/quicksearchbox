package com.google.assistant.p3781ad.p3787c.p3788a;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.c.a.ai */
/* compiled from: PG */
public final class C48490ai extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C48490ai f125258g;

    /* renamed from: h */
    private static volatile C63010eb f125259h;

    /* renamed from: a */
    public int f125260a;

    /* renamed from: b */
    public long f125261b;

    /* renamed from: c */
    public float f125262c;

    /* renamed from: d */
    public int f125263d = 1;

    /* renamed from: e */
    public C48526f f125264e;

    /* renamed from: f */
    public long f125265f;

    static {
        C48490ai aiVar = new C48490ai();
        f125258g = aiVar;
        C62942bv.registerDefaultInstance(C48490ai.class, aiVar);
    }

    private C48490ai() {
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
                return newMessageInfo(f125258g, "\u0001\u0005\u0000\u0001\u0002\u0006\u0005\u0000\u0000\u0000\u0002ဂ\u0000\u0003ခ\u0001\u0004ဌ\u0002\u0005ဉ\u0003\u0006ဂ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", C48517bi.f125339a, "e", C10662f.f35572a});
            case 3:
                return new C48490ai();
            case 4:
                return new C48489ah();
            case 5:
                return f125258g;
            case 6:
                C63010eb ebVar = f125259h;
                if (ebVar == null) {
                    synchronized (C48490ai.class) {
                        ebVar = f125259h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125258g);
                            f125259h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
