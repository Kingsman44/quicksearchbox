package com.google.common.p4552o;

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

/* renamed from: com.google.common.o.aao */
/* compiled from: PG */
public final class aao extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final aao f158126j;

    /* renamed from: k */
    private static volatile C63010eb f158127k;

    /* renamed from: a */
    public int f158128a;

    /* renamed from: b */
    public aak f158129b;

    /* renamed from: c */
    public C62971cq f158130c = emptyProtobufList();

    /* renamed from: d */
    public C62971cq f158131d = emptyProtobufList();

    /* renamed from: e */
    public ack f158132e;

    /* renamed from: f */
    public C62971cq f158133f = emptyProtobufList();

    /* renamed from: g */
    public int f158134g;

    /* renamed from: h */
    public aaq f158135h;

    /* renamed from: i */
    public int f158136i;

    static {
        aao aao = new aao();
        f158126j = aao;
        C62942bv.registerDefaultInstance(aao.class, aao);
    }

    private aao() {
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
                return newMessageInfo(f158126j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0003\u0000\u0001ဉ\u0000\u0002\u001b\u0003\u001b\u0004ဉ\u0001\u0005\u001b\u0006ဌ\u0002\u0007ဉ\u0003\bင\u0004", new Object[]{"a", "b", C45240c.f118157a, acr.class, "d", aau.class, "e", C10662f.f35572a, aam.class, C30325g.f82003a, C60697zm.m92635b(), C19618h.f54585a, "i"});
            case 3:
                return new aao();
            case 4:
                return new aan();
            case 5:
                return f158126j;
            case 6:
                C63010eb ebVar = f158127k;
                if (ebVar == null) {
                    synchronized (aao.class) {
                        ebVar = f158127k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158126j);
                            f158127k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
