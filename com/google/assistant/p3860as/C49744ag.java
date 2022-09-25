package com.google.assistant.p3860as;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.assistant.as.ag */
/* compiled from: PG */
public final class C49744ag extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C49744ag f128443g;

    /* renamed from: h */
    public static final C62940bt f128444h;

    /* renamed from: k */
    private static volatile C63010eb f128445k;

    /* renamed from: a */
    public int f128446a;

    /* renamed from: b */
    public C62971cq f128447b = emptyProtobufList();

    /* renamed from: c */
    public C62971cq f128448c = emptyProtobufList();

    /* renamed from: d */
    public C49746ai f128449d;

    /* renamed from: e */
    public C62971cq f128450e = emptyProtobufList();

    /* renamed from: f */
    public C49798l f128451f;

    /* renamed from: i */
    private int f128452i;

    /* renamed from: j */
    private byte f128453j = 2;

    static {
        C49744ag agVar = new C49744ag();
        f128443g = agVar;
        C62942bv.registerDefaultInstance(C49744ag.class, agVar);
        f128444h = C62942bv.newSingularGeneratedExtension(C49742ae.f128440a, agVar, agVar, (C62958ce) null, 338436589, C63066gd.MESSAGE, C49744ag.class);
    }

    private C49744ag() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f128453j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f128453j = b;
                return null;
            case 2:
                return newMessageInfo(f128443g, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0003\u0003\u0001င\u0000\u0002Л\u0003Л\u0004ᐉ\u0001\u0005ဉ\u0002\u0006\u001b", new Object[]{"i", "a", "b", C49746ai.class, C45240c.f118157a, C49746ai.class, "d", C10662f.f35572a, "e", C49782br.class});
            case 3:
                return new C49744ag();
            case 4:
                return new C49743af();
            case 5:
                return f128443g;
            case 6:
                C63010eb ebVar = f128445k;
                if (ebVar == null) {
                    synchronized (C49744ag.class) {
                        ebVar = f128445k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f128443g);
                            f128445k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
