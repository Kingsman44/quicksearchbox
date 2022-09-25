package com.google.android.apps.auto.p450a.p451a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.auto.a.a.ax */
/* compiled from: PG */
public final class C8879ax extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C8879ax f30820i;

    /* renamed from: j */
    private static volatile C63010eb f30821j;

    /* renamed from: a */
    public int f30822a;

    /* renamed from: b */
    public String f30823b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f30824c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C8865aj f30825d;

    /* renamed from: e */
    public C8881az f30826e;

    /* renamed from: f */
    public C8881az f30827f;

    /* renamed from: g */
    public C8933z f30828g;

    /* renamed from: h */
    public C62971cq f30829h = emptyProtobufList();

    static {
        C8879ax axVar = new C8879ax();
        f30820i = axVar;
        C62942bv.registerDefaultInstance(C8879ax.class, axVar);
    }

    private C8879ax() {
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
                return newMessageInfo(f30820i, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဉ\u0005\u0005\u001b\bဉ\u0003\tဉ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", C30325g.f82003a, C19618h.f54585a, C8867al.class, "e", C10662f.f35572a});
            case 3:
                return new C8879ax();
            case 4:
                return new C8878aw();
            case 5:
                return f30820i;
            case 6:
                C63010eb ebVar = f30821j;
                if (ebVar == null) {
                    synchronized (C8879ax.class) {
                        ebVar = f30821j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f30820i);
                            f30821j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
