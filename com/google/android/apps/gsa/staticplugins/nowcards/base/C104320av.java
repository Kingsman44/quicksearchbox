package com.google.android.apps.gsa.staticplugins.nowcards.base;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;
import com.google.android.apps.gsa.shared.p7000au.p7002b.C89291a;
import com.google.android.apps.gsa.sidekick.shared.p7235e.p7236a.C91728l;
import com.google.p375ai.p378b.C8194z;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.base.av */
/* compiled from: PG */
public final class C104320av extends ArrayAdapter {

    /* renamed from: a */
    private final LayoutInflater f290219a;

    /* renamed from: b */
    private final Context f290220b;

    /* renamed from: c */
    private final C89291a f290221c;

    /* renamed from: d */
    private final C91728l f290222d;

    /* renamed from: e */
    private final boolean f290223e;

    public C104320av(Context context, C8194z[] zVarArr, C89291a aVar, C91728l lVar, boolean z) {
        super(context, 0, zVarArr);
        this.f290219a = LayoutInflater.from(context);
        this.f290220b = context;
        this.f290221c = aVar;
        this.f290222d = lVar;
        this.f290223e = z;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0049, code lost:
        if (r4 != false) goto L_0x004b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View getView(int r7, android.view.View r8, android.view.ViewGroup r9) {
        /*
            r6 = this;
            java.lang.Object r7 = r6.getItem(r7)
            com.google.ai.b.z r7 = (com.google.p375ai.p378b.C8194z) r7
            android.content.Context r0 = r6.f290220b
            android.content.res.Resources$Theme r0 = r0.getTheme()
            boolean r1 = r6.f290223e
            r2 = 1
            if (r2 == r1) goto L_0x0015
            r1 = 2132151949(0x7f160e8d, float:1.9945975E38)
            goto L_0x0018
        L_0x0015:
            r1 = 2132151948(0x7f160e8c, float:1.9945973E38)
        L_0x0018:
            r0.applyStyle(r1, r2)
            r0 = 0
            if (r8 != 0) goto L_0x0027
            android.view.LayoutInflater r8 = r6.f290219a
            r1 = 2131624506(0x7f0e023a, float:1.8876194E38)
            android.view.View r8 = r8.inflate(r1, r9, r0)
        L_0x0027:
            r9 = 2131432642(0x7f0b14c2, float:1.8487047E38)
            android.view.View r9 = r8.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            int r1 = r7.f28779a
            r1 = r1 & r2
            java.lang.String r3 = ""
            if (r1 == 0) goto L_0x003a
            java.lang.String r1 = r7.f28780b
            goto L_0x003b
        L_0x003a:
            r1 = r3
        L_0x003b:
            java.lang.String r4 = "<"
            boolean r4 = r1.contains(r4)
            if (r4 != 0) goto L_0x004b
            java.lang.String r4 = "&"
            boolean r4 = r1.contains(r4)
            if (r4 == 0) goto L_0x004f
        L_0x004b:
            android.text.Spanned r1 = android.text.Html.fromHtml(r1)
        L_0x004f:
            r9.setText(r1)
            int r1 = r7.f28779a
            r1 = r1 & 64
            if (r1 == 0) goto L_0x006a
            com.google.ai.b.xj r1 = r7.f28786h
            if (r1 != 0) goto L_0x005e
            com.google.ai.b.xj r1 = com.google.p375ai.p378b.C8150xj.f28657d
        L_0x005e:
            com.google.android.apps.gsa.shared.au.b.a r4 = r6.f290221c
            android.content.Context r5 = r6.f290220b
            java.lang.String r1 = r4.mo83231a(r5, r1)
            r9.setContentDescription(r1)
            goto L_0x006e
        L_0x006a:
            r1 = 0
            r9.setContentDescription(r1)
        L_0x006e:
            r9 = 2131432348(0x7f0b139c, float:1.848645E38)
            android.view.View r9 = r8.findViewById(r9)
            com.google.android.apps.gsa.now.shared.ui.WebImageView r9 = (com.google.android.apps.gsa.now.shared.p6421ui.WebImageView) r9
            r1 = 2131432337(0x7f0b1391, float:1.8486429E38)
            android.view.View r1 = r8.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r4 = 8
            r9.setVisibility(r4)
            r1.setVisibility(r4)
            com.google.ai.b.lv r4 = r7.f28785g
            if (r4 != 0) goto L_0x008e
            com.google.ai.b.lv r4 = com.google.p375ai.p378b.C7838lv.f27474p
        L_0x008e:
            int r4 = r4.f27477b
            r5 = 2
            if (r4 != r5) goto L_0x00af
            com.google.ai.b.lv r7 = r7.f28785g
            if (r7 != 0) goto L_0x0099
            com.google.ai.b.lv r7 = com.google.p375ai.p378b.C7838lv.f27474p
        L_0x0099:
            int r1 = r7.f27477b
            if (r1 != r5) goto L_0x00a2
            java.lang.Object r7 = r7.f27478c
            r3 = r7
            java.lang.String r3 = (java.lang.String) r3
        L_0x00a2:
            com.google.android.apps.gsa.sidekick.shared.e.a.l r7 = r6.f290222d
            com.google.android.apps.gsa.shared.y.au r7 = r7.mo86214a()
            r9.mo76738i(r3, r7)
            r9.setVisibility(r0)
            goto L_0x00dd
        L_0x00af:
            com.google.ai.b.lv r7 = r7.f28785g
            if (r7 != 0) goto L_0x00b6
            com.google.ai.b.lv r9 = com.google.p375ai.p378b.C7838lv.f27474p
            goto L_0x00b7
        L_0x00b6:
            r9 = r7
        L_0x00b7:
            int r9 = r9.f27477b
            if (r9 != r2) goto L_0x00dd
            if (r7 != 0) goto L_0x00bf
            com.google.ai.b.lv r7 = com.google.p375ai.p378b.C7838lv.f27474p
        L_0x00bf:
            int r9 = r7.f27477b
            if (r9 != r2) goto L_0x00d3
            java.lang.Object r7 = r7.f27478c
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            int r7 = com.google.p375ai.p378b.C7539b.m22781a(r7)
            if (r7 != 0) goto L_0x00d2
            goto L_0x00d3
        L_0x00d2:
            r2 = r7
        L_0x00d3:
            int r7 = com.google.android.apps.gsa.sidekick.shared.util.C91992k.m150980h(r2)
            r1.setImageResource(r7)
            r1.setVisibility(r0)
        L_0x00dd:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.nowcards.base.C104320av.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
