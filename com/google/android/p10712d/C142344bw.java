package com.google.android.p10712d;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.d.bw */
/* compiled from: PG */
public final class C142344bw extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C142344bw f386209i;

    /* renamed from: j */
    private static volatile C63010eb f386210j;

    /* renamed from: a */
    public int f386211a;

    /* renamed from: b */
    public String f386212b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f386213c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C142355cg f386214d;

    /* renamed from: e */
    public String f386215e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C142332bk f386216f;

    /* renamed from: g */
    public String f386217g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public String f386218h = BuildConfig.FLAVOR;

    static {
        C142344bw bwVar = new C142344bw();
        f386209i = bwVar;
        C62942bv.registerDefaultInstance(C142344bw.class, bwVar);
    }

    private C142344bw() {
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
                return newMessageInfo(f386209i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဈ\u0003\u0005ဉ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C142344bw();
            case 4:
                return new C142343bv();
            case 5:
                return f386209i;
            case 6:
                C63010eb ebVar = f386210j;
                if (ebVar == null) {
                    synchronized (C142344bw.class) {
                        ebVar = f386210j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f386209i);
                            f386210j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
