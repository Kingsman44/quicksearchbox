package com.google.android.apps.gsa.staticplugins.opa.zerostate.cards;

import android.accounts.Account;
import android.animation.AnimatorSet;
import android.content.Intent;
import android.widget.Button;
import com.google.android.apps.gsa.assistant.shared.n.l;
import com.google.android.apps.gsa.search.shared.p6928f.C87550f;
import com.google.android.apps.gsa.search.shared.p6930h.C87566i;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8632f.C114742l;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114872do;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.android.libraries.logging.C28295m;
import com.google.assistant.p3861at.acx;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C59052c;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.ce */
/* compiled from: PG */
final class C114675ce implements C87550f {

    /* renamed from: a */
    final /* synthetic */ C114676cf f318122a;

    /* renamed from: b */
    private boolean f318123b = true;

    /* renamed from: c */
    private boolean f318124c = true;

    public C114675ce(C114676cf cfVar) {
        this.f318122a = cfVar;
    }

    /* renamed from: e */
    private final void m190068e(int i) {
        C28292j jVar = new C28292j(i);
        jVar.mo33795i(5);
        C28293k e = C28293k.m52908e(jVar, new C28293k[0]);
        C114676cf cfVar = this.f318122a;
        C114742l lVar = cfVar.f318132f;
        lVar.mo101570e(e, cfVar.f318143q);
        lVar.mo101571f(e, 5);
    }

    /* renamed from: f */
    private final void m190069f(Map map) {
        Intent intent;
        if (map.containsKey("IntentUrl")) {
            intent = C87566i.m142325x((String) map.get("IntentUrl"));
        } else {
            if (map.containsKey("ZeroStateActionData")) {
                try {
                    Map b = C114872do.m190399b((String) map.get("ZeroStateActionData"));
                    Intent intent2 = new Intent();
                    intent2.putExtra("zero_state_action_name", "DismissCardAction");
                    String str = (String) b.get("l.dismissal_expiration_timestamp_millis");
                    if (str != null) {
                        intent2.putExtra("dismissal_expiration_timestamp_millis", Long.parseLong(str));
                    }
                    String str2 = (String) b.get("B.enable_dismissal_undo_snackbar");
                    if (str2 != null) {
                        intent2.putExtra("enable_dismissal_undo_snackbar", Boolean.parseBoolean(str2));
                    }
                    intent = intent2;
                } catch (IOException | ClassNotFoundException | RuntimeException e) {
                    ((C59052c) ((C59052c) ((C59052c) C114676cf.f318125a.mo56226d()).mo56382g(e)).mo56372aa(29340)).mo56386p("#handleDismissCardAction(): exception");
                }
            }
            ((C59052c) ((C59052c) C114676cf.f318125a.mo56226d()).mo56372aa(29339)).mo56386p("#buildDismissCardActionIntent(): invalid args.");
            intent = null;
        }
        mo101513b(intent);
        m190070g(map, false);
        if (this.f318122a.f318135i.mo79746e(C90014bt.f247288eN)) {
            try {
                this.f318122a.f318146t.mo101664b();
                Button a = this.f318122a.f318146t.mo101663a();
                a.getClass();
                C28292j jVar = new C28292j(68419);
                jVar.mo33795i(5);
                C28295m.m52919e(a, jVar);
                this.f318122a.f318132f.mo101570e(C28293k.m52908e(jVar, new C28293k[0]), this.f318122a.f318143q);
                this.f318122a.f318146t.mo101665c();
            } catch (Exception e2) {
                ((C59052c) ((C59052c) C114676cf.f318125a.mo56226d()).mo56372aa(29325)).mo56389s("Failed to show snackbar. Error: %s", e2.getMessage());
            }
        }
    }

