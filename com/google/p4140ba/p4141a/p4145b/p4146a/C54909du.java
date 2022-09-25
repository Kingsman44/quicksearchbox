package com.google.p4140ba.p4141a.p4145b.p4146a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ba.a.b.a.du */
/* compiled from: PG */
public final class C54909du extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C54909du f144312i;

    /* renamed from: j */
    private static volatile C63010eb f144313j;

    /* renamed from: a */
    public int f144314a;

    /* renamed from: b */
    public C54870ci f144315b;

    /* renamed from: c */
    public C54870ci f144316c;

    /* renamed from: d */
    public C54870ci f144317d;

    /* renamed from: e */
    public C54870ci f144318e;

    /* renamed from: f */
    public C54870ci f144319f;

    /* renamed from: g */
    public C54870ci f144320g;

    /* renamed from: h */
    public C54870ci f144321h;

    static {
        C54909du duVar = new C54909du();
        f144312i = duVar;
        C62942bv.registerDefaultInstance(C54909du.class, duVar);
    }

    private C54909du() {
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
                return newMessageInfo(f144312i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C54909du();
            case 4:
                return new C54908dt();
            case 5:
                return f144312i;
            case 6:
                C63010eb ebVar = f144313j;
                if (ebVar == null) {
                    synchronized (C54909du.class) {
                        ebVar = f144313j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144312i);
                            f144313j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
