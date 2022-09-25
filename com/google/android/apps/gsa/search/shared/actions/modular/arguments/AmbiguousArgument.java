package com.google.android.apps.gsa.search.shared.actions.modular.arguments;

import android.content.res.Resources;
import android.os.Parcelable;
import com.google.android.apps.gsa.search.shared.actions.modular.p6922a.C87429c;
import com.google.android.apps.gsa.search.shared.actions.modular.p6922a.C87431e;
import com.google.android.apps.gsa.search.shared.contact.C87518f;
import com.google.android.apps.gsa.search.shared.contact.Disambiguation;
import com.google.common.base.C58817ah;
import com.google.p4152bb.p4153a.C55133hb;
import com.google.p4152bb.p4153a.C55134hc;
import com.google.p4152bb.p4153a.C55213ka;

/* compiled from: PG */
public abstract class AmbiguousArgument extends SingleValueArgument {

    /* renamed from: i */
    private C87518f f236139i;

    protected AmbiguousArgument(AmbiguousArgument ambiguousArgument, Disambiguation disambiguation, int i) {
        super(ambiguousArgument, disambiguation, i);
        C87432a aVar = new C87432a(this, (C87518f) null);
        this.f236139i = aVar;
        if (disambiguation != null) {
            disambiguation.f236368g = aVar;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C87429c mo81257a(Object obj, C55133hb hbVar, Resources resources);

    /* renamed from: b */
    public final void mo81258b(C87518f fVar) {
        this.f236139i = new C87432a(this, fVar);
        if (mo81263C()) {
            ((Disambiguation) this.f236203n).f236368g = this.f236139i;
        }
    }

    /* renamed from: c */
    public C87429c mo81250c(C87449m mVar, C55134hc hcVar, Resources resources) {
        if (!mo81263C()) {
            return C87429c.f236122a;
        }
        Disambiguation disambiguation = (Disambiguation) this.f236203n;
        if (!disambiguation.mo81544m()) {
            return C87431e.m141670a(disambiguation.f236363b, hcVar, new C87438b(this, hcVar, resources), (C58817ah) null);
        }
        Parcelable parcelable = disambiguation.f236364c;
        parcelable.getClass();
        C55133hb a = C55133hb.m87600a(hcVar.f145123c);
        if (a == null) {
            a = C55133hb.NONE;
        }
        return mo81257a(parcelable, a, resources);
    }

    /* access modifiers changed from: protected */
    /* renamed from: hA */
    public boolean mo81259hA(Argument argument) {
        return (argument instanceof AmbiguousArgument) && Disambiguation.m142057k((Disambiguation) this.f236203n, (Disambiguation) ((AmbiguousArgument) argument).f236203n);
    }

    /* renamed from: hB */
    public boolean mo81260hB() {
        return mo81263C() && !((Disambiguation) this.f236203n).mo81543l() && !mo81291z();
    }

    /* access modifiers changed from: protected */
    /* renamed from: hz */
    public final /* bridge */ /* synthetic */ void mo81261hz(Object obj) {
        Disambiguation disambiguation = (Disambiguation) obj;
        Disambiguation disambiguation2 = (Disambiguation) this.f236203n;
        if (disambiguation != disambiguation2) {
            if (disambiguation2 != null) {
                disambiguation2.f236368g = null;
            }
            if (disambiguation != null) {
                disambiguation.f236368g = this.f236139i;
            }
            this.f236203n = disambiguation;
            C87518f fVar = this.f236139i;
            if (fVar != null && disambiguation != null) {
                fVar.mo81345a(disambiguation);
            }
        }
    }

    protected AmbiguousArgument(C55213ka kaVar, Disambiguation disambiguation) {
        super(kaVar, disambiguation);
        C87432a aVar = new C87432a(this, (C87518f) null);
        this.f236139i = aVar;
        if (disambiguation != null) {
            disambiguation.f236368g = aVar;
        }
    }
}
