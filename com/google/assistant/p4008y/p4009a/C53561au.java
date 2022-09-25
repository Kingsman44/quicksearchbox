package com.google.assistant.p4008y.p4009a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.y.a.au */
/* compiled from: PG */
public final class C53561au extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C62962ci f140568d = new C53557aq();

    /* renamed from: h */
    public static final C53561au f140569h;

    /* renamed from: i */
    private static volatile C63010eb f140570i;

    /* renamed from: a */
    public int f140571a;

    /* renamed from: b */
    public String f140572b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62961ch f140573c = emptyIntList();

    /* renamed from: e */
    public String f140574e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C62971cq f140575f = C62942bv.emptyProtobufList();

    /* renamed from: g */
    public String f140576g = BuildConfig.FLAVOR;

    static {
        C53561au auVar = new C53561au();
        f140569h = auVar;
        C62942bv.registerDefaultInstance(C53561au.class, auVar);
    }

    private C53561au() {
        C62942bv.emptyProtobufList();
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
                return newMessageInfo(f140569h, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001e\u0003ဈ\u0001\u0004\u001a\u0005ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, C53560at.m86869b(), "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C53561au();
            case 4:
                return new C53558ar();
            case 5:
                return f140569h;
            case 6:
                C63010eb ebVar = f140570i;
                if (ebVar == null) {
                    synchronized (C53561au.class) {
                        ebVar = f140570i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140569h);
                            f140570i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
