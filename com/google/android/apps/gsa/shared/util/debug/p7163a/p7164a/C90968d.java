package com.google.android.apps.gsa.shared.util.debug.p7163a.p7164a;

import com.google.android.libraries.search.p2904c.C37360ay;
import com.google.android.libraries.search.p2904c.C37465cn;
import com.google.android.libraries.search.p2904c.C37467cp;
import com.google.android.libraries.search.p2904c.C37570ek;
import com.google.android.libraries.search.p2904c.C37578es;
import com.google.android.libraries.search.p2904c.C37580eu;
import com.google.android.libraries.search.p2904c.C37582ew;
import com.google.android.libraries.search.p2904c.C37584ey;
import com.google.android.libraries.search.p2904c.C37602fn;
import com.google.android.libraries.search.p2904c.p2985y.p2988b.C38282a;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58710pc;
import com.google.common.p4522b.C58724pq;
import com.google.protobuf.MessageLite;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.shared.util.debug.a.a.d */
/* compiled from: PG */
public final class C90968d extends C90983s {
    public C90968d(C90974j jVar) {
        super(jVar);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo85255a(MessageLite messageLite) {
        C37584ey eyVar = (C37584ey) messageLite;
        this.f254188a.mo85258b("AudioState");
        this.f254188a.mo85261e();
        C90974j jVar = this.f254188a;
        C37602fn fnVar = eyVar.f99865b;
        if (fnVar == null) {
            fnVar = C37602fn.f99922h;
        }
        Locale locale = Locale.US;
        Object[] objArr = new Object[6];
        C37467cp cpVar = fnVar.f99925b;
        if (cpVar == null) {
            cpVar = C37467cp.f99458c;
        }
        objArr[0] = C37465cn.m66491a(cpVar.f99460a).name();
        C37467cp cpVar2 = fnVar.f99930g;
        if (cpVar2 == null) {
            cpVar2 = C37467cp.f99458c;
        }
        objArr[1] = C37465cn.m66491a(cpVar2.f99460a).name();
        objArr[2] = Boolean.valueOf(fnVar.f99926c);
        objArr[3] = Boolean.valueOf(fnVar.f99927d);
        objArr[4] = Boolean.valueOf(fnVar.f99928e);
        objArr[5] = Boolean.valueOf(fnVar.f99929f);
        jVar.mo85257a(String.format(locale, "ClientsState: [AudioRouteType: %s, HotwordAudioRouteType: %s, isAudioRequestClientListening: %b, isHotwordClientListening: %b, isExternalClientListening: %b, concurrentHotword: %b]", objArr));
        this.f254188a.mo85258b("AudioSourceStates");
        this.f254188a.mo85261e();
        if (eyVar.f99867d.size() == 0) {
            this.f254188a.mo85257a("NONE");
        } else {
            for (C37580eu euVar : eyVar.f99867d) {
                C90974j jVar2 = this.f254188a;
                Locale locale2 = Locale.US;
                Object[] objArr2 = new Object[5];
                objArr2[0] = Boolean.valueOf(euVar.f99856b);
                int a = C37578es.m66578a(euVar.f99857c);
                objArr2[1] = (a == 0 || a == 1) ? "AUDIO_CLIENT_TYPE_UNKNOWN" : a != 2 ? "HOTWORD_CLIENT" : "AUDIO_REQUEST_CLIENT";
                objArr2[2] = Boolean.valueOf(euVar.f99858d);
                int a2 = C37582ew.m66579a(euVar.f99859e);
                objArr2[3] = (a2 == 0 || a2 == 1) ? "AUDIO_SOURCE_TYPE_UNKNOWN" : a2 != 2 ? a2 != 3 ? a2 != 4 ? a2 != 5 ? "BISTO_AUDIO_ADAPTER_AUDIO_SOURCE" : "AUDIO_EMULATED_AUDIO_SOURCE" : "AUDIO_FILE_AUDIO_SOURCE" : "AUDIO_URI_AUDIO_SOURCE" : "AUDIO_RECORD_AUDIO_SOURCE";
                C37360ay ayVar = euVar.f99860f;
                if (ayVar == null) {
                    ayVar = C37360ay.f99224l;
                }
                objArr2[4] = C38282a.m67595b(ayVar);
                jVar2.mo85257a(String.format(locale2, "AudioSourceState: [isAudioSourceOpen: %b, clientType: %s, openedByHotword: %b, audioSourceType: %s]\n%s", objArr2));
            }
        }
        this.f254188a.mo85260d();
        this.f254188a.mo85258b("AudioEvents");
        this.f254188a.mo85261e();
        if (eyVar.f99866c.size() == 0) {
            this.f254188a.mo85257a("NONE");
        } else {
            C58485gu F = C58485gu.m89836F(C58710pc.m90487d(C90967c.f254184a), eyVar.f99866c);
            int i = ((C58724pq) F).f156474d;
            for (int i2 = 0; i2 < i; i2++) {
                this.f254188a.mo85257a(C38282a.m67594a((C37570ek) F.get(i2)));
            }
        }
        this.f254188a.mo85260d();
        this.f254188a.mo85260d();
    }
}
