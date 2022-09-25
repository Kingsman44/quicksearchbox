package com.google.android.apps.gsa.staticplugins.immersiveactions;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.staticplugins.immersiveactions.aq */
/* compiled from: PG */
public final /* synthetic */ class C102410aq implements Callable {

    /* renamed from: a */
    public final /* synthetic */ OpaActionConfirmationCard f285830a;

    public /* synthetic */ C102410aq(OpaActionConfirmationCard opaActionConfirmationCard) {
        this.f285830a = opaActionConfirmationCard;
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x019b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r10 = this;
            com.google.android.apps.gsa.staticplugins.immersiveactions.OpaActionConfirmationCard r0 = r10.f285830a
            com.google.android.apps.gsa.assistant.shared.g.b r1 = com.google.android.apps.gsa.assistant.shared.g.b.f
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.apps.gsa.assistant.shared.g.a r1 = (com.google.android.apps.gsa.assistant.shared.g.a) r1
            android.widget.TextView r2 = r0.f285757c
            java.lang.CharSequence r2 = r2.getText()
            r3 = 1
            if (r2 == 0) goto L_0x002e
            android.widget.TextView r2 = r0.f285757c
            java.lang.CharSequence r2 = r2.getText()
            java.lang.String r2 = r2.toString()
            r1.copyOnWrite()
            com.google.protobuf.bv r4 = r1.instance
            com.google.android.apps.gsa.assistant.shared.g.b r4 = (com.google.android.apps.gsa.assistant.shared.g.b) r4
            r2.getClass()
            int r5 = r4.a
            r5 = r5 | r3
            r4.a = r5
            r4.b = r2
        L_0x002e:
            android.widget.TextView r2 = r0.f285758d
            java.lang.CharSequence r2 = r2.getText()
            if (r2 == 0) goto L_0x0052
            android.widget.TextView r2 = r0.f285758d
            java.lang.CharSequence r2 = r2.getText()
            java.lang.String r2 = r2.toString()
            r1.copyOnWrite()
            com.google.protobuf.bv r4 = r1.instance
            com.google.android.apps.gsa.assistant.shared.g.b r4 = (com.google.android.apps.gsa.assistant.shared.g.b) r4
            r2.getClass()
            int r5 = r4.a
            r5 = r5 | 2
            r4.a = r5
            r4.c = r2
        L_0x0052:
            com.google.android.apps.gsa.now.shared.ui.WebImageView r2 = r0.f285756b
            android.graphics.drawable.Drawable r2 = r2.getDrawable()
            byte[] r2 = com.google.android.apps.gsa.assistant.shared.p5816g.C73868h.m108448a(r2)
            if (r2 == 0) goto L_0x0071
            com.google.protobuf.z r2 = com.google.protobuf.C63088z.m96139A(r2)
            r1.copyOnWrite()
            com.google.protobuf.bv r4 = r1.instance
            com.google.android.apps.gsa.assistant.shared.g.b r4 = (com.google.android.apps.gsa.assistant.shared.g.b) r4
            int r5 = r4.a
            r5 = r5 | 4
            r4.a = r5
            r4.d = r2
        L_0x0071:
            r2 = 2131432454(0x7f0b1406, float:1.8486666E38)
            android.view.View r2 = r0.findViewById(r2)
            com.google.android.apps.gsa.staticplugins.immersiveactions.ImmersiveActionsLabeledFooter r2 = (com.google.android.apps.gsa.staticplugins.immersiveactions.ImmersiveActionsLabeledFooter) r2
            int r4 = r2.getVisibility()
            r5 = 0
            if (r4 != 0) goto L_0x00e2
            android.widget.TextView r4 = r2.f261071a
            java.lang.CharSequence r4 = r4.getText()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L_0x008e
            goto L_0x00e2
        L_0x008e:
            com.google.android.apps.gsa.assistant.shared.g.e r4 = com.google.android.apps.gsa.assistant.shared.g.e.e
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.android.apps.gsa.assistant.shared.g.d r4 = (com.google.android.apps.gsa.assistant.shared.g.d) r4
            android.widget.TextView r6 = r2.f261071a
            java.lang.CharSequence r6 = r6.getText()
            if (r6 == 0) goto L_0x00db
            android.widget.TextView r6 = r2.f261071a
            java.lang.CharSequence r6 = r6.getText()
            java.lang.String r6 = r6.toString()
            r4.copyOnWrite()
            com.google.protobuf.bv r7 = r4.instance
            com.google.android.apps.gsa.assistant.shared.g.e r7 = (com.google.android.apps.gsa.assistant.shared.g.e) r7
            r6.getClass()
            int r8 = r7.a
            r8 = r8 | r3
            r7.a = r8
            r7.b = r6
            android.widget.TextView r2 = r2.f261071a
            android.graphics.drawable.Drawable[] r2 = r2.getCompoundDrawablesRelative()
            r6 = 0
            r2 = r2[r6]
            byte[] r2 = com.google.android.apps.gsa.assistant.shared.p5816g.C73868h.m108448a(r2)
            if (r2 == 0) goto L_0x00db
            com.google.protobuf.z r2 = com.google.protobuf.C63088z.m96139A(r2)
            r4.copyOnWrite()
            com.google.protobuf.bv r6 = r4.instance
            com.google.android.apps.gsa.assistant.shared.g.e r6 = (com.google.android.apps.gsa.assistant.shared.g.e) r6
            int r7 = r6.a
            r7 = r7 | 2
            r6.a = r7
            r6.c = r2
        L_0x00db:
            com.google.protobuf.bv r2 = r4.build()
            com.google.android.apps.gsa.assistant.shared.g.e r2 = (com.google.android.apps.gsa.assistant.shared.g.e) r2
            goto L_0x00e3
        L_0x00e2:
            r2 = r5
        L_0x00e3:
            android.content.Context r4 = r0.getContext()
            com.google.android.apps.gsa.staticplugins.actionsui.modular.cz r6 = r0.f285759e
            com.google.android.apps.gsa.search.shared.actions.VoiceAction r6 = r6.f239226b
            com.google.android.apps.gsa.search.shared.actions.modular.ModularAction r6 = (com.google.android.apps.gsa.search.shared.actions.modular.ModularAction) r6
            com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo r7 = r6.f235986b
            com.google.android.apps.gsa.search.shared.actions.modular.ModularActionMatchingProviderInfo r7 = (com.google.android.apps.gsa.search.shared.actions.modular.ModularActionMatchingProviderInfo) r7
            if (r7 != 0) goto L_0x00f5
        L_0x00f3:
            r7 = r5
            goto L_0x0129
        L_0x00f5:
            com.google.bb.a.la r7 = r7.f236118d
            if (r7 == 0) goto L_0x00f3
            com.google.protobuf.bt r8 = com.google.p4152bb.p4153a.C55208jw.f145316z
            com.google.protobuf.bt r8 = com.google.protobuf.C62942bv.checkIsLite(r8)
            r7.mo58887l(r8)
            com.google.protobuf.bf r9 = r7.f169962ag
            com.google.protobuf.bs r8 = r8.f169971d
            boolean r8 = r9.mo58857o(r8)
            if (r8 != 0) goto L_0x010d
            goto L_0x00f3
        L_0x010d:
            com.google.protobuf.bt r8 = com.google.p4152bb.p4153a.C55208jw.f145316z
            com.google.protobuf.bt r8 = com.google.protobuf.C62942bv.checkIsLite(r8)
            r7.mo58887l(r8)
            com.google.protobuf.bf r7 = r7.f169962ag
            com.google.protobuf.bs r9 = r8.f169971d
            java.lang.Object r7 = r7.mo58854l(r9)
            if (r7 != 0) goto L_0x0123
            java.lang.Object r7 = r8.f169969b
            goto L_0x0127
        L_0x0123:
            java.lang.Object r7 = r8.mo58889c(r7)
        L_0x0127:
            com.google.bb.a.jw r7 = (com.google.p4152bb.p4153a.C55208jw) r7
        L_0x0129:
            if (r7 != 0) goto L_0x012c
            goto L_0x0145
        L_0x012c:
            com.google.android.apps.gsa.search.shared.actions.m r8 = new com.google.android.apps.gsa.search.shared.actions.m
            android.content.pm.PackageManager r9 = r4.getPackageManager()
            r8.<init>(r9, r4, r3)
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.m r9 = new com.google.android.apps.gsa.search.shared.actions.modular.arguments.m
            r9.<init>(r4)
            android.content.Intent r4 = r8.mo81206a(r7, r6, r9)
            if (r4 != 0) goto L_0x0141
            goto L_0x0145
        L_0x0141:
            com.google.bb.a.n r5 = com.google.android.apps.gsa.search.shared.actions.util.C87493o.m142022d(r4)
        L_0x0145:
            boolean r0 = r0.isClickable()
            if (r0 == 0) goto L_0x017a
            if (r5 == 0) goto L_0x017a
            r1.copyOnWrite()
            com.google.protobuf.bv r0 = r1.instance
            com.google.android.apps.gsa.assistant.shared.g.b r0 = (com.google.android.apps.gsa.assistant.shared.g.b) r0
            r0.e = r5
            int r4 = r0.a
            r4 = r4 | 8
            r0.a = r4
            if (r2 == 0) goto L_0x017a
            com.google.protobuf.bn r0 = r2.toBuilder()
            com.google.android.apps.gsa.assistant.shared.g.d r0 = (com.google.android.apps.gsa.assistant.shared.g.d) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.android.apps.gsa.assistant.shared.g.e r2 = (com.google.android.apps.gsa.assistant.shared.g.e) r2
            r2.d = r5
            int r4 = r2.a
            r4 = r4 | 4
            r2.a = r4
            com.google.protobuf.bv r0 = r0.build()
            r2 = r0
            com.google.android.apps.gsa.assistant.shared.g.e r2 = (com.google.android.apps.gsa.assistant.shared.g.e) r2
        L_0x017a:
            com.google.android.apps.gsa.assistant.shared.g.f r0 = com.google.android.apps.gsa.assistant.shared.g.f.d
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.apps.gsa.assistant.shared.g.c r0 = (com.google.android.apps.gsa.assistant.shared.g.c) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r4 = r0.instance
            com.google.android.apps.gsa.assistant.shared.g.f r4 = (com.google.android.apps.gsa.assistant.shared.g.f) r4
            com.google.protobuf.bv r1 = r1.build()
            com.google.android.apps.gsa.assistant.shared.g.b r1 = (com.google.android.apps.gsa.assistant.shared.g.b) r1
            r1.getClass()
            r4.b = r1
            int r1 = r4.a
            r1 = r1 | r3
            r4.a = r1
            if (r2 == 0) goto L_0x01b5
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.android.apps.gsa.assistant.shared.g.f r1 = (com.google.android.apps.gsa.assistant.shared.g.f) r1
            com.google.protobuf.cq r3 = r1.c
            boolean r4 = r3.mo58948c()
            if (r4 != 0) goto L_0x01b0
            com.google.protobuf.cq r3 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r3)
            r1.c = r3
        L_0x01b0:
            com.google.protobuf.cq r1 = r1.c
            r1.add(r2)
        L_0x01b5:
            com.google.protobuf.bv r0 = r0.build()
            com.google.android.apps.gsa.assistant.shared.g.f r0 = (com.google.android.apps.gsa.assistant.shared.g.f) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.immersiveactions.C102410aq.call():java.lang.Object");
    }
}
