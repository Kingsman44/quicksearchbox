package com.google.android.apps.gsa.staticplugins.bisto.p7510o;

import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import com.google.android.apps.gsa.search.shared.media.PlaybackStatus;
import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.shared.util.p7159c.C90926bw;
import com.google.android.apps.gsa.staticplugins.bisto.p7457a.C94639c;
import com.google.android.apps.gsa.staticplugins.bisto.p7457a.C94640d;
import com.google.android.apps.gsa.staticplugins.bisto.p7457a.C94641e;
import com.google.android.apps.gsa.staticplugins.bisto.p7479ae.C95064aa;
import com.google.android.apps.gsa.staticplugins.bisto.p7479ae.C95127t;
import com.google.android.apps.gsa.staticplugins.bisto.p7485c.C95227c;
import com.google.android.apps.gsa.staticplugins.bisto.p7485c.C95228d;
import com.google.android.apps.gsa.staticplugins.bisto.p7485c.C95239o;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95294af;
import com.google.android.apps.gsa.staticplugins.bisto.p7490h.C95455a;
import com.google.android.apps.gsa.staticplugins.bisto.p7514p.C95832d;
import com.google.android.apps.gsa.staticplugins.bisto.p7533x.C96628d;
import com.google.android.apps.gsa.staticplugins.bisto.util.StreamedMessageContentProvider;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9402f.C124606a;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.gsa.util.C23335a;
import com.google.android.p10712d.C142359ck;
import com.google.android.p10712d.C142379dd;
import com.google.android.p10712d.C142381df;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.o.m */
/* compiled from: PG */
public abstract class C95814m implements C95803ci {

    /* renamed from: a */
    public static final C59071e f268272a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.o.m");

    /* renamed from: b */
    public final C22871g f268273b;

    /* renamed from: c */
    public final AtomicReference f268274c = new AtomicReference();

    /* renamed from: d */
    public volatile int f268275d = 0;

    /* renamed from: e */
    private final C95064aa f268276e;

    /* renamed from: f */
    private final Context f268277f;

    /* renamed from: g */
    private final C90926bw f268278g;

    /* renamed from: h */
    private final List f268279h = new ArrayList();

    /* renamed from: i */
    private final C95239o f268280i;

    /* renamed from: j */
    private final C22871g f268281j;

    /* renamed from: k */
    private final C96628d f268282k;

    /* renamed from: l */
    private final C89656k f268283l;

    /* renamed from: m */
    private C60870cx f268284m;

    /* renamed from: n */
    private C22869e f268285n;

    /* renamed from: o */
    private final C124606a f268286o;

    public C95814m(Context context, C95064aa aaVar, C95239o oVar, C22871g gVar, C22871g gVar2, C90926bw bwVar, C96628d dVar, C89656k kVar, C124606a aVar) {
        this.f268277f = context;
        this.f268276e = aaVar;
        this.f268281j = gVar;
        this.f268273b = gVar2;
        this.f268278g = bwVar;
        this.f268282k = dVar;
        this.f268280i = oVar;
        this.f268283l = kVar;
        this.f268286o = aVar;
    }

    /* renamed from: a */
    public final int mo89688a() {
        return this.f268275d;
    }

    /* renamed from: b */
    public final Uri mo89782b() {
        return (Uri) this.f268274c.get();
    }

    /* renamed from: e */
    public final void mo89783e() {
        C60870cx cxVar = this.f268284m;
        if (cxVar != null) {
            cxVar.cancel(false);
            this.f268284m = null;
        }
    }

    /* renamed from: g */
    public final void mo89713g() {
        C58976aa aaVar = C58975e.f156826a;
        this.f268276e.mo88988c();
        mo89788p();
    }

    /* renamed from: h */
    public void mo89716h() {
        C58976aa aaVar = C58975e.f156826a;
        mo89783e();
        this.f268285n = null;
        mo89786m(new C95807f(this, (Uri) this.f268274c.getAndSet((Object) null)));
    }

