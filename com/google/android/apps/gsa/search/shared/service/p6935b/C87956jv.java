package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.android.libraries.lens.p1995c.p1996a.p1997a.C24071b;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62959cf;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.jv */
/* compiled from: PG */
public final class C87956jv extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C87956jv f237889h;

    /* renamed from: i */
    private static volatile C63010eb f237890i;

    /* renamed from: a */
    public int f237891a;

    /* renamed from: b */
    public int f237892b;

    /* renamed from: c */
    public C87955ju f237893c;

    /* renamed from: d */
    public C87953js f237894d;

    /* renamed from: e */
    public int f237895e = -1;

    /* renamed from: f */
    public int f237896f = -1;

    /* renamed from: g */
    public int f237897g = -1;

    static {
        C87956jv jvVar = new C87956jv();
        f237889h = jvVar;
        C62942bv.registerDefaultInstance(C87956jv.class, jvVar);
    }

    private C87956jv() {
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
                Object[] objArr = new Object[10];
                objArr[0] = "a";
                objArr[1] = "b";
                objArr[2] = C45240c.f118157a;
                objArr[3] = "d";
                objArr[4] = "e";
                C62959cf cfVar = C24071b.f65752a;
                objArr[9] = cfVar;
                objArr[7] = cfVar;
                objArr[5] = cfVar;
                objArr[6] = C10662f.f35572a;
                objArr[8] = C30325g.f82003a;
                return newMessageInfo(f237889h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဌ\u0003\u0005ဌ\u0004\u0007ဌ\u0005", objArr);
            case 3:
                return new C87956jv();
            case 4:
                return new C87937jc();
            case 5:
                return f237889h;
            case 6:
                C63010eb ebVar = f237890i;
                if (ebVar == null) {
                    synchronized (C87956jv.class) {
                        ebVar = f237890i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237889h);
                            f237890i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
