package com.google.android.apps.gsa.sidekick.shared.util;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p375ai.p378b.C7669fo;
import com.google.p375ai.p378b.C7746ik;
import com.google.p375ai.p378b.C8143xc;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.util.x */
/* compiled from: PG */
public final class C92005x extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C92005x f256507g;

    /* renamed from: h */
    private static volatile C63010eb f256508h;

    /* renamed from: a */
    public int f256509a;

    /* renamed from: b */
    public C7669fo f256510b;

    /* renamed from: c */
    public int f256511c;

    /* renamed from: d */
    public int f256512d = 48;

    /* renamed from: e */
    public C62971cq f256513e = emptyProtobufList();

    /* renamed from: f */
    public String f256514f = BuildConfig.FLAVOR;

    static {
        C92005x xVar = new C92005x();
        f256507g = xVar;
        C62942bv.registerDefaultInstance(C92005x.class, xVar);
    }

    private C92005x() {
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
                return newMessageInfo(f256507g, "\u0001\u0005\u0000\u0001\u0003\b\u0005\u0000\u0001\u0000\u0003ဉ\u0000\u0004ဌ\u0001\u0006ဌ\u0002\u0007\u001b\bဈ\u0003", new Object[]{"a", "b", C45240c.f118157a, C8143xc.f28650a, "d", C7746ik.m22835b(), "e", C91951ab.class, C10662f.f35572a});
            case 3:
                return new C92005x();
            case 4:
                return new C92004w();
            case 5:
                return f256507g;
            case 6:
                C63010eb ebVar = f256508h;
                if (ebVar == null) {
                    synchronized (C92005x.class) {
                        ebVar = f256508h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f256507g);
                            f256508h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
