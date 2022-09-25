package com.google.assistant.p3897e.p3921j.p3926e;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3921j.C52533vg;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.e.ih */
/* compiled from: PG */
public final class C52036ih extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C52036ih f136574g;

    /* renamed from: i */
    private static volatile C63010eb f136575i;

    /* renamed from: a */
    public int f136576a;

    /* renamed from: b */
    public String f136577b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C51098gh f136578c;

    /* renamed from: d */
    public String f136579d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C62971cq f136580e = emptyProtobufList();

    /* renamed from: f */
    public C62971cq f136581f = emptyProtobufList();

    /* renamed from: h */
    private byte f136582h = 2;

    static {
        C52036ih ihVar = new C52036ih();
        f136574g = ihVar;
        C62942bv.registerDefaultInstance(C52036ih.class, ihVar);
    }

    private C52036ih() {
    }

    /* renamed from: a */
    public static C63010eb m86472a() {
        return f136574g.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f136582h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f136582h = b;
                return null;
            case 2:
                return newMessageInfo(f136574g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0001\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004\u001b\u0005Л", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C52035ig.class, C10662f.f35572a, C52533vg.class});
            case 3:
                return new C52036ih();
            case 4:
                return new C52033ie();
            case 5:
                return f136574g;
            case 6:
                C63010eb ebVar = f136575i;
                if (ebVar == null) {
                    synchronized (C52036ih.class) {
                        ebVar = f136575i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136574g);
                            f136575i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
