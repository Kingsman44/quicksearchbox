package com.google.android.libraries.assistant.hotword;

import android.content.Context;
import android.media.AudioFormat;
import android.os.ParcelFileDescriptor;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.api.a.h;
import com.google.android.apps.gsa.nga.shared.p6339f.C81023a;
import com.google.android.apps.gsa.nga.shared.p6339f.C81066e;
import com.google.android.apps.gsa.nga.shared.p6339f.p6343d.C81060a;
import com.google.android.apps.gsa.nga.shared.p6407v.C83305i;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82548jg;
import com.google.android.apps.gsa.shared.speech.speakerid.SpeakerIdModel;
import com.google.android.apps.gsa.shared.util.p7158b.C90744a;
import com.google.android.apps.gsa.voiceinteraction.hotword.C118715c;
import com.google.android.libraries.assistant.hotword.data.AutoValue_HotwordData;
import com.google.android.libraries.assistant.hotword.data.HotwordData;
import com.google.android.libraries.assistant.hotword.p1515a.C18326a;
import com.google.android.libraries.assistant.hotword.p1515a.C18327b;
import com.google.android.libraries.assistant.soda.C19242ae;
import com.google.android.libraries.assistant.soda.C19245ah;
import com.google.android.libraries.assistant.soda.C19347o;
import com.google.android.libraries.assistant.soda.Soda;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2878f.C37188a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.android.libraries.search.p2904c.C37357av;
import com.google.android.libraries.search.p2904c.C37360ay;
import com.google.android.libraries.search.p2904c.C37461cj;
import com.google.android.libraries.search.p2904c.C37462ck;
import com.google.android.libraries.search.p2904c.C37466co;
import com.google.android.libraries.search.p2904c.C37467cp;
import com.google.android.libraries.search.p2904c.C37468cq;
import com.google.android.libraries.search.p2904c.C37469cr;
import com.google.android.libraries.search.p2904c.C37500dg;
import com.google.android.libraries.search.p2904c.C37659hf;
import com.google.android.libraries.search.p2904c.C37660hg;
import com.google.android.libraries.search.p2904c.C37661hh;
import com.google.android.libraries.search.p2904c.C37662hi;
import com.google.android.libraries.search.p2904c.p2927f.C37587a;
import com.google.android.libraries.search.p2904c.p2933j.C37705a;
import com.google.android.libraries.search.p2904c.p2933j.C37773c;
import com.google.android.libraries.search.p2904c.p2933j.p2934a.p2937c.C37767j;
import com.google.android.libraries.search.p2904c.p2977w.p2978a.C38137o;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4552o.C60687zc;
import com.google.common.p4552o.C60688zd;
import com.google.common.util.C60790c;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60895di;
import com.google.common.util.concurrent.C60922j;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C63088z;
import com.google.speech.p5218j.C66966gb;
import com.google.speech.p5218j.C66967gc;
import com.google.speech.p5218j.C66968gd;
import com.google.speech.p5218j.C66969ge;
import com.google.speech.p5218j.C66976gl;
import com.google.speech.p5218j.C66977gm;
import com.google.speech.p5218j.C66980gp;
import com.google.speech.p5218j.C66981gq;
import com.google.speech.p5218j.C66984gt;
import com.google.speech.p5218j.C66985gu;
import com.google.speech.p5218j.C66998hg;
import com.google.speech.p5218j.C66999hh;
import com.google.speech.p5218j.C67126m;
import com.google.speech.p5218j.C67129mc;
import com.google.speech.p5218j.C67131me;
import com.google.speech.p5218j.C67150mx;
import com.google.speech.p5218j.C67152mz;
import com.google.speech.p5218j.C67153n;
import com.google.speech.p5218j.C67172q;
import com.google.speech.p5218j.C67174s;
import com.google.speech.p5218j.C67175t;
import com.google.speech.p5218j.p5219a.C66742i;
import com.google.speech.p5218j.p5219a.C66743j;
import com.google.speech.p5218j.p5219a.C66744k;
import com.google.speech.p5218j.p5219a.C66745l;
import com.google.speech.p5218j.p5219a.C66751r;
import com.google.speech.p5218j.p5219a.C66752s;
import com.p278b.p279a.C5494c;
import com.p278b.p279a.C5496e;
import dagger.C68214a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.libraries.assistant.hotword.al */
/* compiled from: PG */
public final class C18339al extends C18375l {

    /* renamed from: a */
    public static final C58974d f51996a = C58974d.m91134h("SodaHwDetectionManager");

    /* renamed from: v */
    private static final SimpleDateFormat f51997v = new SimpleDateFormat("_MM-dd_HH-mm-ss");

