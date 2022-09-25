package com.google.assistant.p3897e.p3921j.p3926e;

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

/* renamed from: com.google.assistant.e.j.e.fa */
/* compiled from: PG */
public final class C51948fa extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C51948fa f136294i;

    /* renamed from: k */
    private static volatile C63010eb f136295k;

    /* renamed from: a */
    public int f136296a;

    /* renamed from: b */
    public String f136297b;

    /* renamed from: c */
    public boolean f136298c;

    /* renamed from: d */
    public C62971cq f136299d;

    /* renamed from: e */
    public int f136300e;

    /* renamed from: f */
    public boolean f136301f;

    /* renamed from: g */
    public int f136302g;

    /* renamed from: h */
    public float f136303h;

    /* renamed from: j */
    private byte f136304j = 2;

    static {
        C51948fa faVar = new C51948fa();
        f136294i = faVar;
        C62942bv.registerDefaultInstance(C51948fa.class, faVar);
    }

    private C51948fa() {
        emptyProtobufList();
        this.f136297b = BuildConfig.FLAVOR;
        this.f136299d = emptyProtobufList();
    }

    /* renamed from: a */
    public final void mo53765a() {
        C62971cq cqVar = this.f136299d;
        if (!cqVar.mo58948c()) {
            this.f136299d = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f136304j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f136304j = b;
                return null;
            case 2:
                return newMessageInfo(f136294i, "\u0001\u0007\u0000\u0001\u0003\t\u0007\u0000\u0001\u0001\u0003ဈ\u0001\u0004ဇ\u0002\u0005Л\u0006င\u0003\u0007ဇ\u0004\bဌ\u0005\tခ\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", C51943ew.class, "e", C10662f.f35572a, C30325g.f82003a, C51945ey.f136293a, C19618h.f54585a});
            case 3:
                return new C51948fa();
            case 4:
                return new C51944ex();
            case 5:
                return f136294i;
            case 6:
                C63010eb ebVar = f136295k;
                if (ebVar == null) {
                    synchronized (C51948fa.class) {
                        ebVar = f136295k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136294i);
                            f136295k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
