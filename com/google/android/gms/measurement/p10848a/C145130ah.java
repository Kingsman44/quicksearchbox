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

/* renamed from: com.google.android.gms.measurement.a.ah */
/* compiled from: PG */
public final class C145130ah extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C145130ah f392224h;

    /* renamed from: i */
    private static volatile C63010eb f392225i;

    /* renamed from: a */
    public int f392226a;

    /* renamed from: b */
    public String f392227b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f392228c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public long f392229d;

    /* renamed from: e */
    public float f392230e;

    /* renamed from: f */
    public double f392231f;

    /* renamed from: g */
    public C62971cq f392232g = emptyProtobufList();

    static {
        C145130ah ahVar = new C145130ah();
        f392224h = ahVar;
        C62942bv.registerDefaultInstance(C145130ah.class, ahVar);
    }

    private C145130ah() {
    }

    /* renamed from: a */
    public final void mo120668a() {
        C62971cq cqVar = this.f392232g;
        if (!cqVar.mo58948c()) {
            this.f392232g = C62942bv.mutableCopy(cqVar);
        }
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
                return newMessageInfo(f392224h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C145130ah.class});
            case 3:
                return new C145130ah();
            case 4:
                return new C145129ag();
            case 5:
                return f392224h;
            case 6:
                C63010eb ebVar = f392225i;
                if (ebVar == null) {
                    synchronized (C145130ah.class) {
                        ebVar = f392225i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f392224h);
                            f392225i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
