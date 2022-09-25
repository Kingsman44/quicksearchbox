package com.google.p4160bf.p4161a.p4163b;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bf.a.b.ao */
/* compiled from: PG */
public final class C55451ao extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C55451ao f146296i;

    /* renamed from: j */
    private static volatile C63010eb f146297j;

    /* renamed from: a */
    public int f146298a;

    /* renamed from: b */
    public long f146299b;

    /* renamed from: c */
    public long f146300c;

    /* renamed from: d */
    public long f146301d;

    /* renamed from: e */
    public long f146302e;

    /* renamed from: f */
    public long f146303f;

    /* renamed from: g */
    public long f146304g;

    /* renamed from: h */
    public int f146305h;

    static {
        C55451ao aoVar = new C55451ao();
        f146296i = aoVar;
        C62942bv.registerDefaultInstance(C55451ao.class, aoVar);
    }

    private C55451ao() {
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
                return newMessageInfo(f146296i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဌ\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, C55450an.m87693b()});
            case 3:
                return new C55451ao();
            case 4:
                return new C55448al();
            case 5:
                return f146296i;
            case 6:
                C63010eb ebVar = f146297j;
                if (ebVar == null) {
                    synchronized (C55451ao.class) {
                        ebVar = f146297j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146296i);
                            f146297j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
