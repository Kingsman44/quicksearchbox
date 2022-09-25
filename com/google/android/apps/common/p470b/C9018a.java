package com.google.android.apps.common.p470b;

import android.telephony.PhoneNumberUtils;
import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;
import com.google.android.libraries.p11002ag.C147550a;
import com.google.android.libraries.p11002ag.C147576f;

/* renamed from: com.google.android.apps.common.b.a */
/* compiled from: PG */
public class C9018a implements TextWatcher {

    /* renamed from: a */
    public boolean f31149a = false;

    /* renamed from: b */
    public boolean f31150b;

    /* renamed from: c */
    public C147550a f31151c;

    public C9018a(String str) {
        C147576f.m240621c();
        this.f31151c = new C147550a(str);
    }

    /* renamed from: a */
    private final String m23572a(char c, boolean z) {
        if (z) {
            C147550a aVar = this.f31151c;
            aVar.f398225a = aVar.mo124303b(c, true);
            return aVar.f398225a;
        }
        C147550a aVar2 = this.f31151c;
        aVar2.f398225a = aVar2.mo124303b(c, false);
        return aVar2.f398225a;
    }

    /* renamed from: b */
    private final void m23573b() {
        this.f31150b = true;
        this.f31151c.mo124304c();
    }

    /* renamed from: c */
    private static final boolean m23574c(CharSequence charSequence, int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            if (!PhoneNumberUtils.isNonSeparator(charSequence.charAt(i3))) {
                return true;
            }
        }
        return false;
    }

    public synchronized void afterTextChanged(Editable editable) {
        int i;
        boolean z = true;
        if (this.f31150b) {
            if (editable.length() == 0) {
                z = false;
            }
            this.f31150b = z;
        } else if (!this.f31149a) {
            int selectionEnd = Selection.getSelectionEnd(editable) - 1;
            this.f31151c.mo124304c();
            int length = editable.length();
            String str = null;
            int i2 = 0;
            char c = 0;
            boolean z2 = false;
            while (i2 < length) {
                char charAt = editable.charAt(i2);
                if (PhoneNumberUtils.isNonSeparator(charAt)) {
                    if (c != 0) {
                        str = m23572a(c, z2);
                        z2 = false;
                    }
                    c = charAt;
                }
                z2 |= !(i2 != selectionEnd);
                i2++;
            }
            if (c != 0) {
                str = m23572a(c, z2);
            }
            String str2 = str;
            if (str2 != null) {
                C147550a aVar = this.f31151c;
                if (!aVar.f398227c) {
                    i = aVar.f398228d;
                } else {
                    int i3 = 0;
                    int i4 = 0;
                    while (i4 < aVar.f398229e && i3 < aVar.f398225a.length()) {
                        if (aVar.f398226b.charAt(i4) == aVar.f398225a.charAt(i3)) {
                            i4++;
                        }
                        i3++;
                    }
                    i = i3;
                }
                this.f31149a = true;
                editable.replace(0, editable.length(), str2, 0, str2.length());
                if (str2.equals(editable.toString())) {
                    Selection.setSelection(editable, i);
                }
                this.f31149a = false;
            }
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (!this.f31149a && !this.f31150b && i2 > 0 && m23574c(charSequence, i, i2)) {
            m23573b();
        }
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (!this.f31149a && !this.f31150b && i3 > 0 && m23574c(charSequence, i, i3)) {
            m23573b();
        }
    }
}
