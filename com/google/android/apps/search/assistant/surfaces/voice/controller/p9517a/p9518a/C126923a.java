package com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9518a;

import com.google.android.apps.search.assistant.libraries.dictation.starter.C119305a;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.C119908e;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119793ao;
import com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9575d.C127282b;
import com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9575d.C127283c;
import com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9575d.C127289i;
import com.google.assistant.p3897e.p3921j.C51809dy;
import java.util.Map;
import p3186j$.util.Map;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.controller.a.a.a */
/* compiled from: PG */
public final class C126923a implements C126928f {

    /* renamed from: a */
    public final Map f349453a;

    /* renamed from: b */
    public final C126930h f349454b;

    /* renamed from: c */
    public final C119305a f349455c;

    public C126923a(Map map, C126930h hVar, C119305a aVar) {
        C69664n.m101061g(aVar, "dictationEligibilityCache");
        this.f349453a = map;
        this.f349454b = hVar;
        this.f349455c = aVar;
    }

    /* renamed from: a */
    public final C119908e mo107854a(C51809dy dyVar, C119793ao aoVar, C127289i iVar) {
        C69664n.m101061g(dyVar, "clientOp");
        C69664n.m101061g(aoVar, "clientOpContext");
        C69664n.m101061g(iVar, "queryContext");
        Map map = this.f349453a;
        C127283c cVar = iVar.f350565c;
        if (cVar == null) {
            cVar = C127283c.f350547c;
        }
        C127282b a = C127282b.m208209a(cVar.f350549a);
        C69664n.m101060f(a, "queryContext.entryPoint.typeCase");
        return ((C126930h) Map.EL.getOrDefault(map, a, this.f349454b)).f349461c.mo107854a(dyVar, aoVar, iVar);
    }
}