    /* renamed from: A */
    private final C68214a f51998A;

    /* renamed from: B */
    private final AtomicBoolean f51999B = new AtomicBoolean(false);

    /* renamed from: C */
    private InputStream f52000C;

    /* renamed from: D */
    private InputStream f52001D;

    /* renamed from: b */
    HotwordData f52002b = null;

    /* renamed from: c */
    final C37215b f52003c;

    /* renamed from: d */
    final C60887da f52004d = C60895di.m92995a(Executors.newSingleThreadExecutor());

    /* renamed from: e */
    final Executor f52005e;

    /* renamed from: f */
    public final Object f52006f = new Object();

    /* renamed from: g */
    ParcelFileDescriptor f52007g;

    /* renamed from: h */
    final C18370g f52008h;

    /* renamed from: i */
    Soda f52009i;

    /* renamed from: j */
    C18328aa f52010j;

    /* renamed from: k */
    public C60870cx f52011k;

    /* renamed from: l */
    final AtomicBoolean f52012l = new AtomicBoolean(false);

    /* renamed from: m */
    public final Object f52013m = new Object();

    /* renamed from: n */
    boolean f52014n = false;

    /* renamed from: o */
    public boolean f52015o = false;

    /* renamed from: r */
    boolean f52016r = false;

    /* renamed from: s */
    public final C18340am f52017s;

    /* renamed from: t */
    public final C118715c f52018t;

    /* renamed from: u */
    final C18332ae f52019u = new C18332ae(this);

    /* renamed from: w */
    private boolean f52020w = false;

    /* renamed from: x */
    private String f52021x = BuildConfig.FLAVOR;

    /* renamed from: y */
    private final Context f52022y;

    /* renamed from: z */
    private final C68214a f52023z;

    public C18339al(C60888db dbVar, Executor executor, C118715c cVar, C18370g gVar, Context context, C37215b bVar, C68214a aVar, C68214a aVar2) {
        this.f52018t = cVar;
        this.f52008h = gVar;
        this.f52022y = context;
        this.f52023z = aVar;
        this.f52003c = bVar;
        this.f51998A = aVar2;
        this.f52150q = dbVar;
        this.f52005e = executor;
        this.f52017s = new C18340am();
    }

    /* renamed from: A */
    private final void m35664A(HotwordData hotwordData, boolean z) {
        synchronized (this.f52013m) {
            if (this.f52012l.get()) {
                ((C58970a) ((C58970a) f51996a.mo56225c()).mo56372aa(47273)).mo56386p("Update called when soda running.");
                this.f51999B.set(true);
                this.f52003c.mo19974a(C37188a.f98359c.mo40813g());
                return;
            }
            m35669y(z);
            m35668x(hotwordData);
        }
    }

    /* renamed from: B */
    private final boolean m35665B(C58485gu guVar) {
        int i = ((C58724pq) guVar).f156474d;
        int i2 = 0;
        while (i2 < i) {
            try {
                C5496e.m14212a(C18331ad.f51986a).mo11833d(this.f52022y, (String) guVar.get(i2));
                return true;
            } catch (C5494c | UnsatisfiedLinkError unused) {
                i2++;
            }
        }
        return false;
    }

    /* renamed from: j */
    public static int m35666j(HotwordData hotwordData) {
        int i = 0;
        if (hotwordData != null && ((AutoValue_HotwordData) hotwordData).f52059e) {
            i = C90744a.m148219c();
        }
        ((C58970a) ((C58970a) f51996a.mo56224b()).mo56372aa(47243)).mo56387q("loopback channel count = %d", i);
        return i;
    }

    /* renamed from: w */
    private final void m35667w() {
        try {
            this.f52009i = new Soda((C19347o) this.f52010j, true);
        } catch (UnsatisfiedLinkError e) {
            C58974d dVar = f51996a;
            ((C58970a) ((C58970a) ((C58970a) dVar.mo56226d()).mo56382g(e)).mo56372aa(47258)).mo56386p("Error when creating SODA.  Attempting to load with ReLinker.");
            this.f52003c.mo19974a(C37188a.f98360d.mo40813g());
            try {
                ((C58970a) ((C58970a) dVar.mo56224b()).mo56372aa(47266)).mo56386p("Loading hotword only so");
                if (!m35665B(C19242ae.f53916b)) {
                    ((C58970a) ((C58970a) dVar.mo56226d()).mo56372aa(47267)).mo56386p("Loading full so");
                    if (!m35665B(C19242ae.f53915a)) {
                        ((C58970a) ((C58970a) dVar.mo56225c()).mo56372aa(47268)).mo56386p("Unable to load any SODA native library");
                    }
                }
                this.f52009i = new Soda((C19347o) this.f52010j, true);
            } catch (UnsatisfiedLinkError e2) {
                ((C58970a) ((C58970a) ((C58970a) f51996a.mo56225c()).mo56382g(e2)).mo56372aa(47259)).mo56386p("Error when creating SODA.");
            }
        }
    }

