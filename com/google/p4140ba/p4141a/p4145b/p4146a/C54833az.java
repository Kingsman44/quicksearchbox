package com.google.p4140ba.p4141a.p4145b.p4146a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ba.a.b.a.az */
/* compiled from: PG */
public final class C54833az extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C54833az f143884j;

    /* renamed from: k */
    private static volatile C63010eb f143885k;

    /* renamed from: a */
    public int f143886a;

    /* renamed from: b */
    public float f143887b;

    /* renamed from: c */
    public float f143888c;

    /* renamed from: d */
    public float f143889d;

    /* renamed from: e */
    public float f143890e;

    /* renamed from: f */
    public float f143891f;

    /* renamed from: g */
    public float f143892g;

    /* renamed from: h */
    public float f143893h;

    /* renamed from: i */
    public float f143894i;

    static {
        C54833az azVar = new C54833az();
        f143884j = azVar;
        C62942bv.registerDefaultInstance(C54833az.class, azVar);
    }

    private C54833az() {
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
                return newMessageInfo(f143884j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ခ\u0005\u0007ခ\u0006\bခ\u0007", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i"});
            case 3:
                return new C54833az();
            case 4:
                return new C54832ay();
            case 5:
                return f143884j;
            case 6:
                C63010eb ebVar = f143885k;
                if (ebVar == null) {
                    synchronized (C54833az.class) {
                        ebVar = f143885k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143884j);
                            f143885k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
