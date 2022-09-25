package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p3723ar.imp.view.C48004n;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4985f.p4988b.p4992c.C64768p;

@Deprecated
/* renamed from: com.google.assistant.e.j.xc */
/* compiled from: PG */
public final class C52583xc extends C62942bv implements C63001dt {

    /* renamed from: o */
    public static final C52583xc f138063o;

    /* renamed from: p */
    private static volatile C63010eb f138064p;

    /* renamed from: a */
    public int f138065a;

    /* renamed from: b */
    public int f138066b;

    /* renamed from: c */
    public int f138067c;

    /* renamed from: d */
    public C62910ar f138068d;

    /* renamed from: e */
    public int f138069e;

    /* renamed from: f */
    public C62910ar f138070f;

    /* renamed from: g */
    public String f138071g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public String f138072h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public String f138073i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public C62971cq f138074j = C62942bv.emptyProtobufList();

    /* renamed from: k */
    public C64768p f138075k;

    /* renamed from: l */
    public int f138076l;

    /* renamed from: m */
    public boolean f138077m;

    /* renamed from: n */
    public C52591xk f138078n;

    static {
        C52583xc xcVar = new C52583xc();
        f138063o = xcVar;
        C62942bv.registerDefaultInstance(C52583xc.class, xcVar);
    }

    private C52583xc() {
        emptyIntList();
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
                return newMessageInfo(f138063o, "\u0001\r\u0000\u0001\u0001\u0010\r\u0000\u0001\u0000\u0001ဌ\u0000\u0002င\u0001\u0003ဉ\u0002\u0005ဌ\u0003\u0006ဉ\u0004\bဈ\u0005\tဈ\u0006\nဈ\u0007\f\u001a\rဌ\n\u000eဉ\t\u000fဇ\u000b\u0010ဉ\f", new Object[]{"a", "b", C52579wz.m86657b(), C45240c.f118157a, "d", "e", C52577wx.m86655b(), C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", "l", C52582xb.m86659b(), C19621k.f54601a, "m", C48004n.f124238a});
            case 3:
                return new C52583xc();
            case 4:
                return new C52575wv();
            case 5:
                return f138063o;
            case 6:
                C63010eb ebVar = f138064p;
                if (ebVar == null) {
                    synchronized (C52583xc.class) {
                        ebVar = f138064p;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138063o);
                            f138064p = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
