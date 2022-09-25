package com.google.android.libraries.assistant.slices;

import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.SpannableString;
import android.text.TextWatcher;

/* renamed from: com.google.android.libraries.assistant.slices.j */
/* compiled from: PG */
public class C19234j implements TextWatcher {

    /* renamed from: a */
    private final String f53843a;

    /* renamed from: b */
    private final Context f53844b;

    /* renamed from: c */
    private CharSequence f53845c;

    /* renamed from: d */
    private boolean f53846d = false;

    /* renamed from: e */
    private boolean f53847e = false;

    public C19234j(Context context) {
        this.f53844b = context;
        this.f53845c = "00h 00m 00s";
        this.f53843a = "00h 00m 00s";
    }

    public void afterTextChanged(Editable editable) {
        CharSequence charSequence;
        String str;
        if (this.f53846d) {
            this.f53846d = false;
        } else if (!editable.toString().isEmpty()) {
            if (this.f53847e) {
                charSequence = this.f53843a;
            } else {
                charSequence = this.f53845c;
            }
            StringBuilder sb = new StringBuilder(charSequence);
            if (sb.charAt(0) == this.f53843a.charAt(0) || this.f53847e) {
                int length = sb.length() - 1;
                int length2 = editable.length();
                while (true) {
                    length2--;
                    if (length2 < 0) {
                        str = sb.toString();
                        break;
                    } else if (Character.isDigit(editable.charAt(length2))) {
                        while (length >= 0 && !Character.isDigit(sb.charAt(length))) {
                            length--;
                        }
                        if (length < 0) {
                            str = sb.toString();
                            break;
                        } else if (this.f53847e) {
                            this.f53847e = false;
                        } else {
                            sb.setCharAt(length, editable.charAt(length2));
                            length--;
                        }
                    }
                }
            } else {
                str = sb.toString();
            }
            this.f53845c = str;
            this.f53846d = true;
            SpannableString q = C19230f.m36604q(this.f53844b, str, true);
            editable.replace(0, editable.length(), q, 0, q.length());
            Selection.setSelection(q, q.length());
            this.f53846d = false;
        } else {
            int length3 = editable.length();
            String str2 = this.f53843a;
            editable.replace(0, length3, str2, 0, str2.length());
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f53847e = i2 > i3;
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
