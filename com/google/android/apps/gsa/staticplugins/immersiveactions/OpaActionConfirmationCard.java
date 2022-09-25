package com.google.android.apps.gsa.staticplugins.immersiveactions;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Pair;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.gsa.assistant.shared.p5816g.C73867g;
import com.google.android.apps.gsa.now.shared.p6421ui.WebImageView;
import com.google.android.apps.gsa.search.shared.actions.modular.ModularAction;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.Argument;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88511e;
import com.google.android.apps.gsa.shared.util.p7159c.C90879am;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.C93584ch;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.C93602cz;
import com.google.android.googlequicksearchbox.R;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4152bb.p4153a.C55240la;
import com.google.p4152bb.p4153a.C55253ln;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
public class OpaActionConfirmationCard extends LinearLayout implements C93584ch, C73867g {

    /* renamed from: a */
    public LinearLayout f285755a;

    /* renamed from: b */
    public WebImageView f285756b;

    /* renamed from: c */
    public TextView f285757c;

    /* renamed from: d */
    public TextView f285758d;

    /* renamed from: e */
    public C93602cz f285759e;

    /* renamed from: f */
    public boolean f285760f;

    /* renamed from: g */
    private ImageView f285761g;

    /* renamed from: h */
    private TextView f285762h;

    /* renamed from: i */
    private boolean f285763i;

    public OpaActionConfirmationCard(Context context) {
        super(context);
    }

    /* renamed from: f */
    private final C55240la m169756f() {
        List R = this.f285759e.mo88023R();
        if (R == null || R.isEmpty() || ((C55253ln) R.get(0)).f145510b.size() <= 0) {
            return null;
        }
        return (C55240la) ((C55253ln) R.get(0)).f145510b.get(0);
    }

    /* renamed from: g */
    private final boolean m169757g() {
        Argument argument;
        if (this.f285759e.mo82039ao().f236263q == null) {
            return false;
        }
        Iterator it = ((ModularAction) this.f285759e.f239226b).mo81222ab().iterator();
        while (true) {
            if (!it.hasNext()) {
                argument = null;
                break;
            }
            argument = (Argument) it.next();
            if (this.f285759e.mo82039ao().mo81417a() == argument.f236140a) {
                break;
            }
        }
        return argument == null;
    }

    /* renamed from: a */
    public final C60870cx mo65343a(C90931ca caVar) {
        return caVar.mo85138c(new C90879am("OpaActionConfirmationCard#ActionCardHistoryProtoTask", 1, 8, new C102410aq(this)));
    }

    /* renamed from: b */
    public final List mo87839b() {
        return new ArrayList();
    }

    /* renamed from: c */
    public final void mo87840c(int i, int i2, C88511e eVar) {
    }

