package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a;

import android.accounts.Account;
import android.content.BroadcastReceiver;
import android.content.Context;
import com.google.android.apps.gsa.binaries.satin.app.C74034fx;
import com.google.android.apps.gsa.binaries.satin.app.fz;
import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7470d.C94937e;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7476j.C95010a;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7476j.C95018i;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7477k.C95021c;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9401e.C124604a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.search.p2476a.C32150a;
import com.google.android.libraries.search.p2476a.C32160b;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import java.util.HashMap;
import java.util.Map;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.a.p */
/* compiled from: PG */
public final class C94892p implements AutoCloseable {

    /* renamed from: a */
    public static final C59071e f265416a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.ac.a.p");

    /* renamed from: b */
    public final Context f265417b;

    /* renamed from: c */
    public final C22871g f265418c;

    /* renamed from: d */
    public final C89656k f265419d;

    /* renamed from: e */
    public final C32160b f265420e;

    /* renamed from: f */
    public final C32150a f265421f;

    /* renamed from: g */
    public final Map f265422g = new HashMap();

    /* renamed from: h */
    public final C69464a f265423h;

    /* renamed from: i */
    public volatile C95018i f265424i;

    /* renamed from: j */
    volatile BroadcastReceiver f265425j;

    /* renamed from: k */
    public C95010a f265426k;

    /* renamed from: l */
    private final C89492cd f265427l;

    /* renamed from: m */
    private final C124604a f265428m;

    /* renamed from: n */
    private final C68214a f265429n;

    /* renamed from: o */
    private final C74034fx f265430o;

    public C94892p(Context context, C22871g gVar, C89492cd cdVar, C89656k kVar, C124604a aVar, C68214a aVar2, C74034fx fxVar, C69464a aVar3, C32160b bVar, C95021c cVar) {
        this.f265417b = context;
        this.f265418c = gVar;
        this.f265427l = cdVar;
        this.f265419d = kVar;
        this.f265428m = aVar;
        this.f265429n = aVar2;
        this.f265420e = bVar;
        this.f265430o = fxVar;
        this.f265423h = aVar3;
        cVar.mo88935a(bVar, gVar);
        C94888l lVar = new C94888l(this, cVar, bVar);
        this.f265421f = lVar;
        bVar.mo37975c(lVar);
        cVar.f265850c = new C94889m(this);
    }

    /* renamed from: g */
    public static boolean m156617g(C124548d dVar) {
        return dVar == null || (dVar.mo106526x().f386148a & 4) == 0 || !dVar.mo106526x().f386151d;
    }

    /* renamed from: a */
    public final void mo88764a() {
        this.f265422g.clear();
        C95018i iVar = this.f265424i;
        if (iVar != null) {
            this.f265424i = null;
            C58976aa aaVar = C58975e.f156826a;
            iVar.f265833c.mo88867f();
        }
        BroadcastReceiver broadcastReceiver = this.f265425j;
        if (broadcastReceiver != null) {
            this.f265425j = null;
            this.f265417b.unregisterReceiver(broadcastReceiver);
        }
    }

    /* renamed from: b */
    public final /* synthetic */ void mo88765b(C58833ax axVar) {
        for (fz b : this.f265422g.values()) {
            C94937e a = b.b().mo88655a();
            if (a != null) {
                a.mo88805g((Account) axVar.mo56111f());
            }
        }
    }

    /* renamed from: c */
    public final void mo88766c(String str) {
        fz fzVar;
        if (this.f265422g.containsKey(str) && (fzVar = (fz) this.f265422g.get(str)) != null) {
            fzVar.b().mo88661n();
        }
    }

