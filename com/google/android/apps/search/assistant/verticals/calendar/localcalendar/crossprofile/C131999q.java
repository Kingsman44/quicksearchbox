package com.google.android.apps.search.assistant.verticals.calendar.localcalendar.crossprofile;

import com.google.android.apps.search.assistant.verticals.calendar.localcalendar.p10037a.C131946a;
import com.google.android.apps.search.assistant.verticals.calendar.localcalendar.p10037a.C131947b;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.verticals.calendar.localcalendar.crossprofile.q */
/* compiled from: PG */
public final /* synthetic */ class C131999q implements Function {

    /* renamed from: a */
    public final /* synthetic */ boolean f360336a;

    public /* synthetic */ C131999q(boolean z) {
        this.f360336a = z;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        boolean z = this.f360336a;
        C131946a aVar = (C131946a) ((C131947b) obj).toBuilder();
        aVar.copyOnWrite();
        C131947b bVar = (C131947b) aVar.instance;
        bVar.f360262a |= 8;
        bVar.f360266e = z;
        return (C131947b) aVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
