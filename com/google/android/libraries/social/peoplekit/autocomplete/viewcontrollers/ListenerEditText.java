package com.google.android.libraries.social.peoplekit.autocomplete.viewcontrollers;

import android.content.Context;
import android.support.p033v7.widget.C0508af;
import android.util.AttributeSet;
import com.google.android.libraries.social.p3271e.p3272a.C41952a;
import com.google.android.libraries.social.peoplekit.common.analytics.C42075e;
import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath;
import com.google.p4140ba.p4150c.p4151a.C54941a;

/* compiled from: PG */
public final class ListenerEditText extends C0508af {

    /* renamed from: a */
    public C42019l f109701a;

    public ListenerEditText(Context context) {
        super(context);
    }

    public final boolean onTextContextMenuItem(int i) {
        C42019l lVar;
        boolean onTextContextMenuItem = super.onTextContextMenuItem(i);
        if (i == 16908322 && (lVar = this.f109701a) != null) {
            C42075e eVar = lVar.f109718a;
            PeopleKitVisualElementPath peopleKitVisualElementPath = new PeopleKitVisualElementPath();
            peopleKitVisualElementPath.f109973a.mo44369a(new C41952a(C54941a.f144446I));
            peopleKitVisualElementPath.mo44564a(lVar.f109719b.f109736m.f109973a);
            eVar.mo44577c(4, peopleKitVisualElementPath);
            if (lVar.f109719b.mo44499q()) {
                C42075e eVar2 = lVar.f109718a;
                PeopleKitVisualElementPath peopleKitVisualElementPath2 = new PeopleKitVisualElementPath();
                peopleKitVisualElementPath2.f109973a.mo44369a(new C41952a(C54941a.f144447J));
                peopleKitVisualElementPath2.mo44564a(lVar.f109719b.f109736m.f109973a);
                eVar2.mo44577c(4, peopleKitVisualElementPath2);
            }
        }
        return onTextContextMenuItem;
    }

    public ListenerEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ListenerEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
