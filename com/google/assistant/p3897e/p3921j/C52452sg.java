package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.sg */
/* compiled from: PG */
public final class C52452sg extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C52452sg f137691f;

    /* renamed from: g */
    private static volatile C63010eb f137692g;

    /* renamed from: a */
    public int f137693a;

    /* renamed from: b */
    public String f137694b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62995dn f137695c = C62995dn.f170057a;

    /* renamed from: d */
    public boolean f137696d;

    /* renamed from: e */
    public String f137697e = BuildConfig.FLAVOR;

    static {
        C52452sg sgVar = new C52452sg();
        f137691f = sgVar;
        C62942bv.registerDefaultInstance(C52452sg.class, sgVar);
    }

    private C52452sg() {
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
                return newMessageInfo(f137691f, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0001\u0000\u0000\u0002ဈ\u0000\u00032\u0004ဇ\u0001\u0005ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, C52451sf.f137690a, "d", "e"});
            case 3:
                return new C52452sg();
            case 4:
                return new C52450se();
            case 5:
                return f137691f;
            case 6:
                C63010eb ebVar = f137692g;
                if (ebVar == null) {
                    synchronized (C52452sg.class) {
                        ebVar = f137692g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137691f);
                            f137692g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
