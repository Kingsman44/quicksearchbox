package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.Html;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.shared.actions.C87422j;
import com.google.android.apps.gsa.search.shared.actions.C87423k;
import com.google.android.apps.gsa.search.shared.actions.C87478u;
import com.google.android.apps.gsa.search.shared.actions.VoiceAction;
import com.google.android.apps.gsa.search.shared.actions.modular.C87463b;
import com.google.android.apps.gsa.search.shared.actions.modular.ModularAction;
import com.google.android.apps.gsa.search.shared.actions.modular.ModularActionMatchingProviderInfo;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.AmbiguousArgument;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.Argument;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.C87448l;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.C87449m;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.EntityArgument;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.PersonArgument;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.ProviderArgument;
import com.google.android.apps.gsa.search.shared.actions.modular.p6922a.C87429c;
import com.google.android.apps.gsa.search.shared.actions.util.C87487i;
import com.google.android.apps.gsa.search.shared.actions.util.CardDecision;
import com.google.android.apps.gsa.search.shared.contact.C87516d;
import com.google.android.apps.gsa.search.shared.contact.Disambiguation;
import com.google.android.apps.gsa.search.shared.contact.Person;
import com.google.android.apps.gsa.search.shared.contact.PersonDisambiguation;
import com.google.android.apps.gsa.search.shared.contact.TwoStepDisambiguation;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88507a;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88508b;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88509c;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88511e;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88512f;
import com.google.android.apps.gsa.shared.logger.p7065j.C89931b;
import com.google.android.apps.gsa.shared.logger.p7065j.C89932c;
import com.google.android.apps.gsa.shared.p7129r.C90465g;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.apps.gsa.staticplugins.actionsui.C93482bj;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.p4152bb.p4153a.C55136he;
import com.google.p4152bb.p4153a.C55240la;
import com.google.p4152bb.p4153a.C55244le;
import com.google.p4152bb.p4153a.C55253ln;
import com.google.p4152bb.p4153a.C55263lx;
import com.google.p4152bb.p4153a.C55304nk;
import com.google.p4152bb.p4153a.C55361pn;
import com.google.p4152bb.p4153a.C55419v;
import com.google.p4152bb.p4153a.C55421x;
import dagger.C68214a;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.cz */
/* compiled from: PG */
public final class C93602cz extends C88507a implements C93595cs {

    /* renamed from: d */
    public final C87449m f261317d;

    /* renamed from: e */
    public final C68214a f261318e;

    /* renamed from: f */
    public final C90465g f261319f;

    /* renamed from: g */
    public final C91142g f261320g;

    /* renamed from: h */
    public C93536an f261321h;

    /* renamed from: i */
    private final C93635ee f261322i;

    /* renamed from: j */
    private final C58833ax f261323j;

    /* renamed from: k */
    private boolean f261324k;

    /* renamed from: l */
    private int f261325l = 0;

    /* renamed from: m */
    private boolean f261326m;

    /* renamed from: n */
    private final C93600cx f261327n = new C93600cx(this);

    public C93602cz(C88512f fVar, C87449m mVar, C68214a aVar, C90465g gVar, int i, C91142g gVar2, C58833ax axVar, C58833ax axVar2) {
        super(fVar, "ModularActionController", i, axVar);
        this.f261317d = mVar;
        this.f261318e = aVar;
        this.f261319f = gVar;
        this.f261322i = new C93635ee(this);
        this.f261320g = gVar2;
        this.f261323j = axVar2;
    }

