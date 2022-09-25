package com.google.assistant.p3852aq.p3853a.p3854a.p3855a.p3856a.p3857a;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import androidx.p104d.p105a.C2169h;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.assistant.aq.a.a.a.a.a.c */
/* compiled from: PG */
final class C49706c implements C2166e {

    /* renamed from: a */
    final /* synthetic */ C49710g f128282a;

    public C49706c(C49710g gVar) {
        this.f128282a = gVar;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        this.f128282a.f128289c.f128286a = cVar;
        Message obtain = Message.obtain((Handler) null, 1);
        obtain.replyTo = this.f128282a.f128288b;
        C49710g gVar = this.f128282a;
        C46459k kVar = gVar.f128291e;
        Intent intent = new Intent();
        intent.setClassName("com.google.android.apps.nest.castauth", "com.google.android.apps.nest.castauth.contentservice.CastAuthContentService");
        C60870cx a = C2169h.m6027a(new C49707d(gVar, intent));
        C49705b bVar = new C49705b(gVar);
        Class<Exception> cls = Exception.class;
        C60870cx g = C60846c.m92878g(a, cls, C47810es.m84963c(bVar), gVar.f128290d);
        C49704a aVar = new C49704a(obtain);
        kVar.mo50457e(C60922j.m93044g(g, C47810es.m84963c(aVar), gVar.f128290d), 1, TimeUnit.SECONDS);
        return "Waiting for cast device id";
    }
}
