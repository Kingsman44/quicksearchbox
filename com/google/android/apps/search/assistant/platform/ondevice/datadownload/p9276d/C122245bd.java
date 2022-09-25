package com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9276d;

import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17072q;
import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17077v;
import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17078w;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import java.util.Collections;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.d.bd */
/* compiled from: PG */
public final /* synthetic */ class C122245bd implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C17078w f338986a;

    /* renamed from: b */
    public final /* synthetic */ C58485gu f338987b;

    public /* synthetic */ C122245bd(C17078w wVar, C58485gu guVar) {
        this.f338986a = wVar;
        this.f338987b = guVar;
    }

    public final Object apply(Object obj) {
        C17078w wVar = this.f338986a;
        C58485gu guVar = this.f338987b;
        Exception exc = (Exception) obj;
        int a = C17077v.m34239a(wVar.f49719e);
        if (a == 0 || a != 2) {
            return Collections.emptyList();
        }
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            C122260bs bsVar = (C122260bs) guVar.get(i);
            if (bsVar.f339015f.equals(C17072q.DOWNLOADING) || bsVar.f339015f.equals(C17072q.READY_TO_DOWNLOAD)) {
                bsVar.f339015f = C17072q.FINISHED_CANCELLED;
            }
        }
        return Collections.emptyList();
    }
}
