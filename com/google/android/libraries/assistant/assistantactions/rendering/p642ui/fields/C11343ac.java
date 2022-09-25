package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields;

import android.content.Context;
import android.widget.ArrayAdapter;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3897e.p3902c.p3907c.C50969bn;
import com.google.assistant.p3897e.p3902c.p3907c.C51027dr;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.ac */
/* compiled from: PG */
public final class C11343ac extends ArrayAdapter {

    /* renamed from: a */
    final /* synthetic */ ContactSelectionField f37065a;

    /* renamed from: b */
    private final C51027dr[] f37066b;

    /* renamed from: c */
    private final Context f37067c;

    /* renamed from: d */
    private final C50969bn f37068d;

    /* renamed from: e */
    private final boolean f37069e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11343ac(ContactSelectionField contactSelectionField, Context context, C51027dr[] drVarArr, C50969bn bnVar, boolean z) {
        super(context, R.layout.contact_disambiguate_list_item_for_coinview, R.layout.contact_disambiguation_pick_another_contact_coinview, drVarArr);
        this.f37065a = contactSelectionField;
        this.f37067c = context;
        this.f37066b = drVarArr;
        this.f37068d = bnVar;
        this.f37069e = z;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v23, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View getView(int r9, android.view.View r10, android.view.ViewGroup r11) {
        /*
            r8 = this;
            com.google.assistant.e.c.c.dr[] r11 = r8.f37066b
            int r11 = r11.length
            int r11 = r11 + -1
            r0 = 16
            java.lang.String r1 = ""
            r2 = 0
            r3 = 0
            if (r9 != r11) goto L_0x007d
            boolean r11 = r8.f37069e
            if (r11 == 0) goto L_0x007d
            android.content.Context r9 = r8.f37067c
            android.view.LayoutInflater r9 = android.view.LayoutInflater.from(r9)
            r10 = 2131624635(0x7f0e02bb, float:1.8876455E38)
            android.view.View r9 = r9.inflate(r10, r2)
            com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.ContactSelectionField r10 = r8.f37065a
            com.google.android.libraries.assistant.assistantactions.rendering.c.c r10 = r10.f37153l
            if (r10 != 0) goto L_0x0025
            goto L_0x004e
        L_0x0025:
            com.google.assistant.e.j.e.eu r10 = r10.f36729a
            int r11 = r10.f136277e
            if (r11 != r0) goto L_0x0030
            java.lang.Object r10 = r10.f136278f
            com.google.assistant.e.c.c.bn r10 = (com.google.assistant.p3897e.p3902c.p3907c.C50969bn) r10
            goto L_0x0032
        L_0x0030:
            com.google.assistant.e.c.c.bn r10 = com.google.assistant.p3897e.p3902c.p3907c.C50969bn.f132678i
        L_0x0032:
            int r11 = r10.f132680a
            r11 = r11 & 32
            if (r11 == 0) goto L_0x003b
            int r10 = r10.f132686g
            goto L_0x003e
        L_0x003b:
            r10 = 92773(0x16a65, float:1.30003E-40)
        L_0x003e:
            com.google.android.libraries.logging.j r11 = new com.google.android.libraries.logging.j
            r11.<init>(r10)
            r10 = 5
            r11.mo33795i(r10)
            r10 = 4
            r11.mo33795i(r10)
            com.google.android.libraries.logging.C28295m.m52919e(r9, r11)
        L_0x004e:
            com.google.assistant.e.c.c.bn r10 = r8.f37068d
            com.google.assistant.e.c.c.ah r10 = r10.f132684e
            if (r10 != 0) goto L_0x0056
            com.google.assistant.e.c.c.ah r10 = com.google.assistant.p3897e.p3902c.p3907c.C50936ah.f132593m
        L_0x0056:
            r11 = 2131429419(0x7f0b082b, float:1.848051E38)
            android.view.View r11 = r9.findViewById(r11)
            android.widget.ImageView r11 = (android.widget.ImageView) r11
            r0 = 2131429420(0x7f0b082c, float:1.8480512E38)
            android.view.View r0 = r9.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r11.setVisibility(r3)
            r0.setVisibility(r3)
            int r11 = r10.f132596b
            r2 = 1
            if (r11 != r2) goto L_0x0078
            java.lang.Object r10 = r10.f132597c
            r1 = r10
            java.lang.String r1 = (java.lang.String) r1
        L_0x0078:
            r0.setText(r1)
            goto L_0x0151
        L_0x007d:
            java.lang.Object r11 = r8.getItem(r9)
            com.google.assistant.e.c.c.dr r11 = (com.google.assistant.p3897e.p3902c.p3907c.C51027dr) r11
            if (r10 == 0) goto L_0x008e
            r4 = 2131429906(0x7f0b0a12, float:1.8481498E38)
            android.view.View r4 = r10.findViewById(r4)
            if (r4 != 0) goto L_0x00a2
        L_0x008e:
            android.content.Context r10 = r8.getContext()
            android.view.LayoutInflater r10 = android.view.LayoutInflater.from(r10)
            r4 = 2131624631(0x7f0e02b7, float:1.8876447E38)
            android.view.View r10 = r10.inflate(r4, r2)
            com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.ContactSelectionField r4 = r8.f37065a
            r4.mo19832f(r10, r9)
        L_0x00a2:
            if (r11 != 0) goto L_0x00b3
            com.google.common.f.e r9 = com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields.ContactSelectionField.f36949a
            com.google.common.f.x r9 = r9.mo56225c()
            java.lang.String r11 = "disambiguation list contains null object."
            r0 = 43230(0xa8de, float:6.0578E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r9).mo56372aa(r0)).mo56386p(r11)
            return r10
        L_0x00b3:
            r9 = 2131429908(0x7f0b0a14, float:1.8481502E38)
            android.view.View r9 = r10.findViewById(r9)
            com.google.android.libraries.assistant.assistantactions.rendering.ui.components.ImageComponent r9 = (com.google.android.libraries.assistant.assistantactions.rendering.p642ui.components.ImageComponent) r9
            com.google.assistant.e.c.c.dc r4 = r11.f132864k
            if (r4 != 0) goto L_0x00c2
            com.google.assistant.e.c.c.dc r4 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k
        L_0x00c2:
            int r4 = r4.f132815a
            r4 = r4 & 32
            r5 = 2
            if (r4 == 0) goto L_0x00d5
            com.google.assistant.e.c.c.dc r1 = r11.f132864k
            if (r1 != 0) goto L_0x00cf
            com.google.assistant.e.c.c.dc r1 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k
        L_0x00cf:
            java.lang.String r1 = r1.f132821g
            r9.mo19787c(r1)
            goto L_0x00fd
        L_0x00d5:
            int r4 = r11.f132855b
            if (r4 != r5) goto L_0x00f4
            com.google.android.libraries.assistant.assistantactions.rendering.ui.b.a r2 = new com.google.android.libraries.assistant.assistantactions.rendering.ui.b.a
            android.content.Context r4 = r8.getContext()
            int r6 = r11.f132855b
            if (r6 != r5) goto L_0x00ea
            java.lang.Object r6 = r11.f132856c
            java.lang.String r6 = (java.lang.String) r6
            r7 = r6
            r6 = 2
            goto L_0x00eb
        L_0x00ea:
            r7 = r1
        L_0x00eb:
            if (r6 != r5) goto L_0x00f1
            java.lang.Object r1 = r11.f132856c
            java.lang.String r1 = (java.lang.String) r1
        L_0x00f1:
            r2.<init>(r4, r7, r1)
        L_0x00f4:
            com.google.assistant.e.c.c.dc r1 = r11.f132864k
            if (r1 != 0) goto L_0x00fa
            com.google.assistant.e.c.c.dc r1 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k
        L_0x00fa:
            r9.mo19786b(r1, r2)
        L_0x00fd:
            r9 = 2131429909(0x7f0b0a15, float:1.8481504E38)
            android.view.View r9 = r10.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            int r1 = r11.f132855b
            r2 = 6
            if (r1 != r2) goto L_0x0136
            java.lang.Object r1 = r11.f132856c
            java.lang.String r1 = (java.lang.String) r1
            android.content.Context r2 = r8.getContext()     // Catch:{ NameNotFoundException -> 0x0126 }
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0126 }
            android.content.pm.ApplicationInfo r1 = r2.getApplicationInfo(r1, r3)     // Catch:{ NameNotFoundException -> 0x0126 }
            java.lang.CharSequence r1 = r2.getApplicationLabel(r1)     // Catch:{ NameNotFoundException -> 0x0126 }
            r9.setText(r1)     // Catch:{ NameNotFoundException -> 0x0126 }
            r9.setVisibility(r3)     // Catch:{ NameNotFoundException -> 0x0126 }
            goto L_0x0142
        L_0x0126:
            int r1 = r11.f132854a
            r1 = r1 & 8
            if (r1 == 0) goto L_0x0142
            java.lang.String r1 = r11.f132860g
            r9.setText(r1)
            r9.setVisibility(r3)
            goto L_0x0142
        L_0x0136:
            if (r1 != r5) goto L_0x0142
            java.lang.Object r1 = r11.f132856c
            java.lang.String r1 = (java.lang.String) r1
            r9.setText(r1)
            r9.setVisibility(r3)
        L_0x0142:
            r9 = 2131429907(0x7f0b0a13, float:1.84815E38)
            android.view.View r9 = r10.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            int r1 = r11.f132854a
            r0 = r0 & r1
            if (r0 != 0) goto L_0x0152
            r9 = r10
        L_0x0151:
            return r9
        L_0x0152:
            java.lang.String r11 = r11.f132861h
            r9.setText(r11)
            r9.setVisibility(r3)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields.C11343ac.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