    /* renamed from: x */
    private final void m35668x(HotwordData hotwordData) {
        String str;
        AutoValue_HotwordData autoValue_HotwordData = (AutoValue_HotwordData) hotwordData;
        SpeakerIdModel speakerIdModel = autoValue_HotwordData.f52056b;
        int i = (speakerIdModel == null || !speakerIdModel.f253284b.mo56113h()) ? 0 : 2;
        this.f52016r = m35666j(hotwordData) > 0;
        this.f52010j = new C18328aa(this.f52019u, speakerIdModel, i);
        m35667w();
        Soda soda = this.f52009i;
        if (soda == null) {
            C37215b bVar = this.f52003c;
            C37252a c = C37188a.f98361e.mo40805c(C62722b.INTERNAL);
            C62940bt btVar = C60688zd.f164649l;
            C60687zc zcVar = (C60687zc) C60688zd.f164648k.createBuilder();
            zcVar.copyOnWrite();
            C60688zd zdVar = (C60688zd) zcVar.instance;
            zdVar.f164651a |= 4;
            zdVar.f164654d = "Could not create SODA.";
            ((C37253b) c).mo40792p(btVar, (C60688zd) zcVar.build());
            bVar.mo19974a(c);
            return;
        }
        String str2 = autoValue_HotwordData.f52055a;
        if (str2 != null) {
            str = C60790c.m92793a(this.f52022y.getFilesDir().getAbsolutePath(), str2);
        } else {
            ((C58970a) ((C58970a) f51996a.mo56225c()).mo56372aa(47256)).mo56386p("Cannot get the Soda Hotword Directory because locale is null.");
            str = BuildConfig.FLAVOR;
        }
        C66998hg f = C19245ah.m36698f(BuildConfig.FLAVOR, str, C60790c.m92793a(this.f52022y.getCacheDir().getAbsolutePath(), "soda-hotword"));
        f.copyOnWrite();
        C66999hh hhVar = (C66999hh) f.instance;
        C66999hh hhVar2 = C66999hh.f182127p;
        hhVar.f182132d = null;
        hhVar.f182129a &= -5;
        C66985gu guVar = ((C66999hh) f.instance).f182131c;
        if (guVar == null) {
            guVar = C66985gu.f182075h;
        }
        C66984gt gtVar = (C66984gt) guVar.toBuilder();
        boolean z = this.f52016r;
        gtVar.copyOnWrite();
        C66985gu guVar2 = (C66985gu) gtVar.instance;
        guVar2.f182077a |= 4096;
        guVar2.f182083g = z;
        C66985gu guVar3 = ((C66999hh) f.instance).f182131c;
        if (guVar3 == null) {
            guVar3 = C66985gu.f182075h;
        }
        C66980gp gpVar = (C66980gp) ((C66981gq) guVar3.f182079c.get(0)).toBuilder();
        C63088z A = C63088z.m96139A(autoValue_HotwordData.f52057c);
        gpVar.copyOnWrite();
        C66981gq gqVar = (C66981gq) gpVar.instance;
        gqVar.f182067b = 2;
        gqVar.f182068c = A;
        SpeakerIdModel speakerIdModel2 = autoValue_HotwordData.f52056b;
        C67129mc mcVar = (C67129mc) C67131me.f182477b.createBuilder();
        if (speakerIdModel2 != null && speakerIdModel2.f253284b.mo56113h()) {
            mcVar.mo59772a(C58837ba.m90858g(speakerIdModel2.f253283a), C63088z.m96139A((byte[]) speakerIdModel2.f253284b.mo56107c()));
        }
        C67131me meVar = (C67131me) mcVar.build();
        gpVar.copyOnWrite();
        C66981gq gqVar2 = (C66981gq) gpVar.instance;
        meVar.getClass();
        gqVar2.f182070e = meVar;
        gqVar2.f182066a |= 32;
        gtVar.mo59758c(gpVar);
        if (autoValue_HotwordData.f52060f) {
            C66985gu guVar4 = ((C66999hh) f.instance).f182131c;
            if (guVar4 == null) {
                guVar4 = C66985gu.f182075h;
            }
            C66969ge geVar = guVar4.f182081e;
            if (geVar == null) {
                geVar = C66969ge.f182035d;
            }
            C66968gd gdVar = (C66968gd) geVar.toBuilder();
            gdVar.copyOnWrite();
            C66969ge geVar2 = (C66969ge) gdVar.instance;
            geVar2.f182037a |= 1;
            geVar2.f182038b = true;
            gdVar.copyOnWrite();
            C66969ge geVar3 = (C66969ge) gdVar.instance;
            geVar3.f182037a |= 8;
            geVar3.f182039c = false;
            gtVar.copyOnWrite();
            C66985gu guVar5 = (C66985gu) gtVar.instance;
            C66969ge geVar4 = (C66969ge) gdVar.build();
            geVar4.getClass();
            guVar5.f182081e = geVar4;
            guVar5.f182077a |= 16;
            ((C58970a) ((C58970a) f51996a.mo56224b()).mo56372aa(47254)).mo56386p("Enabling hotword cleaner");
        }
        if (autoValue_HotwordData.f52061g > 0) {
            C66967gc gcVar = ((C66999hh) f.instance).f182133e;
            if (gcVar == null) {
                gcVar = C66967gc.f182031c;
            }
            C66966gb gbVar = (C66966gb) gcVar.toBuilder();
            C66967gc gcVar2 = ((C66999hh) f.instance).f182133e;
            if (gcVar2 == null) {
                gcVar2 = C66967gc.f182031c;
            }
            C66977gm gmVar = gcVar2.f182034b;
            if (gmVar == null) {
                gmVar = C66977gm.f182052c;
            }
            C66976gl glVar = (C66976gl) gmVar.toBuilder();
            int i2 = autoValue_HotwordData.f52061g;
            glVar.copyOnWrite();
            C66977gm gmVar2 = (C66977gm) glVar.instance;
            gmVar2.f182054a |= 1;
            gmVar2.f182055b = (float) i2;
            gbVar.copyOnWrite();
            C66967gc gcVar3 = (C66967gc) gbVar.instance;
            C66977gm gmVar3 = (C66977gm) glVar.build();
            gmVar3.getClass();
            gcVar3.f182034b = gmVar3;
            gcVar3.f182033a |= 1;
            f.copyOnWrite();
            C66999hh hhVar3 = (C66999hh) f.instance;
            C66967gc gcVar4 = (C66967gc) gbVar.build();
            gcVar4.getClass();
            hhVar3.f182133e = gcVar4;
            hhVar3.f182129a |= 16;
        }
        f.copyOnWrite();
        C66999hh hhVar4 = (C66999hh) f.instance;
        C66985gu guVar6 = (C66985gu) gtVar.build();
        guVar6.getClass();
        hhVar4.f182131c = guVar6;
        hhVar4.f182129a |= 2;
        C67150mx f2 = soda.mo24329f((C66999hh) f.build());
        C67152mz a = C67152mz.m97427a(f2.f182527b);
        if (a == null) {
            a = C67152mz.NO_ERROR;
        }
        if (a != C67152mz.NO_ERROR) {
            this.f52014n = false;
            C58970a aVar = (C58970a) ((C58970a) f51996a.mo56225c()).mo56372aa(47262);
            C67152mz a2 = C67152mz.m97427a(f2.f182527b);
            if (a2 == null) {
                a2 = C67152mz.NO_ERROR;
            }
            aVar.mo56387q("Error initializing Soda: %d", a2.f182542l);
            C60687zc zcVar2 = (C60687zc) C60688zd.f164648k.createBuilder();
            C67152mz a3 = C67152mz.m97427a(f2.f182527b);
            if (a3 == null) {
                a3 = C67152mz.NO_ERROR;
            }
            int i3 = a3.f182542l;
            zcVar2.copyOnWrite();
            C60688zd zdVar2 = (C60688zd) zcVar2.instance;
            zdVar2.f164651a = 2 | zdVar2.f164651a;
            zdVar2.f164653c = i3;
            String str3 = f2.f182528c;
            zcVar2.copyOnWrite();
            C60688zd zdVar3 = (C60688zd) zcVar2.instance;
            str3.getClass();
            zdVar3.f164651a |= 4;
            zdVar3.f164654d = str3;
            String str4 = autoValue_HotwordData.f52055a;
            if (str4 != null) {
                zcVar2.copyOnWrite();
                C60688zd zdVar4 = (C60688zd) zcVar2.instance;
                zdVar4.f164651a |= 1;
                zdVar4.f164652b = str4;
            }
            C37215b bVar2 = this.f52003c;
            C37252a c2 = C37188a.f98361e.mo40805c(C62722b.INTERNAL);
            ((C37253b) c2).mo40792p(C60688zd.f164649l, (C60688zd) zcVar2.build());
            c2.mo40781e(C62722b.INTERNAL);
            bVar2.mo19974a(c2);
            return;
        }
        this.f52014n = true;
        this.f52003c.mo19974a(C37188a.f98362f.mo40805c(C62722b.OK));
    }

