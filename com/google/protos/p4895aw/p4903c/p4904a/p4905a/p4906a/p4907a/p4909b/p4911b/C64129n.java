package com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4907a.p4909b.p4911b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.aw.c.a.a.a.a.b.b.n */
/* compiled from: PG */
public final class C64129n extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C64129n f173378i;

    /* renamed from: j */
    private static volatile C63010eb f173379j;

    /* renamed from: a */
    public int f173380a;

    /* renamed from: b */
    public int f173381b = 0;

    /* renamed from: c */
    public Object f173382c;

    /* renamed from: d */
    public int f173383d;

    /* renamed from: e */
    public int f173384e;

    /* renamed from: f */
    public boolean f173385f;

    /* renamed from: g */
    public String f173386g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public boolean f173387h;

    static {
        C64129n nVar = new C64129n();
        f173378i = nVar;
        C62942bv.registerDefaultInstance(C64129n.class, nVar);
    }

    private C64129n() {
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
                return newMessageInfo(f173378i, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဇ\u0002\u0004ဈ\u0003\u0005ဇ\u0004\u0006ြ\u0000\u0007ြ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", C64126k.m96361b(), "e", C64128m.m96363b(), C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, C64124i.class, C64120e.class});
            case 3:
                return new C64129n();
            case 4:
                return new C64116a();
            case 5:
                return f173378i;
            case 6:
                C63010eb ebVar = f173379j;
                if (ebVar == null) {
                    synchronized (C64129n.class) {
                        ebVar = f173379j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173378i);
                            f173379j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
