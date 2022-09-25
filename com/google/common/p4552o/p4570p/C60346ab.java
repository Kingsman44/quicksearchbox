package com.google.common.p4552o.p4570p;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.p.ab */
/* compiled from: PG */
public final class C60346ab extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C60346ab f163331j;

    /* renamed from: k */
    private static volatile C63010eb f163332k;

    /* renamed from: a */
    public int f163333a;

    /* renamed from: b */
    public C60401v f163334b;

    /* renamed from: c */
    public C60405z f163335c;

    /* renamed from: d */
    public C60398s f163336d;

    /* renamed from: e */
    public C60350af f163337e;

    /* renamed from: f */
    public int f163338f;

    /* renamed from: g */
    public C60393n f163339g;

    /* renamed from: h */
    public C60396q f163340h;

    /* renamed from: i */
    public C60352ah f163341i;

    static {
        C60346ab abVar = new C60346ab();
        f163331j = abVar;
        C62942bv.registerDefaultInstance(C60346ab.class, abVar);
    }

    private C60346ab() {
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
                return newMessageInfo(f163331j, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0006ဉ\u0005\u0007ဌ\u0006\bဉ\u0007\tဉ\b\nဉ\t", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C60347ac.f163342a, C30325g.f82003a, C19618h.f54585a, "i"});
            case 3:
                return new C60346ab();
            case 4:
                return new C60345aa();
            case 5:
                return f163331j;
            case 6:
                C63010eb ebVar = f163332k;
                if (ebVar == null) {
                    synchronized (C60346ab.class) {
                        ebVar = f163332k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f163331j);
                            f163332k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