    /* renamed from: d */
    public final void mo87841d(C93602cz czVar) {
        this.f285759e = czVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v63, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v26, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0315  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x031e  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0326  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo87842e(int r12, com.google.android.apps.gsa.search.shared.p6941ui.actions.C88511e r13) {
        /*
            r11 = this;
            boolean r0 = r11.f285763i
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            com.google.android.apps.gsa.staticplugins.actionsui.modular.cz r0 = r11.f285759e
            boolean r0 = r0.mo82036A()
            r1 = 8
            if (r0 == 0) goto L_0x03c8
            r0 = 4
            if (r12 == r0) goto L_0x0015
            r0 = 7
            if (r12 != r0) goto L_0x03c8
        L_0x0015:
            r12 = 0
            r11.setVisibility(r12)
            com.google.android.apps.gsa.staticplugins.actionsui.modular.cz r0 = r11.f285759e
            com.google.android.apps.gsa.search.shared.actions.util.CardDecision r0 = r0.mo82039ao()
            boolean r0 = r0.mo81425i()
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x003f
            com.google.bb.a.la r0 = r11.m169756f()
            if (r0 == 0) goto L_0x003a
            android.widget.TextView r4 = r11.f285757c
            com.google.android.apps.gsa.staticplugins.actionsui.modular.cz r5 = r11.f285759e
            java.lang.String r0 = r5.mo88018M(r0)
            r4.setText(r0)
            goto L_0x00ee
        L_0x003a:
            r11.setVisibility(r1)
            goto L_0x00ee
        L_0x003f:
            com.google.android.apps.gsa.staticplugins.actionsui.modular.cz r0 = r11.f285759e
            com.google.android.apps.gsa.search.shared.actions.VoiceAction r4 = r0.f239226b
            com.google.android.apps.gsa.search.shared.actions.modular.ModularAction r4 = (com.google.android.apps.gsa.search.shared.actions.modular.ModularAction) r4
            com.google.android.apps.gsa.search.shared.actions.ActionExecutionState r5 = r4.f235985a
            com.google.bb.a.nl r6 = r4.mo81219Z()
            com.google.bb.a.le r5 = r5.mo81111a(r6)
            if (r5 == 0) goto L_0x0063
            int r6 = r5.f145468a
            r6 = r6 & r3
            if (r6 == 0) goto L_0x005d
            com.google.bb.a.he r5 = r5.f145471d
            if (r5 != 0) goto L_0x005e
            com.google.bb.a.he r5 = com.google.p4152bb.p4153a.C55136he.f145130j
            goto L_0x005e
        L_0x005d:
            r5 = r2
        L_0x005e:
            java.lang.String r0 = r0.mo88004a(r5)
            goto L_0x0064
        L_0x0063:
            r0 = r2
        L_0x0064:
            boolean r5 = android.text.TextUtils.isEmpty(r0)
            if (r5 == 0) goto L_0x00e3
            com.google.android.apps.gsa.staticplugins.actionsui.modular.cz r0 = r11.f285759e
            com.google.android.apps.gsa.search.shared.actions.VoiceAction r0 = r0.f239226b
            com.google.android.apps.gsa.search.shared.actions.modular.ModularAction r0 = (com.google.android.apps.gsa.search.shared.actions.modular.ModularAction) r0
            boolean r0 = r0.mo81229ai()
            if (r0 != 0) goto L_0x00ad
            com.google.android.apps.gsa.search.shared.actions.ActionExecutionState r0 = r4.f235985a
            boolean r0 = r0.mo81115e()
            if (r0 == 0) goto L_0x007f
            goto L_0x00ad
        L_0x007f:
            com.google.android.apps.gsa.staticplugins.actionsui.modular.cz r0 = r11.f285759e
            com.google.android.apps.gsa.search.shared.actions.util.CardDecision r0 = r0.mo82039ao()
            java.lang.String r0 = r0.f236249c
            boolean r5 = android.text.TextUtils.isEmpty(r0)
            if (r5 == 0) goto L_0x00e3
            com.google.android.apps.gsa.search.shared.actions.ActionExecutionState r5 = r4.f235985a
            boolean r5 = r5.mo81117f()
            if (r5 == 0) goto L_0x00e3
            com.google.bb.a.x r4 = r4.f236107m
            com.google.bb.a.x r5 = com.google.p4152bb.p4153a.C55421x.ADD_RELATIONSHIP
            if (r4 != r5) goto L_0x00e3
            com.google.android.apps.gsa.staticplugins.actionsui.modular.cz r0 = r11.f285759e
            android.content.Context r4 = r11.getContext()
            android.content.res.Resources r0 = r0.mo88011F(r4)
            r4 = 2132088410(0x7f15165a, float:1.9817103E38)
            java.lang.String r0 = r0.getString(r4)
            goto L_0x00e3
        L_0x00ad:
            com.google.android.apps.gsa.staticplugins.actionsui.modular.cz r0 = r11.f285759e
            java.lang.String r0 = r0.mo88021P()
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 == 0) goto L_0x00e3
            com.google.android.apps.gsa.staticplugins.actionsui.modular.cz r0 = r11.f285759e
            com.google.android.apps.gsa.search.shared.actions.VoiceAction r0 = r0.f239226b
            com.google.android.apps.gsa.search.shared.actions.modular.ModularAction r0 = (com.google.android.apps.gsa.search.shared.actions.modular.ModularAction) r0
            com.google.android.apps.gsa.search.shared.actions.ActionExecutionState r4 = r0.f235985a
            com.google.bb.a.nl r0 = r0.mo81219Z()
            com.google.bb.a.le r0 = r4.mo81111a(r0)
            if (r0 == 0) goto L_0x00e2
            com.google.protobuf.cq r4 = r0.f145470c
            int r4 = r4.size()
            if (r4 <= 0) goto L_0x00e2
            com.google.android.apps.gsa.staticplugins.actionsui.modular.cz r4 = r11.f285759e
            com.google.protobuf.cq r0 = r0.f145470c
            java.lang.Object r0 = r0.get(r12)
            com.google.bb.a.la r0 = (com.google.p4152bb.p4153a.C55240la) r0
            java.lang.String r0 = r4.mo88018M(r0)
            goto L_0x00e3
        L_0x00e2:
            r0 = r2
        L_0x00e3:
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 != 0) goto L_0x00ee
            android.widget.TextView r4 = r11.f285757c
            r4.setText(r0)
        L_0x00ee:
            com.google.android.apps.gsa.staticplugins.actionsui.modular.cz r0 = r11.f285759e
            com.google.android.apps.gsa.search.shared.actions.util.CardDecision r0 = r0.mo82039ao()
            boolean r0 = r0.mo81425i()
            if (r0 == 0) goto L_0x0100
            android.widget.TextView r0 = r11.f285758d
            r0.setVisibility(r1)
            goto L_0x0132
        L_0x0100:
            boolean r0 = r11.m169757g()
            if (r0 == 0) goto L_0x011b
            com.google.android.apps.gsa.staticplugins.actionsui.modular.cz r0 = r11.f285759e
            com.google.android.apps.gsa.search.shared.actions.util.CardDecision r0 = r0.mo82039ao()
            com.google.bb.a.lx r0 = r0.f236263q
            if (r0 != 0) goto L_0x0112
            r0 = r2
            goto L_0x0121
        L_0x0112:
            com.google.android.apps.gsa.staticplugins.actionsui.modular.cz r4 = r11.f285759e
            com.google.protobuf.cq r0 = r0.f145552g
            java.lang.CharSequence r0 = r4.mo88016K(r0)
            goto L_0x0121
        L_0x011b:
            com.google.android.apps.gsa.staticplugins.actionsui.modular.cz r0 = r11.f285759e
            java.lang.CharSequence r0 = r0.mo88015J()
        L_0x0121:
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 != 0) goto L_0x012d
            android.widget.TextView r4 = r11.f285758d
            r4.setText(r0)
            goto L_0x0132
        L_0x012d:
            android.widget.TextView r0 = r11.f285758d
            r0.setVisibility(r1)
        L_0x0132:
            boolean r0 = r11.f285760f
            if (r0 == 0) goto L_0x0199
            android.widget.TextView r0 = r11.f285762h
            if (r0 == 0) goto L_0x0199
            com.google.android.apps.gsa.staticplugins.actionsui.modular.cz r0 = r11.f285759e
            com.google.android.apps.gsa.search.shared.actions.VoiceAction r0 = r0.f239226b
            com.google.android.apps.gsa.search.shared.actions.modular.ModularAction r0 = (com.google.android.apps.gsa.search.shared.actions.modular.ModularAction) r0
            com.google.android.apps.gsa.search.shared.actions.ActionExecutionState r0 = r0.f235985a
            boolean r0 = r0.mo81115e()
            if (r0 == 0) goto L_0x0149
            goto L_0x0199
        L_0x0149:
            com.google.android.apps.gsa.staticplugins.actionsui.modular.cz r0 = r11.f285759e
            com.google.android.apps.gsa.search.shared.actions.VoiceAction r0 = r0.f239226b
            com.google.android.apps.gsa.search.shared.actions.modular.ModularAction r0 = (com.google.android.apps.gsa.search.shared.actions.modular.ModularAction) r0
            com.google.bb.a.x r4 = r0.f236107m
            com.google.bb.a.x r5 = com.google.p4152bb.p4153a.C55421x.SMS
            if (r4 == r5) goto L_0x0165
            com.google.bb.a.x r5 = com.google.p4152bb.p4153a.C55421x.EMAIL
            if (r4 == r5) goto L_0x0165
            com.google.bb.a.x r5 = com.google.p4152bb.p4153a.C55421x.GENERIC_SEND_MESSAGE
            if (r4 == r5) goto L_0x0165
            com.google.bb.a.x r5 = com.google.p4152bb.p4153a.C55421x.GENERIC_CONTACT
            if (r4 == r5) goto L_0x0165
            com.google.bb.a.x r5 = com.google.p4152bb.p4153a.C55421x.CHAT_MESSAGE
            if (r4 != r5) goto L_0x0188
        L_0x0165:
            java.util.List r0 = r0.f236100f
            java.util.Iterator r0 = r0.iterator()
        L_0x016b:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0188
            java.lang.Object r4 = r0.next()
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.Argument r4 = (com.google.android.apps.gsa.search.shared.actions.modular.arguments.Argument) r4
            com.google.bb.a.ab r5 = r4.f236141b
            com.google.bb.a.ab r6 = com.google.p4152bb.p4153a.C54944ab.MESSAGE
            if (r5 != r6) goto L_0x016b
            boolean r5 = r4 instanceof com.google.android.apps.gsa.search.shared.actions.modular.arguments.SingleValueArgument
            if (r5 == 0) goto L_0x016b
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.SingleValueArgument r4 = (com.google.android.apps.gsa.search.shared.actions.modular.arguments.SingleValueArgument) r4
            java.lang.Object r0 = r4.f236203n
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
        L_0x0188:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0194
            android.widget.TextView r0 = r11.f285762h
            r0.setText(r2)
            goto L_0x0199
        L_0x0194:
            android.widget.TextView r0 = r11.f285762h
            r0.setVisibility(r1)
        L_0x0199:
            boolean r0 = r11.f285760f
            if (r0 == 0) goto L_0x01d8
            android.widget.ImageView r0 = r11.f285761g
            if (r0 == 0) goto L_0x01d8
            com.google.android.apps.gsa.staticplugins.actionsui.modular.cz r0 = r11.f285759e
            com.google.android.apps.gsa.search.shared.actions.VoiceAction r0 = r0.f239226b
            com.google.android.apps.gsa.search.shared.actions.modular.ModularAction r0 = (com.google.android.apps.gsa.search.shared.actions.modular.ModularAction) r0
            com.google.android.apps.gsa.search.shared.actions.ActionExecutionState r0 = r0.f235985a
            boolean r0 = r0.mo81115e()
            if (r0 == 0) goto L_0x01bd
            android.widget.ImageView r0 = r11.f285761g
            r0.setVisibility(r12)
            android.widget.ImageView r0 = r11.f285761g
            r2 = 2131234640(0x7f080f50, float:1.8085451E38)
            r0.setImageResource(r2)
            goto L_0x01d8
        L_0x01bd:
            com.google.android.apps.gsa.staticplugins.actionsui.modular.cz r0 = r11.f285759e
            com.google.android.apps.gsa.search.shared.actions.VoiceAction r0 = r0.f239226b
            com.google.android.apps.gsa.search.shared.actions.modular.ModularAction r0 = (com.google.android.apps.gsa.search.shared.actions.modular.ModularAction) r0
            com.google.android.apps.gsa.search.shared.actions.ActionExecutionState r0 = r0.f235985a
            boolean r0 = r0.mo81117f()
            if (r0 == 0) goto L_0x01d8
            android.widget.ImageView r0 = r11.f285761g
            r0.setVisibility(r12)
            android.widget.ImageView r0 = r11.f285761g
            r2 = 2131234649(0x7f080f59, float:1.808547E38)
            r0.setImageResource(r2)
        L_0x01d8:
            com.google.android.apps.gsa.staticplugins.actionsui.modular.cz r0 = r11.f285759e
            com.google.android.apps.gsa.search.shared.actions.util.CardDecision r0 = r0.mo82039ao()
            boolean r0 = r0.mo81425i()
            if (r0 == 0) goto L_0x01f0
            com.google.android.apps.gsa.staticplugins.actionsui.modular.cz r0 = r11.f285759e
            boolean r0 = r0.mo88039ah()
            if (r0 != 0) goto L_0x01f0
            r11.setClickable(r12)
            goto L_0x01f3
        L_0x01f0:
            r11.setClickable(r3)
        L_0x01f3:
            com.google.android.apps.gsa.staticplugins.actionsui.modular.cz r0 = r11.f285759e
            com.google.android.apps.gsa.search.shared.actions.util.CardDecision r0 = r0.mo82039ao()
            boolean r0 = r0.mo81425i()
            if (r0 == 0) goto L_0x0248
            com.google.bb.a.la r0 = r11.m169756f()
            if (r0 == 0) goto L_0x0241
            int r2 = r0.f145451a
            r4 = r2 & 4
            if (r4 == 0) goto L_0x0222
            int r0 = r0.f145454d
            int r0 = com.google.p4152bb.p4153a.C55419v.m87685a(r0)
            if (r0 != 0) goto L_0x0214
            r0 = 1
        L_0x0214:
            com.google.android.apps.gsa.now.shared.ui.WebImageView r1 = r11.f285756b
            android.content.Context r2 = r11.getContext()
            android.graphics.drawable.Drawable r13 = r13.mo82073c(r0, r2)
            r1.setImageDrawable(r13)
            goto L_0x0233
        L_0x0222:
            r13 = r2 & 8
            if (r13 == 0) goto L_0x023a
            com.google.android.apps.gsa.now.shared.ui.WebImageView r13 = r11.f285756b
            java.lang.String r0 = r0.f145455e
            com.google.android.apps.gsa.staticplugins.actionsui.modular.cz r1 = r11.f285759e
            com.google.android.apps.gsa.shared.y.au r1 = r1.mo82040ap()
            r13.mo76738i(r0, r1)
        L_0x0233:
            com.google.android.apps.gsa.now.shared.ui.WebImageView r13 = r11.f285756b
            r13.setVisibility(r12)
            goto L_0x037e
        L_0x023a:
            com.google.android.apps.gsa.now.shared.ui.WebImageView r12 = r11.f285756b
            r12.setVisibility(r1)
            goto L_0x037e
        L_0x0241:
            com.google.android.apps.gsa.now.shared.ui.WebImageView r12 = r11.f285756b
            r12.setVisibility(r1)
            goto L_0x037e
        L_0x0248:
            com.google.android.apps.gsa.staticplugins.actionsui.modular.cz r0 = r11.f285759e
            com.google.android.apps.gsa.search.shared.actions.VoiceAction r2 = r0.f239226b
            com.google.android.apps.gsa.search.shared.actions.modular.ModularAction r2 = (com.google.android.apps.gsa.search.shared.actions.modular.ModularAction) r2
            com.google.bb.a.pn r0 = r0.mo88014I()
            com.google.android.apps.gsa.search.shared.actions.ActionExecutionState r4 = r2.f235985a
            com.google.bb.a.nl r5 = r2.mo81219Z()
            com.google.bb.a.le r4 = r4.mo81111a(r5)
            if (r4 == 0) goto L_0x02c7
            int r5 = r4.f145468a
            r5 = r5 & 2
            if (r5 == 0) goto L_0x02c7
            int r4 = r4.f145473f
            int r4 = com.google.p4152bb.p4153a.C55419v.m87685a(r4)
            if (r4 != 0) goto L_0x026d
            r4 = 1
        L_0x026d:
            r5 = 11
            if (r4 != r5) goto L_0x02b5
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.PersonArgument r13 = r2.mo81212S()
            if (r13 == 0) goto L_0x02b1
            boolean r2 = r13.mo81263C()
            if (r2 == 0) goto L_0x02b1
            java.lang.Object r2 = r13.f236203n
            com.google.android.apps.gsa.search.shared.contact.PersonDisambiguation r2 = (com.google.android.apps.gsa.search.shared.contact.PersonDisambiguation) r2
            r2.getClass()
            boolean r2 = r2.mo81543l()
            if (r2 == 0) goto L_0x02b1
            com.google.android.apps.gsa.staticplugins.actionsui.c r2 = new com.google.android.apps.gsa.staticplugins.actionsui.c
            android.content.res.Resources r5 = r11.getResources()
            com.google.android.apps.gsa.now.shared.ui.WebImageView r6 = r11.f285756b
            r7 = 1
            r8 = 1
            r9 = 1
            r10 = 1
            r4 = r2
            r4.<init>(r5, r6, r7, r8, r9, r10)
            com.google.android.apps.gsa.search.shared.contact.Person[] r4 = new com.google.android.apps.gsa.search.shared.contact.Person[r3]
            java.lang.Object r13 = r13.f236203n
            com.google.android.apps.gsa.search.shared.contact.PersonDisambiguation r13 = (com.google.android.apps.gsa.search.shared.contact.PersonDisambiguation) r13
            r13.getClass()
            android.os.Parcelable r13 = r13.f236364c
            r13.getClass()
            com.google.android.apps.gsa.search.shared.contact.Person r13 = (com.google.android.apps.gsa.search.shared.contact.Person) r13
            r4[r12] = r13
            r2.execute(r4)
            r13 = 1
            goto L_0x02b2
        L_0x02b1:
            r13 = 0
        L_0x02b2:
            r2 = r13
            r13 = 0
            goto L_0x0310
        L_0x02b5:
            com.google.android.apps.gsa.now.shared.ui.WebImageView r2 = r11.f285756b
            android.content.Context r5 = r11.getContext()
            android.graphics.drawable.Drawable r13 = r13.mo82073c(r4, r5)
            r2.setImageDrawable(r13)
            boolean r13 = com.google.android.apps.gsa.search.shared.p6941ui.actions.C88511e.m142916d(r4)
            goto L_0x030c
        L_0x02c7:
            com.google.android.apps.gsa.search.shared.actions.ActionExecutionState r2 = r2.f235985a
            boolean r2 = r2.mo81115e()
            if (r2 == 0) goto L_0x02f3
            com.google.android.apps.gsa.staticplugins.actionsui.modular.cz r2 = r11.f285759e
            android.content.Context r4 = r11.getContext()
            android.graphics.drawable.Drawable r13 = r2.mo88012G(r4, r13, r0)
            if (r13 != 0) goto L_0x02e4
            com.google.android.apps.gsa.now.shared.ui.WebImageView r13 = r11.f285756b
            r2 = 2131232499(0x7f0806f3, float:1.8081109E38)
            r13.setImageResource(r2)
            goto L_0x030b
        L_0x02e4:
            com.google.android.apps.gsa.now.shared.ui.WebImageView r2 = r11.f285756b
            r2.setImageDrawable(r13)
            if (r0 == 0) goto L_0x030b
            com.google.android.apps.gsa.now.shared.ui.WebImageView r13 = r11.f285756b
            java.lang.String r2 = r0.f145869b
            r13.setContentDescription(r2)
            goto L_0x030b
        L_0x02f3:
            if (r0 == 0) goto L_0x030e
            com.google.android.apps.gsa.now.shared.ui.WebImageView r2 = r11.f285756b
            com.google.android.apps.gsa.staticplugins.actionsui.modular.cz r4 = r11.f285759e
            android.content.Context r5 = r11.getContext()
            android.graphics.drawable.Drawable r13 = r4.mo88012G(r5, r13, r0)
            r2.setImageDrawable(r13)
            com.google.android.apps.gsa.now.shared.ui.WebImageView r13 = r11.f285756b
            java.lang.String r2 = r0.f145869b
            r13.setContentDescription(r2)
        L_0x030b:
            r13 = 1
        L_0x030c:
            r2 = 1
            goto L_0x0310
        L_0x030e:
            r13 = 0
            r2 = 0
        L_0x0310:
            com.google.android.apps.gsa.now.shared.ui.WebImageView r4 = r11.f285756b
            if (r3 == r2) goto L_0x0315
            goto L_0x0316
        L_0x0315:
            r1 = 0
        L_0x0316:
            r4.setVisibility(r1)
            r11.setClickable(r13)
            if (r2 != 0) goto L_0x0326
            int r13 = r11.getPaddingRight()
            r11.setPadding(r13, r12, r13, r12)
            goto L_0x037e
        L_0x0326:
            if (r0 == 0) goto L_0x037e
            int r13 = r0.f145872e
            int r13 = com.google.p4152bb.p4153a.C55419v.m87685a(r13)
            if (r13 != 0) goto L_0x0331
            goto L_0x035c
        L_0x0331:
            r0 = 13
            if (r13 != r0) goto L_0x035c
            android.content.res.Resources r12 = r11.getResources()
            r13 = 2131169146(0x7f070f7a, float:1.7952614E38)
            int r12 = r12.getDimensionPixelSize(r13)
            android.content.res.Resources r13 = r11.getResources()
            r0 = 2131169147(0x7f070f7b, float:1.7952616E38)
            int r13 = r13.getDimensionPixelSize(r0)
            android.content.res.Resources r0 = r11.getResources()
            r1 = 2131169145(0x7f070f79, float:1.7952612E38)
            int r0 = r0.getDimensionPixelSize(r1)
            com.google.android.apps.gsa.now.shared.ui.WebImageView r1 = r11.f285756b
            r1.setPadding(r12, r13, r12, r0)
            goto L_0x037e
        L_0x035c:
            com.google.android.apps.gsa.staticplugins.actionsui.modular.cz r13 = r11.f285759e
            com.google.android.apps.gsa.search.shared.actions.VoiceAction r13 = r13.f239226b
            com.google.android.apps.gsa.search.shared.actions.modular.ModularAction r13 = (com.google.android.apps.gsa.search.shared.actions.modular.ModularAction) r13
            com.google.bb.a.x r13 = r13.f236107m
            com.google.bb.a.x r0 = com.google.p4152bb.p4153a.C55421x.ADD_REMINDER
            if (r13 != r0) goto L_0x0379
            android.content.res.Resources r12 = r11.getResources()
            r13 = 2131169144(0x7f070f78, float:1.795261E38)
            int r12 = r12.getDimensionPixelSize(r13)
            com.google.android.apps.gsa.now.shared.ui.WebImageView r13 = r11.f285756b
            r13.setPadding(r12, r12, r12, r12)
            goto L_0x037e
        L_0x0379:
            com.google.android.apps.gsa.now.shared.ui.WebImageView r13 = r11.f285756b
            r13.setPadding(r12, r12, r12, r12)
        L_0x037e:
            boolean r12 = r11.m169757g()
            if (r12 == 0) goto L_0x0395
            com.google.android.apps.gsa.staticplugins.actionsui.modular.cz r12 = r11.f285759e
            com.google.android.apps.gsa.search.shared.actions.util.CardDecision r12 = r12.mo82039ao()
            com.google.bb.a.lx r12 = r12.f236263q
            r12.getClass()
            int r12 = r12.f145550e
            com.google.android.apps.gsa.shared.logger.p7065j.C89941l.m146512c(r11, r12)
            goto L_0x03af
        L_0x0395:
            r12 = 8594(0x2192, float:1.2043E-41)
            com.google.android.apps.gsa.shared.logger.p7065j.C89941l.m146512c(r11, r12)
            com.google.android.apps.gsa.now.shared.ui.WebImageView r12 = r11.f285756b
            r13 = 8349(0x209d, float:1.17E-41)
            com.google.android.apps.gsa.shared.logger.p7065j.C89941l.m146512c(r12, r13)
            android.widget.TextView r12 = r11.f285757c
            r13 = 8350(0x209e, float:1.1701E-41)
            com.google.android.apps.gsa.shared.logger.p7065j.C89941l.m146512c(r12, r13)
            android.widget.TextView r12 = r11.f285758d
            r13 = 8351(0x209f, float:1.1702E-41)
            com.google.android.apps.gsa.shared.logger.p7065j.C89941l.m146512c(r12, r13)
        L_0x03af:
            boolean r12 = r11.isClickable()
            if (r12 == 0) goto L_0x03c5
            android.widget.LinearLayout r12 = r11.f285755a
            android.content.res.Resources r13 = r11.getResources()
            r0 = 2131231549(0x7f08033d, float:1.8079182E38)
            android.graphics.drawable.Drawable r13 = r13.getDrawable(r0)
            r12.setBackground(r13)
        L_0x03c5:
            r11.f285763i = r3
            return
        L_0x03c8:
            r11.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.immersiveactions.OpaActionConfirmationCard.mo87842e(int, com.google.android.apps.gsa.search.shared.ui.actions.e):void");
    }

    /* renamed from: iM */
    public final Pair mo87843iM(int i, int i2) {
        return null;
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.opa_action_confirmation_body);
        linearLayout.getClass();
        this.f285755a = linearLayout;
        WebImageView webImageView = (WebImageView) findViewById(R.id.opa_action_confirmation_card_image_view);
        webImageView.getClass();
        this.f285756b = webImageView;
        TextView textView = (TextView) findViewById(R.id.opa_action_confirmation_card_primary_text);
        textView.getClass();
        this.f285757c = textView;
        TextView textView2 = (TextView) findViewById(R.id.opa_action_confirmation_card_secondary_text);
        textView2.getClass();
        this.f285758d = textView2;
        this.f285762h = (TextView) findViewById(R.id.opa_action_confirmation_card_body_text);
        this.f285761g = (ImageView) findViewById(R.id.cancel_image);
    }

    public OpaActionConfirmationCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public OpaActionConfirmationCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
