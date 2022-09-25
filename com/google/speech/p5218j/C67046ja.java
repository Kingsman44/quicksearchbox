package com.google.speech.p5218j;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.ja */
/* compiled from: PG */
public final class C67046ja extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C67046ja f182243i;

    /* renamed from: j */
    private static volatile C63010eb f182244j;

    /* renamed from: a */
    public int f182245a;

    /* renamed from: b */
    public boolean f182246b;

    /* renamed from: c */
    public int f182247c;

    /* renamed from: d */
    public long f182248d;

    /* renamed from: e */
    public long f182249e;

    /* renamed from: f */
    public int f182250f;

    /* renamed from: g */
    public C62995dn f182251g = C62995dn.f170057a;

    /* renamed from: h */
    public boolean f182252h;

    static {
        C67046ja jaVar = new C67046ja();
        f182243i = jaVar;
        C62942bv.registerDefaultInstance(C67046ja.class, jaVar);
    }

    private C67046ja() {
        emptyIntList();
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
                return newMessageInfo(f182243i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0001\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0004ဂ\u0002\u0005ဂ\u0003\u0006င\u0004\u00072\bဇ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C67044iz.f182242a, C19618h.f54585a});
            case 3:
                return new C67046ja();
            case 4:
                return new C67043iy();
            case 5:
                return f182243i;
            case 6:
                C63010eb ebVar = f182244j;
                if (ebVar == null) {
                    synchronized (C67046ja.class) {
                        ebVar = f182244j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182243i);
                            f182244j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
