package com.google.android.libraries.lens.view.utils;

import android.content.Context;
import android.view.View;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.material.snackbar.Snackbar;

/* renamed from: com.google.android.libraries.lens.view.utils.ac */
/* compiled from: PG */
public final class C28101ac {
    /* renamed from: a */
    public static void m52383a(String str, int i, View view, C28306ab abVar) {
        Snackbar q = Snackbar.m79661q((Context) null, view, str, 0);
        C28439i b = abVar.mo33801b(q.f117089j, abVar.f76990a.mo33805a(C28427h.m53115a(i)));
        b.mo33892i(2);
        q.mo48348m(new C28100ab(b));
        q.mo48343h();
    }
}
