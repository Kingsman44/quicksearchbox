package com.google.android.apps.search.googleapp.promomanager.p10377f;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.search.googleapp.promomanager.p10372b.C137007dh;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3657c.p3658a.C47222f;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3659d.C47244m;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.p3674l.p3679c.C47389c;
import com.google.apps.tiktok.p3674l.p3679c.C47400m;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.googleapp.promomanager.f.ar */
/* compiled from: PG */
public final class C137089ar extends C137073ab implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C137095ax f373048a;

    /* renamed from: c */
    private Context f373049c;

    /* renamed from: d */
    private final C2393x f373050d = new C2393x(this);

    /* renamed from: e */
    private boolean f373051e;

    @Deprecated
    public C137089ar() {
        C19559g.m37304c();
    }

    /* renamed from: f */
    static C137089ar m222781f(AccountId accountId, C137007dh dhVar) {
        C137089ar arVar = new C137089ar();
        C68324h.m98669f(arVar);
        C47247a.m84047b(arVar, accountId);
        C47243l.m84039a(arVar, dhVar);
        return arVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47222f mo113488b() {
        return C47244m.m84043e(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f373049c == null) {
            this.f373049c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f373049c;
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
        return this.f373050d;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f122869b.mo51380h(eyVar, z);
    }

    /* renamed from: j */
    public final C137095ax mo17754z() {
        C137095ax axVar = this.f373048a;
        if (axVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f373051e) {
            return axVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    public final void onAttach(Activity activity) {
        this.f122869b.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C137088aq.m222780a(th, th);
        }
        throw th;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v28, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r12, android.view.ViewGroup r13, android.os.Bundle r14) {
        /*
            r11 = this;
            com.google.apps.tiktok.tracing.ab r0 = r11.f122869b
            r0.mo51381i()
            r11.mo51119t(r12, r13, r14)     // Catch:{ all -> 0x025b }
            com.google.android.apps.search.googleapp.promomanager.f.ax r14 = r11.mo17754z()     // Catch:{ all -> 0x025b }
            com.google.android.apps.search.googleapp.urlhandler.k r0 = r14.f373063g     // Catch:{ all -> 0x025b }
            com.google.android.apps.search.googleapp.promomanager.f.au r1 = new com.google.android.apps.search.googleapp.promomanager.f.au     // Catch:{ all -> 0x025b }
            r1.<init>(r14)     // Catch:{ all -> 0x025b }
            r0.mo115295d(r1)     // Catch:{ all -> 0x025b }
            r0 = 2131625449(0x7f0e05e9, float:1.8878106E38)
            r1 = 0
            android.view.View r12 = r12.inflate(r0, r13, r1)     // Catch:{ all -> 0x025b }
            r12.getClass()
            com.google.apps.tiktok.tracing.dh r13 = r14.f373061e     // Catch:{ all -> 0x025b }
            com.google.android.apps.search.googleapp.promomanager.f.as r0 = new com.google.android.apps.search.googleapp.promomanager.f.as     // Catch:{ all -> 0x025b }
            r0.<init>(r14)     // Catch:{ all -> 0x025b }
            com.google.apps.tiktok.tracing.cj r1 = new com.google.apps.tiktok.tracing.cj     // Catch:{ all -> 0x025b }
            java.lang.String r2 = "Promo ignored"
            r1.<init>(r13, r0, r2)     // Catch:{ all -> 0x025b }
            r12.setOnTouchListener(r1)     // Catch:{ all -> 0x025b }
            r13 = 2131432065(0x7f0b1281, float:1.8485877E38)
            android.view.View r13 = r12.findViewById(r13)     // Catch:{ all -> 0x025b }
            com.google.android.apps.search.googleapp.promomanager.f.av r0 = new com.google.android.apps.search.googleapp.promomanager.f.av     // Catch:{ all -> 0x025b }
            r0.<init>()     // Catch:{ all -> 0x025b }
            androidx.core.p098j.C2043bi.m5526T(r13, r0)     // Catch:{ all -> 0x025b }
            android.content.Context r0 = r14.f373058b     // Catch:{ all -> 0x025b }
            r1 = 2130772080(0x7f010070, float:1.7147268E38)
            android.view.animation.Animation r0 = android.view.animation.AnimationUtils.loadAnimation(r0, r1)     // Catch:{ all -> 0x025b }
            r13.startAnimation(r0)     // Catch:{ all -> 0x025b }
            com.google.android.apps.search.googleapp.promomanager.b.dh r0 = r14.f373060d     // Catch:{ all -> 0x025b }
            int r0 = r0.f372874d     // Catch:{ all -> 0x025b }
            com.google.protos.aw.a.a.a.bm r0 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63926bm.m96318a(r0)     // Catch:{ all -> 0x025b }
            if (r0 != 0) goto L_0x0059
            com.google.protos.aw.a.a.a.bm r0 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63926bm.UNSPECIFIED     // Catch:{ all -> 0x025b }
        L_0x0059:
            com.google.protos.aw.a.a.a.bm r1 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63926bm.MINUS_ONE     // Catch:{ all -> 0x025b }
            if (r0 != r1) goto L_0x0065
            com.google.android.apps.search.googleapp.promomanager.f.at r0 = new com.google.android.apps.search.googleapp.promomanager.f.at     // Catch:{ all -> 0x025b }
            r0.<init>(r13)     // Catch:{ all -> 0x025b }
            r13.setOnApplyWindowInsetsListener(r0)     // Catch:{ all -> 0x025b }
        L_0x0065:
            com.google.android.apps.search.googleapp.promomanager.b.dh r13 = r14.f373060d     // Catch:{ all -> 0x025b }
            int r0 = r13.f372872b     // Catch:{ all -> 0x025b }
            int r1 = com.google.android.apps.search.googleapp.promomanager.p10372b.C137006dg.m222698a(r0)     // Catch:{ all -> 0x025b }
            int r2 = r1 + -1
            if (r1 == 0) goto L_0x0259
            r1 = 2131432069(0x7f0b1285, float:1.8485885E38)
            r3 = 2131432072(0x7f0b1288, float:1.8485891E38)
            r4 = 1
            r5 = 2131432066(0x7f0b1282, float:1.8485879E38)
            r6 = 2131432068(0x7f0b1284, float:1.8485883E38)
            r7 = 2131432067(0x7f0b1283, float:1.848588E38)
            java.lang.String r8 = ""
            r9 = 8
            if (r2 == 0) goto L_0x017f
            r10 = 2
            if (r2 == r4) goto L_0x009e
            if (r2 == r10) goto L_0x008e
            goto L_0x0255
        L_0x008e:
            com.google.common.f.e r13 = com.google.android.apps.search.googleapp.promomanager.p10377f.C137095ax.f373057a     // Catch:{ all -> 0x025b }
            com.google.common.f.x r13 = r13.mo56225c()     // Catch:{ all -> 0x025b }
            java.lang.String r14 = "No content source. This should have been checked by subscription callback."
            r0 = 40917(0x9fd5, float:5.7337E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r13).mo56372aa(r0)).mo56386p(r14)     // Catch:{ all -> 0x025b }
            goto L_0x0255
        L_0x009e:
            com.google.apps.tiktok.media.e r14 = r14.f373062f     // Catch:{ all -> 0x025b }
            if (r0 != r10) goto L_0x00a7
            java.lang.Object r13 = r13.f372873c     // Catch:{ all -> 0x025b }
            com.google.protos.aw.a.a.a.w r13 = (com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63959w) r13     // Catch:{ all -> 0x025b }
            goto L_0x00a9
        L_0x00a7:
            com.google.protos.aw.a.a.a.w r13 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63959w.f172981b     // Catch:{ all -> 0x025b }
        L_0x00a9:
            com.google.protobuf.bt r0 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63903aq.f172793i     // Catch:{ all -> 0x025b }
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)     // Catch:{ all -> 0x025b }
            r13.mo58887l(r0)     // Catch:{ all -> 0x025b }
            com.google.protobuf.bf r13 = r13.f169962ag     // Catch:{ all -> 0x025b }
            com.google.protobuf.bs r2 = r0.f169971d     // Catch:{ all -> 0x025b }
            java.lang.Object r13 = r13.mo58854l(r2)     // Catch:{ all -> 0x025b }
            if (r13 != 0) goto L_0x00bf
            java.lang.Object r13 = r0.f169969b     // Catch:{ all -> 0x025b }
            goto L_0x00c3
        L_0x00bf:
            java.lang.Object r13 = r0.mo58889c(r13)     // Catch:{ all -> 0x025b }
        L_0x00c3:
            com.google.protos.aw.a.a.a.aq r13 = (com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63903aq) r13     // Catch:{ all -> 0x025b }
            android.view.View r0 = r12.findViewById(r3)     // Catch:{ all -> 0x025b }
            android.widget.TextView r0 = (android.widget.TextView) r0     // Catch:{ all -> 0x025b }
            com.google.protos.aw.a.a.a.y r2 = r13.f172795a     // Catch:{ all -> 0x025b }
            if (r2 != 0) goto L_0x00d1
            com.google.protos.aw.a.a.a.y r2 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63961y.f172986c     // Catch:{ all -> 0x025b }
        L_0x00d1:
            int r3 = r2.f172988a     // Catch:{ all -> 0x025b }
            if (r3 != r10) goto L_0x00da
            java.lang.Object r2 = r2.f172989b     // Catch:{ all -> 0x025b }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x025b }
            goto L_0x00db
        L_0x00da:
            r2 = r8
        L_0x00db:
            r0.setText(r2)     // Catch:{ all -> 0x025b }
            com.google.protos.aw.a.a.a.y r0 = r13.f172796b     // Catch:{ all -> 0x025b }
            if (r0 != 0) goto L_0x00e4
            com.google.protos.aw.a.a.a.y r0 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63961y.f172986c     // Catch:{ all -> 0x025b }
        L_0x00e4:
            boolean r2 = com.google.android.apps.search.googleapp.promomanager.p10377f.C137121o.m222841h(r0)     // Catch:{ all -> 0x025b }
            if (r2 == 0) goto L_0x00fe
            android.view.View r2 = r12.findViewById(r7)     // Catch:{ all -> 0x025b }
            android.widget.TextView r2 = (android.widget.TextView) r2     // Catch:{ all -> 0x025b }
            int r3 = r0.f172988a     // Catch:{ all -> 0x025b }
            if (r3 != r10) goto L_0x00f9
            java.lang.Object r0 = r0.f172989b     // Catch:{ all -> 0x025b }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x025b }
            goto L_0x00fa
        L_0x00f9:
            r0 = r8
        L_0x00fa:
            r2.setText(r0)     // Catch:{ all -> 0x025b }
            goto L_0x0105
        L_0x00fe:
            android.view.View r0 = r12.findViewById(r7)     // Catch:{ all -> 0x025b }
            r0.setVisibility(r9)     // Catch:{ all -> 0x025b }
        L_0x0105:
            com.google.protos.aw.a.a.a.y r0 = r13.f172800f     // Catch:{ all -> 0x025b }
            if (r0 != 0) goto L_0x010b
            com.google.protos.aw.a.a.a.y r0 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63961y.f172986c     // Catch:{ all -> 0x025b }
        L_0x010b:
            boolean r2 = com.google.android.apps.search.googleapp.promomanager.p10377f.C137121o.m222841h(r0)     // Catch:{ all -> 0x025b }
            if (r2 == 0) goto L_0x0125
            android.view.View r2 = r12.findViewById(r6)     // Catch:{ all -> 0x025b }
            android.widget.Button r2 = (android.widget.Button) r2     // Catch:{ all -> 0x025b }
            int r3 = r0.f172988a     // Catch:{ all -> 0x025b }
            if (r3 != r10) goto L_0x0120
            java.lang.Object r0 = r0.f172989b     // Catch:{ all -> 0x025b }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x025b }
            goto L_0x0121
        L_0x0120:
            r0 = r8
        L_0x0121:
            r2.setText(r0)     // Catch:{ all -> 0x025b }
            goto L_0x012c
        L_0x0125:
            android.view.View r0 = r12.findViewById(r6)     // Catch:{ all -> 0x025b }
            r0.setVisibility(r9)     // Catch:{ all -> 0x025b }
        L_0x012c:
            android.view.View r0 = r12.findViewById(r1)     // Catch:{ all -> 0x025b }
            android.widget.Button r0 = (android.widget.Button) r0     // Catch:{ all -> 0x025b }
            com.google.protos.aw.a.a.a.y r1 = r13.f172799e     // Catch:{ all -> 0x025b }
            if (r1 != 0) goto L_0x0138
            com.google.protos.aw.a.a.a.y r1 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63961y.f172986c     // Catch:{ all -> 0x025b }
        L_0x0138:
            int r2 = r1.f172988a     // Catch:{ all -> 0x025b }
            if (r2 != r10) goto L_0x0141
            java.lang.Object r1 = r1.f172989b     // Catch:{ all -> 0x025b }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x025b }
            goto L_0x0142
        L_0x0141:
            r1 = r8
        L_0x0142:
            r0.setText(r1)     // Catch:{ all -> 0x025b }
            java.lang.String r0 = r13.f172797c     // Catch:{ all -> 0x025b }
            com.google.protos.aw.a.a.a.y r13 = r13.f172798d     // Catch:{ all -> 0x025b }
            if (r13 != 0) goto L_0x014d
            com.google.protos.aw.a.a.a.y r13 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63961y.f172986c     // Catch:{ all -> 0x025b }
        L_0x014d:
            boolean r1 = com.google.android.apps.search.googleapp.promomanager.p10377f.C137121o.m222842i(r0, r13)     // Catch:{ all -> 0x025b }
            if (r1 == 0) goto L_0x0176
            android.view.View r1 = r12.findViewById(r5)     // Catch:{ all -> 0x025b }
            android.widget.ImageView r1 = (android.widget.ImageView) r1     // Catch:{ all -> 0x025b }
            int r2 = r13.f172988a     // Catch:{ all -> 0x025b }
            if (r2 != r10) goto L_0x0162
            java.lang.Object r13 = r13.f172989b     // Catch:{ all -> 0x025b }
            r8 = r13
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x025b }
        L_0x0162:
            r1.setContentDescription(r8)     // Catch:{ all -> 0x025b }
            android.net.Uri r13 = android.net.Uri.parse(r0)     // Catch:{ all -> 0x025b }
            com.bumptech.glide.ad r14 = r14.mo51286a()     // Catch:{ all -> 0x025b }
            com.bumptech.glide.z r13 = r14.mo11870h(r13)     // Catch:{ all -> 0x025b }
            r13.mo12454r(r1)     // Catch:{ all -> 0x025b }
            goto L_0x0255
        L_0x0176:
            android.view.View r13 = r12.findViewById(r5)     // Catch:{ all -> 0x025b }
            r13.setVisibility(r9)     // Catch:{ all -> 0x025b }
            goto L_0x0255
        L_0x017f:
            android.content.Context r2 = r14.f373058b     // Catch:{ all -> 0x025b }
            com.google.apps.tiktok.media.e r14 = r14.f373062f     // Catch:{ all -> 0x025b }
            if (r0 != r4) goto L_0x018a
            java.lang.Object r13 = r13.f372873c     // Catch:{ all -> 0x025b }
            com.google.protos.aq.av r13 = (com.google.protos.p4880aq.C63733av) r13     // Catch:{ all -> 0x025b }
            goto L_0x018c
        L_0x018a:
            com.google.protos.aq.av r13 = com.google.protos.p4880aq.C63733av.f172308c     // Catch:{ all -> 0x025b }
        L_0x018c:
            int r0 = r13.f172310a     // Catch:{ all -> 0x025b }
            if (r0 != r4) goto L_0x0195
            java.lang.Object r13 = r13.f172311b     // Catch:{ all -> 0x025b }
            com.google.protos.aq.q r13 = (com.google.protos.p4880aq.C63760q) r13     // Catch:{ all -> 0x025b }
            goto L_0x0197
        L_0x0195:
            com.google.protos.aq.q r13 = com.google.protos.p4880aq.C63760q.f172487j     // Catch:{ all -> 0x025b }
        L_0x0197:
            android.view.View r0 = r12.findViewById(r3)     // Catch:{ all -> 0x025b }
            android.widget.TextView r0 = (android.widget.TextView) r0     // Catch:{ all -> 0x025b }
            com.google.protos.aq.g r3 = r13.f172493e     // Catch:{ all -> 0x025b }
            if (r3 != 0) goto L_0x01a3
            com.google.protos.aq.g r3 = com.google.protos.p4880aq.C63750g.f172461c     // Catch:{ all -> 0x025b }
        L_0x01a3:
            com.google.android.apps.search.googleapp.promomanager.p10377f.C137121o.m222837d(r0, r3)     // Catch:{ all -> 0x025b }
            com.google.protos.aq.g r0 = r13.f172494f     // Catch:{ all -> 0x025b }
            if (r0 != 0) goto L_0x01ac
            com.google.protos.aq.g r0 = com.google.protos.p4880aq.C63750g.f172461c     // Catch:{ all -> 0x025b }
        L_0x01ac:
            boolean r3 = com.google.android.apps.search.googleapp.promomanager.p10377f.C137121o.m222840g(r0)     // Catch:{ all -> 0x025b }
            if (r3 == 0) goto L_0x01bc
            android.view.View r3 = r12.findViewById(r7)     // Catch:{ all -> 0x025b }
            android.widget.TextView r3 = (android.widget.TextView) r3     // Catch:{ all -> 0x025b }
            com.google.android.apps.search.googleapp.promomanager.p10377f.C137121o.m222837d(r3, r0)     // Catch:{ all -> 0x025b }
            goto L_0x01c3
        L_0x01bc:
            android.view.View r0 = r12.findViewById(r7)     // Catch:{ all -> 0x025b }
            r0.setVisibility(r9)     // Catch:{ all -> 0x025b }
        L_0x01c3:
            com.google.protos.aq.g r0 = r13.f172496h     // Catch:{ all -> 0x025b }
            if (r0 != 0) goto L_0x01c9
            com.google.protos.aq.g r0 = com.google.protos.p4880aq.C63750g.f172461c     // Catch:{ all -> 0x025b }
        L_0x01c9:
            boolean r3 = com.google.android.apps.search.googleapp.promomanager.p10377f.C137121o.m222840g(r0)     // Catch:{ all -> 0x025b }
            if (r3 == 0) goto L_0x01d9
            android.view.View r3 = r12.findViewById(r6)     // Catch:{ all -> 0x025b }
            android.widget.Button r3 = (android.widget.Button) r3     // Catch:{ all -> 0x025b }
            com.google.android.apps.search.googleapp.promomanager.p10377f.C137121o.m222835b(r3, r0)     // Catch:{ all -> 0x025b }
            goto L_0x01e0
        L_0x01d9:
            android.view.View r0 = r12.findViewById(r6)     // Catch:{ all -> 0x025b }
            r0.setVisibility(r9)     // Catch:{ all -> 0x025b }
        L_0x01e0:
            android.view.View r0 = r12.findViewById(r1)     // Catch:{ all -> 0x025b }
            android.widget.Button r0 = (android.widget.Button) r0     // Catch:{ all -> 0x025b }
            com.google.protos.aq.g r1 = r13.f172495g     // Catch:{ all -> 0x025b }
            if (r1 != 0) goto L_0x01ec
            com.google.protos.aq.g r1 = com.google.protos.p4880aq.C63750g.f172461c     // Catch:{ all -> 0x025b }
        L_0x01ec:
            com.google.android.apps.search.googleapp.promomanager.p10377f.C137121o.m222835b(r0, r1)     // Catch:{ all -> 0x025b }
            int r0 = r13.f172489a     // Catch:{ all -> 0x025b }
            r1 = 3
            if (r0 != r1) goto L_0x0205
            java.lang.Object r0 = r13.f172490b     // Catch:{ all -> 0x025b }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x025b }
            int r0 = r0.intValue()     // Catch:{ all -> 0x025b }
            com.google.protos.aq.k r0 = com.google.protos.p4880aq.C63754k.m96303a(r0)     // Catch:{ all -> 0x025b }
            if (r0 != 0) goto L_0x0207
            com.google.protos.aq.k r0 = com.google.protos.p4880aq.C63754k.DRAWABLE_UNKNOWN     // Catch:{ all -> 0x025b }
            goto L_0x0207
        L_0x0205:
            com.google.protos.aq.k r0 = com.google.protos.p4880aq.C63754k.DRAWABLE_UNKNOWN     // Catch:{ all -> 0x025b }
        L_0x0207:
            r3 = r0
            int r0 = r13.f172489a     // Catch:{ all -> 0x025b }
            if (r0 != r9) goto L_0x0212
            java.lang.Object r0 = r13.f172490b     // Catch:{ all -> 0x025b }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x025b }
            r4 = r0
            goto L_0x0213
        L_0x0212:
            r4 = r8
        L_0x0213:
            int r0 = r13.f172491c     // Catch:{ all -> 0x025b }
            r1 = 4
            if (r0 != r1) goto L_0x0229
            java.lang.Object r0 = r13.f172492d     // Catch:{ all -> 0x025b }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x025b }
            int r0 = r0.intValue()     // Catch:{ all -> 0x025b }
            com.google.protos.aq.ay r0 = com.google.protos.p4880aq.C63736ay.m96292a(r0)     // Catch:{ all -> 0x025b }
            if (r0 != 0) goto L_0x022b
            com.google.protos.aq.ay r0 = com.google.protos.p4880aq.C63736ay.STRING_UNKNOWN     // Catch:{ all -> 0x025b }
            goto L_0x022b
        L_0x0229:
            com.google.protos.aq.ay r0 = com.google.protos.p4880aq.C63736ay.STRING_UNKNOWN     // Catch:{ all -> 0x025b }
        L_0x022b:
            r6 = r0
            int r0 = r13.f172491c     // Catch:{ all -> 0x025b }
            r1 = 9
            if (r0 != r1) goto L_0x0237
            java.lang.Object r13 = r13.f172492d     // Catch:{ all -> 0x025b }
            r8 = r13
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x025b }
        L_0x0237:
            boolean r13 = com.google.android.apps.search.googleapp.promomanager.p10377f.C137121o.m222843j(r3, r4, r6, r8)     // Catch:{ all -> 0x025b }
            if (r13 == 0) goto L_0x024e
            android.view.View r13 = r12.findViewById(r5)     // Catch:{ all -> 0x025b }
            r1 = r13
            android.widget.ImageView r1 = (android.widget.ImageView) r1     // Catch:{ all -> 0x025b }
            r0 = r2
            r2 = r3
            r3 = r4
            r4 = r6
            r5 = r8
            r6 = r14
            com.google.android.apps.search.googleapp.promomanager.p10377f.C137121o.m222836c(r0, r1, r2, r3, r4, r5, r6)     // Catch:{ all -> 0x025b }
            goto L_0x0255
        L_0x024e:
            android.view.View r13 = r12.findViewById(r5)     // Catch:{ all -> 0x025b }
            r13.setVisibility(r9)     // Catch:{ all -> 0x025b }
        L_0x0255:
            com.google.apps.tiktok.tracing.C47831fm.m85019n()
            return r12
        L_0x0259:
            r12 = 0
            throw r12     // Catch:{ all -> 0x025b }
        L_0x025b:
            r12 = move-exception
            com.google.apps.tiktok.tracing.C47831fm.m85019n()     // Catch:{ all -> 0x0260 }
            goto L_0x0264
        L_0x0260:
            r13 = move-exception
            com.google.android.apps.search.googleapp.promomanager.p10377f.C137088aq.m222780a(r12, r13)
        L_0x0264:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.promomanager.p10377f.C137089ar.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            C137095ax j = mo17754z();
            if (j.f373065i) {
                j.f373059c.mo113457n(j.f373060d);
            }
            this.f373051e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C137088aq.m222780a(th, th);
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
            C137088aq.m222780a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            C47400m a = C47389c.m84226a(getContext());
            a.f123128b = view;
            C137095ax j = mo17754z();
            a.f123128b.findViewById(R.id.googleapp_tout_promo_positive_button).setTag(R.id.tiktok_event_internal_trace, "Positive button tapped");
            a.mo51254d(a.f123128b.findViewById(R.id.googleapp_tout_promo_positive_button), new C137096ay(j));
            a.f123128b.findViewById(R.id.googleapp_tout_promo_negative_button).setTag(R.id.tiktok_event_internal_trace, "Negative button tapped");
            a.mo51254d(a.f123128b.findViewById(R.id.googleapp_tout_promo_negative_button), new C137097az(j));
            this.f54442o.mo24720k(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C137088aq.m222780a(th, th);
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
            if (!this.f373051e) {
                super.onAttach(context);
                if (this.f373048a == null) {
                    this.f373048a = ((C137107ba) mo113487a().mo17653jN()).mo113528dc();
                    super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f373050d));
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
                C137088aq.m222780a(th, th2);
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
