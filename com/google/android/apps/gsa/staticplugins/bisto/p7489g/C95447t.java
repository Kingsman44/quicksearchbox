package com.google.android.apps.gsa.staticplugins.bisto.p7489g;

import android.content.Context;
import androidx.annotation.C0826b;
import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.gsa.staticplugins.bisto.p7479ae.C95065ab;
import com.google.android.apps.gsa.staticplugins.bisto.p7479ae.p7480a.C95039b;
import com.google.android.apps.gsa.staticplugins.bisto.p7479ae.p7480a.C95056s;
import com.google.android.apps.gsa.staticplugins.bisto.p7479ae.p7480a.C95057t;
import com.google.android.apps.gsa.staticplugins.bisto.p7482b.p7484b.C95188c;
import com.google.android.apps.gsa.staticplugins.bisto.p7516r.C95850a;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124715m;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.android.p10712d.C142357ci;
import com.google.android.p10712d.C142359ck;
import com.google.android.p10712d.C142360cl;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.g.t */
/* compiled from: PG */
public abstract class C95447t implements C95355bf, C95352bc, C95403d {

    /* renamed from: a */
    public static final C59071e f267069a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.g.t");

    /* renamed from: b */
    protected final Context f267070b;

    /* renamed from: c */
    public final String f267071c;

    /* renamed from: d */
    public final C89656k f267072d;

    /* renamed from: e */
    public final C95188c f267073e;

    /* renamed from: f */
    private final C22871g f267074f;

    /* renamed from: g */
    private final C22871g f267075g;

    /* renamed from: h */
    private final C68214a f267076h;

    /* renamed from: i */
    private final C95057t f267077i;

    /* renamed from: j */
    private final Set f267078j = new HashSet();

    /* renamed from: k */
    private final Set f267079k = new HashSet();

    /* renamed from: l */
    private volatile boolean f267080l;

    /* renamed from: m */
    private boolean f267081m;

    public C95447t(String str, Context context, C22871g gVar, C22871g gVar2, C95056s sVar, C95850a aVar, C68214a aVar2, C89656k kVar, C95188c cVar) {
        C22872h.m42742b(C0826b.class);
        this.f267070b = context;
        this.f267074f = gVar;
        this.f267075g = gVar2;
        this.f267076h = aVar2;
        this.f267071c = str;
        this.f267077i = sVar.mo88986a(this);
        this.f267072d = kVar;
        this.f267073e = cVar;
        C58976aa aaVar = C58975e.f156826a;
        aVar.f268408a.add(this);
    }

    /* renamed from: G */
    private final void m157839G(boolean z) {
        ((C89492cd) this.f267076h.mo27525b()).mo83384Z(this.f267071c, mo89263d());
        Iterator it = new HashSet(this.f267078j).iterator();
        while (it.hasNext()) {
            ((C95353bd) it.next()).mo89286ip(this.f267071c, z);
        }
    }

