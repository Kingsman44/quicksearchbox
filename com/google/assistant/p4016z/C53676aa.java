package com.google.assistant.p4016z;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.assistant.z.aa */
/* compiled from: PG */
public final class C53676aa extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C53676aa f140889i;

    /* renamed from: j */
    private static volatile C63010eb f140890j;

    /* renamed from: a */
    public int f140891a;

    /* renamed from: b */
    public int f140892b;

    /* renamed from: c */
    public float f140893c;

    /* renamed from: d */
    public boolean f140894d;

    /* renamed from: e */
    public float f140895e;

    /* renamed from: f */
    public float f140896f;

    /* renamed from: g */
    public C63042fg f140897g;

    /* renamed from: h */
    public C62910ar f140898h;

    static {
        C53676aa aaVar = new C53676aa();
        f140889i = aaVar;
        C62942bv.registerDefaultInstance(C53676aa.class, aaVar);
    }

    private C53676aa() {
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
                return newMessageInfo(f140889i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဌ\u0000\u0002ခ\u0001\u0003ဇ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ဉ\u0005\u0007ဉ\u0006", new Object[]{"a", "b", C53740y.f141084a, C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C53676aa();
            case 4:
                return new C53739x();
            case 5:
                return f140889i;
            case 6:
                C63010eb ebVar = f140890j;
                if (ebVar == null) {
                    synchronized (C53676aa.class) {
                        ebVar = f140890j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140889i);
                            f140890j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
