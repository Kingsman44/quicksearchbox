package com.google.protos.p4895aw.p4896a.p4897a.p4898a;

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

/* renamed from: com.google.protos.aw.a.a.a.bp */
/* compiled from: PG */
public final class C63929bp extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C63929bp f172876i;

    /* renamed from: j */
    private static volatile C63010eb f172877j;

    /* renamed from: a */
    public int f172878a;

    /* renamed from: b */
    public int f172879b;

    /* renamed from: c */
    public C62910ar f172880c;

    /* renamed from: d */
    public C63887aa f172881d;

    /* renamed from: e */
    public int f172882e;

    /* renamed from: f */
    public C62910ar f172883f;

    /* renamed from: g */
    public int f172884g;

    /* renamed from: h */
    public C62910ar f172885h;

    static {
        C63929bp bpVar = new C63929bp();
        f172876i = bpVar;
        C62942bv.registerDefaultInstance(C63929bp.class, bpVar);
    }

    private C63929bp() {
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
                return newMessageInfo(f172876i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004င\u0003\u0005ဉ\u0004\u0006င\u0005\u0007ဉ\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C63929bp();
            case 4:
                return new C63928bo();
            case 5:
                return f172876i;
            case 6:
                C63010eb ebVar = f172877j;
                if (ebVar == null) {
                    synchronized (C63929bp.class) {
                        ebVar = f172877j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172876i);
                            f172877j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
