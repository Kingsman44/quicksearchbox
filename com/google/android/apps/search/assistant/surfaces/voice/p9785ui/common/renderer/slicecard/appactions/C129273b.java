package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.slicecard.appactions;

import android.content.Context;
import android.content.pm.PackageManager;
import android.support.p031v4.app.Fragment;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.slice.widget.SliceView;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.actions.C127118j;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.slicecard.C129285j;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.slicecard.appactions.b */
/* compiled from: PG */
public final class C129273b implements C129285j {

    /* renamed from: a */
    public static final C59071e f355071a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.slicecard.appactions.b");

    /* renamed from: b */
    public final Fragment f355072b;

    /* renamed from: c */
    public final PackageManager f355073c;

    /* renamed from: d */
    private final Context f355074d;

    /* renamed from: e */
    private final C127118j f355075e;

    /* renamed from: f */
    private final TextView f355076f;

    /* renamed from: g */
    private final LinearLayout f355077g;

    /* renamed from: h */
    private final LinearLayout f355078h;

    /* renamed from: i */
    private final ImageView f355079i;

    /* renamed from: j */
    private final TextView f355080j;

    /* renamed from: k */
    private final TextView f355081k;

    /* renamed from: l */
    private final SliceView f355082l;

    public C129273b(Context context, Fragment fragment, PackageManager packageManager, AppActionsSliceCardView appActionsSliceCardView, C127118j jVar) {
        this.f355074d = context;
        this.f355072b = fragment;
        this.f355073c = packageManager;
        this.f355075e = jVar;
        TextView textView = (TextView) appActionsSliceCardView.findViewById(R.id.assistant_slice_text);
        textView.getClass();
        this.f355076f = textView;
        LinearLayout linearLayout = (LinearLayout) appActionsSliceCardView.findViewById(R.id.assistant_slice_view_container);
        linearLayout.getClass();
        this.f355077g = linearLayout;
        LinearLayout linearLayout2 = (LinearLayout) appActionsSliceCardView.findViewById(R.id.assistant_slice_view_header);
        linearLayout2.getClass();
        this.f355078h = linearLayout2;
        ImageView imageView = (ImageView) appActionsSliceCardView.findViewById(R.id.assistant_slice_view_header_app_icon);
        imageView.getClass();
        this.f355079i = imageView;
        TextView textView2 = (TextView) appActionsSliceCardView.findViewById(R.id.assistant_slice_view_header_app_name);
        textView2.getClass();
        this.f355080j = textView2;
        TextView textView3 = (TextView) appActionsSliceCardView.findViewById(R.id.assistant_slice_view_header_title);
        textView3.getClass();
        this.f355081k = textView3;
        SliceView sliceView = (SliceView) appActionsSliceCardView.findViewById(R.id.assistant_slice_view);
        sliceView.getClass();
        this.f355082l = sliceView;
        sliceView.mo8670e(true);
        sliceView.mo8674i();
    }

