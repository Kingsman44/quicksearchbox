package com.google.android.libraries.search.assistant.proactive.p2777i.p2778a;

import com.google.android.libraries.search.assistant.proactive.p2774f.C36262a;
import com.google.android.libraries.search.assistant.proactive.p2774f.C36265d;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.search.assistant.proactive.i.a.a */
/* compiled from: PG */
public final /* synthetic */ class C36317a implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C36262a f94831a;

    public /* synthetic */ C36317a(C36262a aVar) {
        this.f94831a = aVar;
    }

    public final void accept(Object obj) {
        C36262a aVar = this.f94831a;
        String str = (String) obj;
        aVar.copyOnWrite();
        C36265d dVar = (C36265d) aVar.instance;
        C36265d dVar2 = C36265d.f94713k;
        str.getClass();
        dVar.f94715a |= 16;
        dVar.f94720f = str;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
