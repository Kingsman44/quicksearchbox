package com.google.android.apps.search.pronunciationlearning.p10638ui.practicing;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import androidx.core.content.C1878d;
import com.google.android.apps.search.pronunciationlearning.p10629b.C141330c;
import com.google.android.googlequicksearchbox.R;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.pronunciationlearning.ui.practicing.e */
/* compiled from: PG */
public final class C141501e {

    /* renamed from: a */
    public final C141330c f384098a;

    /* renamed from: b */
    public PhonemeView f384099b = null;

    /* renamed from: c */
    public PhonemeView f384100c = null;

    /* renamed from: d */
    private final Context f384101d;

    /* renamed from: e */
    private final boolean f384102e;

    /* renamed from: f */
    private Optional f384103f = Optional.empty();

    /* renamed from: g */
    private int f384104g;

    public C141501e(Context context, C141330c cVar, boolean z) {
        this.f384101d = context;
        this.f384098a = cVar;
        this.f384102e = z;
    }

    /* renamed from: b */
    private final SpannableString m229681b(String str, int i, int i2) {
        SpannableString spannableString = new SpannableString(str.substring(i, i2));
        spannableString.setSpan(new ForegroundColorSpan(C1878d.m5128a(this.f384101d, R.color.agsa_color_on_background_variant)), 0, spannableString.length(), 33);
        return spannableString;
    }

