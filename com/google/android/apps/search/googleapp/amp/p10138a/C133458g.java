package com.google.android.apps.search.googleapp.amp.p10138a;

import android.net.Uri;
import java.util.TreeMap;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.googleapp.amp.a.g */
/* compiled from: PG */
public final /* synthetic */ class C133458g implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ TreeMap f363656a;

    /* renamed from: b */
    public final /* synthetic */ Uri f363657b;

    public /* synthetic */ C133458g(TreeMap treeMap, Uri uri) {
        this.f363656a = treeMap;
        this.f363657b = uri;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    public final void accept(Object obj) {
        TreeMap treeMap = this.f363656a;
        Uri uri = this.f363657b;
        String str = (String) obj;
        str.getClass();
        treeMap.put(str, Uri.encode(uri.getQueryParameter(str)));
    }
}
