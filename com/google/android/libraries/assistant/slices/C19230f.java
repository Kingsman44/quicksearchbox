package com.google.android.libraries.assistant.slices;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.slice.widget.C4168x;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.libraries.assistant.slices.f */
/* compiled from: PG */
public final class C19230f extends C4168x {

    /* renamed from: A */
    public static final C59071e f53837A = C59071e.m91332i("com.google.android.libraries.assistant.slices.f");

    /* renamed from: B */
    private final Context f53838B;

    public C19230f(Context context) {
        super(context);
        this.f53838B = context;
    }

    /* renamed from: q */
    public static SpannableString m36604q(Context context, CharSequence charSequence, boolean z) {
        SpannableString spannableString = new SpannableString(charSequence);
        int i = z ? R.color.slice_text_input : R.color.slice_text_input_inactive;
        int i2 = true != z ? R.color.slice_text_input_secondary_inactive : R.color.slice_text_input_secondary;
        for (int i3 = 0; i3 < charSequence.length(); i3++) {
            if (Character.isDigit(charSequence.charAt(i3)) || charSequence.charAt(i3) == 8211) {
                spannableString.setSpan(new ForegroundColorSpan(context.getResources().getColor(i)), i3, i3 + 1, 33);
            } else {
                int i4 = i3 + 1;
                spannableString.setSpan(new ForegroundColorSpan(context.getResources().getColor(i2)), i3, i4, 33);
                if (Character.isLetter(charSequence.charAt(i3))) {
                    spannableString.setSpan(new RelativeSizeSpan(0.6f), i3, i4, 33);
                }
            }
        }
        return spannableString;
    }

