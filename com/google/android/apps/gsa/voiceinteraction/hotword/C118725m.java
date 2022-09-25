package com.google.android.apps.gsa.voiceinteraction.hotword;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioRecord;
import android.os.ParcelFileDescriptor;
import android.os.SharedMemory;
import android.service.voice.HotwordDetector;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.hotword.hotworddetectionservice.C74581j;
import com.google.android.apps.gsa.hotword.hotworddetectionservice.k;
import com.google.android.apps.gsa.nga.api.a.h;
import com.google.android.apps.gsa.nga.shared.p6339f.C81023a;
import com.google.android.apps.gsa.nga.shared.p6339f.C81066e;
import com.google.android.apps.gsa.nga.shared.p6339f.p6343d.C81060a;
import com.google.android.apps.gsa.shared.speech.hotword.HotwordResult;
import com.google.android.apps.gsa.shared.speech.speakerid.SpeakerIdModel;
import com.google.android.libraries.assistant.hotword.C18374k;
import com.google.android.libraries.assistant.hotword.C18375l;
import com.google.android.libraries.assistant.hotword.data.AutoValue_HotwordData;
import com.google.android.libraries.assistant.hotword.data.HotwordData;
import com.google.android.libraries.assistant.hotword.p1515a.C18327b;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import java.util.concurrent.atomic.AtomicBoolean;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.voiceinteraction.hotword.m */
/* compiled from: PG */
public final class C118725m extends C18375l {

    /* renamed from: a */
    public static final C58974d f331173a = C58974d.m91134h("TrustedHwDetManager");

    /* renamed from: b */
    public final Object f331174b = new Object();

    /* renamed from: c */
    HotwordDetector f331175c;

    /* renamed from: d */
    boolean f331176d;

    /* renamed from: e */
    public final Context f331177e;

    /* renamed from: f */
    boolean f331178f;

    /* renamed from: g */
    public boolean f331179g = false;

    /* renamed from: h */
    public AudioFormat f331180h;

    /* renamed from: i */
    k f331181i = null;

    /* renamed from: j */
    public String f331182j = BuildConfig.FLAVOR;

    /* renamed from: k */
    public final AtomicBoolean f331183k = new AtomicBoolean(false);

    /* renamed from: l */
    HotwordData f331184l = null;

    /* renamed from: m */
    final C74581j f331185m = new C118721i(this);

    /* renamed from: n */
    final HotwordDetector.Callback f331186n = new C118724l(this);

    /* renamed from: o */
    final C118715c f331187o;

    public C118725m(C118715c cVar, Context context, C60888db dbVar) {
        this.f331187o = cVar;
        this.f331177e = context;
        this.f52150q = dbVar;
    }

    /* renamed from: j */
    public static boolean m197081j(HotwordData hotwordData) {
        if (hotwordData != null) {
            SpeakerIdModel speakerIdModel = ((AutoValue_HotwordData) hotwordData).f52056b;
            return speakerIdModel != null && speakerIdModel.f253284b.mo56113h();
        }
        ((C58970a) ((C58970a) f331173a.mo56226d()).mo56372aa(34150)).mo56386p("Missing HotwordData.");
        return false;
    }

    /* renamed from: a */
    public final int mo23789a(C18327b bVar) {
        ((C58970a) ((C58970a) f331173a.mo56224b()).mo56372aa(34139)).mo56386p("Not supported for Trusted hotword detection.");
        return 7;
    }

    /* renamed from: b */
    public final ParcelFileDescriptor mo23790b() {
        return null;
    }

    /* renamed from: c */
    public final C60870cx mo23791c(int i, boolean z) {
        C58974d dVar = f331173a;
        ((C58970a) ((C58970a) dVar.mo56224b()).mo56372aa(34140)).mo56386p("#startMicHotword");
        boolean z2 = false;
        this.f331176d = false;
        this.f331180h = new AudioFormat.Builder().setChannelMask(m35779m(i)).setEncoding(2).setSampleRate(16000).build();
        if (this.f331175c == null || !this.f331179g) {
            ((C58970a) ((C58970a) dVar.mo56225c()).mo56372aa(34141)).mo56386p("No hotword detector or detector not initialized yet.");
            return C60856cj.m92900i(false);
        }
        this.f331183k.set(true);
        try {
            z2 = this.f331175c.startRecognition();
        } catch (Exception e) {
            ((C58970a) ((C58970a) ((C58970a) f331173a.mo56225c()).mo56382g(e)).mo56372aa(34142)).mo56386p("Error when calling startRecognition");
        }
        return C60856cj.m92900i(Boolean.valueOf(z2));
    }

    /* renamed from: d */
    public final void mo23792d() {
    }

    /* renamed from: e */
    public final void mo23793e(boolean z) {
        this.f331178f = z;
    }

