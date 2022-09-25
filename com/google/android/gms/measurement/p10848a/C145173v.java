package com.google.android.gms.measurement.p10848a;

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

/* renamed from: com.google.android.gms.measurement.a.v */
/* compiled from: PG */
public final class C145173v extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C145173v f392387k;

    /* renamed from: l */
    private static volatile C63010eb f392388l;

    /* renamed from: a */
    public int f392389a;

    /* renamed from: b */
    public long f392390b;

    /* renamed from: c */
    public String f392391c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C62971cq f392392d = emptyProtobufList();

    /* renamed from: e */
    public C62971cq f392393e = emptyProtobufList();

    /* renamed from: f */
    public C62971cq f392394f = emptyProtobufList();

    /* renamed from: g */
    public boolean f392395g;

    /* renamed from: h */
    public C62971cq f392396h = emptyProtobufList();

    /* renamed from: i */
    public C62971cq f392397i = emptyProtobufList();

    /* renamed from: j */
    public String f392398j = BuildConfig.FLAVOR;

    static {
        C145173v vVar = new C145173v();
        f392387k = vVar;
        C62942bv.registerDefaultInstance(C145173v.class, vVar);
    }

    private C145173v() {
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
                return newMessageInfo(f392387k, "\u0001\t\u0000\u0001\u0001\u000b\t\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0004\u001b\u0005\u001b\u0006\u001b\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", C145175x.class, "e", C145171t.class, C10662f.f35572a, C145149b.class, C30325g.f82003a, C19618h.f54585a, C145148az.class, "i", C145169r.class, "j"});
            case 3:
                return new C145173v();
            case 4:
                return new C145172u();
            case 5:
                return f392387k;
            case 6:
                C63010eb ebVar = f392388l;
                if (ebVar == null) {
                    synchronized (C145173v.class) {
                        ebVar = f392388l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f392387k);
                            f392388l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
