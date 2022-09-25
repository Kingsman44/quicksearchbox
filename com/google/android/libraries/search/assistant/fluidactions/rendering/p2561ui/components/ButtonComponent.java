package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.components;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.C1877c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2560e.C33234l;
import com.google.assistant.p3897e.p3902c.p3907c.C50931ac;
import com.google.assistant.p3897e.p3902c.p3907c.C50936ah;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.components.ButtonComponent */
/* compiled from: PG */
public final class ButtonComponent extends LinearLayout {

    /* renamed from: a */
    private static final C59071e f88932a = C59071e.m91332i("com.google.android.libraries.search.assistant.fluidactions.rendering.ui.components.ButtonComponent");

    /* renamed from: b */
    private static final int[] f88933b = {-16842910};

    /* renamed from: c */
    private static final int[] f88934c = {16842910};

    /* renamed from: d */
    private static final int[] f88935d = {16842910, 16842914};

    /* renamed from: e */
    private C50931ac f88936e = C50931ac.DEFAULT;

    /* renamed from: f */
    private ImageComponent f88937f = null;

    /* renamed from: g */
    private TextView f88938g = null;

    /* renamed from: h */
    private LinearLayout f88939h = null;

    /* renamed from: i */
    private View f88940i = null;

    /* renamed from: j */
    private View f88941j = null;

    /* renamed from: k */
    private TextView f88942k = null;

    public ButtonComponent(Context context) {
        super(context);
    }

    /* renamed from: d */
    private final void m61675d(C50936ah ahVar) {
        C51012dc dcVar = ahVar.f132601g;
        if (dcVar == null) {
            dcVar = C51012dc.f132813k;
        }
        Drawable drawable = null;
        if (!dcVar.f132821g.isEmpty()) {
            try {
                PackageManager packageManager = getContext().getPackageManager();
                C51012dc dcVar2 = ahVar.f132601g;
                if (dcVar2 == null) {
                    dcVar2 = C51012dc.f132813k;
                }
                drawable = packageManager.getApplicationIcon(dcVar2.f132821g);
            } catch (PackageManager.NameNotFoundException e) {
                C59052c cVar = (C59052c) ((C59052c) ((C59052c) f88932a.mo56225c()).mo56382g(e)).mo56372aa(50974);
                C51012dc dcVar3 = ahVar.f132601g;
                if (dcVar3 == null) {
                    dcVar3 = C51012dc.f132813k;
                }
                cVar.mo56389s("Invalid package name: %s", dcVar3.f132821g);
            }
        }
        if ((ahVar.f132595a & 32) != 0 || drawable != null) {
            C51012dc dcVar4 = ahVar.f132601g;
            if (dcVar4 == null) {
                dcVar4 = C51012dc.f132813k;
            }
            mo38639b(dcVar4, drawable);
        }
    }

    /* renamed from: e */
    private final void m61676e(int i) {
        if (this.f88939h != null) {
            Drawable a = C1877c.m5125a(getContext(), C33234l.m61646d(getContext(), i, R.drawable.fa_button_component_background));
            if (a != null) {
                this.f88939h.setBackground(a);
            } else {
                ((C59052c) ((C59052c) f88932a.mo56226d()).mo56372aa(50976)).mo56386p("Unable to get Drawable for button background.");
            }
        }
    }

