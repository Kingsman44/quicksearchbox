package com.google.android.libraries.search.assistant.p2803u.p2808b.p2813c.p2815b.p2816a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47242k;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.media.C47449e;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;

/* renamed from: com.google.android.libraries.search.assistant.u.b.c.b.a.n */
/* compiled from: PG */
public final class C36738n extends C36709af implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C36745u f95729a;

    /* renamed from: c */
    private Context f95730c;

    /* renamed from: d */
    private final C2393x f95731d = new C2393x(this);

    /* renamed from: e */
    private boolean f95732e;

    @Deprecated
    public C36738n() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C36745u mo17754z() {
        C36745u uVar = this.f95729a;
        if (uVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f95732e) {
            return uVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo40342b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f95730c == null) {
            this.f95730c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f95730c;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f122869b.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f95731d;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f122869b.mo51380h(eyVar, z);
    }

    public final void onAttach(Activity activity) {
        this.f122869b.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C36737m.m65367a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C36745u a = mo17754z();
            a.f95746f.mo50429i(a.f95751k);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C36737m.m65367a(th, th);
        }
        throw th;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00db A[Catch:{ all -> 0x0339, all -> 0x033e }, LOOP:0: B:23:0x00d5->B:25:0x00db, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00f8 A[Catch:{ all -> 0x0339, all -> 0x033e }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x012c A[Catch:{ all -> 0x0339, all -> 0x033e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r13, android.view.ViewGroup r14, android.os.Bundle r15) {
        /*
            r12 = this;
            java.lang.String r0 = "<p>"
            com.google.apps.tiktok.tracing.ab r1 = r12.f122869b
            r1.mo51381i()
            r12.mo51119t(r13, r14, r15)     // Catch:{ all -> 0x0339 }
            com.google.android.libraries.search.assistant.u.b.c.b.a.u r15 = r12.mo17754z()     // Catch:{ all -> 0x0339 }
            r1 = 2131624302(0x7f0e016e, float:1.887578E38)
            r2 = 0
            android.view.View r14 = r13.inflate(r1, r14, r2)     // Catch:{ all -> 0x0339 }
            com.google.android.setupdesign.GlifLayout r14 = (com.google.android.setupdesign.GlifLayout) r14     // Catch:{ all -> 0x0339 }
            com.google.android.libraries.search.assistant.u.b.c.b.a.aj r1 = r15.f95744d     // Catch:{ all -> 0x0339 }
            com.google.assistant.at.uc r1 = r1.f95651c     // Catch:{ all -> 0x0339 }
            if (r1 != 0) goto L_0x0020
            com.google.assistant.at.uc r1 = com.google.assistant.p3861at.C50358uc.f131066m     // Catch:{ all -> 0x0339 }
        L_0x0020:
            java.lang.Class<com.google.android.setupdesign.d.c> r3 = com.google.android.setupdesign.p3555d.C45295c.class
            com.google.android.setupcompat.template.g r3 = r14.mo49129j(r3)     // Catch:{ all -> 0x0339 }
            com.google.android.setupdesign.d.c r3 = (com.google.android.setupdesign.p3555d.C45295c) r3     // Catch:{ all -> 0x0339 }
            java.lang.String r4 = r1.f131072e     // Catch:{ all -> 0x0339 }
            android.text.Spanned r4 = android.text.Html.fromHtml(r4)     // Catch:{ all -> 0x0339 }
            r3.mo49227d(r4)     // Catch:{ all -> 0x0339 }
            java.lang.String r3 = r1.f131072e     // Catch:{ all -> 0x0339 }
            androidx.core.p098j.C2043bi.m5528V(r14, r3)     // Catch:{ all -> 0x0339 }
            com.google.protobuf.cq r3 = r1.f131073f     // Catch:{ all -> 0x0339 }
            java.lang.String r3 = android.text.TextUtils.join(r0, r3)     // Catch:{ all -> 0x0339 }
            android.text.Spanned r3 = android.text.Html.fromHtml(r3)     // Catch:{ all -> 0x0339 }
            r14.mo49195q(r3)     // Catch:{ all -> 0x0339 }
            r3 = 2131428724(0x7f0b0574, float:1.84791E38)
            android.view.View r3 = r14.findViewById(r3)     // Catch:{ all -> 0x0339 }
            android.widget.TextView r3 = (android.widget.TextView) r3     // Catch:{ all -> 0x0339 }
            java.lang.String r4 = r1.f131074g     // Catch:{ all -> 0x0339 }
            r3.setText(r4)     // Catch:{ all -> 0x0339 }
            com.google.protobuf.cq r3 = r1.f131078k     // Catch:{ all -> 0x0339 }
            int r3 = r3.size()     // Catch:{ all -> 0x0339 }
            r4 = 1
            if (r3 != 0) goto L_0x006a
            com.google.common.f.e r13 = com.google.android.libraries.search.assistant.p2803u.p2808b.p2813c.p2815b.p2816a.C36745u.f95741a     // Catch:{ all -> 0x0339 }
            com.google.common.f.x r13 = r13.mo56226d()     // Catch:{ all -> 0x0339 }
            java.lang.String r0 = "setting_zippy empty"
            r1 = 51561(0xc969, float:7.2252E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r13).mo56372aa(r1)).mo56386p(r0)     // Catch:{ all -> 0x0339 }
            goto L_0x0248
        L_0x006a:
            int r3 = r1.f131068a     // Catch:{ all -> 0x0339 }
            r5 = r3 & 64
            r6 = 33
            r7 = 2132084120(0x7f150598, float:1.9808402E38)
            r8 = 32
            if (r5 == 0) goto L_0x0147
            r13 = 2131429093(0x7f0b06e5, float:1.847985E38)
            android.view.View r13 = r14.findViewById(r13)     // Catch:{ all -> 0x0339 }
            android.widget.RelativeLayout r13 = (android.widget.RelativeLayout) r13     // Catch:{ all -> 0x0339 }
            r13.setVisibility(r2)     // Catch:{ all -> 0x0339 }
            com.google.assistant.at.tu r3 = r1.f131076i     // Catch:{ all -> 0x0339 }
            if (r3 != 0) goto L_0x0089
            com.google.assistant.at.tu r3 = com.google.assistant.p3861at.C50349tu.f131039f     // Catch:{ all -> 0x0339 }
        L_0x0089:
            android.content.Context r5 = r15.f95742b     // Catch:{ all -> 0x0339 }
            android.util.TypedValue r9 = new android.util.TypedValue     // Catch:{ all -> 0x0339 }
            r9.<init>()     // Catch:{ all -> 0x0339 }
            android.content.res.Resources$Theme r10 = r5.getTheme()     // Catch:{ all -> 0x0339 }
            r11 = 2130969998(0x7f04058e, float:1.7548694E38)
            boolean r10 = r10.resolveAttribute(r11, r9, r4)     // Catch:{ all -> 0x0339 }
            if (r10 == 0) goto L_0x00a2
            int r9 = r9.data     // Catch:{ all -> 0x0339 }
            if (r9 == 0) goto L_0x00a2
            goto L_0x00b3
        L_0x00a2:
            android.content.res.Resources r5 = r5.getResources()     // Catch:{ all -> 0x0339 }
            android.content.res.Configuration r5 = r5.getConfiguration()     // Catch:{ all -> 0x0339 }
            int r5 = r5.uiMode     // Catch:{ all -> 0x0339 }
            r5 = r5 & 48
            if (r5 == r8) goto L_0x00b3
            java.lang.String r5 = r3.f131042b     // Catch:{ all -> 0x0339 }
            goto L_0x00b5
        L_0x00b3:
            java.lang.String r5 = r3.f131043c     // Catch:{ all -> 0x0339 }
        L_0x00b5:
            r8 = 2131429094(0x7f0b06e6, float:1.8479851E38)
            android.view.View r8 = r13.findViewById(r8)     // Catch:{ all -> 0x0339 }
            android.widget.ImageView r8 = (android.widget.ImageView) r8     // Catch:{ all -> 0x0339 }
            r15.mo40363a(r8, r5)     // Catch:{ all -> 0x0339 }
            r5 = 2131429095(0x7f0b06e7, float:1.8479853E38)
            android.view.View r13 = r13.findViewById(r5)     // Catch:{ all -> 0x0339 }
            android.widget.TextView r13 = (android.widget.TextView) r13     // Catch:{ all -> 0x0339 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x0339 }
            r5.<init>()     // Catch:{ all -> 0x0339 }
            com.google.protobuf.cq r8 = r3.f131044d     // Catch:{ all -> 0x0339 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x0339 }
        L_0x00d5:
            boolean r9 = r8.hasNext()     // Catch:{ all -> 0x0339 }
            if (r9 == 0) goto L_0x00ee
            java.lang.Object r9 = r8.next()     // Catch:{ all -> 0x0339 }
            com.google.common.j.a.f r9 = (com.google.common.p4538j.p4539a.C59308f) r9     // Catch:{ all -> 0x0339 }
            java.lang.String r9 = r9.f157474a     // Catch:{ all -> 0x0339 }
            com.google.common.j.a.c r10 = new com.google.common.j.a.c     // Catch:{ all -> 0x0339 }
            r10.<init>(r9)     // Catch:{ all -> 0x0339 }
            java.lang.String r9 = r10.f157465a     // Catch:{ all -> 0x0339 }
            r5.add(r9)     // Catch:{ all -> 0x0339 }
            goto L_0x00d5
        L_0x00ee:
            java.lang.String r8 = android.text.TextUtils.join(r0, r5)     // Catch:{ all -> 0x0339 }
            int r9 = r3.f131041a     // Catch:{ all -> 0x0339 }
            r9 = r9 & 4
            if (r9 == 0) goto L_0x012c
            android.content.Context r5 = r15.f95742b     // Catch:{ all -> 0x0339 }
            java.lang.String r5 = r5.getString(r7)     // Catch:{ all -> 0x0339 }
            android.text.SpannableString r9 = new android.text.SpannableString     // Catch:{ all -> 0x0339 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0339 }
            r10.<init>()     // Catch:{ all -> 0x0339 }
            r10.append(r8)     // Catch:{ all -> 0x0339 }
            java.lang.String r11 = " "
            r10.append(r11)     // Catch:{ all -> 0x0339 }
            r10.append(r5)     // Catch:{ all -> 0x0339 }
            java.lang.String r5 = r10.toString()     // Catch:{ all -> 0x0339 }
            r9.<init>(r5)     // Catch:{ all -> 0x0339 }
            com.google.android.libraries.search.assistant.u.b.c.b.a.s r5 = new com.google.android.libraries.search.assistant.u.b.c.b.a.s     // Catch:{ all -> 0x0339 }
            r5.<init>(r15, r3)     // Catch:{ all -> 0x0339 }
            int r3 = r8.length()     // Catch:{ all -> 0x0339 }
            int r3 = r3 + r4
            int r8 = r9.length()     // Catch:{ all -> 0x0339 }
            r9.setSpan(r5, r3, r8, r6)     // Catch:{ all -> 0x0339 }
            r13.setText(r9)     // Catch:{ all -> 0x0339 }
            goto L_0x0137
        L_0x012c:
            java.lang.String r3 = android.text.TextUtils.join(r0, r5)     // Catch:{ all -> 0x0339 }
            android.text.Spanned r3 = android.text.Html.fromHtml(r3)     // Catch:{ all -> 0x0339 }
            r13.setText(r3)     // Catch:{ all -> 0x0339 }
        L_0x0137:
            int r3 = r13.getCurrentTextColor()     // Catch:{ all -> 0x0339 }
            r13.setLinkTextColor(r3)     // Catch:{ all -> 0x0339 }
            android.text.method.MovementMethod r3 = android.text.method.LinkMovementMethod.getInstance()     // Catch:{ all -> 0x0339 }
            r13.setMovementMethod(r3)     // Catch:{ all -> 0x0339 }
            goto L_0x01c4
        L_0x0147:
            r3 = r3 & r8
            if (r3 == 0) goto L_0x01c4
            r3 = 2131429096(0x7f0b06e8, float:1.8479855E38)
            android.view.View r3 = r14.findViewById(r3)     // Catch:{ all -> 0x0339 }
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3     // Catch:{ all -> 0x0339 }
            r3.setVisibility(r2)     // Catch:{ all -> 0x0339 }
            com.google.assistant.at.tz r5 = r1.f131075h     // Catch:{ all -> 0x0339 }
            if (r5 != 0) goto L_0x015c
            com.google.assistant.at.tz r5 = com.google.assistant.p3861at.C50354tz.f131051c     // Catch:{ all -> 0x0339 }
        L_0x015c:
            r8 = 2131429097(0x7f0b06e9, float:1.8479857E38)
            android.view.View r8 = r3.findViewById(r8)     // Catch:{ all -> 0x0339 }
            android.widget.TextView r8 = (android.widget.TextView) r8     // Catch:{ all -> 0x0339 }
            java.lang.String r9 = r5.f131053a     // Catch:{ all -> 0x0339 }
            r8.setText(r9)     // Catch:{ all -> 0x0339 }
            r8 = 0
        L_0x016b:
            com.google.protobuf.cq r9 = r5.f131054b     // Catch:{ all -> 0x0339 }
            int r9 = r9.size()     // Catch:{ all -> 0x0339 }
            if (r8 >= r9) goto L_0x01be
            r9 = 2131624388(0x7f0e01c4, float:1.8875954E38)
            android.view.View r9 = r13.inflate(r9, r3, r2)     // Catch:{ all -> 0x0339 }
            android.widget.LinearLayout r9 = (android.widget.LinearLayout) r9     // Catch:{ all -> 0x0339 }
            r10 = 2131428838(0x7f0b05e6, float:1.8479332E38)
            android.view.View r10 = r9.findViewById(r10)     // Catch:{ all -> 0x0339 }
            android.widget.TextView r10 = (android.widget.TextView) r10     // Catch:{ all -> 0x0339 }
            com.google.protobuf.cq r11 = r5.f131054b     // Catch:{ all -> 0x0339 }
            java.lang.Object r11 = r11.get(r8)     // Catch:{ all -> 0x0339 }
            com.google.assistant.at.ty r11 = (com.google.assistant.p3861at.C50353ty) r11     // Catch:{ all -> 0x0339 }
            java.lang.String r11 = r11.f131049b     // Catch:{ all -> 0x0339 }
            r10.setText(r11)     // Catch:{ all -> 0x0339 }
            r3.addView(r9)     // Catch:{ all -> 0x0339 }
            r10 = 2131428837(0x7f0b05e5, float:1.847933E38)
            android.view.View r9 = r9.findViewById(r10)     // Catch:{ all -> 0x0339 }
            android.widget.ImageView r9 = (android.widget.ImageView) r9     // Catch:{ all -> 0x0339 }
            com.google.protobuf.cq r10 = r5.f131054b     // Catch:{ all -> 0x0339 }
            java.lang.Object r10 = r10.get(r8)     // Catch:{ all -> 0x0339 }
            com.google.assistant.at.ty r10 = (com.google.assistant.p3861at.C50353ty) r10     // Catch:{ all -> 0x0339 }
            java.lang.String r10 = r10.f131048a     // Catch:{ all -> 0x0339 }
            r15.mo40363a(r9, r10)     // Catch:{ all -> 0x0339 }
            com.google.protobuf.cq r9 = r5.f131054b     // Catch:{ all -> 0x0339 }
            int r9 = r9.size()     // Catch:{ all -> 0x0339 }
            int r9 = r9 + -1
            if (r8 >= r9) goto L_0x01bb
            r9 = 2131624187(0x7f0e00fb, float:1.8875547E38)
            r13.inflate(r9, r3, r4)     // Catch:{ all -> 0x0339 }
        L_0x01bb:
            int r8 = r8 + 1
            goto L_0x016b
        L_0x01be:
            r5 = 2131624186(0x7f0e00fa, float:1.8875545E38)
            r13.inflate(r5, r3, r4)     // Catch:{ all -> 0x0339 }
        L_0x01c4:
            com.google.protobuf.cq r13 = r1.f131078k     // Catch:{ all -> 0x0339 }
            java.lang.Object r13 = r13.get(r2)     // Catch:{ all -> 0x0339 }
            com.google.assistant.at.ado r13 = (com.google.assistant.p3861at.ado) r13     // Catch:{ all -> 0x0339 }
            r3 = 2131428726(0x7f0b0576, float:1.8479105E38)
            android.view.View r3 = r14.findViewById(r3)     // Catch:{ all -> 0x0339 }
            android.widget.TextView r3 = (android.widget.TextView) r3     // Catch:{ all -> 0x0339 }
            r5 = 2131428725(0x7f0b0575, float:1.8479103E38)
            android.view.View r5 = r14.findViewById(r5)     // Catch:{ all -> 0x0339 }
            android.widget.TextView r5 = (android.widget.TextView) r5     // Catch:{ all -> 0x0339 }
            java.lang.String r8 = r13.f129054c     // Catch:{ all -> 0x0339 }
            android.text.Spanned r8 = android.text.Html.fromHtml(r8)     // Catch:{ all -> 0x0339 }
            r3.setText(r8)     // Catch:{ all -> 0x0339 }
            com.google.protobuf.cq r3 = r13.f129055d     // Catch:{ all -> 0x0339 }
            java.lang.String r3 = android.text.TextUtils.join(r0, r3)     // Catch:{ all -> 0x0339 }
            r5.setText(r3)     // Catch:{ all -> 0x0339 }
            int r3 = r13.f129053b     // Catch:{ all -> 0x0339 }
            com.google.bj.c.f.b r3 = com.google.p4184bj.p4193c.p4201f.C56002b.m87880a(r3)     // Catch:{ all -> 0x0339 }
            if (r3 != 0) goto L_0x01fa
            com.google.bj.c.f.b r3 = com.google.p4184bj.p4193c.p4201f.C56002b.UNKNOWN_SETTING_SET_ID     // Catch:{ all -> 0x0339 }
        L_0x01fa:
            r15.f95752l = r3     // Catch:{ all -> 0x0339 }
            int r3 = r1.f131068a     // Catch:{ all -> 0x0339 }
            r3 = r3 & 128(0x80, float:1.794E-43)
            if (r3 == 0) goto L_0x0236
            r3 = 2131428721(0x7f0b0571, float:1.8479094E38)
            android.view.View r3 = r14.findViewById(r3)     // Catch:{ all -> 0x0339 }
            android.widget.TextView r3 = (android.widget.TextView) r3     // Catch:{ all -> 0x0339 }
            r3.setVisibility(r2)     // Catch:{ all -> 0x0339 }
            android.text.SpannableString r8 = new android.text.SpannableString     // Catch:{ all -> 0x0339 }
            android.content.Context r9 = r15.f95742b     // Catch:{ all -> 0x0339 }
            java.lang.String r7 = r9.getString(r7)     // Catch:{ all -> 0x0339 }
            r8.<init>(r7)     // Catch:{ all -> 0x0339 }
            com.google.android.libraries.search.assistant.u.b.c.b.a.r r7 = new com.google.android.libraries.search.assistant.u.b.c.b.a.r     // Catch:{ all -> 0x0339 }
            r7.<init>(r15, r1)     // Catch:{ all -> 0x0339 }
            int r1 = r8.length()     // Catch:{ all -> 0x0339 }
            r8.setSpan(r7, r2, r1, r6)     // Catch:{ all -> 0x0339 }
            android.text.method.MovementMethod r1 = android.text.method.LinkMovementMethod.getInstance()     // Catch:{ all -> 0x0339 }
            r3.setMovementMethod(r1)     // Catch:{ all -> 0x0339 }
            r3.setText(r8)     // Catch:{ all -> 0x0339 }
            int r1 = r5.getCurrentTextColor()     // Catch:{ all -> 0x0339 }
            r3.setLinkTextColor(r1)     // Catch:{ all -> 0x0339 }
        L_0x0236:
            r1 = 2131428722(0x7f0b0572, float:1.8479097E38)
            android.view.View r1 = r14.findViewById(r1)     // Catch:{ all -> 0x0339 }
            android.widget.TextView r1 = (android.widget.TextView) r1     // Catch:{ all -> 0x0339 }
            com.google.protobuf.cq r13 = r13.f129056e     // Catch:{ all -> 0x0339 }
            java.lang.String r13 = android.text.TextUtils.join(r0, r13)     // Catch:{ all -> 0x0339 }
            r1.setText(r13)     // Catch:{ all -> 0x0339 }
        L_0x0248:
            java.lang.Class<com.google.android.setupcompat.template.b> r13 = com.google.android.setupcompat.template.C45275b.class
            com.google.android.setupcompat.template.g r13 = r14.mo49129j(r13)     // Catch:{ all -> 0x0339 }
            com.google.android.setupcompat.template.b r13 = (com.google.android.setupcompat.template.C45275b) r13     // Catch:{ all -> 0x0339 }
            com.google.android.setupcompat.template.c r0 = new com.google.android.setupcompat.template.c     // Catch:{ all -> 0x0339 }
            android.content.Context r1 = r15.f95742b     // Catch:{ all -> 0x0339 }
            r0.<init>(r1)     // Catch:{ all -> 0x0339 }
            r1 = 2132084119(0x7f150597, float:1.98084E38)
            r0.mo49181b(r1)     // Catch:{ all -> 0x0339 }
            com.google.apps.tiktok.tracing.dh r1 = r15.f95743c     // Catch:{ all -> 0x0339 }
            com.google.android.libraries.search.assistant.u.b.c.b.a.o r3 = new com.google.android.libraries.search.assistant.u.b.c.b.a.o     // Catch:{ all -> 0x0339 }
            r3.<init>(r15)     // Catch:{ all -> 0x0339 }
            com.google.apps.tiktok.tracing.co r5 = new com.google.apps.tiktok.tracing.co     // Catch:{ all -> 0x0339 }
            java.lang.String r6 = "Turn on button is clicked"
            r5.<init>(r1, r6, r3)     // Catch:{ all -> 0x0339 }
            r0.f118281b = r5     // Catch:{ all -> 0x0339 }
            r1 = 5
            r0.f118282c = r1     // Catch:{ all -> 0x0339 }
            r3 = 2132148340(0x7f160074, float:1.9938655E38)
            r0.f118283d = r3     // Catch:{ all -> 0x0339 }
            com.google.android.setupcompat.template.d r0 = r0.mo49180a()     // Catch:{ all -> 0x0339 }
            r13.mo49175f(r0)     // Catch:{ all -> 0x0339 }
            com.google.android.setupcompat.template.c r0 = new com.google.android.setupcompat.template.c     // Catch:{ all -> 0x0339 }
            android.content.Context r5 = r15.f95742b     // Catch:{ all -> 0x0339 }
            r0.<init>(r5)     // Catch:{ all -> 0x0339 }
            r5 = 2132084121(0x7f150599, float:1.9808404E38)
            r0.mo49181b(r5)     // Catch:{ all -> 0x0339 }
            com.google.apps.tiktok.tracing.dh r5 = r15.f95743c     // Catch:{ all -> 0x0339 }
            com.google.android.libraries.search.assistant.u.b.c.b.a.p r6 = new com.google.android.libraries.search.assistant.u.b.c.b.a.p     // Catch:{ all -> 0x0339 }
            r6.<init>(r15)     // Catch:{ all -> 0x0339 }
            com.google.apps.tiktok.tracing.co r7 = new com.google.apps.tiktok.tracing.co     // Catch:{ all -> 0x0339 }
            java.lang.String r8 = "No thanks button is clicked"
            r7.<init>(r5, r8, r6)     // Catch:{ all -> 0x0339 }
            r0.f118281b = r7     // Catch:{ all -> 0x0339 }
            r5 = 7
            r0.f118282c = r5     // Catch:{ all -> 0x0339 }
            com.google.android.libraries.search.assistant.u.b.c.b.a.aj r5 = r15.f95744d     // Catch:{ all -> 0x0339 }
            boolean r5 = r5.f95657i     // Catch:{ all -> 0x0339 }
            if (r5 == 0) goto L_0x02ac
            r0.f118283d = r3     // Catch:{ all -> 0x0339 }
            com.google.android.setupcompat.template.d r0 = r0.mo49180a()     // Catch:{ all -> 0x0339 }
            r13.mo49176g(r0, r4)     // Catch:{ all -> 0x0339 }
            goto L_0x02b3
        L_0x02ac:
            com.google.android.setupcompat.template.d r0 = r0.mo49180a()     // Catch:{ all -> 0x0339 }
            r13.mo49176g(r0, r2)     // Catch:{ all -> 0x0339 }
        L_0x02b3:
            r13 = 2131428740(0x7f0b0584, float:1.8479133E38)
            android.view.View r13 = r14.findViewById(r13)     // Catch:{ all -> 0x0339 }
            r0 = 2131428741(0x7f0b0585, float:1.8479135E38)
            android.view.View r0 = r14.findViewById(r0)     // Catch:{ all -> 0x0339 }
            com.google.android.libraries.logging.ve.ab r2 = r15.f95748h     // Catch:{ all -> 0x0339 }
            com.google.android.libraries.logging.ve.af r3 = r15.f95749i     // Catch:{ all -> 0x0339 }
            r4 = 152773(0x254c5, float:2.1408E-40)
            com.google.android.libraries.logging.ve.h r4 = com.google.android.libraries.logging.p2185ve.C28427h.m53115a(r4)     // Catch:{ all -> 0x0339 }
            com.google.android.libraries.logging.ve.c r3 = r3.mo33805a(r4)     // Catch:{ all -> 0x0339 }
            r2.mo33802c(r13, r3)     // Catch:{ all -> 0x0339 }
            com.google.android.libraries.logging.ve.ab r13 = r15.f95748h     // Catch:{ all -> 0x0339 }
            com.google.android.libraries.logging.ve.af r2 = r15.f95749i     // Catch:{ all -> 0x0339 }
            r3 = 152779(0x254cb, float:2.14089E-40)
            com.google.android.libraries.logging.ve.h r3 = com.google.android.libraries.logging.p2185ve.C28427h.m53115a(r3)     // Catch:{ all -> 0x0339 }
            com.google.android.libraries.logging.ve.c r2 = r2.mo33805a(r3)     // Catch:{ all -> 0x0339 }
            r13.mo33802c(r0, r2)     // Catch:{ all -> 0x0339 }
            com.google.android.libraries.logging.ve.ab r13 = r15.f95748h     // Catch:{ all -> 0x0339 }
            com.google.android.libraries.logging.ve.af r0 = r15.f95749i     // Catch:{ all -> 0x0339 }
            com.google.bj.c.f.b r15 = r15.f95752l     // Catch:{ all -> 0x0339 }
            com.google.bj.c.f.b r2 = com.google.p4184bj.p4193c.p4201f.C56002b.UNKNOWN_SETTING_SET_ID     // Catch:{ all -> 0x0339 }
            int r2 = r15.ordinal()     // Catch:{ all -> 0x0339 }
            if (r2 == r1) goto L_0x031f
            r1 = 11
            if (r2 == r1) goto L_0x0317
            r1 = 12
            if (r2 != r1) goto L_0x0303
            r15 = 152785(0x254d1, float:2.14097E-40)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ all -> 0x0339 }
            goto L_0x0326
        L_0x0303:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0339 }
            java.lang.String r14 = "Unknown screen settingSetId: %s"
            java.lang.String r15 = r15.name()     // Catch:{ all -> 0x0339 }
            java.lang.String r15 = java.lang.String.valueOf(r15)     // Catch:{ all -> 0x0339 }
            java.lang.String r14 = r14.concat(r15)     // Catch:{ all -> 0x0339 }
            r13.<init>(r14)     // Catch:{ all -> 0x0339 }
            throw r13     // Catch:{ all -> 0x0339 }
        L_0x0317:
            r15 = 152784(0x254d0, float:2.14096E-40)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ all -> 0x0339 }
            goto L_0x0326
        L_0x031f:
            r15 = 152786(0x254d2, float:2.14099E-40)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ all -> 0x0339 }
        L_0x0326:
            int r15 = r15.intValue()     // Catch:{ all -> 0x0339 }
            com.google.android.libraries.logging.ve.h r15 = com.google.android.libraries.logging.p2185ve.C28427h.m53115a(r15)     // Catch:{ all -> 0x0339 }
            com.google.android.libraries.logging.ve.c r15 = r0.mo33805a(r15)     // Catch:{ all -> 0x0339 }
            r13.mo33802c(r14, r15)     // Catch:{ all -> 0x0339 }
            com.google.apps.tiktok.tracing.C47831fm.m85019n()
            return r14
        L_0x0339:
            r13 = move-exception
            com.google.apps.tiktok.tracing.C47831fm.m85019n()     // Catch:{ all -> 0x033e }
            goto L_0x0342
        L_0x033e:
            r14 = move-exception
            com.google.android.libraries.search.assistant.p2803u.p2808b.p2813c.p2815b.p2816a.C36737m.m65367a(r13, r14)
        L_0x0342:
            goto L_0x0344
        L_0x0343:
            throw r13
        L_0x0344:
            goto L_0x0343
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.p2803u.p2808b.p2813c.p2815b.p2816a.C36738n.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f95732e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C36737m.m65367a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C36737m.m65367a(th, th);
        }
        throw th;
    }

    public final void setRetainInstance(boolean z) {
        if (z) {
            throw new IllegalArgumentException("Peered fragments cannot be retained, to avoid memory leaks. If you need a retained fragment, you should subclass Fragment directly. See http://go/tiktok-conformance-violations/FRAGMENT_SET_RETAIN_INSTANCE");
        }
    }

    public final void startActivity(Intent intent) {
        if (C47214c.m83984a(intent, getContext().getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent);
    }

    public final void onAttach(Context context) {
        this.f122869b.mo51381i();
        try {
            if (!this.f95732e) {
                super.onAttach(context);
                if (this.f95729a == null) {
                    Object jN = mo40343d().mo17653jN();
                    AccountId accountId = (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C36738n) {
                        C36738n nVar = (C36738n) fragment;
                        C68225k.m98532d(nVar);
                        this.f95729a = new C36745u(nVar, ((C74176nj) jN).mo69687eX(), (C47770dh) ((C74176nj) jN).f206730b.f198663m.mo17428b(), (C47449e) ((C74176nj) jN).f207092s.mo17428b(), (C46439e) ((C74176nj) jN).f206942f.mo17428b(), (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b(), (C28310af) ((C74176nj) jN).f206677a.a.f202878fQ.mo17428b(), (C28443m) ((C74176nj) jN).f206677a.a.f202879fR.mo17428b(), ((C74176nj) jN).f206730b.f198027a.mo66920en());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f95731d));
                    } else {
                        String obj = C36745u.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f122869b;
                    if (abVar.f123354b == null) {
                        abVar.mo51380h(((C47570bu) parentFragment).mo17859g(), true);
                    }
                }
                C47831fm.m85019n();
                return;
            }
            throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
        } catch (ClassCastException e) {
            throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
        } catch (Throwable th) {
            try {
                C47831fm.m85019n();
            } catch (Throwable th2) {
                C36737m.m65367a(th, th2);
            }
            throw th;
        }
    }

    public final void startActivity(Intent intent, Bundle bundle) {
        if (C47214c.m83984a(intent, getContext().getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent, bundle);
    }
}
