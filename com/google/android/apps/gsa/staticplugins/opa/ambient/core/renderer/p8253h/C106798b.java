package com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.p8253h;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.gsa.smartspace.C92125t;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.C106734a;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.pcp.C106818o;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.h.b */
/* compiled from: PG */
public final class C106798b implements C106818o {

    /* renamed from: a */
    public boolean f297628a = false;

    /* renamed from: b */
    public final C92125t f297629b;

    /* renamed from: c */
    private final C106803g f297630c;

    /* renamed from: d */
    private final ViewGroup f297631d;

    /* renamed from: e */
    private final LayoutInflater f297632e;

    /* renamed from: f */
    private final TextView f297633f;

    /* renamed from: g */
    private final Context f297634g;

    /* renamed from: h */
    private final LinearLayout f297635h;

    public C106798b(C106803g gVar, C92125t tVar, Context context, ViewGroup viewGroup) {
        this.f297630c = gVar;
        this.f297629b = tVar;
        this.f297634g = context;
        this.f297631d = viewGroup;
        LayoutInflater from = LayoutInflater.from(context);
        this.f297632e = from;
        LinearLayout linearLayout = (LinearLayout) from.inflate(R.layout.headphone_context_child, viewGroup, false);
        this.f297635h = linearLayout;
        TextView textView = (TextView) linearLayout.findViewById(R.id.head_context_child_title);
        textView.setText(R.string.calling_suggestions_title);
        textView.setVisibility(0);
        linearLayout.addView(gVar.mo95674a(context), linearLayout.getChildCount() - 1);
        TextView textView2 = (TextView) linearLayout.findViewById(R.id.view_more_row);
        C28292j jVar = new C28292j(104351);
        jVar.mo33795i(5);
        C28295m.m52919e(textView2, jVar);
        textView2.setOnClickListener(new C106797a(this, textView2));
        this.f297633f = textView2;
    }