    /* renamed from: f */
    private final void m61677f(int i) {
        ImageComponent imageComponent = this.f88937f;
        if (imageComponent != null) {
            imageComponent.f88961f.setImageResource(i);
            this.f88937f.setVisibility(0);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x011b A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:74:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo38638a(com.google.assistant.p3897e.p3902c.p3907c.C50936ah r8, com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33184i r9, boolean r10) {
        /*
            r7 = this;
            java.lang.String r0 = ""
            int r1 = r8.f132602h
            com.google.assistant.e.c.c.ac r1 = com.google.assistant.p3897e.p3902c.p3907c.C50931ac.m85981a(r1)
            if (r1 != 0) goto L_0x000c
            com.google.assistant.e.c.c.ac r1 = com.google.assistant.p3897e.p3902c.p3907c.C50931ac.DEFAULT
        L_0x000c:
            r7.f88936e = r1
            int r1 = r8.f132596b
            r2 = 1
            r3 = 0
            if (r1 != r2) goto L_0x001d
            java.lang.Object r0 = r8.f132597c
            java.lang.String r0 = (java.lang.String) r0
            r7.mo38640c(r0)
        L_0x001b:
            r0 = 0
            goto L_0x0074
        L_0x001d:
            r4 = 11
            if (r1 != r4) goto L_0x0073
            android.content.Context r1 = r7.getContext()     // Catch:{ NameNotFoundException -> 0x004d }
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch:{ NameNotFoundException -> 0x004d }
            int r5 = r8.f132596b     // Catch:{ NameNotFoundException -> 0x004d }
            if (r5 != r4) goto L_0x0032
            java.lang.Object r5 = r8.f132597c     // Catch:{ NameNotFoundException -> 0x004d }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ NameNotFoundException -> 0x004d }
            goto L_0x0033
        L_0x0032:
            r5 = r0
        L_0x0033:
            r6 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r1 = r1.getApplicationInfo(r5, r6)     // Catch:{ NameNotFoundException -> 0x004d }
            android.content.Context r5 = r7.getContext()     // Catch:{ NameNotFoundException -> 0x004d }
            android.content.pm.PackageManager r5 = r5.getPackageManager()     // Catch:{ NameNotFoundException -> 0x004d }
            java.lang.CharSequence r1 = r5.getApplicationLabel(r1)     // Catch:{ NameNotFoundException -> 0x004d }
            java.lang.String r1 = r1.toString()     // Catch:{ NameNotFoundException -> 0x004d }
            r7.mo38640c(r1)     // Catch:{ NameNotFoundException -> 0x004d }
            goto L_0x001b
        L_0x004d:
            r1 = move-exception
            com.google.common.f.e r5 = f88932a
            com.google.common.f.x r5 = r5.mo56225c()
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5
            com.google.common.f.x r1 = r5.mo56382g(r1)
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            r5 = 50975(0xc71f, float:7.1431E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r5)
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            int r5 = r8.f132596b
            if (r5 != r4) goto L_0x006d
            java.lang.Object r0 = r8.f132597c
            java.lang.String r0 = (java.lang.String) r0
        L_0x006d:
            java.lang.String r4 = "Invalid package name: %s"
            r1.mo56389s(r4, r0)
            goto L_0x001b
        L_0x0073:
            r0 = 1
        L_0x0074:
            r1 = 3
            r4 = 2
            if (r10 == 0) goto L_0x009d
            com.google.assistant.e.c.c.ac r10 = r7.f88936e
            int r10 = r10.ordinal()
            if (r10 == r2) goto L_0x0096
            if (r10 == r4) goto L_0x008f
            if (r10 == r1) goto L_0x0088
            r7.m61675d(r8)
            goto L_0x00a0
        L_0x0088:
            r10 = 2131235046(0x7f0810e6, float:1.8086275E38)
            r7.m61677f(r10)
            goto L_0x00a1
        L_0x008f:
            r10 = 2131234133(0x7f080d55, float:1.8084423E38)
            r7.m61677f(r10)
            goto L_0x00a1
        L_0x0096:
            r10 = 2131234087(0x7f080d27, float:1.808433E38)
            r7.m61677f(r10)
            goto L_0x00a1
        L_0x009d:
            r7.m61675d(r8)
        L_0x00a0:
            r2 = r0
        L_0x00a1:
            int r10 = r8.f132595a
            r0 = 4
            r10 = r10 & r0
            if (r10 == 0) goto L_0x00ac
            boolean r10 = r8.f132600f
            r7.setEnabled(r10)
        L_0x00ac:
            android.widget.TextView r10 = r7.f88938g
            if (r10 == 0) goto L_0x00bb
            if (r2 == 0) goto L_0x00b8
            r2 = 8
            r10.setVisibility(r2)
            goto L_0x00bb
        L_0x00b8:
            r10.setVisibility(r3)
        L_0x00bb:
            android.widget.LinearLayout r10 = r7.f88939h
            if (r10 == 0) goto L_0x00f9
            int r10 = r8.f132604j
            int r10 = com.google.assistant.p3897e.p3902c.p3907c.C50935ag.m85984a(r10)
            if (r10 != 0) goto L_0x00c8
            goto L_0x00f9
        L_0x00c8:
            if (r10 != r1) goto L_0x00f9
            com.google.assistant.e.j.e.fc r9 = r9.f88751a
            com.google.assistant.e.j.e.fc r10 = com.google.assistant.p3897e.p3921j.p3926e.C51950fc.FORM_UI_THEME_IRIS_GLANCEABILITY
            if (r9 != r10) goto L_0x00e1
            android.widget.LinearLayout r9 = r7.f88939h
            r10 = 0
            r9.setBackground(r10)
            android.widget.LinearLayout r9 = r7.f88939h
            r9.setPadding(r3, r3, r3, r3)
            android.widget.LinearLayout r9 = r7.f88939h
            r9.setMinimumHeight(r3)
            goto L_0x00f9
        L_0x00e1:
            android.widget.LinearLayout r9 = r7.f88939h
            android.content.res.Resources r10 = r7.getResources()
            android.content.Context r1 = r7.getContext()
            android.content.res.Resources$Theme r1 = r1.getTheme()
            r2 = 17170445(0x106000d, float:2.461195E-38)
            int r10 = r10.getColor(r2, r1)
            r9.setBackgroundColor(r10)
        L_0x00f9:
            android.widget.LinearLayout r9 = r7.f88939h
            if (r9 == 0) goto L_0x010e
            int r10 = r8.f132604j
            int r10 = com.google.assistant.p3897e.p3902c.p3907c.C50935ag.m85984a(r10)
            if (r10 != 0) goto L_0x0106
            goto L_0x010e
        L_0x0106:
            if (r10 != r0) goto L_0x010e
            r10 = 2131231966(0x7f0804de, float:1.8080028E38)
            r9.setBackgroundResource(r10)
        L_0x010e:
            android.view.View r9 = r7.f88940i
            if (r9 == 0) goto L_0x013d
            int r10 = r8.f132605k
            int r10 = com.google.assistant.p3897e.p3902c.p3907c.C50933ae.m85983a(r10)
            if (r10 != 0) goto L_0x011b
            goto L_0x013d
        L_0x011b:
            if (r10 != r4) goto L_0x013d
            r9.setVisibility(r3)
            android.view.View r9 = r7.f88941j
            if (r9 == 0) goto L_0x013d
            android.widget.TextView r10 = r7.f88942k
            if (r10 == 0) goto L_0x013d
            int r10 = r8.f132595a
            r10 = r10 & 1024(0x400, float:1.435E-42)
            if (r10 == 0) goto L_0x013d
            r9.setVisibility(r3)
            android.widget.TextView r9 = r7.f88942k
            r9.setVisibility(r3)
            android.widget.TextView r9 = r7.f88942k
            java.lang.String r8 = r8.f132606l
            r9.setText(r8)
        L_0x013d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.components.ButtonComponent.mo38638a(com.google.assistant.e.c.c.ah, com.google.android.libraries.search.assistant.fluidactions.rendering.a.i, boolean):void");
    }

    /* renamed from: b */
    public final void mo38639b(C51012dc dcVar, Drawable drawable) {
        ImageComponent imageComponent = this.f88937f;
        if (imageComponent != null) {
            imageComponent.setVisibility(0);
            this.f88937f.mo38649b(dcVar, drawable);
        }
    }

    /* renamed from: c */
    public final void mo38640c(String str) {
        TextView textView = this.f88938g;
        if (textView != null) {
            textView.setVisibility(0);
            this.f88938g.setText(str);
        }
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f88939h = (LinearLayout) findViewById(R.id.fa_button_component_container);
        this.f88937f = (ImageComponent) findViewById(R.id.fa_button_component_image);
        this.f88938g = (TextView) findViewById(R.id.fa_button_component_text);
        this.f88940i = findViewById(R.id.fa_button_component_trailing_line_decoration_start);
        this.f88941j = findViewById(R.id.fa_button_component_trailing_line_decoration_end);
        this.f88942k = (TextView) findViewById(R.id.fa_button_component_trailing_line_text);
    }

    public final void setEnabled(boolean z) {
        LinearLayout linearLayout;
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        super.setEnabled(z);
        if (this.f88938g != null && (linearLayout = this.f88939h) != null) {
            linearLayout.setEnabled(z);
            if (this.f88938g != null && this.f88937f != null) {
                C50931ac acVar = C50931ac.DEFAULT;
                int ordinal = this.f88936e.ordinal();
                if (ordinal == 1) {
                    Context context = getContext();
                    if (z) {
                        iArr = f88934c;
                    } else {
                        iArr = f88933b;
                    }
                    int c = C33234l.m61645c(context, R.attr.fa_button_component_foreground_cancel_color, iArr);
                    this.f88938g.setTextColor(c);
                    this.f88937f.mo38650c(c);
                    m61676e(R.attr.fa_button_component_background_cancel);
                } else if (ordinal != 2) {
                    TextView textView = this.f88938g;
                    Context context2 = getContext();
                    if (z) {
                        iArr3 = f88934c;
                    } else {
                        iArr3 = f88933b;
                    }
                    textView.setTextColor(C33234l.m61645c(context2, R.attr.fa_button_component_foreground_normal_color, iArr3));
                } else {
                    TextView textView2 = this.f88938g;
                    Context context3 = getContext();
                    if (z) {
                        iArr2 = f88935d;
                    } else {
                        iArr2 = f88933b;
                    }
                    textView2.setTextColor(C33234l.m61645c(context3, R.attr.fa_button_component_foreground_confirm_color, iArr2));
                    m61676e(R.attr.fa_button_component_background_confirm);
                }
            }
        }
    }

    public ButtonComponent(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ButtonComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ButtonComponent(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
