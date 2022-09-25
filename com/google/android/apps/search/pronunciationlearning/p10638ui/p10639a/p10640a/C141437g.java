package com.google.android.apps.search.pronunciationlearning.p10638ui.p10639a.p10640a;

import android.view.View;

/* renamed from: com.google.android.apps.search.pronunciationlearning.ui.a.a.g */
/* compiled from: PG */
final class C141437g implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C141432c f383907a;

    public C141437g(C141432c cVar) {
        this.f383907a = cVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000e, code lost:
        r0 = (android.widget.TextView) r0.findViewById(com.google.android.googlequicksearchbox.R.id.pronunciationlearning_next_button);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r10) {
        /*
            r9 = this;
            com.google.android.apps.search.pronunciationlearning.ui.a.a.c r10 = r9.f383907a
            com.google.android.apps.search.pronunciationlearning.ui.a.a.b r0 = r10.f383896b
            android.view.View r0 = r0.getView()
            r1 = 2131435077(0x7f0b1e45, float:1.8491986E38)
            r2 = 0
            if (r0 == 0) goto L_0x001b
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 == 0) goto L_0x001b
            boolean r0 = r0.isEnabled()
            goto L_0x001c
        L_0x001b:
            r0 = 0
        L_0x001c:
            com.google.common.f.e r3 = com.google.android.apps.search.pronunciationlearning.p10638ui.p10639a.p10640a.C141432c.f383895a
            com.google.common.f.x r3 = r3.mo56224b()
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            com.google.common.f.n r5 = new com.google.common.f.n
            r6 = 41701(0xa2e5, float:5.8436E-41)
            r5.<init>(r6)
            r3.mo56379ah(r5)
            java.lang.String r5 = "Check Enabled %s"
            r3.mo56389s(r5, r4)
            if (r0 == 0) goto L_0x012c
            com.google.android.apps.search.pronunciationlearning.ui.a.a.b r0 = r10.f383896b
            android.view.View r0 = r0.getView()
            r3 = 2131435097(0x7f0b1e59, float:1.8492027E38)
            r4 = 0
            if (r0 == 0) goto L_0x004d
            android.view.View r0 = r0.findViewById(r3)
            com.google.android.apps.search.pronunciationlearning.ui.shared.WordChipsView r0 = (com.google.android.apps.search.pronunciationlearning.p10638ui.shared.WordChipsView) r0
            goto L_0x004e
        L_0x004d:
            r0 = r4
        L_0x004e:
            if (r0 == 0) goto L_0x008e
            com.google.android.apps.search.pronunciationlearning.ui.shared.f r0 = r0.mo17754z()
            com.google.common.f.e r5 = com.google.android.apps.search.pronunciationlearning.p10638ui.shared.C141513f.f384128a
            com.google.common.f.x r5 = r5.mo56224b()
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5
            android.widget.TextView r6 = r0.f384132e
            if (r6 == 0) goto L_0x0065
            java.lang.CharSequence r6 = r6.getText()
            goto L_0x0066
        L_0x0065:
            r6 = r4
        L_0x0066:
            com.google.common.f.n r7 = new com.google.common.f.n
            r8 = 41717(0xa2f5, float:5.8458E-41)
            r7.<init>(r8)
            r5.mo56379ah(r7)
            java.lang.String r7 = "Current word chip being checked value: %s"
            r5.mo56389s(r7, r6)
            android.widget.TextView r5 = r0.f384132e
            if (r5 == 0) goto L_0x007e
            java.lang.CharSequence r4 = r5.getText()
        L_0x007e:
            java.lang.String r5 = "llego"
            boolean r4 = p5462h.p5473f.p5475b.C69664n.m101066l(r4, r5)
            com.google.android.apps.search.pronunciationlearning.ui.shared.f$a r5 = new com.google.android.apps.search.pronunciationlearning.ui.shared.f$a
            r5.<init>(r4)
            android.widget.TextView r0 = r0.f384132e
            com.google.apps.tiktok.p3674l.p3679c.C47393f.m84237h(r5, r0)
        L_0x008e:
            java.util.concurrent.atomic.AtomicInteger r0 = r10.f383899e
            int r0 = r0.get()
            r4 = 2
            if (r0 == r4) goto L_0x009b
            boolean r0 = r10.f383900f
            if (r0 == 0) goto L_0x012c
        L_0x009b:
            com.google.android.apps.search.pronunciationlearning.ui.a.a.b r0 = r10.f383896b
            android.view.View r0 = r0.requireView()
            r4 = 2131435076(0x7f0b1e44, float:1.8491984E38)
            android.view.View r4 = r0.findViewById(r4)
            java.lang.String r5 = "findViewById<TextView>(R…learning_native_sentence)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r5)
            r5 = 8
            r4.setVisibility(r5)
            r4 = 2131435070(0x7f0b1e3e, float:1.8491972E38)
            android.view.View r4 = r0.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            android.text.SpannableString r6 = new android.text.SpannableString
            android.content.res.Resources r7 = r0.getResources()
            r8 = 2132091703(0x7f152337, float:1.9823782E38)
            java.lang.String r7 = r7.getString(r8)
            r6.<init>(r7)
            android.text.style.ForegroundColorSpan r7 = new android.text.style.ForegroundColorSpan
            com.google.android.apps.search.pronunciationlearning.ui.a.a.b r10 = r10.f383896b
            android.content.Context r10 = r10.getContext()
            p5462h.p5473f.p5475b.C69664n.m101058d(r10)
            r8 = 2131103412(0x7f060eb4, float:1.781929E38)
            int r10 = androidx.core.content.C1878d.m5128a(r10, r8)
            r7.<init>(r10)
            int r10 = r6.length()
            r8 = 33
            r6.setSpan(r7, r2, r10, r8)
            android.widget.TextView$BufferType r10 = android.widget.TextView.BufferType.SPANNABLE
            r4.setText(r6, r10)
            r10 = 2131435087(0x7f0b1e4f, float:1.8492006E38)
            android.view.View r10 = r0.findViewById(r10)
            java.lang.String r4 = "findViewById<ImageButton…ning_sentence_tts_button)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r4)
            r10.setVisibility(r5)
            android.view.View r10 = r0.findViewById(r3)
            java.lang.String r3 = "findViewById<WordChipsVi…ionlearning_word_options)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r3)
            r10.setVisibility(r5)
            r10 = 2131435064(0x7f0b1e38, float:1.849196E38)
            android.view.View r10 = r0.findViewById(r10)
            java.lang.String r3 = "findViewById<ImageView>(…onlearning_good_job_icon)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r3)
            r10.setVisibility(r2)
            android.view.View r10 = r0.findViewById(r1)
            android.widget.TextView r10 = (android.widget.TextView) r10
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2132091715(0x7f152343, float:1.9823806E38)
            java.lang.String r0 = r0.getString(r1)
            r10.setText(r0)
        L_0x012c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.pronunciationlearning.p10638ui.p10639a.p10640a.C141437g.onClick(android.view.View):void");
    }
}
