package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.components;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.assistantactions.rendering.p641d.C11307e;
import com.google.assistant.p3897e.p3902c.p3907c.C50931ac;
import com.google.assistant.p3897e.p3902c.p3907c.C50936ah;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3897e.p3902c.p3907c.C51014de;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.components.ButtonComponent */
/* compiled from: PG */
public class ButtonComponent extends LinearLayout {

    /* renamed from: a */
    private static final C59071e f36815a = C59071e.m91332i("com.google.android.libraries.assistant.assistantactions.rendering.ui.components.ButtonComponent");

    /* renamed from: b */
    private static final int[] f36816b = {-16842910};

    /* renamed from: c */
    private static final int[] f36817c = {16842910};

    /* renamed from: d */
    private static final int[] f36818d = {16842910, 16842914};

    /* renamed from: e */
    private C50931ac f36819e = C50931ac.DEFAULT;

    /* renamed from: f */
    private ImageComponent f36820f;

    /* renamed from: g */
    private TextView f36821g;

    /* renamed from: h */
    private LinearLayout f36822h;

    /* renamed from: i */
    private View f36823i;

    /* renamed from: j */
    private View f36824j;

    /* renamed from: k */
    private TextView f36825k;

    public ButtonComponent(Context context) {
        super(context);
    }

    /* renamed from: d */
    private final void m26948d(C50936ah ahVar) {
        C51012dc dcVar = ahVar.f132601g;
        if (dcVar == null) {
            dcVar = C51012dc.f132813k;
        }
        if ((dcVar.f132815a & 2) != 0) {
            C51012dc dcVar2 = ahVar.f132601g;
            String str = (dcVar2 == null ? C51012dc.f132813k : dcVar2).f132817c;
            if (dcVar2 == null) {
                dcVar2 = C51012dc.f132813k;
            }
            int a = C51014de.m86008a(dcVar2.f132816b);
            if (a == 0) {
                a = 1;
            }
            mo19770c(str, a);
            return;
        }
        C51012dc dcVar3 = ahVar.f132601g;
        if (((dcVar3 == null ? C51012dc.f132813k : dcVar3).f132815a & 32) != 0) {
            if (dcVar3 == null) {
                try {
                    dcVar3 = C51012dc.f132813k;
                } catch (PackageManager.NameNotFoundException e) {
                    C59052c cVar = (C59052c) ((C59052c) ((C59052c) f36815a.mo56225c()).mo56382g(e)).mo56372aa(43173);
                    C51012dc dcVar4 = ahVar.f132601g;
                    if (dcVar4 == null) {
                        dcVar4 = C51012dc.f132813k;
                    }
                    cVar.mo56389s("Invalid package name: %s", dcVar4.f132821g);
                    return;
                }
            }
            PackageManager packageManager = getContext().getPackageManager();
            C51012dc dcVar5 = ahVar.f132601g;
            if (dcVar5 == null) {
                dcVar5 = C51012dc.f132813k;
            }
            Drawable applicationIcon = packageManager.getApplicationIcon(dcVar5.f132821g);
            this.f36820f.setVisibility(0);
            this.f36820f.mo19786b(dcVar3, applicationIcon);
        }
    }

