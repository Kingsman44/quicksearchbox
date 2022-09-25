package com.google.common.p4552o.p4553a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.a.cz */
/* compiled from: PG */
public final class C59529cz extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C59529cz f157963h;

    /* renamed from: j */
    private static volatile C63010eb f157964j;

    /* renamed from: a */
    public int f157965a;

    /* renamed from: b */
    public long f157966b;

    /* renamed from: c */
    public C62971cq f157967c = emptyProtobufList();

    /* renamed from: d */
    public C59521cr f157968d;

    /* renamed from: e */
    public C59537dg f157969e;

    /* renamed from: f */
    public C59544dn f157970f;

    /* renamed from: g */
    public C59505cb f157971g;

    /* renamed from: i */
    private byte f157972i = 2;

    static {
        C59529cz czVar = new C59529cz();
        f157963h = czVar;
        C62942bv.registerDefaultInstance(C59529cz.class, czVar);
    }

    private C59529cz() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f157972i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f157972i = b;
                return null;
            case 2:
                return newMessageInfo(f157963h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0001\u0001ဂ\u0000\u0002Л\u0004ဉ\u0001\u0005ဉ\u0002\u0006ဉ\u0003\u0007ဉ\u0005", new Object[]{"a", "b", C45240c.f118157a, C59523ct.class, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C59529cz();
            case 4:
                return new C59528cy();
            case 5:
                return f157963h;
            case 6:
                C63010eb ebVar = f157964j;
                if (ebVar == null) {
                    synchronized (C59529cz.class) {
                        ebVar = f157964j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f157963h);
                            f157964j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
