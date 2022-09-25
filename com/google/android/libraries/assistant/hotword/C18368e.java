package com.google.android.libraries.assistant.hotword;

import android.media.AudioRecord;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.nio.channels.FileChannel;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.assistant.hotword.e */
/* compiled from: PG */
public final class C18368e {

    /* renamed from: a */
    public static final C59071e f52098a = C59071e.m91332i("com.google.android.libraries.assistant.hotword.e");

    /* renamed from: b */
    public final int f52099b;

    /* renamed from: c */
    AudioRecord f52100c;

    /* renamed from: d */
    private final Executor f52101d;

    /* renamed from: e */
    private final int f52102e;

    /* renamed from: f */
    private final int f52103f;

    /* renamed from: g */
    private final int f52104g;

    /* renamed from: h */
    private C18352d f52105h;

    public C18368e(Executor executor, int i, int i2, int i3, int i4) {
        this.f52101d = executor;
        this.f52102e = i;
        this.f52103f = i2;
        this.f52099b = i3;
        this.f52104g = i4;
    }

    /* renamed from: a */
    public final synchronized void mo23849a(FileChannel fileChannel, C18370g gVar) {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f52100c == null || this.f52105h == null) {
            AudioRecord audioRecord = null;
            try {
                int i = this.f52102e;
                int i2 = this.f52103f;
                int i3 = this.f52104g;
                AudioRecord audioRecord2 = new AudioRecord(i, i2, i3, 2, C18371h.m35742f(i3) * 256000);
                if (audioRecord2.getState() != 1) {
                    C59104x c = f52098a.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "AlwaysOpenAudioRead");
                    ((C59052c) ((C59052c) c).mo56372aa(47110)).mo56386p("Failed to initialize AudioRecord");
                    audioRecord2.release();
                } else {
                    audioRecord = audioRecord2;
                }
            } catch (IllegalArgumentException e) {
                C59104x c2 = f52098a.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "AlwaysOpenAudioRead");
                ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e)).mo56372aa(47109)).mo56386p("Failed to create AudioRecord");
            }
            this.f52100c = audioRecord;
            if (audioRecord == null) {
                C59104x c3 = f52098a.mo56225c();
                c3.mo56378ag(C58975e.f156826a, "AlwaysOpenAudioRead");
                ((C59052c) ((C59052c) c3).mo56372aa(47112)).mo56386p("Unable to create audio record");
                gVar.mo23775a(false);
                return;
            }
            C18352d dVar = new C18352d(this, audioRecord, this.f52099b);
            Executor executor = this.f52101d;
            Objects.requireNonNull(dVar);
            executor.execute(new C18351c(dVar));
            this.f52105h = dVar;
        }
        this.f52105h.mo23814b(fileChannel, gVar);
    }

    /* renamed from: b */
    public final synchronized void mo23850b() {
        C58976aa aaVar = C58975e.f156826a;
        C18352d dVar = this.f52105h;
        if (dVar != null) {
            dVar.mo23814b((FileChannel) null, (C18370g) null);
        }
    }

    /* renamed from: c */
    public final synchronized void mo23851c() {
        C58976aa aaVar = C58975e.f156826a;
        mo23850b();
        this.f52105h = null;
        AudioRecord audioRecord = this.f52100c;
        if (audioRecord != null) {
            audioRecord.release();
            this.f52100c = null;
        }
    }
}