    /* renamed from: y */
    private final void m35669y(boolean z) {
        mo23804u(z);
        Soda soda = this.f52009i;
        if (soda != null) {
            soda.mo24340l();
        } else {
            ((C58970a) ((C58970a) f51996a.mo56225c()).mo56372aa(47264)).mo56386p("deleteDetector called when Soda is already null");
        }
        this.f52012l.set(false);
        this.f52011k = null;
        this.f52009i = null;
    }

    /* renamed from: z */
    private final void m35670z() {
        this.f52017s.mo23806a();
        Soda soda = this.f52009i;
        if (soda != null) {
            soda.mo24349p();
            this.f52012l.set(false);
        }
    }

    /* renamed from: a */
    public final int mo23789a(C18327b bVar) {
        synchronized (this.f52013m) {
            if (!mo23805v()) {
                ((C58970a) ((C58970a) f51996a.mo56224b()).mo56372aa(47247)).mo56386p("Detector is not ready.");
                return 1;
            }
            AudioFormat audioFormat = ((C18326a) bVar).f51968b;
            int bitCount = Integer.bitCount(audioFormat.getChannelMask());
            if (bitCount == 0) {
                ((C58970a) ((C58970a) f51996a.mo56226d()).mo56372aa(47246)).mo56386p("Channel count not set, defaulting to 1 channel.");
                bitCount = 1;
            }
            this.f52015o = false;
            mo23802s(bitCount, false);
            synchronized (this.f52006f) {
                ParcelFileDescriptor j = this.f52149p.mo23855j(bVar, this.f52008h);
                this.f52007g = j;
                if (j == null) {
                    ((C58970a) ((C58970a) f51996a.mo56225c()).mo56372aa(47245)).mo56386p("Unable to create parcel file descriptor.");
                    return 3;
                }
                C18328aa aaVar = this.f52010j;
                long j2 = ((C18326a) bVar).f51967a;
                aaVar.f51972a = true;
                aaVar.f51973b = j2;
                int p = mo23799p(audioFormat.getSampleRate(), bitCount, true, C58836b.f156633a);
                return p;
            }
        }
    }