    public final void close() {
        C59104x b = f265416a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoBleConnManager");
        ((C59052c) ((C59052c) b).mo56372aa(17337)).mo56386p("close");
        this.f265420e.mo37976d(this.f265421f);
        for (fz fzVar : this.f265422g.values()) {
            if (fzVar != null) {
                fzVar.b().mo88664t(3);
                fzVar.a().close();
            }
        }
        mo88764a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo88768d(com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7476j.C95010a r9, com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d r10, byte[] r11, boolean r12, boolean r13, com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7470d.C94933a r14) {
        /*
            r8 = this;
            if (r11 == 0) goto L_0x0005
            int r0 = r11.length
            if (r0 != 0) goto L_0x0013
        L_0x0005:
            java.util.Map r0 = r8.f265422g
            android.bluetooth.BluetoothDevice r1 = r9.f265818a
            java.lang.String r1 = r1.getAddress()
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L_0x00bc
        L_0x0013:
            java.util.Map r0 = r8.f265422g
            android.bluetooth.BluetoothDevice r1 = r9.f265818a
            java.lang.String r1 = r1.getAddress()
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x002d
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            android.bluetooth.BluetoothDevice r0 = r9.f265818a
            java.lang.String r0 = r0.getAddress()
            r1 = 5
            r8.mo88769e(r0, r1)
        L_0x002d:
            com.google.android.apps.gsa.binaries.satin.app.fx r0 = r8.f265430o
            android.bluetooth.BluetoothDevice r1 = r9.f265818a
            java.lang.String r1 = r1.getAddress()
            if (r11 == 0) goto L_0x004f
            int r2 = r11.length
            if (r2 <= 0) goto L_0x004f
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.search.assistant.surfaces.bisto.c.e.a r2 = r8.f265428m
            byte[] r2 = r2.mo106555c(r1, r11)
            if (r2 == 0) goto L_0x004d
            com.google.android.apps.gsa.shared.bisto.a.cd r3 = r8.f265427l
            com.google.protobuf.z r2 = com.google.protobuf.C63088z.m96139A(r2)
            r3.mo83372N(r1, r2)
        L_0x004d:
            r7 = r11
            goto L_0x0082
        L_0x004f:
            com.google.common.f.aa r11 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.search.assistant.surfaces.bisto.c.e.a r11 = r8.f265428m
            boolean r11 = r11.mo106553a(r1)
            r2 = 0
            if (r11 != 0) goto L_0x005c
        L_0x005a:
            r7 = r2
            goto L_0x0082
        L_0x005c:
            if (r10 != 0) goto L_0x0073
            com.google.common.f.e r11 = f265416a
            com.google.common.f.x r11 = r11.mo56225c()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r3 = "BistoBleConnManager"
            r11.mo56378ag(r1, r3)
            java.lang.String r1 = "No BDD record"
            r3 = 17354(0x43ca, float:2.4318E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r11).mo56372aa(r3)).mo56386p(r1)
            goto L_0x005a
        L_0x0073:
            com.google.protobuf.z r11 = r10.mo106466G()
            byte[] r11 = r11.mo59174N()
            com.google.android.apps.search.assistant.surfaces.bisto.c.e.a r2 = r8.f265428m
            byte[] r11 = r2.mo106554b(r1, r11)
            goto L_0x004d
        L_0x0082:
            r14.getClass()
            com.google.android.apps.gsa.binaries.satin.app.fz r11 = new com.google.android.apps.gsa.binaries.satin.app.fz
            com.google.android.apps.gsa.binaries.satin.app.aqy r2 = r0.f206180a
            com.google.android.apps.gsa.binaries.satin.app.amb r3 = r0.f206181b
            com.google.android.apps.gsa.binaries.satin.app.gc r4 = r0.f206182c
            r1 = r11
            r5 = r9
            r6 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7)
            com.google.android.apps.gsa.staticplugins.bisto.ac.a.as r14 = r11.b()
            boolean r10 = m156617g(r10)
            r14.mo88665u(r12, r10, r13)
            java.util.Map r10 = r8.f265422g
            android.bluetooth.BluetoothDevice r13 = r9.f265818a
            java.lang.String r13 = r13.getAddress()
            r10.put(r13, r11)
            if (r12 == 0) goto L_0x00bc
            dagger.a r10 = r8.f265429n
            java.lang.Object r10 = r10.mo27525b()
            com.google.android.apps.gsa.staticplugins.bisto.m.l r10 = (com.google.android.apps.gsa.staticplugins.bisto.p7495m.C95495l) r10
            android.bluetooth.BluetoothDevice r9 = r9.f265818a
            java.lang.String r9 = r9.getAddress()
            r10.mo89391a(r9)
        L_0x00bc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.C94892p.mo88768d(com.google.android.apps.gsa.staticplugins.bisto.ac.j.a, com.google.android.apps.search.assistant.surfaces.bisto.c.b.d, byte[], boolean, boolean, com.google.android.apps.gsa.staticplugins.bisto.ac.d.a):void");
    }

    /* renamed from: e */
    public final void mo88769e(String str, int i) {
        if (this.f265422g.containsKey(str)) {
            C59104x b = f265416a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "BistoBleConnManager");
            ((C59052c) ((C59052c) b).mo56372aa(17351)).mo56389s("Stop connection: %s", str);
            fz fzVar = (fz) this.f265422g.remove(str);
            if (fzVar != null) {
                fzVar.b().mo88664t(i);
                fzVar.a().close();
            }
        }
    }

    /* renamed from: f */
    public final boolean mo88770f() {
        return !this.f265422g.isEmpty() || this.f265424i != null;
    }
}
