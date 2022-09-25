package com.google.android.apps.gsa.nga.engine.p6044n.p6049c.p6050a;

import com.google.android.googlequicksearchbox.R;
import java.util.Locale;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.n.c.a.r */
/* compiled from: PG */
public final /* synthetic */ class C76333r implements Function {

    /* renamed from: a */
    public final /* synthetic */ C76337v f211410a;

    /* renamed from: b */
    public final /* synthetic */ Locale f211411b;

    /* renamed from: c */
    public final /* synthetic */ String f211412c;

    public /* synthetic */ C76333r(C76337v vVar, Locale locale, String str) {
        this.f211410a = vVar;
        this.f211411b = locale;
        this.f211412c = str;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C76337v vVar = this.f211410a;
        Locale locale = this.f211411b;
        String str = this.f211412c;
        return vVar.f211421c.mo75121a(locale).getString(R.string.nga_executors_reply_to_notification_replied_to, new Object[]{(String) obj, str});
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
