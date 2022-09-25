package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.bn */
/* compiled from: PG */
public final class C14230bn extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C14230bn f43058k;

    /* renamed from: l */
    private static volatile C63010eb f43059l;

    /* renamed from: a */
    public C14232bp f43060a;

    /* renamed from: b */
    public C14232bp f43061b;

    /* renamed from: c */
    public C14232bp f43062c;

    /* renamed from: d */
    public C14232bp f43063d;

    /* renamed from: e */
    public C14232bp f43064e;

    /* renamed from: f */
    public C14232bp f43065f;

    /* renamed from: g */
    public int f43066g;

    /* renamed from: h */
    public int f43067h;

    /* renamed from: i */
    public int f43068i;

    /* renamed from: j */
    public int f43069j;

    static {
        C14230bn bnVar = new C14230bn();
        f43058k = bnVar;
        C62942bv.registerDefaultInstance(C14230bn.class, bnVar);
    }

    private C14230bn() {
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
                return newMessageInfo(f43058k, "\u0000\n\u0000\u0000\u0001\f\n\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t\u0004\f\u0005\f\u0007\f\b\f\t\t\n\t\f\t", new Object[]{"a", "b", C45240c.f118157a, C30325g.f82003a, C19618h.f54585a, "i", "j", "d", "e", C10662f.f35572a});
            case 3:
                return new C14230bn();
            case 4:
                return new C14229bm();
            case 5:
                return f43058k;
            case 6:
                C63010eb ebVar = f43059l;
                if (ebVar == null) {
                    synchronized (C14230bn.class) {
                        ebVar = f43059l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43058k);
                            f43059l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
