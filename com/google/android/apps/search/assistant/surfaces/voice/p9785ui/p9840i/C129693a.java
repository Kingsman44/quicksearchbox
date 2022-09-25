package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9840i;

import android.content.Context;
import android.util.TypedValue;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58839bc;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.i.a */
/* compiled from: PG */
public final /* synthetic */ class C129693a implements C58839bc {
    /* renamed from: a */
    public final boolean mo5941a(Object obj) {
        Context context = (Context) obj;
        C69664n.m101061g(context, "context");
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.isDarkModeEnforced, typedValue, true)) {
            throw new IllegalArgumentException("The passed attribute does not exist in context theme");
        } else if (typedValue.type != 18) {
            int i = typedValue.type;
            throw new IllegalArgumentException("Passed attribute is not a boolean, actual type " + i);
        } else if (typedValue.data == 0 && (context.getResources().getConfiguration().uiMode & 48) != 32) {
            return false;
        } else {
            return true;
        }
    }
}
