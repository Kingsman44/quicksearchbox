package com.google.android.libraries.lens.view.p2159q;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.mdi.C29690f;
import com.google.android.libraries.mdi.download.C29409fd;
import com.google.android.libraries.mdi.download.C29651hv;
import com.google.android.libraries.mdi.download.C29652hw;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60856cj;
import java.util.Map;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.lens.view.q.e */
/* compiled from: PG */
public final /* synthetic */ class C27631e implements Function {

    /* renamed from: a */
    public final /* synthetic */ C27634h f75486a;

    /* renamed from: b */
    public final /* synthetic */ Map f75487b;

    public /* synthetic */ C27631e(C27634h hVar, Map map) {
        this.f75486a = hVar;
        this.f75487b = map;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C27634h hVar = this.f75486a;
        Map map = this.f75487b;
        String str = ((C29690f) obj).f80411b;
        String str2 = (String) hVar.f75491b.mo31240b().mo55367b().getOrDefault(str, BuildConfig.FLAVOR);
        if (str2.isEmpty() || map.containsKey(str2)) {
            return C47633f.m84733g(C60856cj.m92900i(true));
        }
        C29409fd fdVar = hVar.f75490a;
        C29651hv e = C29652hw.m54673e();
        e.mo34790b(str);
        return fdVar.mo34722k(e.mo34789a());
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
