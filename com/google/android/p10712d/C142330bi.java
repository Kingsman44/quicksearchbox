package com.google.android.p10712d;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.d.bi */
/* compiled from: PG */
public final class C142330bi extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C142330bi f386146h;

    /* renamed from: i */
    private static volatile C63010eb f386147i;

    /* renamed from: a */
    public int f386148a;

    /* renamed from: b */
    public boolean f386149b;

    /* renamed from: c */
    public boolean f386150c;

    /* renamed from: d */
    public boolean f386151d;

    /* renamed from: e */
    public boolean f386152e;

    /* renamed from: f */
    public boolean f386153f;

    /* renamed from: g */
    public boolean f386154g;

    static {
        C142330bi biVar = new C142330bi();
        f386146h = biVar;
        C62942bv.registerDefaultInstance(C142330bi.class, biVar);
    }

    private C142330bi() {
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
                return newMessageInfo(f386146h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C142330bi();
            case 4:
                return new C142329bh();
            case 5:
                return f386146h;
            case 6:
                C63010eb ebVar = f386147i;
                if (ebVar == null) {
                    synchronized (C142330bi.class) {
                        ebVar = f386147i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f386146h);
                            f386147i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
