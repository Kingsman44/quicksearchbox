package com.google.android.p10712d;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.d.ce */
/* compiled from: PG */
public final class C142353ce extends C62942bv implements C63001dt {

    /* renamed from: n */
    public static final C142353ce f386248n;

    /* renamed from: o */
    private static volatile C63010eb f386249o;

    /* renamed from: a */
    public int f386250a;

    /* renamed from: b */
    public String f386251b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f386252c = C62942bv.emptyProtobufList();

    /* renamed from: d */
    public C62971cq f386253d = C62942bv.emptyProtobufList();

    /* renamed from: e */
    public C62971cq f386254e = C62942bv.emptyProtobufList();

    /* renamed from: f */
    public C62971cq f386255f = C62942bv.emptyProtobufList();

    /* renamed from: g */
    public C62971cq f386256g = C62942bv.emptyProtobufList();

    /* renamed from: h */
    public C62971cq f386257h = C62942bv.emptyProtobufList();

    /* renamed from: i */
    public String f386258i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public String f386259j = BuildConfig.FLAVOR;

    /* renamed from: k */
    public String f386260k = BuildConfig.FLAVOR;

    /* renamed from: l */
    public String f386261l = BuildConfig.FLAVOR;

    /* renamed from: m */
    public String f386262m = BuildConfig.FLAVOR;

    static {
        C142353ce ceVar = new C142353ce();
        f386248n = ceVar;
        C62942bv.registerDefaultInstance(C142353ce.class, ceVar);
    }

    private C142353ce() {
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
                return newMessageInfo(f386248n, "\u0001\f\u0000\u0001\u0001\r\f\u0000\u0006\u0000\u0001ဈ\u0000\u0002\u001a\u0003\u001a\u0004\u001a\u0005\u001a\u0006\u001a\u0007\u001a\bဈ\u0001\tဈ\u0002\nဈ\u0003\fဈ\u0005\rဈ\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a, "l", "m"});
            case 3:
                return new C142353ce();
            case 4:
                return new C142352cd();
            case 5:
                return f386248n;
            case 6:
                C63010eb ebVar = f386249o;
                if (ebVar == null) {
                    synchronized (C142353ce.class) {
                        ebVar = f386249o;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f386248n);
                            f386249o = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
