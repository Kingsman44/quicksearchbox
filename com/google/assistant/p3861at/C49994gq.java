package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.gq */
/* compiled from: PG */
public final class C49994gq extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C49994gq f129959g;

    /* renamed from: h */
    private static volatile C63010eb f129960h;

    /* renamed from: a */
    public int f129961a;

    /* renamed from: b */
    public C62971cq f129962b = emptyProtobufList();

    /* renamed from: c */
    public C62971cq f129963c = emptyProtobufList();

    /* renamed from: d */
    public String f129964d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f129965e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f129966f = BuildConfig.FLAVOR;

    static {
        C49994gq gqVar = new C49994gq();
        f129959g = gqVar;
        C62942bv.registerDefaultInstance(C49994gq.class, gqVar);
    }

    private C49994gq() {
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
                return newMessageInfo(f129959g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003ဈ\u0000\u0004ဈ\u0001\u0005ဈ\u0002", new Object[]{"a", "b", C49993gp.class, C45240c.f118157a, C49993gp.class, "d", "e", C10662f.f35572a});
            case 3:
                return new C49994gq();
            case 4:
                return new C49991gn();
            case 5:
                return f129959g;
            case 6:
                C63010eb ebVar = f129960h;
                if (ebVar == null) {
                    synchronized (C49994gq.class) {
                        ebVar = f129960h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129959g);
                            f129960h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
