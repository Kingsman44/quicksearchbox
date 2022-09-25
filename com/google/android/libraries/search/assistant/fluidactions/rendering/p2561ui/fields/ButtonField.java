package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.p031v4.app.Fragment;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.assistant.fluidactions.p2535a.C32942a;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33177b;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33182g;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33184i;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.p2556a.C33176f;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.components.ButtonComponent;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.components.FullButtonComponent;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.ButtonField */
/* compiled from: PG */
public final class ButtonField extends LinearLayout implements C33177b {

    /* renamed from: a */
    public static final C59071e f89013a = C59071e.m91332i("com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.ButtonField");

    /* renamed from: b */
    public C51941eu f89014b;

    /* renamed from: c */
    public C33184i f89015c;

    /* renamed from: d */
    public Fragment f89016d;

    /* renamed from: e */
    public C33182g f89017e;

    /* renamed from: f */
    public C32942a f89018f;

    /* renamed from: g */
    public ButtonComponent f89019g = null;

    /* renamed from: h */
    private FullButtonComponent f89020h = null;

    /* renamed from: i */
    private boolean f89021i;

    public ButtonField(Context context) {
        super(context);
    }

    /* renamed from: a */
    private final void m61715a(Context context, AttributeSet attributeSet, int i) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C33344cw.f89384a, i, 0);
            try {
                this.f89021i = obtainStyledAttributes.getBoolean(0, false);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    /* renamed from: b */
    public final /* synthetic */ void mo38561b(C33176f fVar) {
    }

    /* renamed from: c */
    public final /* synthetic */ void mo38562c() {
    }

    /* renamed from: d */
    public final /* synthetic */ void mo38563d(boolean z) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c1 A[SYNTHETIC, Splitter:B:42:0x00c1] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0153  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo38564e(com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33180e r11) {
        /*
            r10 = this;
            java.lang.String r0 = ""
            com.google.assistant.e.j.e.eu r1 = r10.f89014b
            if (r1 == 0) goto L_0x020e
            com.google.android.libraries.search.assistant.fluidactions.rendering.a.g r2 = r10.f89017e
            if (r2 == 0) goto L_0x020e
            com.google.android.libraries.search.assistant.fluidactions.rendering.a.i r2 = r10.f89015c
            if (r2 != 0) goto L_0x0010
            goto L_0x020e
        L_0x0010:
            com.google.assistant.e.j.e.eu r11 = r11.f88747a
            if (r11 == 0) goto L_0x0021
            boolean r1 = r11.equals(r1)
            if (r1 != 0) goto L_0x0021
            r10.f89014b = r11
            com.google.android.libraries.search.assistant.fluidactions.rendering.a.g r1 = r10.f89017e
            r1.mo38581f(r11)
        L_0x0021:
            com.google.assistant.e.j.e.eu r11 = r10.f89014b
            int r1 = r11.f136277e
            r2 = 17
            if (r1 != r2) goto L_0x020d
            java.lang.Object r11 = r11.f136278f
            com.google.assistant.e.c.c.ah r11 = (com.google.assistant.p3897e.p3902c.p3907c.C50936ah) r11
            com.google.android.libraries.search.assistant.fluidactions.rendering.a.i r1 = r10.f89015c
            com.google.assistant.e.j.e.fc r1 = r1.f88751a
            com.google.assistant.e.j.e.fc r2 = com.google.assistant.p3897e.p3921j.p3926e.C51950fc.FORM_UI_THEME_IRIS_GLANCEABILITY
            int r3 = r11.f132602h
            com.google.assistant.e.c.c.ac r3 = com.google.assistant.p3897e.p3902c.p3907c.C50931ac.m85981a(r3)
            if (r3 != 0) goto L_0x003d
            com.google.assistant.e.c.c.ac r3 = com.google.assistant.p3897e.p3902c.p3907c.C50931ac.DEFAULT
        L_0x003d:
            com.google.assistant.e.c.c.ac r4 = com.google.assistant.p3897e.p3902c.p3907c.C50931ac.FULL_WIDTH
            r5 = 2
            r6 = 1
            r7 = 0
            if (r3 != r4) goto L_0x0189
            com.google.android.libraries.search.assistant.fluidactions.rendering.ui.components.FullButtonComponent r1 = r10.f89020h
            if (r1 == 0) goto L_0x01dd
            r1.setVisibility(r7)
            com.google.android.libraries.search.assistant.fluidactions.rendering.ui.components.FullButtonComponent r1 = r10.f89020h
            com.google.android.libraries.search.assistant.fluidactions.rendering.a.i r2 = r10.f89015c
            int r3 = r11.f132596b
            java.lang.String r4 = "Invalid package name: %s"
            if (r3 != r6) goto L_0x005e
            java.lang.Object r0 = r11.f132597c
            java.lang.String r0 = (java.lang.String) r0
            r1.mo38646a(r0)
        L_0x005c:
            r6 = 0
            goto L_0x00b2
        L_0x005e:
            r8 = 11
            if (r3 != r8) goto L_0x00b2
            android.content.Context r3 = r1.getContext()     // Catch:{ NameNotFoundException -> 0x008e }
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch:{ NameNotFoundException -> 0x008e }
            int r6 = r11.f132596b     // Catch:{ NameNotFoundException -> 0x008e }
            if (r6 != r8) goto L_0x0073
            java.lang.Object r6 = r11.f132597c     // Catch:{ NameNotFoundException -> 0x008e }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ NameNotFoundException -> 0x008e }
            goto L_0x0074
        L_0x0073:
            r6 = r0
        L_0x0074:
            r9 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r3 = r3.getApplicationInfo(r6, r9)     // Catch:{ NameNotFoundException -> 0x008e }
            android.content.Context r6 = r1.getContext()     // Catch:{ NameNotFoundException -> 0x008e }
            android.content.pm.PackageManager r6 = r6.getPackageManager()     // Catch:{ NameNotFoundException -> 0x008e }
            java.lang.CharSequence r3 = r6.getApplicationLabel(r3)     // Catch:{ NameNotFoundException -> 0x008e }
            java.lang.String r3 = r3.toString()     // Catch:{ NameNotFoundException -> 0x008e }
            r1.mo38646a(r3)     // Catch:{ NameNotFoundException -> 0x008e }
            goto L_0x005c
        L_0x008e:
            r3 = move-exception
            com.google.common.f.e r6 = com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.components.FullButtonComponent.f88952a
            com.google.common.f.x r6 = r6.mo56225c()
            com.google.common.f.c r6 = (com.google.common.p4526f.C59052c) r6
            com.google.common.f.x r3 = r6.mo56382g(r3)
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3
            r6 = 50980(0xc724, float:7.1438E-41)
            com.google.common.f.x r3 = r3.mo56372aa(r6)
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3
            int r6 = r11.f132596b
            if (r6 != r8) goto L_0x00ae
            java.lang.Object r0 = r11.f132597c
            java.lang.String r0 = (java.lang.String) r0
        L_0x00ae:
            r3.mo56389s(r4, r0)
            goto L_0x005c
        L_0x00b2:
            com.google.assistant.e.c.c.dc r0 = r11.f132601g
            if (r0 != 0) goto L_0x00b8
            com.google.assistant.e.c.c.dc r0 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k
        L_0x00b8:
            java.lang.String r0 = r0.f132821g
            boolean r0 = r0.isEmpty()
            r3 = 0
            if (r0 != 0) goto L_0x00f9
            android.content.Context r0 = r1.getContext()     // Catch:{ NameNotFoundException -> 0x00d6 }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ NameNotFoundException -> 0x00d6 }
            com.google.assistant.e.c.c.dc r8 = r11.f132601g     // Catch:{ NameNotFoundException -> 0x00d6 }
            if (r8 != 0) goto L_0x00cf
            com.google.assistant.e.c.c.dc r8 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k     // Catch:{ NameNotFoundException -> 0x00d6 }
        L_0x00cf:
            java.lang.String r8 = r8.f132821g     // Catch:{ NameNotFoundException -> 0x00d6 }
            android.graphics.drawable.Drawable r0 = r0.getApplicationIcon(r8)     // Catch:{ NameNotFoundException -> 0x00d6 }
            goto L_0x00fa
        L_0x00d6:
            r0 = move-exception
            com.google.common.f.e r8 = com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.components.FullButtonComponent.f88952a
            com.google.common.f.x r8 = r8.mo56225c()
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8
            com.google.common.f.x r0 = r8.mo56382g(r0)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            r8 = 50979(0xc723, float:7.1437E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r8)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            com.google.assistant.e.c.c.dc r8 = r11.f132601g
            if (r8 != 0) goto L_0x00f4
            com.google.assistant.e.c.c.dc r8 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k
        L_0x00f4:
            java.lang.String r8 = r8.f132821g
            r0.mo56389s(r4, r8)
        L_0x00f9:
            r0 = r3
        L_0x00fa:
            int r4 = r11.f132595a
            r4 = r4 & 32
            if (r4 == 0) goto L_0x0101
            goto L_0x0103
        L_0x0101:
            if (r0 == 0) goto L_0x0115
        L_0x0103:
            com.google.assistant.e.c.c.dc r4 = r11.f132601g
            if (r4 != 0) goto L_0x0109
            com.google.assistant.e.c.c.dc r4 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k
        L_0x0109:
            com.google.android.libraries.search.assistant.fluidactions.rendering.ui.components.ImageComponent r8 = r1.f88955b
            if (r8 == 0) goto L_0x0115
            r8.setVisibility(r7)
            com.google.android.libraries.search.assistant.fluidactions.rendering.ui.components.ImageComponent r8 = r1.f88955b
            r8.mo38649b(r4, r0)
        L_0x0115:
            int r0 = r11.f132595a
            r4 = 4
            r0 = r0 & r4
            if (r0 == 0) goto L_0x0120
            boolean r0 = r11.f132600f
            r1.setEnabled(r0)
        L_0x0120:
            android.widget.TextView r0 = r1.f88956c
            if (r0 == 0) goto L_0x012f
            if (r6 == 0) goto L_0x012c
            r6 = 8
            r0.setVisibility(r6)
            goto L_0x012f
        L_0x012c:
            r0.setVisibility(r7)
        L_0x012f:
            android.widget.LinearLayout r0 = r1.f88957d
            if (r0 == 0) goto L_0x0169
            int r6 = r11.f132604j
            int r6 = com.google.assistant.p3897e.p3902c.p3907c.C50935ag.m85984a(r6)
            if (r6 != 0) goto L_0x013c
            goto L_0x0169
        L_0x013c:
            r8 = 3
            if (r6 != r8) goto L_0x0169
            com.google.assistant.e.j.e.fc r2 = r2.f88751a
            com.google.assistant.e.j.e.fc r6 = com.google.assistant.p3897e.p3921j.p3926e.C51950fc.FORM_UI_THEME_IRIS_GLANCEABILITY
            if (r2 != r6) goto L_0x0153
            r0.setBackground(r3)
            android.widget.LinearLayout r0 = r1.f88957d
            r0.setPadding(r7, r7, r7, r7)
            android.widget.LinearLayout r0 = r1.f88957d
            r0.setMinimumHeight(r7)
            goto L_0x0169
        L_0x0153:
            android.content.res.Resources r2 = r1.getResources()
            android.content.Context r3 = r1.getContext()
            android.content.res.Resources$Theme r3 = r3.getTheme()
            r6 = 17170445(0x106000d, float:2.461195E-38)
            int r2 = r2.getColor(r6, r3)
            r0.setBackgroundColor(r2)
        L_0x0169:
            android.widget.LinearLayout r0 = r1.f88957d
            if (r0 == 0) goto L_0x017e
            int r1 = r11.f132604j
            int r1 = com.google.assistant.p3897e.p3902c.p3907c.C50935ag.m85984a(r1)
            if (r1 != 0) goto L_0x0176
            goto L_0x017e
        L_0x0176:
            if (r1 != r4) goto L_0x017e
            r1 = 2131231966(0x7f0804de, float:1.8080028E38)
            r0.setBackgroundResource(r1)
        L_0x017e:
            com.google.android.libraries.search.assistant.fluidactions.rendering.ui.components.FullButtonComponent r0 = r10.f89020h
            com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.p r1 = new com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.p
            r1.<init>(r10, r11)
            r0.setOnClickListener(r1)
            goto L_0x01dd
        L_0x0189:
            com.google.android.libraries.search.assistant.fluidactions.rendering.ui.components.ButtonComponent r0 = r10.f89019g
            if (r0 == 0) goto L_0x01dd
            r0.setVisibility(r7)
            com.google.android.libraries.search.assistant.fluidactions.rendering.ui.components.ButtonComponent r0 = r10.f89019g
            com.google.android.libraries.search.assistant.fluidactions.rendering.a.i r3 = r10.f89015c
            boolean r4 = r10.f89021i
            r0.mo38638a(r11, r3, r4)
            com.google.android.libraries.search.assistant.fluidactions.rendering.ui.components.ButtonComponent r0 = r10.f89019g
            com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.p r3 = new com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.p
            r3.<init>(r10, r11)
            r0.setOnClickListener(r3)
            if (r1 != r2) goto L_0x01dd
            int r0 = r11.f132602h
            com.google.assistant.e.c.c.ac r0 = com.google.assistant.p3897e.p3902c.p3907c.C50931ac.m85981a(r0)
            if (r0 != 0) goto L_0x01af
            com.google.assistant.e.c.c.ac r0 = com.google.assistant.p3897e.p3902c.p3907c.C50931ac.DEFAULT
        L_0x01af:
            com.google.android.libraries.search.assistant.fluidactions.rendering.ui.components.ButtonComponent r1 = r10.f89019g
            if (r1 == 0) goto L_0x01dd
            int r0 = r0.ordinal()
            if (r0 == r6) goto L_0x01cd
            if (r0 == r5) goto L_0x01bc
            goto L_0x01dd
        L_0x01bc:
            com.google.android.libraries.search.assistant.fluidactions.rendering.ui.components.ButtonComponent r0 = r10.f89019g
            android.content.res.Resources r1 = r10.getResources()
            r2 = 2132086646(0x7f150f76, float:1.9813525E38)
            java.lang.String r1 = r1.getString(r2)
            r0.setContentDescription(r1)
            goto L_0x01dd
        L_0x01cd:
            com.google.android.libraries.search.assistant.fluidactions.rendering.ui.components.ButtonComponent r0 = r10.f89019g
            android.content.res.Resources r1 = r10.getResources()
            r2 = 2132086645(0x7f150f75, float:1.9813523E38)
            java.lang.String r1 = r1.getString(r2)
            r0.setContentDescription(r1)
        L_0x01dd:
            int r11 = r11.f132605k
            int r11 = com.google.assistant.p3897e.p3902c.p3907c.C50933ae.m85983a(r11)
            if (r11 != 0) goto L_0x01e6
            goto L_0x020d
        L_0x01e6:
            if (r11 != r5) goto L_0x020d
            r11 = 2131430678(0x7f0b0d16, float:1.8483064E38)
            android.view.View r11 = r10.findViewById(r11)
            com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.ButtonField r11 = (com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields.ButtonField) r11
            if (r11 == 0) goto L_0x020d
            android.content.res.Resources r0 = r10.getResources()
            r1 = 2131167651(0x7f0709a3, float:1.7949582E38)
            int r0 = r0.getDimensionPixelSize(r1)
            int r1 = r11.getPaddingTop()
            int r2 = r11.getPaddingRight()
            int r3 = r11.getPaddingBottom()
            r11.setPadding(r0, r1, r2, r3)
        L_0x020d:
            return
        L_0x020e:
            com.google.common.f.e r11 = f89013a
            com.google.common.f.x r11 = r11.mo56226d()
            java.lang.String r0 = "Unable to update FormField UI due to invalid args"
            r1 = 51011(0xc743, float:7.1482E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r11).mo56372aa(r1)).mo56386p(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields.ButtonField.mo38564e(com.google.android.libraries.search.assistant.fluidactions.rendering.a.e):void");
    }

    /* renamed from: f */
    public final /* synthetic */ void mo38565f() {
    }

    /* renamed from: g */
    public final /* synthetic */ void mo38566g() {
    }

    public final boolean isEnabled() {
        ButtonComponent buttonComponent = this.f89019g;
        if (buttonComponent != null && buttonComponent.getVisibility() == 0) {
            return this.f89019g.isEnabled();
        }
        FullButtonComponent fullButtonComponent = this.f89020h;
        if (fullButtonComponent == null || fullButtonComponent.getVisibility() != 0) {
            return super.isEnabled();
        }
        return this.f89020h.isEnabled();
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        ButtonComponent buttonComponent = (ButtonComponent) LayoutInflater.from(getContext()).inflate(R.layout.fa_button_component, (ViewGroup) null);
        this.f89019g = buttonComponent;
        addView(buttonComponent);
        FullButtonComponent fullButtonComponent = (FullButtonComponent) LayoutInflater.from(getContext()).inflate(R.layout.fa_full_button_component, (ViewGroup) null);
        this.f89020h = fullButtonComponent;
        addView(fullButtonComponent);
    }

    public final void setEnabled(boolean z) {
        ButtonComponent buttonComponent = this.f89019g;
        if (buttonComponent != null) {
            buttonComponent.setEnabled(z);
        }
        FullButtonComponent fullButtonComponent = this.f89020h;
        if (fullButtonComponent != null) {
            fullButtonComponent.setEnabled(z);
        }
        super.setEnabled(z);
    }

    public ButtonField(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m61715a(context, attributeSet, 0);
    }

    public ButtonField(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m61715a(context, attributeSet, i);
    }
}
