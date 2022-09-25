package com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.n */
/* compiled from: PG */
public final class C16764n extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C16764n f49053j;

    /* renamed from: k */
    private static volatile C63010eb f49054k;

    /* renamed from: a */
    public int f49055a;

    /* renamed from: b */
    public String f49056b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f49057c = C62942bv.emptyProtobufList();

    /* renamed from: d */
    public String f49058d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f49059e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f49060f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public int f49061g;

    /* renamed from: h */
    public C62971cq f49062h = emptyProtobufList();

    /* renamed from: i */
    public String f49063i = BuildConfig.FLAVOR;

    static {
        C16764n nVar = new C16764n();
        f49053j = nVar;
        C62942bv.registerDefaultInstance(C16764n.class, nVar);
    }

    private C16764n() {
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
                return newMessageInfo(f49053j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001a\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဈ\u0003\u0006င\u0004\u0007\u001b\bဈ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, C16763m.class, "i"});
            case 3:
                return new C16764n();
            case 4:
                return new C16761k();
            case 5:
                return f49053j;
            case 6:
                C63010eb ebVar = f49054k;
                if (ebVar == null) {
                    synchronized (C16764n.class) {
                        ebVar = f49054k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f49053j);
                            f49054k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
