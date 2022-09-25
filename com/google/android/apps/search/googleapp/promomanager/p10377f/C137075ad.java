package com.google.android.apps.search.googleapp.promomanager.p10377f;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.search.googleapp.promomanager.p10372b.C137007dh;
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
import com.google.apps.tiktok.p3674l.p3679c.C47387a;
import com.google.apps.tiktok.p3674l.p3679c.C47389c;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
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

/* renamed from: com.google.android.apps.search.googleapp.promomanager.f.ad */
/* compiled from: PG */
public final class C137075ad extends C137072aa implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C137077af f373015a;

    /* renamed from: c */
    private Context f373016c;

    /* renamed from: d */
    private final C2393x f373017d = new C2393x(this);

    /* renamed from: e */
    private final C47515ab f373018e = new C47515ab(this);

    /* renamed from: f */
    private boolean f373019f;

    /* renamed from: g */
    private boolean f373020g;

    @Deprecated
    public C137075ad() {
        C19559g.m37304c();
    }

    /* renamed from: f */
    static C137075ad m222763f(AccountId accountId, C137007dh dhVar) {
        C137075ad adVar = new C137075ad();
        C68324h.m98669f(adVar);
        C47247a.m84047b(adVar, accountId);
        C47243l.m84039a(adVar, dhVar);
        return adVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47222f mo113485b() {
        return C47244m.m84043e(this);
    }

    public final void dismiss() {
        C47573bx w = C47831fm.m85028w();
        try {
            super.dismiss();
            w.close();
            return;
        } catch (Throwable th) {
            C137074ac.m222762a(th, th);
        }
        throw th;
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f373016c == null) {
            this.f373016c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f373016c;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f373018e.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f373017d;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f373018e.mo51380h(eyVar, z);
    }

    /* renamed from: j */
    public final C137077af mo17754z() {
        C137077af afVar = this.f373015a;
        if (afVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f373020g) {
            return afVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f373018e.mo51381i();
        try {
            super.onActivityCreated(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C137074ac.m222762a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f373018e.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C137074ac.m222762a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f373018e.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C137074ac.m222762a(th, th);
        }
        throw th;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f373018e.mo51378f("DialogFragment:onCancel").close();
    }

    public final void onCreate(Bundle bundle) {
        this.f373018e.mo51381i();
        try {
            super.onCreate(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C137074ac.m222762a(th, th);
        }
        throw th;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f373018e.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C137074ac.m222762a(th, th);
        }
        throw th;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v21, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.app.Dialog onCreateDialog(android.os.Bundle r15) {
        /*
            r14 = this;
            super.onCreateDialog(r15)
            com.google.android.apps.search.googleapp.promomanager.f.af r15 = r14.mo17754z()
            com.google.android.apps.search.googleapp.urlhandler.k r0 = r15.f373027f
            com.google.android.apps.search.googleapp.promomanager.f.ae r1 = new com.google.android.apps.search.googleapp.promomanager.f.ae
            r1.<init>(r15)
            r0.mo115295d(r1)
            android.app.Dialog r0 = new android.app.Dialog
            android.content.Context r1 = r15.f373023b
            r2 = 2132150662(0x7f160986, float:1.9943365E38)
            r0.<init>(r1, r2)
            android.content.Context r1 = r15.f373023b
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            r2 = 2131625440(0x7f0e05e0, float:1.8878088E38)
            r3 = 0
            android.view.View r1 = r1.inflate(r2, r3)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            com.google.android.apps.search.googleapp.promomanager.b.dh r2 = r15.f373025d
            int r4 = r2.f372872b
            int r5 = com.google.android.apps.search.googleapp.promomanager.p10372b.C137006dg.m222698a(r4)
            int r6 = r5 + -1
            if (r5 == 0) goto L_0x0208
            r3 = 2131432046(0x7f0b126e, float:1.8485838E38)
            r5 = 2131432049(0x7f0b1271, float:1.8485844E38)
            r7 = 2131432050(0x7f0b1272, float:1.8485846E38)
            r8 = 1
            r9 = 2131432048(0x7f0b1270, float:1.8485842E38)
            r10 = 2131432047(0x7f0b126f, float:1.848584E38)
            r11 = 8
            java.lang.String r12 = ""
            if (r6 == 0) goto L_0x0136
            r13 = 2
            if (r6 == r8) goto L_0x0064
            if (r6 == r13) goto L_0x0054
            goto L_0x0204
        L_0x0054:
            com.google.common.f.e r15 = com.google.android.apps.search.googleapp.promomanager.p10377f.C137077af.f373022a
            com.google.common.f.x r15 = r15.mo56225c()
            java.lang.String r2 = "No content source. This should have been checked by subscription callback."
            r3 = 40913(0x9fd1, float:5.7331E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r15).mo56372aa(r3)).mo56386p(r2)
            goto L_0x0204
        L_0x0064:
            com.google.apps.tiktok.media.e r15 = r15.f373026e
            if (r4 != r13) goto L_0x006d
            java.lang.Object r2 = r2.f372873c
            com.google.protos.aw.a.a.a.w r2 = (com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63959w) r2
            goto L_0x006f
        L_0x006d:
            com.google.protos.aw.a.a.a.w r2 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63959w.f172981b
        L_0x006f:
            com.google.protobuf.bt r4 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63903aq.f172793i
            com.google.protobuf.bt r4 = com.google.protobuf.C62942bv.checkIsLite(r4)
            r2.mo58887l(r4)
            com.google.protobuf.bf r2 = r2.f169962ag
            com.google.protobuf.bs r6 = r4.f169971d
            java.lang.Object r2 = r2.mo58854l(r6)
            if (r2 != 0) goto L_0x0085
            java.lang.Object r2 = r4.f169969b
            goto L_0x0089
        L_0x0085:
            java.lang.Object r2 = r4.mo58889c(r2)
        L_0x0089:
            com.google.protos.aw.a.a.a.aq r2 = (com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63903aq) r2
            android.view.View r4 = r1.findViewById(r7)
            android.widget.TextView r4 = (android.widget.TextView) r4
            com.google.protos.aw.a.a.a.y r6 = r2.f172795a
            if (r6 != 0) goto L_0x0097
            com.google.protos.aw.a.a.a.y r6 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63961y.f172986c
        L_0x0097:
            int r7 = r6.f172988a
            if (r7 != r13) goto L_0x00a0
            java.lang.Object r6 = r6.f172989b
            java.lang.String r6 = (java.lang.String) r6
            goto L_0x00a1
        L_0x00a0:
            r6 = r12
        L_0x00a1:
            r4.setText(r6)
            com.google.protos.aw.a.a.a.y r4 = r2.f172796b
            if (r4 != 0) goto L_0x00aa
            com.google.protos.aw.a.a.a.y r4 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63961y.f172986c
        L_0x00aa:
            boolean r6 = com.google.android.apps.search.googleapp.promomanager.p10377f.C137121o.m222841h(r4)
            if (r6 == 0) goto L_0x00c4
            android.view.View r6 = r1.findViewById(r10)
            android.widget.TextView r6 = (android.widget.TextView) r6
            int r7 = r4.f172988a
            if (r7 != r13) goto L_0x00bf
            java.lang.Object r4 = r4.f172989b
            java.lang.String r4 = (java.lang.String) r4
            goto L_0x00c0
        L_0x00bf:
            r4 = r12
        L_0x00c0:
            r6.setText(r4)
            goto L_0x00cb
        L_0x00c4:
            android.view.View r4 = r1.findViewById(r10)
            r4.setVisibility(r11)
        L_0x00cb:
            com.google.protos.aw.a.a.a.y r4 = r2.f172800f
            if (r4 != 0) goto L_0x00d1
            com.google.protos.aw.a.a.a.y r4 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63961y.f172986c
        L_0x00d1:
            boolean r6 = com.google.android.apps.search.googleapp.promomanager.p10377f.C137121o.m222841h(r4)
            if (r6 == 0) goto L_0x00eb
            android.view.View r6 = r1.findViewById(r9)
            android.widget.Button r6 = (android.widget.Button) r6
            int r7 = r4.f172988a
            if (r7 != r13) goto L_0x00e6
            java.lang.Object r4 = r4.f172989b
            java.lang.String r4 = (java.lang.String) r4
            goto L_0x00e7
        L_0x00e6:
            r4 = r12
        L_0x00e7:
            r6.setText(r4)
            goto L_0x00f2
        L_0x00eb:
            android.view.View r4 = r1.findViewById(r9)
            r4.setVisibility(r11)
        L_0x00f2:
            android.view.View r4 = r1.findViewById(r5)
            android.widget.Button r4 = (android.widget.Button) r4
            com.google.protos.aw.a.a.a.y r5 = r2.f172799e
            if (r5 != 0) goto L_0x00fe
            com.google.protos.aw.a.a.a.y r5 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63961y.f172986c
        L_0x00fe:
            int r6 = r5.f172988a
            if (r6 != r13) goto L_0x0107
            java.lang.Object r5 = r5.f172989b
            java.lang.String r5 = (java.lang.String) r5
            goto L_0x0108
        L_0x0107:
            r5 = r12
        L_0x0108:
            r4.setText(r5)
            java.lang.String r4 = r2.f172797c
            com.google.protos.aw.a.a.a.y r2 = r2.f172798d
            if (r2 != 0) goto L_0x0113
            com.google.protos.aw.a.a.a.y r2 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63961y.f172986c
        L_0x0113:
            android.view.View r3 = r1.findViewById(r3)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            int r5 = r2.f172988a
            if (r5 != r13) goto L_0x0122
            java.lang.Object r2 = r2.f172989b
            r12 = r2
            java.lang.String r12 = (java.lang.String) r12
        L_0x0122:
            r3.setContentDescription(r12)
            android.net.Uri r2 = android.net.Uri.parse(r4)
            com.bumptech.glide.ad r15 = r15.mo51286a()
            com.bumptech.glide.z r15 = r15.mo11870h(r2)
            r15.mo12454r(r3)
            goto L_0x0204
        L_0x0136:
            android.content.Context r6 = r15.f373023b
            com.google.apps.tiktok.media.e r15 = r15.f373026e
            if (r4 != r8) goto L_0x0141
            java.lang.Object r2 = r2.f372873c
            com.google.protos.aq.av r2 = (com.google.protos.p4880aq.C63733av) r2
            goto L_0x0143
        L_0x0141:
            com.google.protos.aq.av r2 = com.google.protos.p4880aq.C63733av.f172308c
        L_0x0143:
            int r4 = r2.f172310a
            r8 = 3
            if (r4 != r8) goto L_0x014d
            java.lang.Object r2 = r2.f172311b
            com.google.protos.aq.q r2 = (com.google.protos.p4880aq.C63760q) r2
            goto L_0x014f
        L_0x014d:
            com.google.protos.aq.q r2 = com.google.protos.p4880aq.C63760q.f172487j
        L_0x014f:
            android.view.View r4 = r1.findViewById(r7)
            android.widget.TextView r4 = (android.widget.TextView) r4
            com.google.protos.aq.g r7 = r2.f172493e
            if (r7 != 0) goto L_0x015b
            com.google.protos.aq.g r7 = com.google.protos.p4880aq.C63750g.f172461c
        L_0x015b:
            com.google.android.apps.search.googleapp.promomanager.p10377f.C137121o.m222837d(r4, r7)
            com.google.protos.aq.g r4 = r2.f172494f
            if (r4 != 0) goto L_0x0164
            com.google.protos.aq.g r4 = com.google.protos.p4880aq.C63750g.f172461c
        L_0x0164:
            boolean r7 = com.google.android.apps.search.googleapp.promomanager.p10377f.C137121o.m222840g(r4)
            if (r7 == 0) goto L_0x0174
            android.view.View r7 = r1.findViewById(r10)
            android.widget.TextView r7 = (android.widget.TextView) r7
            com.google.android.apps.search.googleapp.promomanager.p10377f.C137121o.m222837d(r7, r4)
            goto L_0x017b
        L_0x0174:
            android.view.View r4 = r1.findViewById(r10)
            r4.setVisibility(r11)
        L_0x017b:
            com.google.protos.aq.g r4 = r2.f172496h
            if (r4 != 0) goto L_0x0181
            com.google.protos.aq.g r4 = com.google.protos.p4880aq.C63750g.f172461c
        L_0x0181:
            boolean r4 = com.google.android.apps.search.googleapp.promomanager.p10377f.C137121o.m222840g(r4)
            if (r4 == 0) goto L_0x0197
            android.view.View r4 = r1.findViewById(r9)
            android.widget.Button r4 = (android.widget.Button) r4
            com.google.protos.aq.g r7 = r2.f172496h
            if (r7 != 0) goto L_0x0193
            com.google.protos.aq.g r7 = com.google.protos.p4880aq.C63750g.f172461c
        L_0x0193:
            com.google.android.apps.search.googleapp.promomanager.p10377f.C137121o.m222835b(r4, r7)
            goto L_0x019e
        L_0x0197:
            android.view.View r4 = r1.findViewById(r9)
            r4.setVisibility(r11)
        L_0x019e:
            android.view.View r4 = r1.findViewById(r5)
            android.widget.Button r4 = (android.widget.Button) r4
            com.google.protos.aq.g r5 = r2.f172495g
            if (r5 != 0) goto L_0x01aa
            com.google.protos.aq.g r5 = com.google.protos.p4880aq.C63750g.f172461c
        L_0x01aa:
            com.google.android.apps.search.googleapp.promomanager.p10377f.C137121o.m222835b(r4, r5)
            int r4 = r2.f172489a
            if (r4 != r8) goto L_0x01c2
            java.lang.Object r4 = r2.f172490b
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            com.google.protos.aq.k r4 = com.google.protos.p4880aq.C63754k.m96303a(r4)
            if (r4 != 0) goto L_0x01c4
            com.google.protos.aq.k r4 = com.google.protos.p4880aq.C63754k.DRAWABLE_UNKNOWN
            goto L_0x01c4
        L_0x01c2:
            com.google.protos.aq.k r4 = com.google.protos.p4880aq.C63754k.DRAWABLE_UNKNOWN
        L_0x01c4:
            r7 = r4
            int r4 = r2.f172489a
            if (r4 != r11) goto L_0x01cf
            java.lang.Object r4 = r2.f172490b
            java.lang.String r4 = (java.lang.String) r4
            r8 = r4
            goto L_0x01d0
        L_0x01cf:
            r8 = r12
        L_0x01d0:
            int r4 = r2.f172491c
            r5 = 4
            if (r4 != r5) goto L_0x01e6
            java.lang.Object r4 = r2.f172492d
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            com.google.protos.aq.ay r4 = com.google.protos.p4880aq.C63736ay.m96292a(r4)
            if (r4 != 0) goto L_0x01e8
            com.google.protos.aq.ay r4 = com.google.protos.p4880aq.C63736ay.STRING_UNKNOWN
            goto L_0x01e8
        L_0x01e6:
            com.google.protos.aq.ay r4 = com.google.protos.p4880aq.C63736ay.STRING_UNKNOWN
        L_0x01e8:
            r9 = r4
            int r4 = r2.f172491c
            r5 = 9
            if (r4 != r5) goto L_0x01f4
            java.lang.Object r2 = r2.f172492d
            r12 = r2
            java.lang.String r12 = (java.lang.String) r12
        L_0x01f4:
            android.view.View r2 = r1.findViewById(r3)
            r5 = r2
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r4 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r12
            r10 = r15
            com.google.android.apps.search.googleapp.promomanager.p10377f.C137121o.m222836c(r4, r5, r6, r7, r8, r9, r10)
        L_0x0204:
            r0.setContentView(r1)
            return r0
        L_0x0208:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.promomanager.p10377f.C137075ad.onCreateDialog(android.os.Bundle):android.app.Dialog");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f373018e.mo51381i();
        try {
            View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
            this.f373019f = false;
            C47831fm.m85019n();
            return onCreateView;
        } catch (Throwable th) {
            C137074ac.m222762a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f373018e.mo51374b();
        try {
            super.onDestroy();
            b.close();
            return;
        } catch (Throwable th) {
            C137074ac.m222762a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f373018e.mo51375c();
        try {
            super.onDestroyView();
            c.close();
            return;
        } catch (Throwable th) {
            C137074ac.m222762a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f373018e.mo51376d();
        try {
            super.onDetach();
            this.f373020g = true;
            d.close();
            return;
        } catch (Throwable th) {
            C137074ac.m222762a(th, th);
        }
        throw th;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        C47573bx f = this.f373018e.mo51378f("DialogFragment:onDismiss");
        try {
            super.onDismiss(dialogInterface);
            C137077af j = mo17754z();
            if (j.f373029h) {
                j.f373024c.mo113457n(j.f373025d);
            }
            f.close();
            return;
        } catch (Throwable th) {
            C137074ac.m222762a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f373018e.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C137074ac.m222762a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f373018e.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean O = this.f54440b.mo24732O();
            if (a != null) {
                a.close();
            }
            return O;
        } catch (Throwable th) {
            C137074ac.m222762a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f373018e.mo51381i();
        try {
            super.onPause();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C137074ac.m222762a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f373018e.mo51377e();
        try {
            super.onResume();
            e.close();
            return;
        } catch (Throwable th) {
            C137074ac.m222762a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f373018e.mo51381i();
        try {
            super.onSaveInstanceState(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C137074ac.m222762a(th, th);
        }
        throw th;
    }

    public final void onStart() {
        this.f373018e.mo51381i();
        try {
            super.onStart();
            C47387a.m84225b(this);
            if (getShowsDialog()) {
                if (!this.f373019f) {
                    View a = C47393f.m84230a(this);
                    C47400m a2 = C47389c.m84226a(getContext());
                    a2.f123128b = a;
                    C137081aj.m222775a(a2, mo17754z());
                    this.f373019f = true;
                }
                C47387a.m84224a(this);
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C137074ac.m222762a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f373018e.mo51381i();
        try {
            super.onStop();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C137074ac.m222762a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f373018e.mo51381i();
        try {
            if (!getShowsDialog() && !this.f373019f) {
                C47400m a = C47389c.m84226a(getContext());
                a.f123128b = view;
                C137081aj.m222775a(a, mo17754z());
                this.f373019f = true;
            }
            this.f54440b.mo24720k(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C137074ac.m222762a(th, th);
        }
        throw th;
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f373018e;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f373018e;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f373018e;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReenterTransition(obj);
    }

    public final void setRetainInstance(boolean z) {
        if (z) {
            throw new IllegalArgumentException("Peered fragments cannot be retained, to avoid memory leaks. If you need a retained fragment, you should subclass Fragment directly. See http://go/tiktok-conformance-violations/FRAGMENT_SET_RETAIN_INSTANCE");
        }
    }

    public final void setReturnTransition(Object obj) {
        C47515ab abVar = this.f373018e;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f373018e;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f373018e;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementReturnTransition(obj);
    }

    public final void startActivity(Intent intent) {
        if (C47214c.m83984a(intent, getContext().getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent);
    }

    public final void onAttach(Context context) {
        this.f373018e.mo51381i();
        try {
            if (!this.f373020g) {
                super.onAttach(context);
                if (this.f373015a == null) {
                    this.f373015a = ((C137082ak) mo113484a().mo17653jN()).mo113498da();
                    super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f373018e, this.f373017d));
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f373018e;
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
                C137074ac.m222762a(th, th2);
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
