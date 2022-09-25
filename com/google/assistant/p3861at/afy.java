package com.google.assistant.p3861at;

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

/* renamed from: com.google.assistant.at.afy */
/* compiled from: PG */
public final class afy extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final afy f129188g;

    /* renamed from: i */
    private static volatile C63010eb f129189i;

    /* renamed from: a */
    public int f129190a;

    /* renamed from: b */
    public String f129191b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f129192c = emptyProtobufList();

    /* renamed from: d */
    public boolean f129193d;

    /* renamed from: e */
    public String f129194e;

    /* renamed from: f */
    public String f129195f;

    /* renamed from: h */
    private afi f129196h;

    static {
        afy afy = new afy();
        f129188g = afy;
        C62942bv.registerDefaultInstance(afy.class, afy);
    }

    private afy() {
        emptyProtobufList();
        this.f129194e = BuildConfig.FLAVOR;
        emptyProtobufList();
        emptyProtobufList();
        this.f129195f = BuildConfig.FLAVOR;
        emptyProtobufList();
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
                return newMessageInfo(f129188g, "\u0001\u0006\u0000\u0001\u0001\u0019\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0004ဇ\u0005\u0005ဈ\u0006\tဈ\b\u0012\u001b\u0019ဉ\u0011", new Object[]{"a", "b", "d", "e", C10662f.f35572a, C45240c.f118157a, afm.class, C19618h.f54585a});
            case 3:
                return new afy();
            case 4:
                return new afx();
            case 5:
                return f129188g;
            case 6:
                C63010eb ebVar = f129189i;
                if (ebVar == null) {
                    synchronized (afy.class) {
                        ebVar = f129189i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129188g);
                            f129189i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