    /* renamed from: b */
    public final ParcelFileDescriptor mo23790b() {
        if (!this.f52016r) {
            return this.f52007g;
        }
        ((C58970a) ((C58970a) f51996a.mo56224b()).mo56372aa(47251)).mo56386p("Using processed Audio for ASR");
        ParcelFileDescriptor[] parcelFileDescriptorArr = this.f52017s.f52025b;
        if (parcelFileDescriptorArr == null) {
            return null;
        }
        return parcelFileDescriptorArr[0];
    }

    /* renamed from: c */
    public final C60870cx mo23791c(int i, boolean z) {
        return this.f52004d.mo19399b(new C18333af(this, i, z));
    }

    /* renamed from: d */
    public final void mo23792d() {
        ((C58970a) ((C58970a) f51996a.mo56224b()).mo56372aa(47263)).mo56386p("#deleteDetector");
        m35669y(false);
    }

    /* renamed from: e */
    public final void mo23793e(boolean z) {
        this.f52020w = z;
    }

    /* renamed from: g */
    public final void mo23795g(C81066e eVar) {
        synchronized (this.f52013m) {
            if (!mo23805v()) {
                C81060a.m129009b(((C81023a) eVar).f222083b, h.s);
            } else if (this.f52012l.compareAndSet(false, true)) {
                C37360ay ayVar = ((C81023a) eVar).f222082a.f222157b;
                if (ayVar == null) {
                    ayVar = C37360ay.f99224l;
                }
                int i = ayVar.f99228c;
                C37360ay ayVar2 = ((C81023a) eVar).f222082a.f222157b;
                if (ayVar2 == null) {
                    ayVar2 = C37360ay.f99224l;
                }
                mo23799p(i, Integer.bitCount(ayVar2.f99229d), true, C58833ax.m90834k(eVar));
            } else {
                C81060a.m129009b(((C81023a) eVar).f222083b, h.i);
            }
        }
    }

    /* renamed from: h */
    public final void mo23796h() {
        this.f52004d.mo19398a(new C18329ab(this));
    }