    /* renamed from: f */
    public final synchronized void mo23794f(HotwordData hotwordData) {
        int i;
        boolean z;
        boolean z2;
        SharedMemory sharedMemory;
        synchronized (this.f331174b) {
            C58974d dVar = f331173a;
            ((C58970a) ((C58970a) dVar.mo56224b()).mo56372aa(34143)).mo56386p("#setHotwordData");
            synchronized (this.f331174b) {
                byte[] bArr = ((AutoValue_HotwordData) hotwordData).f52057c;
                i = 0;
                z = true;
                if (this.f331175c != null) {
                    HotwordData hotwordData2 = this.f331184l;
                    if (hotwordData2 != null) {
                        if (bArr == ((AutoValue_HotwordData) hotwordData2).f52057c) {
                            if (Objects.equals(((AutoValue_HotwordData) hotwordData2).f52056b, ((AutoValue_HotwordData) hotwordData).f52056b)) {
                                z2 = false;
                            }
                        }
                        z2 = true;
                    }
                }
                ((C58970a) ((C58970a) dVar.mo56224b()).mo56372aa(34151)).mo56386p("Hotword detector is null or current data is null, so updating.");
                z2 = true;
            }
            synchronized (this.f331174b) {
                if (!(this.f331175c == null || this.f331184l == null)) {
                    if (!z2) {
                        z = false;
                    }
                }
            }
            if (z) {
                boolean j = m197081j(hotwordData);
                byte[] bArr2 = ((AutoValue_HotwordData) hotwordData).f52057c;
                if (z2) {
                    sharedMemory = C118726n.m197094b(bArr2, ((AutoValue_HotwordData) hotwordData).f52056b);
                    i = bArr2.length;
                    this.f331182j = C58837ba.m90858g(((AutoValue_HotwordData) hotwordData).f52062h);
                } else {
                    sharedMemory = null;
                }
                HotwordDetector hotwordDetector = this.f331175c;
                if (hotwordDetector == null && sharedMemory != null) {
                    ((C58970a) ((C58970a) dVar.mo56224b()).mo56372aa(34147)).mo56386p("Requesting detector.");
                    this.f331175c = this.f331187o.mo103903a(C118726n.m197093a(i, ((AutoValue_HotwordData) hotwordData).f52056b, j), sharedMemory, this.f331186n);
                } else if (sharedMemory == null && hotwordDetector == null) {
                    ((C58970a) ((C58970a) dVar.mo56225c()).mo56372aa(34146)).mo56386p("Could not create hotword detector, missing shared memory.");
                } else {
                    ((C58970a) ((C58970a) dVar.mo56224b()).mo56372aa(34144)).mo56386p("Already created detector, updating the state information.");
                    try {
                        this.f331175c.updateState(C118726n.m197093a(bArr2.length, ((AutoValue_HotwordData) hotwordData).f52056b, j), sharedMemory);
                    } catch (Exception e) {
                        ((C58970a) ((C58970a) ((C58970a) f331173a.mo56225c()).mo56382g(e)).mo56372aa(34145)).mo56386p("Error when calling updateState");
                    }
                }
            }
            this.f331184l = hotwordData;
        }
    }

    /* renamed from: g */
    public final void mo23795g(C81066e eVar) {
        ((C58970a) ((C58970a) f331173a.mo56224b()).mo56372aa(34148)).mo56386p("#startClientHotword");
        this.f331176d = true;
        C81060a.m129009b(((C81023a) eVar).f222083b, h.r);
    }

    /* renamed from: h */
    public final void mo23796h() {
        HotwordDetector hotwordDetector = this.f331175c;
        if (hotwordDetector != null) {
            try {
                hotwordDetector.stopRecognition();
            } catch (Exception e) {
                ((C58970a) ((C58970a) ((C58970a) f331173a.mo56225c()).mo56382g(e)).mo56372aa(34149)).mo56386p("Error when calling stopRecognition");
            }
        }
        if (this.f331183k.getAndSet(false)) {
            this.f331187o.mo103905c((HotwordResult) null);
            this.f331187o.mo103904b();
        }
        k kVar = this.f331181i;
        if (kVar != null) {
            kVar.f();
        }
    }

    /* renamed from: i */
    public final boolean mo23879i() {
        AudioRecord audioRecord;
        k kVar = this.f331181i;
        if (kVar == null) {
            return false;
        }
        synchronized (kVar.a) {
            audioRecord = kVar.c;
        }
        if (audioRecord != null) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public final int mo23797k() {
        return this.f331175c == null ? 1 : 3;
    }

    /* renamed from: l */
    public final StringBuilder mo23798l() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("\n    initializationStatus=");
        sb.append(C18374k.m35778a(mo23797k()));
        sb.append("\n    hotwordRunning=");
        sb.append(this.f331183k.get());
        return sb;
    }
}
