package com.google.android.libraries.p10908a.p10911c.p10913b;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.clearcut.C143657j;
import com.google.android.gms.clearcut.C143658k;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.usagereporting.C146098j;
import com.google.android.gms.usagereporting.C146104p;
import com.google.protos.p4816ai.p4820d.p4821a.C63209a;
import com.google.protos.p4816ai.p4820d.p4821a.C63210b;
import com.google.protos.p4816ai.p4820d.p4821a.C63215g;
import com.google.protos.p4816ai.p4820d.p4821a.C63216h;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import p5462h.p5463a.C69531o;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5483m.C69764m;

/* renamed from: com.google.android.libraries.a.c.b.k */
/* compiled from: PG */
public final class C146635k implements C146641q {

    /* renamed from: a */
    public static final C146632h f396028a = new C146632h();

    /* renamed from: b */
    public static C146641q f396029b;

    /* renamed from: c */
    private static final Set f396030c = C69531o.m100939p(new String[]{"com.google.android.deskclock", "com.google.android.libraries.androidatgoogle.unbrandeddemo", "com.google.android.settings.intelligence"});

    /* renamed from: d */
    private final C143658k f396031d;

    /* renamed from: e */
    private final Context f396032e;

    /* renamed from: f */
    private AtomicBoolean f396033f = new AtomicBoolean(true);

    /* renamed from: g */
    private final boolean f396034g;

    /* renamed from: h */
    private final C146098j f396035h;

    public C146635k(Context context) {
        C69664n.m101061g(context, "context");
        C143658k f = C143658k.m233375f(context.getApplicationContext(), "ANDROID_AT_GOOGLE");
        C146098j b = C146104p.m237971b(context.getApplicationContext());
        C69664n.m101061g(context, "context");
        this.f396031d = f;
        this.f396035h = b;
        Context applicationContext = context.getApplicationContext();
        C69664n.m101060f(applicationContext, "context.applicationContext");
        this.f396032e = applicationContext;
        boolean z = true;
        Set set = f396030c;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator it = set.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String packageName = this.f396032e.getPackageName();
                C69664n.m101060f(packageName, "applicationContext.packageName");
                if (C69764m.m101205y(packageName, (String) it.next(), true)) {
                    break;
                }
            }
        }
        z = false;
        this.f396034g = z;
    }

    /* renamed from: b */
    public static final void m238867b(C146635k kVar, C63216h hVar) {
        int a = C63215g.m96207a(hVar.f170789b);
        Log.d("AppWidgetLogger", "Logging Widget event to Clearcut: ".concat((a == 0 || a == 1) ? "UNKNOWN" : a != 2 ? a != 3 ? a != 4 ? a != 5 ? "WIDGET_RESIZED" : "WIDGET_UPDATED" : "WIDGET_REMOVED" : "WIDGET_ADDED" : "WIDGET_TAPPED"));
        C63209a aVar = (C63209a) C63210b.f170777e.createBuilder();
        String packageName = kVar.f396032e.getPackageName();
        aVar.copyOnWrite();
        C63210b bVar = (C63210b) aVar.instance;
        packageName.getClass();
        bVar.f170779a = 1 | bVar.f170779a;
        bVar.f170782d = packageName;
        aVar.copyOnWrite();
        C63210b bVar2 = (C63210b) aVar.instance;
        hVar.getClass();
        bVar2.f170781c = hVar;
        bVar2.f170780b = 2;
        byte[] byteArray = ((C63210b) aVar.build()).toByteArray();
        C69664n.m101060f(byteArray, "newBuilder()\n          .…\n          .toByteArray()");
        new C143657j(kVar.f396031d, byteArray).mo118992a();
    }

    /* renamed from: a */
    public final void mo123422a(C63216h hVar) {
        C69664n.m101061g(hVar, "event");
        if (this.f396033f.get()) {
            if (this.f396034g) {
                C146006ab a = this.f396035h.mo122609a();
                a.mo122499r(new C146633i(hVar, this));
                a.mo122498q(C146634j.f396027a);
                return;
            }
            m238867b(this, hVar);
        }
    }
}
