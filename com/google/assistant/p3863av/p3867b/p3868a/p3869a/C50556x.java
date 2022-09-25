package com.google.assistant.p3863av.p3867b.p3868a.p3869a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.av.b.a.a.x */
/* compiled from: PG */
public final class C50556x extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C50556x f131574g;

    /* renamed from: i */
    private static volatile C63010eb f131575i;

    /* renamed from: a */
    public int f131576a;

    /* renamed from: b */
    public C50551s f131577b;

    /* renamed from: c */
    public C50555w f131578c;

    /* renamed from: d */
    public C50553u f131579d;

    /* renamed from: e */
    public int f131580e;

    /* renamed from: f */
    public String f131581f = BuildConfig.FLAVOR;

    /* renamed from: h */
    private byte f131582h = 2;

    static {
        C50556x xVar = new C50556x();
        f131574g = xVar;
        C62942bv.registerDefaultInstance(C50556x.class, xVar);
    }

    private C50556x() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f131582h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f131582h = b;
                return null;
            case 2:
                return newMessageInfo(f131574g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001\u0003ဌ\u0003\u0004ဈ\u0004\u0005ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "e", C50549q.f131562a, C10662f.f35572a, "d"});
            case 3:
                return new C50556x();
            case 4:
                return new C50548p();
            case 5:
                return f131574g;
            case 6:
                C63010eb ebVar = f131575i;
                if (ebVar == null) {
                    synchronized (C50556x.class) {
                        ebVar = f131575i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131574g);
                            f131575i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
