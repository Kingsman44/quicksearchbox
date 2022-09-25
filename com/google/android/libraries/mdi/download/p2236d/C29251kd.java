package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C29398ev;
import com.google.android.libraries.mdi.download.C29402ez;
import com.google.android.libraries.mdi.download.C29406fa;
import com.google.android.libraries.mdi.download.C29408fc;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.android.libraries.mdi.download.p2236d.p2242f.C29109w;
import com.google.android.libraries.mdi.download.p2236d.p2242f.C29110x;
import com.google.common.base.C58817ah;
import com.google.protobuf.C62995dn;
import java.util.Collections;

/* renamed from: com.google.android.libraries.mdi.download.d.kd */
/* compiled from: PG */
public final /* synthetic */ class C29251kd implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C29259kl f79261a;

    public /* synthetic */ C29251kd(C29259kl klVar) {
        this.f79261a = klVar;
    }

    public final Object apply(Object obj) {
        C29259kl klVar = this.f79261a;
        C29408fc fcVar = (C29408fc) obj;
        C29045l.m53930b("%s: Starting migration to add download transform", "ProtoDataStoreSharedFilesMetadata");
        C29406fa faVar = (C29406fa) fcVar.toBuilder();
        for (String str : Collections.unmodifiableMap(fcVar.f79729a).keySet()) {
            try {
                C29398ev a = C29110x.m54033a(str, klVar.f79270a, klVar.f79271b);
                str.getClass();
                C62995dn dnVar = fcVar.f79729a;
                C29402ez ezVar = dnVar.containsKey(str) ? (C29402ez) dnVar.get(str) : null;
                faVar.mo34710b(str);
                if (ezVar == null) {
                    C29045l.m53935g("%s: Unable to read sharedFile from ProtoDataStore.", "ProtoDataStoreSharedFilesMetadata");
                } else {
                    faVar.mo34709a(C29110x.m54037e(a), ezVar);
                }
            } catch (C29109w e) {
                C29045l.m53936h("%s Failed to deserialize file key %s, remove and continue.", "ProtoDataStoreSharedFilesMetadata", str);
                klVar.f79271b.mo34497a(e, "Failed to deserialize file key, remove and continue.", new Object[0]);
                faVar.mo34710b(str);
            }
        }
        return (C29408fc) faVar.build();
    }
}
