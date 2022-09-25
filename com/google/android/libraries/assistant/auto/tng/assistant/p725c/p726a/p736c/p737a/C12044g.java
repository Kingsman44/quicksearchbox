package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p736c.p737a;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p743f.p744a.p745a.C12114c;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p743f.p744a.p745a.C12115d;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p743f.p747c.p751c.C12149a;
import com.google.android.libraries.search.p2904c.C37321a;
import com.google.android.libraries.search.p2904c.C37360ay;
import com.google.android.libraries.search.p2904c.C37402bg;
import com.google.android.libraries.search.p2904c.C37410bo;
import com.google.android.libraries.search.p2904c.p2906aa.C37329d;
import com.google.android.libraries.search.p2904c.p2951n.C37900b;
import com.google.android.libraries.search.p2904c.p2951n.C37901c;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.a.c.a.g */
/* compiled from: PG */
public final /* synthetic */ class C12044g implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C37321a f38588a;

    /* renamed from: b */
    public final /* synthetic */ C12060w f38589b;

    /* renamed from: c */
    public final /* synthetic */ C37410bo f38590c;

    /* renamed from: d */
    public final /* synthetic */ C37402bg f38591d;

    public /* synthetic */ C12044g(C37321a aVar, C12060w wVar, C37410bo boVar, C37402bg bgVar) {
        this.f38588a = aVar;
        this.f38589b = wVar;
        this.f38590c = boVar;
        this.f38591d = bgVar;
    }

    public final void run() {
        C37321a aVar = this.f38588a;
        C12060w wVar = this.f38589b;
        C37410bo boVar = this.f38590c;
        C37402bg bgVar = this.f38591d;
        C37360ay ayVar = boVar.f99337f;
        if (ayVar == null) {
            ayVar = C37360ay.f99224l;
        }
        int c = C37329d.m66335c(ayVar);
        byte[] bArr = new byte[c];
        int i = 0;
        int i2 = 0;
        while (i >= 0) {
            try {
                i = aVar.mo40879a(bArr, i2, 0, c);
                if (i > 0) {
                    i2 += i;
                    C58976aa aaVar = C58975e.f156826a;
                    C12114c cVar = (C12114c) C12115d.f38733c.createBuilder();
                    C63088z D = C63088z.m96142D(bArr, 0, i);
                    cVar.copyOnWrite();
                    C12115d dVar = (C12115d) cVar.instance;
                    dVar.f38735a |= 1;
                    dVar.f38736b = D;
                    wVar.f155056f.mo54591h((C12115d) cVar.build());
                } else if (i == 0) {
                    C58976aa aaVar2 = C58975e.f156826a;
                }
            } catch (C37901c e) {
                C59104x c2 = C12048k.f38594a.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "AudioLstnSessFctry");
                ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e)).mo56372aa(44010)).mo56386p("Audio buffer overflow.");
                wVar.f155056f.mo54590g(new C12149a(e, 2));
            } catch (C37900b e2) {
                C59104x c3 = C12048k.f38594a.mo56225c();
                c3.mo56378ag(C58975e.f156826a, "AudioLstnSessFctry");
                ((C59052c) ((C59052c) ((C59052c) c3).mo56382g(e2)).mo56372aa(44011)).mo56386p("Reading from audio buffer interrupted.");
                wVar.f155056f.mo54590g(new C12149a(e2, 3));
            }
        }
        C59104x b = C12048k.f38594a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "AudioLstnSessFctry");
        ((C59052c) ((C59052c) b).mo56372aa(44007)).mo56387q("Audio complete, total bytes: %d", i2);
        wVar.f155056f.mo54589f(false);
        C46459k.m82829b(bgVar.mo20354a().mo20353a(), "audio stream complete, stopListening failed", new Object[0]);
    }
}
