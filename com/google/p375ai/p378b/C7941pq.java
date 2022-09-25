package com.google.p375ai.p378b;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.pq */
/* compiled from: PG */
public final class C7941pq extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C7941pq f27880i;

    /* renamed from: k */
    private static volatile C63010eb f27881k;

    /* renamed from: a */
    public int f27882a;

    /* renamed from: b */
    public C8178yk f27883b;

    /* renamed from: c */
    public C8178yk f27884c;

    /* renamed from: d */
    public C8178yk f27885d;

    /* renamed from: e */
    public int f27886e;

    /* renamed from: f */
    public int f27887f;

    /* renamed from: g */
    public int f27888g;

    /* renamed from: h */
    public boolean f27889h;

    /* renamed from: j */
    private byte f27890j = 2;

    static {
        C7941pq pqVar = new C7941pq();
        f27880i = pqVar;
        C62942bv.registerDefaultInstance(C7941pq.class, pqVar);
    }

    private C7941pq() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f27890j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f27890j = b;
                return null;
            case 2:
                return newMessageInfo(f27880i, "\u0001\u0007\u0000\u0001\u0004\n\u0007\u0000\u0000\u0003\u0004ᐉ\u0000\u0005ᐉ\u0001\u0006ᐉ\u0002\u0007ဌ\u0003\bင\u0004\tင\u0005\nဇ\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C7939po.f27879a, C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C7941pq();
            case 4:
                return new C7938pn();
            case 5:
                return f27880i;
            case 6:
                C63010eb ebVar = f27881k;
                if (ebVar == null) {
                    synchronized (C7941pq.class) {
                        ebVar = f27881k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f27880i);
                            f27881k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
