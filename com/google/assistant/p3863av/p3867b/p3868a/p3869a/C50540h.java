package com.google.assistant.p3863av.p3867b.p3868a.p3869a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.libraries.search.assistant.p2566g.C33427v;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.p3926e.C51827ao;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.p4985f.p5042u.C65342d;

/* renamed from: com.google.assistant.av.b.a.a.h */
/* compiled from: PG */
public final class C50540h extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C50540h f131534h;

    /* renamed from: i */
    public static final C62940bt f131535i;

    /* renamed from: k */
    private static volatile C63010eb f131536k;

    /* renamed from: a */
    public int f131537a;

    /* renamed from: b */
    public C62971cq f131538b = emptyProtobufList();

    /* renamed from: c */
    public C62971cq f131539c = emptyProtobufList();

    /* renamed from: d */
    public C62971cq f131540d = emptyProtobufList();

    /* renamed from: e */
    public String f131541e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public int f131542f;

    /* renamed from: g */
    public String f131543g = BuildConfig.FLAVOR;

    /* renamed from: j */
    private byte f131544j = 2;

    static {
        C50540h hVar = new C50540h();
        f131534h = hVar;
        C62942bv.registerDefaultInstance(C50540h.class, hVar);
        f131535i = C62942bv.newSingularGeneratedExtension(C51827ao.f135971a, hVar, hVar, (C62958ce) null, 357007769, C63066gd.MESSAGE, C50540h.class);
    }

    private C50540h() {
    }

    /* renamed from: a */
    public final void mo53408a() {
        C62971cq cqVar = this.f131540d;
        if (!cqVar.mo58948c()) {
            this.f131540d = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f131544j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f131544j = b;
                return null;
            case 2:
                return newMessageInfo(f131534h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0003\u0001\u0001Л\u0003\u001b\u0004ဈ\u0000\u0005\u001b\u0006ဌ\u0001\u0007ဈ\u0002", new Object[]{"a", "b", C65342d.class, C45240c.f118157a, C50534b.class, "e", "d", C33427v.class, C10662f.f35572a, C50538f.f131533a, C30325g.f82003a});
            case 3:
                return new C50540h();
            case 4:
                return new C50537e();
            case 5:
                return f131534h;
            case 6:
                C63010eb ebVar = f131536k;
                if (ebVar == null) {
                    synchronized (C50540h.class) {
                        ebVar = f131536k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131534h);
                            f131536k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
