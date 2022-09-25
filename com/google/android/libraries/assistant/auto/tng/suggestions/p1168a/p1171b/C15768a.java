package com.google.android.libraries.assistant.auto.tng.suggestions.p1168a.p1171b;

import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16091aq;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16360bg;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16379o;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16383s;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.a.b.a */
/* compiled from: PG */
public final class C15768a extends C15776c {

    /* renamed from: a */
    public C58833ax f46973a;

    /* renamed from: b */
    public C16091aq f46974b;

    /* renamed from: c */
    public C58495hd f46975c;

    /* renamed from: d */
    public C58485gu f46976d;

    /* renamed from: e */
    private C16360bg f46977e;

    /* renamed from: f */
    private C58833ax f46978f;

    /* renamed from: g */
    private C58833ax f46979g;

    /* renamed from: h */
    private C58833ax f46980h;

    /* renamed from: i */
    private C16383s f46981i;

    /* renamed from: j */
    private C58833ax f46982j;

    /* renamed from: k */
    private C16379o f46983k;

    public C15768a() {
        C58836b bVar = C58836b.f156633a;
        this.f46978f = bVar;
        this.f46979g = bVar;
        this.f46980h = bVar;
        this.f46973a = bVar;
        this.f46982j = bVar;
    }

    public C15768a(C15777d dVar) {
        C58836b bVar = C58836b.f156633a;
        this.f46978f = bVar;
        this.f46979g = bVar;
        this.f46980h = bVar;
        this.f46973a = bVar;
        this.f46982j = bVar;
        C15775b bVar2 = (C15775b) dVar;
        this.f46977e = bVar2.f47003a;
        this.f46978f = bVar2.f47004b;
        this.f46979g = bVar2.f47005c;
        this.f46980h = bVar2.f47006d;
        this.f46973a = bVar2.f47007e;
        this.f46981i = bVar2.f47008f;
        this.f46982j = bVar2.f47009g;
        this.f46974b = bVar2.f47010h;
        this.f46975c = bVar2.f47011i;
        this.f46976d = bVar2.f47012j;
        this.f46983k = bVar2.f47013k;
    }

    /* renamed from: a */
    public final C15777d mo22532a() {
        C16383s sVar;
        C16091aq aqVar;
        C58495hd hdVar;
        C58485gu guVar;
        C16379o oVar;
        C16360bg bgVar = this.f46977e;
        if (bgVar != null && (sVar = this.f46981i) != null && (aqVar = this.f46974b) != null && (hdVar = this.f46975c) != null && (guVar = this.f46976d) != null && (oVar = this.f46983k) != null) {
            return new C15775b(bgVar, this.f46978f, this.f46979g, this.f46980h, this.f46973a, sVar, this.f46982j, aqVar, hdVar, guVar, oVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f46977e == null) {
            sb.append(" systemSignal");
        }
        if (this.f46981i == null) {
            sb.append(" mapsSignal");
        }
        if (this.f46974b == null) {
            sb.append(" displayInfo");
        }
        if (this.f46975c == null) {
            sb.append(" candidateSuggestionMetricsMap");
        }
        if (this.f46976d == null) {
            sb.append(" currentlyDisplayedCandidateSuggestionList");
        }
        if (this.f46983k == null) {
            sb.append(" customSignal");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo22533b(C58833ax axVar) {
        if (axVar != null) {
            this.f46980h = axVar;
            return;
        }
        throw new NullPointerException("Null commsSignal");
    }

    /* renamed from: c */
    public final void mo22534c(C16379o oVar) {
        if (oVar != null) {
            this.f46983k = oVar;
            return;
        }
        throw new NullPointerException("Null customSignal");
    }

    /* renamed from: d */
    public final void mo22535d(C58833ax axVar) {
        if (axVar != null) {
            this.f46982j = axVar;
            return;
        }
        throw new NullPointerException("Null gearheadNavigationSignal");
    }

    /* renamed from: e */
    public final void mo22536e(C16383s sVar) {
        if (sVar != null) {
            this.f46981i = sVar;
            return;
        }
        throw new NullPointerException("Null mapsSignal");
    }

    /* renamed from: f */
    public final void mo22537f(C58833ax axVar) {
        if (axVar != null) {
            this.f46979g = axVar;
            return;
        }
        throw new NullPointerException("Null mediaSignal");
    }

    /* renamed from: g */
    public final void mo22538g(C16360bg bgVar) {
        if (bgVar != null) {
            this.f46977e = bgVar;
            return;
        }
        throw new NullPointerException("Null systemSignal");
    }

    /* renamed from: h */
    public final void mo22539h(C58833ax axVar) {
        if (axVar != null) {
            this.f46978f = axVar;
            return;
        }
        throw new NullPointerException("Null vehicleSignal");
    }
}
