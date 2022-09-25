package com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9957d.p9961d;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3886c.C50794cr;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.q.d.d.e */
/* compiled from: PG */
public final class C131222e extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C62962ci f358838g = new C131219b();

    /* renamed from: h */
    public static final C131222e f358839h;

    /* renamed from: i */
    private static volatile C63010eb f358840i;

    /* renamed from: a */
    public int f358841a;

    /* renamed from: b */
    public C62995dn f358842b = C62995dn.f170057a;

    /* renamed from: c */
    public C63042fg f358843c;

    /* renamed from: d */
    public int f358844d;

    /* renamed from: e */
    public C63042fg f358845e;

    /* renamed from: f */
    public C62961ch f358846f = emptyIntList();

    static {
        C131222e eVar = new C131222e();
        f358839h = eVar;
        C62942bv.registerDefaultInstance(C131222e.class, eVar);
    }

    private C131222e() {
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
                return newMessageInfo(f358839h, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0001\u0001\u0000\u00012\u0002ဉ\u0000\u0003ဌ\u0001\u0004ဉ\u0002\u0005,", new Object[]{"a", "b", C131221d.f358837a, C45240c.f118157a, "d", C50794cr.m85939b(), "e", C10662f.f35572a, C50794cr.m85939b()});
            case 3:
                return new C131222e();
            case 4:
                return new C131220c();
            case 5:
                return f358839h;
            case 6:
                C63010eb ebVar = f358840i;
                if (ebVar == null) {
                    synchronized (C131222e.class) {
                        ebVar = f358840i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f358839h);
                            f358840i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
