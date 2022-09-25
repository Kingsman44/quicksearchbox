package com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a;

import androidx.slice.C4113l;
import androidx.slice.Slice;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.a.a.aw */
/* compiled from: PG */
final class C35834aw implements C4113l {

    /* renamed from: a */
    final /* synthetic */ Boolean[] f93902a;

    /* renamed from: b */
    final /* synthetic */ C35835ax f93903b;

    public C35834aw(C35835ax axVar, Boolean[] boolArr) {
        this.f93903b = axVar;
        this.f93902a = boolArr;
    }

    /* renamed from: a */
    public final void mo8625a(Slice slice) {
        if (slice != null) {
            this.f93903b.f93909f = slice;
            this.f93902a[0] = true;
            return;
        }
        this.f93903b.mo39860a();
        this.f93902a[0] = false;
    }
}
