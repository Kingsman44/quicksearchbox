package com.google.android.libraries.search.assistant.performer.communication.p2741f;

import android.database.Cursor;
import com.evernote.android.state.BuildConfig;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.f.n */
/* compiled from: PG */
public final /* synthetic */ class C35746n implements Function {

    /* renamed from: a */
    public final /* synthetic */ Cursor f93673a;

    public /* synthetic */ C35746n(Cursor cursor) {
        this.f93673a = cursor;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return (String) C35733aa.m64115i(this.f93673a, (String) obj).orElse(BuildConfig.FLAVOR);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
