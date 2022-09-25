package com.google.android.libraries.search.silk.p3162a.p3171i;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.core.content.p090a.C1850e;
import com.bumptech.glide.p282c.p283a.C5528f;
import com.google.android.libraries.silk.p3205a.p3224m.C41727a;
import com.google.apps.tiktok.media.C47449e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4308m.C56741b;
import java.net.URISyntaxException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.libraries.search.silk.a.i.e */
/* compiled from: PG */
public final class C40603e implements C41727a {

    /* renamed from: a */
    public static final C59071e f106562a = C59071e.m91332i("com.google.android.libraries.search.silk.a.i.e");

    /* renamed from: b */
    public final AtomicInteger f106563b = new AtomicInteger(0);

    /* renamed from: c */
    public final Context f106564c;

    /* renamed from: d */
    public final ScheduledExecutorService f106565d;

    /* renamed from: e */
    private final C47449e f106566e;

    public C40603e(Context context, C47449e eVar, ScheduledExecutorService scheduledExecutorService) {
        this.f106564c = context;
        this.f106566e = eVar;
        this.f106565d = scheduledExecutorService;
    }

    /* renamed from: a */
    public final C60870cx mo42542a(C56741b bVar) {
        C59071e eVar = f106562a;
        ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(53367)).mo56389s("#installShortcut: %s", bVar);
        if (C1850e.m5069b(this.f106564c)) {
            try {
                Intent parseUri = Intent.parseUri(bVar.f151435c, 0);
                C60870cx b = C5528f.m14300b(C5528f.m14299a(this.f106566e.mo51286a().mo11864b().mo12448j(bVar.f151436d)));
                C40600b bVar2 = new C40600b(this, bVar, parseUri);
                return C60922j.m93045h(b, C47810es.m84966f(bVar2), this.f106565d);
            } catch (URISyntaxException e) {
                ((C59052c) ((C59052c) ((C59052c) f106562a.mo56225c()).mo56382g(e)).mo56372aa(53368)).mo56386p("Could not parse Intent");
                return C60856cj.m92899h(e);
            }
        } else {
            ((C59052c) ((C59052c) eVar.mo56225c()).mo56372aa(53369)).mo56386p("RequestPinShortcut is not supported!");
            return C60856cj.m92899h(new UnsupportedOperationException("RequestPinShortcut is not supported!"));
        }
    }

    /* renamed from: b */
    public final void mo42543b(BroadcastReceiver broadcastReceiver) {
        try {
            this.f106564c.unregisterReceiver(broadcastReceiver);
        } catch (Exception e) {
            ((C59052c) ((C59052c) ((C59052c) f106562a.mo56226d()).mo56382g(e)).mo56372aa(53372)).mo56386p("Broadcast Receiver is already unregistered");
        }
    }
}
