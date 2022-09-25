package com.google.p4653i.p4654a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.i.a.ax */
/* compiled from: PG */
public final class C61683ax extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C61683ax f166633j;

    /* renamed from: l */
    private static volatile C63010eb f166634l;

    /* renamed from: a */
    public int f166635a;

    /* renamed from: b */
    public int f166636b;

    /* renamed from: c */
    public int f166637c = 1;

    /* renamed from: d */
    public C61676aq f166638d;

    /* renamed from: e */
    public C61674ao f166639e;

    /* renamed from: f */
    public C61666ag f166640f;

    /* renamed from: g */
    public C61680au f166641g;

    /* renamed from: h */
    public C61672am f166642h;

    /* renamed from: i */
    public C61682aw f166643i;

    /* renamed from: k */
    private byte f166644k = 2;

    static {
        C61683ax axVar = new C61683ax();
        f166633j = axVar;
        C62942bv.registerDefaultInstance(C61683ax.class, axVar);
    }

    private C61683ax() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f166644k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f166644k = b;
                return null;
            case 2:
                return newMessageInfo(f166633j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0003\u0001ဌ\u0000\u0002င\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007", new Object[]{"a", "b", C61667ah.f166601a, C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i"});
            case 3:
                return new C61683ax();
            case 4:
                return new C61664ae();
            case 5:
                return f166633j;
            case 6:
                C63010eb ebVar = f166634l;
                if (ebVar == null) {
                    synchronized (C61683ax.class) {
                        ebVar = f166634l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f166633j);
                            f166634l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
