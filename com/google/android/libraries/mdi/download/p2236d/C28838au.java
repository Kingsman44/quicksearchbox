package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.p2236d.p2237a.C28816c;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.libraries.mdi.download.d.au */
/* compiled from: PG */
public final /* synthetic */ class C28838au implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ PrintWriter f78342a;

    public /* synthetic */ C28838au(PrintWriter printWriter) {
        this.f78342a = printWriter;
    }

    public final C60870cx apply(Object obj) {
        PrintWriter printWriter = this.f78342a;
        ArrayList arrayList = new ArrayList((List) obj);
        Collections.sort(arrayList, C28833ap.f78330a);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C28816c cVar = (C28816c) arrayList.get(i);
            printWriter.format("GroupName: %s\nAccount: %s\nDataFileGroup:\n %s\n\n", new Object[]{cVar.mo34484b().f79682b, cVar.mo34484b().f79684d, cVar.mo34483a().toString()});
        }
        return C60866ct.f164955a;
    }
}
