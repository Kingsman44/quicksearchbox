package com.google.android.libraries.assistant.p1363c.p1398g.p1441n.p1443b;

import android.speech.tts.UtteranceProgressListener;
import androidx.p104d.p105a.C2164c;
import com.google.android.libraries.assistant.p1363c.p1398g.p1405d.C17377g;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17477am;
import com.google.android.libraries.assistant.p1363c.p1398g.p1444o.p1447c.C17586a;
import com.google.android.libraries.search.assistant.p2498ac.p2499a.p2500a.C32432a;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.net.p4726a.p4727a.C62722b;
import java.util.concurrent.atomic.AtomicReference;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.assistant.c.g.n.b.m */
/* compiled from: PG */
final class C17563m extends UtteranceProgressListener {

    /* renamed from: a */
    final /* synthetic */ C17477am f50621a;

    /* renamed from: b */
    final /* synthetic */ C17564n f50622b;

    /* renamed from: c */
    final /* synthetic */ AtomicReference f50623c;

    /* renamed from: d */
    final /* synthetic */ C32432a f50624d;

    public C17563m(C17477am amVar, C17564n nVar, AtomicReference atomicReference, C32432a aVar) {
        this.f50621a = amVar;
        this.f50622b = nVar;
        this.f50623c = atomicReference;
        this.f50624d = aVar;
    }

    public final void onDone(String str) {
        C59104x b = C17565o.f50627a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "TTS.OnDevice");
        ((C59052c) ((C59052c) b).mo56372aa(42775)).mo56389s("On-device TTS synthesis successfully finished for sessionToken %s", C17377g.m34655c(this.f50621a));
        this.f50622b.mo23394a(this.f50621a);
        ((C2164c) this.f50623c.get()).mo5437b(C17586a.m34877d(3));
        C32432a aVar = this.f50624d;
        C17477am amVar = this.f50621a;
        C69664n.m101061g(amVar, "sessionToken");
        aVar.mo38058a(C37176a.f97052eK.mo40815i(C62722b.OK), amVar);
    }

    public final void onError(String str) {
        C59104x c = C17565o.f50627a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "TTS.OnDevice");
        ((C59052c) ((C59052c) c).mo56372aa(42776)).mo56389s("On-device TTS synthesis failed for sessionToken %s", C17377g.m34655c(this.f50621a));
        this.f50622b.mo23394a(this.f50621a);
        ((C2164c) this.f50623c.get()).mo5437b(C17586a.m34876c(101));
    }

    public final void onStart(String str) {
        C59104x b = C17565o.f50627a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "TTS.OnDevice");
        ((C59052c) ((C59052c) b).mo56372aa(42777)).mo56389s("On-device TTS synthesis successfully started for sessionToken %s", C17377g.m34655c(this.f50621a));
    }
}
