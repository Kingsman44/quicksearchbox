package com.google.android.gms.car;

import android.content.res.Resources;
import android.view.View;
import com.google.common.base.C58824ao;
import com.google.common.base.C58825ap;
import com.google.common.base.C58827ar;

/* renamed from: com.google.android.gms.car.dw */
/* compiled from: PG */
public final class C143206dw {

    /* renamed from: a */
    public static final C143206dw f388307a = new C143206dw();

    private C143206dw() {
    }

    /* renamed from: a */
    public static final String m232327a(View view) {
        String simpleName = view.getClass().getSimpleName();
        C58827ar arVar = new C58827ar(", ");
        C58824ao aoVar = new C58824ao(arVar, arVar);
        String str = null;
        String str2 = true != view.isShown() ? null : "shown";
        String str3 = true != view.isFocusable() ? null : "focusable";
        Object[] objArr = new Object[3];
        objArr[0] = true != view.hasFocus() ? null : "hasFocus";
        objArr[1] = true != view.isFocused() ? null : "focused";
        if (true == view.hasWindowFocus()) {
            str = "hasWindowFocus";
        }
        objArr[2] = str;
        String d = aoVar.mo56097d(new C58825ap(objArr, str2, str3));
        try {
            return String.format("%s (%s) [%s]", new Object[]{view.getResources().getResourceEntryName(view.getId()), simpleName, d});
        } catch (Resources.NotFoundException unused) {
            return String.format("%s [%s]", new Object[]{simpleName, d});
        }
    }
}
