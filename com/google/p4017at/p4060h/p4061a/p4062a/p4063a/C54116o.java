package com.google.p4017at.p4060h.p4061a.p4062a.p4063a;

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

/* renamed from: com.google.at.h.a.a.a.o */
/* compiled from: PG */
public final class C54116o extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C54116o f141992i;

    /* renamed from: j */
    private static volatile C63010eb f141993j;

    /* renamed from: a */
    public int f141994a;

    /* renamed from: b */
    public C62971cq f141995b = emptyProtobufList();

    /* renamed from: c */
    public C54082af f141996c;

    /* renamed from: d */
    public C54077aa f141997d;

    /* renamed from: e */
    public C54088al f141998e;

    /* renamed from: f */
    public C54100ax f141999f;

    /* renamed from: g */
    public long f142000g;

    /* renamed from: h */
    public int f142001h;

    static {
        C54116o oVar = new C54116o();
        f141992i = oVar;
        C62942bv.registerDefaultInstance(C54116o.class, oVar);
    }

    private C54116o() {
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
                return newMessageInfo(f141992i, "\u0001\u0007\u0000\u0001\u0001\n\u0007\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0005ဃ\u0007\u0006ဉ\u0004\u0007ဉ\u0005\tဉ\u0006\nဌ\b", new Object[]{"a", "b", C54113l.class, C45240c.f118157a, C30325g.f82003a, "d", "e", C10662f.f35572a, C19618h.f54585a, C54115n.f141991a});
            case 3:
                return new C54116o();
            case 4:
                return new C54114m();
            case 5:
                return f141992i;
            case 6:
                C63010eb ebVar = f141993j;
                if (ebVar == null) {
                    synchronized (C54116o.class) {
                        ebVar = f141993j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141992i);
                            f141993j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
