package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.assistantactions.rendering.C11279a;
import com.google.android.libraries.assistant.assistantactions.rendering.p639c.C11295c;
import com.google.android.libraries.assistant.assistantactions.rendering.p642ui.components.ButtonComponent;
import com.google.android.libraries.assistant.assistantactions.rendering.p642ui.components.CircleCountDownButton;
import com.google.android.libraries.assistant.assistantactions.rendering.p642ui.components.FullButtonComponent;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.ButtonField */
/* compiled from: PG */
public class ButtonField extends C11407n {

    /* renamed from: a */
    public static final C59071e f36918a = C59071e.m91332i("com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.ButtonField");

    /* renamed from: b */
    public ButtonComponent f36919b;

    /* renamed from: c */
    public CircleCountDownButton f36920c;

    /* renamed from: d */
    private FullButtonComponent f36921d;

    /* renamed from: e */
    private boolean f36922e;

    public ButtonField(Context context) {
        super(context);
    }

    /* renamed from: a */
    private final void m26985a(Context context, AttributeSet attributeSet, int i) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C11279a.f36699a, i, 0);
            try {
                this.f36922e = obtainStyledAttributes.getBoolean(0, false);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003a, code lost:
        if (r2 == r8) goto L_0x003c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0218  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x021f  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0227  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x023a  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x024b  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01bd  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo19809b() {
        /*
            r13 = this;
            java.lang.String r0 = ""
            com.google.android.libraries.assistant.assistantactions.rendering.c.c r1 = r13.f37153l
            if (r1 == 0) goto L_0x0302
            com.google.android.libraries.assistant.assistantactions.rendering.c.d r2 = r13.f37154m
            if (r2 != 0) goto L_0x000c
            goto L_0x0302
        L_0x000c:
            com.google.assistant.e.j.e.eu r1 = r1.f36729a
            int r2 = r1.f136277e
            r3 = 17
            if (r2 != r3) goto L_0x0302
            java.lang.Object r1 = r1.f136278f
            com.google.assistant.e.c.c.ah r1 = (com.google.assistant.p3897e.p3902c.p3907c.C50936ah) r1
            boolean r2 = r13.f36922e
            r3 = 128(0x80, float:1.794E-43)
            r4 = 4
            r5 = 1
            r6 = 2
            r7 = 0
            if (r2 == 0) goto L_0x0116
            com.google.assistant.e.c.c.ac r2 = com.google.assistant.p3897e.p3902c.p3907c.C50931ac.CONFIRM
            int r8 = r1.f132602h
            com.google.assistant.e.c.c.ac r9 = com.google.assistant.p3897e.p3902c.p3907c.C50931ac.m85981a(r8)
            if (r9 != 0) goto L_0x002e
            com.google.assistant.e.c.c.ac r9 = com.google.assistant.p3897e.p3902c.p3907c.C50931ac.DEFAULT
        L_0x002e:
            if (r2 == r9) goto L_0x003c
            com.google.assistant.e.c.c.ac r2 = com.google.assistant.p3897e.p3902c.p3907c.C50931ac.CANCEL
            com.google.assistant.e.c.c.ac r8 = com.google.assistant.p3897e.p3902c.p3907c.C50931ac.m85981a(r8)
            if (r8 != 0) goto L_0x003a
            com.google.assistant.e.c.c.ac r8 = com.google.assistant.p3897e.p3902c.p3907c.C50931ac.DEFAULT
        L_0x003a:
            if (r2 != r8) goto L_0x0116
        L_0x003c:
            com.google.android.libraries.assistant.assistantactions.rendering.ui.components.CircleCountDownButton r0 = r13.f36920c
            r0.setVisibility(r7)
            com.google.android.libraries.assistant.assistantactions.rendering.ui.components.CircleCountDownButton r0 = r13.f36920c
            int r2 = r1.f132602h
            com.google.assistant.e.c.c.ac r2 = com.google.assistant.p3897e.p3902c.p3907c.C50931ac.m85981a(r2)
            if (r2 != 0) goto L_0x004d
            com.google.assistant.e.c.c.ac r2 = com.google.assistant.p3897e.p3902c.p3907c.C50931ac.DEFAULT
        L_0x004d:
            int r2 = r2.ordinal()
            if (r2 == r5) goto L_0x0088
            if (r2 == r6) goto L_0x0078
            com.google.common.f.e r2 = com.google.android.libraries.assistant.assistantactions.rendering.p642ui.components.CircleCountDownButton.f36834a
            com.google.common.f.x r2 = r2.mo56226d()
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2
            r5 = 43176(0xa8a8, float:6.0502E-41)
            com.google.common.f.x r2 = r2.mo56372aa(r5)
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2
            int r5 = r1.f132602h
            com.google.assistant.e.c.c.ac r5 = com.google.assistant.p3897e.p3902c.p3907c.C50931ac.m85981a(r5)
            if (r5 != 0) goto L_0x0070
            com.google.assistant.e.c.c.ac r5 = com.google.assistant.p3897e.p3902c.p3907c.C50931ac.DEFAULT
        L_0x0070:
            java.lang.String r7 = "Unacceptable button type for circle countdown button: %d"
            int r5 = r5.f132590g
            r2.mo56387q(r7, r5)
            goto L_0x0097
        L_0x0078:
            com.google.android.libraries.assistant.assistantactions.rendering.ui.components.ImageComponent r2 = r0.f36839f
            android.widget.ImageView r2 = r2.f36859f
            r5 = 2131234133(0x7f080d55, float:1.8084423E38)
            r2.setImageResource(r5)
            com.google.android.libraries.assistant.assistantactions.rendering.ui.components.ImageComponent r2 = r0.f36839f
            r2.setVisibility(r7)
            goto L_0x0097
        L_0x0088:
            com.google.android.libraries.assistant.assistantactions.rendering.ui.components.ImageComponent r2 = r0.f36839f
            android.widget.ImageView r2 = r2.f36859f
            r5 = 2131234087(0x7f080d27, float:1.808433E38)
            r2.setImageResource(r5)
            com.google.android.libraries.assistant.assistantactions.rendering.ui.components.ImageComponent r2 = r0.f36839f
            r2.setVisibility(r7)
        L_0x0097:
            int r2 = r1.f132595a
            r2 = r2 & r4
            if (r2 == 0) goto L_0x00a1
            boolean r2 = r1.f132600f
            r0.setEnabled(r2)
        L_0x00a1:
            int r0 = r1.f132595a
            r0 = r0 & r3
            if (r0 == 0) goto L_0x0101
            com.google.protobuf.ar r0 = r1.f132603i
            if (r0 != 0) goto L_0x00ac
            com.google.protobuf.ar r0 = com.google.protobuf.C62910ar.f169858c
        L_0x00ac:
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r3 = r0.f169860a
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            long r2 = r2.convert(r3, r5)
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            int r0 = r0.f169861b
            long r7 = (long) r0
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r4 = r4.convert(r7, r0)
            long r2 = r2 + r4
            r4 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x00cd
            r0 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x00ce
        L_0x00cd:
            int r0 = (int) r2
        L_0x00ce:
            com.google.android.libraries.assistant.assistantactions.rendering.ui.components.CircleCountDownButton r2 = r13.f36920c
            if (r0 == 0) goto L_0x00d4
            r2.f36835b = r0
        L_0x00d4:
            int r0 = r2.f36835b
            if (r0 > 0) goto L_0x00d9
            goto L_0x010a
        L_0x00d9:
            long r3 = android.os.SystemClock.elapsedRealtime()
            r2.f36836c = r3
            int r0 = r2.f36835b
            long r7 = (long) r0
            long r3 = r3 + r7
            r2.f36837d = r3
            java.lang.Runnable r0 = r2.f36840g
            if (r0 == 0) goto L_0x00ec
            r2.removeCallbacks(r0)
        L_0x00ec:
            com.google.android.libraries.assistant.assistantactions.rendering.ui.components.a r0 = new com.google.android.libraries.assistant.assistantactions.rendering.ui.components.a
            r0.<init>(r2)
            r2.f36840g = r0
            java.lang.Runnable r0 = r2.f36840g
            int r3 = r2.f36835b
            long r3 = (long) r3
            r2.postDelayed(r0, r3)
            r2.f36838e = r6
            r2.invalidate()
            goto L_0x010a
        L_0x0101:
            boolean r0 = r13.f37158q
            if (r0 == 0) goto L_0x010a
            com.google.android.libraries.assistant.assistantactions.rendering.ui.components.CircleCountDownButton r0 = r13.f36920c
            r0.mo19778b()
        L_0x010a:
            com.google.android.libraries.assistant.assistantactions.rendering.ui.components.CircleCountDownButton r0 = r13.f36920c
            com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.q r2 = new com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.q
            r2.<init>(r13, r1)
            r0.setOnClickListener(r2)
            goto L_0x02d4
        L_0x0116:
            int r2 = r1.f132602h
            com.google.assistant.e.c.c.ac r2 = com.google.assistant.p3897e.p3902c.p3907c.C50931ac.m85981a(r2)
            if (r2 != 0) goto L_0x0120
            com.google.assistant.e.c.c.ac r2 = com.google.assistant.p3897e.p3902c.p3907c.C50931ac.DEFAULT
        L_0x0120:
            com.google.assistant.e.c.c.ac r8 = com.google.assistant.p3897e.p3902c.p3907c.C50931ac.FULL_WIDTH
            if (r2 != r8) goto L_0x0281
            com.google.android.libraries.assistant.assistantactions.rendering.ui.components.FullButtonComponent r2 = r13.f36921d
            r2.setVisibility(r7)
            com.google.android.libraries.assistant.assistantactions.rendering.ui.components.FullButtonComponent r2 = r13.f36921d
            int r8 = r13.f37160s
            int r9 = r1.f132596b
            java.lang.String r10 = "Invalid package name: %s"
            if (r9 != r5) goto L_0x013c
            java.lang.Object r0 = r1.f132597c
            java.lang.String r0 = (java.lang.String) r0
            r2.mo19783a(r0)
        L_0x013a:
            r0 = 0
            goto L_0x018f
        L_0x013c:
            r11 = 11
            if (r9 != r11) goto L_0x018e
            android.content.Context r9 = r2.getContext()     // Catch:{ NameNotFoundException -> 0x016a }
            android.content.pm.PackageManager r9 = r9.getPackageManager()     // Catch:{ NameNotFoundException -> 0x016a }
            int r12 = r1.f132596b     // Catch:{ NameNotFoundException -> 0x016a }
            if (r12 != r11) goto L_0x0151
            java.lang.Object r12 = r1.f132597c     // Catch:{ NameNotFoundException -> 0x016a }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ NameNotFoundException -> 0x016a }
            goto L_0x0152
        L_0x0151:
            r12 = r0
        L_0x0152:
            android.content.pm.ApplicationInfo r3 = r9.getApplicationInfo(r12, r3)     // Catch:{ NameNotFoundException -> 0x016a }
            android.content.Context r9 = r2.getContext()     // Catch:{ NameNotFoundException -> 0x016a }
            android.content.pm.PackageManager r9 = r9.getPackageManager()     // Catch:{ NameNotFoundException -> 0x016a }
            java.lang.CharSequence r3 = r9.getApplicationLabel(r3)     // Catch:{ NameNotFoundException -> 0x016a }
            java.lang.String r3 = r3.toString()     // Catch:{ NameNotFoundException -> 0x016a }
            r2.mo19783a(r3)     // Catch:{ NameNotFoundException -> 0x016a }
            goto L_0x013a
        L_0x016a:
            r3 = move-exception
            com.google.common.f.e r9 = com.google.android.libraries.assistant.assistantactions.rendering.p642ui.components.FullButtonComponent.f36850a
            com.google.common.f.x r9 = r9.mo56225c()
            com.google.common.f.c r9 = (com.google.common.p4526f.C59052c) r9
            com.google.common.f.x r3 = r9.mo56382g(r3)
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3
            r9 = 43178(0xa8aa, float:6.0505E-41)
            com.google.common.f.x r3 = r3.mo56372aa(r9)
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3
            int r9 = r1.f132596b
            if (r9 != r11) goto L_0x018a
            java.lang.Object r0 = r1.f132597c
            java.lang.String r0 = (java.lang.String) r0
        L_0x018a:
            r3.mo56389s(r10, r0)
            goto L_0x013a
        L_0x018e:
            r0 = 1
        L_0x018f:
            com.google.assistant.e.c.c.dc r3 = r1.f132601g
            if (r3 != 0) goto L_0x0195
            com.google.assistant.e.c.c.dc r3 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k
        L_0x0195:
            int r3 = r3.f132815a
            r3 = r3 & r6
            if (r3 == 0) goto L_0x01bd
            com.google.assistant.e.c.c.dc r3 = r1.f132601g
            if (r3 != 0) goto L_0x01a1
            com.google.assistant.e.c.c.dc r9 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k
            goto L_0x01a2
        L_0x01a1:
            r9 = r3
        L_0x01a2:
            java.lang.String r9 = r9.f132817c
            if (r3 != 0) goto L_0x01a8
            com.google.assistant.e.c.c.dc r3 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k
        L_0x01a8:
            int r3 = r3.f132816b
            int r3 = com.google.assistant.p3897e.p3902c.p3907c.C51014de.m86008a(r3)
            if (r3 != 0) goto L_0x01b1
            goto L_0x01b2
        L_0x01b1:
            r5 = r3
        L_0x01b2:
            com.google.android.libraries.assistant.assistantactions.rendering.ui.components.ImageComponent r3 = r2.f36853b
            r3.setVisibility(r7)
            com.google.android.libraries.assistant.assistantactions.rendering.ui.components.ImageComponent r3 = r2.f36853b
            r3.mo19788d(r9, r5)
            goto L_0x0213
        L_0x01bd:
            com.google.assistant.e.c.c.dc r3 = r1.f132601g
            if (r3 != 0) goto L_0x01c4
            com.google.assistant.e.c.c.dc r5 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k
            goto L_0x01c5
        L_0x01c4:
            r5 = r3
        L_0x01c5:
            int r5 = r5.f132815a
            r5 = r5 & 32
            if (r5 == 0) goto L_0x0213
            if (r3 != 0) goto L_0x01d2
            com.google.assistant.e.c.c.dc r3 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k     // Catch:{ NameNotFoundException -> 0x01d0 }
            goto L_0x01d2
        L_0x01d0:
            r3 = move-exception
            goto L_0x01f1
        L_0x01d2:
            android.content.Context r5 = r2.getContext()     // Catch:{ NameNotFoundException -> 0x01d0 }
            android.content.pm.PackageManager r5 = r5.getPackageManager()     // Catch:{ NameNotFoundException -> 0x01d0 }
            com.google.assistant.e.c.c.dc r9 = r1.f132601g     // Catch:{ NameNotFoundException -> 0x01d0 }
            if (r9 != 0) goto L_0x01e0
            com.google.assistant.e.c.c.dc r9 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k     // Catch:{ NameNotFoundException -> 0x01d0 }
        L_0x01e0:
            java.lang.String r9 = r9.f132821g     // Catch:{ NameNotFoundException -> 0x01d0 }
            android.graphics.drawable.Drawable r5 = r5.getApplicationIcon(r9)     // Catch:{ NameNotFoundException -> 0x01d0 }
            com.google.android.libraries.assistant.assistantactions.rendering.ui.components.ImageComponent r9 = r2.f36853b     // Catch:{ NameNotFoundException -> 0x01d0 }
            r9.setVisibility(r7)     // Catch:{ NameNotFoundException -> 0x01d0 }
            com.google.android.libraries.assistant.assistantactions.rendering.ui.components.ImageComponent r9 = r2.f36853b     // Catch:{ NameNotFoundException -> 0x01d0 }
            r9.mo19786b(r3, r5)     // Catch:{ NameNotFoundException -> 0x01d0 }
            goto L_0x0213
        L_0x01f1:
            com.google.common.f.e r5 = com.google.android.libraries.assistant.assistantactions.rendering.p642ui.components.FullButtonComponent.f36850a
            com.google.common.f.x r5 = r5.mo56225c()
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5
            com.google.common.f.x r3 = r5.mo56382g(r3)
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3
            r5 = 43177(0xa8a9, float:6.0504E-41)
            com.google.common.f.x r3 = r3.mo56372aa(r5)
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3
            com.google.assistant.e.c.c.dc r5 = r1.f132601g
            if (r5 != 0) goto L_0x020e
            com.google.assistant.e.c.c.dc r5 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k
        L_0x020e:
            java.lang.String r5 = r5.f132821g
            r3.mo56389s(r10, r5)
        L_0x0213:
            int r3 = r1.f132595a
            r3 = r3 & r4
            if (r3 == 0) goto L_0x021d
            boolean r3 = r1.f132600f
            r2.setEnabled(r3)
        L_0x021d:
            if (r0 == 0) goto L_0x0227
            android.widget.TextView r0 = r2.f36854c
            r3 = 8
            r0.setVisibility(r3)
            goto L_0x022c
        L_0x0227:
            android.widget.TextView r0 = r2.f36854c
            r0.setVisibility(r7)
        L_0x022c:
            int r0 = r1.f132604j
            int r0 = com.google.assistant.p3897e.p3902c.p3907c.C50935ag.m85984a(r0)
            if (r0 != 0) goto L_0x0235
            goto L_0x0263
        L_0x0235:
            r3 = 3
            if (r0 != r3) goto L_0x0263
            if (r8 != r6) goto L_0x024b
            android.widget.LinearLayout r0 = r2.f36855d
            r3 = 0
            r0.setBackground(r3)
            android.widget.LinearLayout r0 = r2.f36855d
            r0.setPadding(r7, r7, r7, r7)
            android.widget.LinearLayout r0 = r2.f36855d
            r0.setMinimumHeight(r7)
            goto L_0x0263
        L_0x024b:
            android.widget.LinearLayout r0 = r2.f36855d
            android.content.res.Resources r3 = r2.getResources()
            android.content.Context r5 = r2.getContext()
            android.content.res.Resources$Theme r5 = r5.getTheme()
            r7 = 17170445(0x106000d, float:2.461195E-38)
            int r3 = r3.getColor(r7, r5)
            r0.setBackgroundColor(r3)
        L_0x0263:
            int r0 = r1.f132604j
            int r0 = com.google.assistant.p3897e.p3902c.p3907c.C50935ag.m85984a(r0)
            if (r0 != 0) goto L_0x026c
            goto L_0x0276
        L_0x026c:
            if (r0 != r4) goto L_0x0276
            android.widget.LinearLayout r0 = r2.f36855d
            r2 = 2131232040(0x7f080528, float:1.8080178E38)
            r0.setBackgroundResource(r2)
        L_0x0276:
            com.google.android.libraries.assistant.assistantactions.rendering.ui.components.FullButtonComponent r0 = r13.f36921d
            com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.q r2 = new com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.q
            r2.<init>(r13, r1)
            r0.setOnClickListener(r2)
            goto L_0x02d4
        L_0x0281:
            com.google.android.libraries.assistant.assistantactions.rendering.ui.components.ButtonComponent r0 = r13.f36919b
            r0.setVisibility(r7)
            com.google.android.libraries.assistant.assistantactions.rendering.ui.components.ButtonComponent r0 = r13.f36919b
            boolean r2 = r13.f36922e
            int r3 = r13.f37160s
            if (r3 != r6) goto L_0x028f
            r7 = 1
        L_0x028f:
            r0.mo19768a(r1, r2, r7)
            com.google.android.libraries.assistant.assistantactions.rendering.ui.components.ButtonComponent r0 = r13.f36919b
            com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.q r2 = new com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.q
            r2.<init>(r13, r1)
            r0.setOnClickListener(r2)
            int r0 = r13.f37160s
            if (r0 != r6) goto L_0x02d4
            int r0 = r1.f132602h
            com.google.assistant.e.c.c.ac r0 = com.google.assistant.p3897e.p3902c.p3907c.C50931ac.m85981a(r0)
            if (r0 != 0) goto L_0x02aa
            com.google.assistant.e.c.c.ac r0 = com.google.assistant.p3897e.p3902c.p3907c.C50931ac.DEFAULT
        L_0x02aa:
            int r0 = r0.ordinal()
            if (r0 == r5) goto L_0x02c4
            if (r0 == r6) goto L_0x02b3
            goto L_0x02d4
        L_0x02b3:
            com.google.android.libraries.assistant.assistantactions.rendering.ui.components.ButtonComponent r0 = r13.f36919b
            android.content.res.Resources r2 = r13.getResources()
            r3 = 2132086861(0x7f15104d, float:1.981396E38)
            java.lang.String r2 = r2.getString(r3)
            r0.setContentDescription(r2)
            goto L_0x02d4
        L_0x02c4:
            com.google.android.libraries.assistant.assistantactions.rendering.ui.components.ButtonComponent r0 = r13.f36919b
            android.content.res.Resources r2 = r13.getResources()
            r3 = 2132086859(0x7f15104b, float:1.9813957E38)
            java.lang.String r2 = r2.getString(r3)
            r0.setContentDescription(r2)
        L_0x02d4:
            int r0 = r1.f132605k
            int r0 = com.google.assistant.p3897e.p3902c.p3907c.C50933ae.m85983a(r0)
            if (r0 != 0) goto L_0x02dd
            goto L_0x0302
        L_0x02dd:
            if (r0 != r6) goto L_0x0302
            r0 = 2131429428(0x7f0b0834, float:1.8480528E38)
            android.view.View r0 = r13.findViewById(r0)
            com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.ButtonField r0 = (com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields.ButtonField) r0
            android.content.res.Resources r1 = r13.getResources()
            r2 = 2131166408(0x7f0704c8, float:1.794706E38)
            int r1 = r1.getDimensionPixelSize(r2)
            int r2 = r0.getPaddingTop()
            int r3 = r0.getPaddingRight()
            int r4 = r0.getPaddingBottom()
            r0.setPadding(r1, r2, r3, r4)
        L_0x0302:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields.ButtonField.mo19809b():void");
    }

    public final boolean isEnabled() {
        if (this.f36919b.getVisibility() == 0) {
            return this.f36919b.isEnabled();
        }
        if (this.f36920c.getVisibility() == 0) {
            return this.f36920c.isEnabled();
        }
        if (this.f36921d.getVisibility() == 0) {
            return this.f36921d.isEnabled();
        }
        return super.isEnabled();
    }

    /* renamed from: m */
    public final void mo19821m(C11295c cVar) {
        this.f37153l = cVar;
        mo19809b();
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        ButtonComponent buttonComponent = (ButtonComponent) LayoutInflater.from(this.f37159r).inflate(R.layout.button_component, (ViewGroup) null);
        this.f36919b = buttonComponent;
        addView(buttonComponent);
        CircleCountDownButton circleCountDownButton = (CircleCountDownButton) LayoutInflater.from(this.f37159r).inflate(R.layout.circle_countdown_button, this, false);
        this.f36920c = circleCountDownButton;
        addView(circleCountDownButton);
        FullButtonComponent fullButtonComponent = (FullButtonComponent) LayoutInflater.from(this.f37159r).inflate(R.layout.full_button_component, (ViewGroup) null);
        this.f36921d = fullButtonComponent;
        addView(fullButtonComponent);
    }

    public final void setEnabled(boolean z) {
        this.f36919b.setEnabled(z);
        this.f36920c.setEnabled(z);
        this.f36921d.setEnabled(z);
        super.setEnabled(z);
    }

    public ButtonField(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m26985a(context, attributeSet, 0);
    }

    public ButtonField(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m26985a(context, attributeSet, i);
    }
}