    /* renamed from: e */
    private final void m26949e(int i) {
        this.f36820f.f36859f.setImageResource(i);
        this.f36820f.setVisibility(0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x010d A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:58:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo19768a(com.google.assistant.p3897e.p3902c.p3907c.C50936ah r8, boolean r9, boolean r10) {
        /*
            r7 = this;
            java.lang.String r0 = ""
            int r1 = r8.f132602h
            com.google.assistant.e.c.c.ac r1 = com.google.assistant.p3897e.p3902c.p3907c.C50931ac.m85981a(r1)
            if (r1 != 0) goto L_0x000c
            com.google.assistant.e.c.c.ac r1 = com.google.assistant.p3897e.p3902c.p3907c.C50931ac.DEFAULT
        L_0x000c:
            r7.f36819e = r1
            int r1 = r8.f132596b
            r2 = 1
            r3 = 0
            if (r1 != r2) goto L_0x001d
            java.lang.Object r0 = r8.f132597c
            java.lang.String r0 = (java.lang.String) r0
            r7.mo19769b(r0)
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
            r7.mo19769b(r1)     // Catch:{ NameNotFoundException -> 0x004d }
            goto L_0x001b
        L_0x004d:
            r1 = move-exception
            com.google.common.f.e r5 = f36815a
            com.google.common.f.x r5 = r5.mo56225c()
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5
            com.google.common.f.x r1 = r5.mo56382g(r1)
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            r5 = 43174(0xa8a6, float:6.05E-41)
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
            if (r9 == 0) goto L_0x009d
            com.google.assistant.e.c.c.ac r9 = r7.f36819e
            int r9 = r9.ordinal()
            if (r9 == r2) goto L_0x0096
            if (r9 == r4) goto L_0x008f
            if (r9 == r1) goto L_0x0088
            r7.m26948d(r8)
            goto L_0x00a0
        L_0x0088:
            r9 = 2131235046(0x7f0810e6, float:1.8086275E38)
            r7.m26949e(r9)
            goto L_0x00a1
        L_0x008f:
            r9 = 2131234133(0x7f080d55, float:1.8084423E38)
            r7.m26949e(r9)
            goto L_0x00a1
        L_0x0096:
            r9 = 2131234087(0x7f080d27, float:1.808433E38)
            r7.m26949e(r9)
            goto L_0x00a1
        L_0x009d:
            r7.m26948d(r8)
        L_0x00a0:
            r2 = r0
        L_0x00a1:
            int r9 = r8.f132595a
            r0 = 4
            r9 = r9 & r0
            if (r9 == 0) goto L_0x00ac
            boolean r9 = r8.f132600f
            r7.setEnabled(r9)
        L_0x00ac:
            if (r2 == 0) goto L_0x00b6
            android.widget.TextView r9 = r7.f36821g
            r2 = 8
            r9.setVisibility(r2)
            goto L_0x00bb
        L_0x00b6:
            android.widget.TextView r9 = r7.f36821g
            r9.setVisibility(r3)
        L_0x00bb:
            int r9 = r8.f132604j
            int r9 = com.google.assistant.p3897e.p3902c.p3907c.C50935ag.m85984a(r9)
            if (r9 != 0) goto L_0x00c4
            goto L_0x00f1
        L_0x00c4:
            if (r9 != r1) goto L_0x00f1
            if (r10 == 0) goto L_0x00d9
            android.widget.LinearLayout r9 = r7.f36822h
            r10 = 0
            r9.setBackground(r10)
            android.widget.LinearLayout r9 = r7.f36822h
            r9.setPadding(r3, r3, r3, r3)
            android.widget.LinearLayout r9 = r7.f36822h
            r9.setMinimumHeight(r3)
            goto L_0x00f1
        L_0x00d9:
            android.widget.LinearLayout r9 = r7.f36822h
            android.content.res.Resources r10 = r7.getResources()
            android.content.Context r1 = r7.getContext()
            android.content.res.Resources$Theme r1 = r1.getTheme()
            r2 = 17170445(0x106000d, float:2.461195E-38)
            int r10 = r10.getColor(r2, r1)
            r9.setBackgroundColor(r10)
        L_0x00f1:
            int r9 = r8.f132604j
            int r9 = com.google.assistant.p3897e.p3902c.p3907c.C50935ag.m85984a(r9)
            if (r9 != 0) goto L_0x00fa
            goto L_0x0104
        L_0x00fa:
            if (r9 != r0) goto L_0x0104
            android.widget.LinearLayout r9 = r7.f36822h
            r10 = 2131232040(0x7f080528, float:1.8080178E38)
            r9.setBackgroundResource(r10)
        L_0x0104:
            int r9 = r8.f132605k
            int r9 = com.google.assistant.p3897e.p3902c.p3907c.C50933ae.m85983a(r9)
            if (r9 != 0) goto L_0x010d
            goto L_0x012b
        L_0x010d:
            if (r9 != r4) goto L_0x012b
            android.view.View r9 = r7.f36823i
            r9.setVisibility(r3)
            int r9 = r8.f132595a
            r9 = r9 & 1024(0x400, float:1.435E-42)
            if (r9 == 0) goto L_0x012b
            android.view.View r9 = r7.f36824j
            r9.setVisibility(r3)
            android.widget.TextView r9 = r7.f36825k
            r9.setVisibility(r3)
            android.widget.TextView r9 = r7.f36825k
            java.lang.String r8 = r8.f132606l
            r9.setText(r8)
        L_0x012b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.assistantactions.rendering.p642ui.components.ButtonComponent.mo19768a(com.google.assistant.e.c.c.ah, boolean, boolean):void");
    }

    /* renamed from: b */
    public final void mo19769b(String str) {
        this.f36821g.setVisibility(0);
        this.f36821g.setText(str);
    }

    /* renamed from: c */
    public final void mo19770c(String str, int i) {
        this.f36820f.setVisibility(0);
        this.f36820f.mo19788d(str, i);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f36822h = (LinearLayout) findViewById(R.id.button_component_button);
        this.f36820f = (ImageComponent) findViewById(R.id.button_component_image_component);
        this.f36821g = (TextView) findViewById(R.id.button_component_text_view);
        this.f36823i = findViewById(R.id.button_component_trailing_line_decoration_start);
        this.f36824j = findViewById(R.id.button_component_trailing_line_decoration_end);
        this.f36825k = (TextView) findViewById(R.id.button_component_trailing_line_text);
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!z) {
            this.f36821g.setTextColor(C11307e.m26909b(getContext(), R.attr.fluid_actions_button_component_disabled_text_color, f36816b));
        } else if (this.f36819e == C50931ac.CONFIRM) {
            this.f36821g.setTextColor(C11307e.m26909b(getContext(), R.attr.fluid_actions_button_component_highlight_text_color, f36818d));
        } else {
            this.f36821g.setTextColor(C11307e.m26909b(getContext(), R.attr.fluid_actions_button_component_enabled_text_color, f36817c));
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
