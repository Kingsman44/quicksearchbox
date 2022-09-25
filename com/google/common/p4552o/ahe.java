package com.google.common.p4552o;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3917i.p3918a.C51300cp;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.ahe */
/* compiled from: PG */
public final class ahe extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final ahe f158693i;

    /* renamed from: j */
    private static volatile C63010eb f158694j;

    /* renamed from: a */
    public int f158695a;

    /* renamed from: b */
    public boolean f158696b;

    /* renamed from: c */
    public boolean f158697c;

    /* renamed from: d */
    public boolean f158698d;

    /* renamed from: e */
    public boolean f158699e;

    /* renamed from: f */
    public boolean f158700f;

    /* renamed from: g */
    public int f158701g;

    /* renamed from: h */
    public boolean f158702h;

    static {
        ahe ahe = new ahe();
        f158693i = ahe;
        C62942bv.registerDefaultInstance(ahe.class, ahe);
    }

    private ahe() {
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
                return newMessageInfo(f158693i, "\u0001\u0007\u0000\u0001\u0002\b\u0007\u0000\u0000\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0004\u0005ဇ\u0003\u0006ဇ\u0005\u0007ဌ\u0006\bဇ\u0007", new Object[]{"a", "b", C45240c.f118157a, "e", "d", C10662f.f35572a, C30325g.f82003a, C51300cp.m86113b(), C19618h.f54585a});
            case 3:
                return new ahe();
            case 4:
                return new ahd();
            case 5:
                return f158693i;
            case 6:
                C63010eb ebVar = f158694j;
                if (ebVar == null) {
                    synchronized (ahe.class) {
                        ebVar = f158694j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158693i);
                            f158694j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
