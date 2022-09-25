package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.acf */
/* compiled from: PG */
public final class acf extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final acf f158284h;

    /* renamed from: i */
    private static volatile C63010eb f158285i;

    /* renamed from: a */
    public int f158286a;

    /* renamed from: b */
    public String f158287b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f158288c;

    /* renamed from: d */
    public int f158289d;

    /* renamed from: e */
    public int f158290e;

    /* renamed from: f */
    public int f158291f;

    /* renamed from: g */
    public int f158292g;

    static {
        acf acf = new acf();
        f158284h = acf;
        C62942bv.registerDefaultInstance(acf.class, acf);
    }

    private acf() {
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
                return newMessageInfo(f158284h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002\u0005ဌ\u0005\u0006ဌ\u0006\u0007င\u0007", new Object[]{"a", "b", C45240c.f118157a, "d", "e", ace.f158283a, C10662f.f35572a, acd.f158282a, C30325g.f82003a});
            case 3:
                return new acf();
            case 4:
                return new acc();
            case 5:
                return f158284h;
            case 6:
                C63010eb ebVar = f158285i;
                if (ebVar == null) {
                    synchronized (acf.class) {
                        ebVar = f158285i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158284h);
                            f158285i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
