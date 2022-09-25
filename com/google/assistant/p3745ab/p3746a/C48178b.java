package com.google.assistant.p3745ab.p3746a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C52431rm;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.a.b */
/* compiled from: PG */
public final class C48178b extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C48178b f124659h;

    /* renamed from: j */
    private static volatile C63010eb f124660j;

    /* renamed from: a */
    public int f124661a;

    /* renamed from: b */
    public long f124662b;

    /* renamed from: c */
    public String f124663c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f124664d;

    /* renamed from: e */
    public String f124665e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f124666f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f124667g = BuildConfig.FLAVOR;

    /* renamed from: i */
    private byte f124668i = 2;

    static {
        C48178b bVar = new C48178b();
        f124659h = bVar;
        C62942bv.registerDefaultInstance(C48178b.class, bVar);
    }

    private C48178b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f124668i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f124668i = b;
                return null;
            case 2:
                return newMessageInfo(f124659h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0001\u0001ᔂ\u0000\u0002ဈ\u0001\u0004ဌ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", C52431rm.m86629c(), "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C48178b();
            case 4:
                return new C48177a();
            case 5:
                return f124659h;
            case 6:
                C63010eb ebVar = f124660j;
                if (ebVar == null) {
                    synchronized (C48178b.class) {
                        ebVar = f124660j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124659h);
                            f124660j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
