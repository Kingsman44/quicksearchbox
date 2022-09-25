package com.google.android.libraries.assistant.auto.tng.common.p901d;

import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.assistant.auto.tng.common.p901d.p902a.C13224b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.assistant.auto.tng.common.d.f */
/* compiled from: PG */
public final /* synthetic */ class C13229f implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C13231h f40880a;

    public /* synthetic */ C13229f(C13231h hVar) {
        this.f40880a = hVar;
    }

    public final C60870cx apply(Object obj) {
        C13231h hVar = this.f40880a;
        C13224b bVar = (C13224b) obj;
        if (bVar != null && (bVar.f40873a & 1) != 0) {
            return C60856cj.m92900i(bVar.f40874b);
        }
        if (!TextUtils.isEmpty(hVar.f40882a) && hVar.f40882a == null) {
            return C60856cj.m92900i(BuildConfig.FLAVOR);
        }
        C13225b bVar2 = hVar.f40885d;
        C58485gu guVar = C13234k.f40890b;
        C47633f g = C47633f.m84733g(bVar2.f40876b.mo50872b(C13234k.f40889a, new String[]{"name", "value"}, (String) null, (String[]) guVar.toArray(new String[((C58724pq) guVar).f156474d]), (String) null).f121591a.mo57273f(C47810es.m84968h(C13222a.f40870a), bVar2.f40875a).mo57275g());
        C13227d dVar = new C13227d(hVar);
        return C60922j.m93045h(g, C47810es.m84966f(dVar), hVar.f40886e);
    }
}
