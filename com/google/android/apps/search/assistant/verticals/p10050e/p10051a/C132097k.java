package com.google.android.apps.search.assistant.verticals.p10050e.p10051a;

import android.net.Uri;
import com.google.common.p4526f.p4527a.C58970a;
import java.io.IOException;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.search.assistant.verticals.e.a.k */
/* compiled from: PG */
public final /* synthetic */ class C132097k implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C132105s f360482a;

    /* renamed from: b */
    public final /* synthetic */ Uri f360483b;

    public /* synthetic */ C132097k(C132105s sVar, Uri uri) {
        this.f360482a = sVar;
        this.f360483b = uri;
    }

    public final Object call() {
        C132105s sVar = this.f360482a;
        try {
            return Boolean.valueOf(sVar.f360497c.mo45894h(this.f360483b));
        } catch (IOException e) {
            ((C58970a) ((C58970a) ((C58970a) C132105s.f360495a.mo56225c()).mo56382g(e)).mo56372aa(39778)).mo56386p("Error while checking file existence");
            return false;
        }
    }
}
