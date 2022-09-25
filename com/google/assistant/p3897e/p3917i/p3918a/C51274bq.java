package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3908d.p3909a.C51183n;
import com.google.assistant.p3897e.p3908d.p3909a.C51185p;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.bq */
/* compiled from: PG */
public final class C51274bq extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C51274bq f133487i;

    /* renamed from: j */
    private static volatile C63010eb f133488j;

    /* renamed from: a */
    public int f133489a;

    /* renamed from: b */
    public boolean f133490b;

    /* renamed from: c */
    public long f133491c;

    /* renamed from: d */
    public boolean f133492d;

    /* renamed from: e */
    public long f133493e;

    /* renamed from: f */
    public C51273bp f133494f;

    /* renamed from: g */
    public C51183n f133495g;

    /* renamed from: h */
    public C51185p f133496h;

    static {
        C51274bq bqVar = new C51274bq();
        f133487i = bqVar;
        C62942bv.registerDefaultInstance(C51274bq.class, bqVar);
    }

    private C51274bq() {
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
                return newMessageInfo(f133487i, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဉ\u0005\u0004ဂ\u0001\u0006ဇ\u0002\u0007ဂ\u0003\bဉ\u0007\tဉ\u0004", new Object[]{"a", "b", C30325g.f82003a, C45240c.f118157a, "d", "e", C19618h.f54585a, C10662f.f35572a});
            case 3:
                return new C51274bq();
            case 4:
                return new C51271bn();
            case 5:
                return f133487i;
            case 6:
                C63010eb ebVar = f133488j;
                if (ebVar == null) {
                    synchronized (C51274bq.class) {
                        ebVar = f133488j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133487i);
                            f133488j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