    /* renamed from: i */
    public final void mo89784i(Uri uri) {
        C58976aa aaVar = C58975e.f156826a;
        if (uri != null) {
            try {
                C23335a.m43766c(this.f268277f.getContentResolver(), uri);
            } catch (IOException e) {
                C59104x c = f268272a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "DefVoiceInputHandler");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(15155)).mo56389s("cleanUpUri: failed to delete: %s", uri);
            }
        }
        for (Uri uri2 : this.f268279h) {
            try {
                C23335a.m43766c(this.f268277f.getContentResolver(), uri2);
            } catch (IOException e2) {
                C59104x c2 = f268272a.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "DefVoiceInputHandler");
                ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e2)).mo56372aa(15154)).mo56389s("cleanUpUri: failed to delete: %s", uri2);
            }
        }
        this.f268279h.clear();
    }

    /* renamed from: j */
    public final void mo89714j(C142379dd ddVar) {
    }

    /* renamed from: k */
    public final void mo89715k(C142381df dfVar) {
        C59104x c = f268272a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "DefVoiceInputHandler");
        ((C59052c) ((C59052c) c).mo56372aa(15156)).mo56387q("Dropped some voice data, bytes dropped: %d", dfVar.f386351a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final void mo89785l(Uri uri, byte[] bArr, int i, int i2) {
        if (uri != null) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("audio_data_key", Arrays.copyOfRange(bArr, i, i2 + i));
            try {
                if (this.f268277f.getContentResolver().update(uri, contentValues, (String) null, (String[]) null) == -1) {
                    C59104x c = f268272a.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "DefVoiceInputHandler");
                    ((C59052c) ((C59052c) c).mo56372aa(15160)).mo56386p("Failed to finishing sending audio data. Closing mic.");
                    mo88997c();
                }
            } catch (NullPointerException e) {
                C59104x c2 = f268272a.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "DefVoiceInputHandler");
                ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e)).mo56372aa(15161)).mo56386p("Failed to update media store. ContentResolver.update() returns null.");
                mo88997c();
            }
        } else {
            C59104x c3 = f268272a.mo56225c();
            c3.mo56378ag(C58975e.f156826a, "DefVoiceInputHandler");
            ((C59052c) ((C59052c) c3).mo56372aa(15159)).mo56386p("Receiving audio data when uri not initialized.");
            mo88997c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final void mo89786m(C22869e eVar) {
        C90875ai.m148465b(C95811j.f268268a, this.f268278g.mo85235a(new C95810i(this, eVar)), this.f268273b, "bisto-mic").mo85223a(C95812k.f268269a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final void mo89787n() {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f268275d != 1) {
            C59104x c = f268272a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "DefVoiceInputHandler");
            ((C59052c) ((C59052c) c).mo56372aa(15168)).mo56386p("Wrong state stopCache");
            return;
        }
        if (this.f268276e.mo88996l()) {
            C59104x c2 = f268272a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "DefVoiceInputHandler");
            ((C59052c) ((C59052c) c2).mo56372aa(15167)).mo56386p("Stop cache when user is talking to GSA.");
        }
        mo89716h();
        this.f268275d = 0;
        if (!mo89695r()) {
            this.f268276e.mo88992h();
        }
    }

    /* renamed from: o */
    public void mo89717o() {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f268275d != 2) {
            C59104x c = f268272a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "DefVoiceInputHandler");
            ((C59052c) ((C59052c) c).mo56372aa(15170)).mo56386p("wrong state stopInput");
            return;
        }
        C22869e eVar = this.f268285n;
        if (eVar != null) {
            eVar.run();
            this.f268285n = null;
        }
        this.f268275d = 0;
        mo89716h();
        this.f268276e.mo88991g();
    }

    /* renamed from: p */
    public final void mo89788p() {
        if (this.f268275d == 1) {
            mo89787n();
        } else if (this.f268275d == 2) {
            mo89717o();
        }
    }

    /* renamed from: q */
    public final /* synthetic */ boolean mo89694q(C142359ck ckVar) {
        return true;
    }

    /* renamed from: r */
    public final boolean mo89695r() {
        return this.f268276e.mo88993i() || this.f268276e.mo88994j();
    }

    /* renamed from: s */
    public final boolean mo89789s() {
        C94640d a = this.f268280i.mo89152a();
        return a != null && a.mo88577k();
    }

    /* renamed from: t */
    public final boolean mo89696t() {
        return this.f268275d == 2;
    }

    /* renamed from: u */
    public boolean mo89718u() {
        C58976aa aaVar = C58975e.f156826a;
        int i = StreamedMessageContentProvider.f269807b;
        StreamedMessageContentProvider.f269807b = i + 1;
        Uri parse = Uri.parse("content://com.google.android.apps.gsa.staticplugins.bisto.util.StreamedMessageContentProvider/" + i);
        Uri uri = (Uri) this.f268274c.getAndSet(parse);
        if (uri != null) {
            this.f268279h.add(uri);
        }
        try {
            ContentValues contentValues = new ContentValues();
            if (this.f268283l.mo83553h("bistoRecordAudio")) {
                try {
                    contentValues.put("locally_record_audio_content_key", true);
                    contentValues.put("external_dir_content_key", this.f268286o.mo106557a().getPath());
                } catch (IOException e) {
                    C59104x c = f268272a.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "DefVoiceInputHandler");
                    ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(15175)).mo56386p("Failed to get external dir");
                }
            } else {
                contentValues.put("locally_record_audio_content_key", false);
            }
            try {
                if (this.f268277f.getContentResolver().insert(parse, contentValues) == null) {
                    C59104x c2 = f268272a.mo56225c();
                    c2.mo56378ag(C58975e.f156826a, "DefVoiceInputHandler");
                    ((C59052c) ((C59052c) c2).mo56372aa(15172)).mo56389s("Failed to create uri %s", parse);
                    C59104x c3 = f268272a.mo56225c();
                    c3.mo56378ag(C58975e.f156826a, "DefVoiceInputHandler");
                    ((C59052c) ((C59052c) c3).mo56372aa(15176)).mo56386p("Fail to start cache, cannot initialize uri for voice query");
                    return false;
                }
                this.f268282k.mo90294g("last_audio_file_uri", parse.toString());
                this.f268284m = this.f268281j.mo28208h("clean-up", TimeUnit.SECONDS.toMillis(30), new C95808g(this, (Uri) this.f268274c.get()));
                this.f268276e.mo88987b();
                this.f268275d = 1;
                return true;
            } catch (IllegalArgumentException e2) {
                C59104x c4 = f268272a.mo56225c();
                c4.mo56378ag(C58975e.f156826a, "DefVoiceInputHandler");
                ((C59052c) ((C59052c) ((C59052c) c4).mo56382g(e2)).mo56372aa(15173)).mo56389s("Failed to create uri %s", parse);
            }
        } catch (NullPointerException unused) {
            C59104x c5 = f268272a.mo56225c();
            c5.mo56378ag(C58975e.f156826a, "DefVoiceInputHandler");
            ((C59052c) ((C59052c) c5).mo56372aa(15174)).mo56386p("Failed to update media store. ContentResolver.insert() returns null.");
        }
    }

    /* renamed from: v */
    public final void mo89790v(C95455a aVar, C95127t tVar, PlaybackStatus playbackStatus, C95832d dVar) {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f268275d != 1) {
            C59104x c = f268272a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "DefVoiceInputHandler");
            ((C59052c) ((C59052c) c).mo56372aa(15165)).mo56386p("wrong state startInput");
        } else if (((Uri) this.f268274c.get()) == null) {
            C59104x c2 = f268272a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "DefVoiceInputHandler");
            ((C59052c) ((C59052c) c2).mo56372aa(15164)).mo56386p("Wrong state uri not initialized.");
        } else {
            if (mo89789s()) {
                C95239o oVar = this.f268280i;
                C94641e b = oVar.mo89153b();
                C95228d dVar2 = null;
                if (b != null && b.mo88596o()) {
                    oVar.mo89161i((C95294af) null);
                    boolean z = oVar.f266450d.f266443a;
                    AtomicBoolean atomicBoolean = new AtomicBoolean();
                    AtomicBoolean atomicBoolean2 = new AtomicBoolean();
                    AtomicBoolean atomicBoolean3 = new AtomicBoolean();
                    C94639c a = b.mo88582a(aVar, this, new C95227c(atomicBoolean));
                    a.getClass();
                    if (a.f264710a) {
                        atomicBoolean3.set(a.f264711b);
                        oVar.f266450d.mo89148a(true);
                    } else {
                        oVar.mo89156d();
                    }
                    C95228d dVar3 = new C95228d(oVar, atomicBoolean2, z, a);
                    if (a.f264710a) {
                        dVar2 = dVar3;
                    }
                }
                if (dVar2 == null) {
                    C59104x c3 = f268272a.mo56225c();
                    c3.mo56378ag(C58975e.f156826a, "DefVoiceInputHandler");
                    ((C59052c) ((C59052c) c3).mo56372aa(15163)).mo56386p("Fail to take action on announcement.");
                    mo89788p();
                    return;
                }
                this.f268285n = dVar2;
            } else {
                this.f268276e.mo88989e(aVar, new C95813l(this, tVar), playbackStatus, dVar);
            }
            this.f268275d = 2;
        }
    }
}
