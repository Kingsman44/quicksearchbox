package com.google.p4283bv.p4354e.p4367c.p4368a;

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

/* renamed from: com.google.bv.e.c.a.di */
/* compiled from: PG */
public final class C57438di extends C62937bq implements C62938br {

    /* renamed from: i */
    public static final C57438di f153417i;

    /* renamed from: k */
    private static volatile C63010eb f153418k;

    /* renamed from: a */
    public int f153419a;

    /* renamed from: b */
    public String f153420b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C57444do f153421c;

    /* renamed from: d */
    public C57474er f153422d;

    /* renamed from: e */
    public C62971cq f153423e = emptyProtobufList();

    /* renamed from: f */
    public C62971cq f153424f = emptyProtobufList();

    /* renamed from: g */
    public C57501i f153425g;

    /* renamed from: h */
    public C57418cp f153426h;

    /* renamed from: j */
    private byte f153427j = 2;

    static {
        C57438di diVar = new C57438di();
        f153417i = diVar;
        C62942bv.registerDefaultInstance(C57438di.class, diVar);
    }

    private C57438di() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f153427j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f153427j = b;
                return null;
            case 2:
                return newMessageInfo(f153417i, "\u0001\u0007\u0000\u0001\u0001\f\u0007\u0000\u0002\u0006\u0001ဈ\u0000\u0004ᐉ\u0004\u0005Л\u0007ᐉ\u0005\nЛ\u000bᐉ\u0003\fᐉ\u0006", new Object[]{"a", "b", "d", "e", C57446dq.class, C30325g.f82003a, C10662f.f35572a, C57362an.class, C45240c.f118157a, C19618h.f54585a});
            case 3:
                return new C57438di();
            case 4:
                return new C57437dh();
            case 5:
                return f153417i;
            case 6:
                C63010eb ebVar = f153418k;
                if (ebVar == null) {
                    synchronized (C57438di.class) {
                        ebVar = f153418k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153417i);
                            f153418k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
