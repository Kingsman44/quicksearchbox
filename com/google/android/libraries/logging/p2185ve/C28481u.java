package com.google.android.libraries.logging.p2185ve;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.aqq;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.logging.ve.u */
/* compiled from: PG */
public final class C28481u extends C62937bq implements C28482v {

    /* renamed from: h */
    public static final C28481u f77286h;

    /* renamed from: j */
    private static volatile C63010eb f77287j;

    /* renamed from: a */
    public int f77288a;

    /* renamed from: b */
    public C62961ch f77289b = emptyIntList();

    /* renamed from: c */
    public C60214n f77290c;

    /* renamed from: d */
    public int f77291d;

    /* renamed from: e */
    public long f77292e;

    /* renamed from: f */
    public long f77293f;

    /* renamed from: g */
    public long f77294g;

    /* renamed from: i */
    private byte f77295i = 2;

    static {
        C28481u uVar = new C28481u();
        f77286h = uVar;
        C62942bv.registerDefaultInstance(C28481u.class, uVar);
    }

    private C28481u() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f77295i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f77295i = b;
                return null;
            case 2:
                return newMessageInfo(f77286h, "\u0001\u0006\u0000\u0001\u0002\b\u0006\u0000\u0001\u0001\u0002\u0016\u0004ᐉ\u0000\u0005ဌ\u0001\u0006ဂ\u0002\u0007ဂ\u0003\bဂ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", aqq.f159779a, "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C28481u();
            case 4:
                return new C28480t();
            case 5:
                return f77286h;
            case 6:
                C63010eb ebVar = f77287j;
                if (ebVar == null) {
                    synchronized (C28481u.class) {
                        ebVar = f77287j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f77286h);
                            f77287j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
