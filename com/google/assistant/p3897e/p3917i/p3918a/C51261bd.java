package com.google.assistant.p3897e.p3917i.p3918a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.bd */
/* compiled from: PG */
public final class C51261bd extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C51261bd f133446d;

    /* renamed from: g */
    private static volatile C63010eb f133447g;

    /* renamed from: a */
    public int f133448a;

    /* renamed from: b */
    public int f133449b;

    /* renamed from: c */
    public String f133450c = BuildConfig.FLAVOR;

    /* renamed from: e */
    private C62995dn f133451e = C62995dn.f170057a;

    /* renamed from: f */
    private C62995dn f133452f = C62995dn.f170057a;

    static {
        C51261bd bdVar = new C51261bd();
        f133446d = bdVar;
        C62942bv.registerDefaultInstance(C51261bd.class, bdVar);
    }

    private C51261bd() {
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
                return newMessageInfo(f133446d, "\u0001\u0004\u0000\u0001\u0001\n\u0004\u0002\u0000\u0000\u0001ဌ\u0000\u0003࠲\u00042\nဈ\u0005", new Object[]{"a", "b", C51256az.f133439a, "e", C51260bc.f133445a, C51259bb.f133444a, C10662f.f35572a, C51258ba.f133443a, C45240c.f118157a});
            case 3:
                return new C51261bd();
            case 4:
                return new C51255ay();
            case 5:
                return f133446d;
            case 6:
                C63010eb ebVar = f133447g;
                if (ebVar == null) {
                    synchronized (C51261bd.class) {
                        ebVar = f133447g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133446d);
                            f133447g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
