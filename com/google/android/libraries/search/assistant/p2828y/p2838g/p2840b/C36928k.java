package com.google.android.libraries.search.assistant.p2828y.p2838g.p2840b;

import android.app.appsearch.AppSearchManager;
import android.content.Context;
import android.os.Bundle;
import androidx.appsearch.builtintypes.Alarm;
import androidx.appsearch.builtintypes.Timer;
import androidx.appsearch.p047a.C0856u;
import androidx.appsearch.p047a.C0859x;
import androidx.appsearch.p048b.C0862a;
import androidx.appsearch.p049c.C0865b;
import androidx.appsearch.p049c.C0866c;
import androidx.appsearch.p050d.C0874d;
import androidx.appsearch.p050d.C0876f;
import androidx.p104d.p105a.C2170i;
import com.google.android.libraries.search.assistant.p2828y.p2838g.p2839a.C36910d;
import com.google.android.libraries.search.assistant.p2828y.p2838g.p2839a.C36911e;
import com.google.android.libraries.search.assistant.p2828y.p2838g.p2841c.p2843b.C36947a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.search.assistant.y.g.b.k */
/* compiled from: PG */
public final class C36928k {

    /* renamed from: a */
    public static final C59071e f96161a = C59071e.m91332i("com.google.android.libraries.search.assistant.y.g.b.k");

    /* renamed from: b */
    public final C60870cx f96162b;

    /* renamed from: c */
    public final C60887da f96163c;

    /* renamed from: d */
    public final C36926i f96164d = new C36926i(this);

    /* renamed from: e */
    private final C36910d f96165e;

    /* renamed from: f */
    private final C36911e f96166f;

    /* renamed from: c */
    public static void m65620c(C60870cx cxVar) {
        C36927j jVar = new C36927j();
        C60856cj.m92911t(cxVar, C47810es.m84974n(jVar), C60826bg.f164896a);
    }

    /* renamed from: a */
    public final void mo40470a() {
        C36910d dVar;
        C36911e eVar = this.f96166f;
        if (eVar != null && (dVar = this.f96165e) != null) {
            eVar.mo40465b(dVar);
        }
    }

    /* renamed from: b */
    public final void mo40471b(C0859x xVar) {
        try {
            C0865b bVar = new C0865b();
            bVar.mo3473a();
            List<Class> asList = Arrays.asList(new Class[]{Alarm.class, Timer.class});
            asList.getClass();
            bVar.mo3473a();
            ArrayList arrayList = new ArrayList(asList.size());
            C0856u b = C0856u.m2718b();
            for (Class a : asList) {
                arrayList.add(b.mo3429a(a).getSchemaName());
            }
            bVar.mo3473a();
            bVar.f2929a.addAll(arrayList);
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("filterSchema", bVar.f2929a);
            bVar.f2930b = true;
            xVar.mo3457a(new C0866c(bundle), C60826bg.f164896a, this.f96164d);
        } catch (C0862a | UnsupportedOperationException e) {
            ((C59052c) ((C59052c) ((C59052c) f96161a.mo56226d()).mo56382g(e)).mo56372aa(52423)).mo56386p("Failed to add observer for clock context monitoring.");
        }
    }

    public C36928k(C36947a aVar, C60887da daVar, C36910d dVar, C36911e eVar) {
        Context context = aVar.f96211a;
        context.getClass();
        Executor executor = aVar.f96212b;
        executor.getClass();
        Executor executor2 = C0876f.f2948a;
        C2170i iVar = new C2170i();
        ((AppSearchManager) context.getSystemService(AppSearchManager.class)).createGlobalSearchSession(executor, Consumer.Wrapper.convert(new C0874d(iVar)));
        this.f96162b = iVar;
        this.f96163c = daVar;
        this.f96166f = eVar;
        this.f96165e = dVar;
    }
}
