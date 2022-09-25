package com.google.p375ai.p378b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.ct */
/* compiled from: PG */
public final class C7593ct extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C7593ct f26245g;

    /* renamed from: j */
    private static volatile C63010eb f26246j;

    /* renamed from: a */
    public String f26247a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f26248b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f26249c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C62971cq f26250d = emptyProtobufList();

    /* renamed from: e */
    public C8178yk f26251e;

    /* renamed from: f */
    public String f26252f = BuildConfig.FLAVOR;

    /* renamed from: h */
    private int f26253h;

    /* renamed from: i */
    private byte f26254i = 2;

    static {
        C7593ct ctVar = new C7593ct();
        f26245g = ctVar;
        C62942bv.registerDefaultInstance(C7593ct.class, ctVar);
    }

    private C7593ct() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f26254i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f26254i = b;
                return null;
            case 2:
                return newMessageInfo(f26245g, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0002\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004Л\u0005ᐉ\u0003\u0006ဈ\u0004", new Object[]{C19618h.f54585a, "a", "b", C45240c.f118157a, "d", C7592cs.class, "e", C10662f.f35572a});
            case 3:
                return new C7593ct();
            case 4:
                return new C7590cq();
            case 5:
                return f26245g;
            case 6:
                C63010eb ebVar = f26246j;
                if (ebVar == null) {
                    synchronized (C7593ct.class) {
                        ebVar = f26246j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f26245g);
                            f26246j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
