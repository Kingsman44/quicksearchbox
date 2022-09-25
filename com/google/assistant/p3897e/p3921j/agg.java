package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.agg */
/* compiled from: PG */
public final class agg extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final agg f135040f;

    /* renamed from: i */
    private static volatile C63010eb f135041i;

    /* renamed from: a */
    public C52374pj f135042a;

    /* renamed from: b */
    public String f135043b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C51012dc f135044c;

    /* renamed from: d */
    public C51098gh f135045d;

    /* renamed from: e */
    public String f135046e = BuildConfig.FLAVOR;

    /* renamed from: g */
    private int f135047g;

    /* renamed from: h */
    private byte f135048h = 2;

    static {
        agg agg = new agg();
        f135040f = agg;
        C62942bv.registerDefaultInstance(agg.class, agg);
    }

    private agg() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f135048h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f135048h = b;
                return null;
            case 2:
                return newMessageInfo(f135040f, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဉ\u0003\u0003ဈ\u0004\u0004ဈ\u0001\u0005ᐉ\u0002", new Object[]{C30325g.f82003a, "a", "d", "e", "b", C45240c.f118157a});
            case 3:
                return new agg();
            case 4:
                return new agf();
            case 5:
                return f135040f;
            case 6:
                C63010eb ebVar = f135041i;
                if (ebVar == null) {
                    synchronized (agg.class) {
                        ebVar = f135041i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135040f);
                            f135041i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
