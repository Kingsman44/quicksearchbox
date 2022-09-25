package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.keyboardinput.p9867a;

import com.google.frameworks.client.data.android.C61362ad;
import java.util.Map;
import p3186j$.util.function.Consumer;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.keyboardinput.a.f */
/* compiled from: PG */
final class C130061f implements Consumer {

    /* renamed from: a */
    final /* synthetic */ Map f356650a;

    public C130061f(Map map) {
        this.f356650a = map;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        String str = (String) obj;
        C69664n.m101061g(str, "it");
        this.f356650a.put(C61362ad.m93870b("Authorization"), str);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
