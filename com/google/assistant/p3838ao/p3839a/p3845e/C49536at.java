package com.google.assistant.p3838ao.p3839a.p3845e;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.assistant.ao.a.e.at */
/* compiled from: PG */
public final class C49536at extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C49536at f127812d;

    /* renamed from: e */
    public static final C62940bt f127813e;

    /* renamed from: f */
    private static volatile C63010eb f127814f;

    /* renamed from: a */
    public int f127815a;

    /* renamed from: b */
    public String f127816b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public double f127817c;

    static {
        C49536at atVar = new C49536at();
        f127812d = atVar;
        C62942bv.registerDefaultInstance(C49536at.class, atVar);
        f127813e = C62942bv.newSingularGeneratedExtension(C49520ad.f127756b, atVar, atVar, (C62958ce) null, 281066814, C63066gd.MESSAGE, C49536at.class);
    }

    private C49536at() {
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
                return newMessageInfo(f127812d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002က\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C49536at();
            case 4:
                return new C49535as();
            case 5:
                return f127812d;
            case 6:
                C63010eb ebVar = f127814f;
                if (ebVar == null) {
                    synchronized (C49536at.class) {
                        ebVar = f127814f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127812d);
                            f127814f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
