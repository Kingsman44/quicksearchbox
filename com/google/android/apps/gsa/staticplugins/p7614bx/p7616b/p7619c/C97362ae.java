package com.google.android.apps.gsa.staticplugins.p7614bx.p7616b.p7619c;

import android.text.TextPaint;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.shared.C23123s;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.ArrayDeque;

/* renamed from: com.google.android.apps.gsa.staticplugins.bx.b.c.ae */
/* compiled from: PG */
public final /* synthetic */ class C97362ae implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C97366ai f271915a;

    public /* synthetic */ C97362ae(C97366ai aiVar) {
        this.f271915a = aiVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        C97366ai aiVar = this.f271915a;
        String str = (String) obj;
        TextView textView = aiVar.f271922c;
        if (textView != null) {
            textView.setText(str);
            aiVar.f271922c.measure(0, 0);
            int measuredWidth = aiVar.f271922c.getMeasuredWidth();
            int dimensionPixelSize = aiVar.f271920a.getResources().getDimensionPixelSize(R.dimen.particle_disc_tooltip_horizontal_padding);
            int i = dimensionPixelSize + dimensionPixelSize;
            int i2 = measuredWidth - i;
            TextPaint paint = aiVar.f271922c.getPaint();
            ArrayDeque arrayDeque = new ArrayDeque();
            int i3 = 0;
            for (int i4 = 0; i4 < str.length(); i4++) {
                if (i4 == str.length() - 1 || (Character.isSpaceChar(str.charAt(i4)) && !Character.isSpaceChar(str.charAt(i4 + 1)))) {
                    int i5 = i4 + 1;
                    arrayDeque.add(str.substring(i3, i5));
                    i3 = i5;
                }
            }
            C58976aa aaVar = C58975e.f156826a;
            StringBuilder sb = new StringBuilder();
            int i6 = 0;
            while (true) {
                if (!arrayDeque.isEmpty()) {
                    String str2 = (String) arrayDeque.pollFirst();
                    if (C97368ak.m161133a(sb.toString().concat(String.valueOf(str2)), paint) <= i2) {
                        sb.append(str2);
                    } else if (sb.length() > 0) {
                        i6 = Math.max(i6, C97368ak.m161133a(sb.toString(), paint));
                        sb = new StringBuilder();
                        arrayDeque.addFirst(str2);
                    } else {
                        int length = str2.length();
                        int i7 = 0;
                        while (i7 <= length) {
                            int i8 = (i7 + length) / 2;
                            String substring = str2.substring(0, i8);
                            if (i8 == 0 || C97368ak.m161133a(substring, paint) <= i2) {
                                i7 = i8 + 1;
                            } else {
                                length = i8 - 1;
                            }
                        }
                        if (length == 0) {
                            break;
                        }
                        String substring2 = str2.substring(0, length);
                        arrayDeque.addFirst(str2.substring(length));
                        arrayDeque.addFirst(substring2);
                    }
                } else if (sb.length() > 0) {
                    i2 = Math.max(i6, C97368ak.m161133a(sb.toString(), paint));
                } else {
                    i2 = i6;
                }
            }
            ViewGroup.LayoutParams layoutParams = aiVar.f271922c.getLayoutParams();
            layoutParams.width = i2 + i;
            aiVar.f271922c.setLayoutParams(layoutParams);
        }
    }
}
