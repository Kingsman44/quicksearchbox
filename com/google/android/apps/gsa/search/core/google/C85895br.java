package com.google.android.apps.gsa.search.core.google;

import com.google.android.apps.gsa.search.shared.api.UriRequest;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C63088z;
import com.google.speech.p5208h.C66559ap;
import com.google.speech.p5208h.C66560aq;
import com.google.speech.p5208h.C66561ar;
import com.google.speech.p5208h.C66563at;
import com.google.speech.p5208h.C66566aw;
import com.google.speech.p5208h.C66567ax;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.search.core.google.br */
/* compiled from: PG */
public final class C85895br {

    /* renamed from: a */
    public static final C59071e f232231a = C59071e.m91332i("com.google.android.apps.gsa.search.core.google.br");

    /* renamed from: b */
    public final C85929cw f232232b;

    /* renamed from: c */
    public final C22871g f232233c;

    /* renamed from: d */
    public final C68214a f232234d;

    public C85895br(C85929cw cwVar, C22871g gVar, C68214a aVar) {
        this.f232232b = cwVar;
        this.f232233c = gVar;
        this.f232234d = aVar;
    }

    /* renamed from: a */
    public static C66567ax m138021a(UriRequest uriRequest) {
        C66566aw awVar = (C66566aw) C66567ax.f181069f.createBuilder();
        String path = uriRequest.f236331a.getPath();
        awVar.copyOnWrite();
        C66567ax axVar = (C66567ax) awVar.instance;
        path.getClass();
        axVar.f181072a |= 1;
        axVar.f181073b = path;
        C58495hd hdVar = uriRequest.f236332b;
        C58495hd hdVar2 = uriRequest.f236333c;
        ArrayList arrayList = new ArrayList(hdVar.size() + hdVar2.size());
        for (Map.Entry entry : hdVar.entrySet()) {
            C66561ar arVar = (C66561ar) C66563at.f181054f.createBuilder();
            String str = (String) entry.getKey();
            arVar.copyOnWrite();
            C66563at atVar = (C66563at) arVar.instance;
            str.getClass();
            atVar.f181056a |= 1;
            atVar.f181057b = str;
            String str2 = (String) entry.getValue();
            arVar.copyOnWrite();
            C66563at atVar2 = (C66563at) arVar.instance;
            str2.getClass();
            atVar2.f181056a |= 2;
            atVar2.f181058c = str2;
            arrayList.add((C66563at) arVar.build());
        }
        for (Map.Entry entry2 : hdVar2.entrySet()) {
            C66561ar arVar2 = (C66561ar) C66563at.f181054f.createBuilder();
            String str3 = (String) entry2.getKey();
            arVar2.copyOnWrite();
            C66563at atVar3 = (C66563at) arVar2.instance;
            str3.getClass();
            atVar3.f181056a |= 1;
            atVar3.f181057b = str3;
            C63088z A = C63088z.m96139A((byte[]) entry2.getValue());
            arVar2.copyOnWrite();
            C66563at atVar4 = (C66563at) arVar2.instance;
            atVar4.f181056a |= 4;
            atVar4.f181059d = A;
            arrayList.add((C66563at) arVar2.build());
        }
        awVar.mo59677b(arrayList);
        Map b = C85968dn.m137828b(uriRequest.f236331a);
        ArrayList arrayList2 = new ArrayList(b.size());
        for (Map.Entry entry3 : b.entrySet()) {
            C66559ap apVar = (C66559ap) C66560aq.f181048d.createBuilder();
            String str4 = (String) entry3.getKey();
            apVar.copyOnWrite();
            C66560aq aqVar = (C66560aq) apVar.instance;
            str4.getClass();
            aqVar.f181050a |= 1;
            aqVar.f181051b = str4;
            String str5 = (String) entry3.getValue();
            apVar.copyOnWrite();
            C66560aq aqVar2 = (C66560aq) apVar.instance;
            str5.getClass();
            aqVar2.f181050a |= 2;
            aqVar2.f181052c = str5;
            arrayList2.add((C66560aq) apVar.build());
        }
        awVar.mo59676a(arrayList2);
        return (C66567ax) awVar.build();
    }
}
