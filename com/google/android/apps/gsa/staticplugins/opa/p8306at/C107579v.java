package com.google.android.apps.gsa.staticplugins.opa.p8306at;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.TypedValue;
import androidx.core.content.C1882h;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.at.v */
/* compiled from: PG */
public final class C107579v {

    /* renamed from: a */
    private static final C59071e f299299a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.at.v");

    /* renamed from: a */
    public static int m178446a(Context context, int i, int[] iArr) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            if (typedValue.type != 3) {
                TypedValue typedValue2 = new TypedValue();
                if (context.getTheme().resolveAttribute(i, typedValue2, true)) {
                    return typedValue2.data;
                }
                ((C59052c) ((C59052c) f299299a.mo56225c()).mo56372aa(25507)).mo56387q("Failed to resolve color value from attribute: %d", i);
                return 0;
            }
            ColorStateList d = C1882h.m5138d(context, typedValue.resourceId);
            if (d != null) {
                return d.getColorForState(iArr, 0);
            }
        }
        ((C59052c) ((C59052c) f299299a.mo56225c()).mo56372aa(25508)).mo56387q("Failed to resolve color value from attribute: %d", i);
        return 0;
    }
}
