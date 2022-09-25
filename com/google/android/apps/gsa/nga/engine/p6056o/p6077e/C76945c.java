package com.google.android.apps.gsa.nga.engine.p6056o.p6077e;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.nga.engine.ag.af;
import com.google.android.apps.gsa.nga.engine.p5964av.C75050a;
import com.google.android.apps.gsa.nga.engine.p6056o.C76470a;
import com.google.android.apps.gsa.nga.shared.p6361q.C81449a;
import com.google.android.apps.gsa.shared.p7066m.C89988b;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.libraries.assistant.p1619u.p1620a.C19447a;
import com.google.android.libraries.assistant.p1619u.p1620a.C19448b;
import com.google.android.libraries.assistant.p1619u.p1620a.C19450d;
import com.google.android.libraries.assistant.p1619u.p1620a.C19451e;
import com.google.android.libraries.assistant.p1619u.p1620a.C19452f;
import com.google.android.libraries.assistant.p1619u.p1620a.C19453g;
import com.google.android.libraries.assistant.p1619u.p1621b.C19454a;
import com.google.android.libraries.assistant.p1619u.p1621b.C19456c;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.frameworks.client.data.android.p4634b.C61387f;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p5488io.grpc.C70286co;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70851i;
import p5488io.grpc.C70888j;
import p5488io.grpc.binder.C70175a;
import p5488io.grpc.binder.C70235o;
import p5488io.grpc.p5531h.p5532a.C70850d;
import p5488io.grpc.p5533i.C70864c;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.c */
/* compiled from: PG */
public final class C76945c implements C76470a {

    /* renamed from: a */
    private static final C58974d f212436a = C58974d.m91136j();

    /* renamed from: b */
    private final Context f212437b;

    /* renamed from: c */
    private final af f212438c;

    /* renamed from: d */
    private final C81449a f212439d;

    /* renamed from: e */
    private final C91142g f212440e;

    /* renamed from: f */
    private final PackageManager f212441f;

    /* renamed from: g */
    private final C75050a f212442g;

    /* renamed from: h */
    private final C76796az f212443h;

    /* renamed from: i */
    private final C19456c f212444i;

    public C76945c(Context context, af afVar, C81449a aVar, C76796az azVar, C91142g gVar, C19456c cVar, PackageManager packageManager, C75050a aVar2) {
        this.f212437b = context;
        this.f212438c = afVar;
        this.f212439d = aVar;
        this.f212443h = azVar;
        this.f212440e = gVar;
        this.f212444i = cVar;
        this.f212441f = packageManager;
        this.f212442g = aVar2;
    }

