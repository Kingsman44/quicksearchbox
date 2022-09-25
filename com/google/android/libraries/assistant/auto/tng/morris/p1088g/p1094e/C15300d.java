package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1094e;

import android.transition.Fade;
import android.transition.Scene;
import android.transition.TransitionManager;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90051dc;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14986h;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14128bb;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14132bf;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14608pn;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1095f.C15352z;
import com.google.android.libraries.p1730f.C21370a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.e.d */
/* compiled from: PG */
public final class C15300d {

    /* renamed from: a */
    public final C14986h f45950a;

    /* renamed from: b */
    public final C86124t f45951b;

    /* renamed from: c */
    public final C21370a f45952c;

    /* renamed from: d */
    public C14608pn f45953d;

    /* renamed from: e */
    public ViewGroup f45954e;

    /* renamed from: f */
    public int f45955f = 1;

    /* renamed from: g */
    private final C14132bf f45956g;

    /* renamed from: h */
    private final C15352z f45957h;

    public C15300d(C14986h hVar, C14132bf bfVar, C15352z zVar, C86124t tVar, C21370a aVar) {
        this.f45950a = hVar;
        this.f45956g = bfVar;
        this.f45957h = zVar;
        this.f45951b = tVar;
        this.f45952c = aVar;
    }

    /* renamed from: b */
    private final void m31884b(View view) {
        view.setOnClickListener(new C14128bb(this.f45956g, new C15272a(this)));
    }

    /* renamed from: c */
    private final void m31885c(View view) {
        if (this.f45951b.mo79746e(C90051dc.f248924u)) {
            this.f45956g.mo21444a(view, 153109);
            return;
        }
        int i = this.f45955f;
        if (i == 3 || i == 4) {
            this.f45956g.mo21444a(view, 133374);
        } else {
            this.f45956g.mo21444a(view, 119949);
        }
    }

    /* renamed from: d */
    private final void m31886d(ViewGroup viewGroup, View view, ContextThemeWrapper contextThemeWrapper, int i) {
        Fade fade = new Fade();
        fade.setDuration((long) contextThemeWrapper.getResources().getInteger(R.integer.motion_fast02));
        fade.setInterpolator(new LinearInterpolator());
        TransitionManager.go(new Scene(viewGroup, view), fade);
        this.f45955f = i;
        m31885c(view.findViewById(R.id.call_tile));
        m31884b(view.findViewById(R.id.call_tile));
    }

