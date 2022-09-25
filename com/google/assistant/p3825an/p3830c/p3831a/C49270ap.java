package com.google.assistant.p3825an.p3830c.p3831a;

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

/* renamed from: com.google.assistant.an.c.a.ap */
/* compiled from: PG */
public final class C49270ap extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C49270ap f127353h;

    /* renamed from: j */
    private static volatile C63010eb f127354j;

    /* renamed from: a */
    public int f127355a;

    /* renamed from: b */
    public String f127356b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f127357c = C62942bv.emptyProtobufList();

    /* renamed from: d */
    public int f127358d;

    /* renamed from: e */
    public C49308c f127359e;

    /* renamed from: f */
    public String f127360f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f127361g = BuildConfig.FLAVOR;

    /* renamed from: i */
    private String f127362i = BuildConfig.FLAVOR;

    static {
        C49270ap apVar = new C49270ap();
        f127353h = apVar;
        C62942bv.registerDefaultInstance(C49270ap.class, apVar);
    }

    private C49270ap() {
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
                return newMessageInfo(f127353h, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001a\u0003ဌ\u0001\u0004ဉ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဈ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", C49348y.m85418b(), "e", C10662f.f35572a, "i", C30325g.f82003a});
            case 3:
                return new C49270ap();
            case 4:
                return new C49269ao();
            case 5:
                return f127353h;
            case 6:
                C63010eb ebVar = f127354j;
                if (ebVar == null) {
                    synchronized (C49270ap.class) {
                        ebVar = f127354j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127353h);
                            f127354j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
