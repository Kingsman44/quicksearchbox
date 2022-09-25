package com.google.android.apps.gsa.staticplugins.p7780de.p7785d;

import android.view.View;
import com.google.android.apps.gsa.shared.monet.p7070b.p7105v.C90293i;
import com.google.android.libraries.gsa.monet.shared.C23123s;
import com.google.common.base.C58838bb;

/* renamed from: com.google.android.apps.gsa.staticplugins.de.d.f */
/* compiled from: PG */
public final /* synthetic */ class C99451f implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C99458m f278295a;

    public /* synthetic */ C99451f(C99458m mVar) {
        this.f278295a = mVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        String str;
        C99458m mVar = this.f278295a;
        Integer num = (Integer) obj;
        int intValue = num.intValue();
        int i = 0;
        boolean z = intValue >= 0 && intValue <= 5;
        int intValue2 = num.intValue();
        if (intValue2 == 0) {
            str = "UNDEFINED";
        } else if (intValue2 == 1) {
            str = "SEARCH_INACTIVE";
        } else if (intValue2 == 2) {
            str = "TEXT_SEARCH";
        } else if (intValue2 == 3) {
            str = "VOICE_SEARCH";
        } else if (intValue2 == 4) {
            str = "MUSIC_SEARCH";
        } else if (intValue2 != 5) {
            str = "unknown state: " + intValue2;
        } else {
            str = "RESULTS";
        }
        C58838bb.m90873h(z, "Invalid searchState: %s", str);
        View view = mVar.f278309h;
        view.getClass();
        if (true == C90293i.m146825a(num.intValue())) {
            i = 4;
        }
        view.setImportantForAccessibility(i);
        if (mVar.f278313l != null && num.intValue() != 0) {
            mVar.f278313l.f240565a.mo82640c(num.intValue());
        }
    }
}
