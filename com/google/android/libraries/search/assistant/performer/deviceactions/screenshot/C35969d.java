package com.google.android.libraries.search.assistant.performer.deviceactions.screenshot;

import android.content.ContentValues;
import android.net.Uri;
import com.google.apps.tiktok.dataservice.C46820i;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.screenshot.d */
/* compiled from: PG */
public final /* synthetic */ class C35969d implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C35971f f94147a;

    public /* synthetic */ C35969d(C35971f fVar) {
        this.f94147a = fVar;
    }

    public final C60870cx apply(Object obj) {
        C35971f fVar = this.f94147a;
        Uri uri = (Uri) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("is_pending", 0);
        C60870cx d = fVar.f94149a.mo50874d(new C46820i(uri, contentValues));
        C35967b bVar = C35967b.f94144a;
        C60922j.m93044g(d, C47810es.m84963c(bVar), fVar.f94151c);
        return C60856cj.m92900i(uri);
    }
}