    /* renamed from: an */
    private final void m154396an(C87423k kVar) {
        this.f239225a.mo82106n(2, 3, kVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x008a A[ADDED_TO_REGION] */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo82036A() {
        /*
            r8 = this;
            int r0 = r8.mo88009D()
            r1 = 1
            r2 = 0
            r3 = 4
            if (r0 != r3) goto L_0x0027
            com.google.android.apps.gsa.search.shared.actions.VoiceAction r0 = r8.f239226b
            com.google.android.apps.gsa.search.shared.actions.modular.ModularAction r0 = (com.google.android.apps.gsa.search.shared.actions.modular.ModularAction) r0
            com.google.android.apps.gsa.search.shared.actions.ActionExecutionState r0 = r0.f235985a
            boolean r0 = r0.mo81119h()
            if (r0 != 0) goto L_0x0026
            com.google.android.apps.gsa.search.shared.actions.VoiceAction r0 = r8.f239226b
            com.google.android.apps.gsa.search.shared.actions.modular.ModularAction r0 = (com.google.android.apps.gsa.search.shared.actions.modular.ModularAction) r0
            com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo r0 = r0.f235986b
            com.google.android.apps.gsa.search.shared.actions.modular.ModularActionMatchingProviderInfo r0 = (com.google.android.apps.gsa.search.shared.actions.modular.ModularActionMatchingProviderInfo) r0
            boolean r0 = r0.mo81435e()
            if (r0 != 0) goto L_0x0026
            r0 = 4
            r4 = 1
            goto L_0x0028
        L_0x0026:
            r0 = 4
        L_0x0027:
            r4 = 0
        L_0x0028:
            com.google.android.apps.gsa.shared.util.v.g r5 = r8.f261320g
            com.google.android.apps.gsa.shared.m.d r6 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247760nI
            boolean r5 = r5.mo85405j(r6)
            if (r5 == 0) goto L_0x0054
            if (r0 != r3) goto L_0x0054
            com.google.android.apps.gsa.search.shared.actions.VoiceAction r0 = r8.f239226b
            com.google.android.apps.gsa.search.shared.actions.modular.ModularAction r0 = (com.google.android.apps.gsa.search.shared.actions.modular.ModularAction) r0
            com.google.android.apps.gsa.search.shared.actions.ActionExecutionState r0 = r0.f235985a
            boolean r0 = r0.mo81119h()
            if (r0 != 0) goto L_0x0051
            com.google.android.apps.gsa.search.shared.actions.VoiceAction r0 = r8.f239226b
            com.google.android.apps.gsa.search.shared.actions.modular.ModularAction r0 = (com.google.android.apps.gsa.search.shared.actions.modular.ModularAction) r0
            com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo r0 = r0.f235986b
            com.google.android.apps.gsa.search.shared.actions.modular.ModularActionMatchingProviderInfo r0 = (com.google.android.apps.gsa.search.shared.actions.modular.ModularActionMatchingProviderInfo) r0
            boolean r0 = r0.mo81435e()
            if (r0 == 0) goto L_0x004f
            goto L_0x0051
        L_0x004f:
            r0 = 4
            goto L_0x0054
        L_0x0051:
            r0 = 4
            r5 = 1
            goto L_0x0055
        L_0x0054:
            r5 = 0
        L_0x0055:
            r6 = 7
            if (r0 != r6) goto L_0x0066
            com.google.android.apps.gsa.search.shared.actions.util.CardDecision r0 = r8.mo82039ao()
            boolean r0 = r0.mo81425i()
            if (r0 == 0) goto L_0x0065
            r0 = 7
            r6 = 1
            goto L_0x0067
        L_0x0065:
            r0 = 7
        L_0x0066:
            r6 = 0
        L_0x0067:
            r7 = 5
            if (r0 != r7) goto L_0x0076
            com.google.android.apps.gsa.search.shared.actions.VoiceAction r7 = r8.f239226b
            com.google.android.apps.gsa.search.shared.actions.modular.ModularAction r7 = (com.google.android.apps.gsa.search.shared.actions.modular.ModularAction) r7
            boolean r7 = r7.mo81077p()
            if (r7 != 0) goto L_0x0076
            r7 = 1
            goto L_0x0077
        L_0x0076:
            r7 = 0
        L_0x0077:
            if (r0 == r3) goto L_0x0083
            com.google.android.apps.gsa.search.shared.actions.util.CardDecision r0 = r8.mo82039ao()
            boolean r0 = r0.f236254h
            if (r0 == 0) goto L_0x0083
            r0 = 1
            goto L_0x0084
        L_0x0083:
            r0 = 0
        L_0x0084:
            boolean r3 = r8.mo82061x()
            if (r3 == 0) goto L_0x0095
            if (r4 != 0) goto L_0x0092
            if (r6 != 0) goto L_0x0092
            if (r7 != 0) goto L_0x0092
            if (r5 == 0) goto L_0x0095
        L_0x0092:
            if (r0 != 0) goto L_0x0095
            return r1
        L_0x0095:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.actionsui.modular.C93602cz.mo82036A():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0048, code lost:
        if (r4.f169962ag.mo58857o(r6.f169971d) != false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004a, code lost:
        r1 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0065, code lost:
        if (r2 == 3) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00cb, code lost:
        if (r0.f236147h != false) goto L_0x00e5;
     */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo88009D() {
        /*
            r7 = this;
            boolean r0 = r7.f261324k
            r1 = 1
            if (r0 == 0) goto L_0x0008
            r7.mo88035ad(r1)
        L_0x0008:
            com.google.android.apps.gsa.search.shared.actions.VoiceAction r0 = r7.f239226b
            com.google.android.apps.gsa.search.shared.actions.modular.ModularAction r0 = (com.google.android.apps.gsa.search.shared.actions.modular.ModularAction) r0
            java.util.List r2 = r0.mo81223ac()
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x001a
            r1 = 8
            goto L_0x00e5
        L_0x001a:
            com.google.android.apps.gsa.search.shared.actions.VoiceAction r2 = r7.f239226b
            com.google.android.apps.gsa.search.shared.actions.modular.ModularAction r2 = (com.google.android.apps.gsa.search.shared.actions.modular.ModularAction) r2
            com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo r3 = r2.f235986b
            com.google.android.apps.gsa.search.shared.actions.modular.ModularActionMatchingProviderInfo r3 = (com.google.android.apps.gsa.search.shared.actions.modular.ModularActionMatchingProviderInfo) r3
            com.google.bb.a.la r4 = r3.f236115a
            boolean r3 = r3.mo81435e()
            r5 = 3
            if (r3 != 0) goto L_0x0068
            com.google.android.apps.gsa.search.shared.actions.ActionExecutionState r3 = r2.f235985a
            boolean r3 = r3.mo81119h()
            if (r3 == 0) goto L_0x0034
            goto L_0x0068
        L_0x0034:
            r3 = 5
            if (r4 == 0) goto L_0x004d
            com.google.protobuf.bt r6 = com.google.p4152bb.p4153a.C55237ky.f145439d
            com.google.protobuf.bt r6 = com.google.protobuf.C62942bv.checkIsLite(r6)
            r4.mo58887l(r6)
            com.google.protobuf.bf r4 = r4.f169962ag
            com.google.protobuf.bs r6 = r6.f169971d
            boolean r4 = r4.mo58857o(r6)
            if (r4 == 0) goto L_0x004d
        L_0x004a:
            r1 = 5
            goto L_0x00e5
        L_0x004d:
            com.google.android.apps.gsa.search.shared.actions.ActionExecutionState r4 = r2.f235985a
            boolean r4 = r4.f236005b
            if (r4 == 0) goto L_0x0068
            com.google.bb.a.im r4 = r2.mo81215V()
            if (r4 == 0) goto L_0x0068
            com.google.bb.a.im r2 = r2.mo81215V()
            int r2 = r2.f145244a
            int r2 = com.google.p4152bb.p4153a.C55170il.m87616a(r2)
            if (r2 == 0) goto L_0x0068
            if (r2 != r5) goto L_0x0068
            goto L_0x004a
        L_0x0068:
            boolean r2 = r7.mo88043al()
            if (r2 == 0) goto L_0x0071
            r1 = 7
            goto L_0x00e5
        L_0x0071:
            int r2 = r7.mo88010E()
            if (r2 != r5) goto L_0x0094
            com.google.android.apps.gsa.search.shared.actions.VoiceAction r2 = r7.f239226b
            com.google.android.apps.gsa.search.shared.actions.modular.ModularAction r2 = (com.google.android.apps.gsa.search.shared.actions.modular.ModularAction) r2
            boolean r2 = r2.mo81229ai()
            r3 = 4
            if (r2 == 0) goto L_0x0092
            boolean r2 = r7.mo82061x()
            if (r2 == 0) goto L_0x0094
            com.google.android.apps.gsa.search.shared.actions.VoiceAction r2 = r7.f239226b
            com.google.android.apps.gsa.search.shared.actions.modular.ModularAction r2 = (com.google.android.apps.gsa.search.shared.actions.modular.ModularAction) r2
            boolean r2 = r2.mo81133M()
            if (r2 == 0) goto L_0x0094
        L_0x0092:
            r1 = 4
            goto L_0x00e5
        L_0x0094:
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.Argument r2 = r7.mo88013H()
            if (r2 == 0) goto L_0x00d2
            boolean r0 = r7.mo82061x()
            r2 = 2
            if (r0 == 0) goto L_0x00d0
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.Argument r0 = r7.mo88013H()
            boolean r3 = r0 instanceof com.google.android.apps.gsa.search.shared.actions.modular.arguments.PersonArgument
            r4 = 9
            r5 = 0
            if (r3 == 0) goto L_0x00c1
            r3 = r0
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.PersonArgument r3 = (com.google.android.apps.gsa.search.shared.actions.modular.arguments.PersonArgument) r3
            boolean r6 = r3.mo81317h()
            if (r6 == 0) goto L_0x00c1
            java.lang.Object r3 = r3.f236203n
            com.google.android.apps.gsa.search.shared.contact.PersonDisambiguation r3 = (com.google.android.apps.gsa.search.shared.contact.PersonDisambiguation) r3
            boolean r3 = r3.mo81544m()
            if (r3 == 0) goto L_0x00c1
            r5 = 9
        L_0x00c1:
            if (r5 == r4) goto L_0x00ce
            boolean r3 = r7.mo88040ai()
            if (r3 != 0) goto L_0x00d0
            boolean r0 = r0.f236147h
            if (r0 == 0) goto L_0x00d0
            goto L_0x00e5
        L_0x00ce:
            r1 = r5
            goto L_0x00e5
        L_0x00d0:
            r1 = 2
            goto L_0x00e5
        L_0x00d2:
            boolean r2 = r7.mo88042ak()
            if (r2 == 0) goto L_0x00da
            r1 = 3
            goto L_0x00e5
        L_0x00da:
            java.util.List r0 = r0.mo81222ab()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00e5
            r1 = 6
        L_0x00e5:
            r7.f261325l = r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.actionsui.modular.C93602cz.mo88009D():int");
    }

    /* renamed from: E */
    public final int mo88010E() {
        ModularAction modularAction = (ModularAction) this.f239226b;
        CardDecision ao = mo82039ao();
        C88512f fVar = this.f239225a;
        if (!modularAction.mo81077p()) {
            return 3;
        }
        if (TextUtils.isEmpty(ao.f236249c)) {
            return 0;
        }
        if (((ao.f236252f || fVar.mo82080G()) && (modularAction.f235985a.mo81121i() || modularAction.f235985a.mo81118g() || !modularAction.f235985a.mo81122j() || ao.f236259m == 1 || ao.f236255i)) || ao.mo81422g()) {
            return 1;
        }
        if (ao.mo81423h()) {
            Argument R = modularAction.mo81211R(ao.mo81417a());
            if (R == null) {
                modularAction.mo81210Q().mo81401e(ao.mo81417a());
                return 1;
            } else if (R.mo81260hB() || (this.f239225a.mo82090Q() && !R.mo81263C())) {
                return 2;
            }
        }
        return 0;
    }

    /* renamed from: G */
    public final Drawable mo88012G(Context context, C88511e eVar, C55361pn pnVar) {
        if (pnVar == null) {
            return null;
        }
        int a = C55419v.m87685a(pnVar.f145872e);
        if (a != 0 && a == 13) {
            return context.getResources().getDrawable(R.drawable.ic_sms_black_blue);
        }
        if (((ModularAction) this.f239226b).f236107m == C55421x.ADD_REMINDER) {
            Drawable drawable = context.getResources().getDrawable(R.drawable.quantum_ic_reminders_alt_white_36);
            if (drawable != null) {
                drawable.setColorFilter(context.getResources().getColor(context.getResources().getIdentifier("immersive_actions_sms_reminders_header", "color", context.getPackageName())), PorterDuff.Mode.MULTIPLY);
            }
            return drawable;
        } else if (((ModularAction) this.f239226b).f236107m != C55421x.ADD_RELATIONSHIP) {
            return eVar.mo82072a(pnVar, context);
        } else {
            Drawable drawable2 = context.getResources().getDrawable(R.drawable.quantum_ic_group_white_32);
            if (drawable2 != null) {
                drawable2.setColorFilter(context.getResources().getColor(context.getResources().getIdentifier("immersive_actions_relationship_header", "color", context.getPackageName())), PorterDuff.Mode.MULTIPLY);
            }
            return drawable2;
        }
    }

    /* renamed from: H */
    public final Argument mo88013H() {
        ModularAction modularAction = (ModularAction) this.f239226b;
        if (mo82061x() && mo88042ak()) {
            return modularAction.f236102h;
        }
        CardDecision ao = mo82039ao();
        if (!ao.mo81422g() && ao.mo81423h()) {
            Argument R = modularAction.mo81211R(ao.mo81417a());
            if (R == null) {
                modularAction.mo81210Q().mo81401e(ao.mo81417a());
            } else if (R.mo81260hB()) {
                return R;
            }
        }
        for (Argument argument : modularAction.f236100f) {
            if (argument.mo81260hB()) {
                return argument;
            }
        }
        return null;
    }

    /* renamed from: I */
    public final C55361pn mo88014I() {
        return ((ModularActionMatchingProviderInfo) ((ModularAction) this.f239226b).f235986b).mo81433d();
    }

    /* renamed from: J */
    public final CharSequence mo88015J() {
        ModularAction modularAction = (ModularAction) this.f239226b;
        C55244le a = modularAction.f235985a.mo81111a(modularAction.mo81219Z());
        if (a != null) {
            return mo88016K(a.f145472e);
        }
        return null;
    }

    /* renamed from: K */
    public final CharSequence mo88016K(List list) {
        C87429c cVar;
        C87449m mVar = this.f261317d;
        C87448l lVar = (C87448l) this.f239226b;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                cVar = C87429c.f236122a;
                break;
            }
            cVar = mVar.mo81378a((C55136he) it.next(), lVar, true);
            if (!cVar.equals(C87429c.f236122a)) {
                break;
            }
        }
        if (cVar.mo81247f()) {
            return Html.fromHtml(cVar.mo81245d());
        }
        return null;
    }

    /* renamed from: L */
    public final String mo88017L() {
        C55240la laVar = ((ModularActionMatchingProviderInfo) ((ModularAction) this.f239226b).f235986b).f236115a;
        if (laVar != null) {
            return laVar.f145455e;
        }
        return null;
    }

    /* renamed from: M */
    public final String mo88018M(C55240la laVar) {
        ModularAction modularAction = (ModularAction) this.f239226b;
        if ((laVar.f145451a & 2) != 0) {
            C87449m mVar = this.f261317d;
            C55136he heVar = laVar.f145453c;
            if (heVar == null) {
                heVar = C55136he.f145130j;
            }
            C87429c a = mVar.mo81378a(heVar, modularAction, false);
            if (a.mo81247f()) {
                return a.mo81245d();
            }
            C87463b O = modularAction.mo81210Q();
            C55136he heVar2 = laVar.f145453c;
            if (heVar2 == null) {
                heVar2 = C55136he.f145130j;
            }
            String valueOf = String.valueOf(heVar2);
            String str = heVar2.f145133b;
            O.mo81398b("Can't format confirm text: " + valueOf + ", " + str);
        }
        return BuildConfig.FLAVOR;
    }

    /* renamed from: N */
    public final String mo88019N() {
        C58838bb.m90883r(mo88043al());
        C55263lx lxVar = mo82039ao().f236263q;
        if ((lxVar.f145546a & 1) == 0) {
            return null;
        }
        C87449m mVar = this.f261317d;
        C55136he heVar = lxVar.f145547b;
        if (heVar == null) {
            heVar = C55136he.f145130j;
        }
        return mVar.mo81378a(heVar, (C87448l) this.f239226b, true).mo81245d();
    }

    /* renamed from: O */
    public final String mo88020O() {
        C55136he heVar;
        C55240la laVar = ((ModularActionMatchingProviderInfo) ((ModularAction) this.f239226b).f235986b).f236115a;
        if (laVar == null) {
            return BuildConfig.FLAVOR;
        }
        if ((laVar.f145451a & 256) != 0) {
            heVar = laVar.f145460j;
            if (heVar == null) {
                heVar = C55136he.f145130j;
            }
        } else {
            heVar = null;
        }
        return mo88004a(heVar);
    }

    /* renamed from: P */
    public final String mo88021P() {
        C55136he heVar = ((ModularAction) this.f239226b).mo81219Z().f145700j;
        if (heVar == null) {
            heVar = C55136he.f145130j;
        }
        String a = mo88004a(heVar);
        if (a != null) {
            return a;
        }
        String str = ((ModularAction) this.f239226b).mo81219Z().f145699i;
        return str == null ? BuildConfig.FLAVOR : str;
    }

    /* renamed from: Q */
    public final String mo88022Q() {
        String str = mo82039ao().f236249c;
        return str == null ? BuildConfig.FLAVOR : str;
    }

    /* renamed from: R */
    public final List mo88023R() {
        C87487i iVar = ((ModularActionMatchingProviderInfo) ((ModularAction) this.f239226b).f235986b).f236121g;
        if (iVar != null) {
            return iVar.f236312a;
        }
        return null;
    }

    /* renamed from: S */
    public final void mo88024S() {
        PersonArgument S = ((ModularAction) this.f239226b).mo81212S();
        if (S != null) {
            C58838bb.m90869d(S.mo81263C(), "PersonArgument is not set");
            this.f239225a.mo82112t((PersonDisambiguation) S.f236203n);
            this.f239225a.mo82075B(this.f239226b);
            ((PersonDisambiguation) S.f236203n).mo81534c();
            mo82057t();
            this.f239225a.mo82100h(false, this.f239226b);
        }
    }

    /* renamed from: T */
    public final void mo88025T() {
        if (mo82060w()) {
            C89931b bVar = new C89931b();
            C88509c cVar = this.f239227c;
            cVar.getClass();
            C88508b bVar2 = (C88508b) cVar;
            if (bVar2.mo82068h(bVar)) {
                bVar.mo83770b();
            }
            C88512f fVar = this.f239225a;
            if (fVar instanceof C93482bj) {
                bVar.mo83769a(C89932c.f246391b, bVar2, ((C93482bj) fVar).mo87778T(this.f239226b));
            }
        }
    }

    /* renamed from: U */
    public final void mo88026U() {
        PersonArgument S = ((ModularAction) this.f239226b).mo81212S();
        if (S != null) {
            C58838bb.m90869d(S.mo81263C(), "PersonArgument is not set");
            C91097g c = this.f239225a.mo82095c();
            Parcelable parcelable = ((PersonDisambiguation) S.f236203n).f236364c;
            parcelable.getClass();
            c.mo65089a(C87516d.m142150a((Person) parcelable));
        }
    }

    /* renamed from: V */
    public final void mo88027V(C55253ln lnVar) {
        C87487i iVar = ((ModularActionMatchingProviderInfo) ((ModularAction) this.f239226b).f235986b).f236121g;
        if (iVar != null) {
            iVar.mo81482f(lnVar);
        }
        mo82050m(1, 3);
        super.mo82052o(106);
    }

    /* renamed from: W */
    public final void mo88028W() {
        if (((ModularAction) this.f239226b).f236111q) {
            C87422j jVar = (C87422j) C87423k.f236084e.createBuilder();
            jVar.copyOnWrite();
            C87423k kVar = (C87423k) jVar.instance;
            kVar.f236087b = 10;
            kVar.f236086a |= 1;
            m154396an((C87423k) jVar.build());
            return;
        }
        mo82037B();
        mo88031Z();
        mo82057t();
    }

    /* renamed from: X */
    public final void mo88029X(Disambiguation disambiguation, C87423k kVar, int i) {
        ModularAction modularAction = (ModularAction) this.f239226b;
        this.f239225a.mo82075B(modularAction);
        if (!modularAction.f236111q) {
            int a = C55304nk.m87661a(modularAction.mo81219Z().f145698h);
            if (a == 0) {
                a = 1;
            }
            if ((a == 2 || a == 3) && disambiguation.f236366e && modularAction.mo81133M()) {
                mo82037B();
                mo82038C(i, kVar);
                C88509c cVar = this.f239227c;
                cVar.getClass();
                ((C93601cy) cVar).mo82065e();
                return;
            }
            mo82038C(i, kVar);
            if (mo82060w()) {
                this.f239225a.mo82100h(true, this.f239226b);
            }
        } else if (disambiguation.mo81543l()) {
            Parcelable parcelable = disambiguation.f236364c;
            parcelable.getClass();
            if (parcelable instanceof EntityArgument.Entity) {
                C87422j jVar = (C87422j) C87423k.f236084e.createBuilder();
                jVar.copyOnWrite();
                C87423k kVar2 = (C87423k) jVar.instance;
                kVar2.f236087b = 11;
                kVar2.f236086a |= 1;
                String obj = ((EntityArgument.Entity) parcelable).f236170b.toString();
                jVar.copyOnWrite();
                C87423k kVar3 = (C87423k) jVar.instance;
                obj.getClass();
                kVar3.f236086a |= 4;
                kVar3.f236089d = obj;
                m154396an((C87423k) jVar.build());
            }
        }
    }

    /* renamed from: Z */
    public final void mo88031Z() {
        mo82050m(2, 3);
    }

    /* renamed from: a */
    public final String mo88004a(C55136he heVar) {
        if (heVar == null) {
            return null;
        }
        try {
            C87429c a = this.f261317d.mo81378a(heVar, (C87448l) this.f239226b, true);
            if (a.mo81247f()) {
                return a.mo81245d();
            }
            return null;
        } catch (IllegalArgumentException unused) {
            ((ModularAction) this.f239226b).mo81210Q().mo81399c(5, heVar);
            return null;
        }
    }

    /* renamed from: aa */
    public final void mo88032aa() {
        C93536an anVar = this.f261321h;
        if (anVar != null) {
            anVar.mo87948a();
        }
    }

    /* renamed from: ab */
    public final void mo88033ab(Argument argument) {
        argument.f236147h = false;
        ProviderArgument providerArgument = ((ModularAction) this.f239226b).f236102h;
        if (providerArgument != null) {
            providerArgument.f236147h = false;
        }
        mo82057t();
    }

    /* renamed from: ac */
    public final void mo88034ac() {
        this.f239225a.mo82111s(this.f239226b);
    }

    /* renamed from: ad */
    public final void mo88035ad(boolean z) {
        this.f239225a.mo82115w(z);
    }

    /* renamed from: ae */
    public final void mo88036ae() {
        mo88035ad(!mo88040ai());
        mo88025T();
        mo82057t();
    }

    /* renamed from: af */
    public final void mo88037af(boolean z, int i) {
        if (this.f261326m) {
            this.f261326m = false;
            C88512f fVar = this.f239225a;
            if (fVar.mo82090Q() && fVar.mo82081H()) {
                if (z || (i == 2 && fVar.mo82082I())) {
                    C87422j jVar = (C87422j) C87423k.f236084e.createBuilder();
                    jVar.copyOnWrite();
                    C87423k kVar = (C87423k) jVar.instance;
                    kVar.f236087b = 8;
                    kVar.f236086a |= 1;
                    mo82053p((C87423k) jVar.build());
                } else if (fVar.mo82082I()) {
                    mo82053p((C87423k) null);
                }
            }
        }
    }

    /* renamed from: ag */
    public final boolean mo88038ag() {
        ModularActionMatchingProviderInfo modularActionMatchingProviderInfo = (ModularActionMatchingProviderInfo) ((ModularAction) this.f239226b).f235986b;
        if (modularActionMatchingProviderInfo.f236270h.f236312a.size() != 1) {
            return true;
        }
        if (modularActionMatchingProviderInfo.mo81436f() || modularActionMatchingProviderInfo.f236116b == null) {
            return false;
        }
        return true;
    }

    /* renamed from: ah */
    public final boolean mo88039ah() {
        List R = mo88023R();
        if (R == null || R.isEmpty() || ((C55253ln) R.get(0)).f145510b.size() == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: ai */
    public final boolean mo88040ai() {
        return this.f239225a.mo82079F();
    }

    /* renamed from: aj */
    public final boolean mo88041aj(C55361pn pnVar) {
        ModularAction modularAction = (ModularAction) this.f239226b;
        C87487i iVar = modularAction.f236102h.f236200i;
        iVar.getClass();
        iVar.mo81482f(pnVar);
        modularAction.mo81227ag(false);
        this.f239225a.mo82110r(this.f239226b, true);
        if (!this.f261324k && !((ModularAction) this.f239226b).f236100f.isEmpty()) {
            return false;
        }
        this.f261324k = false;
        mo82037B();
        return true;
    }

    /* renamed from: ak */
    public final boolean mo88042ak() {
        if (mo88040ai()) {
            return true;
        }
        if (!((ModularAction) this.f239226b).mo81222ab().isEmpty() || ((ModularActionMatchingProviderInfo) ((ModularAction) this.f239226b).f235986b).f236270h.mo81484i()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: al */
    public final boolean mo88043al() {
        return mo82039ao().f236263q != null;
    }

    /* renamed from: am */
    public final int mo88044am() {
        int a;
        C55240la laVar = ((ModularActionMatchingProviderInfo) ((ModularAction) this.f239226b).f235986b).f236115a;
        if (laVar == null || (a = C55419v.m87685a(laVar.f145454d)) == 0) {
            return 1;
        }
        return a;
    }

    /* renamed from: b */
    public final void mo88005b(int i, String str, int i2) {
        if (i2 == 1) {
            this.f239225a.mo82105m(1, 3);
        }
        this.f239225a.mo82104l(i, str);
    }

    /* renamed from: d */
    public final void mo88007d() {
        mo82037B();
        mo82050m(1, 3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo82048k() {
        if (mo82060w()) {
            mo82057t();
        }
    }

    /* renamed from: q */
    public final /* bridge */ /* synthetic */ void mo82054q(VoiceAction voiceAction) {
        ModularAction modularAction = (ModularAction) voiceAction;
        this.f261326m = this.f239226b != modularAction;
        this.f239226b = modularAction;
    }

    /* renamed from: u */
    public final boolean mo82058u() {
        boolean u = super.mo82058u();
        if (!u || !mo82060w()) {
            return u;
        }
        C88509c cVar = this.f239227c;
        cVar.getClass();
        ((C93601cy) cVar).mo87999l();
        return true;
    }

    /* renamed from: v */
    public final boolean mo82059v(C87423k kVar) {
        C93635ee eeVar = this.f261322i;
        kVar.getClass();
        int a = C87478u.m141962a(kVar.f236087b);
        if (a == 0) {
            a = 1;
        }
        int i = kVar.f236088c;
        int i2 = a - 1;
        switch (i2) {
            case 1:
                eeVar.f261387a.mo88036ae();
                eeVar.f261387a.mo82050m(1, 3);
                return true;
            case 2:
                ModularAction modularAction = (ModularAction) eeVar.f261387a.f239226b;
                Argument R = modularAction.mo81211R(i);
                if (!(R instanceof AmbiguousArgument)) {
                    if (!(R instanceof ProviderArgument)) {
                        modularAction.mo81210Q().mo81404h(i, AmbiguousArgument.class.getName() + " / " + ProviderArgument.class.getName());
                        break;
                    } else {
                        C87487i iVar = modularAction.f236102h.f236200i;
                        iVar.getClass();
                        iVar.mo81483g();
                        modularAction.f236103i.mo81483g();
                        modularAction.mo81226af();
                        C93602cz czVar = eeVar.f261387a;
                        czVar.f239225a.mo82076C(czVar.f239226b);
                        eeVar.f261387a.mo88029X(((ProviderArgument) R).mo81320a(), (C87423k) null, 1);
                        return true;
                    }
                } else {
                    Disambiguation disambiguation = (Disambiguation) ((AmbiguousArgument) R).f236203n;
                    if (disambiguation != null && disambiguation.mo81540h()) {
                        disambiguation.mo81538f();
                        eeVar.f261387a.mo88029X(disambiguation, (C87423k) null, 2);
                        return true;
                    }
                }
            case 3:
                ModularAction modularAction2 = (ModularAction) eeVar.f261387a.f239226b;
                if (!(modularAction2.mo81211R(i) instanceof AmbiguousArgument)) {
                    modularAction2.mo81210Q().mo81404h(i, AmbiguousArgument.class.getName());
                    break;
                } else {
                    TwoStepDisambiguation twoStepDisambiguation = (TwoStepDisambiguation) ((AmbiguousArgument) modularAction2.mo81211R(i)).f236203n;
                    if (twoStepDisambiguation != null && twoStepDisambiguation.mo81606B()) {
                        twoStepDisambiguation.mo81613z();
                        eeVar.f261387a.mo88029X(twoStepDisambiguation, (C87423k) null, 2);
                        return true;
                    }
                }
            case 4:
                ModularAction modularAction3 = (ModularAction) eeVar.f261387a.f239226b;
                if (!(modularAction3.mo81211R(i) instanceof AmbiguousArgument)) {
                    modularAction3.mo81210Q().mo81404h(i, AmbiguousArgument.class.getName());
                    break;
                } else {
                    Disambiguation disambiguation2 = (Disambiguation) ((AmbiguousArgument) modularAction3.mo81211R(i)).f236203n;
                    if (disambiguation2 != null && disambiguation2.mo81539g()) {
                        if (disambiguation2.mo81539g()) {
                            disambiguation2.mo81535d(disambiguation2.f236365d, true);
                        }
                        eeVar.f261387a.mo88029X(disambiguation2, (C87423k) null, 2);
                        return true;
                    }
                }
            case 5:
                ModularAction modularAction4 = (ModularAction) eeVar.f261387a.f239226b;
                if (!(modularAction4.mo81211R(i) instanceof AmbiguousArgument)) {
                    modularAction4.mo81210Q().mo81404h(i, AmbiguousArgument.class.getName());
                    break;
                } else {
                    TwoStepDisambiguation twoStepDisambiguation2 = (TwoStepDisambiguation) ((AmbiguousArgument) modularAction4.mo81211R(i)).f236203n;
                    if (twoStepDisambiguation2 != null && twoStepDisambiguation2.mo81605A()) {
                        if (twoStepDisambiguation2.mo81605A()) {
                            twoStepDisambiguation2.mo81610w(twoStepDisambiguation2.f236413p, true);
                        }
                        eeVar.f261387a.mo88029X(twoStepDisambiguation2, (C87423k) null, 2);
                        return true;
                    }
                }
            case 6:
                eeVar.f261387a.mo82050m(1, 3);
                eeVar.f261387a.mo82051n();
                return true;
            default:
                throw new IllegalArgumentException("Unexpected undoable interaction (type=" + Integer.toString(i2) + ")");
        }
        return false;
    }

    /* renamed from: F */
    public final Resources mo88011F(Context context) {
        C58833ax axVar = this.f261323j;
        if (axVar == null || !axVar.mo56113h()) {
            return context.getResources();
        }
        return (Resources) axVar.mo56107c();
    }

    /* renamed from: Y */
    public final void mo88030Y(int i, boolean z) {
        if (z) {
            mo82050m(1, 3);
            this.f239225a.mo82097e(i);
            return;
        }
        this.f239225a.mo82108p(i);
    }

    /* renamed from: t */
    public final void mo82057t() {
        if (mo82060w()) {
            C88509c cVar = this.f239227c;
            cVar.getClass();
            ((C93601cy) cVar).mo87999l();
        }
    }

    /* renamed from: c */
    public final void mo88006c() {
        if (mo82060w()) {
            C88509c cVar = this.f239227c;
            cVar.getClass();
            ((C93601cy) cVar).mo87999l();
            this.f239225a.mo82100h(false, this.f239226b);
        }
    }

    /* renamed from: B */
    public final void mo82037B() {
        PersonDisambiguation personDisambiguation;
        if (this.f261325l == 9) {
            Argument H = mo88013H();
            if (!(H instanceof PersonArgument) || (personDisambiguation = (PersonDisambiguation) ((PersonArgument) H).f236203n) == null) {
                return;
            }
            if (personDisambiguation.f236395k.mo81601c()) {
                mo88024S();
            } else if (personDisambiguation.mo81607C()) {
                mo88026U();
            }
        } else {
            ModularAction modularAction = (ModularAction) this.f239226b;
            for (Integer intValue : modularAction.mo81219Z().f145703m) {
                if (!modularAction.mo81211R(intValue.intValue()).mo81267G(this.f261327n)) {
                    return;
                }
            }
            if (!mo88038ag() || mo88014I() != null) {
                this.f261324k = false;
                super.mo82037B();
                return;
            }
            this.f261324k = true;
            if (mo82060w()) {
                C88509c cVar = this.f239227c;
                cVar.getClass();
                ((C93601cy) cVar).mo87999l();
            }
        }
    }
}
