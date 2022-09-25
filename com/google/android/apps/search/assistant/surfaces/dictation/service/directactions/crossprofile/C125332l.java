package com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.crossprofile;

import android.app.DirectAction;
import android.content.Context;
import android.os.Bundle;
import com.google.android.apps.search.assistant.platform.p9236j.p9237a.p9238a.p9240b.C121544b;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126308aq;
import com.google.apps.tiktok.account.data.p3614c.C46194e;
import com.google.apps.tiktok.concurrent.C46423aj;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.crossprofile.l */
/* compiled from: PG */
public final class C125332l implements C125319a {

    /* renamed from: a */
    private final C46423aj f345712a;

    /* renamed from: b */
    private final Executor f345713b;

    /* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.crossprofile.l$a */
    /* compiled from: PG */
    public interface C125333a {
        /* renamed from: nO */
        C121544b mo106923nO();
    }

    public C125332l(Context context, C46194e eVar, Executor executor) {
        this.f345713b = executor;
        this.f345712a = new C46423aj(new C125322b(context, eVar, executor), executor);
    }

    /* renamed from: a */
    public final C60870cx mo106917a() {
        C60870cx b = this.f345712a.mo50395b();
        C125323c cVar = C125323c.f345702a;
        return C60922j.m93045h(b, C47810es.m84966f(cVar), C60826bg.f164896a);
    }

    /* renamed from: b */
    public final C60870cx mo106918b(DirectAction directAction, Bundle bundle) {
        C60870cx b = this.f345712a.mo50395b();
        C125324d dVar = new C125324d(directAction, bundle);
        return C60922j.m93045h(b, C47810es.m84966f(dVar), C60826bg.f164896a);
    }

    /* renamed from: c */
    public final C60870cx mo106919c(String str) {
        C60870cx b = this.f345712a.mo50395b();
        C125326f fVar = new C125326f(str);
        return C60922j.m93045h(b, C47810es.m84966f(fVar), C60826bg.f164896a);
    }

    /* renamed from: d */
    public final void mo106920d(C125346x xVar) {
        C60870cx b = this.f345712a.mo50395b();
        C125328h hVar = new C125328h(xVar);
        C60870cx h = C60922j.m93045h(b, C47810es.m84966f(hVar), C60826bg.f164896a);
        C126308aq aqVar = new C126308aq(new C125329i(xVar), new C125330j(xVar));
        C60856cj.m92911t(h, C47810es.m84974n(aqVar), this.f345713b);
    }
}
