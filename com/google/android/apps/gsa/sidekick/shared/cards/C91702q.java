package com.google.android.apps.gsa.sidekick.shared.cards;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.shared.p7000au.p7001a.C89290a;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.sidekick.shared.util.C91978bb;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p375ai.p378b.C7681g;
import com.google.p375ai.p378b.C7708h;
import com.google.p375ai.p378b.C7718hj;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.cards.q */
/* compiled from: PG */
public final class C91702q extends C91691f {

    /* renamed from: e */
    private static final C59071e f255789e = C59071e.m91332i("com.google.android.apps.gsa.sidekick.shared.cards.q");

    /* renamed from: c */
    protected final C7718hj f255790c;

    /* renamed from: d */
    public C89290a f255791d;

    public C91702q(Context context, C7718hj hjVar, C91692g gVar) {
        super(context, gVar);
        this.f255790c = hjVar;
    }

    /* renamed from: h */
    private final C7708h m150203h(String str) {
        try {
            return C91978bb.m150937c(this.f255790c, C7681g.m22802a(Integer.parseInt(str)), new C7681g[0]);
        } catch (NumberFormatException e) {
            ((C59052c) ((C59052c) ((C59052c) f255789e.mo56225c()).mo56382g(e)).mo56372aa(11848)).mo56389s("Couldn't convert action type %s", str);
            return null;
        }
    }

    /* renamed from: a */
    public final void mo86194a(Intent intent) {
        C91097g b = this.f255779b.mo86163c().mo86021b();
        if (b != null) {
            b.mo65090b(intent, new C91700o(this));
        }
    }