    /* renamed from: k */
    public final int mo23797k() {
        if (this.f52002b == null) {
            return 1;
        }
        Soda soda = this.f52009i;
        return (soda == null || !soda.mo24355v() || !this.f52014n) ? 2 : 3;
    }

    /* renamed from: l */
    public final StringBuilder mo23798l() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("\n    initializationStatus=");
        sb.append(C18374k.m35778a(mo23797k()));
        sb.append("\n    needToUpdateSoda=");
        sb.append(this.f51999B);
        sb.append("\n    sodaIsRunning=");
        sb.append(this.f52012l);
        if (this.f52149p != null) {
            sb.append("\n");
            sb.append(this.f52149p.mo23811e());
        }
        return sb;
    }

    /* renamed from: p */
    public final int mo23799p(int i, int i2, boolean z, C58833ax axVar) {
        C58833ax axVar2;
        C58833ax axVar3;
        try {
            C66751r rVar = (C66751r) C66752s.f181544q.createBuilder();
            if (this.f52015o) {
                C19245ah.m36703k(rVar, i, i2);
            } else {
                C19245ah.m36702j(rVar, i, i2);
            }
            rVar.copyOnWrite();
            C66752s sVar = (C66752s) rVar.instance;
            sVar.f181546a |= 1;
            sVar.f181547b = true;
            rVar.copyOnWrite();
            C66752s sVar2 = (C66752s) rVar.instance;
            sVar2.f181546a |= 2;
            sVar2.f181548c = true;
            C67126m mVar = (C67126m) C67153n.f182543c.createBuilder();
            mVar.copyOnWrite();
            C67153n nVar = (C67153n) mVar.instance;
            nVar.f182546b = 2;
            nVar.f182545a |= 2;
            rVar.copyOnWrite();
            C66752s sVar3 = (C66752s) rVar.instance;
            C67153n nVar2 = (C67153n) mVar.build();
            nVar2.getClass();
            sVar3.f181555j = nVar2;
            sVar3.f181546a |= 256;
            if (z) {
                rVar.copyOnWrite();
                C66752s sVar4 = (C66752s) rVar.instance;
                sVar4.f181546a |= 4;
                sVar4.f181549d = 3000;
            } else {
                int j = m35666j(this.f52002b);
                if (j > 0) {
                    C66744k kVar = (C66744k) C66745l.f181530c.createBuilder();
                    C66742i iVar = (C66742i) C66743j.f181525d.createBuilder();
                    C67172q qVar = (C67172q) C67175t.f182588e.createBuilder();
                    C67174s sVar5 = C67174s.INT16;
                    qVar.copyOnWrite();
                    C67175t tVar = (C67175t) qVar.instance;
                    tVar.f182591b = sVar5.f182587e;
                    tVar.f182590a |= 1;
                    qVar.copyOnWrite();
                    C67175t tVar2 = (C67175t) qVar.instance;
                    tVar2.f182590a |= 4;
                    tVar2.f182593d = j;
                    qVar.copyOnWrite();
                    C67175t tVar3 = (C67175t) qVar.instance;
                    tVar3.f182590a |= 2;
                    tVar3.f182592c = 16000;
                    C67175t tVar4 = (C67175t) qVar.build();
                    iVar.copyOnWrite();
                    C66743j jVar = (C66743j) iVar.instance;
                    tVar4.getClass();
                    jVar.f181528b = tVar4;
                    jVar.f181527a |= 2;
                    iVar.copyOnWrite();
                    C66743j jVar2 = (C66743j) iVar.instance;
                    jVar2.f181527a |= 4;
                    jVar2.f181529c = true;
                    C66743j jVar3 = (C66743j) iVar.build();
                    kVar.copyOnWrite();
                    C66745l lVar = (C66745l) kVar.instance;
                    jVar3.getClass();
                    lVar.f181533b = jVar3;
                    lVar.f181532a = 2;
                    C66745l lVar2 = (C66745l) kVar.build();
                    rVar.copyOnWrite();
                    C66752s sVar6 = (C66752s) rVar.instance;
                    lVar2.getClass();
                    sVar6.f181551f = lVar2;
                    sVar6.f181546a |= 16;
                }
            }
            C66752s sVar7 = (C66752s) rVar.build();
            if (axVar.mo56113h()) {
                C81066e eVar = (C81066e) axVar.mo56107c();
                C37360ay ayVar = eVar.mo74806b().f222157b;
                if (ayVar == null) {
                    ayVar = C37360ay.f99224l;
                }
                C37357av avVar = (C37357av) ayVar.toBuilder();
                avVar.copyOnWrite();
                C37360ay ayVar2 = (C37360ay) avVar.instance;
                ayVar2.f99226a |= 1;
                ayVar2.f99227b = 1999;
                C37461cj cjVar = (C37461cj) C37462ck.f99442c.createBuilder();
                C37466co coVar = (C37466co) C37467cp.f99458c.createBuilder();
                C37468cq cqVar = (C37468cq) C37469cr.f99462d.createBuilder();
                C37500dg c = eVar.mo74807c();
                cqVar.copyOnWrite();
                C37469cr crVar = (C37469cr) cqVar.instance;
                c.getClass();
                crVar.f99466c = c;
                crVar.f99464a = 2 | crVar.f99464a;
                C37469cr crVar2 = (C37469cr) cqVar.build();
                coVar.copyOnWrite();
                C37467cp cpVar = (C37467cp) coVar.instance;
                crVar2.getClass();
                cpVar.f99461b = crVar2;
                cpVar.f99460a = 4;
                C37467cp cpVar2 = (C37467cp) coVar.build();
                cjVar.copyOnWrite();
                C37462ck ckVar = (C37462ck) cjVar.instance;
                cpVar2.getClass();
                ckVar.f99445b = cpVar2;
                ckVar.f99444a |= 1;
                C38137o b = ((C37660hg) this.f52023z.mo27525b()).mo41062b((C37462ck) cjVar.build());
                C60856cj.m92911t(C60856cj.m92901j(b.f101045a), new C18336ai(this), this.f52005e);
                C37661hh hhVar = (C37661hh) C37662hi.f100030g.createBuilder();
                C37705a aVar = (C37705a) C37773c.f100243c.createBuilder();
                C37767j jVar4 = C37767j.f100200a;
                aVar.copyOnWrite();
                C37773c cVar = (C37773c) aVar.instance;
                jVar4.getClass();
                cVar.f100246b = jVar4;
                cVar.f100245a = 26;
                hhVar.copyOnWrite();
                C37662hi hiVar = (C37662hi) hhVar.instance;
                C37773c cVar2 = (C37773c) aVar.build();
                cVar2.getClass();
                hiVar.f100037f = cVar2;
                hiVar.f100032a |= 16;
                C37360ay ayVar3 = (C37360ay) avVar.build();
                hhVar.copyOnWrite();
                C37662hi hiVar2 = (C37662hi) hhVar.instance;
                ayVar3.getClass();
                hiVar2.f100035d = ayVar3;
                hiVar2.f100032a |= 1;
                C37659hf a = b.mo41281a((C37662hi) hhVar.build());
                C60856cj.m92911t(a.mo41060d(), new C18337aj(this), this.f52005e);
                C60856cj.m92911t(a.mo41060d(), new C18338ak(eVar), this.f52150q);
                C18328aa aaVar = this.f52010j;
                long j2 = eVar.mo74806b().f222159d;
                aaVar.f51972a = true;
                aaVar.f51973b = j2;
                C18328aa aaVar2 = this.f52010j;
                aaVar2.f51975d = a;
                aaVar2.f51976e = eVar;
                this.f52000C = new C37587a(C60922j.m93044g(a.mo41060d(), C18330ac.f51985a, this.f52150q));
            } else {
                this.f52000C = new ParcelFileDescriptor.AutoCloseInputStream(this.f52007g);
            }
            this.f52012l.set(true);
            Soda soda = this.f52009i;
            InputStream inputStream = this.f52000C;
            if (!this.f52015o) {
                axVar2 = C58836b.f156633a;
            } else {
                ParcelFileDescriptor[] parcelFileDescriptorArr = this.f52149p.f52116i;
                ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptorArr == null ? null : parcelFileDescriptorArr[0]);
                this.f52001D = autoCloseInputStream;
                axVar2 = C58833ax.m90834k(autoCloseInputStream);
            }
            if (this.f52020w) {
                if (this.f52021x.isEmpty()) {
                    this.f52021x = String.valueOf(String.valueOf(this.f52022y.getExternalFilesDir((String) null))).concat("/");
                }
                String str = this.f52021x + "hotword_audio" + f51997v.format(Long.valueOf(System.currentTimeMillis())) + ".wav";
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(str, false);
                    ((C58970a) ((C58970a) f51996a.mo56224b()).mo56372aa(47252)).mo56389s("Dumping audio to: %s", str);
                    axVar3 = C58833ax.m90834k(fileOutputStream);
                } catch (IOException e) {
                    ((C58970a) ((C58970a) ((C58970a) f51996a.mo56225c()).mo56382g(e)).mo56372aa(47253)).mo56386p("Failed to create file for debug audio.");
                }
                C60870cx c2 = soda.mo24326c(sVar7, inputStream, axVar2, axVar3);
                this.f52011k = c2;
                C60856cj.m92911t(c2, new C18334ag(this), C60826bg.f164896a);
                return 6;
            }
            axVar3 = C58836b.f156633a;
            C60870cx c22 = soda.mo24326c(sVar7, inputStream, axVar2, axVar3);
            this.f52011k = c22;
            C60856cj.m92911t(c22, new C18334ag(this), C60826bg.f164896a);
            return 6;
        } catch (RuntimeException e2) {
            ((C58970a) ((C58970a) ((C58970a) f51996a.mo56225c()).mo56382g(e2)).mo56372aa(47250)).mo56386p("Error creating and/or starting hotword recognition.");
            mo23801r(false);
            if (axVar.mo56113h()) {
                C81060a.m129009b(((C81066e) axVar.mo56107c()).mo74805a(), h.k);
            }
            return 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final void mo23800q() {
        synchronized (this.f52006f) {
            C18371h hVar = this.f52149p;
            if (hVar != null) {
                hVar.mo23808b();
                this.f52007g = null;
            }
            this.f52000C = null;
            this.f52001D = null;
        }
    }

    /* renamed from: r */
    public final void mo23801r(boolean z) {
        File[] listFiles;
        HotwordData hotwordData;
        m35670z();
        this.f52011k = null;
        if (!z) {
            mo23800q();
        }
        if (this.f51999B.get() && (hotwordData = this.f52002b) != null) {
            m35664A(hotwordData, z);
        }
        if (this.f52020w && !this.f52021x.isEmpty() && (listFiles = new File(this.f52021x).listFiles(new C18335ah(System.currentTimeMillis()))) != null) {
            for (File delete : listFiles) {
                delete.delete();
            }
        }
    }

    /* renamed from: s */
    public final void mo23802s(int i, boolean z) {
        if (this.f52149p != null) {
            return;
        }
        if (z) {
            this.f52149p = mo23880n(i);
            return;
        }
        boolean z2 = this.f52015o;
        if (this.f52149p == null) {
            this.f52149p = new C18371h(this.f52150q, 1999, C18375l.m35779m(i), z2);
        }
        this.f52149p = this.f52149p;
    }

    /* renamed from: t */
    public final void mo23803t(C82548jg jgVar) {
        C58833ax axVar = (C58833ax) this.f51998A.mo27525b();
        if (axVar.mo56113h()) {
            ((C83305i) axVar.mo56107c()).mo75579d(jgVar);
        }
    }

    /* renamed from: u */
    public final void mo23804u(boolean z) {
        C60870cx cxVar;
        ((C58970a) ((C58970a) f51996a.mo56224b()).mo56372aa(47271)).mo56386p("#stopHotwordDetectionInternal");
        if (this.f52012l.get() && (cxVar = this.f52011k) != null) {
            cxVar.cancel(true);
        }
        if (!z) {
            mo23800q();
        }
        m35670z();
    }

    /* renamed from: v */
    public final boolean mo23805v() {
        Soda soda = this.f52009i;
        if (soda == null || !soda.mo24355v() || !this.f52014n) {
            ((C58970a) ((C58970a) f51996a.mo56225c()).mo56372aa(47275)).mo56386p("Recognizer has not been initialized.");
            return false;
        } else if (this.f52002b == null) {
            ((C58970a) ((C58970a) f51996a.mo56225c()).mo56372aa(47276)).mo56386p("HotwordData is not set.");
            return false;
        } else {
            mo23804u(false);
            return true;
        }
    }

    /* renamed from: f */
    public final void mo23794f(HotwordData hotwordData) {
        if (hotwordData != null) {
            if (this.f52009i == null) {
                this.f52003c.mo19974a(C37188a.f98357a.mo40813g());
                m35668x(hotwordData);
            } else {
                HotwordData hotwordData2 = this.f52002b;
                if (hotwordData2 == null || !hotwordData2.equals(hotwordData)) {
                    this.f52003c.mo19974a(C37188a.f98358b.mo40813g());
                    ((C58970a) ((C58970a) f51996a.mo56224b()).mo56372aa(47269)).mo56386p("Need to update.");
                    if (!this.f52012l.get()) {
                        m35664A(hotwordData, false);
                    } else {
                        this.f51999B.set(true);
                        this.f52003c.mo19974a(C37188a.f98359c.mo40813g());
                    }
                }
            }
            this.f52002b = hotwordData;
        }
    }
}
