package com.google.common.p4552o.p4563i;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.lens.p4707j.C62505ea;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.i.bx */
/* compiled from: PG */
public final class C59915bx extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C59915bx f161935i;

    /* renamed from: j */
    private static volatile C63010eb f161936j;

    /* renamed from: a */
    public int f161937a;

    /* renamed from: b */
    public C59912bu f161938b;

    /* renamed from: c */
    public C62961ch f161939c = emptyIntList();

    /* renamed from: d */
    public int f161940d;

    /* renamed from: e */
    public C59914bw f161941e;

    /* renamed from: f */
    public int f161942f;

    /* renamed from: g */
    public long f161943g;

    /* renamed from: h */
    public long f161944h;

    static {
        C59915bx bxVar = new C59915bx();
        f161935i = bxVar;
        C62942bv.registerDefaultInstance(C59915bx.class, bxVar);
    }

    private C59915bx() {
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
                return newMessageInfo(f161935i, "\u0001\u0007\u0000\u0001\u0002\f\u0007\u0000\u0001\u0000\u0002ဉ\u0001\u0005\u0016\u0007င\u0005\tဉ\u0006\nဌ\u0007\u000bဂ\b\fဂ\t", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C62505ea.m94791b(), C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C59915bx();
            case 4:
                return new C59906bo();
            case 5:
                return f161935i;
            case 6:
                C63010eb ebVar = f161936j;
                if (ebVar == null) {
                    synchronized (C59915bx.class) {
                        ebVar = f161936j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f161935i);
                            f161936j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
