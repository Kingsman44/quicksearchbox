package com.google.assistant.p3803ag.p3809c;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C52428rj;
import com.google.p4605f.p4606a.C61078f;
import com.google.p4653i.p4654a.C61690bd;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.assistant.ag.c.gs */
/* compiled from: PG */
public final class C49107gs extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C49107gs f127001g;

    /* renamed from: h */
    public static final C62940bt f127002h;

    /* renamed from: j */
    private static volatile C63010eb f127003j;

    /* renamed from: a */
    public int f127004a;

    /* renamed from: b */
    public C52428rj f127005b;

    /* renamed from: c */
    public String f127006c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f127007d;

    /* renamed from: e */
    public C62971cq f127008e = emptyProtobufList();

    /* renamed from: f */
    public C62961ch f127009f = emptyIntList();

    /* renamed from: i */
    private byte f127010i = 2;

    static {
        C49107gs gsVar = new C49107gs();
        f127001g = gsVar;
        C62942bv.registerDefaultInstance(C49107gs.class, gsVar);
        f127002h = C62942bv.newSingularGeneratedExtension(C61690bd.f166668a, gsVar, gsVar, (C62958ce) null, 1007, C63066gd.MESSAGE, C49107gs.class);
    }

    private C49107gs() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f127010i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f127010i = b;
                return null;
            case 2:
                return newMessageInfo(f127001g, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0002\u0001\u0001ဉ\u0000\u0003ဈ\u0002\u0004င\u0003\u0005Л\u0007\u0016", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C61078f.class, C10662f.f35572a});
            case 3:
                return new C49107gs();
            case 4:
                return new C49106gr();
            case 5:
                return f127001g;
            case 6:
                C63010eb ebVar = f127003j;
                if (ebVar == null) {
                    synchronized (C49107gs.class) {
                        ebVar = f127003j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127001g);
                            f127003j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
