package com.google.android.apps.gsa.staticplugins.opa.ambient.p8264h.p8272f;

import android.content.Intent;
import com.google.android.apps.gsa.opa.p6429a.p6431b.C83564a;
import com.google.android.apps.gsa.shared.p7066m.C90017bw;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.assistant.p3803ag.p3809c.C49155y;
import com.google.assistant.p3803ag.p3809c.C49156z;
import com.google.assistant.p3886c.C50702an;
import com.google.assistant.p3886c.C50707as;
import com.google.assistant.p3886c.C50710av;
import com.google.assistant.p3886c.C50713ay;
import com.google.assistant.p3886c.C50737bb;
import com.google.assistant.p3886c.C50738bc;
import com.google.common.p4580v.C60950i;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62953e;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.h.f.a */
/* compiled from: PG */
public final class C107060a {

    /* renamed from: a */
    private final C60950i f298107a;

    /* renamed from: b */
    private final C90021c f298108b;

    public C107060a(C60950i iVar, C90021c cVar, C83564a aVar) {
        this.f298107a = iVar;
        this.f298108b = cVar;
        aVar.mo76900a("SmartspaceChipHelper");
    }

    /* renamed from: b */
    public static C50710av m177773b(String str) {
        C50707as asVar = (C50707as) C50710av.f131964d.createBuilder();
        asVar.copyOnWrite();
        C50710av avVar = (C50710av) asVar.instance;
        avVar.f131967b = 2;
        avVar.f131966a |= 1;
        asVar.copyOnWrite();
        C50710av avVar2 = (C50710av) asVar.instance;
        avVar2.f131966a = 2 | avVar2.f131966a;
        avVar2.f131968c = str;
        return (C50710av) asVar.build();
    }

    /* renamed from: a */
    public final C50702an mo95749a(Intent intent) {
        intent.addFlags(268435456);
        String uri = intent.toUri(1);
        C50702an anVar = (C50702an) C50738bc.f132032l.createBuilder();
        C49156z c = mo95750c(Optional.empty(), Duration.ofMinutes(this.f298108b.mo79743a(C90017bw.f247987bw)));
        anVar.copyOnWrite();
        C50738bc bcVar = (C50738bc) anVar.instance;
        c.getClass();
        bcVar.f132041h = c;
        bcVar.f132034a |= 16;
        C50713ay ayVar = (C50713ay) C50737bb.f132027d.createBuilder();
        ayVar.copyOnWrite();
        C50737bb bbVar = (C50737bb) ayVar.instance;
        bbVar.f132031c = 2;
        bbVar.f132029a = 2 | bbVar.f132029a;
        ayVar.copyOnWrite();
        C50737bb bbVar2 = (C50737bb) ayVar.instance;
        uri.getClass();
        bbVar2.f132029a = 1 | bbVar2.f132029a;
        bbVar2.f132030b = uri;
        anVar.copyOnWrite();
        C50738bc bcVar2 = (C50738bc) anVar.instance;
        C50737bb bbVar3 = (C50737bb) ayVar.build();
        bbVar3.getClass();
        bcVar2.f132036c = bbVar3;
        bcVar2.f132035b = 7;
        return anVar;
    }

    /* renamed from: c */
    public final C49156z mo95750c(Optional optional, Duration duration) {
        if (!optional.isPresent()) {
            optional = Optional.m71637of(this.f298107a.mo57444a());
        }
        C49155y yVar = (C49155y) C49156z.f127111d.createBuilder();
        C63042fg i = C62953e.m95484i(((Instant) optional.get()).toEpochMilli());
        yVar.copyOnWrite();
        C49156z zVar = (C49156z) yVar.instance;
        i.getClass();
        zVar.f127114b = i;
        zVar.f127113a |= 1;
        C63042fg i2 = C62953e.m95484i(((Instant) optional.get()).plus(duration).toEpochMilli());
        yVar.copyOnWrite();
        C49156z zVar2 = (C49156z) yVar.instance;
        i2.getClass();
        zVar2.f127115c = i2;
        zVar2.f127113a |= 2;
        return (C49156z) yVar.build();
    }
}
