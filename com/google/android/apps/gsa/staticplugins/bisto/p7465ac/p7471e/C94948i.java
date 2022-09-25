package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7471e;

import android.content.ContentUris;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7474h.C95002t;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7474h.C95005w;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7474h.C95007y;
import com.google.android.apps.gsa.staticplugins.bisto.p7490h.C95455a;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3739a.p3740a.C48090bx;
import com.google.assistant.p3739a.p3740a.C48098ce;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.e.i */
/* compiled from: PG */
public final class C94948i {

    /* renamed from: a */
    public static final C59071e f265601a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.ac.e.i");

    /* renamed from: b */
    public final C95005w f265602b;

    /* renamed from: c */
    public final C21370a f265603c;

    /* renamed from: d */
    public final C94942c f265604d;

    /* renamed from: e */
    public final AtomicBoolean f265605e = new AtomicBoolean(false);

    /* renamed from: f */
    public final AtomicBoolean f265606f = new AtomicBoolean(false);

    public C94948i(C21370a aVar, C95005w wVar, C69464a aVar2) {
        this.f265603c = aVar;
        this.f265602b = wVar;
        this.f265604d = (C94942c) aVar2.mo17428b();
    }

    /* renamed from: a */
    public final Uri mo88856a() {
        if (this.f265605e.get() && !this.f265606f.get()) {
            C59104x c = f265601a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "VoiceInputHandler");
            ((C59052c) ((C59052c) c).mo56372aa(17668)).mo56386p("Input was started before");
            mo88857b();
        }
        C59104x b = f265601a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "VoiceInputHandler");
        ((C59052c) ((C59052c) b).mo56372aa(17667)).mo56386p("Delegating to audio handler");
        C94942c cVar = this.f265604d;
        C59104x b2 = C94942c.f265580a.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "AudioHandler");
        ((C59052c) ((C59052c) b2).mo56372aa(17650)).mo56386p("initializeAudio");
        if (!(cVar.f265587g == null && cVar.f265586f == null)) {
            cVar.mo88852a();
        }
        Uri uri = null;
        try {
            ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
            cVar.f265586f = createPipe;
            cVar.f265587g = new ParcelFileDescriptor.AutoCloseOutputStream(createPipe[1]);
            int detachFd = createPipe[0].detachFd();
            if (detachFd == -1) {
                cVar.mo88852a();
            } else {
                uri = ContentUris.withAppendedId(C94942c.f265581b, (long) detachFd);
            }
        } catch (IOException e) {
            C59104x c2 = C94942c.f265580a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "AudioHandler");
            ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e)).mo56372aa(17652)).mo56386p("Unable to create a parcel file descriptor pipe");
        }
        if (uri != null) {
            cVar.f265585e = cVar.f265583c.mo29164d(new C94940a(cVar), 30, TimeUnit.SECONDS);
        }
        return uri;
    }

    /* renamed from: b */
    public final void mo88857b() {
        C58976aa aaVar = C58975e.f156826a;
        this.f265602b.mo88910a();
        this.f265604d.mo88853b();
    }

    /* renamed from: c */
    public final void mo88858c(C95007y yVar, boolean z, boolean z2, C124548d dVar, int i, C48090bx bxVar, boolean z3, C58833ax axVar, C94960u uVar) {
        C58976aa aaVar = C58975e.f156826a;
        this.f265605e.get();
        Uri a = mo88856a();
        if (a == null) {
            C95007y yVar2 = yVar;
            yVar.mo88815f(C48098ce.QUERY_FAILED);
            return;
        }
        C95005w wVar = this.f265602b;
        wVar.f265807a.execute(new C95002t(wVar, new C95455a(a, z, this.f265603c.mo26870b()), yVar, dVar, z2, i, bxVar, z3, axVar, uVar));
        this.f265605e.set(true);
    }
}
