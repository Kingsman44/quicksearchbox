package com.google.common.p4552o.p4566l;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62964ck;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.l.bt */
/* compiled from: PG */
public final class C60155bt extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C60155bt f162730j;

    /* renamed from: k */
    private static volatile C63010eb f162731k;

    /* renamed from: a */
    public int f162732a;

    /* renamed from: b */
    public C62971cq f162733b = emptyProtobufList();

    /* renamed from: c */
    public C62964ck f162734c = emptyLongList();

    /* renamed from: d */
    public C62964ck f162735d = emptyLongList();

    /* renamed from: e */
    public C62964ck f162736e = emptyLongList();

    /* renamed from: f */
    public C62964ck f162737f = emptyLongList();

    /* renamed from: g */
    public long f162738g;

    /* renamed from: h */
    public long f162739h;

    /* renamed from: i */
    public int f162740i;

    static {
        C60155bt btVar = new C60155bt();
        f162730j = btVar;
        C62942bv.registerDefaultInstance(C60155bt.class, btVar);
    }

    private C60155bt() {
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
                return newMessageInfo(f162730j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0005\u0000\u0001\u001b\u0002\u0015\u0003\u0015\u0004ဃ\u0000\u0005ဃ\u0001\u0006င\u0002\u0007&\b&", new Object[]{"a", "b", C60126ar.class, C45240c.f118157a, "e", C30325g.f82003a, C19618h.f54585a, "i", "d", C10662f.f35572a});
            case 3:
                return new C60155bt();
            case 4:
                return new C60154bs();
            case 5:
                return f162730j;
            case 6:
                C63010eb ebVar = f162731k;
                if (ebVar == null) {
                    synchronized (C60155bt.class) {
                        ebVar = f162731k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162730j);
                            f162731k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
