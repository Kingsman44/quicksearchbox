package com.google.android.apps.search.assistant.platform.p9141h.p9165i;

import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79570b;
import com.google.android.apps.search.assistant.platform.p9141h.p9165i.p9166a.C121143a;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58800sl;
import java.util.LinkedHashSet;
import java.util.Set;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5463a.C69540x;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.settingsdata.quickphrases.QuickPhrasesSettingsDataServiceForClassicImpl$setContextsEnabledAndNotify$1", mo61344c = "QuickPhrasesSettingsDataServiceForClassicImpl.kt", mo61345d = "invokeSuspend", mo61346e = {39})
/* renamed from: com.google.android.apps.search.assistant.platform.h.i.e */
/* compiled from: PG */
public final class C121152e extends C69572j implements C69626l {

    /* renamed from: a */
    int f336623a;

    /* renamed from: b */
    final /* synthetic */ C58528ij f336624b;

    /* renamed from: c */
    final /* synthetic */ C121155h f336625c;

    /* renamed from: d */
    final /* synthetic */ boolean f336626d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C121152e(C58528ij ijVar, C121155h hVar, boolean z, C69577g gVar) {
        super(1, gVar);
        this.f336624b = ijVar;
        this.f336625c = hVar;
        this.f336626d = z;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        return new C121152e(this.f336624b, this.f336625c, this.f336626d, (C69577g) obj).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f336623a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            C58800sl lA = this.f336624b.iterator();
            while (lA.hasNext()) {
                C79570b bVar = (C79570b) lA.next();
                C69664n.m101060f(bVar, "contextType");
                C121143a a = C121142a.m200430a(bVar);
                if (a != null) {
                    linkedHashSet.add(a);
                }
            }
            C121151d dVar = this.f336625c.f336632a;
            Set ab = C69540x.m100846ab(linkedHashSet);
            boolean z = this.f336626d;
            this.f336623a = 1;
            if (dVar.mo105065b(ab, z, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }
}
