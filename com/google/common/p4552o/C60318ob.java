package com.google.common.p4552o;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62959cf;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.ob */
/* compiled from: PG */
public final class C60318ob extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C60318ob f163212j;

    /* renamed from: k */
    private static volatile C63010eb f163213k;

    /* renamed from: a */
    public int f163214a;

    /* renamed from: b */
    public int f163215b;

    /* renamed from: c */
    public int f163216c;

    /* renamed from: d */
    public int f163217d;

    /* renamed from: e */
    public int f163218e;

    /* renamed from: f */
    public int f163219f;

    /* renamed from: g */
    public int f163220g;

    /* renamed from: h */
    public int f163221h;

    /* renamed from: i */
    public int f163222i;

    static {
        C60318ob obVar = new C60318ob();
        f163212j = obVar;
        C62942bv.registerDefaultInstance(C60318ob.class, obVar);
    }

    private C60318ob() {
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
                Object[] objArr = new Object[16];
                objArr[0] = "a";
                objArr[1] = "b";
                C62959cf cfVar = C60319oc.f163223a;
                objArr[15] = cfVar;
                objArr[13] = cfVar;
                objArr[11] = cfVar;
                objArr[9] = cfVar;
                objArr[7] = cfVar;
                objArr[5] = cfVar;
                objArr[2] = cfVar;
                objArr[3] = C45240c.f118157a;
                objArr[4] = "d";
                objArr[6] = "e";
                objArr[8] = C30325g.f82003a;
                objArr[10] = C19618h.f54585a;
                objArr[12] = C10662f.f35572a;
                objArr[14] = "i";
                return newMessageInfo(f163212j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003ဌ\u0002\u0004ဌ\u0003\u0005ဌ\u0005\u0006ဌ\u0006\u0007ဌ\u0004\bဌ\u0007", objArr);
            case 3:
                return new C60318ob();
            case 4:
                return new C60317oa();
            case 5:
                return f163212j;
            case 6:
                C63010eb ebVar = f163213k;
                if (ebVar == null) {
                    synchronized (C60318ob.class) {
                        ebVar = f163213k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f163212j);
                            f163213k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
