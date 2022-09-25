package com.google.assistant.p3860as;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p381aj.p382a.p383a.p384a.C8242v;
import com.google.p4479cg.C58079k;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.as.ai */
/* compiled from: PG */
public final class C49746ai extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C49746ai f128454g;

    /* renamed from: j */
    private static volatile C63010eb f128455j;

    /* renamed from: a */
    public String f128456a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C8242v f128457b;

    /* renamed from: c */
    public C58079k f128458c;

    /* renamed from: d */
    public double f128459d;

    /* renamed from: e */
    public double f128460e;

    /* renamed from: f */
    public C62971cq f128461f = emptyProtobufList();

    /* renamed from: h */
    private int f128462h;

    /* renamed from: i */
    private byte f128463i = 2;

    static {
        C49746ai aiVar = new C49746ai();
        f128454g = aiVar;
        C62942bv.registerDefaultInstance(C49746ai.class, aiVar);
    }

    private C49746ai() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f128463i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f128463i = b;
                return null;
            case 2:
                return newMessageInfo(f128454g, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0001\u0001ဈ\u0000\u0003ᐉ\u0001\u0004\u001b\u0005က\u0003\u0006က\u0004\u0007ဉ\u0002", new Object[]{C19618h.f54585a, "a", "b", C10662f.f35572a, C49782br.class, "d", "e", C45240c.f118157a});
            case 3:
                return new C49746ai();
            case 4:
                return new C49745ah();
            case 5:
                return f128454g;
            case 6:
                C63010eb ebVar = f128455j;
                if (ebVar == null) {
                    synchronized (C49746ai.class) {
                        ebVar = f128455j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f128454g);
                            f128455j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
