package com.google.p375ai.p378b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.hr */
/* compiled from: PG */
public final class C7726hr extends C62937bq implements C62938br {

    /* renamed from: i */
    public static final C7726hr f27008i;

    /* renamed from: k */
    private static volatile C63010eb f27009k;

    /* renamed from: a */
    public int f27010a;

    /* renamed from: b */
    public String f27011b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f27012c = emptyProtobufList();

    /* renamed from: d */
    public C62971cq f27013d = emptyProtobufList();

    /* renamed from: e */
    public C62971cq f27014e = emptyProtobufList();

    /* renamed from: f */
    public C7718hj f27015f;

    /* renamed from: g */
    public C7718hj f27016g;

    /* renamed from: h */
    public C8178yk f27017h;

    /* renamed from: j */
    private byte f27018j = 2;

    static {
        C7726hr hrVar = new C7726hr();
        f27008i = hrVar;
        C62942bv.registerDefaultInstance(C7726hr.class, hrVar);
    }

    private C7726hr() {
    }

    /* renamed from: a */
    public final void mo16950a() {
        C62971cq cqVar = this.f27012c;
        if (!cqVar.mo58948c()) {
            this.f27012c = C62942bv.mutableCopy(cqVar);
        }
    }

    /* renamed from: b */
    public final void mo16951b() {
        C62971cq cqVar = this.f27013d;
        if (!cqVar.mo58948c()) {
            this.f27013d = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f27018j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f27018j = b;
                return null;
            case 2:
                return newMessageInfo(f27008i, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0003\u0006\u0001ဈ\u0000\u0002Л\u0003Л\u0004Л\u0005ᐉ\u0001\u0007ᐉ\u0003\tᐉ\u0004", new Object[]{"a", "b", C45240c.f118157a, C7726hr.class, "d", C7718hj.class, "e", C7708h.class, C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C7726hr();
            case 4:
                return new C7725hq();
            case 5:
                return f27008i;
            case 6:
                C63010eb ebVar = f27009k;
                if (ebVar == null) {
                    synchronized (C7726hr.class) {
                        ebVar = f27009k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f27008i);
                            f27009k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
