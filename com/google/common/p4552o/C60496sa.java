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

/* renamed from: com.google.common.o.sa */
/* compiled from: PG */
public final class C60496sa extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C60496sa f163764k;

    /* renamed from: l */
    private static volatile C63010eb f163765l;

    /* renamed from: a */
    public int f163766a;

    /* renamed from: b */
    public boolean f163767b;

    /* renamed from: c */
    public int f163768c = 1;

    /* renamed from: d */
    public int f163769d;

    /* renamed from: e */
    public boolean f163770e;

    /* renamed from: f */
    public boolean f163771f;

    /* renamed from: g */
    public boolean f163772g;

    /* renamed from: h */
    public boolean f163773h;

    /* renamed from: i */
    public boolean f163774i;

    /* renamed from: j */
    public boolean f163775j;

    static {
        C60496sa saVar = new C60496sa();
        f163764k = saVar;
        C62942bv.registerDefaultInstance(C60496sa.class, saVar);
    }

    private C60496sa() {
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
                return newMessageInfo(f163764k, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0006\u0007ဇ\u0007\bဇ\u0005\nဇ\t", new Object[]{"a", "b", C45240c.f118157a, C60492rx.m92597b(), "d", C60494rz.m92599b(), "e", C10662f.f35572a, C19618h.f54585a, "i", C30325g.f82003a, "j"});
            case 3:
                return new C60496sa();
            case 4:
                return new C60490rv();
            case 5:
                return f163764k;
            case 6:
                C63010eb ebVar = f163765l;
                if (ebVar == null) {
                    synchronized (C60496sa.class) {
                        ebVar = f163765l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f163764k);
                            f163765l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
