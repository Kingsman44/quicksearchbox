package com.google.android.apps.search.assistant.surfaces.dictation.service.p9453l.p9455b;

import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125160i;
import p3186j$.time.Instant;
import p5462h.C69685i;
import p5462h.p5463a.C69505av;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.l.b.e */
/* compiled from: PG */
public final class C125898e extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ String f346975a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C125898e(String str) {
        super(1);
        this.f346975a = str;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        C125892a aVar = (C125892a) obj;
        C69664n.m101061g(aVar, "it");
        Integer num = (Integer) aVar.f346963d.get(this.f346975a);
        if (num == null) {
            throw new IllegalStateException("Attempted to remove nonexistent download request.");
        } else if (num.intValue() <= 0) {
            throw new AssertionError("Values in pendingLanguageDownloadRequests can never be less than 1.");
        } else if (num.intValue() == 1) {
            return C125892a.m205886a(aVar, (C125160i) null, false, (Instant) null, C69505av.m100869k(aVar.f346963d, this.f346975a), 7);
        } else {
            return C125892a.m205886a(aVar, (C125160i) null, false, (Instant) null, C69505av.m100872n(aVar.f346963d, C69505av.m100862d(new C69685i(this.f346975a, Integer.valueOf(num.intValue() - 1)))), 7);
        }
    }
}
