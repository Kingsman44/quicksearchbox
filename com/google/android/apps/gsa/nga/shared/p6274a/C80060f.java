package com.google.android.apps.gsa.nga.shared.p6274a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

@Deprecated
/* renamed from: com.google.android.apps.gsa.nga.shared.a.f */
/* compiled from: PG */
public final class C80060f extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C80060f f219696h;

    /* renamed from: i */
    private static volatile C63010eb f219697i;

    /* renamed from: a */
    public int f219698a;

    /* renamed from: b */
    public int f219699b;

    /* renamed from: c */
    public int f219700c;

    /* renamed from: d */
    public boolean f219701d;

    /* renamed from: e */
    public int f219702e;

    /* renamed from: f */
    public int f219703f;

    /* renamed from: g */
    public int f219704g;

    static {
        C80060f fVar = new C80060f();
        f219696h = fVar;
        C62942bv.registerDefaultInstance(C80060f.class, fVar);
    }

    private C80060f() {
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
                return newMessageInfo(f219696h, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0004\u0005\u0004\u0006\u0004\u0007\u0007", new Object[]{"a", "b", C45240c.f118157a, "e", C10662f.f35572a, C30325g.f82003a, "d"});
            case 3:
                return new C80060f();
            case 4:
                return new C80059e();
            case 5:
                return f219696h;
            case 6:
                C63010eb ebVar = f219697i;
                if (ebVar == null) {
                    synchronized (C80060f.class) {
                        ebVar = f219697i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219696h);
                            f219697i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
