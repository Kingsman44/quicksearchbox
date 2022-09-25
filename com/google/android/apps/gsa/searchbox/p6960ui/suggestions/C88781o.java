package com.google.android.apps.gsa.searchbox.p6960ui.suggestions;

import android.content.Context;
import com.google.android.apps.gsa.searchbox.p6960ui.C88701b;
import com.google.android.apps.gsa.searchbox.p6960ui.C88715p;
import com.google.android.apps.gsa.searchbox.p6960ui.p6961a.C88699h;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89200e;
import com.google.android.libraries.searchbox.shared.suggestion.C41669ai;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.o */
/* compiled from: PG */
public final class C88781o extends C88843w implements C89200e {

    /* renamed from: c */
    private C88701b f240261c;

    /* renamed from: d */
    private final C88699h f240262d;

    public C88781o(Context context, C88699h hVar) {
        super(context);
        this.f240262d = hVar;
    }

    /* renamed from: b */
    public final boolean mo82340b(int i) {
        return i == C41669ai.f108954c.intValue();
    }

    /* renamed from: d */
    public final /* synthetic */ void mo82185d(Object obj) {
        this.f240261c = ((C88715p) obj).f239935g;
    }

    /* renamed from: a */
    public final C88788v mo82339a() {
        Context context = this.f240540b;
        C88701b bVar = this.f240261c;
        bVar.getClass();
        return new C88780n(context, bVar, this.f240262d);
    }
}
