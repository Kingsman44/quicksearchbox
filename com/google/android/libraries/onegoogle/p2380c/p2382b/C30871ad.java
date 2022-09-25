package com.google.android.libraries.onegoogle.p2380c.p2382b;

import android.view.View;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28440j;
import com.google.android.libraries.logging.p2185ve.C28441k;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.logging.p2185ve.C28485y;

/* renamed from: com.google.android.libraries.onegoogle.c.b.ad */
/* compiled from: PG */
public final class C30871ad {
    /* renamed from: a */
    public static void m57643a(C28443m mVar, C28440j jVar, View view) {
        C28441k kVar = (C28441k) view.getTag(R.id.interaction_info_tag);
        if (kVar != null) {
            jVar.mo33895b(kVar);
            view.setTag(R.id.interaction_info_tag, (Object) null);
        }
        mVar.mo33853c(jVar.mo33894a(), C28485y.m53234a(view));
    }
}
