package com.google.protos.p4895aw.p4902b;

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

/* renamed from: com.google.protos.aw.b.i */
/* compiled from: PG */
public final class C64091i extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C64091i f173270i;

    /* renamed from: j */
    private static volatile C63010eb f173271j;

    /* renamed from: a */
    public int f173272a;

    /* renamed from: b */
    public int f173273b = 0;

    /* renamed from: c */
    public Object f173274c;

    /* renamed from: d */
    public C64098p f173275d;

    /* renamed from: e */
    public C62971cq f173276e = emptyProtobufList();

    /* renamed from: f */
    public C62971cq f173277f = C62942bv.emptyProtobufList();

    /* renamed from: g */
    public int f173278g = 30;

    /* renamed from: h */
    public boolean f173279h;

    static {
        C64091i iVar = new C64091i();
        f173270i = iVar;
        C62942bv.registerDefaultInstance(C64091i.class, iVar);
    }

    private C64091i() {
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
                return newMessageInfo(f173270i, "\u0001\u0006\u0001\u0001\u0001\b\u0006\u0000\u0002\u0000\u0001ဉ\u0000\u0002\u001b\u0003\u001a\u0004ြ\u0000\u0005ဋ\u0002\bဇ\u0005", new Object[]{C45240c.f118157a, "b", "a", "d", "e", C64017c.class, C10662f.f35572a, C63987ax.class, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C64091i();
            case 4:
                return new C64090h();
            case 5:
                return f173270i;
            case 6:
                C63010eb ebVar = f173271j;
                if (ebVar == null) {
                    synchronized (C64091i.class) {
                        ebVar = f173271j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173270i);
                            f173271j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