    /* JADX WARNING: type inference failed for: r12v41, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: fz */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8643fz(androidx.slice.widget.C4130ah r10, boolean r11, int r12, int r13, androidx.slice.widget.C4141as r14) {
        /*
            r9 = this;
            super.mo8643fz(r10, r11, r12, r13, r14)
            r11 = 2131435410(0x7f0b1f92, float:1.8492661E38)
            android.view.View r11 = r9.findViewById(r11)
            android.widget.LinearLayout r11 = (android.widget.LinearLayout) r11
            androidx.slice.widget.p r12 = r9.f13471d
            r13 = 0
            if (r12 == 0) goto L_0x0025
            androidx.slice.SliceItem r12 = r12.f13389a
            if (r12 == 0) goto L_0x0025
            androidx.slice.SliceItem r14 = r9.f13473f
            if (r12 == r14) goto L_0x0025
            androidx.slice.a.a r14 = new androidx.slice.a.a
            r14.<init>(r12)
            r9.f13472e = r14
            androidx.slice.a.a r12 = r9.f13472e
            java.lang.String r12 = r12.f13114i
            goto L_0x0026
        L_0x0025:
            r12 = r13
        L_0x0026:
            androidx.slice.widget.p r14 = r9.f13471d
            if (r14 == 0) goto L_0x002c
            androidx.slice.SliceItem r13 = r14.f13389a
        L_0x002c:
            java.lang.String r14 = "timer_text_input"
            boolean r12 = r14.equals(r12)
            r14 = 3
            r0 = 1
            r1 = 0
            if (r12 == 0) goto L_0x0106
            if (r13 != 0) goto L_0x003b
            goto L_0x0106
        L_0x003b:
            r12 = 2131430381(0x7f0b0bed, float:1.8482461E38)
            android.view.View r2 = r11.findViewById(r12)
            r3 = 2
            if (r2 != 0) goto L_0x0066
            com.google.android.libraries.assistant.slices.d r2 = new com.google.android.libraries.assistant.slices.d
            android.content.Context r4 = r9.f53838B
            r2.<init>(r9, r4)
            com.google.android.libraries.assistant.slices.e r4 = new com.google.android.libraries.assistant.slices.e
            android.content.Context r5 = r9.f53838B
            r4.<init>(r9, r5, r2, r13)
            r2.addTextChangedListener(r4)
            r2.setCursorVisible(r1)
            r2.setId(r12)
            r2.setRawInputType(r3)
            r9.mo24319r(r2)
            r11.addView(r2)
            goto L_0x006d
        L_0x0066:
            android.view.View r12 = r11.findViewById(r12)
            r2 = r12
            android.widget.EditText r2 = (android.widget.EditText) r2
        L_0x006d:
            androidx.slice.Slice r12 = r13.mo8596d()     // Catch:{ RuntimeException -> 0x00f7 }
            androidx.slice.SliceItem[] r12 = r12.f13088d     // Catch:{ RuntimeException -> 0x00f7 }
            java.util.List r12 = java.util.Arrays.asList(r12)     // Catch:{ RuntimeException -> 0x00f7 }
            j$.util.stream.Stream r12 = p3186j$.util.Collection.EL.stream(r12)     // Catch:{ RuntimeException -> 0x00f7 }
            com.google.android.libraries.assistant.slices.b r13 = com.google.android.libraries.assistant.slices.C19226b.f53830a     // Catch:{ RuntimeException -> 0x00f7 }
            j$.util.stream.Stream r12 = r12.filter(r13)     // Catch:{ RuntimeException -> 0x00f7 }
            j$.util.stream.Collector r13 = p3186j$.util.stream.Collectors.toList()     // Catch:{ RuntimeException -> 0x00f7 }
            java.lang.Object r12 = r12.collect(r13)     // Catch:{ RuntimeException -> 0x00f7 }
            java.lang.Iterable r12 = (java.lang.Iterable) r12     // Catch:{ RuntimeException -> 0x00f7 }
            java.lang.Object r12 = com.google.common.p4522b.C58557jl.m90133n(r12)     // Catch:{ RuntimeException -> 0x00f7 }
            androidx.slice.SliceItem r12 = (androidx.slice.SliceItem) r12     // Catch:{ RuntimeException -> 0x00f7 }
            java.lang.Object r12 = r12.f13094d     // Catch:{ RuntimeException -> 0x00f7 }
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12     // Catch:{ RuntimeException -> 0x00f7 }
            java.lang.String r12 = r12.toString()     // Catch:{ RuntimeException -> 0x00f7 }
            long r12 = java.lang.Long.parseLong(r12)     // Catch:{ RuntimeException -> 0x00f7 }
            r4 = 0
            int r6 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x00a6
            java.lang.String r12 = ""
            goto L_0x00d9
        L_0x00a6:
            j$.time.Duration r12 = p3186j$.time.Duration.ofMillis(r12)     // Catch:{ RuntimeException -> 0x00f7 }
            java.util.Locale r13 = java.util.Locale.US     // Catch:{ RuntimeException -> 0x00f7 }
            java.lang.Object[] r4 = new java.lang.Object[r14]     // Catch:{ RuntimeException -> 0x00f7 }
            long r5 = r12.toHours()     // Catch:{ RuntimeException -> 0x00f7 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ RuntimeException -> 0x00f7 }
            r4[r1] = r5     // Catch:{ RuntimeException -> 0x00f7 }
            long r5 = r12.getSeconds()     // Catch:{ RuntimeException -> 0x00f7 }
            r7 = 3600(0xe10, double:1.7786E-320)
            long r5 = r5 % r7
            r7 = 60
            long r5 = r5 / r7
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ RuntimeException -> 0x00f7 }
            r4[r0] = r5     // Catch:{ RuntimeException -> 0x00f7 }
            long r5 = r12.getSeconds()     // Catch:{ RuntimeException -> 0x00f7 }
            long r5 = r5 % r7
            java.lang.Long r12 = java.lang.Long.valueOf(r5)     // Catch:{ RuntimeException -> 0x00f7 }
            r4[r3] = r12     // Catch:{ RuntimeException -> 0x00f7 }
            java.lang.String r12 = "%02dh %02dm %02ds"
            java.lang.String r12 = java.lang.String.format(r13, r12, r4)     // Catch:{ RuntimeException -> 0x00f7 }
        L_0x00d9:
            boolean r13 = r12.isEmpty()     // Catch:{ RuntimeException -> 0x00f7 }
            java.lang.String r3 = "00h 00m 00s"
            if (r0 != r13) goto L_0x00e2
            r12 = r3
        L_0x00e2:
            boolean r13 = r2.hasFocus()     // Catch:{ RuntimeException -> 0x00f7 }
            if (r13 != 0) goto L_0x0106
            android.content.Context r13 = r9.f53838B     // Catch:{ RuntimeException -> 0x00f7 }
            boolean r3 = r3.contentEquals(r12)     // Catch:{ RuntimeException -> 0x00f7 }
            r3 = r3 ^ r0
            android.text.SpannableString r12 = m36604q(r13, r12, r3)     // Catch:{ RuntimeException -> 0x00f7 }
            r2.setText(r12)     // Catch:{ RuntimeException -> 0x00f7 }
            goto L_0x0106
        L_0x00f7:
            r12 = move-exception
            com.google.common.f.e r13 = f53837A
            com.google.common.f.x r13 = r13.mo56226d()
            java.lang.String r2 = "Title for Timer EditText input is not set."
            r3 = 47545(0xb9b9, float:6.6625E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r13).mo56382g(r12)).mo56372aa(r3)).mo56386p(r2)
        L_0x0106:
            androidx.slice.SliceItem r12 = r10.f13268m
            java.lang.String r12 = r12.f13092b
            java.lang.String r13 = "slice"
            boolean r12 = r13.equals(r12)
            if (r12 == 0) goto L_0x0161
            androidx.slice.SliceItem r10 = r10.f13268m
            androidx.slice.Slice r10 = r10.mo8596d()
            androidx.slice.SliceItem[] r10 = r10.f13088d
            java.util.List r10 = java.util.Arrays.asList(r10)
            j$.util.stream.Stream r10 = p3186j$.util.Collection.EL.stream(r10)
            com.google.android.libraries.assistant.slices.c r12 = com.google.android.libraries.assistant.slices.C19227c.f53831a
            boolean r10 = r10.noneMatch(r12)
            if (r10 == 0) goto L_0x012b
            goto L_0x0161
        L_0x012b:
            r10 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r10 = r9.findViewById(r10)
            android.widget.TextView r10 = (android.widget.TextView) r10
            if (r10 != 0) goto L_0x0145
            com.google.common.f.e r10 = f53837A
            com.google.common.f.x r10 = r10.mo56225c()
            java.lang.String r12 = "No input text view found."
            r13 = 47544(0xb9b8, float:6.6623E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r10).mo56372aa(r13)).mo56386p(r12)
            goto L_0x016f
        L_0x0145:
            r9.mo24319r(r10)
            java.lang.CharSequence r12 = r10.getText()
            android.content.Context r13 = r9.f53838B
            java.lang.String r2 = r12.toString()
            java.lang.String r3 = "––"
            boolean r2 = r2.contains(r3)
            r2 = r2 ^ r0
            android.text.SpannableString r12 = m36604q(r13, r12, r2)
            r10.setText(r12)
            goto L_0x016f
        L_0x0161:
            com.google.common.f.e r10 = f53837A
            com.google.common.f.x r10 = r10.mo56226d()
            java.lang.String r12 = "No time input field found."
            r13 = 47543(0xb9b7, float:6.6622E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r10).mo56372aa(r13)).mo56386p(r12)
        L_0x016f:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.ArrayDeque r12 = new java.util.ArrayDeque
            r12.<init>()
            r12.add(r11)
        L_0x017c:
            boolean r11 = r12.isEmpty()
            if (r11 != 0) goto L_0x01b1
            java.lang.Object r11 = r12.removeFirst()
            android.view.View r11 = (android.view.View) r11
            java.lang.Class r13 = r11.getClass()
            java.lang.Class<android.widget.Button> r2 = android.widget.Button.class
            boolean r13 = r13.equals(r2)
            if (r13 == 0) goto L_0x019a
            android.widget.Button r11 = (android.widget.Button) r11
            r10.add(r11)
            goto L_0x017c
        L_0x019a:
            boolean r13 = r11 instanceof android.view.ViewGroup
            if (r13 == 0) goto L_0x017c
            android.view.ViewGroup r11 = (android.view.ViewGroup) r11
            r13 = 0
        L_0x01a1:
            int r2 = r11.getChildCount()
            if (r13 >= r2) goto L_0x017c
            android.view.View r2 = r11.getChildAt(r13)
            r12.add(r2)
            int r13 = r13 + 1
            goto L_0x01a1
        L_0x01b1:
            boolean r11 = r10.isEmpty()
            if (r11 == 0) goto L_0x01b9
            goto L_0x029e
        L_0x01b9:
            int r11 = r10.size()
            android.widget.FrameLayout$LayoutParams r12 = new android.widget.FrameLayout$LayoutParams
            r13 = -2
            r12.<init>(r13, r13)
            java.util.Iterator r13 = r10.iterator()
        L_0x01c7:
            boolean r2 = r13.hasNext()
            if (r2 == 0) goto L_0x0269
            java.lang.Object r2 = r13.next()
            android.widget.Button r2 = (android.widget.Button) r2
            android.view.ViewParent r3 = r2.getParent()
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            android.content.Context r4 = r9.f53838B
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            r6 = 1109393408(0x42200000, float:40.0)
            float r7 = r4 * r6
            int r7 = (int) r7
            r5.height = r7
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            java.lang.CharSequence r5 = r2.getText()
            int r5 = r5.length()
            float r5 = (float) r5
            r7 = 1090519040(0x41000000, float:8.0)
            float r5 = r5 * r7
            float r5 = r5 + r6
            float r4 = r4 * r5
            int r4 = (int) r4
            r3.width = r4
            android.content.Context r3 = r9.f53838B
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131172117(0x7f071b15, float:1.795864E38)
            float r3 = r3.getDimension(r4)
            r2.setTextSize(r1, r3)
            r3 = 2131231529(0x7f080329, float:1.8079142E38)
            r2.setBackgroundResource(r3)
            r3 = 24
            r4 = 16
            if (r11 != r0) goto L_0x0251
            android.content.Context r5 = r9.f53838B
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2131103984(0x7f0610f0, float:1.782045E38)
            int r5 = r5.getColor(r6)
            r2.setTextColor(r5)
            android.graphics.drawable.Drawable r5 = r2.getBackground()
            android.content.Context r6 = r9.f53838B
            android.content.res.Resources r6 = r6.getResources()
            r7 = 2131103982(0x7f0610ee, float:1.7820446E38)
            int r6 = r6.getColor(r7)
            android.graphics.PorterDuff$Mode r7 = android.graphics.PorterDuff.Mode.SRC_ATOP
            r5.setColorFilter(r6, r7)
            r12.setMargins(r3, r4, r1, r1)
            r2.setLayoutParams(r12)
            goto L_0x01c7
        L_0x0251:
            android.content.Context r5 = r9.f53838B
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2131103985(0x7f0610f1, float:1.7820452E38)
            int r5 = r5.getColor(r6)
            r2.setTextColor(r5)
            r12.setMargins(r1, r4, r3, r1)
            r2.setLayoutParams(r12)
            goto L_0x01c7
        L_0x0269:
            java.lang.Object r10 = r10.get(r1)
            android.widget.Button r10 = (android.widget.Button) r10
            android.view.ViewParent r10 = r10.getParent()
            android.view.ViewParent r10 = r10.getParent()
            android.widget.LinearLayout r10 = (android.widget.LinearLayout) r10
            if (r10 == 0) goto L_0x029e
            int r12 = r10.getId()
            r13 = 16908312(0x1020018, float:2.3877296E-38)
            if (r12 != r13) goto L_0x029e
            android.widget.LinearLayout$LayoutParams r12 = new android.widget.LinearLayout$LayoutParams
            r13 = -1
            r12.<init>(r13, r13)
            r12.setMargins(r1, r1, r1, r1)
            r10.setLayoutParams(r12)
            r10.setPadding(r1, r1, r1, r1)
            r12 = 80
            r10.setVerticalGravity(r12)
            if (r11 != r0) goto L_0x029b
            r14 = 5
        L_0x029b:
            r10.setHorizontalGravity(r14)
        L_0x029e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.slices.C19230f.mo8643fz(androidx.slice.widget.ah, boolean, int, int, androidx.slice.widget.as):void");
    }

    /* renamed from: r */
    public final void mo24319r(TextView textView) {
        textView.setBackgroundDrawable(this.f53838B.getResources().getDrawable(true != textView.hasFocus() ? R.drawable.timepicker_rounded_border_disabled : R.drawable.timepicker_rounded_border));
        textView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        textView.setTextSize(0, getResources().getDimension(R.dimen.slice_input_text_size));
        textView.setGravity(17);
        textView.setPadding(0, 0, 0, 0);
    }
}
