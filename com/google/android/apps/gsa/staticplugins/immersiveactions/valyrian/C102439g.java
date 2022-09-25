package com.google.android.apps.gsa.staticplugins.immersiveactions.valyrian;

import com.google.android.apps.gsa.shared.util.p7187ui.C91113l;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.immersiveactions.valyrian.g */
/* compiled from: PG */
public final /* synthetic */ class C102439g implements C91113l {

    /* renamed from: a */
    public final /* synthetic */ C102443k f285902a;

    public /* synthetic */ C102439g(C102443k kVar) {
        this.f285902a = kVar;
    }

    /* renamed from: a */
    public final void mo85382a(Integer num) {
        C102443k kVar = this.f285902a;
        if (num != null) {
            kVar.setBackgroundColor(num.intValue());
        } else {
            kVar.setBackgroundColor(kVar.getResources().getColor(R.color.immersive_actions_relationship_header));
        }
    }
}
