package com.google.android.libraries.onegoogle.popovercontainer;

import android.graphics.RectF;
import android.util.Property;

/* renamed from: com.google.android.libraries.onegoogle.popovercontainer.k */
/* compiled from: PG */
final class C31049k extends Property {
    public C31049k(Class cls) {
        super(cls, "animatedBackgroundRect");
    }

    public final /* synthetic */ Object get(Object obj) {
        int i = ExpandableDialogView.f83539m;
        return ((ExpandableDialogView) obj).f83575c;
    }

    public final /* synthetic */ void set(Object obj, Object obj2) {
        int i = ExpandableDialogView.f83539m;
        ((ExpandableDialogView) obj).mo36698j((RectF) obj2);
    }
}
