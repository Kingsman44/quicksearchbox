package com.google.android.apps.search.assistant.surfaces.dictation.service.p9432d.p9433a;

import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.p9480a.C126290c;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import p3186j$.util.function.BiPredicate;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.d.a.k */
/* compiled from: PG */
public final /* synthetic */ class C125308k implements BiPredicate {

    /* renamed from: a */
    public final /* synthetic */ Locale f345672a;

    public /* synthetic */ C125308k(Locale locale) {
        this.f345672a = locale;
    }

    public final /* synthetic */ BiPredicate and(BiPredicate biPredicate) {
        return BiPredicate.CC.$default$and(this, biPredicate);
    }

    public final /* synthetic */ BiPredicate negate() {
        return BiPredicate.CC.$default$negate(this);
    }

    /* renamed from: or */
    public final /* synthetic */ BiPredicate mo19296or(BiPredicate biPredicate) {
        return BiPredicate.CC.$default$or(this, biPredicate);
    }

    public final boolean test(Object obj, Object obj2) {
        Locale locale = this.f345672a;
        String str = (String) obj;
        C47633f fVar = (C47633f) obj2;
        C59071e eVar = C125311n.f345675a;
        try {
            C60856cj.m92909r(fVar);
            return true;
        } catch (ExecutionException e) {
            C59052c cVar = (C59052c) C125311n.f345675a.mo56226d();
            cVar.mo56374ac(1, TimeUnit.MINUTES);
            ((C59052c) ((C59052c) cVar.mo56382g(e)).mo56372aa(36488)).mo56354G("Data file %s missing for %s [SD]", C126290c.m206496a(str), locale.toLanguageTag());
            return false;
        }
    }
}
