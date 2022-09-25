package com.google.android.libraries.assistant.auto.tng.p1278u.p1279a.p1280a;

import android.net.Uri;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12989g;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C13007y;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.logging.p3043f.C39191a;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.knowledge.p4671b.C61818k;
import com.google.p4017at.p4060h.p4068b.p4069a.C54185b;
import com.google.p4017at.p4060h.p4068b.p4069a.C54188e;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.u.a.a.c */
/* compiled from: PG */
public final class C16461c {

    /* renamed from: a */
    private final C21370a f48370a;

    /* renamed from: b */
    private final C58881cr f48371b = C58886cw.m90973a(new C16460b());

    public C16461c(C21370a aVar) {
        this.f48370a = aVar;
    }

    /* renamed from: a */
    public final C54188e mo22926a(C12991i iVar, int i) {
        Optional optional;
        C54185b bVar = (C54185b) C54188e.f142203f.createBuilder();
        C58490gz gzVar = new C58490gz(4);
        C12989g gVar = C12989g.UNKNOWN;
        if (i - 1 != 1) {
            optional = Optional.m71637of("vs-opa-suggestion-chip");
        } else {
            optional = Optional.m71637of("vs-opa");
        }
        optional.ifPresent(new C16459a(gzVar));
        C13007y yVar = iVar.f40383b;
        if (yVar == null) {
            yVar = C13007y.f40413d;
        }
        gzVar.mo55429h("source", yVar.f40417c);
        C12989g a = C12989g.m29225a(iVar.f40385d);
        if (a == null) {
            a = C12989g.UNKNOWN;
        }
        int ordinal = a.ordinal();
        if (ordinal == 1) {
            gzVar.mo55429h("ttsm", "android_auto_embedded");
        } else if (ordinal == 2) {
            gzVar.mo55429h("ttsm", "gearheadds_projected");
        } else if (ordinal == 3) {
            gzVar.mo55429h("ttsm", "eyesfree");
        }
        gzVar.mo55433l(Collections.unmodifiableMap(iVar.f40389h));
        C58495hd f = gzVar.mo55427f(false);
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : f.entrySet()) {
            hashMap.put(Uri.decode((String) entry.getKey()), Uri.decode((String) entry.getValue()));
        }
        bVar.mo54073b(hashMap);
        C61818k kVar = C61818k.f166999r;
        bVar.copyOnWrite();
        C54188e eVar = (C54188e) bVar.instance;
        kVar.getClass();
        eVar.f142207c = kVar;
        eVar.f142205a |= 2;
        C13007y yVar2 = iVar.f40383b;
        if (yVar2 == null) {
            yVar2 = C13007y.f40413d;
        }
        bVar.mo54074c("X-Speech-RequestId", C39191a.m68623b(yVar2.f40416b));
        bVar.mo54074c("X-Device-Elapsed-Time", Long.toString(this.f48370a.mo26872d()));
        bVar.mo54074c("Date", ((SimpleDateFormat) this.f48371b.mo6453a()).format(Long.valueOf(this.f48370a.mo26870b())));
        return (C54188e) bVar.build();
    }
}