    /* renamed from: a */
    public final void mo108937a(int i) {
        this.f355082l.mo8673h(i);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo108938b(androidx.slice.Slice r13) {
        /*
            r12 = this;
            androidx.slice.SliceItem[] r0 = r13.f13088d
            java.util.List r0 = java.util.Arrays.asList(r0)
            int r0 = r0.size()
            java.lang.String r1 = "assistantTts"
            r2 = 0
            r3 = 1
            r4 = 3
            if (r0 >= r4) goto L_0x0013
            goto L_0x0095
        L_0x0013:
            android.content.Context r0 = r12.f355074d
            androidx.slice.i r5 = new androidx.slice.i
            r5.<init>(r0, r13)
            android.os.Bundle r0 = r5.f13139e
            java.lang.String r0 = r0.getString(r1)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x003f
            androidx.slice.SliceItem[] r0 = r13.f13088d
            java.util.List r0 = java.util.Arrays.asList(r0)
            androidx.slice.SliceItem[] r5 = r13.f13088d
            java.util.List r5 = java.util.Arrays.asList(r5)
            int r5 = r5.size()
            int r5 = r5 + -2
            java.lang.Object r0 = r0.get(r5)
            androidx.slice.SliceItem r0 = (androidx.slice.SliceItem) r0
            goto L_0x004b
        L_0x003f:
            androidx.slice.SliceItem[] r0 = r13.f13088d
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.lang.Object r0 = com.google.common.p4522b.C58557jl.m90131l(r0)
            androidx.slice.SliceItem r0 = (androidx.slice.SliceItem) r0
        L_0x004b:
            java.lang.String r5 = r0.f13092b
            java.lang.String r6 = "slice"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0095
            androidx.slice.Slice r0 = r0.mo8596d()
            if (r0 == 0) goto L_0x0095
            androidx.slice.SliceItem[] r0 = r0.f13088d
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.lang.Object r0 = com.google.common.p4522b.C58557jl.m90131l(r0)
            androidx.slice.SliceItem r0 = (androidx.slice.SliceItem) r0
            java.lang.String r5 = r0.f13092b
            java.lang.String r6 = "text"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0095
            java.lang.Object r0 = r0.f13094d
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r0 = r0.trim()
            boolean r5 = r0.isEmpty()
            if (r5 != 0) goto L_0x0095
            android.widget.TextView r5 = r12.f355081k
            android.content.Context r6 = r12.f355074d
            java.lang.Object[] r7 = new java.lang.Object[r3]
            r7[r2] = r0
            r0 = 2132085028(0x7f150924, float:1.9810243E38)
            java.lang.String r0 = r6.getString(r0, r7)
            r5.setText(r0)
        L_0x0095:
            java.lang.String r0 = r13.f13090f
            android.net.Uri r0 = android.net.Uri.parse(r0)
            java.lang.String r0 = r0.getAuthority()
            if (r0 != 0) goto L_0x00a2
            goto L_0x00d2
        L_0x00a2:
            android.content.pm.PackageManager r5 = r12.f355073c
            android.content.pm.ProviderInfo r0 = r5.resolveContentProvider(r0, r2)
            if (r0 == 0) goto L_0x00d2
            android.widget.ImageView r5 = r12.f355079i
            android.content.pm.PackageManager r6 = r12.f355073c
            android.content.pm.ApplicationInfo r7 = r0.applicationInfo
            android.graphics.drawable.Drawable r6 = r6.getApplicationIcon(r7)
            r5.setImageDrawable(r6)
            android.content.pm.PackageManager r5 = r12.f355073c
            android.content.pm.ApplicationInfo r6 = r0.applicationInfo
            java.lang.CharSequence r5 = r5.getApplicationLabel(r6)
            java.lang.String r5 = r5.toString()
            android.widget.TextView r6 = r12.f355080j
            r6.setText(r5)
            android.widget.LinearLayout r5 = r12.f355078h
            com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.slicecard.appactions.a r6 = new com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.slicecard.appactions.a
            r6.<init>(r12, r0)
            r5.setOnClickListener(r6)
        L_0x00d2:
            androidx.slice.widget.SliceView r0 = r12.f355082l
            r0.mo8671f(r13)
            android.content.Context r0 = r12.f355074d
            androidx.slice.i r5 = new androidx.slice.i
            r5.<init>(r0, r13)
            android.os.Bundle r0 = r5.f13139e
            java.lang.String r0 = r0.getString(r1)
            if (r0 == 0) goto L_0x00f0
            android.widget.TextView r5 = r12.f355076f
            r5.setVisibility(r2)
            android.widget.TextView r5 = r12.f355076f
            r5.setText(r0)
        L_0x00f0:
            android.widget.LinearLayout r0 = r12.f355077g
            r0.setVisibility(r2)
            android.content.Context r0 = r12.f355074d
            androidx.slice.i r5 = new androidx.slice.i
            r5.<init>(r0, r13)
            android.os.Bundle r13 = r5.f13139e
            boolean r0 = r13.isEmpty()
            if (r0 == 0) goto L_0x0105
            return
        L_0x0105:
            com.google.assistant.e.j.akj r0 = com.google.assistant.p3897e.p3921j.akj.f135267f
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.e.j.akf r0 = (com.google.assistant.p3897e.p3921j.akf) r0
            java.lang.String r5 = r13.getString(r1)
            if (r5 == 0) goto L_0x0128
            java.lang.String r1 = r13.getString(r1)
            r1.getClass()
            r0.copyOnWrite()
            com.google.protobuf.bv r5 = r0.instance
            com.google.assistant.e.j.akj r5 = (com.google.assistant.p3897e.p3921j.akj) r5
            int r6 = r5.f135269a
            r6 = r6 | r3
            r5.f135269a = r6
            r5.f135270b = r1
        L_0x0128:
            java.lang.String r1 = "assistantTtsSsml"
            java.lang.String r5 = r13.getString(r1)
            r6 = 2
            if (r5 == 0) goto L_0x0146
            java.lang.String r1 = r13.getString(r1)
            r1.getClass()
            r0.copyOnWrite()
            com.google.protobuf.bv r5 = r0.instance
            com.google.assistant.e.j.akj r5 = (com.google.assistant.p3897e.p3921j.akj) r5
            int r7 = r5.f135269a
            r7 = r7 | r6
            r5.f135269a = r7
            r5.f135271c = r1
        L_0x0146:
            java.lang.String r1 = "assistantTtsLang"
            java.lang.String r5 = r13.getString(r1)
            r7 = 4
            if (r5 == 0) goto L_0x0164
            java.lang.String r1 = r13.getString(r1)
            r1.getClass()
            r0.copyOnWrite()
            com.google.protobuf.bv r5 = r0.instance
            com.google.assistant.e.j.akj r5 = (com.google.assistant.p3897e.p3921j.akj) r5
            int r8 = r5.f135269a
            r8 = r8 | r7
            r5.f135269a = r8
            r5.f135272d = r1
        L_0x0164:
            java.lang.String r1 = "assistantDialogFieldStates"
            java.lang.String[] r5 = r13.getStringArray(r1)
            if (r5 == 0) goto L_0x0210
            java.lang.String[] r13 = r13.getStringArray(r1)
            r13.getClass()
            java.lang.String[] r13 = (java.lang.String[]) r13
            java.util.List r13 = java.util.Arrays.asList(r13)
            int r1 = r13.size()
            int r1 = r1 % r6
            if (r1 != 0) goto L_0x0210
            java.util.List r13 = com.google.common.p4522b.C58597ky.m90215f(r13, r6)
            java.util.Iterator r13 = r13.iterator()
        L_0x0188:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L_0x0210
            java.lang.Object r1 = r13.next()
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r5 = r1.get(r3)
            java.lang.String r5 = (java.lang.String) r5
            int r8 = r5.hashCode()
            r9 = -1
            switch(r8) {
                case -1422950650: goto L_0x01c1;
                case -995582717: goto L_0x01b7;
                case -840170026: goto L_0x01ad;
                case -599445191: goto L_0x01a3;
                default: goto L_0x01a2;
            }
        L_0x01a2:
            goto L_0x01cb
        L_0x01a3:
            java.lang.String r8 = "complete"
            boolean r5 = r5.equals(r8)
            if (r5 == 0) goto L_0x01cb
            r5 = 2
            goto L_0x01cc
        L_0x01ad:
            java.lang.String r8 = "unused"
            boolean r5 = r5.equals(r8)
            if (r5 == 0) goto L_0x01cb
            r5 = 3
            goto L_0x01cc
        L_0x01b7:
            java.lang.String r8 = "prompted"
            boolean r5 = r5.equals(r8)
            if (r5 == 0) goto L_0x01cb
            r5 = 1
            goto L_0x01cc
        L_0x01c1:
            java.lang.String r8 = "active"
            boolean r5 = r5.equals(r8)
            if (r5 == 0) goto L_0x01cb
            r5 = 0
            goto L_0x01cc
        L_0x01cb:
            r5 = -1
        L_0x01cc:
            if (r5 == 0) goto L_0x01dc
            if (r5 == r3) goto L_0x01da
            if (r5 == r6) goto L_0x01d8
            if (r5 == r4) goto L_0x01d6
            r5 = 1
            goto L_0x01dd
        L_0x01d6:
            r5 = 5
            goto L_0x01dd
        L_0x01d8:
            r5 = 4
            goto L_0x01dd
        L_0x01da:
            r5 = 3
            goto L_0x01dd
        L_0x01dc:
            r5 = 2
        L_0x01dd:
            com.google.assistant.e.j.aki r8 = com.google.assistant.p3897e.p3921j.aki.f135262d
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.assistant.e.j.akg r8 = (com.google.assistant.p3897e.p3921j.akg) r8
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            r8.copyOnWrite()
            com.google.protobuf.bv r10 = r8.instance
            com.google.assistant.e.j.aki r10 = (com.google.assistant.p3897e.p3921j.aki) r10
            r1.getClass()
            int r11 = r10.f135264a
            r11 = r11 | r3
            r10.f135264a = r11
            r10.f135265b = r1
            r8.copyOnWrite()
            com.google.protobuf.bv r1 = r8.instance
            com.google.assistant.e.j.aki r1 = (com.google.assistant.p3897e.p3921j.aki) r1
            int r5 = r5 + r9
            r1.f135266c = r5
            int r5 = r1.f135264a
            r5 = r5 | r6
            r1.f135264a = r5
            r0.mo53690a(r8)
            goto L_0x0188
        L_0x0210:
            com.google.assistant.e.j.du r13 = com.google.assistant.p3897e.p3921j.C51805du.f135924e
            com.google.protobuf.bn r13 = r13.createBuilder()
            com.google.assistant.e.j.ds r13 = (com.google.assistant.p3897e.p3921j.C51803ds) r13
            r13.copyOnWrite()
            com.google.protobuf.bv r1 = r13.instance
            com.google.assistant.e.j.du r1 = (com.google.assistant.p3897e.p3921j.C51805du) r1
            int r2 = r1.f135926a
            r2 = r2 | r3
            r1.f135926a = r2
            java.lang.String r2 = "slice.DIALOG_INFO"
            r1.f135927b = r2
            com.google.assistant.e.j.ka r1 = com.google.assistant.p3897e.p3921j.C52230ka.f137057d
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.assistant.e.j.jz r1 = (com.google.assistant.p3897e.p3921j.C52228jz) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.assistant.e.j.ka r2 = (com.google.assistant.p3897e.p3921j.C52230ka) r2
            int r4 = r2.f137059a
            r3 = r3 | r4
            r2.f137059a = r3
            java.lang.String r3 = "assistant.api.client_input.SliceDialogInfoInput"
            r2.f137060b = r3
            com.google.protobuf.bv r0 = r0.build()
            com.google.assistant.e.j.akj r0 = (com.google.assistant.p3897e.p3921j.akj) r0
            com.google.protobuf.z r0 = r0.toByteString()
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.assistant.e.j.ka r2 = (com.google.assistant.p3897e.p3921j.C52230ka) r2
            r0.getClass()
            int r3 = r2.f137059a
            r3 = r3 | r6
            r2.f137059a = r3
            r2.f137061c = r0
            com.google.protobuf.bv r0 = r1.build()
            com.google.assistant.e.j.ka r0 = (com.google.assistant.p3897e.p3921j.C52230ka) r0
            java.lang.String r1 = "slice_dialog_info_input"
            r13.mo53729a(r1, r0)
            com.google.protobuf.bv r13 = r13.build()
            com.google.assistant.e.j.du r13 = (com.google.assistant.p3897e.p3921j.C51805du) r13
            com.google.android.apps.search.assistant.surfaces.voice.controller.ui.actions.j r0 = r12.f355075e
            com.google.android.apps.search.assistant.surfaces.voice.f.a.g.b r1 = com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9600g.C127454b.CLIENT_INPUT
            com.google.android.apps.search.assistant.surfaces.voice.controller.ui.actions.b r13 = com.google.android.apps.search.assistant.surfaces.voice.p9590e.C127407d.m208361a(r1, r13)
            r0.mo107931g(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.slicecard.appactions.C129273b.mo108938b(androidx.slice.Slice):void");
    }
}
