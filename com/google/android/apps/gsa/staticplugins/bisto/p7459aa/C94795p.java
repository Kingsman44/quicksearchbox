package com.google.android.apps.gsa.staticplugins.bisto.p7459aa;

import android.text.Annotation;
import android.text.Spanned;
import java.util.Comparator;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.aa.p */
/* compiled from: PG */
public final /* synthetic */ class C94795p implements Comparator {

    /* renamed from: a */
    public final /* synthetic */ Spanned f265079a;

    public /* synthetic */ C94795p(Spanned spanned) {
        this.f265079a = spanned;
    }

    public final int compare(Object obj, Object obj2) {
        Spanned spanned = this.f265079a;
        return spanned.getSpanStart((Annotation) obj) - spanned.getSpanStart((Annotation) obj2);
    }
}
