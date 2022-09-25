package com.google.p4017at.p4056g.p4057a.p4058a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.g.a.a.j */
/* compiled from: PG */
public final class C54058j extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C54058j f141828j;

    /* renamed from: l */
    private static volatile C63010eb f141829l;

    /* renamed from: a */
    public String f141830a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f141831b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C53970ae f141832c;

    /* renamed from: d */
    public C53992b f141833d;

    /* renamed from: e */
    public C54045cz f141834e;

    /* renamed from: f */
    public int f141835f;

    /* renamed from: g */
    public String f141836g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public C62971cq f141837h = emptyProtobufList();

    /* renamed from: i */
    public int f141838i;

    /* renamed from: k */
    private byte f141839k = 2;

    static {
        C54058j jVar = new C54058j();
        f141828j = jVar;
        C62942bv.registerDefaultInstance(C54058j.class, jVar);
    }

    private C54058j() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f141839k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f141839k = b;
                return null;
            case 2:
                return newMessageInfo(f141828j, "\u0000\t\u0000\u0000\u0001\n\t\u0000\u0001\u0002\u0001Ȉ\u0002\t\u0003Љ\u0004\t\u0006\f\u0007Л\b\u0004\tȈ\nȈ", new Object[]{"b", C45240c.f118157a, "d", "e", C10662f.f35572a, C19618h.f54585a, C54057i.class, "i", "a", C30325g.f82003a});
            case 3:
                return new C54058j();
            case 4:
                return new C54055g();
            case 5:
                return f141828j;
            case 6:
                C63010eb ebVar = f141829l;
                if (ebVar == null) {
                    synchronized (C54058j.class) {
                        ebVar = f141829l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141828j);
                            f141829l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
