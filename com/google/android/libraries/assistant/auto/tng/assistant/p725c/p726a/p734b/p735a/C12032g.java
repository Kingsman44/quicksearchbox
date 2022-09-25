package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p734b.p735a;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p734b.C12025a;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15481g;
import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47636i;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.io.InputStream;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p5462h.C69685i;
import p5462h.p5472e.C69597a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.a.b.a.g */
/* compiled from: PG */
public final class C12032g implements C12025a {
    @Deprecated

    /* renamed from: a */
    public static final C59071e f38566a = C59071e.m91331h();
    @Deprecated

    /* renamed from: d */
    private static final AudioFormat f38567d = new AudioFormat.Builder().setChannelMask(4).setEncoding(2).setSampleRate(16000).build();

    /* renamed from: b */
    public final C15481g f38568b;

    /* renamed from: c */
    public final AtomicReference f38569c = new AtomicReference();

    /* renamed from: e */
    private final Context f38570e;

    /* renamed from: f */
    private final Executor f38571f;

    /* renamed from: g */
    private final Executor f38572g;

    /* renamed from: h */
    private final AudioAttributes f38573h;

    public C12032g(Context context, Executor executor, Executor executor2, int i, C15481g gVar) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(executor, "backgroundExecutor");
        C69664n.m101061g(executor2, "lightweightExecutor");
        C69664n.m101061g(gVar, "assistantAutoAppFlowLogger");
        this.f38570e = context;
        this.f38571f = executor;
        this.f38572g = executor2;
        this.f38568b = gVar;
        this.f38573h = new AudioAttributes.Builder().setUsage(i).setContentType(4).build();
    }

    /* renamed from: g */
    private final C60870cx m27923g(int i, C69685i iVar) {
        C47633f a = C47636i.m84742a(new C12029d(this, i), this.f38571f);
        C69664n.m101060f(a, "private fun internalPlay…tweightExecutor\n    )\n  }");
        return a.mo51516i(new C12028c(this, iVar), this.f38572g);
    }

    /* renamed from: a */
    public final C60870cx mo20370a() {
        C59052c cVar = (C59052c) f38566a.mo56224b();
        cVar.mo56379ah(new C59094n(43972));
        cVar.mo56386p("Playing earcon: microphone open failure");
        return m27923g(R.raw.earcon_failure, new C69685i(C37179a.f97670el, C37179a.f97671em));
    }

    /* renamed from: b */
    public final C60870cx mo20371b() {
        C59052c cVar = (C59052c) f38566a.mo56224b();
        cVar.mo56379ah(new C59094n(43973));
        cVar.mo56386p("Playing earcon: microphone open success");
        return m27923g(R.raw.earcon_open, new C69685i(C37179a.f97677es, C37179a.f97678et));
    }

    /* renamed from: c */
    public final C60870cx mo20372c() {
        C59052c cVar = (C59052c) f38566a.mo56224b();
        cVar.mo56379ah(new C59094n(43974));
        cVar.mo56386p("Playing earcon: no speech input");
        return m27923g(R.raw.earcon_noinput, new C69685i(C37179a.f97672en, C37179a.f97673eo));
    }

    /* renamed from: d */
    public final C60870cx mo20373d() {
        C59052c cVar = (C59052c) f38566a.mo56224b();
        cVar.mo56379ah(new C59094n(43975));
        cVar.mo56386p("Playing earcon: recognition done");
        return m27923g(R.raw.earcon_success, new C69685i(C37179a.f97674ep, C37179a.f97675eq));
    }

    /* renamed from: e */
    public final C60870cx mo20374e() {
        C59052c cVar = (C59052c) f38566a.mo56224b();
        cVar.mo56379ah(new C59094n(43976));
        cVar.mo56386p("Playing earcon: spinner");
        C47633f a = C47636i.m84742a(new C12031f(this), this.f38571f);
        C69664n.m101060f(a, "override fun startSpinne…tweightExecutor\n    )\n  }");
        C12030e eVar = C12030e.f38564a;
        return C60922j.m93044g(a, C47810es.m84963c(eVar), this.f38572g);
    }

    /* renamed from: f */
    public final AudioTrack mo20377f(int i, boolean z) {
        InputStream openRawResource = this.f38570e.getResources().openRawResource(i);
        C69664n.m101060f(openRawResource, "context.resources.openRawResource(resId)");
        byte[] a = C69597a.m101012a(openRawResource);
        AudioAttributes audioAttributes = this.f38573h;
        AudioFormat audioFormat = f38567d;
        int length = a.length;
        AudioTrack audioTrack = new AudioTrack(audioAttributes, audioFormat, length, 0, 0);
        audioTrack.write(a, 0, length);
        if (z) {
            audioTrack.setLoopPoints(0, length >> 1, (960000 / length) + 1);
        }
        audioTrack.setNotificationMarkerPosition(length >> 1);
        C59052c cVar = (C59052c) f38566a.mo56224b();
        cVar.mo56379ah(new C59094n(43971));
        cVar.mo56386p("Successfully loaded audio track from resource file");
        return audioTrack;
    }
}
