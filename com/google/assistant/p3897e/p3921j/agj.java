package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.agj */
/* compiled from: PG */
public final class agj extends C62937bq implements C62938br {

    /* renamed from: g */
    public static final agj f135054g;

    /* renamed from: i */
    private static volatile C63010eb f135055i;

    /* renamed from: a */
    public int f135056a;

    /* renamed from: b */
    public String f135057b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f135058c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f135059d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f135060e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public boolean f135061f;

    /* renamed from: h */
    private byte f135062h = 2;

    static {
        agj agj = new agj();
        f135054g = agj;
        C62942bv.registerDefaultInstance(agj.class, agj);
    }

    private agj() {
    }

    /* renamed from: a */
    public static C63010eb m86308a() {
        return f135054g.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f135062h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f135062h = b;
                return null;
            case 2:
                return newMessageInfo(f135054g, "\u0001\u0005\u0000\u0001\u0002\u0006\u0005\u0000\u0000\u0000\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0003\u0005ဈ\u0002\u0006ဇ\u0004", new Object[]{"a", "b", C45240c.f118157a, "e", "d", C10662f.f35572a});
            case 3:
                return new agj();
            case 4:
                return new agi();
            case 5:
                return f135054g;
            case 6:
                C63010eb ebVar = f135055i;
                if (ebVar == null) {
                    synchronized (agj.class) {
                        ebVar = f135055i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135054g);
                            f135055i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
