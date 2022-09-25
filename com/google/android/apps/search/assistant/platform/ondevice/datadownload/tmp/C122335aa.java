package com.google.android.apps.search.assistant.platform.ondevice.datadownload.tmp;

import com.google.android.libraries.assistant.p1363c.p1371b.p1372a.C17030b;
import java.util.Locale;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.tmp.aa */
/* compiled from: PG */
public final /* synthetic */ class C122335aa implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C122335aa f339207a = new C122335aa();

    private /* synthetic */ C122335aa() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C17030b bVar = (C17030b) obj;
        return String.format(Locale.US, "%s->%d", new Object[]{bVar.mo23171c(), Long.valueOf(bVar.mo23170b().orElse(-1))});
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