    /* renamed from: c */
    private final void m229682c(SpannableStringBuilder spannableStringBuilder) {
        if (spannableStringBuilder.length() != 0) {
            spannableStringBuilder.append(m229681b("-", 0, 1));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x008f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo116523a(com.google.p4017at.p4086k.p4087a.p4096d.p4097a.C54534d r20, java.lang.String r21, android.widget.TextView r22, com.google.android.apps.search.pronunciationlearning.p10638ui.practicing.PhonemeView r23, com.google.android.apps.search.pronunciationlearning.p10638ui.practicing.PhonemeView r24) {
        /*
            r19 = this;
            r7 = r19
            r8 = r21
            r9 = r22
            r0 = r23
            r7.f384099b = r0
            r0 = r24
            r7.f384100c = r0
            android.text.SpannableStringBuilder r10 = new android.text.SpannableStringBuilder
            r10.<init>()
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
            r7.f384103f = r0
            r11 = 0
            r7.f384104g = r11
            r0 = r20
            com.google.protobuf.cq r0 = r0.f143188a
            java.util.Iterator r12 = r0.iterator()
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r5 = 0
        L_0x0029:
            boolean r4 = r12.hasNext()
            r13 = -1
            if (r4 == 0) goto L_0x01fd
            java.lang.Object r4 = r12.next()
            r14 = r4
            com.google.at.k.a.d.a.q r14 = (com.google.p4017at.p4086k.p4087a.p4096d.p4097a.C54547q) r14
            java.lang.String r4 = r14.f143209c
            int r15 = r8.indexOf(r4, r0)
            if (r15 == r13) goto L_0x01f4
            boolean r4 = r14.f143208b
            if (r4 != 0) goto L_0x01f4
            android.text.SpannableString r0 = r7.m229681b(r8, r0, r15)
            r10.append(r0)
            boolean r0 = r7.f384102e
            if (r0 == 0) goto L_0x00cd
            boolean r0 = r14.f143208b
            r1 = 0
            if (r0 != 0) goto L_0x0088
            com.google.protobuf.cq r0 = r14.f143207a
            java.util.Iterator r0 = r0.iterator()
        L_0x005a:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0088
            java.lang.Object r3 = r0.next()
            com.google.at.k.a.d.a.m r3 = (com.google.p4017at.p4086k.p4087a.p4096d.p4097a.C54543m) r3
            com.google.protobuf.cq r3 = r3.f143199b
            java.util.Iterator r3 = r3.iterator()
        L_0x006c:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x005a
            java.lang.Object r4 = r3.next()
            com.google.at.k.a.d.a.o r4 = (com.google.p4017at.p4086k.p4087a.p4096d.p4097a.C54545o) r4
            r20 = r12
            double r11 = r4.f143203b
            int r4 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r4 == 0) goto L_0x0084
            int r0 = (int) r11
            int r0 = r0 * 32
            goto L_0x008b
        L_0x0084:
            r12 = r20
            r11 = 0
            goto L_0x006c
        L_0x0088:
            r20 = r12
            r0 = 0
        L_0x008b:
            boolean r3 = r14.f143208b
            if (r3 != 0) goto L_0x00c9
            com.google.protobuf.cq r3 = r14.f143207a
            int r3 = r3.size()
            int r3 = r3 + r13
        L_0x0096:
            if (r3 < 0) goto L_0x00c9
            com.google.protobuf.cq r4 = r14.f143207a
            java.lang.Object r4 = r4.get(r3)
            com.google.at.k.a.d.a.m r4 = (com.google.p4017at.p4086k.p4087a.p4096d.p4097a.C54543m) r4
            com.google.protobuf.cq r4 = r4.f143199b
            int r4 = r4.size()
            int r4 = r4 + r13
        L_0x00a7:
            if (r4 < 0) goto L_0x00c6
            com.google.protobuf.cq r11 = r14.f143207a
            java.lang.Object r11 = r11.get(r3)
            com.google.at.k.a.d.a.m r11 = (com.google.p4017at.p4086k.p4087a.p4096d.p4097a.C54543m) r11
            com.google.protobuf.cq r11 = r11.f143199b
            java.lang.Object r11 = r11.get(r4)
            com.google.at.k.a.d.a.o r11 = (com.google.p4017at.p4086k.p4087a.p4096d.p4097a.C54545o) r11
            double r11 = r11.f143204c
            int r16 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r16 == 0) goto L_0x00c3
            int r1 = (int) r11
            int r1 = r1 * 32
            goto L_0x00ca
        L_0x00c3:
            int r4 = r4 + -1
            goto L_0x00a7
        L_0x00c6:
            int r3 = r3 + -1
            goto L_0x0096
        L_0x00c9:
            r1 = 0
        L_0x00ca:
            r12 = r0
            r11 = r1
            goto L_0x00d1
        L_0x00cd:
            r20 = r12
            r11 = r2
            r12 = r3
        L_0x00d1:
            android.text.SpannableStringBuilder r2 = new android.text.SpannableStringBuilder
            r2.<init>()
            android.text.SpannableStringBuilder r4 = new android.text.SpannableStringBuilder
            r4.<init>()
            com.google.protobuf.cq r0 = r14.f143207a
            java.util.Iterator r0 = r0.iterator()
        L_0x00e1:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0183
            java.lang.Object r1 = r0.next()
            com.google.at.k.a.d.a.m r1 = (com.google.p4017at.p4086k.p4087a.p4096d.p4097a.C54543m) r1
            java.lang.String r3 = r1.f143198a
            boolean r16 = r3.isEmpty()
            r6 = 2131099842(0x7f0600c2, float:1.7812049E38)
            if (r16 != 0) goto L_0x011d
            r7.m229682c(r2)
            android.text.SpannableString r13 = new android.text.SpannableString
            r13.<init>(r3)
            r17 = r0
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan
            r18 = r12
            android.content.Context r12 = r7.f384101d
            int r12 = androidx.core.content.C1878d.m5128a(r12, r6)
            r0.<init>(r12)
            int r12 = r3.length()
            r6 = 33
            r9 = 0
            r13.setSpan(r0, r9, r12, r6)
            r2.append(r13)
            goto L_0x0121
        L_0x011d:
            r17 = r0
            r18 = r12
        L_0x0121:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            com.google.protobuf.cq r1 = r1.f143199b
            java.util.Iterator r1 = r1.iterator()
        L_0x012c:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x013e
            java.lang.Object r6 = r1.next()
            com.google.at.k.a.d.a.o r6 = (com.google.p4017at.p4086k.p4087a.p4096d.p4097a.C54545o) r6
            java.lang.String r6 = r6.f143202a
            r0.append(r6)
            goto L_0x012c
        L_0x013e:
            java.lang.String r0 = r0.toString()
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x017b
            r7.m229682c(r4)
            boolean r1 = r0.equals(r3)
            if (r1 == 0) goto L_0x015b
            android.content.Context r1 = r7.f384101d
            r3 = 2131099842(0x7f0600c2, float:1.7812049E38)
            int r1 = androidx.core.content.C1878d.m5128a(r1, r3)
            goto L_0x0164
        L_0x015b:
            android.content.Context r1 = r7.f384101d
            r3 = 2131099806(0x7f06009e, float:1.7811976E38)
            int r1 = androidx.core.content.C1878d.m5128a(r1, r3)
        L_0x0164:
            android.text.SpannableString r3 = new android.text.SpannableString
            r3.<init>(r0)
            android.text.style.ForegroundColorSpan r6 = new android.text.style.ForegroundColorSpan
            r6.<init>(r1)
            int r0 = r0.length()
            r1 = 33
            r9 = 0
            r3.setSpan(r6, r9, r0, r1)
            r4.append(r3)
        L_0x017b:
            r9 = r22
            r0 = r17
            r12 = r18
            goto L_0x00e1
        L_0x0183:
            r18 = r12
            java.lang.String r0 = r2.toString()
            boolean r0 = r0.contentEquals(r4)
            if (r0 == 0) goto L_0x01b1
            java.lang.String r0 = r14.f143209c
            android.text.SpannableString r1 = new android.text.SpannableString
            r1.<init>(r0)
            android.text.style.ForegroundColorSpan r2 = new android.text.style.ForegroundColorSpan
            android.content.Context r3 = r7.f384101d
            r4 = 2131099851(0x7f0600cb, float:1.7812067E38)
            int r3 = androidx.core.content.C1878d.m5128a(r3, r4)
            r2.<init>(r3)
            int r0 = r0.length()
            r3 = 33
            r4 = 0
            r1.setSpan(r2, r4, r0, r3)
            r13 = r1
            r1 = 1
            goto L_0x01e1
        L_0x01b1:
            java.lang.String r12 = r14.f143209c
            android.text.SpannableString r13 = new android.text.SpannableString
            r13.<init>(r12)
            com.google.android.apps.search.pronunciationlearning.ui.practicing.d r6 = new com.google.android.apps.search.pronunciationlearning.ui.practicing.d
            r0 = r6
            r1 = r19
            r3 = r12
            r9 = r6
            r6 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            int r0 = r12.length()
            r1 = 33
            r2 = 0
            r13.setSpan(r9, r2, r0, r1)
            j$.util.Optional r0 = r7.f384103f
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x01db
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r13)
            r7.f384103f = r0
        L_0x01db:
            int r0 = r7.f384104g
            r1 = 1
            int r0 = r0 + r1
            r7.f384104g = r0
        L_0x01e1:
            r10.append(r13)
            java.lang.String r0 = r14.f143209c
            int r0 = r0.length()
            int r0 = r0 + r15
            r12 = r20
            r9 = r22
            r2 = r11
            r3 = r18
            r5 = r3
            goto L_0x01fa
        L_0x01f4:
            r20 = r12
            r12 = r20
            r9 = r22
        L_0x01fa:
            r11 = 0
            goto L_0x0029
        L_0x01fd:
            int r2 = r21.length()
            android.text.SpannableString r0 = r7.m229681b(r8, r0, r2)
            r10.append(r0)
            r0 = r22
            r0.setText(r10)
            j$.util.Optional r2 = r7.f384103f
            boolean r2 = r2.isPresent()
            if (r2 == 0) goto L_0x0251
            android.text.method.MovementMethod r2 = android.text.method.LinkMovementMethod.getInstance()
            r0.setMovementMethod(r2)
            android.content.Context r2 = r7.f384101d
            r3 = 2131099806(0x7f06009e, float:1.7811976E38)
            int r2 = androidx.core.content.C1878d.m5128a(r2, r3)
            r0.setLinkTextColor(r2)
            j$.util.Optional r2 = r7.f384103f
            java.lang.Object r2 = r2.get()
            android.text.SpannableString r2 = (android.text.SpannableString) r2
            j$.util.Optional r3 = r7.f384103f
            java.lang.Object r3 = r3.get()
            android.text.SpannableString r3 = (android.text.SpannableString) r3
            int r3 = r3.length()
            java.lang.Class<android.text.style.ClickableSpan> r4 = android.text.style.ClickableSpan.class
            r5 = 0
            java.lang.Object[] r2 = r2.getSpans(r5, r3, r4)
            android.text.style.ClickableSpan[] r2 = (android.text.style.ClickableSpan[]) r2
            int r3 = r2.length
            r11 = 0
        L_0x0247:
            if (r11 >= r3) goto L_0x0251
            r4 = r2[r11]
            r4.onClick(r0)
            int r11 = r11 + 1
            goto L_0x0247
        L_0x0251:
            if (r1 == 0) goto L_0x0256
            int r0 = r7.f384104g
            return r0
        L_0x0256:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.pronunciationlearning.p10638ui.practicing.C141501e.mo116523a(com.google.at.k.a.d.a.d, java.lang.String, android.widget.TextView, com.google.android.apps.search.pronunciationlearning.ui.practicing.PhonemeView, com.google.android.apps.search.pronunciationlearning.ui.practicing.PhonemeView):int");
    }
}
