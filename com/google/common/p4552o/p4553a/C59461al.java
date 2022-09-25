package com.google.common.p4552o.p4553a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.a.al */
/* compiled from: PG */
public final class C59461al extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C59461al f157733h;

    /* renamed from: i */
    private static volatile C63010eb f157734i;

    /* renamed from: a */
    public int f157735a;

    /* renamed from: b */
    public int f157736b;

    /* renamed from: c */
    public long f157737c;

    /* renamed from: d */
    public long f157738d;

    /* renamed from: e */
    public long f157739e;

    /* renamed from: f */
    public long f157740f;

    /* renamed from: g */
    public long f157741g;

    static {
        C59461al alVar = new C59461al();
        f157733h = alVar;
        C62942bv.registerDefaultInstance(C59461al.class, alVar);
    }

    private C59461al() {
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
                return newMessageInfo(f157733h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C59461al();
            case 4:
                return new C59460ak();
            case 5:
                return f157733h;
            case 6:
                C63010eb ebVar = f157734i;
                if (ebVar == null) {
                    synchronized (C59461al.class) {
                        ebVar = f157734i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f157733h);
                            f157734i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
