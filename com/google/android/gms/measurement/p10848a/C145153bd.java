package com.google.android.gms.measurement.p10848a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.gms.measurement.a.bd */
/* compiled from: PG */
public final class C145153bd extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C145153bd f392324h;

    /* renamed from: i */
    private static volatile C63010eb f392325i;

    /* renamed from: a */
    public int f392326a;

    /* renamed from: b */
    public int f392327b;

    /* renamed from: c */
    public C62971cq f392328c = emptyProtobufList();

    /* renamed from: d */
    public String f392329d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f392330e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public boolean f392331f;

    /* renamed from: g */
    public double f392332g;

    static {
        C145153bd bdVar = new C145153bd();
        f392324h = bdVar;
        C62942bv.registerDefaultInstance(C145153bd.class, bdVar);
    }

    private C145153bd() {
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
                return newMessageInfo(f392324h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"a", "b", C145151bb.f392323a, C45240c.f118157a, C145153bd.class, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C145153bd();
            case 4:
                return new C145150ba();
            case 5:
                return f392324h;
            case 6:
                C63010eb ebVar = f392325i;
                if (ebVar == null) {
                    synchronized (C145153bd.class) {
                        ebVar = f392325i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f392324h);
                            f392325i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
