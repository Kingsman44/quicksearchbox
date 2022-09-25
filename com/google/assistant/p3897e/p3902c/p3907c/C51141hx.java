package com.google.assistant.p3897e.p3902c.p3907c;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.alf;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.c.c.hx */
/* compiled from: PG */
public final class C51141hx extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C51141hx f133119h;

    /* renamed from: j */
    private static volatile C63010eb f133120j;

    /* renamed from: a */
    public int f133121a;

    /* renamed from: b */
    public int f133122b = 0;

    /* renamed from: c */
    public Object f133123c;

    /* renamed from: d */
    public String f133124d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public int f133125e;

    /* renamed from: f */
    public C51012dc f133126f;

    /* renamed from: g */
    public String f133127g = BuildConfig.FLAVOR;

    /* renamed from: i */
    private byte f133128i = 2;

    static {
        C51141hx hxVar = new C51141hx();
        f133119h = hxVar;
        C62942bv.registerDefaultInstance(C51141hx.class, hxVar);
    }

    private C51141hx() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f133128i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f133128i = b;
                return null;
            case 2:
                return newMessageInfo(f133119h, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0001\u0001ျ\u0000\u0002ဌ\u0003\u0003ᐉ\u0004\u0004ဈ\u0005\u0005ဈ\u0002\u0006ြ\u0000", new Object[]{C45240c.f118157a, "b", "a", "e", C51140hw.m86042b(), C10662f.f35572a, C30325g.f82003a, "d", alf.class});
            case 3:
                return new C51141hx();
            case 4:
                return new C51138hu();
            case 5:
                return f133119h;
            case 6:
                C63010eb ebVar = f133120j;
                if (ebVar == null) {
                    synchronized (C51141hx.class) {
                        ebVar = f133120j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133119h);
                            f133120j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
