package com.google.android.libraries.places.widget;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.util.TypedValue;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.p2424a.p2425a.C31775f;
import com.google.android.libraries.places.widget.internal.common.AutoValue_AutocompleteOptions;
import com.google.android.libraries.places.widget.internal.common.AutocompleteActivityOrigin;
import com.google.android.libraries.places.widget.internal.common.C31913a;
import com.google.android.libraries.places.widget.internal.common.C31918f;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.places.widget.a */
/* compiled from: PG */
public final class C31895a {
    /* renamed from: a */
    public static final Intent m59411a(Context context, C31918f fVar) {
        AutocompleteActivityMode autocompleteActivityMode;
        C58485gu guVar;
        AutocompleteActivityOrigin autocompleteActivityOrigin;
        C58485gu guVar2;
        C31918f fVar2 = fVar;
        try {
            Intent intent = new Intent(context, AutocompleteActivity.class);
            Resources.Theme theme = context.getTheme();
            TypedValue typedValue = new TypedValue();
            if (theme.resolveAttribute(16843827, typedValue, true)) {
                fVar2.mo37673a(typedValue.data);
            }
            TypedValue typedValue2 = new TypedValue();
            if (theme.resolveAttribute(16843828, typedValue2, true)) {
                fVar2.mo37674b(typedValue2.data);
            }
            if (!(((C31913a) fVar2).f85834i != 3 || (autocompleteActivityMode = ((C31913a) fVar2).f85826a) == null || (guVar = ((C31913a) fVar2).f85827b) == null || (autocompleteActivityOrigin = ((C31913a) fVar2).f85828c) == null || (guVar2 = ((C31913a) fVar2).f85830e) == null)) {
                C58485gu guVar3 = ((C31913a) fVar2).f85831f;
                if (guVar3 != null) {
                    intent.putExtra("places/AutocompleteOptions", new AutoValue_AutocompleteOptions(autocompleteActivityMode, guVar, autocompleteActivityOrigin, ((C31913a) fVar2).f85829d, (String) null, (LocationBias) null, (LocationRestriction) null, guVar2, (TypeFilter) null, guVar3, ((C31913a) fVar2).f85832g, ((C31913a) fVar2).f85833h));
                    return intent;
                }
            }
            StringBuilder sb = new StringBuilder();
            if (((C31913a) fVar2).f85826a == null) {
                sb.append(" mode");
            }
            if (((C31913a) fVar2).f85827b == null) {
                sb.append(" placeFields");
            }
            if (((C31913a) fVar2).f85828c == null) {
                sb.append(" origin");
            }
            if (((C31913a) fVar2).f85830e == null) {
                sb.append(" countries");
            }
            if (((C31913a) fVar2).f85831f == null) {
                sb.append(" typesFilter");
            }
            if ((((C31913a) fVar2).f85834i & 1) == 0) {
                sb.append(" primaryColor");
            }
            if ((((C31913a) fVar2).f85834i & 2) == 0) {
                sb.append(" primaryColorDark");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        } catch (Error | RuntimeException e) {
            C31775f.m59130a(e);
            throw e;
        }
    }
}