    /* JADX WARNING: type inference failed for: r4v15, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r4v28, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo22177a(com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14608pn r17, android.view.ViewGroup r18, android.view.ContextThemeWrapper r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            com.google.android.libraries.assistant.auto.tng.morris.e.pn r4 = r0.f45953d
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0217
            com.google.protobuf.cq r4 = r1.f44170a
            int r4 = r4.size()
            android.view.ViewGroup r5 = r0.f45954e
            r6 = 2132093505(0x7f152a41, float:1.9827437E38)
            r7 = 2131429476(0x7f0b0864, float:1.8480626E38)
            r9 = 2131624483(0x7f0e0223, float:1.8876147E38)
            r10 = 2131624485(0x7f0e0225, float:1.8876151E38)
            r11 = 2131429474(0x7f0b0862, float:1.8480622E38)
            r12 = 4
            r13 = 3
            r14 = 1
            r15 = 2
            if (r5 == 0) goto L_0x002e
            goto L_0x0083
        L_0x002e:
            r0.f45955f = r15
            if (r4 != r14) goto L_0x0038
            r0.f45955f = r13
            r5 = 2131624485(0x7f0e0225, float:1.8876151E38)
            goto L_0x0043
        L_0x0038:
            if (r4 <= r14) goto L_0x0040
            r0.f45955f = r12
            r5 = 2131624484(0x7f0e0224, float:1.887615E38)
            goto L_0x0043
        L_0x0040:
            r5 = 2131624483(0x7f0e0223, float:1.8876147E38)
        L_0x0043:
            android.view.LayoutInflater r8 = android.view.LayoutInflater.from(r19)
            r8.inflate(r5, r2, r14)
            android.view.View r5 = r2.findViewById(r11)
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            r0.f45954e = r5
            int r5 = r0.f45955f
            if (r5 != r15) goto L_0x006e
            com.google.android.apps.gsa.search.core.i.t r5 = r0.f45951b
            com.google.android.apps.gsa.shared.m.d r8 = com.google.android.apps.gsa.shared.p7066m.C90051dc.f248924u
            boolean r5 = r5.mo79746e(r8)
            if (r5 == 0) goto L_0x006e
            android.view.ViewGroup r5 = r0.f45954e
            r5.getClass()
            android.view.View r5 = r5.findViewById(r7)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r5.setText(r6)
        L_0x006e:
            android.view.ViewGroup r5 = r0.f45954e
            r5.getClass()
            r0.m31885c(r5)
            android.view.ViewGroup r5 = r0.f45954e
            r5.getClass()
            r0.m31884b(r5)
            android.view.ViewGroup r5 = r0.f45954e
            r5.getClass()
        L_0x0083:
            r5 = 0
            if (r4 != 0) goto L_0x00bb
            int r4 = r0.f45955f
            if (r4 != r15) goto L_0x008c
            goto L_0x0215
        L_0x008c:
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r19)
            android.view.View r4 = r4.inflate(r9, r2, r5)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            android.view.View r5 = r4.findViewById(r11)
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            r0.f45954e = r5
            com.google.android.apps.gsa.search.core.i.t r5 = r0.f45951b
            com.google.android.apps.gsa.shared.m.d r8 = com.google.android.apps.gsa.shared.p7066m.C90051dc.f248924u
            boolean r5 = r5.mo79746e(r8)
            if (r5 == 0) goto L_0x00b6
            android.view.ViewGroup r5 = r0.f45954e
            r5.getClass()
            android.view.View r5 = r5.findViewById(r7)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r5.setText(r6)
        L_0x00b6:
            r0.m31886d(r2, r4, r3, r15)
            goto L_0x0215
        L_0x00bb:
            r6 = 2132089417(0x7f151a49, float:1.9819145E38)
            java.lang.String r7 = "call"
            r8 = 2131433776(0x7f0b1930, float:1.8489347E38)
            r9 = 0
            if (r4 != r14) goto L_0x014c
            int r4 = r0.f45955f
            if (r4 == r13) goto L_0x00dd
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r19)
            android.view.View r4 = r4.inflate(r10, r2, r5)
            r9 = r4
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            android.view.View r4 = r9.findViewById(r11)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            r0.f45954e = r4
        L_0x00dd:
            com.google.android.libraries.assistant.auto.tng.morris.g.f.z r4 = r0.f45957h
            android.view.ViewGroup r10 = r0.f45954e
            r10.getClass()
            r11 = 2131429477(0x7f0b0865, float:1.8480628E38)
            android.view.View r10 = r10.findViewById(r11)
            android.widget.ImageView r10 = (android.widget.ImageView) r10
            com.google.protobuf.cq r11 = r1.f44170a
            java.lang.Object r11 = r11.get(r5)
            com.google.android.libraries.assistant.auto.tng.morris.e.pm r11 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14607pm) r11
            com.google.android.libraries.assistant.auto.tng.morris.e.gj r11 = r11.f44166b
            if (r11 != 0) goto L_0x00fb
            com.google.android.libraries.assistant.auto.tng.morris.e.gj r11 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14361gj.f43456e
        L_0x00fb:
            com.google.android.libraries.assistant.auto.tng.morris.g.e.b r12 = com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1094e.C15298b.f45948a
            r4.mo22229l(r10, r11, r12)
            android.view.ViewGroup r4 = r0.f45954e
            r4.getClass()
            r10 = 2131429483(0x7f0b086b, float:1.848064E38)
            android.view.View r4 = r4.findViewById(r10)
            android.widget.TextView r4 = (android.widget.TextView) r4
            com.google.protobuf.cq r10 = r1.f44170a
            java.lang.Object r10 = r10.get(r5)
            com.google.android.libraries.assistant.auto.tng.morris.e.pm r10 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14607pm) r10
            java.lang.String r10 = r10.f44165a
            r4.setText(r10)
            android.view.ViewGroup r4 = r0.f45954e
            r4.getClass()
            android.view.View r4 = r4.findViewById(r8)
            android.widget.TextView r4 = (android.widget.TextView) r4
            java.lang.Object[] r8 = new java.lang.Object[r15]
            r8[r5] = r7
            com.google.protobuf.cq r7 = r1.f44170a
            java.lang.Object r5 = r7.get(r5)
            com.google.android.libraries.assistant.auto.tng.morris.e.pm r5 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14607pm) r5
            int r5 = r5.f44167c
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r8[r14] = r5
            java.lang.String r5 = com.android.p265e.C5114a.m13987a(r3, r6, r8)
            r4.setText(r5)
            int r4 = r0.f45955f
            if (r4 == r13) goto L_0x0215
            if (r9 == 0) goto L_0x0215
            r0.m31886d(r2, r9, r3, r13)
            goto L_0x0215
        L_0x014c:
            int r4 = r0.f45955f
            if (r4 == r12) goto L_0x0166
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r19)
            r9 = 2131624484(0x7f0e0224, float:1.887615E38)
            android.view.View r4 = r4.inflate(r9, r2, r5)
            r9 = r4
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            android.view.View r4 = r9.findViewById(r11)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            r0.f45954e = r4
        L_0x0166:
            com.google.android.libraries.assistant.auto.tng.morris.g.f.z r4 = r0.f45957h
            android.view.ViewGroup r10 = r0.f45954e
            r10.getClass()
            r11 = 2131429478(0x7f0b0866, float:1.848063E38)
            android.view.View r10 = r10.findViewById(r11)
            android.widget.ImageView r10 = (android.widget.ImageView) r10
            com.google.protobuf.cq r11 = r1.f44170a
            java.lang.Object r11 = r11.get(r5)
            com.google.android.libraries.assistant.auto.tng.morris.e.pm r11 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14607pm) r11
            com.google.android.libraries.assistant.auto.tng.morris.e.gj r11 = r11.f44166b
            if (r11 != 0) goto L_0x0184
            com.google.android.libraries.assistant.auto.tng.morris.e.gj r11 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14361gj.f43456e
        L_0x0184:
            com.google.android.libraries.assistant.auto.tng.morris.g.e.b r13 = com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1094e.C15298b.f45948a
            r4.mo22229l(r10, r11, r13)
            com.google.android.libraries.assistant.auto.tng.morris.g.f.z r4 = r0.f45957h
            android.view.ViewGroup r10 = r0.f45954e
            r10.getClass()
            r11 = 2131429480(0x7f0b0868, float:1.8480634E38)
            android.view.View r10 = r10.findViewById(r11)
            android.widget.ImageView r10 = (android.widget.ImageView) r10
            com.google.protobuf.cq r11 = r1.f44170a
            java.lang.Object r11 = r11.get(r14)
            com.google.android.libraries.assistant.auto.tng.morris.e.pm r11 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14607pm) r11
            com.google.android.libraries.assistant.auto.tng.morris.e.gj r11 = r11.f44166b
            if (r11 != 0) goto L_0x01a7
            com.google.android.libraries.assistant.auto.tng.morris.e.gj r11 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14361gj.f43456e
        L_0x01a7:
            com.google.android.libraries.assistant.auto.tng.morris.g.e.b r13 = com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1094e.C15298b.f45948a
            r4.mo22229l(r10, r11, r13)
            android.view.ViewGroup r4 = r0.f45954e
            r4.getClass()
            r10 = 2131429482(0x7f0b086a, float:1.8480638E38)
            android.view.View r4 = r4.findViewById(r10)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            com.google.protobuf.cq r10 = r1.f44170a
            int r10 = r10.size()
            if (r10 <= r15) goto L_0x01db
            r4.setVisibility(r5)
            com.google.android.libraries.assistant.auto.tng.morris.g.f.z r10 = r0.f45957h
            com.google.protobuf.cq r11 = r1.f44170a
            java.lang.Object r11 = r11.get(r15)
            com.google.android.libraries.assistant.auto.tng.morris.e.pm r11 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14607pm) r11
            com.google.android.libraries.assistant.auto.tng.morris.e.gj r11 = r11.f44166b
            if (r11 != 0) goto L_0x01d5
            com.google.android.libraries.assistant.auto.tng.morris.e.gj r11 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14361gj.f43456e
        L_0x01d5:
            com.google.android.libraries.assistant.auto.tng.morris.g.e.b r13 = com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1094e.C15298b.f45948a
            r10.mo22229l(r4, r11, r13)
            goto L_0x01e0
        L_0x01db:
            r10 = 8
            r4.setVisibility(r10)
        L_0x01e0:
            android.view.ViewGroup r4 = r0.f45954e
            r4.getClass()
            android.view.View r4 = r4.findViewById(r8)
            android.widget.TextView r4 = (android.widget.TextView) r4
            java.lang.Object[] r8 = new java.lang.Object[r15]
            r8[r5] = r7
            com.google.protobuf.cq r5 = r1.f44170a
            j$.util.stream.Stream r5 = p3186j$.util.Collection.EL.stream(r5)
            com.google.android.libraries.assistant.auto.tng.morris.g.e.c r7 = com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1094e.C15299c.f45949a
            j$.util.stream.IntStream r5 = r5.mapToInt(r7)
            int r5 = r5.sum()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r8[r14] = r5
            java.lang.String r5 = com.android.p265e.C5114a.m13987a(r3, r6, r8)
            r4.setText(r5)
            int r4 = r0.f45955f
            if (r4 == r12) goto L_0x0215
            if (r9 == 0) goto L_0x0215
            r0.m31886d(r2, r9, r3, r12)
        L_0x0215:
            r0.f45953d = r1
        L_0x0217:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1094e.C15300d.mo22177a(com.google.android.libraries.assistant.auto.tng.morris.e.pn, android.view.ViewGroup, android.view.ContextThemeWrapper):void");
    }
}
