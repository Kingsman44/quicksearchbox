package com.google.android.libraries.lens.view.gleam;

import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.utils.C28133v;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.libraries.lens.view.gleam.cz */
/* compiled from: PG */
public final /* synthetic */ class C26521cz implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C26526dd f72269a;

    public /* synthetic */ C26521cz(C26526dd ddVar) {
        this.f72269a = ddVar;
    }

    public final Object apply(Object obj) {
        C26526dd ddVar = this.f72269a;
        String str = (String) obj;
        if (C28133v.m52422h(str) || C28133v.m52421g(str)) {
            return ddVar.f72295e.getString(R.string.lens_barcode_setup_intent_on_shutter_guidance);
        }
        return ddVar.f72295e.getString(R.string.lens_barcode_intent_on_shutter_guidance);
    }
}
