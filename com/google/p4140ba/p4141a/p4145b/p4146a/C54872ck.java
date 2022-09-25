package com.google.p4140ba.p4141a.p4145b.p4146a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ba.a.b.a.ck */
/* compiled from: PG */
public final class C54872ck extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C54872ck f144150i;

    /* renamed from: j */
    private static volatile C63010eb f144151j;

    /* renamed from: a */
    public int f144152a;

    /* renamed from: b */
    public C54884cw f144153b;

    /* renamed from: c */
    public C54884cw f144154c;

    /* renamed from: d */
    public C54864cc f144155d;

    /* renamed from: e */
    public C62971cq f144156e = emptyProtobufList();

    /* renamed from: f */
    public C54895dg f144157f;

    /* renamed from: g */
    public C54849bo f144158g;

    /* renamed from: h */
    public int f144159h;

    static {
        C54872ck ckVar = new C54872ck();
        f144150i = ckVar;
        C62942bv.registerDefaultInstance(C54872ck.class, ckVar);
    }

    private C54872ck() {
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
                return newMessageInfo(f144150i, "\u0001\u0007\u0000\u0001\u000b\u0013\u0007\u0000\u0001\u0000\u000bဉ\u0000\f\u001b\rဉ\u0003\u000fဉ\u0004\u0011ဉ\u0001\u0012ဉ\u0002\u0013င\u0005", new Object[]{"a", "b", "e", C54903do.class, C10662f.f35572a, C30325g.f82003a, C45240c.f118157a, "d", C19618h.f54585a});
            case 3:
                return new C54872ck();
            case 4:
                return new C54871cj();
            case 5:
                return f144150i;
            case 6:
                C63010eb ebVar = f144151j;
                if (ebVar == null) {
                    synchronized (C54872ck.class) {
                        ebVar = f144151j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144150i);
                            f144151j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