    /* renamed from: f */
    private final LinearLayout m177559f(boolean z) {
        LinearLayout linearLayout = (LinearLayout) this.f297632e.inflate(R.layout.aa_contacts_grouping, this.f297631d, false).findViewById(R.id.aa_contacts_grouping);
        if (!z) {
            linearLayout.setVisibility(8);
        }
        C28292j jVar = new C28292j(104348);
        int i = 1;
        if (true != z) {
            i = 2;
        }
        jVar.mo33794h(i);
        jVar.mo33795i(5);
        C28295m.m52919e(linearLayout, jVar);
        ((ViewGroup) this.f297630c.mo95674a(this.f297634g)).addView(linearLayout);
        LinearLayout linearLayout2 = new LinearLayout(this.f297634g);
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2);
        return linearLayout2;
    }

    /* renamed from: a */
    public final List mo95632a() {
        return C58485gu.m89846n(C106734a.FULL);
    }

    /* renamed from: b */
    public final C60870cx mo95633b() {
        return C60856cj.m92900i(Optional.m71637of(this.f297635h));
    }

    /* renamed from: c */
    public final void mo95641c(List list) {
        list.add(8);
    }

    /* JADX WARNING: Removed duplicated region for block: B:73:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x018c  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo95642d(com.google.android.apps.search.assistant.platform.pcp.p9329f.C123746bm r23) {
        /*
            r22 = this;
            r0 = r22
            com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.h.g r1 = r0.f297630c
            android.widget.LinearLayout r1 = r1.f297646b
            if (r1 == 0) goto L_0x000b
            r1.removeAllViews()
        L_0x000b:
            r1 = r23
            com.google.protobuf.cq r1 = r1.f341820a
            java.util.Iterator r1 = r1.iterator()
        L_0x0013:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x01c6
            java.lang.Object r2 = r1.next()
            com.google.android.apps.search.assistant.platform.pcp.f.bk r2 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123744bk) r2
            int r3 = r2.f341810e
            r4 = 8
            if (r3 != r4) goto L_0x0013
            int r3 = r2.f341808c
            r5 = 4
            if (r3 != r5) goto L_0x002f
            java.lang.Object r2 = r2.f341809d
            com.google.android.apps.search.assistant.platform.pcp.f.cj r2 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123770cj) r2
            goto L_0x0031
        L_0x002f:
            com.google.android.apps.search.assistant.platform.pcp.f.cj r2 = com.google.android.apps.search.assistant.platform.pcp.p9329f.C123770cj.f341899b
        L_0x0031:
            com.google.protobuf.cq r2 = r2.f341901a
            java.util.Iterator r2 = r2.iterator()
            r6 = 1
        L_0x0038:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x0013
            java.lang.Object r7 = r2.next()
            com.google.android.apps.search.assistant.platform.pcp.f.ch r7 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123768ch) r7
            int r8 = r7.f341898c
            com.google.android.apps.search.assistant.platform.pcp.f.cb r8 = com.google.android.apps.search.assistant.platform.pcp.p9329f.C123762cb.m203107a(r8)
            if (r8 != 0) goto L_0x004e
            com.google.android.apps.search.assistant.platform.pcp.f.cb r8 = com.google.android.apps.search.assistant.platform.pcp.p9329f.C123762cb.AFFINITY_TYPE_UNSPECIFIED
        L_0x004e:
            com.google.android.apps.search.assistant.platform.pcp.f.cb r9 = com.google.android.apps.search.assistant.platform.pcp.p9329f.C123762cb.CALL
            if (r8 != r9) goto L_0x01c2
            com.google.protobuf.cq r8 = r7.f341897b
            int r8 = r8.size()
            android.widget.LinearLayout r9 = r0.m177559f(r6)
            r10 = 0
            r11 = 0
        L_0x005e:
            if (r11 >= r8) goto L_0x01af
            if (r11 == 0) goto L_0x0075
            int r12 = r11 % 4
            if (r12 != 0) goto L_0x0075
            if (r11 < r5) goto L_0x006f
            boolean r9 = r0.f297628a
            if (r9 == 0) goto L_0x006d
            goto L_0x006f
        L_0x006d:
            r9 = 0
            goto L_0x0070
        L_0x006f:
            r9 = 1
        L_0x0070:
            r6 = r6 & r9
            android.widget.LinearLayout r9 = r0.m177559f(r6)
        L_0x0075:
            com.google.protobuf.cq r12 = r7.f341897b
            java.lang.Object r12 = r12.get(r11)
            com.google.android.apps.search.assistant.platform.pcp.f.cf r12 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123766cf) r12
            com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.h.g r13 = r0.f297630c
            android.view.LayoutInflater r14 = r0.f297632e
            android.widget.LinearLayout r15 = r13.f297646b
            r15.getClass()
            r5 = 2131623938(0x7f0e0002, float:1.8875042E38)
            android.view.View r5 = r14.inflate(r5, r15, r10)
            android.support.constraint.ConstraintLayout r5 = (android.support.constraint.ConstraintLayout) r5
            com.google.android.libraries.logging.j r14 = new com.google.android.libraries.logging.j
            r15 = 104349(0x1979d, float:1.46224E-40)
            r14.<init>(r15)
            r15 = 5
            r14.mo33795i(r15)
            com.google.android.libraries.logging.C28295m.m52919e(r5, r14)
            r14 = 2131427864(0x7f0b0218, float:1.8477356E38)
            android.view.View r14 = r5.findViewById(r14)
            android.support.v7.widget.AppCompatImageView r14 = (android.support.p033v7.widget.AppCompatImageView) r14
            r15 = 2131434489(0x7f0b1bf9, float:1.8490793E38)
            android.view.View r15 = r5.findViewById(r15)
            android.support.v7.widget.AppCompatImageView r15 = (android.support.p033v7.widget.AppCompatImageView) r15
            r3 = 2131431063(0x7f0b0e97, float:1.8483845E38)
            android.view.View r3 = r5.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r10 = 2131432689(0x7f0b14f1, float:1.8487143E38)
            android.view.View r10 = r5.findViewById(r10)
            android.widget.TextView r10 = (android.widget.TextView) r10
            r14.setVisibility(r4)
            r10.setVisibility(r4)
            int r14 = r12.f341886a
            r16 = r14 & 8
            if (r16 == 0) goto L_0x00e7
            dagger.a r14 = r13.f297648d
            java.lang.Object r14 = r14.mo27525b()
            com.google.android.apps.gsa.shared.y.au r14 = (com.google.android.apps.gsa.shared.p7195y.C91189au) r14
            java.lang.String r4 = r12.f341890e
            r14.mo85421i(r4, r15)
        L_0x00db:
            r21 = r1
            r17 = r2
            r18 = r6
            r19 = r7
            r20 = r8
            goto L_0x0166
        L_0x00e7:
            r4 = r14 & 2
            if (r4 == 0) goto L_0x00f9
            dagger.a r4 = r13.f297648d
            java.lang.Object r4 = r4.mo27525b()
            com.google.android.apps.gsa.shared.y.au r4 = (com.google.android.apps.gsa.shared.p7195y.C91189au) r4
            java.lang.String r14 = r12.f341888c
            r4.mo85421i(r14, r15)
            goto L_0x00db
        L_0x00f9:
            java.lang.String r4 = r12.f341889d     // Catch:{ NumberFormatException -> 0x0156 }
            r14 = r1
            r17 = r2
            long r1 = java.lang.Long.parseLong(r4)     // Catch:{ NumberFormatException -> 0x014d }
            com.google.android.apps.gsa.staticplugins.ci.f.d r4 = r13.f297653i     // Catch:{ NumberFormatException -> 0x014d }
            r18 = r6
            com.google.android.libraries.gsa.k.g r6 = r13.f297650f     // Catch:{ NumberFormatException -> 0x014f }
            p3186j$.util.Objects.requireNonNull(r15)     // Catch:{ NumberFormatException -> 0x014f }
            r19 = r7
            com.google.android.apps.gsa.staticplugins.ci.f.c r7 = new com.google.android.apps.gsa.staticplugins.ci.f.c     // Catch:{ NumberFormatException -> 0x0151 }
            r7.<init>(r15)     // Catch:{ NumberFormatException -> 0x0151 }
            r20 = r8
            com.google.android.apps.gsa.search.core.i.t r8 = r4.f273199c     // Catch:{ NumberFormatException -> 0x0153 }
            r21 = r14
            com.google.android.apps.gsa.shared.m.d r14 = com.google.android.apps.gsa.shared.p7066m.C90069du.f249728f     // Catch:{ NumberFormatException -> 0x0160 }
            boolean r8 = r8.mo79746e(r14)     // Catch:{ NumberFormatException -> 0x0160 }
            if (r8 != 0) goto L_0x012a
            r8 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r8)     // Catch:{ NumberFormatException -> 0x0160 }
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r1)     // Catch:{ NumberFormatException -> 0x0160 }
            goto L_0x0142
        L_0x012a:
            com.google.android.libraries.gsa.k.g r8 = r4.f273200d     // Catch:{ NumberFormatException -> 0x0160 }
            com.google.android.apps.gsa.staticplugins.ci.f.a r14 = new com.google.android.apps.gsa.staticplugins.ci.f.a     // Catch:{ NumberFormatException -> 0x0160 }
            r14.<init>(r4, r1)     // Catch:{ NumberFormatException -> 0x0160 }
            java.lang.String r1 = "Load icon bitmap"
            com.google.common.util.concurrent.cx r1 = r8.mo28201a(r1, r14)     // Catch:{ NumberFormatException -> 0x0160 }
            com.google.android.apps.gsa.staticplugins.ci.f.b r2 = new com.google.android.apps.gsa.staticplugins.ci.f.b     // Catch:{ NumberFormatException -> 0x0160 }
            r2.<init>(r7)     // Catch:{ NumberFormatException -> 0x0160 }
            java.lang.String r4 = "Set contact thumbnail"
            com.google.common.util.concurrent.cx r1 = r6.mo28209i(r1, r4, r2)     // Catch:{ NumberFormatException -> 0x0160 }
        L_0x0142:
            com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.h.e r2 = new com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.h.e     // Catch:{ NumberFormatException -> 0x0160 }
            r2.<init>(r13, r15)     // Catch:{ NumberFormatException -> 0x0160 }
            com.google.common.util.concurrent.db r4 = r13.f297651g     // Catch:{ NumberFormatException -> 0x0160 }
            com.google.common.util.concurrent.C60856cj.m92911t(r1, r2, r4)     // Catch:{ NumberFormatException -> 0x0160 }
            goto L_0x0166
        L_0x014d:
            r18 = r6
        L_0x014f:
            r19 = r7
        L_0x0151:
            r20 = r8
        L_0x0153:
            r21 = r14
            goto L_0x0160
        L_0x0156:
            r21 = r1
            r17 = r2
            r18 = r6
            r19 = r7
            r20 = r8
        L_0x0160:
            r1 = 2131234108(0x7f080d3c, float:1.8084372E38)
            r15.setBackgroundResource(r1)
        L_0x0166:
            int r1 = r12.f341886a
            r2 = 1
            r1 = r1 & r2
            if (r1 == 0) goto L_0x018c
            java.lang.String r1 = r12.f341887b
            java.lang.String r4 = " "
            r6 = 2
            java.lang.String[] r1 = r1.split(r4, r6)
            r4 = 0
            r6 = r1[r4]
            r3.setText(r6)
            r3.setVisibility(r4)
            int r3 = r1.length
            if (r3 <= r2) goto L_0x0189
            r1 = r1[r2]
            r10.setText(r1)
            r10.setVisibility(r4)
        L_0x0189:
            r1 = 8
            goto L_0x0192
        L_0x018c:
            r1 = 8
            r4 = 0
            r3.setVisibility(r1)
        L_0x0192:
            com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.h.f r3 = new com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.h.f
            r3.<init>(r13, r5, r12)
            r5.setOnClickListener(r3)
            r9.addView(r5)
            int r11 = r11 + 1
            r2 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r1 = r21
            r4 = 8
            r5 = 4
            r10 = 0
            goto L_0x005e
        L_0x01af:
            r21 = r1
            r17 = r2
            r1 = 8
            r2 = 1
            r22.mo95672e()
            r2 = r17
            r1 = r21
            r4 = 8
            r5 = 4
            goto L_0x0038
        L_0x01c2:
            r21 = r1
            goto L_0x0038
        L_0x01c6:
            com.google.android.apps.gsa.smartspace.t r1 = r0.f297629b
            com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.h.g r2 = r0.f297630c
            android.content.Context r3 = r0.f297634g
            android.view.View r2 = r2.mo95674a(r3)
            android.view.ViewGroup r3 = r0.f297631d
            r1.mo86709n(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.p8253h.C106798b.mo95642d(com.google.android.apps.search.assistant.platform.pcp.f.bm):void");
    }

    /* renamed from: e */
    public final void mo95672e() {
        ViewGroup viewGroup;
        View a = this.f297630c.mo95674a(this.f297634g);
        int i = 0;
        while (true) {
            viewGroup = (ViewGroup) a;
            if (i >= viewGroup.getChildCount()) {
                break;
            }
            View childAt = viewGroup.getChildAt(i);
            if (i != 0 && !this.f297628a) {
                childAt.setVisibility(8);
            } else if (childAt.getVisibility() != 0) {
                this.f297629b.mo86711p(childAt);
                childAt.setVisibility(0);
            }
            i++;
        }
        if (this.f297633f != null) {
            if (viewGroup.getChildCount() <= 1) {
                this.f297633f.setVisibility(8);
                return;
            }
            this.f297633f.setVisibility(0);
            if (this.f297628a) {
                this.f297633f.setText(R.string.aa_suggestions_view_less);
            } else {
                this.f297633f.setText(R.string.aa_suggestions_view_more);
            }
        }
    }
}
