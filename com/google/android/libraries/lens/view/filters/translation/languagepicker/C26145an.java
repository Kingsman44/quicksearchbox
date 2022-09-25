package com.google.android.libraries.lens.view.filters.translation.languagepicker;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import java.util.Comparator;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.languagepicker.an */
/* compiled from: PG */
final class C26145an implements Comparator {

    /* renamed from: a */
    final /* synthetic */ C26146ao f71049a;

    /* renamed from: b */
    private final C58833ax f71050b;

    public C26145an(C26146ao aoVar) {
        this.f71049a = aoVar;
        this.f71050b = C58836b.f156633a;
    }

    public C26145an(C26146ao aoVar, String str) {
        this.f71049a = aoVar;
        this.f71050b = C58833ax.m90834k(str);
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        int a;
        int a2;
        C26136ae aeVar = (C26136ae) obj;
        C26136ae aeVar2 = (C26136ae) obj2;
        C58833ax axVar = this.f71050b;
        if (!axVar.mo56113h() || (a = C26146ao.m48285a(aeVar, (String) axVar.mo56107c())) == (a2 = C26146ao.m48285a(aeVar2, (String) this.f71050b.mo56107c()))) {
            return this.f71049a.f71052b.compare(aeVar.mo31366f(), aeVar2.mo31366f());
        }
        return a - a2;
    }
}