    /* renamed from: H */
    private final void m157840H() {
        if (this.f267081m) {
            mo89308t();
            this.f267081m = false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003c A[RETURN] */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo89303A(android.content.Intent r6) {
        /*
            r5 = this;
            java.lang.String r0 = r6.getAction()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            int r2 = r0.hashCode()
            r3 = -1676458352(0xffffffff9c134690, float:-4.872942E-22)
            r4 = 1
            if (r2 == r3) goto L_0x0022
            r3 = -1608292967(0xffffffffa0236599, float:-1.3840253E-19)
            if (r2 == r3) goto L_0x0018
            goto L_0x002c
        L_0x0018:
            java.lang.String r2 = "android.hardware.usb.action.USB_DEVICE_DETACHED"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x002c
            r0 = 0
            goto L_0x002d
        L_0x0022:
            java.lang.String r2 = "android.intent.action.HEADSET_PLUG"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x002c
            r0 = 1
            goto L_0x002d
        L_0x002c:
            r0 = -1
        L_0x002d:
            if (r0 == 0) goto L_0x003c
            if (r0 == r4) goto L_0x0032
            return r1
        L_0x0032:
            java.lang.String r0 = "state"
            int r6 = r6.getIntExtra(r0, r1)
            if (r6 != 0) goto L_0x003b
            return r4
        L_0x003b:
            return r1
        L_0x003c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95447t.mo89303A(android.content.Intent):boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public abstract boolean mo89304B();

    /* renamed from: C */
    public final boolean mo89256C() {
        return true;
    }

    /* renamed from: D */
    public final C60870cx mo89257D(int i, int i2, byte[] bArr) {
        return this.f267075g.mo28201a("sendAsync", new C95446s(this, i, i2, bArr));
    }

    /* renamed from: E */
    public final boolean mo89254E(String str, int i, int i2, byte[] bArr) {
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.f267079k);
        Iterator it = hashSet.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= ((C95352bc) it.next()).mo89254E(str, i, i2, bArr);
        }
        return z;
    }

    /* renamed from: F */
    public final boolean mo89258F(int i, int i2, byte[] bArr) {
        C59104x b = f267069a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BaseWiredDevice");
        ((C59052c) ((C59052c) b).mo56372aa(14920)).mo56386p("send()");
        this.f267074f.mo28212l("send", new C95445r(this, i, i2, bArr));
        return true;
    }

    /* renamed from: a */
    public final boolean mo89344a(C142359ck... ckVarArr) {
        C142357ci ciVar = (C142357ci) C142360cl.f386303e.createBuilder();
        for (C142359ck a : ckVarArr) {
            ciVar.mo117126a(a);
        }
        if (!this.f267072d.mo83555j(146)) {
            for (C142359ck ordinal : ckVarArr) {
                C142359ck ckVar = C142359ck.UNKNOWN;
                int ordinal2 = ordinal.ordinal();
                if (ordinal2 == 3) {
                    this.f267073e.mo89097b();
                } else if (ordinal2 == 5) {
                    this.f267073e.mo89096a(8);
                }
            }
        }
        return mo89254E(this.f267071c, 2, 9, ((C142360cl) ciVar.build()).toByteArray());
    }

    /* renamed from: b */
    public final C95065ab mo89260b() {
        return this.f267077i;
    }

    /* renamed from: c */
    public final C95039b mo89261c() {
        return this.f267077i;
    }

    public final synchronized void close() {
        C59104x b = f267069a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BaseWiredDevice");
        ((C59052c) ((C59052c) b).mo56372aa(14913)).mo56386p("close");
        m157840H();
        if (!this.f267079k.isEmpty()) {
            this.f267079k.clear();
        }
        this.f267078j.clear();
        mo89265f("Service destroyed");
    }

    /* renamed from: d */
    public C124715m mo89263d() {
        boolean u = mo89309u();
        boolean w = mo89278w();
        if (w && u) {
            return C124715m.FULLY_CONNECTED;
        }
        if (u) {
            return C124715m.AUDIO_ONLY;
        }
        if (w) {
            return C124715m.DATA_ONLY;
        }
        return C124715m.NOT_CONNECTED;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002c, code lost:
        if (r0 != false) goto L_0x002e;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.common.util.concurrent.C60870cx mo89264e() {
        /*
            r3 = this;
            com.google.common.f.e r0 = f267069a
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r2 = "BaseWiredDevice"
            r0.mo56378ag(r1, r2)
            java.lang.String r1 = "connect()"
            r2 = 14911(0x3a3f, float:2.0895E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            boolean r0 = r3.f267080l
            if (r0 != 0) goto L_0x0043
            boolean r0 = r3.f267081m
            if (r0 == 0) goto L_0x001d
            goto L_0x002e
        L_0x001d:
            android.content.Context r0 = r3.f267070b
            boolean r0 = com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9386b.C124527h.m203996b(r0)
            if (r0 != 0) goto L_0x0026
            goto L_0x0037
        L_0x0026:
            boolean r0 = r3.mo89304B()
            r3.f267081m = r0
            if (r0 == 0) goto L_0x0037
        L_0x002e:
            r0 = 1
            r3.f267080l = r0
            r3.m157839G(r0)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60866ct.f164955a
            return r0
        L_0x0037:
            java.lang.Exception r0 = new java.lang.Exception
            java.lang.String r1 = "Failed to start listening to media buttons"
            r0.<init>(r1)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92899h(r0)
            return r0
        L_0x0043:
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60866ct.f164955a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95447t.mo89264e():com.google.common.util.concurrent.cx");
    }

    /* renamed from: f */
    public final C60870cx mo89265f(String str) {
        C59104x b = f267069a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BaseWiredDevice");
        ((C59052c) ((C59052c) b).mo56372aa(14912)).mo56386p("disconnect()");
        if (!this.f267080l) {
            return C60866ct.f164955a;
        }
        m157840H();
        this.f267080l = false;
        m157839G(false);
        return C60866ct.f164955a;
    }

    /* renamed from: g */
    public final C60870cx mo89266g(long j) {
        throw null;
    }

    /* renamed from: h */
    public final C60870cx mo89267h(C95393cq cqVar, int i, C95354be beVar) {
        throw null;
    }

    /* renamed from: i */
    public Integer mo89313i() {
        return null;
    }

    /* renamed from: j */
    public String mo89314j() {
        return null;
    }

    /* renamed from: k */
    public final String mo89270k() {
        return this.f267071c;
    }

    /* renamed from: l */
    public abstract String mo89305l();

    /* renamed from: m */
    public abstract String mo89306m();

    /* renamed from: n */
    public final void mo89273n(C95352bc bcVar) {
        this.f267079k.add(bcVar);
    }

    /* renamed from: o */
    public final void mo89274o(C95353bd bdVar) {
        this.f267078j.add(bdVar);
    }

    /* renamed from: p */
    public final void mo89275p(C95352bc bcVar) {
        if (this.f267079k.remove(bcVar)) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        C59104x c = f267069a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "BaseWiredDevice");
        ((C59052c) ((C59052c) c).mo56372aa(14916)).mo56389s("%s message callback not removed - not registered", bcVar);
    }

    /* renamed from: q */
    public final void mo89276q(C95353bd bdVar) {
        if (this.f267078j.remove(bdVar)) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        C59104x c = f267069a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "BaseWiredDevice");
        ((C59052c) ((C59052c) c).mo56372aa(14918)).mo56389s("%s connection callback not removed - not registered", bdVar);
    }

    /* renamed from: r */
    public final /* synthetic */ void mo89277r(int i) {
    }

    /* renamed from: s */
    public void mo89307s() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public abstract void mo89308t();

    /* renamed from: u */
    public abstract boolean mo89309u();

    /* renamed from: v */
    public abstract boolean mo89310v(boolean z, boolean z2, boolean z3);

    /* renamed from: w */
    public final synchronized boolean mo89278w() {
        return this.f267080l;
    }

    /* renamed from: x */
    public final /* synthetic */ boolean mo89279x() {
        return C95350ba.m157635a(this);
    }

    /* renamed from: y */
    public final boolean mo89280y() {
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003c A[RETURN] */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo89311z(android.content.Intent r6) {
        /*
            r5 = this;
            java.lang.String r0 = r6.getAction()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            int r2 = r0.hashCode()
            r3 = -2114103349(0xffffffff81fd57cb, float:-9.30635E-38)
            r4 = 1
            if (r2 == r3) goto L_0x0022
            r3 = -1676458352(0xffffffff9c134690, float:-4.872942E-22)
            if (r2 == r3) goto L_0x0018
            goto L_0x002c
        L_0x0018:
            java.lang.String r2 = "android.intent.action.HEADSET_PLUG"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x002c
            r0 = 1
            goto L_0x002d
        L_0x0022:
            java.lang.String r2 = "android.hardware.usb.action.USB_DEVICE_ATTACHED"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x002c
            r0 = 0
            goto L_0x002d
        L_0x002c:
            r0 = -1
        L_0x002d:
            if (r0 == 0) goto L_0x003c
            if (r0 == r4) goto L_0x0032
            return r1
        L_0x0032:
            java.lang.String r0 = "state"
            int r6 = r6.getIntExtra(r0, r1)
            if (r6 != r4) goto L_0x003b
            return r4
        L_0x003b:
            return r1
        L_0x003c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95447t.mo89311z(android.content.Intent):boolean");
    }
}
