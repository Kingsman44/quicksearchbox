package com.google.android.libraries.search.assistant.performer.p2742d;

import android.text.TextUtils;
import com.google.android.libraries.search.assistant.performer.p2767j.C36180b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.C52390pz;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.search.assistant.performer.d.a */
/* compiled from: PG */
public final /* synthetic */ class C35781a implements Function {

    /* renamed from: a */
    public final /* synthetic */ C35783c f93738a;

    public /* synthetic */ C35781a(C35783c cVar) {
        this.f93738a = cVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C35783c cVar = this.f93738a;
        String str = ((C52390pz) obj).f137472a;
        if (TextUtils.isEmpty(str)) {
            ((C59052c) ((C59052c) C35783c.f93741b.mo56226d()).mo56372aa(52071)).mo56386p("Credential zwieback is empty.");
            return C60856cj.m92900i(C36180b.f94545b);
        }
        C60870cx f = cVar.f93742c.mo38006f(str);
        C35782b bVar = C35782b.f93739a;
        return C60922j.m93044g(f, C47810es.m84963c(bVar), C60826bg.f164896a);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
