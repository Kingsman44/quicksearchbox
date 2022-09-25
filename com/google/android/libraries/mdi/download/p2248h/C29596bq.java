package com.google.android.libraries.mdi.download.p2248h;

import com.google.common.base.C58817ah;
import com.google.protobuf.C62995dn;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: com.google.android.libraries.mdi.download.h.bq */
/* compiled from: PG */
public final /* synthetic */ class C29596bq implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ String f80175a;

    /* renamed from: b */
    public final /* synthetic */ C29581bb f80176b;

    public /* synthetic */ C29596bq(String str, C29581bb bbVar) {
        this.f80175a = str;
        this.f80176b = bbVar;
    }

    public final Object apply(Object obj) {
        String str = this.f80175a;
        C29581bb bbVar = this.f80176b;
        HashMap hashMap = new HashMap(Collections.unmodifiableMap(((C29584be) obj).f80155a));
        hashMap.put(str, bbVar);
        C29582bc bcVar = (C29582bc) C29584be.f80153b.createBuilder();
        bcVar.copyOnWrite();
        C29584be beVar = (C29584be) bcVar.instance;
        C62995dn dnVar = beVar.f80155a;
        if (!dnVar.f170058b) {
            beVar.f80155a = dnVar.mo58980a();
        }
        beVar.f80155a.putAll(hashMap);
        return (C29584be) bcVar.build();
    }
}
