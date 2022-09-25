package com.google.p4140ba.p4141a.p4145b.p4146a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ba.a.b.a.df */
/* compiled from: PG */
public final class C54894df extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C54894df f144233h;

    /* renamed from: i */
    private static volatile C63010eb f144234i;

    /* renamed from: a */
    public int f144235a;

    /* renamed from: b */
    public boolean f144236b;

    /* renamed from: c */
    public boolean f144237c;

    /* renamed from: d */
    public boolean f144238d;

    /* renamed from: e */
    public float f144239e;

    /* renamed from: f */
    public float f144240f;

    /* renamed from: g */
    public C54864cc f144241g;

    static {
        C54894df dfVar = new C54894df();
        f144233h = dfVar;
        C62942bv.registerDefaultInstance(C54894df.class, dfVar);
    }

    private C54894df() {
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
                return newMessageInfo(f144233h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ဉ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C54894df();
            case 4:
                return new C54893de();
            case 5:
                return f144233h;
            case 6:
                C63010eb ebVar = f144234i;
                if (ebVar == null) {
                    synchronized (C54894df.class) {
                        ebVar = f144234i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144233h);
                            f144234i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
