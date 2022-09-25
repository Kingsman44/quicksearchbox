package com.google.p4017at.p4056g.p4057a.p4058a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62931bk;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;
import com.google.protobuf.C63077o;

/* renamed from: com.google.at.g.a.a.ak */
/* compiled from: PG */
public final class C53976ak extends C62942bv implements C63001dt {

    /* renamed from: m */
    public static final C53976ak f141619m;

    /* renamed from: n */
    private static volatile C63010eb f141620n;

    /* renamed from: a */
    public C63042fg f141621a;

    /* renamed from: b */
    public C54020ca f141622b;

    /* renamed from: c */
    public int f141623c;

    /* renamed from: d */
    public int f141624d;

    /* renamed from: e */
    public int f141625e;

    /* renamed from: f */
    public C53973ah f141626f;

    /* renamed from: g */
    public C53975aj f141627g;

    /* renamed from: h */
    public C62910ar f141628h;

    /* renamed from: i */
    public C63077o f141629i;

    /* renamed from: j */
    public C63077o f141630j;

    /* renamed from: k */
    public C62931bk f141631k;

    /* renamed from: l */
    public C54048db f141632l;

    static {
        C53976ak akVar = new C53976ak();
        f141619m = akVar;
        C62942bv.registerDefaultInstance(C53976ak.class, akVar);
    }

    private C53976ak() {
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
                return newMessageInfo(f141619m, "\u0000\f\u0000\u0000\u0001\r\f\u0000\u0000\u0000\u0001\t\u0003\u0004\u0004\u0004\u0005\u0004\u0006\t\u0007\t\b\t\t\t\n\t\u000b\t\f\t\r\t", new Object[]{"a", C45240c.f118157a, "d", "e", C10662f.f35572a, "b", C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a, "l"});
            case 3:
                return new C53976ak();
            case 4:
                return new C53971af();
            case 5:
                return f141619m;
            case 6:
                C63010eb ebVar = f141620n;
                if (ebVar == null) {
                    synchronized (C53976ak.class) {
                        ebVar = f141620n;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141619m);
                            f141620n = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
