package com.google.p395al.p408c.p414c.p416b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.al.c.c.b.ai */
/* compiled from: PG */
public final class C8466ai extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C8466ai f29395g;

    /* renamed from: h */
    private static volatile C63010eb f29396h;

    /* renamed from: a */
    public int f29397a;

    /* renamed from: b */
    public String f29398b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public boolean f29399c;

    /* renamed from: d */
    public C62971cq f29400d = C62942bv.emptyProtobufList();

    /* renamed from: e */
    public C62971cq f29401e = C62942bv.emptyProtobufList();

    /* renamed from: f */
    public String f29402f = BuildConfig.FLAVOR;

    static {
        C8466ai aiVar = new C8466ai();
        f29395g = aiVar;
        C62942bv.registerDefaultInstance(C8466ai.class, aiVar);
    }

    private C8466ai() {
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
                return newMessageInfo(f29395g, "\u0001\u0005\u0000\u0001\u0001\t\u0005\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001a\u0003\u001a\u0004ဈ\u0002\tဇ\u0001", new Object[]{"a", "b", "d", "e", C10662f.f35572a, C45240c.f118157a});
            case 3:
                return new C8466ai();
            case 4:
                return new C8465ah();
            case 5:
                return f29395g;
            case 6:
                C63010eb ebVar = f29396h;
                if (ebVar == null) {
                    synchronized (C8466ai.class) {
                        ebVar = f29396h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29395g);
                            f29396h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
