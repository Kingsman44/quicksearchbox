package com.google.android.apps.gsa.searchbox.client.gsa.p6951a;

import com.google.android.apps.gsa.shared.util.p7159c.C90888av;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.apps.gsa.searchbox.client.gsa.a.b */
/* compiled from: PG */
public final class C88629b extends C90888av {

    /* renamed from: a */
    final /* synthetic */ C88630c f239588a;

    /* renamed from: b */
    private final C58833ax f239589b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C88629b(C88630c cVar) {
        super("RemoveAllHarmonySuggestionsTask", 2, 12);
        this.f239588a = cVar;
        this.f239589b = C58836b.f156633a;
    }

    public final void run() {
        this.f239588a.mo82292b(this.f239589b);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C88629b(C88630c cVar, Suggestion suggestion) {
        super("RemoveHarmonySuggestionsTask", 2, 12);
        this.f239588a = cVar;
        this.f239589b = C58833ax.m90834k(suggestion);
    }
}