    /* renamed from: g */
    private final void m190070g(Map map, boolean z) {
        if (map.containsKey("ContainerVeId") && this.f318122a.f318143q != null) {
            String str = (String) map.get("ContainerVeId");
            if (!C58837ba.m90859h(str)) {
                try {
                    m190068e(Integer.parseInt(str));
                } catch (Exception unused) {
                    ((C59052c) ((C59052c) C114676cf.f318125a.mo56226d()).mo56372aa(29333)).mo56386p("Could not parse clickable container's ve id.");
                }
            } else if (z) {
                m190068e(52421);
            }
        }
    }

    /* renamed from: h */
    private final void m190071h(boolean z) {
        this.f318122a.mo101487g((Intent) null);
        C114676cf cfVar = this.f318122a;
        AnimatorSet c = cfVar.f318139m.mo101650c(cfVar.f318142p);
        c.addListener(new C114671ca(this, z));
        c.start();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo81667a(java.lang.String r7, java.util.Map r8) {
        /*
            r6 = this;
            int r0 = r7.hashCode()
            r1 = 3
            java.lang.String r2 = "DismissCardAction"
            r3 = -1
            r4 = 1
            r5 = 0
            switch(r0) {
                case -1750223768: goto L_0x0075;
                case -1737246364: goto L_0x006b;
                case -892279233: goto L_0x0061;
                case -806821364: goto L_0x0057;
                case 606733168: goto L_0x004f;
                case 695569981: goto L_0x0045;
                case 696542781: goto L_0x003a;
                case 894415418: goto L_0x002f;
                case 1228234638: goto L_0x0025;
                case 1551250271: goto L_0x001a;
                case 1854785495: goto L_0x000f;
                default: goto L_0x000d;
            }
        L_0x000d:
            goto L_0x007f
        L_0x000f:
            java.lang.String r0 = "HomescreenShortcutCardAction"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x007f
            r7 = 3
            goto L_0x0080
        L_0x001a:
            java.lang.String r0 = "PhotoDiscoverabilityOptInAction"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x007f
            r7 = 10
            goto L_0x0080
        L_0x0025:
            java.lang.String r0 = "UpdateAssistantSettingsAction"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x007f
            r7 = 7
            goto L_0x0080
        L_0x002f:
            java.lang.String r0 = "OptOutReorderSuggestionAction"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x007f
            r7 = 9
            goto L_0x0080
        L_0x003a:
            java.lang.String r0 = "OptInReorderSuggestionAction"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x007f
            r7 = 8
            goto L_0x0080
        L_0x0045:
            java.lang.String r0 = "CardHeightChanged"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x007f
            r7 = 5
            goto L_0x0080
        L_0x004f:
            boolean r7 = r7.equals(r2)
            if (r7 == 0) goto L_0x007f
            r7 = 2
            goto L_0x0080
        L_0x0057:
            java.lang.String r0 = "DisclosuresCardAction"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x007f
            r7 = 4
            goto L_0x0080
        L_0x0061:
            java.lang.String r0 = "ZeroStateAction"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x007f
            r7 = 0
            goto L_0x0080
        L_0x006b:
            java.lang.String r0 = "LinkClickAction"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x007f
            r7 = 6
            goto L_0x0080
        L_0x0075:
            java.lang.String r0 = "HideCardAction"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x007f
            r7 = 1
            goto L_0x0080
        L_0x007f:
            r7 = -1
        L_0x0080:
            java.lang.String r0 = "ZeroStateActionData"
            switch(r7) {
                case 0: goto L_0x01b9;
                case 1: goto L_0x01ab;
                case 2: goto L_0x01a7;
                case 3: goto L_0x0155;
                case 4: goto L_0x0140;
                case 5: goto L_0x011d;
                case 6: goto L_0x0119;
                case 7: goto L_0x00b4;
                case 8: goto L_0x00aa;
                case 9: goto L_0x00a6;
                case 10: goto L_0x0087;
                default: goto L_0x0085;
            }
        L_0x0085:
            goto L_0x027e
        L_0x0087:
            r6.m190070g(r8, r5)
            com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.cf r7 = r6.f318122a
            r8 = 0
            r7.mo101487g(r8)
            com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.cf r7 = r6.f318122a
            com.google.android.apps.gsa.staticplugins.opa.zerostate.j.ci r8 = r7.f318139m
            android.view.View r7 = r7.f318142p
            android.animation.AnimatorSet r7 = r8.mo101650c(r7)
            com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.cd r8 = new com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.cd
            r8.<init>(r6)
            r7.addListener(r8)
            r7.start()
            return
        L_0x00a6:
            r6.m190071h(r5)
            return
        L_0x00aa:
            r7 = 70359(0x112d7, float:9.8594E-41)
            r6.m190068e(r7)
            r6.m190071h(r4)
            return
        L_0x00b4:
            boolean r7 = r8.containsKey(r0)
            if (r7 == 0) goto L_0x010b
            java.lang.Object r7 = r8.get(r0)
            java.lang.String r7 = (java.lang.String) r7
            java.util.Map r7 = com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114872do.m190399b(r7)     // Catch:{ Exception -> 0x00fc }
            java.lang.String r8 = "settings_ui_update"
            java.lang.Object r7 = r7.get(r8)     // Catch:{ Exception -> 0x00fc }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x00fc }
            if (r7 != 0) goto L_0x00e4
            com.google.common.f.e r7 = com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.C114676cf.f318125a     // Catch:{ Exception -> 0x00fc }
            com.google.common.f.x r7 = r7.mo56226d()     // Catch:{ Exception -> 0x00fc }
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7     // Catch:{ Exception -> 0x00fc }
            r8 = 29338(0x729a, float:4.1111E-41)
            com.google.common.f.x r7 = r7.mo56372aa(r8)     // Catch:{ Exception -> 0x00fc }
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7     // Catch:{ Exception -> 0x00fc }
            java.lang.String r8 = "Could not find param: settings_ui_update."
            r7.mo56386p(r8)     // Catch:{ Exception -> 0x00fc }
            return
        L_0x00e4:
            com.google.common.l.i r8 = com.google.common.p4541l.C59326i.f157516d     // Catch:{ Exception -> 0x00fc }
            byte[] r7 = r8.mo56836k(r7)     // Catch:{ Exception -> 0x00fc }
            com.google.protobuf.ba r8 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ Exception -> 0x00fc }
            com.google.assistant.at.acx r0 = com.google.assistant.p3861at.acx.f128971H     // Catch:{ Exception -> 0x00fc }
            com.google.protobuf.bv r7 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r0, (byte[]) r7, (com.google.protobuf.C62921ba) r8)     // Catch:{ Exception -> 0x00fc }
            com.google.assistant.at.acx r7 = (com.google.assistant.p3861at.acx) r7     // Catch:{ Exception -> 0x00fc }
            com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.bu r8 = com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.C114664bu.f318109a     // Catch:{ Exception -> 0x00fc }
            r6.mo101515d(r7, r8)     // Catch:{ Exception -> 0x00fc }
            return
        L_0x00fc:
            r7 = move-exception
            com.google.common.f.e r8 = com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.C114676cf.f318125a
            com.google.common.f.x r8 = r8.mo56226d()
            java.lang.String r0 = "Could not Base64-decode ZeroState action data."
            r1 = 29337(0x7299, float:4.111E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r8).mo56382g(r7)).mo56372aa(r1)).mo56386p(r0)
            return
        L_0x010b:
            com.google.common.f.e r7 = com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.C114676cf.f318125a
            com.google.common.f.x r7 = r7.mo56226d()
            java.lang.String r8 = "Missing ZeroState action data."
            r0 = 29336(0x7298, float:4.1108E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56372aa(r0)).mo56386p(r8)
            return
        L_0x0119:
            r6.m190070g(r8, r4)
            return
        L_0x011d:
            com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.cf r7 = r6.f318122a
            boolean r8 = r7.f318147u
            if (r8 == 0) goto L_0x0126
            r7.f318147u = r5
            return
        L_0x0126:
            boolean r7 = r6.f318123b
            if (r7 == 0) goto L_0x0132
            r7 = 51853(0xca8d, float:7.2662E-41)
            r6.m190068e(r7)
            r6.f318123b = r5
        L_0x0132:
            com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.cf r7 = r6.f318122a
            dagger.a r7 = r7.f318140n
            java.lang.Object r7 = r7.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.zerostate.f.g r7 = (com.google.android.apps.gsa.staticplugins.opa.zerostate.p8632f.C114737g) r7
            r7.mo101566e()
            return
        L_0x0140:
            com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.cf r7 = r6.f318122a
            com.google.android.apps.gsa.search.core.google.gaia.o r7 = r7.f318133g
            android.accounts.Account r7 = r7.mo79668a()
            if (r7 == 0) goto L_0x0151
            com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.cf r0 = r6.f318122a
            com.google.android.apps.gsa.staticplugins.opa.omniconsent.aj r0 = r0.f318134h
            r0.mo98128j(r7, r1)
        L_0x0151:
            r6.m190069f(r8)
            return
        L_0x0155:
            r6.m190070g(r8, r5)
            boolean r7 = r8.containsKey(r0)
            if (r7 == 0) goto L_0x0199
            java.lang.Object r7 = r8.get(r0)
            java.lang.String r7 = (java.lang.String) r7
            com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.cf r8 = r6.f318122a
            dagger.a r8 = r8.f318141o
            java.lang.Object r8 = r8.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.zerostate.j.ay r8 = (com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114801ay) r8
            com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.cf r0 = r6.f318122a
            com.google.android.apps.gsa.shared.util.t.g r0 = r0.f318131e
            r8.mo101605b(r0)
            com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.cf r8 = r6.f318122a
            java.util.Timer r0 = r8.f318148v
            if (r0 != 0) goto L_0x0182
            java.util.Timer r0 = new java.util.Timer
            r0.<init>()
            r8.f318148v = r0
        L_0x0182:
            com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.cf r8 = r6.f318122a
            java.util.Timer r8 = r8.f318148v
            com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.cb r0 = new com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.cb
            r0.<init>(r6, r7)
            com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.cf r7 = r6.f318122a
            com.google.android.apps.gsa.search.core.i.t r7 = r7.f318135i
            com.google.android.apps.gsa.shared.m.f r1 = com.google.android.apps.gsa.shared.p7066m.C90080ee.f249822u
            long r1 = r7.mo79743a(r1)
            r8.schedule(r0, r1)
            return
        L_0x0199:
            com.google.common.f.e r7 = com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.C114676cf.f318125a
            com.google.common.f.x r7 = r7.mo56226d()
            java.lang.String r8 = "#handleHomescreenShortcutCardAction(): missing ZeroState action data."
            r0 = 29326(0x728e, float:4.1094E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56372aa(r0)).mo56386p(r8)
            return
        L_0x01a7:
            r6.m190069f(r8)
            return
        L_0x01ab:
            com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.cf r7 = r6.f318122a
            com.google.android.apps.gsa.staticplugins.opa.zerostate.j.ci r8 = r7.f318139m
            android.view.View r7 = r7.f318142p
            android.animation.AnimatorSet r7 = r8.mo101650c(r7)
            r7.start()
            return
        L_0x01b9:
            boolean r7 = r8.containsKey(r0)
            if (r7 == 0) goto L_0x027e
            java.lang.Object r7 = r8.get(r0)
            java.lang.String r7 = (java.lang.String) r7
            com.google.common.l.i r8 = com.google.common.p4541l.C59326i.f157516d     // Catch:{ IllegalArgumentException -> 0x0271 }
            byte[] r7 = r8.mo56836k(r7)     // Catch:{ IllegalArgumentException -> 0x0271 }
            com.google.protobuf.ba r8 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x026e }
            com.google.assistant.s.a.ca r0 = com.google.assistant.p3994s.p3995a.C53118ca.f139194b     // Catch:{ ct -> 0x026e }
            com.google.protobuf.bv r7 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r0, (byte[]) r7, (com.google.protobuf.C62921ba) r8)     // Catch:{ ct -> 0x026e }
            com.google.assistant.s.a.ca r7 = (com.google.assistant.p3994s.p3995a.C53118ca) r7     // Catch:{ ct -> 0x026e }
            com.google.protobuf.cq r8 = r7.f139196a     // Catch:{ ct -> 0x026e }
            int r8 = r8.size()     // Catch:{ ct -> 0x026e }
            if (r8 != 0) goto L_0x01e2
            com.google.common.f.e r7 = com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.C114676cf.f318125a     // Catch:{ ct -> 0x026e }
            return
        L_0x01e2:
            com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.cf r8 = r6.f318122a     // Catch:{ ct -> 0x026e }
            com.google.android.apps.gsa.search.core.i.t r8 = r8.f318135i     // Catch:{ ct -> 0x026e }
            com.google.android.apps.gsa.shared.m.d r0 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247280eF     // Catch:{ ct -> 0x026e }
            boolean r8 = r8.mo79746e(r0)     // Catch:{ ct -> 0x026e }
            if (r8 == 0) goto L_0x01ef
            goto L_0x022b
        L_0x01ef:
            com.google.protobuf.cq r8 = r7.f139196a     // Catch:{ ct -> 0x026e }
            r0 = 0
        L_0x01f2:
            int r1 = r8.size()     // Catch:{ ct -> 0x026e }
            if (r0 >= r1) goto L_0x020e
            java.lang.Object r1 = r8.get(r0)     // Catch:{ ct -> 0x026e }
            com.google.assistant.s.a.by r1 = (com.google.assistant.p3994s.p3995a.C53115by) r1     // Catch:{ ct -> 0x026e }
            java.lang.String r1 = r1.f139192e     // Catch:{ ct -> 0x026e }
            java.lang.String r1 = com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114872do.m190398a(r1)     // Catch:{ ct -> 0x026e }
            boolean r1 = r1.equals(r2)     // Catch:{ ct -> 0x026e }
            if (r1 != 0) goto L_0x020d
            int r0 = r0 + 1
            goto L_0x01f2
        L_0x020d:
            r3 = r0
        L_0x020e:
            if (r3 < 0) goto L_0x022b
            com.google.protobuf.bn r7 = r7.toBuilder()     // Catch:{ ct -> 0x026e }
            com.google.assistant.s.a.bz r7 = (com.google.assistant.p3994s.p3995a.C53116bz) r7     // Catch:{ ct -> 0x026e }
            r7.copyOnWrite()     // Catch:{ ct -> 0x026e }
            com.google.protobuf.bv r8 = r7.instance     // Catch:{ ct -> 0x026e }
            com.google.assistant.s.a.ca r8 = (com.google.assistant.p3994s.p3995a.C53118ca) r8     // Catch:{ ct -> 0x026e }
            r8.mo53960a()     // Catch:{ ct -> 0x026e }
            com.google.protobuf.cq r8 = r8.f139196a     // Catch:{ ct -> 0x026e }
            r8.remove(r3)     // Catch:{ ct -> 0x026e }
            com.google.protobuf.bv r7 = r7.build()     // Catch:{ ct -> 0x026e }
            com.google.assistant.s.a.ca r7 = (com.google.assistant.p3994s.p3995a.C53118ca) r7     // Catch:{ ct -> 0x026e }
        L_0x022b:
            com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.cf r8 = r6.f318122a     // Catch:{ ct -> 0x026e }
            com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.am r0 = r8.f318130d     // Catch:{ ct -> 0x026e }
            com.google.android.apps.gsa.shared.util.t.g r1 = r8.f318131e     // Catch:{ ct -> 0x026e }
            com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.al r7 = r0.mo101479a(r7, r1, r8)     // Catch:{ ct -> 0x026e }
            com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.cf r8 = r6.f318122a     // Catch:{ ct -> 0x026e }
            com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.ce r8 = r8.f318144r     // Catch:{ ct -> 0x026e }
            r7.f318006a = r8     // Catch:{ ct -> 0x026e }
            r7.mo101478c()     // Catch:{ ct -> 0x026e }
            boolean r8 = r6.f318124c     // Catch:{ ct -> 0x026e }
            if (r8 == 0) goto L_0x024a
            r8 = 52620(0xcd8c, float:7.3736E-41)
            r6.m190068e(r8)     // Catch:{ ct -> 0x026e }
            r6.f318124c = r5     // Catch:{ ct -> 0x026e }
        L_0x024a:
            com.google.android.libraries.logging.k r7 = r7.f318007b     // Catch:{ ct -> 0x026e }
            if (r7 == 0) goto L_0x0258
            com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.cf r8 = r6.f318122a     // Catch:{ ct -> 0x026e }
            com.google.android.apps.gsa.staticplugins.opa.zerostate.f.l r0 = r8.f318132f     // Catch:{ ct -> 0x026e }
            com.google.android.libraries.logging.k r8 = r8.f318143q     // Catch:{ ct -> 0x026e }
            r0.mo101570e(r7, r8)     // Catch:{ ct -> 0x026e }
            return
        L_0x0258:
            com.google.common.f.e r7 = com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.C114676cf.f318125a     // Catch:{ ct -> 0x026e }
            com.google.common.f.x r7 = r7.mo56226d()     // Catch:{ ct -> 0x026e }
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7     // Catch:{ ct -> 0x026e }
            r8 = 29322(0x728a, float:4.1089E-41)
            com.google.common.f.x r7 = r7.mo56372aa(r8)     // Catch:{ ct -> 0x026e }
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7     // Catch:{ ct -> 0x026e }
            java.lang.String r8 = "overflowMenuDialogNode is null"
            r7.mo56386p(r8)     // Catch:{ ct -> 0x026e }
            return
        L_0x026e:
            com.google.common.f.e r7 = com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.C114676cf.f318125a
            return
        L_0x0271:
            com.google.common.f.e r7 = com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.C114676cf.f318125a
            com.google.common.f.x r7 = r7.mo56226d()
            java.lang.String r8 = "Could not Base64-decode Zero state action data."
            r0 = 29334(0x7296, float:4.1106E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56372aa(r0)).mo56386p(r8)
        L_0x027e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.C114675ce.mo81667a(java.lang.String, java.util.Map):void");
    }

    /* renamed from: b */
    public final void mo101513b(Intent intent) {
        this.f318122a.mo101489i();
        this.f318122a.mo101487g(intent);
    }

    /* renamed from: c */
    public final void mo101514c() {
        ((C59052c) ((C59052c) C114676cf.f318125a.mo56226d()).mo56372aa(29328)).mo56386p("Failed to update photo discoverability opt-in status.");
        this.f318122a.f318145s.mo101666d();
        this.f318122a.f318145s.mo101664b();
        this.f318122a.f318145s.mo101665c();
        this.f318122a.mo101516k("photoDiscoverabilityOptinFailure", new C114662bs(this));
        this.f318122a.mo101488h();
    }

    /* renamed from: d */
    public final void mo101515d(acx acx, C90919bp bpVar) {
        C114676cf cfVar = this.f318122a;
        l lVar = cfVar.f318136j;
        Account a = cfVar.f318133g.mo79668a();
        int i = C114676cf.f318127c;
        acx acx2 = acx;
        new C90873ag(lVar.d(a, acx2, (long) i, TimeUnit.MILLISECONDS, getClass().getSimpleName()), this.f318122a.f318138l, "updateAssistantSettings", C114667bx.f318112a).mo85223a(bpVar);
    }
}