    /* renamed from: d */
    public final void mo86197d(Intent intent) {
        C91097g b = this.f255779b.mo86163c().mo86021b();
        if (b != null) {
            b.mo65090b(intent, new C91697l(this));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r6v0 */
    /* JADX WARNING: type inference failed for: r4v19, types: [com.google.protobuf.bv] */
    /* JADX WARNING: type inference failed for: r6v3, types: [com.google.protobuf.MessageLite] */
    /* JADX WARNING: type inference failed for: r6v6 */
    /* JADX WARNING: type inference failed for: r6v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo86200g(com.google.android.apps.p489g.p494d.C9141ad r13) {
        /*
            r12 = this;
            int r0 = r13.f31535a
            r1 = 1
            r0 = r0 & r1
            r2 = 0
            if (r0 == 0) goto L_0x0546
            com.google.android.apps.gsa.sidekick.shared.cards.g r0 = r12.f255779b
            com.google.common.base.ax r0 = r0.mo86173k()
            boolean r3 = r0.mo56113h()
            if (r3 == 0) goto L_0x0021
            java.lang.Object r0 = r0.mo56107c()
            com.google.android.apps.gsa.sidekick.shared.cards.p r0 = (com.google.android.apps.gsa.sidekick.shared.cards.C91701p) r0
            boolean r0 = r0.mo86204a()
            if (r0 != 0) goto L_0x0020
            goto L_0x0021
        L_0x0020:
            return r2
        L_0x0021:
            com.google.android.apps.g.d.ac r0 = com.google.android.apps.p489g.p494d.C9140ac.OPEN_URL
            int r0 = r13.f31537c
            com.google.android.apps.g.d.ac r0 = com.google.android.apps.p489g.p494d.C9140ac.m23674a(r0)
            if (r0 != 0) goto L_0x002d
            com.google.android.apps.g.d.ac r0 = com.google.android.apps.p489g.p494d.C9140ac.OPEN_URL
        L_0x002d:
            int r0 = r0.ordinal()
            r3 = 4
            if (r0 == r3) goto L_0x0518
            r4 = 13
            if (r0 == r4) goto L_0x050c
            r4 = 32
            if (r0 == r4) goto L_0x04ea
            r4 = 40
            if (r0 == r4) goto L_0x04de
            r4 = 43
            r5 = 2
            r6 = 0
            if (r0 == r4) goto L_0x0408
            r4 = 56
            if (r0 == r4) goto L_0x03d6
            r4 = 62
            if (r0 == r4) goto L_0x0361
            r4 = 36
            if (r0 == r4) goto L_0x034f
            r4 = 37
            java.lang.String r7 = "Requested intent starter in invalid card container"
            java.lang.String r8 = "%s"
            if (r0 == r4) goto L_0x031e
            java.lang.String r4 = "delete_action"
            java.lang.String r9 = "entry"
            java.lang.String r10 = "action_type"
            java.lang.String r11 = "action"
            switch(r0) {
                case 8: goto L_0x02ee;
                case 9: goto L_0x02b9;
                case 10: goto L_0x029f;
                case 11: goto L_0x0246;
                default: goto L_0x0065;
            }
        L_0x0065:
            switch(r0) {
                case 20: goto L_0x021c;
                case 21: goto L_0x01ba;
                case 22: goto L_0x0102;
                case 23: goto L_0x0093;
                default: goto L_0x0068;
            }
        L_0x0068:
            boolean r0 = super.mo86200g(r13)
            if (r0 == 0) goto L_0x006f
            return r1
        L_0x006f:
            com.google.common.f.e r0 = f255789e
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            r1 = 11862(0x2e56, float:1.6622E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r1)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            int r13 = r13.f31537c
            com.google.android.apps.g.d.ac r13 = com.google.android.apps.p489g.p494d.C9140ac.m23674a(r13)
            if (r13 != 0) goto L_0x0089
            com.google.android.apps.g.d.ac r13 = com.google.android.apps.p489g.p494d.C9140ac.OPEN_URL
        L_0x0089:
            java.lang.String r1 = "Unknown client action type in ClientActionHandler: %s"
            int r13 = r13.f31520am
            r0.mo56387q(r1, r13)
            int r13 = com.google.android.apps.gsa.shared.util.p7158b.C90755l.f253831a
            return r2
        L_0x0093:
            java.lang.String r13 = r13.f31550p
            android.net.Uri r13 = android.net.Uri.parse(r13)
            java.lang.String r0 = "permissions"
            java.lang.String r0 = r13.getQueryParameter(r0)
            java.lang.String r3 = ","
            java.lang.String[] r0 = r0.split(r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r4 = r0.length
        L_0x00ab:
            if (r2 >= r4) goto L_0x00bd
            r6 = r0[r2]
            android.content.Context r7 = r12.f255778a
            boolean r7 = com.google.android.apps.gsa.shared.util.permissions.C91077d.m148794e(r7, r6)
            if (r7 != 0) goto L_0x00ba
            r3.add(r6)
        L_0x00ba:
            int r2 = r2 + 1
            goto L_0x00ab
        L_0x00bd:
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x00cf
            com.google.android.apps.gsa.sidekick.shared.cards.g r13 = r12.f255779b
            com.google.android.apps.gsa.sidekick.shared.h.a r13 = r13.mo86168g()
            com.google.ai.b.hj r0 = r12.f255790c
            r13.mo86235c(r0)
            goto L_0x0101
        L_0x00cf:
            com.google.android.apps.gsa.sidekick.shared.cards.g r0 = r12.f255779b
            com.google.common.base.ax r0 = r0.mo86178p()
            java.lang.Object r0 = r0.mo56111f()
            com.google.android.apps.gsa.shared.util.permissions.f r0 = (com.google.android.apps.gsa.shared.util.permissions.C91079f) r0
            if (r0 != 0) goto L_0x00ed
            com.google.common.f.e r13 = f255789e
            com.google.common.f.x r13 = r13.mo56226d()
            java.lang.String r0 = "Requested permissions change in invalid card container"
            r2 = 11861(0x2e55, float:1.6621E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r13).mo56372aa(r2)).mo56386p(r0)
            int r13 = com.google.android.apps.gsa.shared.util.p7158b.C90755l.f253831a
            goto L_0x0101
        L_0x00ed:
            int r2 = r3.size()
            java.lang.String[] r2 = new java.lang.String[r2]
            java.lang.Object[] r2 = r3.toArray(r2)
            java.lang.String[] r2 = (java.lang.String[]) r2
            com.google.android.apps.gsa.sidekick.shared.cards.j r3 = new com.google.android.apps.gsa.sidekick.shared.cards.j
            r3.<init>(r12, r13)
            r0.mo81047ju(r2, r5, r3)
        L_0x0101:
            return r1
        L_0x0102:
            java.lang.String r0 = r13.f31550p
            android.net.Uri r0 = android.net.Uri.parse(r0)
            java.lang.String r2 = r0.getQueryParameter(r11)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto L_0x0121
            com.google.common.f.e r13 = f255789e
            com.google.common.f.x r13 = r13.mo56225c()
            java.lang.String r0 = "Edit place action given with no action"
            r2 = 11857(0x2e51, float:1.6615E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r13).mo56372aa(r2)).mo56386p(r0)
            goto L_0x01ab
        L_0x0121:
            java.lang.String r3 = "delete"
            boolean r5 = android.text.TextUtils.equals(r2, r3)
            java.lang.String r7 = "rename"
            if (r5 != 0) goto L_0x013f
            boolean r5 = android.text.TextUtils.equals(r2, r7)
            if (r5 != 0) goto L_0x013f
            com.google.common.f.e r13 = f255789e
            com.google.common.f.x r13 = r13.mo56225c()
            java.lang.String r0 = "Edit place action given with incorrect parameter: %s"
            r3 = 11856(0x2e50, float:1.6614E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r13).mo56372aa(r3)).mo56389s(r0, r2)
            goto L_0x01ab
        L_0x013f:
            android.content.Intent r5 = new android.content.Intent
            r5.<init>()
            int r13 = r13.f31538d
            r5.putExtra(r10, r13)
            com.google.ai.b.hj r13 = r12.f255790c
            com.google.android.apps.gsa.shared.util.C90734ar.m148200c(r5, r9, r13)
            java.lang.String r13 = "deleteActionType"
            java.lang.String r13 = r0.getQueryParameter(r13)
            boolean r8 = android.text.TextUtils.isEmpty(r13)
            if (r8 != 0) goto L_0x015e
            com.google.ai.b.h r6 = r12.m150203h(r13)
        L_0x015e:
            boolean r3 = android.text.TextUtils.equals(r3, r2)
            if (r3 == 0) goto L_0x0178
            if (r6 != 0) goto L_0x0174
            com.google.common.f.e r0 = f255789e
            com.google.common.f.x r0 = r0.mo56225c()
            java.lang.String r2 = "Delete place action with an action which doesn't appear in the entry: %s"
            r3 = 11855(0x2e4f, float:1.6612E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56389s(r2, r13)
            goto L_0x01ab
        L_0x0174:
            com.google.android.apps.gsa.shared.util.C90734ar.m148200c(r5, r11, r6)
            goto L_0x01b4
        L_0x0178:
            boolean r13 = android.text.TextUtils.equals(r7, r2)
            if (r13 == 0) goto L_0x01b4
            java.lang.String r13 = "renameActionType"
            java.lang.String r13 = r0.getQueryParameter(r13)
            boolean r0 = android.text.TextUtils.isEmpty(r13)
            if (r0 == 0) goto L_0x0198
            com.google.common.f.e r13 = f255789e
            com.google.common.f.x r13 = r13.mo56225c()
            java.lang.String r0 = "Rename place action with no rename action type given"
            r2 = 11854(0x2e4e, float:1.6611E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r13).mo56372aa(r2)).mo56386p(r0)
            goto L_0x01ab
        L_0x0198:
            com.google.ai.b.h r0 = r12.m150203h(r13)
            if (r0 != 0) goto L_0x01ac
            com.google.common.f.e r0 = f255789e
            com.google.common.f.x r0 = r0.mo56225c()
            java.lang.String r2 = "Rename place action with an action which doesn't appear in the entry: %s"
            r3 = 11853(0x2e4d, float:1.661E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56389s(r2, r13)
        L_0x01ab:
            return r1
        L_0x01ac:
            com.google.android.apps.gsa.shared.util.C90734ar.m148200c(r5, r11, r0)
            if (r6 == 0) goto L_0x01b4
            com.google.android.apps.gsa.shared.util.C90734ar.m148200c(r5, r4, r6)
        L_0x01b4:
            java.lang.UnsupportedOperationException r13 = new java.lang.UnsupportedOperationException
            r13.<init>()
            throw r13
        L_0x01ba:
            java.lang.String r0 = r13.f31550p
            android.net.Uri r0 = android.net.Uri.parse(r0)
            java.lang.String r2 = "undo"
            java.lang.String r0 = r0.getQueryParameter(r2)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x0210
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            if (r0 != 0) goto L_0x01d3
            goto L_0x0210
        L_0x01d3:
            com.google.android.apps.gsa.sidekick.shared.cards.n r0 = new com.google.android.apps.gsa.sidekick.shared.cards.n
            r0.<init>(r12, r13)
            com.google.android.apps.gsa.sidekick.shared.cards.g r2 = r12.f255779b
            com.google.android.apps.gsa.sidekick.shared.h.a r2 = r2.mo86168g()
            com.google.ai.b.hj r4 = r12.f255790c
            if (r13 != 0) goto L_0x01e3
            goto L_0x020c
        L_0x01e3:
            com.google.protobuf.cq r5 = r4.f26935G
            java.util.Iterator r5 = r5.iterator()
        L_0x01e9:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x020c
            java.lang.Object r7 = r5.next()
            com.google.ai.b.h r7 = (com.google.p375ai.p378b.C7708h) r7
            int r8 = r7.f26897b
            com.google.ai.b.g r8 = com.google.p375ai.p378b.C7681g.m22802a(r8)
            if (r8 != 0) goto L_0x01ff
            com.google.ai.b.g r8 = com.google.p375ai.p378b.C7681g.INVALID
        L_0x01ff:
            int r8 = r8.f26835cv
            int r9 = r13.f31538d
            if (r8 != r9) goto L_0x01e9
            int r13 = r7.f26896a
            r13 = r13 & r3
            if (r13 == 0) goto L_0x020c
            java.lang.String r6 = r7.f26899d
        L_0x020c:
            r2.mo86234b(r4, r0, r6)
            goto L_0x021b
        L_0x0210:
            com.google.android.apps.gsa.sidekick.shared.cards.g r13 = r12.f255779b
            com.google.android.apps.gsa.sidekick.shared.h.a r13 = r13.mo86168g()
            com.google.ai.b.hj r0 = r12.f255790c
            r13.mo86235c(r0)
        L_0x021b:
            return r1
        L_0x021c:
            java.lang.String r13 = r13.f31550p
            android.net.Uri r13 = android.net.Uri.parse(r13)
            java.lang.String r0 = "type"
            java.lang.String r13 = r13.getQueryParameter(r0)
            java.lang.String r0 = "stream"
            boolean r13 = r0.equals(r13)
            if (r13 == 0) goto L_0x023a
            com.google.android.apps.gsa.sidekick.shared.cards.g r13 = r12.f255779b
            com.google.android.apps.gsa.sidekick.shared.i.a r13 = r13.mo86169h()
            r13.mo85910a()
            goto L_0x0245
        L_0x023a:
            com.google.android.apps.gsa.sidekick.shared.cards.g r13 = r12.f255779b
            com.google.android.apps.gsa.sidekick.shared.i.a r13 = r13.mo86169h()
            com.google.ai.b.hj r0 = r12.f255790c
            r13.mo85911b(r0)
        L_0x0245:
            return r1
        L_0x0246:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r13 = r13.f31550p
            android.net.Uri r13 = android.net.Uri.parse(r13)
            java.lang.String r1 = "add"
            java.lang.String r3 = r13.getQueryParameter(r11)
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0263
            r1 = 320(0x140, float:4.48E-43)
            r0.putExtra(r10, r1)
            goto L_0x027e
        L_0x0263:
            com.google.ai.b.hj r1 = r12.f255790c
            com.google.ai.b.g r3 = com.google.p375ai.p378b.C7681g.DELETE
            com.google.ai.b.g[] r2 = new com.google.p375ai.p378b.C7681g[r2]
            com.google.ai.b.h r1 = com.google.android.apps.gsa.sidekick.shared.util.C91978bb.m150937c(r1, r3, r2)
            r2 = 147(0x93, float:2.06E-43)
            r0.putExtra(r10, r2)
            com.google.ai.b.hj r2 = r12.f255790c
            byte[] r2 = r2.toByteArray()
            r0.putExtra(r9, r2)
            com.google.android.apps.gsa.shared.util.C90734ar.m148200c(r0, r4, r1)
        L_0x027e:
            java.lang.String r1 = "source"
            java.lang.String r13 = r13.getQueryParameter(r1)
            if (r13 == 0) goto L_0x0294
            java.lang.String r1 = "opa"
            boolean r13 = r13.equals(r1)
            if (r13 == 0) goto L_0x0294
            r13 = 32768(0x8000, float:4.5918E-41)
            r0.addFlags(r13)
        L_0x0294:
            r13 = 268435456(0x10000000, float:2.5243549E-29)
            r0.addFlags(r13)
            java.lang.UnsupportedOperationException r13 = new java.lang.UnsupportedOperationException
            r13.<init>()
            throw r13
        L_0x029f:
            com.google.android.apps.gsa.sidekick.shared.cards.g r13 = r12.f255779b
            com.google.android.apps.gsa.sidekick.shared.e.a.k r13 = r13.mo86167f()
            com.google.android.apps.gsa.sidekick.shared.cards.m r0 = new com.google.android.apps.gsa.sidekick.shared.cards.m
            r0.<init>(r12)
            r13.mo86217d(r0)
            com.google.android.apps.gsa.sidekick.shared.cards.g r13 = r12.f255779b
            com.google.android.apps.gsa.sidekick.shared.h.a r13 = r13.mo86168g()
            com.google.ai.b.hj r0 = r12.f255790c
            r13.mo86233a(r0, r2)
            return r1
        L_0x02b9:
            android.content.Intent r13 = new android.content.Intent
            java.lang.String r0 = "android.net.wifi.action.REQUEST_SCAN_ALWAYS_AVAILABLE"
            r13.<init>(r0)
            com.google.android.apps.gsa.sidekick.shared.cards.g r0 = r12.f255779b
            com.google.android.apps.gsa.sidekick.shared.a.a r0 = r0.mo86163c()
            com.google.android.apps.gsa.shared.util.t.g r0 = r0.mo86021b()
            if (r0 != 0) goto L_0x02da
            com.google.common.f.e r13 = f255789e
            com.google.common.f.x r13 = r13.mo56226d()
            r0 = 11852(0x2e4c, float:1.6608E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r13).mo56372aa(r0)).mo56389s(r8, r7)
            int r13 = com.google.android.apps.gsa.shared.util.p7158b.C90755l.f253831a
            goto L_0x02ed
        L_0x02da:
            com.google.android.apps.gsa.sidekick.shared.cards.k r3 = new com.google.android.apps.gsa.sidekick.shared.cards.k
            r3.<init>()
            r0.mo65090b(r13, r3)
            com.google.android.apps.gsa.sidekick.shared.cards.g r13 = r12.f255779b
            com.google.android.apps.gsa.sidekick.shared.h.a r13 = r13.mo86168g()
            com.google.ai.b.hj r0 = r12.f255790c
            r13.mo86233a(r0, r2)
        L_0x02ed:
            return r1
        L_0x02ee:
            com.google.android.apps.gsa.sidekick.shared.cards.g r13 = r12.f255779b
            com.google.android.apps.gsa.sidekick.shared.a.a r13 = r13.mo86163c()
            com.google.android.apps.gsa.shared.util.t.g r13 = r13.mo86021b()
            if (r13 != 0) goto L_0x0308
            com.google.common.f.e r13 = f255789e
            com.google.common.f.x r13 = r13.mo56226d()
            r0 = 11851(0x2e4b, float:1.6607E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r13).mo56372aa(r0)).mo56389s(r8, r7)
            int r13 = com.google.android.apps.gsa.shared.util.p7158b.C90755l.f253831a
            goto L_0x031d
        L_0x0308:
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r3 = "android.settings.WIFI_SETTINGS"
            r0.<init>(r3)
            r13.mo65089a(r0)
            com.google.android.apps.gsa.sidekick.shared.cards.g r13 = r12.f255779b
            com.google.android.apps.gsa.sidekick.shared.h.a r13 = r13.mo86168g()
            com.google.ai.b.hj r0 = r12.f255790c
            r13.mo86233a(r0, r2)
        L_0x031d:
            return r1
        L_0x031e:
            android.content.Intent r13 = new android.content.Intent
            r13.<init>()
            java.lang.String r0 = "com.google.android.googlequicksearchbox"
            java.lang.String r2 = "com.google.android.apps.gsa.velvet.ui.settings.SettingsActivity"
            r13.setClassName(r0, r2)
            java.lang.String r0 = "extra_show_setting"
            com.google.android.apps.gsa.shared.util.ad r2 = com.google.android.apps.gsa.shared.util.C90720ad.SHOW_FEED
            r13.putExtra(r0, r2)
            com.google.android.apps.gsa.sidekick.shared.cards.g r0 = r12.f255779b
            com.google.android.apps.gsa.sidekick.shared.a.a r0 = r0.mo86163c()
            com.google.android.apps.gsa.shared.util.t.g r0 = r0.mo86021b()
            if (r0 != 0) goto L_0x034b
            com.google.common.f.e r13 = f255789e
            com.google.common.f.x r13 = r13.mo56226d()
            r0 = 11860(0x2e54, float:1.662E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r13).mo56372aa(r0)).mo56389s(r8, r7)
            int r13 = com.google.android.apps.gsa.shared.util.p7158b.C90755l.f253831a
            goto L_0x034e
        L_0x034b:
            r0.mo65089a(r13)
        L_0x034e:
            return r1
        L_0x034f:
            com.google.android.apps.gsa.sidekick.shared.cards.g r0 = r12.f255779b
            com.google.android.apps.gsa.sidekick.shared.b.a r0 = r0.mo86164d()
            com.google.ai.b.hj r2 = r12.f255790c
            int r13 = r13.f31538d
            com.google.ai.b.g r13 = com.google.p375ai.p378b.C7681g.m22802a(r13)
            r0.mo85968c(r2, r13, r6)
            return r1
        L_0x0361:
            int r0 = r13.f31536b
            r0 = r0 & r5
            if (r0 == 0) goto L_0x03c6
            com.google.android.apps.gsa.sidekick.shared.k.b r0 = new com.google.android.apps.gsa.sidekick.shared.k.b
            android.content.Context r2 = r12.f255778a
            r0.<init>(r2)
            com.google.android.apps.gsa.sidekick.shared.cards.g r2 = r12.f255779b
            int r2 = r2.mo86161a()
            r0.f255880d = r2
            com.google.android.apps.gsa.sidekick.shared.cards.g r2 = r12.f255779b
            com.google.common.base.ax r2 = r2.mo86174l()
            java.lang.Object r2 = r2.mo56111f()
            com.google.ai.b.ga r2 = (com.google.p375ai.p378b.C7682ga) r2
            com.google.android.apps.gsa.sidekick.shared.cards.g r3 = r12.f255779b
            com.google.common.base.ax r3 = r3.mo86177o()
            java.lang.Object r3 = r3.mo56111f()
            com.google.bv.e.b.b r3 = (com.google.p4283bv.p4354e.p4356b.C57057b) r3
            r0.f255884h = r2
            r0.f255885i = r3
            r0.f255887k = r1
            com.google.android.apps.g.d.al r2 = r13.f31530H
            if (r2 != 0) goto L_0x0399
            com.google.android.apps.g.d.al r2 = com.google.android.apps.p489g.p494d.C9149al.f31584c
        L_0x0399:
            int r2 = r2.f31586a
            r2 = r2 & r1
            if (r2 == 0) goto L_0x03b6
            com.google.android.apps.g.d.al r13 = r13.f31530H
            if (r13 != 0) goto L_0x03a4
            com.google.android.apps.g.d.al r13 = com.google.android.apps.p489g.p494d.C9149al.f31584c
        L_0x03a4:
            com.google.bv.e.b.c.a.dp r13 = r13.f31587b
            if (r13 != 0) goto L_0x03aa
            com.google.bv.e.b.c.a.dp r13 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57315dp.f152986c
        L_0x03aa:
            r0.f255888l = r13
            android.content.Context r13 = r12.f255778a
            android.content.Intent r0 = r0.mo86242a()
            r13.startActivity(r0)
            goto L_0x03d5
        L_0x03b6:
            com.google.common.f.e r13 = f255789e
            com.google.common.f.x r13 = r13.mo56226d()
            java.lang.String r0 = "Attempted to handle DiscoverPinnedContentAction, but the action doesn't have a Token."
            r2 = 11849(0x2e49, float:1.6604E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r13).mo56372aa(r2)).mo56386p(r0)
            int r13 = com.google.android.apps.gsa.shared.util.p7158b.C90755l.f253831a
            goto L_0x03d5
        L_0x03c6:
            com.google.common.f.e r13 = f255789e
            com.google.common.f.x r13 = r13.mo56226d()
            java.lang.String r0 = "Attempted to handle DiscoverPinnedContentAction, but the action doesn't exist."
            r2 = 11850(0x2e4a, float:1.6605E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r13).mo56372aa(r2)).mo56386p(r0)
            int r13 = com.google.android.apps.gsa.shared.util.p7158b.C90755l.f253831a
        L_0x03d5:
            return r1
        L_0x03d6:
            com.google.android.apps.gsa.sidekick.shared.cards.g r0 = r12.f255779b
            com.google.common.base.ax r0 = r0.mo86176n()
            boolean r2 = r0.mo56113h()
            if (r2 != 0) goto L_0x03f0
            com.google.common.f.e r13 = f255789e
            com.google.common.f.x r13 = r13.mo56226d()
            java.lang.String r0 = "Request to preload AMP when no launcher present"
            r2 = 11859(0x2e53, float:1.6618E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r13).mo56372aa(r2)).mo56386p(r0)
            goto L_0x0407
        L_0x03f0:
            com.google.android.apps.gsa.sidekick.shared.cards.g r2 = r12.f255779b
            com.google.android.sidekick.shared.remoteapi.CardRenderingContext r2 = r2.mo86172j()
            boolean r2 = r2.mo49313h()
            if (r2 == 0) goto L_0x0407
            java.lang.Object r0 = r0.mo56107c()
            com.google.android.apps.gsa.sidekick.shared.cards.a.i r0 = (com.google.android.apps.gsa.sidekick.shared.cards.p7233a.C91670i) r0
            java.lang.String r13 = r13.f31550p
            r0.mo86097f(r13)
        L_0x0407:
            return r1
        L_0x0408:
            com.google.android.apps.gsa.shared.au.a.a r13 = r12.f255791d
            if (r13 == 0) goto L_0x04dd
            android.content.Context r0 = r12.f255778a
            com.google.ai.b.hj r3 = r12.f255790c
            com.google.android.apps.gsa.sidekick.shared.e.a.l r4 = r13.f242094d
            if (r4 != 0) goto L_0x0416
            goto L_0x04dd
        L_0x0416:
            com.google.android.apps.gsa.shared.e.f r4 = r13.f242093c
            android.content.res.Resources r7 = r0.getResources()
            r8 = 2132092127(0x7f1524df, float:1.9824642E38)
            java.lang.String r7 = r7.getString(r8)
            android.content.res.Resources r8 = r0.getResources()
            r9 = 2131820559(0x7f11000f, float:1.9273836E38)
            android.graphics.Bitmap r8 = android.graphics.BitmapFactory.decodeResource(r8, r9)
            java.lang.String r9 = "and.gsa.launcher.icon.now.promo"
            android.content.Intent r0 = com.google.android.apps.gsa.shared.p7025bh.p7026a.C89429a.m145445c(r0, r9)
            r4.mo83611a(r7, r8, r0)
            com.google.ai.b.iq r0 = com.google.p375ai.p378b.C7752iq.f27124E
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.ai.b.ip r0 = (com.google.p375ai.p378b.C7751ip) r0
            com.google.ai.b.g r4 = com.google.p375ai.p378b.C7681g.INSTALL_APP_ICON
            com.google.ai.b.g[] r7 = new com.google.p375ai.p378b.C7681g[r2]
            com.google.ai.b.h r7 = com.google.android.apps.gsa.sidekick.shared.util.C91978bb.m150937c(r3, r4, r7)
            if (r7 != 0) goto L_0x0484
            com.google.common.f.e r7 = com.google.android.apps.gsa.shared.p7000au.p7001a.C89290a.f242091a
            com.google.common.f.x r7 = r7.mo56226d()
            java.lang.String r8 = "Notification action type %s from card entry is null"
            r9 = 11073(0x2b41, float:1.5517E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56372aa(r9)).mo56389s(r8, r4)
            com.google.ai.b.h r7 = com.google.p375ai.p378b.C7708h.f26894n
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.ai.b.c r7 = (com.google.p375ai.p378b.C7573c) r7
            r7.copyOnWrite()
            com.google.protobuf.bv r8 = r7.instance
            com.google.ai.b.h r8 = (com.google.p375ai.p378b.C7708h) r8
            int r4 = r4.f26835cv
            r8.f26897b = r4
            int r4 = r8.f26896a
            r4 = r4 | r1
            r8.f26896a = r4
            r7.copyOnWrite()
            com.google.protobuf.bv r4 = r7.instance
            com.google.ai.b.h r4 = (com.google.p375ai.p378b.C7708h) r4
            int r8 = r4.f26896a
            r8 = r8 | 8
            r4.f26896a = r8
            r4.f26900e = r1
            com.google.protobuf.bv r4 = r7.build()
            r7 = r4
            com.google.ai.b.h r7 = (com.google.p375ai.p378b.C7708h) r7
        L_0x0484:
            r0.copyOnWrite()
            com.google.protobuf.bv r4 = r0.instance
            com.google.ai.b.iq r4 = (com.google.p375ai.p378b.C7752iq) r4
            r7.getClass()
            r4.f27133c = r7
            r4.f27132b = r1
            r0.copyOnWrite()
            com.google.protobuf.bv r4 = r0.instance
            com.google.ai.b.iq r4 = (com.google.p375ai.p378b.C7752iq) r4
            r3.getClass()
            r4.f27135e = r3
            r4.f27134d = r5
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.ai.b.iq r3 = (com.google.p375ai.p378b.C7752iq) r3
            int r4 = r3.f27131a
            r4 = r4 | 64
            r3.f27131a = r4
            r4 = 0
            r3.f27142l = r4
            com.google.android.libraries.f.a r3 = r13.f242092b
            long r3 = r3.mo26870b()
            r0.copyOnWrite()
            com.google.protobuf.bv r5 = r0.instance
            com.google.ai.b.iq r5 = (com.google.p375ai.p378b.C7752iq) r5
            int r7 = r5.f27131a
            r7 = r7 | 16
            r5.f27131a = r7
            r7 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 / r7
            r5.f27140j = r3
            com.google.android.apps.gsa.sidekick.shared.e.a.l r13 = r13.f242094d
            com.google.android.apps.gsa.sidekick.shared.util.WrappedExecutedUserAction r3 = new com.google.android.apps.gsa.sidekick.shared.util.WrappedExecutedUserAction
            com.google.protobuf.bv r0 = r0.build()
            com.google.ai.b.iq r0 = (com.google.p375ai.p378b.C7752iq) r0
            r3.<init>(r0, r6, r2)
            com.google.common.b.gu r0 = com.google.common.p4522b.C58485gu.m89846n(r3)
            r13.mo86220g(r0)
        L_0x04dd:
            return r1
        L_0x04de:
            com.google.android.apps.gsa.sidekick.shared.cards.g r13 = r12.f255779b
            com.google.android.apps.gsa.sidekick.shared.e.a.k r13 = r13.mo86167f()
            com.google.ai.b.hj r0 = r12.f255790c
            r13.mo86227n(r0)
            return r1
        L_0x04ea:
            com.google.android.apps.gsa.sidekick.shared.training.InterestLauncherHelper$Options r13 = new com.google.android.apps.gsa.sidekick.shared.training.InterestLauncherHelper$Options
            r13.<init>()
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r2 = "options"
            android.content.Intent r13 = r0.putExtra(r2, r13)
            r0 = 343932928(0x14800000, float:1.2924697E-26)
            android.content.Intent r13 = r13.addFlags(r0)
            com.google.android.apps.gsa.sidekick.shared.cards.g r0 = r12.f255779b
            com.google.android.apps.gsa.sidekick.shared.j.d r0 = r0.mo86171i()
            android.content.Context r2 = r12.f255778a
            r0.mo86240d(r2, r13)
            return r1
        L_0x050c:
            com.google.android.apps.gsa.sidekick.shared.cards.g r13 = r12.f255779b
            com.google.android.apps.gsa.sidekick.shared.e.a.k r13 = r13.mo86167f()
            com.google.ai.b.hj r0 = r12.f255790c
            r13.mo86226m(r0)
            return r1
        L_0x0518:
            com.google.android.apps.g.d.df r13 = r13.f31545k
            if (r13 != 0) goto L_0x051e
            com.google.android.apps.g.d.df r13 = com.google.android.apps.p489g.p494d.C9224df.f31879l
        L_0x051e:
            com.google.android.apps.gsa.sidekick.shared.cards.g r0 = r12.f255779b
            boolean r0 = r0.mo86185v()
            com.google.android.apps.gsa.sidekick.shared.secondscreen.SecondScreenLaunchHelper$Options r13 = com.google.android.apps.gsa.sidekick.shared.secondscreen.SecondScreenLaunchHelper.m150796a(r0, r13)
            r13.f256329p = r1
            com.google.ai.b.hj r0 = r12.f255790c
            java.lang.String r0 = r0.f26947S
            r13.f256320g = r0
            com.google.android.apps.gsa.sidekick.shared.cards.g r0 = r12.f255779b
            boolean r0 = r0.mo86185v()
            if (r0 == 0) goto L_0x053a
            r13.f256327n = r2
        L_0x053a:
            android.content.Context r0 = r12.f255778a
            com.google.android.apps.gsa.sidekick.shared.cards.g r2 = r12.f255779b
            com.google.android.apps.gsa.sidekick.shared.j.d r2 = r2.mo86171i()
            com.google.android.apps.gsa.sidekick.shared.secondscreen.SecondScreenLaunchHelper.m150797b(r0, r2, r13)
            return r1
        L_0x0546:
            com.google.common.f.e r13 = f255789e
            com.google.common.f.x r13 = r13.mo56225c()
            java.lang.String r0 = "Client action without a type was specified."
            r1 = 11863(0x2e57, float:1.6624E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r13).mo56372aa(r1)).mo56386p(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.sidekick.shared.cards.C91702q.mo86200g(com.google.android.apps.g.d.ad):boolean");
    }
}
