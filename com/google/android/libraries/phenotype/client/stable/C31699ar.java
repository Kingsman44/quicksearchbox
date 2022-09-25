package com.google.android.libraries.phenotype.client.stable;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.phenotype.client.C31655ak;
import com.google.common.base.C58817ah;
import com.google.protobuf.C62995dn;
import java.util.Collections;

/* renamed from: com.google.android.libraries.phenotype.client.stable.ar */
/* compiled from: PG */
public final /* synthetic */ class C31699ar implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ String f85234a;

    /* renamed from: b */
    public final /* synthetic */ String f85235b = BuildConfig.FLAVOR;

    public /* synthetic */ C31699ar(String str) {
        this.f85234a = str;
    }

    public final Object apply(Object obj) {
        String str = this.f85234a;
        String str2 = this.f85235b;
        C31741h hVar = (C31741h) obj;
        C31655ak akVar = C31700as.f85236a;
        C31708b bVar = C31708b.f85249d;
        C62995dn dnVar = hVar.f85327a;
        if (dnVar.containsKey(str)) {
            bVar = (C31708b) dnVar.get(str);
        }
        C31681a aVar = (C31681a) bVar.toBuilder();
        if (!Collections.unmodifiableList(((C31708b) aVar.instance).f85252b).contains(str2)) {
            aVar.mo37319a(str2);
        }
        C31740g gVar = (C31740g) hVar.toBuilder();
        aVar.copyOnWrite();
        C31708b bVar2 = (C31708b) aVar.instance;
        bVar2.f85251a |= 1;
        bVar2.f85253c = str2;
        gVar.mo37351a(str, (C31708b) aVar.build());
        return (C31741h) gVar.build();
    }
}
