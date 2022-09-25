package com.google.assistant.p3838ao.p3839a.p3845e;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.knowledge.p4661a.p4662a.C61752n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.assistant.ao.a.e.f */
/* compiled from: PG */
public final class C49615f extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C49615f f128030f;

    /* renamed from: g */
    public static final C62940bt f128031g;

    /* renamed from: i */
    private static volatile C63010eb f128032i;

    /* renamed from: a */
    public int f128033a;

    /* renamed from: b */
    public C63042fg f128034b;

    /* renamed from: c */
    public String f128035c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public double f128036d;

    /* renamed from: e */
    public C61752n f128037e;

    /* renamed from: h */
    private byte f128038h = 2;

    static {
        C49615f fVar = new C49615f();
        f128030f = fVar;
        C62942bv.registerDefaultInstance(C49615f.class, fVar);
        f128031g = C62942bv.newSingularGeneratedExtension(C49598da.f127991a, fVar, fVar, (C62958ce) null, 295918373, C63066gd.MESSAGE, C49615f.class);
    }

    private C49615f() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f128038h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f128038h = b;
                return null;
            case 2:
                return newMessageInfo(f128030f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဈ\u0001\u0003က\u0002\u0004ᐉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C49615f();
            case 4:
                return new C49614e();
            case 5:
                return f128030f;
            case 6:
                C63010eb ebVar = f128032i;
                if (ebVar == null) {
                    synchronized (C49615f.class) {
                        ebVar = f128032i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f128030f);
                            f128032i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
