package com.google.android.apps.gsa.search.shared.actions.modular.arguments;

import com.google.android.apps.gsa.search.shared.contact.C87518f;
import com.google.android.apps.gsa.search.shared.contact.Disambiguation;

/* renamed from: com.google.android.apps.gsa.search.shared.actions.modular.arguments.a */
/* compiled from: PG */
public final /* synthetic */ class C87432a implements C87518f {

    /* renamed from: a */
    public final /* synthetic */ AmbiguousArgument f236211a;

    /* renamed from: b */
    public final /* synthetic */ C87518f f236212b;

    public /* synthetic */ C87432a(AmbiguousArgument ambiguousArgument, C87518f fVar) {
        this.f236211a = ambiguousArgument;
        this.f236212b = fVar;
    }

    /* renamed from: a */
    public final void mo81345a(Disambiguation disambiguation) {
        AmbiguousArgument ambiguousArgument = this.f236211a;
        C87518f fVar = this.f236212b;
        if (fVar != null) {
            fVar.mo81345a(disambiguation);
        }
        ambiguousArgument.mo81287v();
    }
}
