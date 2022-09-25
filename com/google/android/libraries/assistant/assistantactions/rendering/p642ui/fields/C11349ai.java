package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields;

import android.content.Context;
import android.widget.ArrayAdapter;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3897e.p3902c.p3907c.C51027dr;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.ai */
/* compiled from: PG */
public final class C11349ai extends ArrayAdapter {

    /* renamed from: a */
    final /* synthetic */ ContactSelectionFieldV2 f37076a;

    /* renamed from: b */
    private final boolean f37077b;

    /* renamed from: c */
    private final boolean f37078c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11349ai(ContactSelectionFieldV2 contactSelectionFieldV2, Context context, C51027dr[] drVarArr, boolean z, boolean z2) {
        super(context, R.layout.contact_disambiguate_list_item_v2, drVarArr);
        this.f37076a = contactSelectionFieldV2;
        this.f37077b = z;
        this.f37078c = z2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View getView(int r12, android.view.View r13, android.view.ViewGroup r14) {
        /*
            r11 = this;
            java.lang.Object r14 = r11.getItem(r12)
            com.google.assistant.e.c.c.dr r14 = (com.google.assistant.p3897e.p3902c.p3907c.C51027dr) r14
            r0 = 16
            r1 = 0
            r2 = 2
            if (r13 != 0) goto L_0x005c
            android.content.Context r13 = r11.getContext()
            android.view.LayoutInflater r13 = android.view.LayoutInflater.from(r13)
            r3 = 2131624633(0x7f0e02b9, float:1.8876451E38)
            android.view.View r13 = r13.inflate(r3, r1)
            com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.ContactSelectionFieldV2 r3 = r11.f37076a
            com.google.android.libraries.assistant.assistantactions.rendering.c.c r3 = r3.f37153l
            if (r3 != 0) goto L_0x0022
            goto L_0x005c
        L_0x0022:
            com.google.assistant.e.j.e.eu r3 = r3.f36729a
            int r4 = r3.f136277e
            if (r4 != r0) goto L_0x002d
            java.lang.Object r3 = r3.f136278f
            com.google.assistant.e.c.c.bn r3 = (com.google.assistant.p3897e.p3902c.p3907c.C50969bn) r3
            goto L_0x002f
        L_0x002d:
            com.google.assistant.e.c.c.bn r3 = com.google.assistant.p3897e.p3902c.p3907c.C50969bn.f132678i
        L_0x002f:
            int r4 = r3.f132680a
            r4 = r4 & r0
            if (r4 == 0) goto L_0x0037
            int r3 = r3.f132685f
            goto L_0x003a
        L_0x0037:
            r3 = 92560(0x16990, float:1.29704E-40)
        L_0x003a:
            com.google.android.libraries.logging.j r4 = new com.google.android.libraries.logging.j
            r4.<init>(r3)
            r3 = 5
            r4.mo33795i(r3)
            com.google.common.o.aqp r3 = r4.f76974b
            r3.copyOnWrite()
            com.google.protobuf.bv r3 = r3.instance
            com.google.common.o.aqs r3 = (com.google.common.p4552o.aqs) r3
            com.google.common.o.aqs r5 = com.google.common.p4552o.aqs.f159780k
            int r5 = r3.f159782a
            r5 = r5 | r2
            r3.f159782a = r5
            r3.f159784c = r12
            r12 = 4
            r4.mo33795i(r12)
            com.google.android.libraries.logging.C28295m.m52919e(r13, r4)
        L_0x005c:
            r12 = 2131429921(0x7f0b0a21, float:1.8481528E38)
            android.view.View r12 = r13.findViewById(r12)
            android.widget.RelativeLayout r12 = (android.widget.RelativeLayout) r12
            r3 = 2131429929(0x7f0b0a29, float:1.8481545E38)
            android.view.View r3 = r13.findViewById(r3)
            com.google.android.libraries.assistant.assistantactions.rendering.ui.components.ImageComponent r3 = (com.google.android.libraries.assistant.assistantactions.rendering.p642ui.components.ImageComponent) r3
            r4 = 2131429919(0x7f0b0a1f, float:1.8481524E38)
            android.view.View r4 = r13.findViewById(r4)
            com.google.android.libraries.assistant.assistantactions.rendering.ui.components.ImageComponent r4 = (com.google.android.libraries.assistant.assistantactions.rendering.p642ui.components.ImageComponent) r4
            r5 = 2131429920(0x7f0b0a20, float:1.8481526E38)
            android.view.View r5 = r13.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r6 = 2131429918(0x7f0b0a1e, float:1.8481522E38)
            android.view.View r6 = r13.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r7 = 8
            r12.setVisibility(r7)
            r3.setVisibility(r7)
            r4.setVisibility(r7)
            r5.setVisibility(r7)
            r6.setVisibility(r7)
            boolean r7 = r11.f37077b
            if (r7 == 0) goto L_0x00c0
            int r7 = r14.f132855b
            if (r7 != r2) goto L_0x00c0
            com.google.android.libraries.assistant.assistantactions.rendering.ui.b.a r1 = new com.google.android.libraries.assistant.assistantactions.rendering.ui.b.a
            android.content.Context r7 = r11.getContext()
            int r8 = r14.f132855b
            java.lang.String r9 = ""
            if (r8 != r2) goto L_0x00b5
            java.lang.Object r8 = r14.f132856c
            java.lang.String r8 = (java.lang.String) r8
            r10 = r8
            r8 = 2
            goto L_0x00b6
        L_0x00b5:
            r10 = r9
        L_0x00b6:
            if (r8 != r2) goto L_0x00bd
            java.lang.Object r8 = r14.f132856c
            r9 = r8
            java.lang.String r9 = (java.lang.String) r9
        L_0x00bd:
            r1.<init>(r7, r10, r9)
        L_0x00c0:
            boolean r7 = r11.f37078c
            r8 = 1
            r9 = 0
            if (r7 == 0) goto L_0x00d8
            r12.setVisibility(r9)
            r3.setVisibility(r9)
            r3.f36858e = r8
            com.google.assistant.e.c.c.dc r12 = r14.f132864k
            if (r12 != 0) goto L_0x00d4
            com.google.assistant.e.c.c.dc r12 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k
        L_0x00d4:
            r3.mo19786b(r12, r1)
            goto L_0x00e6
        L_0x00d8:
            r4.setVisibility(r9)
            r4.f36858e = r8
            com.google.assistant.e.c.c.dc r12 = r14.f132864k
            if (r12 != 0) goto L_0x00e3
            com.google.assistant.e.c.c.dc r12 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k
        L_0x00e3:
            r4.mo19786b(r12, r1)
        L_0x00e6:
            int r12 = r14.f132855b
            r1 = 6
            if (r12 != r1) goto L_0x0108
            java.lang.Object r12 = r14.f132856c
            java.lang.String r12 = (java.lang.String) r12
            android.content.Context r1 = r11.getContext()     // Catch:{ NameNotFoundException -> 0x0106 }
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0106 }
            android.content.pm.ApplicationInfo r12 = r1.getApplicationInfo(r12, r9)     // Catch:{ NameNotFoundException -> 0x0106 }
            java.lang.CharSequence r12 = r1.getApplicationLabel(r12)     // Catch:{ NameNotFoundException -> 0x0106 }
            r5.setText(r12)     // Catch:{ NameNotFoundException -> 0x0106 }
            r5.setVisibility(r9)     // Catch:{ NameNotFoundException -> 0x0106 }
            goto L_0x0114
        L_0x0106:
            goto L_0x0114
        L_0x0108:
            if (r12 != r2) goto L_0x0114
            java.lang.Object r12 = r14.f132856c
            java.lang.String r12 = (java.lang.String) r12
            r5.setText(r12)
            r5.setVisibility(r9)
        L_0x0114:
            int r12 = r14.f132854a
            r12 = r12 & r0
            if (r12 == 0) goto L_0x0121
            java.lang.String r12 = r14.f132861h
            r6.setText(r12)
            r6.setVisibility(r9)
        L_0x0121:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields.C11349ai.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
