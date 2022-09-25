package com.google.android.apps.gsa.speech.microdetection.p7303a.p7306c;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.speech.hotword.C92354c;
import com.google.android.apps.gsa.speech.microdetection.p7303a.p7308e.C92507a;
import com.google.android.apps.gsa.speech.microdetection.p7303a.p7308e.C92508b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.speech.microdetection.a.c.f */
/* compiled from: PG */
public final /* synthetic */ class C92501f implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C92503h f258140a;

    public /* synthetic */ C92501f(C92503h hVar) {
        this.f258140a = hVar;
    }

    public final C60870cx apply(Object obj) {
        C92503h hVar = this.f258140a;
        C92508b bVar = (C92508b) obj;
        if ((bVar.f258182a & 1) != 0) {
            return C60856cj.m92900i(bVar);
        }
        String str = (String) C92354c.f257487a.getOrDefault(hVar.f258147b, BuildConfig.FLAVOR);
        hVar.f258150e.f258166m = true;
        if (str.isEmpty()) {
            C59104x d = C92504i.f258151a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "MicroDataManager");
            ((C59052c) ((C59052c) d).mo56372aa(12710)).mo56389s("Locale %s unrecognized. hotword detection will likely fail.", hVar.f258147b);
            C92507a aVar = (C92507a) C92508b.f258180d.createBuilder();
            aVar.copyOnWrite();
            C92508b bVar2 = (C92508b) aVar.instance;
            bVar2.f258182a |= 2;
            bVar2.f258184c = "No hotword model and locale after remap is empty!";
            return C60856cj.m92900i((C92508b) aVar.build());
        }
        C59104x b = C92504i.f258151a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "MicroDataManager");
        ((C59052c) ((C59052c) b).mo56372aa(12709)).mo56354G("Changing locale %s to %s for hotword detection.", hVar.f258147b, str);
        return hVar.mo87260a(hVar.f258150e.mo87264e(str, hVar.f258148c), str, hVar.f258148c);
    }
}
