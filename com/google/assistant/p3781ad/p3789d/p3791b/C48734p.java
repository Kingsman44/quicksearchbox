package com.google.assistant.p3781ad.p3789d.p3791b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3931f.p3939c.C52838o;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.d.b.p */
/* compiled from: PG */
public final class C48734p extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C48734p f126105j;

    /* renamed from: k */
    private static volatile C63010eb f126106k;

    /* renamed from: a */
    public int f126107a;

    /* renamed from: b */
    public String f126108b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f126109c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public boolean f126110d;

    /* renamed from: e */
    public int f126111e;

    /* renamed from: f */
    public String f126112f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public C52838o f126113g;

    /* renamed from: h */
    public String f126114h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public String f126115i = BuildConfig.FLAVOR;

    static {
        C48734p pVar = new C48734p();
        f126105j = pVar;
        C62942bv.registerDefaultInstance(C48734p.class, pVar);
    }

    private C48734p() {
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
                return newMessageInfo(f126105j, "\u0001\b\u0000\u0001\u0001\r\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0006ဇ\u0005\u0007င\u0006\tဈ\u0007\u000bဈ\n\fဈ\u000b\rဉ\t", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C19618h.f54585a, "i", C30325g.f82003a});
            case 3:
                return new C48734p();
            case 4:
                return new C48733o();
            case 5:
                return f126105j;
            case 6:
                C63010eb ebVar = f126106k;
                if (ebVar == null) {
                    synchronized (C48734p.class) {
                        ebVar = f126106k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126105j);
                            f126106k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
