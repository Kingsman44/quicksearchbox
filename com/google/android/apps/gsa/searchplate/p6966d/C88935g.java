package com.google.android.apps.gsa.searchplate.p6966d;

import android.text.Editable;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.SuggestionSpan;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodSubtype;
import com.google.android.apps.gsa.searchplate.C88908aj;
import com.google.android.apps.gsa.searchplate.C88984y;
import com.google.android.apps.gsa.searchplate.p6963a.C88893c;
import java.util.Iterator;

/* renamed from: com.google.android.apps.gsa.searchplate.d.g */
/* compiled from: PG */
public final class C88935g {

    /* renamed from: a */
    public C88934f f240919a;

    /* renamed from: b */
    public final C88908aj f240920b;

    /* renamed from: c */
    private final C88931c f240921c;

    /* renamed from: d */
    private boolean f240922d;

    public C88935g(C88931c cVar, C88908aj ajVar) {
        this.f240921c = cVar;
        this.f240920b = ajVar;
    }

    /* renamed from: c */
    public static final CharSequence m144538c(Editable editable) {
        if (editable == null) {
            return null;
        }
        for (Object obj : editable.getSpans(0, editable.length(), Object.class)) {
            if ((editable.getSpanFlags(obj) & 256) != 0) {
                return editable.subSequence(editable.getSpanStart(obj), editable.getSpanEnd(obj));
            }
        }
        return null;
    }

    /* renamed from: d */
    public static void m144539d(CharSequence charSequence) {
        StringBuilder sb = new StringBuilder(charSequence);
        if (charSequence instanceof Spanned) {
            if (r1 != 0) {
                sb.append(" (Suggestions:");
                for (SuggestionSpan suggestions : (SuggestionSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), SuggestionSpan.class)) {
                    sb.append("<");
                    sb.append(TextUtils.join(", ", suggestions.getSuggestions()));
                    sb.append(">");
                }
                sb.append(")");
            }
        }
    }

    /* renamed from: e */
    public static final boolean m144540e(Editable editable) {
        return m144538c(editable) != null;
    }

    /* renamed from: a */
    public final void mo82815a(boolean z) {
        C88984y yVar;
        C88893c cVar;
        boolean z2 = this.f240922d;
        if (!(!z) || !(!z2)) {
            boolean z3 = z | z2;
            this.f240922d = z3;
            C88931c cVar2 = this.f240921c;
            InputMethodSubtype currentInputMethodSubtype = cVar2.f240904a.f240903a.getCurrentInputMethodSubtype();
            InputMethodInfo inputMethodInfo = null;
            boolean z4 = true;
            if (currentInputMethodSubtype != null) {
                Iterator<InputMethodInfo> it = cVar2.f240904a.f240903a.getEnabledInputMethodList().iterator();
                loop0:
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    InputMethodInfo next = it.next();
                    Iterator<InputMethodSubtype> it2 = cVar2.f240904a.f240903a.getEnabledInputMethodSubtypeList(next, true).iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (currentInputMethodSubtype.equals(it2.next())) {
                                inputMethodInfo = next;
                                break loop0;
                            }
                        }
                    }
                }
            }
            if (currentInputMethodSubtype == null || inputMethodInfo == null || !currentInputMethodSubtype.getMode().equals("keyboard") || !inputMethodInfo.getId().equals("com.google.android.inputmethod.latin/com.android.inputmethod.latin.LatinIME")) {
                z4 = false;
            }
            boolean z5 = z3 & z4;
            this.f240922d = z5;
            C88908aj ajVar = this.f240920b;
            if (ajVar != null && (yVar = ajVar.f240857a.f240759f) != null && (cVar = yVar.f241143a.f240752y) != null) {
                cVar.mo17633c(z5);
            }
        }
    }

    /* renamed from: b */
    public final void mo82816b(CharSequence charSequence, boolean z, C88932d dVar) {
        C88893c cVar;
        if (this.f240920b == null) {
            return;
        }
        if (dVar == C88932d.SUGGESTION) {
            C88908aj ajVar = this.f240920b;
            m144539d(charSequence);
            C88984y yVar = ajVar.f240857a.f240759f;
            if (yVar != null && (cVar = yVar.f241143a.f240752y) != null) {
                cVar.mo17648r(z);
            }
        } else if (dVar == C88932d.UNSURE) {
            C88908aj ajVar2 = this.f240920b;
            m144539d(charSequence);
            ajVar2.mo82786a();
        }
    }
}
