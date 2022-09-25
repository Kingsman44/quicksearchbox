package com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9395c.p9396a;

import android.content.Intent;
import com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9386b.C124519a;
import com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9386b.p9387a.C124520a;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124633az;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124719q;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.c.c.a.e */
/* compiled from: PG */
public final /* synthetic */ class C124577e implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C124571aq f343676a;

    /* renamed from: b */
    public final /* synthetic */ String f343677b;

    public /* synthetic */ C124577e(C124571aq aqVar, String str) {
        this.f343676a = aqVar;
        this.f343677b = str;
    }

    public final Object apply(Object obj) {
        C124571aq aqVar = this.f343676a;
        String str = this.f343677b;
        C124520a aVar = aqVar.f343669k;
        C124719q k = ((C124548d) obj).mo106513k();
        Intent a = C124520a.m203975a(str, k, false);
        if (!k.equals(C124719q.GACS_DEVICE)) {
            a.putExtra("EXTRA_OOBE_STATE", C124633az.OOBE_NOT_FINISHED.f343841h);
        }
        C124519a.m203974a(aVar.f343589a, a);
        return true;
    }
}
