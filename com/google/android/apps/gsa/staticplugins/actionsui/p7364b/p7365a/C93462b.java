package com.google.android.apps.gsa.staticplugins.actionsui.p7364b.p7365a;

import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6890a.C87297a;
import com.google.android.apps.gsa.search.core.p6884y.p6917i.C87388b;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.UpdateVoiceActionUiEventParcelable;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6935b.aab;
import com.google.android.apps.gsa.search.shared.service.p6935b.aad;
import com.google.android.apps.gsa.staticplugins.actionsui.p7364b.p7367c.C93472a;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.b.a.b */
/* compiled from: PG */
public final class C93462b extends C23056g {

    /* renamed from: a */
    public final C93472a f260839a;

    /* renamed from: b */
    private final C87388b f260840b;

    /* renamed from: c */
    private final C87297a f260841c;

    public C93462b(C23052c cVar, C93472a aVar, C87388b bVar, C87297a aVar2) {
        super(cVar);
        this.f260839a = aVar;
        this.f260840b = bVar;
        this.f260841c = aVar2;
    }

    /* renamed from: iD */
    public final void mo28439iD(ProtoParcelable protoParcelable) {
    }

    /* renamed from: iE */
    public final void mo28498iE() {
        aad b = this.f260841c.mo80943b();
        if (b != null) {
            C87684al alVar = new C87684al(C88244um.UPDATE_VOICE_ACTION_UI);
            alVar.mo81965b(aab.f237058a, b);
            UpdateVoiceActionUiEventParcelable a = this.f260841c.mo80942a();
            if (a != null) {
                alVar.mo81966c(a);
            }
            ((C93464d) this.f260839a).f260843a.mo28730f(C58833ax.m90834k(alVar.mo81964a()), false);
        }
        this.f260840b.mo81046a(this.f63405W, C88244um.UPDATE_VOICE_ACTION_UI, new C93461a(this));
    }
}
