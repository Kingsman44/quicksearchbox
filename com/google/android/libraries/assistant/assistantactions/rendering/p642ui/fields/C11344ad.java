package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields;

import android.content.Context;
import android.widget.ArrayAdapter;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3897e.p3902c.p3907c.C51027dr;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.ad */
/* compiled from: PG */
public final class C11344ad extends ArrayAdapter {

    /* renamed from: a */
    final /* synthetic */ ContactSelectionField f37070a;

    /* renamed from: b */
    private final boolean f37071b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11344ad(ContactSelectionField contactSelectionField, Context context, C51027dr[] drVarArr, boolean z) {
        super(context, R.layout.contact_disambiguate_list_item, drVarArr);
        this.f37070a = contactSelectionField;
        this.f37071b = z;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View getView(int r7, android.view.View r8, android.view.ViewGroup r9) {
        /*
            r6 = this;
            java.lang.Object r9 = r6.getItem(r7)
            com.google.assistant.e.c.c.dr r9 = (com.google.assistant.p3897e.p3902c.p3907c.C51027dr) r9
            r0 = 0
            if (r8 != 0) goto L_0x001d
            android.content.Context r8 = r6.getContext()
            android.view.LayoutInflater r8 = android.view.LayoutInflater.from(r8)
            r1 = 2131624630(0x7f0e02b6, float:1.8876445E38)
            android.view.View r8 = r8.inflate(r1, r0)
            com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.ContactSelectionField r1 = r6.f37070a
            r1.mo19832f(r8, r7)
        L_0x001d:
            r7 = 2131429910(0x7f0b0a16, float:1.8481506E38)
            android.view.View r7 = r8.findViewById(r7)
            com.google.android.libraries.assistant.assistantactions.rendering.ui.components.ImageComponent r7 = (com.google.android.libraries.assistant.assistantactions.rendering.p642ui.components.ImageComponent) r7
            com.google.assistant.e.c.c.dc r1 = r9.f132864k
            if (r1 != 0) goto L_0x002c
            com.google.assistant.e.c.c.dc r1 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k
        L_0x002c:
            int r1 = r1.f132815a
            r1 = r1 & 32
            r2 = 2
            if (r1 == 0) goto L_0x003f
            com.google.assistant.e.c.c.dc r0 = r9.f132864k
            if (r0 != 0) goto L_0x0039
            com.google.assistant.e.c.c.dc r0 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k
        L_0x0039:
            java.lang.String r0 = r0.f132821g
            r7.mo19787c(r0)
            goto L_0x006e
        L_0x003f:
            boolean r1 = r6.f37071b
            if (r1 == 0) goto L_0x006e
            int r1 = r9.f132855b
            if (r1 != r2) goto L_0x0065
            com.google.android.libraries.assistant.assistantactions.rendering.ui.b.a r0 = new com.google.android.libraries.assistant.assistantactions.rendering.ui.b.a
            android.content.Context r1 = r6.getContext()
            int r3 = r9.f132855b
            java.lang.String r4 = ""
            if (r3 != r2) goto L_0x005a
            java.lang.Object r3 = r9.f132856c
            java.lang.String r3 = (java.lang.String) r3
            r5 = r3
            r3 = 2
            goto L_0x005b
        L_0x005a:
            r5 = r4
        L_0x005b:
            if (r3 != r2) goto L_0x0062
            java.lang.Object r3 = r9.f132856c
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4
        L_0x0062:
            r0.<init>(r1, r5, r4)
        L_0x0065:
            com.google.assistant.e.c.c.dc r1 = r9.f132864k
            if (r1 != 0) goto L_0x006b
            com.google.assistant.e.c.c.dc r1 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k
        L_0x006b:
            r7.mo19786b(r1, r0)
        L_0x006e:
            r7 = 2131429915(0x7f0b0a1b, float:1.8481516E38)
            android.view.View r7 = r8.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            int r0 = r9.f132855b
            r1 = 6
            r3 = 0
            if (r0 != r1) goto L_0x009a
            java.lang.Object r0 = r9.f132856c
            java.lang.String r0 = (java.lang.String) r0
            android.content.Context r1 = r6.getContext()     // Catch:{ NameNotFoundException -> 0x0098 }
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0098 }
            android.content.pm.ApplicationInfo r0 = r1.getApplicationInfo(r0, r3)     // Catch:{ NameNotFoundException -> 0x0098 }
            java.lang.CharSequence r0 = r1.getApplicationLabel(r0)     // Catch:{ NameNotFoundException -> 0x0098 }
            r7.setText(r0)     // Catch:{ NameNotFoundException -> 0x0098 }
            r7.setVisibility(r3)     // Catch:{ NameNotFoundException -> 0x0098 }
            goto L_0x00a6
        L_0x0098:
            goto L_0x00a6
        L_0x009a:
            if (r0 != r2) goto L_0x00a6
            java.lang.Object r0 = r9.f132856c
            java.lang.String r0 = (java.lang.String) r0
            r7.setText(r0)
            r7.setVisibility(r3)
        L_0x00a6:
            int r7 = r9.f132854a
            r7 = r7 & 16
            if (r7 == 0) goto L_0x00bd
            r7 = 2131429905(0x7f0b0a11, float:1.8481496E38)
            android.view.View r7 = r8.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            java.lang.String r9 = r9.f132861h
            r7.setText(r9)
            r7.setVisibility(r3)
        L_0x00bd:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields.C11344ad.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