    /* renamed from: g */
    private final boolean m123595g(Intent intent, boolean z, int i, String str) {
        ResolveInfo resolveActivity;
        intent.addFlags(268435456);
        if (!z) {
            intent.addFlags(32768);
        }
        if (this.f212440e.mo85405j(C90126fx.f251778pi) && this.f212442g.mo71417a().mo71467m().orElse(e.a) == e.be) {
            intent.putExtra("EXTRA_DISMISS_KEYGUARD", false);
        }
        ((C58970a) f212436a.mo56223a(Level.INFO).mo56372aa(3652)).mo56359L("Starting intent: %s, data=%s, extras=%s", intent, intent.getData(), intent.getExtras());
        if (intent.resolveActivity(this.f212443h.f212195a) == null) {
            return false;
        }
        int i2 = i - 1;
        if (i2 == 0) {
            C58485gu d = C89988b.m146551d(this.f212440e.mo85403h(C90126fx.f251574lQ));
            if (!d.isEmpty()) {
                String str2 = intent.getPackage();
                if (!(str2 != null || (resolveActivity = this.f212441f.resolveActivity(intent, 65536)) == null || resolveActivity.activityInfo == null)) {
                    str2 = resolveActivity.activityInfo.packageName;
                }
                if (d.contains(str2)) {
                    intent.putExtra("utterance_id", str);
                    this.f212439d.mo74743d(intent);
                }
            }
            this.f212439d.mo74741b(intent);
        } else if (i2 == 1) {
            intent.putExtra("utterance_id", str);
            this.f212439d.mo74743d(intent);
        } else if (i2 != 2) {
            C19456c cVar = this.f212444i;
            C19454a aVar = cVar.f54391e;
            C70235o oVar = cVar.f54388b;
            C61387f a = C61387f.m93916a((Application) aVar.f54385a, C70175a.m102188c(intent.getPackage(), "com.google.android.libraries.assistant.trustedintent.dagger.TrustedIntentService"));
            a.mo57965e(aVar.f54386b);
            a.f165991d.mo62290e(aVar.f54386b);
            a.f165991d.mo62294i(aVar.f54386b);
            a.mo57966f(oVar);
            a.f165991d.mo62291f(5, TimeUnit.SECONDS);
            C70286co c = a.mo57963c();
            C19447a aVar2 = (C19447a) C19448b.f54378c.createBuilder();
            String uri = intent.toUri(0);
            aVar2.copyOnWrite();
            C19448b bVar = (C19448b) aVar2.instance;
            uri.getClass();
            bVar.f54380a |= 1;
            bVar.f54381b = uri;
            C19448b bVar2 = (C19448b) aVar2.build();
            C19452f fVar = (C19452f) ((C19452f) C70864c.m103731e(new C19451e(), c, C70851i.f189015a)).mo62575n(1000, TimeUnit.MILLISECONDS);
            C70888j jVar = fVar.f189039a;
            C70338di diVar = C19453g.f54384a;
            if (diVar == null) {
                synchronized (C19453g.class) {
                    diVar = C19453g.f54384a;
                    if (diVar == null) {
                        C70335df d2 = C70338di.m102603d();
                        d2.f187487c = C70337dh.UNARY;
                        d2.f187488d = C70338di.m102602c("java.com.google.android.libraries.assistant.trustedintent.TrustedIntent", "Send");
                        d2.f187489e = true;
                        d2.f187485a = C70850d.m103697c(C19448b.f54378c);
                        d2.f187486b = C70850d.m103697c(C19450d.f54382a);
                        diVar = d2.mo62040a();
                        C19453g.f54384a = diVar;
                    }
                }
            }
            C60856cj.m92911t(C70876o.m103760a(jVar.mo39510a(diVar, fVar.f189040b), bVar2), cVar.f54390d, cVar.f54389c);
        } else {
            intent.putExtra("utterance_id", str);
            this.f212439d.mo74742c(intent);
        }
        return true;
    }

    /* renamed from: a */
    public final void mo72200a(Intent intent) {
        this.f212437b.sendBroadcast(intent);
    }

    /* renamed from: b */
    public final boolean mo72201b(Intent intent) {
        return m123595g(intent, true, 1, BuildConfig.FLAVOR);
    }

    /* renamed from: c */
    public final boolean mo72202c(Intent intent) {
        return mo72205f(intent, 1);
    }

    /* renamed from: d */
    public final boolean mo72203d() {
        Optional findFirst = Collection.EL.stream(this.f212438c.d("WhatsApp")).filter(C76761a.f212133a).map(C76797b.f212196a).findFirst();
        if (findFirst.isEmpty()) {
            ((C58970a) f212436a.mo56223a(Level.WARNING).mo56372aa(3651)).mo56389s("no match opening app %s", "WhatsApp");
            return false;
        }
        Intent intent = (Intent) findFirst.get();
        ((C58970a) f212436a.mo56223a(Level.INFO).mo56372aa(3650)).mo56389s("Intent package: %s", intent.getPackage());
        return mo72205f(intent, 1);
    }

    /* renamed from: e */
    public final boolean mo72204e(Intent intent, int i, String str) {
        return m123595g(intent, true, i, str);
    }

    /* renamed from: f */
    public final boolean mo72205f(Intent intent, int i) {
        return m123595g(intent, false, i, BuildConfig.FLAVOR);
    }
}
