package com.google.common.p4552o;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.ano */
/* compiled from: PG */
public final class ano extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final ano f159377j;

    /* renamed from: k */
    private static volatile C63010eb f159378k;

    /* renamed from: a */
    public int f159379a;

    /* renamed from: b */
    public int f159380b;

    /* renamed from: c */
    public int f159381c;

    /* renamed from: d */
    public int f159382d;

    /* renamed from: e */
    public int f159383e;

    /* renamed from: f */
    public int f159384f;

    /* renamed from: g */
    public int f159385g;

    /* renamed from: h */
    public int f159386h;

    /* renamed from: i */
    public long f159387i;

    static {
        ano ano = new ano();
        f159377j = ano;
        C62942bv.registerDefaultInstance(ano.class, ano);
    }

    private ano() {
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
                return newMessageInfo(f159377j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bဂ\u0007", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i"});
            case 3:
                return new ano();
            case 4:
                return new ann();
            case 5:
                return f159377j;
            case 6:
                C63010eb ebVar = f159378k;
                if (ebVar == null) {
                    synchronized (ano.class) {
                        ebVar = f159378k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f159377j);
                            f159378k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
