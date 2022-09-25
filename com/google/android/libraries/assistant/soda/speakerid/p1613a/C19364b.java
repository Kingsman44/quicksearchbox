package com.google.android.libraries.assistant.soda.speakerid.p1613a;

import android.text.TextUtils;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.speech.p5218j.C66760aa;
import com.google.speech.p5218j.C66826bd;
import com.google.speech.p5218j.C66827be;
import com.google.speech.p5218j.C66838bp;
import com.google.speech.p5218j.C67125lz;
import com.google.speech.p5218j.C67179x;
import com.google.speech.p5218j.C67180y;
import com.google.speech.p5218j.C67181z;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.soda.speakerid.a.b */
/* compiled from: PG */
public final /* synthetic */ class C19364b implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C19372j f54199a;

    /* renamed from: b */
    public final /* synthetic */ String f54200b;

    /* renamed from: c */
    public final /* synthetic */ Optional f54201c;

    public /* synthetic */ C19364b(C19372j jVar, String str, Optional optional) {
        this.f54199a = jVar;
        this.f54200b = str;
        this.f54201c = optional;
    }

    public final C60870cx apply(Object obj) {
        C19372j jVar = this.f54199a;
        String str = this.f54200b;
        Optional optional = this.f54201c;
        C66838bp bpVar = (C66838bp) obj;
        if (TextUtils.isEmpty(str)) {
            return C60856cj.m92899h(new IllegalStateException("Empty auth token."));
        }
        C66826bd bdVar = (C66826bd) C66827be.f181719f.createBuilder();
        C67125lz lzVar = C67125lz.DEFAULT_TEXT_DEPENDENT;
        bdVar.copyOnWrite();
        C66827be beVar = (C66827be) bdVar.instance;
        lzVar.getClass();
        C62961ch chVar = beVar.f181723c;
        if (!chVar.mo58948c()) {
            beVar.f181723c = C62942bv.mutableCopy(chVar);
        }
        beVar.f181723c.mo58916g(lzVar.f182473c);
        C67181z zVar = (C67181z) C66760aa.f181571b.createBuilder();
        C67179x xVar = (C67179x) C67180y.f182596f.createBuilder();
        xVar.copyOnWrite();
        C67180y yVar = (C67180y) xVar.instance;
        str.getClass();
        yVar.f182598a |= 1;
        yVar.f182599b = str;
        xVar.copyOnWrite();
        C67180y yVar2 = (C67180y) xVar.instance;
        yVar2.f182598a |= 2;
        yVar2.f182600c = "0";
        xVar.copyOnWrite();
        C67180y yVar3 = (C67180y) xVar.instance;
        yVar3.f182598a |= 4;
        yVar3.f182601d = "oauth2:https://www.googleapis.com/auth/googlenow";
        zVar.mo59775a(xVar);
        bdVar.copyOnWrite();
        C66827be beVar2 = (C66827be) bdVar.instance;
        C66760aa aaVar = (C66760aa) zVar.build();
        aaVar.getClass();
        beVar2.f181722b = aaVar;
        beVar2.f181721a |= 1;
        bdVar.copyOnWrite();
        C66827be beVar3 = (C66827be) bdVar.instance;
        beVar3.f181721a |= 4;
        beVar3.f181724d = true;
        Objects.requireNonNull(bdVar);
        optional.ifPresent(new C19371i(bdVar));
        return jVar.f54211c.mo24503d((C66827be) bdVar.build());
    }
}
