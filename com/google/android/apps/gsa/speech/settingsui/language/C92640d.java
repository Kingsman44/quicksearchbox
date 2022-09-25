package com.google.android.apps.gsa.speech.settingsui.language;

import com.evernote.android.state.BuildConfig;
import java.util.Map;
import p3186j$.util.Map;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.speech.settingsui.language.d */
/* compiled from: PG */
public final /* synthetic */ class C92640d implements Function {

    /* renamed from: a */
    public final /* synthetic */ Map f258604a;

    public /* synthetic */ C92640d(Map map) {
        this.f258604a = map;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return (String) Map.EL.getOrDefault(this.f258604a, (String) obj, BuildConfig.FLAVOR);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
