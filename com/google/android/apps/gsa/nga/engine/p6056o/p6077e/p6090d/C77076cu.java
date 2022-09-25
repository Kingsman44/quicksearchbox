package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6090d;

import com.google.android.apps.gsa.nga.engine.aj.af;
import com.google.android.apps.gsa.nga.engine.p5907aj.C74851z;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80399l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80303ay;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80334cb;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80335cc;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3897e.p3921j.C52373pi;
import com.google.assistant.p3897e.p3921j.C52374pj;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.d.cu */
/* compiled from: PG */
public final /* synthetic */ class C77076cu implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C77089dg f212715a;

    /* renamed from: b */
    public final /* synthetic */ long f212716b;

    /* renamed from: c */
    public final /* synthetic */ af f212717c;

    /* renamed from: d */
    public final /* synthetic */ String f212718d;

    /* renamed from: e */
    public final /* synthetic */ C77140u f212719e;

    /* renamed from: f */
    public final /* synthetic */ C80399l f212720f;

    /* renamed from: g */
    public final /* synthetic */ C80303ay f212721g;

    /* renamed from: h */
    public final /* synthetic */ C74851z f212722h;

    /* renamed from: i */
    public final /* synthetic */ C60870cx f212723i;

    /* renamed from: j */
    public final /* synthetic */ C60870cx f212724j;

    /* renamed from: k */
    public final /* synthetic */ C60870cx f212725k;

    /* renamed from: l */
    public final /* synthetic */ C60870cx f212726l;

    public /* synthetic */ C77076cu(C77089dg dgVar, long j, af afVar, String str, C77140u uVar, C80399l lVar, C80303ay ayVar, C74851z zVar, C60870cx cxVar, C60870cx cxVar2, C60870cx cxVar3, C60870cx cxVar4) {
        this.f212715a = dgVar;
        this.f212716b = j;
        this.f212717c = afVar;
        this.f212718d = str;
        this.f212719e = uVar;
        this.f212720f = lVar;
        this.f212721g = ayVar;
        this.f212722h = zVar;
        this.f212723i = cxVar;
        this.f212724j = cxVar2;
        this.f212725k = cxVar3;
        this.f212726l = cxVar4;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C80334cb cbVar;
        C60870cx cxVar;
        C77089dg dgVar = this.f212715a;
        long j = this.f212716b;
        af afVar = this.f212717c;
        String str = this.f212718d;
        C77140u uVar = this.f212719e;
        C80399l lVar = this.f212720f;
        C80303ay ayVar = this.f212721g;
        C74851z zVar = this.f212722h;
        C60870cx cxVar2 = this.f212723i;
        C60870cx cxVar3 = this.f212724j;
        C60870cx cxVar4 = this.f212725k;
        C60870cx cxVar5 = this.f212726l;
        Optional optional = (Optional) C60856cj.m92909r(cxVar2);
        Optional optional2 = (Optional) C60856cj.m92909r(cxVar3);
        Optional optional3 = (Optional) C60856cj.m92909r(cxVar5);
        String str2 = afVar.b().i;
        C80334cb cbVar2 = (C80334cb) C80335cc.f220436e.createBuilder();
        cbVar2.copyOnWrite();
        str.getClass();
        ((C80335cc) cbVar2.instance).f220441d = str;
        Optional map = ((Optional) C60856cj.m92909r(cxVar4)).map(C77054bz.f212670a);
        Objects.requireNonNull(cbVar2);
        map.ifPresent(new C77056ca(cbVar2));
        Objects.requireNonNull(cbVar2);
        optional2.ifPresent(new C77057cb(cbVar2));
        Objects.requireNonNull(cbVar2);
        optional.ifPresent(new C77058cc(cbVar2));
        C60870cx i = C60856cj.m92900i(Optional.empty());
        int b = zVar.mo71243b();
        C60870cx cxVar6 = i;
        int i2 = b - 1;
        if (b != 0) {
            if (i2 == 0) {
                cbVar = cbVar2;
                cxVar = dgVar.f212752f.mo28209i(afVar.B(j), "[NGA] SendMessageHelper.sendTextWithOpa.conversationIds", new C77059cd(uVar));
            } else if (i2 != 1) {
                cxVar = cxVar6;
                cbVar = cbVar2;
            } else {
                C52373pi piVar = (C52373pi) C52374pj.f137434e.createBuilder();
                String c = zVar.mo71242c();
                piVar.copyOnWrite();
                C52374pj pjVar = (C52374pj) piVar.instance;
                c.getClass();
                cbVar = cbVar2;
                pjVar.f137437b = 2;
                pjVar.f137438c = c;
                cxVar = C60856cj.m92900i(Optional.m71637of((C52374pj) piVar.build()));
            }
            C80303ay ayVar2 = ayVar;
            C77060ce ceVar = r1;
            C77089dg dgVar2 = dgVar;
            C74851z zVar2 = zVar;
            C22871g gVar = dgVar.f212752f;
            Optional optional4 = optional;
            String str3 = str2;
            af afVar2 = afVar;
            C77060ce ceVar2 = new C77060ce(dgVar2, j, optional2, optional4, afVar2);
            return dgVar.f212752f.mo28209i(gVar.mo28210j(cxVar, "[NGA] SendMessageHelper.sendTextWithOpa.contactEndpointOptional", ceVar), "[NGA] SendMessageHelper.sendTextWithOpa.personContact", new C77061cf(dgVar2, lVar, optional3, str, str3, afVar2, cbVar, zVar2, ayVar2));
        }
        throw null;
    }
}
