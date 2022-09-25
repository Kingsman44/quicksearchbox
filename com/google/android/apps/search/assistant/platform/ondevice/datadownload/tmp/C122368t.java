package com.google.android.apps.search.assistant.platform.ondevice.datadownload.tmp;

import com.google.android.libraries.mdi.download.C28713as;
import com.google.android.libraries.mdi.download.C28716av;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.Locale;
import org.p5610a.p5611a.p5618b.p5620b.C71996c;
import p3186j$.util.Collection;
import p3186j$.util.OptionalLong;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.tmp.t */
/* compiled from: PG */
public final /* synthetic */ class C122368t implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C122338ad f339274a;

    public /* synthetic */ C122368t(C122338ad adVar) {
        this.f339274a = adVar;
    }

    public final C60870cx apply(Object obj) {
        C122338ad adVar = this.f339274a;
        C71996c cVar = (C71996c) obj;
        Object a = cVar.mo63197a();
        Object b = cVar.mo63198b();
        C122348an anVar = adVar.f339210a;
        Locale locale = adVar.f339211b;
        C58485gu guVar = (C58485gu) a;
        C58485gu guVar2 = (C58485gu) b;
        ((C59052c) ((C59052c) C122348an.f339226a.mo56226d()).mo56372aa(34766)).mo56354G("getTotalEstimatedSize: %s; %s", new C122340af(guVar), new C122341ag(guVar2));
        OptionalLong optionalLong = (OptionalLong) Stream.CC.concat(Collection.EL.stream(guVar), Collection.EL.stream(guVar2)).map(C122342ah.f339215a).reduce(OptionalLong.m71641of(0), C122343ai.f339216a);
        guVar.size();
        if (guVar.isEmpty() && guVar2.isEmpty()) {
            return C60866ct.f164955a;
        }
        if (anVar.f339229d.isActiveNetworkMetered() || anVar.f339235j) {
            anVar.f339229d.isActiveNetworkMetered();
            if (anVar.mo105601c()) {
                ((C59052c) ((C59052c) C122348an.f339226a.mo56224b()).mo56372aa(34763)).mo56386p("Download already in progress, not prompting download.");
                return C60866ct.f164955a;
            }
            return C60922j.m93045h(anVar.f339232g.mo105606a(anVar.f339231f, "com.google.android.apps.search.assistant.platform.ondevice.datadownload.tmp.DOWNLOAD_DATA", locale), C47810es.m84966f(new C122372x(anVar, optionalLong)), anVar.f339230e);
        } else if (anVar.mo105601c()) {
            ((C59052c) ((C59052c) C122348an.f339226a.mo56226d()).mo56372aa(34765)).mo56386p("Download already in progress, not starting download.");
            return C60866ct.f164955a;
        } else {
            C60870cx i = C60856cj.m92900i(guVar);
            C60870cx i2 = C60856cj.m92900i(guVar2);
            C28713as asVar = (C28713as) C28716av.f78018d.createBuilder();
            asVar.copyOnWrite();
            C28716av avVar = (C28716av) asVar.instance;
            avVar.f78022c = 0;
            avVar.f78020a |= 2;
            return anVar.mo105600a(locale, i, i2, (C28716av) asVar.build());
        }
    }
}
