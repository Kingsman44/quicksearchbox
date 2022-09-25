package com.google.android.apps.gsa.staticplugins.nowcards.p8117g;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.staticplugins.nowcards.base.C104348l;
import com.google.android.apps.gsa.staticplugins.nowcards.base.C104350n;
import com.google.android.apps.gsa.staticplugins.nowcards.p8123ui.TextOrIconTableRow;
import com.google.android.apps.p489g.p494d.C9157at;
import com.google.android.apps.p489g.p494d.C9277u;
import com.google.android.googlequicksearchbox.R;
import com.google.p375ai.p378b.C7782jt;
import com.google.p375ai.p378b.C7783ju;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.g.u */
/* compiled from: PG */
public final class C104975u extends C104348l {
    public C104975u(Context context, C104350n nVar) {
        super(context, nVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: android.widget.TextView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: com.google.android.apps.gsa.now.shared.ui.WebImageView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: android.widget.TextView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: android.widget.TextView} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.apps.gsa.staticplugins.nowcards.p8123ui.TextOrIconTableRow m174035L(java.util.List r6, int r7, int r8, int r9, com.google.android.apps.gsa.shared.p7195y.C91189au r10, boolean r11) {
        /*
            r5 = this;
            com.google.android.apps.gsa.sidekick.shared.ui.p r0 = r5.f290308c
            android.view.LayoutInflater r0 = r0.f256406b
            r1 = 2131626599(0x7f0e0a67, float:1.8880439E38)
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r2)
            com.google.android.apps.gsa.staticplugins.nowcards.ui.TextOrIconTableRow r0 = (com.google.android.apps.gsa.staticplugins.nowcards.p8123ui.TextOrIconTableRow) r0
            r0.f292774a = r7
            r0.f292778e = r8
            r0.f292777d = r9
            r0.f292779f = r11
            java.util.Iterator r6 = r6.iterator()
        L_0x001a:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x00bd
            java.lang.Object r7 = r6.next()
            com.google.ai.b.xp r7 = (com.google.p375ai.p378b.C8156xp) r7
            android.content.Context r8 = r0.getContext()
            int r9 = r7.f28671a
            r11 = 2
            r9 = r9 & r11
            r1 = 16
            r2 = 1
            r3 = 0
            if (r9 == 0) goto L_0x004b
            com.google.android.apps.gsa.now.shared.ui.WebImageView r9 = new com.google.android.apps.gsa.now.shared.ui.WebImageView
            r9.<init>(r8)
            com.google.ai.b.nw r8 = r7.f28673c
            if (r8 != 0) goto L_0x003f
            com.google.ai.b.nw r8 = com.google.p375ai.p378b.C7893nw.f27731q
        L_0x003f:
            java.lang.String r8 = com.google.android.apps.gsa.sidekick.shared.util.C91978bb.m150938d(r8)
            r9.mo76738i(r8, r10)
            int r8 = r0.f292775b
            int r11 = r0.f292776c
            goto L_0x0095
        L_0x004b:
            android.widget.TextView r9 = new android.widget.TextView
            r9.<init>(r8)
            int r4 = r7.f28671a
            r4 = r4 & r2
            if (r4 == 0) goto L_0x0058
            java.lang.String r4 = r7.f28672b
            goto L_0x005a
        L_0x0058:
            java.lang.String r4 = ""
        L_0x005a:
            r9.setText(r4)
            r9.setSingleLine()
            android.text.TextUtils$TruncateAt r4 = android.text.TextUtils.TruncateAt.END
            r9.setEllipsize(r4)
            int r4 = r0.f292774a
            if (r4 <= 0) goto L_0x006c
            r9.setTextAppearance(r8, r4)
        L_0x006c:
            boolean r8 = r0.f292779f
            if (r8 == 0) goto L_0x0076
            r9.setSingleLine(r3)
            r9.setMaxLines(r11)
        L_0x0076:
            int r8 = r7.f28671a
            r8 = r8 & r1
            r4 = 5
            if (r8 == 0) goto L_0x008f
            int r8 = r7.f28675e
            int r8 = com.google.p375ai.p378b.C8154xn.m22958a(r8)
            if (r8 != 0) goto L_0x0085
            r8 = 1
        L_0x0085:
            int r8 = r8 + -1
            if (r8 == r2) goto L_0x008e
            if (r8 == r11) goto L_0x008c
            goto L_0x008f
        L_0x008c:
            r4 = 6
            goto L_0x008f
        L_0x008e:
            r4 = 4
        L_0x008f:
            r9.setTextAlignment(r4)
            int r8 = r0.f292778e
            r11 = -2
        L_0x0095:
            android.widget.TableRow$LayoutParams r4 = new android.widget.TableRow$LayoutParams
            r4.<init>(r8, r11)
            int r8 = r7.f28671a
            r8 = r8 & 8
            if (r8 == 0) goto L_0x00aa
            boolean r7 = r7.f28674d
            if (r7 == 0) goto L_0x00aa
            r4.width = r3
            r7 = 1065353216(0x3f800000, float:1.0)
            r4.weight = r7
        L_0x00aa:
            int r7 = r0.f292777d
            com.google.android.apps.gsa.shared.util.p7187ui.C91115n.m148873e(r4, r3, r3, r7, r3)
            boolean r7 = r0.f292779f
            if (r2 == r7) goto L_0x00b4
            goto L_0x00b6
        L_0x00b4:
            r1 = 48
        L_0x00b6:
            r4.gravity = r1
            r0.addView(r9, r4)
            goto L_0x001a
        L_0x00bd:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.nowcards.p8117g.C104975u.m174035L(java.util.List, int, int, int, com.google.android.apps.gsa.shared.y.au, boolean):com.google.android.apps.gsa.staticplugins.nowcards.ui.TextOrIconTableRow");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final View mo94018b(LayoutInflater layoutInflater) {
        return layoutInflater.inflate(R.layout.qp_generic_table_module, mo94115i(), false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final View mo94019c(C9277u uVar, ViewGroup viewGroup) {
        return this.f290308c.f256406b.inflate(R.layout.qp_generic_table_module, viewGroup, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo94020e() {
        TableLayout tableLayout = (TableLayout) this.f290311f;
        tableLayout.removeAllViews();
        C9157at atVar = this.f290310e.f32206m;
        if (atVar == null) {
            atVar = C9157at.f31606f;
        }
        C7783ju juVar = atVar.f31609b;
        if (juVar == null) {
            juVar = C7783ju.f27241c;
        }
        boolean z = atVar.f31612e;
        int i = atVar.f31610c;
        int i2 = atVar.f31611d;
        C91189au a = this.f290314i.f290332b.mo86214a();
        TextOrIconTableRow L = m174035L(juVar.f27243a, R.style.qp_h6, i, i2, a, z);
        L.setPadding(0, 0, 0, 0);
        tableLayout.addView(L);
        for (C7782jt jtVar : juVar.f27244b) {
            tableLayout.addView(m174035L(jtVar.f27240a, R.style.qp_h5_normal, i, i2, a, z));
        }
    }
}
