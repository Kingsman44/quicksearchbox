package com.google.assistant.p3897e.p3921j.p3926e;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.e.fx */
/* compiled from: PG */
public final class C51971fx extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C51971fx f136380g;

    /* renamed from: h */
    private static volatile C63010eb f136381h;

    /* renamed from: a */
    public int f136382a;

    /* renamed from: b */
    public String f136383b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C51968fu f136384c;

    /* renamed from: d */
    public C51968fu f136385d;

    /* renamed from: e */
    public String f136386e;

    /* renamed from: f */
    public int f136387f;

    static {
        C51971fx fxVar = new C51971fx();
        f136380g = fxVar;
        C62942bv.registerDefaultInstance(C51971fx.class, fxVar);
    }

    private C51971fx() {
        emptyProtobufList();
        this.f136386e = BuildConfig.FLAVOR;
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
                return newMessageInfo(f136380g, "\u0001\u0005\u0000\u0001\u0001\b\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0006ဈ\u0003\bဌ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C51969fv.f136379a});
            case 3:
                return new C51971fx();
            case 4:
                return new C51966fs();
            case 5:
                return f136380g;
            case 6:
                C63010eb ebVar = f136381h;
                if (ebVar == null) {
                    synchronized (C51971fx.class) {
                        ebVar = f136381h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136380g);
                            f136381h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
