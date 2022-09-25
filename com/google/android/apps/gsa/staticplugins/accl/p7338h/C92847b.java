package com.google.android.apps.gsa.staticplugins.accl.p7338h;

import android.content.Context;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7148ui.p7155g.C90685b;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.search.QueryTriggerType;
import com.google.android.apps.gsa.staticplugins.opa.util.C113812ca;
import com.google.common.base.C58833ax;
import com.google.common.base.C58847bk;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.h.b */
/* compiled from: PG */
public final class C92847b {

    /* renamed from: a */
    private final int f259053a;

    /* renamed from: b */
    private final C58833ax f259054b;

    /* renamed from: c */
    private final Context f259055c;

    /* renamed from: d */
    private final C68214a f259056d;

    /* renamed from: e */
    private final C68214a f259057e;

    public C92847b(int i, C58833ax axVar, Context context, C68214a aVar, C68214a aVar2) {
        this.f259053a = i;
        this.f259054b = axVar;
        this.f259055c = context;
        this.f259056d = aVar;
        this.f259057e = aVar2;
    }

    /* renamed from: c */
    private final Query m152880c(Query query) {
        switch (this.f259053a) {
            case 2:
            case 8:
                return query.mo84260X(true);
            case 4:
                return query.mo84301am();
            case 5:
            case 6:
                return query.mo84309au();
            case 7:
                return query.mo84243F();
            default:
                return query;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x0209  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x016c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.apps.gsa.shared.search.Query mo87472a(com.google.assistant.p3897e.p3921j.C52081en r9, com.google.android.libraries.gsa.conversation.p1852f.C22591r r10) {
        /*
            r8 = this;
            com.google.common.base.ax r0 = r10.mo27679b()
            boolean r0 = r0.mo56113h()
            r1 = 0
            if (r0 == 0) goto L_0x0024
            com.google.common.base.ax r0 = r10.mo27679b()
            java.lang.Object r0 = r0.mo56107c()
            boolean r0 = r0 instanceof com.google.android.apps.gsa.search.core.p6491a.C84349ah
            if (r0 == 0) goto L_0x0024
            com.google.common.base.ax r0 = r10.mo27679b()
            java.lang.Object r0 = r0.mo56107c()
            com.google.android.apps.gsa.search.core.a.ah r0 = (com.google.android.apps.gsa.search.core.p6491a.C84349ah) r0
            com.google.android.apps.gsa.shared.search.Query r0 = r0.f229566a
            goto L_0x0048
        L_0x0024:
            com.google.common.base.ax r0 = r10.mo27678a()
            boolean r0 = r0.mo56113h()
            if (r0 == 0) goto L_0x0047
            com.google.common.base.ax r0 = r10.mo27678a()
            java.lang.Object r0 = r0.mo56107c()
            boolean r0 = r0 instanceof com.google.android.apps.gsa.search.core.p6491a.C84367m
            if (r0 == 0) goto L_0x0047
            com.google.common.base.ax r0 = r10.mo27678a()
            java.lang.Object r0 = r0.mo56107c()
            com.google.android.apps.gsa.search.core.a.m r0 = (com.google.android.apps.gsa.search.core.p6491a.C84367m) r0
            com.google.android.apps.gsa.shared.search.Query r0 = r0.f229625a
            goto L_0x0048
        L_0x0047:
            r0 = r1
        L_0x0048:
            if (r0 == 0) goto L_0x0058
            java.lang.String r2 = r0.mo84355bn()
            if (r2 == 0) goto L_0x0058
            java.lang.String r2 = r0.mo84355bn()
            r2.getClass()
            goto L_0x0074
        L_0x0058:
            com.google.common.base.ax r2 = r8.f259054b
            com.google.common.base.bk r2 = (com.google.common.base.C58847bk) r2
            java.lang.Object r2 = r2.f156646a
            com.google.android.apps.gsa.staticplugins.opa.util.ca r2 = (com.google.android.apps.gsa.staticplugins.opa.util.C113812ca) r2
            java.lang.String r2 = r2.f315214a
            if (r2 == 0) goto L_0x0072
            com.google.common.base.ax r2 = r8.f259054b
            com.google.common.base.bk r2 = (com.google.common.base.C58847bk) r2
            java.lang.Object r2 = r2.f156646a
            com.google.android.apps.gsa.staticplugins.opa.util.ca r2 = (com.google.android.apps.gsa.staticplugins.opa.util.C113812ca) r2
            java.lang.String r2 = r2.f315214a
            if (r2 == 0) goto L_0x0071
            goto L_0x0074
        L_0x0071:
            throw r1
        L_0x0072:
            java.lang.String r2 = "and.opa"
        L_0x0074:
            com.google.android.apps.gsa.shared.search.Query r3 = com.google.android.apps.gsa.shared.search.Query.f252741b
            com.google.android.apps.gsa.shared.search.Query r3 = r3.mo84275aL(r2)
            byte[] r9 = r9.toByteArray()
            com.google.android.apps.gsa.shared.search.Query r9 = r3.mo84304ap(r9)
            android.content.Context r3 = r8.f259055c
            dagger.a r4 = r8.f259057e
            java.lang.Object r4 = r4.mo27525b()
            com.google.android.apps.gsa.shared.m.c r4 = (com.google.android.apps.gsa.shared.p7066m.C90021c) r4
            boolean r3 = com.google.android.apps.gsa.shared.p7148ui.p7155g.C90685b.m148054b(r3, r4)
            com.google.android.apps.gsa.shared.search.Query r9 = r9.mo84284aU(r3)
            java.lang.String r3 = "android.opa.extra.CONVERSATION_CLIENT_TYPE"
            int r4 = r8.f259053a
            com.google.android.apps.gsa.shared.search.Query r9 = r9.mo84311aw(r3, r4)
            int r3 = r10.mo27681d()
            r4 = 3
            r5 = 2
            r6 = 1
            if (r3 == r6) goto L_0x00c4
            int r3 = r10.mo27681d()
            int r7 = r3 + -1
            if (r3 == 0) goto L_0x00c3
            if (r7 == r6) goto L_0x00bc
            if (r7 == r5) goto L_0x00b9
            if (r7 == r4) goto L_0x00b6
            com.google.android.apps.gsa.shared.search.QueryTriggerType r3 = com.google.android.apps.gsa.shared.search.QueryTriggerType.FOLLOW_ON
            goto L_0x00be
        L_0x00b6:
            com.google.android.apps.gsa.shared.search.QueryTriggerType r3 = com.google.android.apps.gsa.shared.search.QueryTriggerType.NGA_VOICE_TYPING
            goto L_0x00be
        L_0x00b9:
            com.google.android.apps.gsa.shared.search.QueryTriggerType r3 = com.google.android.apps.gsa.shared.search.QueryTriggerType.MAGIC_MIC
            goto L_0x00be
        L_0x00bc:
            com.google.android.apps.gsa.shared.search.QueryTriggerType r3 = com.google.android.apps.gsa.shared.search.QueryTriggerType.FOLLOW_ON
        L_0x00be:
            com.google.android.apps.gsa.shared.search.Query r9 = r9.mo84286aW(r3)
            goto L_0x00c4
        L_0x00c3:
            throw r1
        L_0x00c4:
            java.lang.String r3 = "and.opa.deeplink"
            boolean r2 = r2.equals(r3)
            r3 = 0
            if (r2 == 0) goto L_0x00ee
            dagger.a r2 = r8.f259057e
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r2 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r2
            com.google.android.apps.gsa.shared.m.d r7 = com.google.android.apps.gsa.shared.p7066m.C90126fx.f251677nN
            boolean r2 = r2.mo79746e(r7)
            if (r2 == 0) goto L_0x00ee
            dagger.a r2 = r8.f259057e
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r2 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r2
            com.google.android.apps.gsa.shared.m.d r7 = com.google.android.apps.gsa.shared.p7066m.C90126fx.f251332gn
            boolean r2 = r2.mo79746e(r7)
            if (r2 == 0) goto L_0x00ee
            r3 = 1
        L_0x00ee:
            int r2 = r10.mo27681d()
            if (r2 != r6) goto L_0x00f9
            if (r3 != 0) goto L_0x00f8
            r2 = r1
            goto L_0x0142
        L_0x00f8:
            r3 = 1
        L_0x00f9:
            com.google.android.apps.gsa.opa.f.a.ac r2 = com.google.android.apps.gsa.opa.p6441f.p6442a.C83614ac.f227951e
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.apps.gsa.opa.f.a.ab r2 = (com.google.android.apps.gsa.opa.p6441f.p6442a.C83613ab) r2
            if (r3 == 0) goto L_0x0106
            com.google.android.apps.gsa.assistant.shared.l.e r3 = com.google.android.apps.gsa.assistant.shared.l.e.aw
            goto L_0x0108
        L_0x0106:
            com.google.android.apps.gsa.assistant.shared.l.e r3 = com.google.android.apps.gsa.assistant.shared.l.e.f
        L_0x0108:
            r2.copyOnWrite()
            com.google.protobuf.bv r7 = r2.instance
            com.google.android.apps.gsa.opa.f.a.ac r7 = (com.google.android.apps.gsa.opa.p6441f.p6442a.C83614ac) r7
            int r3 = r3.ca
            r7.f227955c = r3
            int r3 = r7.f227953a
            r3 = r3 | r5
            r7.f227953a = r3
            int r3 = r10.mo27681d()
            int r7 = r3 + -1
            if (r3 == 0) goto L_0x0216
            if (r7 == r6) goto L_0x012b
            if (r7 == r5) goto L_0x0129
            if (r7 == r4) goto L_0x0127
            goto L_0x012b
        L_0x0127:
            r3 = 4
            goto L_0x012c
        L_0x0129:
            r3 = 3
            goto L_0x012c
        L_0x012b:
            r3 = 2
        L_0x012c:
            r2.copyOnWrite()
            com.google.protobuf.bv r7 = r2.instance
            com.google.android.apps.gsa.opa.f.a.ac r7 = (com.google.android.apps.gsa.opa.p6441f.p6442a.C83614ac) r7
            int r3 = r3 + -1
            r7.f227954b = r3
            int r3 = r7.f227953a
            r3 = r3 | r6
            r7.f227953a = r3
            com.google.protobuf.bv r2 = r2.build()
            com.google.android.apps.gsa.opa.f.a.ac r2 = (com.google.android.apps.gsa.opa.p6441f.p6442a.C83614ac) r2
        L_0x0142:
            if (r2 == 0) goto L_0x014e
            java.lang.String r3 = "android.opa.extra.OPEN_MIC_EVENT_DATA"
            byte[] r2 = r2.toByteArray()
            com.google.android.apps.gsa.shared.search.Query r9 = r9.mo84303ao(r3, r2)
        L_0x014e:
            int r2 = r10.mo27682e()
            if (r2 != r4) goto L_0x0166
            com.google.android.apps.gsa.shared.search.Query r9 = r9.mo84245H(r5, r6, r1)
            dagger.a r1 = r8.f259056d
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.shared.logger.b.i r1 = (com.google.android.apps.gsa.shared.logger.p7051b.C89859i) r1
            com.google.android.apps.gsa.shared.logger.b.ae r2 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_SOUND_SEARCH_START
            r1.mo83702b(r2)
            goto L_0x016a
        L_0x0166:
            com.google.android.apps.gsa.shared.search.Query r9 = r9.mo84245H(r6, r6, r1)
        L_0x016a:
            if (r0 == 0) goto L_0x0203
            boolean r1 = r0.mo84404ck()
            if (r1 == 0) goto L_0x0176
            com.google.android.apps.gsa.shared.search.Query r9 = r9.mo84246I()
        L_0x0176:
            java.lang.String r1 = "android.opa.extra.MINI_PLATE_ENABLED"
            boolean r2 = r0.mo84363bw(r1)
            if (r2 == 0) goto L_0x0182
            com.google.android.apps.gsa.shared.search.Query r9 = r9.mo84302an(r1, r6)
        L_0x0182:
            boolean r1 = r0.mo84337bV()
            com.google.android.apps.gsa.shared.search.Query r9 = r9.mo84260X(r1)
            boolean r1 = r0.mo84466dt()
            if (r1 == 0) goto L_0x0194
            com.google.android.apps.gsa.shared.search.Query r9 = r9.mo84291ab()
        L_0x0194:
            boolean r1 = r0.mo84464dr()
            if (r1 == 0) goto L_0x019e
            com.google.android.apps.gsa.shared.search.Query r9 = r9.mo84287aX()
        L_0x019e:
            java.lang.String r1 = "android.opa.extra.TRIGGERED_BY_HEADSET"
            boolean r2 = r0.mo84363bw(r1)
            if (r2 == 0) goto L_0x01aa
            com.google.android.apps.gsa.shared.search.Query r9 = r9.mo84302an(r1, r6)
        L_0x01aa:
            java.lang.String r1 = "android.opa.extra.ENABLED_ON_OPA_LOCKSCREEN"
            boolean r2 = r0.mo84363bw(r1)
            if (r2 == 0) goto L_0x01b6
            com.google.android.apps.gsa.shared.search.Query r9 = r9.mo84302an(r1, r6)
        L_0x01b6:
            boolean r1 = r0.mo84412cs()
            if (r1 == 0) goto L_0x01db
            android.net.Uri r1 = r0.f252787z
            if (r1 == 0) goto L_0x01db
            dagger.a r1 = r8.f259057e
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r1 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r1
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250287aL
            boolean r1 = r1.mo79746e(r2)
            if (r1 == 0) goto L_0x01db
            android.net.Uri r1 = r0.f252787z
            r1.getClass()
            int r2 = r0.f252743A
            com.google.android.apps.gsa.shared.search.Query r9 = r9.mo84298aj(r1, r2, r6)
        L_0x01db:
            java.lang.String r1 = "user-agent-suffix"
            java.lang.String r2 = r0.mo84347bf(r1)
            if (r2 == 0) goto L_0x01e7
            com.google.android.apps.gsa.shared.search.Query r9 = r9.mo84278aO(r1, r2)
        L_0x01e7:
            java.lang.String r1 = "application-id-override"
            java.lang.String r2 = r0.mo84347bf(r1)
            if (r2 == 0) goto L_0x01f3
            com.google.android.apps.gsa.shared.search.Query r9 = r9.mo84278aO(r1, r2)
        L_0x01f3:
            java.lang.String r0 = r0.mo84351bj()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x0203
            java.lang.String r1 = "android.opa.extra.APP_INTEGRATION_CLIENT_PACKAGE_NAME"
            com.google.android.apps.gsa.shared.search.Query r9 = r9.mo84278aO(r1, r0)
        L_0x0203:
            boolean r10 = r10.mo27680c()
            if (r10 == 0) goto L_0x0211
            java.lang.String r10 = "android.opa.extra.TRIGGERED_BY"
            r0 = 54
            com.google.android.apps.gsa.shared.search.Query r9 = r9.mo84311aw(r10, r0)
        L_0x0211:
            com.google.android.apps.gsa.shared.search.Query r9 = r8.m152880c(r9)
            return r9
        L_0x0216:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.accl.p7338h.C92847b.mo87472a(com.google.assistant.e.j.en, com.google.android.libraries.gsa.conversation.f.r):com.google.android.apps.gsa.shared.search.Query");
    }

    /* renamed from: b */
    public final Query mo87473b() {
        return m152880c(Query.f252741b.mo84245H(0, true, (QueryTriggerType) null).mo84275aL(((C113812ca) ((C58847bk) this.f259054b).f156646a).f315214a).mo84284aU(C90685b.m148054b(this.f259055c, (C90021c) this.f259057e.mo27525b())).mo84311aw("android.opa.extra.CONVERSATION_CLIENT_TYPE", this.f259053a).mo84493u());
    }
}
