package com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9595b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34065ca;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.f.a.b.e */
/* compiled from: PG */
public final class C127418e extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C127418e f350849g;

    /* renamed from: i */
    private static volatile C63010eb f350850i;

    /* renamed from: a */
    public int f350851a;

    /* renamed from: b */
    public int f350852b = 0;

    /* renamed from: c */
    public Object f350853c;

    /* renamed from: d */
    public String f350854d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C127416c f350855e;

    /* renamed from: f */
    public C34065ca f350856f;

    /* renamed from: h */
    private byte f350857h = 2;

    static {
        C127418e eVar = new C127418e();
        f350849g = eVar;
        C62942bv.registerDefaultInstance(C127418e.class, eVar);
    }

    private C127418e() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f350857h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f350857h = b;
                return null;
            case 2:
                return newMessageInfo(f350849g, "\u0000\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001<\u0000\u0002ለ\u0000\u0003ဉ\u0001\u0004ᐉ\u0002", new Object[]{C45240c.f118157a, "b", "a", C51805du.class, "d", "e", C10662f.f35572a});
            case 3:
                return new C127418e();
            case 4:
                return new C127417d();
            case 5:
                return f350849g;
            case 6:
                C63010eb ebVar = f350850i;
                if (ebVar == null) {
                    synchronized (C127418e.class) {
                        ebVar = f350850i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f350849g);
                            f350850i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
