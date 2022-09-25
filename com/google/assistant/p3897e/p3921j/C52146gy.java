package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.gy */
/* compiled from: PG */
public final class C52146gy extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C52146gy f136826f;

    /* renamed from: h */
    private static volatile C63010eb f136827h;

    /* renamed from: a */
    public String f136828a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public boolean f136829b;

    /* renamed from: c */
    public String f136830c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f136831d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f136832e = BuildConfig.FLAVOR;

    /* renamed from: g */
    private int f136833g;

    static {
        C52146gy gyVar = new C52146gy();
        f136826f = gyVar;
        C62942bv.registerDefaultInstance(C52146gy.class, gyVar);
    }

    private C52146gy() {
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
                return newMessageInfo(f136826f, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{C30325g.f82003a, "a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C52146gy();
            case 4:
                return new C52145gx();
            case 5:
                return f136826f;
            case 6:
                C63010eb ebVar = f136827h;
                if (ebVar == null) {
                    synchronized (C52146gy.class) {
                        ebVar = f136827h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136826f);
                            f136827h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
