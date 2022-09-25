package com.google.android.apps.gsa.shared.notificationlistening.collection;

import android.app.Notification;
import android.content.Context;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58869cf;
import com.google.common.p4552o.C60242lp;
import com.google.common.p4552o.C60250lx;

/* renamed from: com.google.android.apps.gsa.shared.notificationlistening.collection.h */
/* compiled from: PG */
public final class C90401h extends C90397d {
    /* renamed from: a */
    public final CharSequence mo84095a(Context context, C90396c cVar, boolean z) {
        CharSequence charSequence = cVar.f252472b;
        if (charSequence == null || (z && charSequence.toString().contains(", "))) {
            return context.getString(R.string.unnamed_group_name);
        }
        String[] split = cVar.f252472b.toString().split(": ", 2);
        return split.length == 2 ? split[0] : cVar.f252472b;
    }

    /* renamed from: b */
    public final String mo84096b(Notification notification) {
        return notification.category;
    }

    /* renamed from: e */
    public final boolean mo84098e(Context context, C90396c cVar, boolean z) {
        CharSequence charSequence;
        String c = mo84097c(context, cVar, (C60242lp) C60250lx.f163020b.createBuilder(), z);
        if (!(c == null || (charSequence = cVar.f252473c) == null)) {
            String[] split = charSequence.toString().split("  ", 2);
            String str = null;
            String str2 = split.length == 2 ? split[0] : null;
            if (str2 != null && c.contains(str2)) {
                return true;
            }
            String[] split2 = cVar.f252472b.toString().split(": ", 2);
            if (split2.length == 2) {
                str = split2[1];
            }
            if (str == null || !c.contains(str)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final Iterable mo84099f(C90396c cVar) {
        CharSequence charSequence = cVar.f252472b;
        if (charSequence != null && charSequence.toString().contains(": ")) {
            String[] split = cVar.f252472b.toString().split(": ", 2);
            if (split.length == 2 && split[0].contains(", ")) {
                return C58869cf.m90938d(", ").mo56153g(split[0]);
            }
        }
        return null;
    }

    /* renamed from: g */
    public final int mo84100g() {
        return 8;
    }
}
