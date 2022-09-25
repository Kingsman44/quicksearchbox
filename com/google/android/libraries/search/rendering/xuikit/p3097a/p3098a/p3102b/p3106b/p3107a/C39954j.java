package com.google.android.libraries.search.rendering.xuikit.p3097a.p3098a.p3102b.p3106b.p3107a;

import android.graphics.drawable.Drawable;
import com.evernote.android.state.BuildConfig;
import com.google.p4283bv.p4380j.p4385b.p4386a.p4392b.p4396b.p4400c.p4401a.C57720d;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.a.a.b.b.a.j */
/* compiled from: PG */
public final /* synthetic */ class C39954j implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C39954j f105036a = new C39954j();

    private /* synthetic */ C39954j() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C57720d dVar = (C57720d) obj;
        Drawable drawable = C39959o.f105042a;
        return (dVar.f154202a & 2) != 0 ? dVar.f154204c : BuildConfig.FLAVOR;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
