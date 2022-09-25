package com.google.android.apps.gsa.staticplugins.nga.p8089t.p8090a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.util.C90773bq;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62950b;
import java.util.List;
import java.util.concurrent.Callable;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.a.bl */
/* compiled from: PG */
public final /* synthetic */ class C103859bl implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C103868bu f289113a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f289114b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f289115c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f289116d;

    /* renamed from: e */
    public final /* synthetic */ C60870cx f289117e;

    /* renamed from: f */
    public final /* synthetic */ Optional f289118f;

    /* renamed from: g */
    public final /* synthetic */ String f289119g;

    public /* synthetic */ C103859bl(C103868bu buVar, C60870cx cxVar, C60870cx cxVar2, C60870cx cxVar3, C60870cx cxVar4, Optional optional, String str) {
        this.f289113a = buVar;
        this.f289114b = cxVar;
        this.f289115c = cxVar2;
        this.f289116d = cxVar3;
        this.f289117e = cxVar4;
        this.f289118f = optional;
        this.f289119g = str;
    }

    public final Object call() {
        C103868bu buVar = this.f289113a;
        C60870cx cxVar = this.f289114b;
        C60870cx cxVar2 = this.f289115c;
        C60870cx cxVar3 = this.f289116d;
        C60870cx cxVar4 = this.f289117e;
        Optional optional = this.f289118f;
        String str = this.f289119g;
        C58485gu guVar = (C58485gu) C60856cj.m92909r(cxVar3);
        C58485gu guVar2 = (C58485gu) C60856cj.m92909r(cxVar4);
        C103870bw bwVar = (C103870bw) C103877cc.f289164m.createBuilder();
        String str2 = (String) optional.map(C103861bn.f289121a).orElse(BuildConfig.FLAVOR);
        bwVar.copyOnWrite();
        C103877cc ccVar = (C103877cc) bwVar.instance;
        str2.getClass();
        ccVar.f289166a |= 1;
        ccVar.f289167b = str2;
        bwVar.copyOnWrite();
        C103877cc ccVar2 = (C103877cc) bwVar.instance;
        str.getClass();
        ccVar2.f289166a |= 2;
        ccVar2.f289168c = str;
        C63042fg b = C62950b.m95471b(buVar.f289136h);
        bwVar.copyOnWrite();
        C103877cc ccVar3 = (C103877cc) bwVar.instance;
        b.getClass();
        ccVar3.f289169d = b;
        ccVar3.f289166a |= 4;
        String languageTag = buVar.f289137i.mo93859b().toLanguageTag();
        bwVar.copyOnWrite();
        C103877cc ccVar4 = (C103877cc) bwVar.instance;
        languageTag.getClass();
        ccVar4.f289166a |= 8;
        ccVar4.f289170e = languageTag;
        String c = C90773bq.m148321c(buVar.f289131c);
        bwVar.copyOnWrite();
        C103877cc ccVar5 = (C103877cc) bwVar.instance;
        c.getClass();
        ccVar5.f289166a |= 16;
        ccVar5.f289171f = c;
        bwVar.copyOnWrite();
        C103877cc ccVar6 = (C103877cc) bwVar.instance;
        ccVar6.f289166a |= 32;
        ccVar6.f289172g = true;
        C103876cb cbVar = (C103876cb) Collection.EL.stream((C58485gu) C60856cj.m92909r(cxVar)).collect(buVar.mo93872e());
        bwVar.copyOnWrite();
        C103877cc ccVar7 = (C103877cc) bwVar.instance;
        cbVar.getClass();
        ccVar7.f289173h = cbVar;
        ccVar7.f289166a |= 64;
        C103876cb cbVar2 = (C103876cb) Collection.EL.stream((C58485gu) C60856cj.m92909r(cxVar2)).collect(buVar.mo93872e());
        bwVar.copyOnWrite();
        C103877cc ccVar8 = (C103877cc) bwVar.instance;
        cbVar2.getClass();
        ccVar8.f289174i = cbVar2;
        ccVar8.f289166a |= 128;
        C103876cb cbVar3 = (C103876cb) Collection.EL.stream(guVar).filter(C103862bo.f289122a).collect(buVar.mo93871c());
        bwVar.copyOnWrite();
        C103877cc ccVar9 = (C103877cc) bwVar.instance;
        cbVar3.getClass();
        ccVar9.f289175j = cbVar3;
        ccVar9.f289166a |= 256;
        C103876cb cbVar4 = (C103876cb) Collection.EL.stream(guVar).filter(C103863bp.f289123a).collect(buVar.mo93871c());
        bwVar.copyOnWrite();
        C103877cc ccVar10 = (C103877cc) bwVar.instance;
        cbVar4.getClass();
        ccVar10.f289176k = cbVar4;
        ccVar10.f289166a |= 512;
        bwVar.copyOnWrite();
        C103877cc ccVar11 = (C103877cc) bwVar.instance;
        C62971cq cqVar = ccVar11.f289177l;
        if (!cqVar.mo58948c()) {
            ccVar11.f289177l = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) guVar2, (List) ccVar11.f289177l);
        return (C103877cc) bwVar.build();
    }
}
