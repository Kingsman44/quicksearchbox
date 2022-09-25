package com.google.android.libraries.assistant.auto.tng.p1118r.p1154d.p1160d;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1154d.p1158c.C15689a;
import com.google.android.libraries.assistant.soda.C19245ah;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.protobuf.C62940bt;
import com.google.speech.p5218j.C66890dg;
import com.google.speech.p5218j.C66891dh;
import com.google.speech.p5218j.C66964g;
import com.google.speech.p5218j.C66994hc;
import com.google.speech.p5218j.C66997hf;
import com.google.speech.p5218j.C66998hg;
import com.google.speech.p5218j.C66999hh;
import com.google.speech.p5218j.C67104le;
import com.google.speech.p5218j.C67105lf;
import com.google.speech.p5218j.p5219a.C66711ao;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.r.d.d.v */
/* compiled from: PG */
public final /* synthetic */ class C15728v implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C15706an f46904a;

    public /* synthetic */ C15728v(C15706an anVar) {
        this.f46904a = anVar;
    }

    public final Object apply(Object obj) {
        C15706an anVar = this.f46904a;
        String str = (String) obj;
        C58833ax a = anVar.f46855d.mo22525a(str);
        if (a.mo56113h()) {
            Optional b = anVar.f46855d.mo22526b(str);
            C66998hg f = C19245ah.m36698f((String) a.mo56107c(), (String) null, anVar.f46855d.mo22527c());
            C66994hc hcVar = (C66994hc) C66997hf.f182099z.createBuilder();
            hcVar.copyOnWrite();
            C66997hf hfVar = (C66997hf) hcVar.instance;
            hfVar.f182104c = 1;
            hfVar.f182102a |= 1;
            String str2 = (String) a.mo56107c();
            hcVar.copyOnWrite();
            C66997hf hfVar2 = (C66997hf) hcVar.instance;
            str2.getClass();
            hfVar2.f182102a |= 32768;
            hfVar2.f182115n = str2;
            C66964g gVar = C66964g.DEFAULT_ONESHOT;
            hcVar.copyOnWrite();
            C66997hf hfVar3 = (C66997hf) hcVar.instance;
            hfVar3.f182119r = gVar.f182026k;
            hfVar3.f182102a |= 1048576;
            boolean booleanValue = ((Boolean) anVar.f46857f.mo17428b()).booleanValue();
            hcVar.copyOnWrite();
            C66997hf hfVar4 = (C66997hf) hcVar.instance;
            hfVar4.f182102a |= C89885b.S3REQUEST_VALUE;
            hfVar4.f182117p = booleanValue;
            boolean booleanValue2 = ((Boolean) anVar.f46856e.mo17428b()).booleanValue();
            hcVar.copyOnWrite();
            C66997hf hfVar5 = (C66997hf) hcVar.instance;
            hfVar5.f182103b |= 1;
            hfVar5.f182125x = booleanValue2;
            f.copyOnWrite();
            C66999hh hhVar = (C66999hh) f.instance;
            C66997hf hfVar6 = (C66997hf) hcVar.build();
            C66999hh hhVar2 = C66999hh.f182127p;
            hfVar6.getClass();
            hhVar.f182132d = hfVar6;
            hhVar.f182129a |= 4;
            if (b.isPresent()) {
                C66711ao aoVar = (C66711ao) b.get();
                f.copyOnWrite();
                C66999hh hhVar3 = (C66999hh) f.instance;
                aoVar.getClass();
                hhVar3.f182143o = aoVar;
                hhVar3.f182129a |= 65536;
            }
            C67104le leVar = (C67104le) C67105lf.f182433a.createBuilder();
            C62940bt btVar = C66891dh.f181853d;
            C66890dg dgVar = (C66890dg) C66891dh.f181852c.createBuilder();
            C66999hh hhVar4 = (C66999hh) f.build();
            dgVar.copyOnWrite();
            C66891dh dhVar = (C66891dh) dgVar.instance;
            hhVar4.getClass();
            dhVar.f181856b = hhVar4;
            dhVar.f181855a |= 1;
            leVar.mo58885m(btVar, (C66891dh) dgVar.build());
            return (C67105lf) leVar.build();
        }
        C15689a aVar = new C15689a("Could not locate a Language Pack.");
        anVar.f46863l.mo20122b(aVar);
        C46459k.m82829b(anVar.f46861j.mo20262a(), "Failed to download lp through mdd after offline query", new Object[0]);
        throw aVar;
    }
}
