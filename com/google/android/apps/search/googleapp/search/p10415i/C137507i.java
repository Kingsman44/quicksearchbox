package com.google.android.apps.search.googleapp.search.p10415i;

import com.google.common.p4526f.p4527a.C58974d;
import com.google.frameworks.client.data.android.C61362ad;
import java.net.HttpURLConnection;
import java.util.Map;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.googleapp.search.i.i */
/* compiled from: PG */
public final /* synthetic */ class C137507i implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ HttpURLConnection f374001a;

    public /* synthetic */ C137507i(HttpURLConnection httpURLConnection) {
        this.f374001a = httpURLConnection;
    }

    public final void accept(Object obj) {
        HttpURLConnection httpURLConnection = this.f374001a;
        Map.Entry entry = (Map.Entry) obj;
        C58974d dVar = C137508j.f374002a;
        httpURLConnection.addRequestProperty(((C61362ad) entry.getKey()).mo57931a(), (String) entry.getValue());
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
