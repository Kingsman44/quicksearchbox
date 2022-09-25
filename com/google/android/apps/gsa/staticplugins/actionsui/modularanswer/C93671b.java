package com.google.android.apps.gsa.staticplugins.actionsui.modularanswer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.apps.gsa.shared.p7148ui.C90638an;
import com.google.android.apps.gsa.staticplugins.actionsui.C93507m;
import com.google.android.googlequicksearchbox.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modularanswer.b */
/* compiled from: PG */
public final class C93671b extends C93507m implements C93673d {

    /* renamed from: e */
    private final LayoutInflater f261464e = LayoutInflater.from(getContext());

    /* renamed from: f */
    private final int f261465f = getResources().getDimensionPixelSize(R.dimen.card_elevation);

    /* renamed from: g */
    private final C93685p f261466g;

    /* renamed from: h */
    private LinearLayout f261467h;

    public C93671b(Context context) {
        super(context, "ModularAnswerCard");
        this.f261466g = new C93685p(context);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0033  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View mo88138a(com.google.p4152bb.p4153a.C55240la r7) {
        /*
            r6 = this;
            r0 = 0
            if (r7 == 0) goto L_0x0068
            int r1 = r7.f145451a
            r1 = r1 & 2
            r2 = 1
            if (r1 == 0) goto L_0x002f
            com.google.android.apps.gsa.search.shared.ui.actions.a r1 = r6.f239232a
            r1.getClass()
            com.google.android.apps.gsa.staticplugins.actionsui.modularanswer.e r1 = (com.google.android.apps.gsa.staticplugins.actionsui.modularanswer.C93674e) r1
            com.google.bb.a.he r3 = r7.f145453c
            if (r3 != 0) goto L_0x0017
            com.google.bb.a.he r3 = com.google.p4152bb.p4153a.C55136he.f145130j
        L_0x0017:
            if (r3 == 0) goto L_0x002f
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.m r4 = r1.f261468d     // Catch:{ IllegalArgumentException -> 0x002e }
            com.google.android.apps.gsa.search.shared.actions.VoiceAction r1 = r1.f239226b     // Catch:{ IllegalArgumentException -> 0x002e }
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.l r1 = (com.google.android.apps.gsa.search.shared.actions.modular.arguments.C87448l) r1     // Catch:{ IllegalArgumentException -> 0x002e }
            com.google.android.apps.gsa.search.shared.actions.modular.a.c r1 = r4.mo81378a(r3, r1, r2)     // Catch:{ IllegalArgumentException -> 0x002e }
            boolean r3 = r1.mo81247f()     // Catch:{ IllegalArgumentException -> 0x002e }
            if (r3 == 0) goto L_0x002f
            java.lang.String r1 = r1.mo81245d()     // Catch:{ IllegalArgumentException -> 0x002e }
            goto L_0x0030
        L_0x002e:
        L_0x002f:
            r1 = r0
        L_0x0030:
            if (r1 != 0) goto L_0x0033
            goto L_0x0068
        L_0x0033:
            android.view.LayoutInflater r0 = r6.f261464e
            r3 = 2131626639(0x7f0e0a8f, float:1.888052E38)
            android.widget.LinearLayout r4 = r6.f261467h
            r5 = 0
            android.view.View r0 = r0.inflate(r3, r4, r5)
            com.google.android.apps.gsa.sidekick.shared.ui.ModularCard r0 = (com.google.android.apps.gsa.sidekick.shared.p7256ui.ModularCard) r0
            android.view.LayoutInflater r3 = r6.f261464e
            r4 = 2131626648(0x7f0e0a98, float:1.8880538E38)
            r3.inflate(r4, r0, r2)
            int r7 = r7.f145454d
            int r7 = com.google.p4152bb.p4153a.C55419v.m87685a(r7)
            if (r7 != 0) goto L_0x0052
            goto L_0x0053
        L_0x0052:
            r2 = r7
        L_0x0053:
            int r7 = com.google.android.apps.gsa.search.shared.p6941ui.actions.C88511e.m142915b(r2)
            com.google.android.apps.gsa.sidekick.shared.util.C91960ak.m150916b(r0, r7)
            r7 = 2131436600(0x7f0b2438, float:1.8495075E38)
            android.view.View r7 = r0.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r7.setText(r1)
            r0.f256427k = r5
        L_0x0068:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.actionsui.modularanswer.C93671b.mo88138a(com.google.bb.a.la):android.view.View");
    }

    /* renamed from: b */
    public final List mo82064b() {
        return new ArrayList();
    }

    /* renamed from: t */
    public final View mo87752t(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.qp_modular_answer_card, viewGroup, false);
        this.f261467h = (LinearLayout) inflate.findViewById(R.id.modular_answer_card);
        C90638an anVar = new C90638an(0);
        anVar.f253489r = 2;
        anVar.f253473b = false;
        anVar.f253474c = false;
        setLayoutParams(anVar);
        return inflate;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x003f A[SYNTHETIC] */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo88139v() {
        /*
            r12 = this;
            android.widget.LinearLayout r0 = r12.f261467h
            r0.removeAllViews()
            com.google.android.apps.gsa.search.shared.ui.actions.a r0 = r12.f239232a
            r0.getClass()
            com.google.android.apps.gsa.staticplugins.actionsui.modularanswer.e r0 = (com.google.android.apps.gsa.staticplugins.actionsui.modularanswer.C93674e) r0
            com.google.android.apps.gsa.search.shared.actions.VoiceAction r0 = r0.f239226b
            com.google.android.apps.gsa.staticplugins.actions.modularanswer.ModularAnswerImpl r0 = (com.google.android.apps.gsa.staticplugins.actions.modularanswer.ModularAnswerImpl) r0
            java.util.List r0 = r0.f260516g
            java.util.Iterator r0 = r0.iterator()
        L_0x0016:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L_0x011d
            java.lang.Object r1 = r0.next()
            com.google.android.apps.gsa.staticplugins.actions.modularanswer.results.ResultGroup r1 = (com.google.android.apps.gsa.staticplugins.actions.modularanswer.results.ResultGroup) r1
            java.util.List r1 = r1.f260547b
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0016
            com.google.android.apps.gsa.search.shared.ui.actions.a r0 = r12.f239232a
            r0.getClass()
            com.google.android.apps.gsa.staticplugins.actionsui.modularanswer.e r0 = (com.google.android.apps.gsa.staticplugins.actionsui.modularanswer.C93674e) r0
            com.google.android.apps.gsa.search.shared.actions.VoiceAction r0 = r0.f239226b
            com.google.android.apps.gsa.staticplugins.actions.modularanswer.ModularAnswerImpl r0 = (com.google.android.apps.gsa.staticplugins.actions.modularanswer.ModularAnswerImpl) r0
            int r1 = r0.f260518i
            java.util.List r0 = r0.f260516g
            java.util.Iterator r0 = r0.iterator()
            r3 = 0
        L_0x003f:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x011c
            java.lang.Object r4 = r0.next()
            com.google.android.apps.gsa.staticplugins.actions.modularanswer.results.ResultGroup r4 = (com.google.android.apps.gsa.staticplugins.actions.modularanswer.results.ResultGroup) r4
            com.google.android.apps.gsa.staticplugins.actionsui.modularanswer.p r5 = r12.f261466g
            android.view.LayoutInflater r6 = r12.f261464e
            java.util.List r7 = r4.f260547b
            boolean r7 = r7.isEmpty()
            r8 = 1
            r9 = 0
            if (r7 == 0) goto L_0x005b
        L_0x0059:
            r7 = r9
            goto L_0x00b4
        L_0x005b:
            int r7 = r4.f260546a
            if (r7 == r8) goto L_0x009c
            r10 = 3
            if (r7 == r10) goto L_0x0081
            r10 = 4
            if (r7 == r10) goto L_0x0066
            goto L_0x0059
        L_0x0066:
            java.util.List r7 = r4.f260547b
            java.lang.Object r7 = r7.get(r2)
            boolean r7 = r7 instanceof com.google.android.apps.gsa.staticplugins.actions.modularanswer.results.ClockResult
            if (r7 != 0) goto L_0x0071
            goto L_0x0059
        L_0x0071:
            com.google.android.apps.gsa.staticplugins.actionsui.modularanswer.h r7 = new com.google.android.apps.gsa.staticplugins.actionsui.modularanswer.h
            java.util.List r4 = r4.f260547b
            java.lang.Object r4 = r4.get(r2)
            com.google.android.apps.gsa.staticplugins.actions.modularanswer.results.ClockResult r4 = (com.google.android.apps.gsa.staticplugins.actions.modularanswer.results.ClockResult) r4
            android.content.Context r5 = r5.f261487a
            r7.<init>(r4, r12, r6, r5)
            goto L_0x00b4
        L_0x0081:
            java.util.List r7 = r4.f260547b
            java.lang.Object r7 = r7.get(r2)
            boolean r7 = r7 instanceof com.google.android.apps.gsa.staticplugins.actions.modularanswer.results.ListResult
            if (r7 != 0) goto L_0x008c
            goto L_0x0059
        L_0x008c:
            com.google.android.apps.gsa.staticplugins.actionsui.modularanswer.n r7 = new com.google.android.apps.gsa.staticplugins.actionsui.modularanswer.n
            java.util.List r4 = r4.f260547b
            java.lang.Object r4 = r4.get(r2)
            com.google.android.apps.gsa.staticplugins.actions.modularanswer.results.ListResult r4 = (com.google.android.apps.gsa.staticplugins.actions.modularanswer.results.ListResult) r4
            android.content.Context r5 = r5.f261487a
            r7.<init>(r4, r12, r6, r5)
            goto L_0x00b4
        L_0x009c:
            java.util.List r5 = r4.f260547b
            java.lang.Object r5 = r5.get(r2)
            boolean r5 = r5 instanceof com.google.android.apps.gsa.staticplugins.actions.modularanswer.results.SmsResult
            if (r5 != 0) goto L_0x00a7
            goto L_0x0059
        L_0x00a7:
            com.google.android.apps.gsa.staticplugins.actionsui.modularanswer.s r7 = new com.google.android.apps.gsa.staticplugins.actionsui.modularanswer.s
            java.util.List r4 = r4.f260547b
            java.lang.Object r4 = r4.get(r2)
            com.google.android.apps.gsa.staticplugins.actions.modularanswer.results.SmsResult r4 = (com.google.android.apps.gsa.staticplugins.actions.modularanswer.results.SmsResult) r4
            r7.<init>(r4, r12, r6)
        L_0x00b4:
            if (r7 == 0) goto L_0x003f
            android.widget.LinearLayout r4 = r12.f261467h
            android.view.View r4 = r7.mo88141a(r4)
            int r3 = r3 + 1
            if (r3 == r1) goto L_0x00d5
            com.google.android.apps.gsa.search.shared.ui.actions.a r5 = r12.f239232a
            r5.getClass()
            com.google.android.apps.gsa.staticplugins.actionsui.modularanswer.e r5 = (com.google.android.apps.gsa.staticplugins.actionsui.modularanswer.C93674e) r5
            com.google.android.apps.gsa.search.shared.actions.VoiceAction r5 = r5.f239226b
            com.google.android.apps.gsa.staticplugins.actions.modularanswer.ModularAnswerImpl r5 = (com.google.android.apps.gsa.staticplugins.actions.modularanswer.ModularAnswerImpl) r5
            java.util.List r5 = r5.f260516g
            int r5 = r5.size()
            if (r3 != r5) goto L_0x00d4
            goto L_0x00d5
        L_0x00d4:
            r8 = 0
        L_0x00d5:
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r6 = -1
            r10 = -2
            r5.<init>(r6, r10)
            int r11 = r12.f261465f
            r5.leftMargin = r11
            int r11 = r12.f261465f
            r5.rightMargin = r11
            r4.setLayoutParams(r5)
            if (r8 == 0) goto L_0x00f8
            android.widget.LinearLayout r8 = r12.f261467h
            r7.mo88142b(r8)
            android.view.View r9 = r7.mo88143c()
            if (r9 != 0) goto L_0x00f8
            int r7 = r12.f261465f
            r5.bottomMargin = r7
        L_0x00f8:
            android.widget.LinearLayout r5 = r12.f261467h
            r5.addView(r4)
            if (r9 == 0) goto L_0x0118
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r4.<init>(r6, r10)
            int r5 = r12.f261465f
            r4.leftMargin = r5
            int r5 = r12.f261465f
            r4.rightMargin = r5
            int r5 = r12.f261465f
            r4.bottomMargin = r5
            r9.setLayoutParams(r4)
            android.widget.LinearLayout r4 = r12.f261467h
            r4.addView(r9)
        L_0x0118:
            if (r3 >= r1) goto L_0x011c
            goto L_0x003f
        L_0x011c:
            return
        L_0x011d:
            android.view.LayoutInflater r0 = r12.f261464e
            r1 = 2131625989(0x7f0e0805, float:1.8879202E38)
            android.widget.LinearLayout r3 = r12.f261467h
            android.view.View r0 = r0.inflate(r1, r3, r2)
            r1 = 2131433216(0x7f0b1700, float:1.8488211E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            com.google.android.apps.gsa.search.shared.ui.actions.a r2 = r12.f239232a
            r2.getClass()
            com.google.android.apps.gsa.staticplugins.actionsui.modularanswer.e r2 = (com.google.android.apps.gsa.staticplugins.actionsui.modularanswer.C93674e) r2
            com.google.android.apps.gsa.search.shared.actions.util.CardDecision r2 = r2.mo82039ao()
            java.lang.String r2 = r2.f236249c
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x0148
            r1.setText(r2)
            goto L_0x0156
        L_0x0148:
            android.content.res.Resources r2 = r12.getResources()
            r3 = 2132082878(0x7f1500be, float:1.9805883E38)
            java.lang.String r2 = r2.getString(r3)
            r1.setText(r2)
        L_0x0156:
            r1 = 11065(0x2b39, float:1.5505E-41)
            com.google.android.apps.gsa.shared.logger.p7065j.C89941l.m146512c(r0, r1)
            android.widget.LinearLayout r1 = r12.f261467h
            r1.addView(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.actionsui.modularanswer.C93671b.mo88139v():void");
    }
}
