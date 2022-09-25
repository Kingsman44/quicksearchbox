package com.google.android.apps.search.googleapp.search.srp.p10435e;

import android.net.Uri;
import java.util.Map;
import java.util.Set;
import p3186j$.util.function.Consumer;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.srp.e.av */
/* compiled from: PG */
final class C137771av implements Consumer {

    /* renamed from: a */
    final /* synthetic */ Set f374792a;

    /* renamed from: b */
    final /* synthetic */ Uri.Builder f374793b;

    public C137771av(Set set, Uri.Builder builder) {
        this.f374792a = set;
        this.f374793b = builder;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        C69664n.m101061g(entry, "param");
        if (!this.f374792a.contains(entry.getKey()) && ((CharSequence) entry.getValue()).length() > 0) {
            this.f374793b.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
