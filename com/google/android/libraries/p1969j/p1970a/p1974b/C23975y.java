package com.google.android.libraries.p1969j.p1970a.p1974b;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.common.api.C143851w;
import com.google.android.gms.common.internal.C143918bg;
import com.google.android.gms.tasks.C146021aq;
import com.google.android.gms.udc.C146071m;
import com.google.android.gms.udc.UdcWriteLocalSettingsRequest;
import com.google.android.gms.udc.p10875a.C146054g;
import com.google.common.p4522b.C58471gg;
import com.google.common.p4526f.C59052c;
import com.google.p4184bj.p4193c.p4194a.C55912b;
import com.google.p4184bj.p4193c.p4197c.C55936aj;
import com.google.p4184bj.p4193c.p4197c.C55938al;
import com.google.p4184bj.p4193c.p4197c.C55960bg;
import com.google.p4184bj.p4193c.p4197c.C55961bh;
import com.google.p4184bj.p4193c.p4197c.C55962bi;
import com.google.p4184bj.p4193c.p4197c.C55963bj;
import com.google.p4184bj.p4193c.p4197c.C55964bk;
import com.google.p4184bj.p4193c.p4197c.C55966bm;
import com.google.p4184bj.p4193c.p4197c.C55979o;
import com.google.p4230bn.p4234b.p4235a.p4236a.p4237a.C56116b;
import com.google.protobuf.C63088z;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import p5304e.p5305a.p5306a.p5388m.p5389a.C68820a;
import p5488io.grpc.C70286co;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70761fa;
import p5488io.grpc.C70851i;
import p5488io.grpc.C70888j;
import p5488io.grpc.p5520a.C70136d;
import p5488io.grpc.p5531h.p5532a.C70850d;
import p5488io.grpc.p5533i.C70863b;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.libraries.j.a.b.y */
/* compiled from: PG */
public final /* synthetic */ class C23975y implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C23948af f65568a;

    /* renamed from: b */
    public final /* synthetic */ C58471gg f65569b;

    /* renamed from: c */
    public final /* synthetic */ Context f65570c;

    /* renamed from: d */
    public final /* synthetic */ Account f65571d;

    /* renamed from: e */
    public final /* synthetic */ C55960bg f65572e;

    /* renamed from: f */
    public final /* synthetic */ C63088z f65573f;

    /* renamed from: g */
    public final /* synthetic */ C55912b f65574g;

    public /* synthetic */ C23975y(C23948af afVar, C58471gg ggVar, Context context, Account account, C55960bg bgVar, C63088z zVar, C55912b bVar) {
        this.f65568a = afVar;
        this.f65569b = ggVar;
        this.f65570c = context;
        this.f65571d = account;
        this.f65572e = bgVar;
        this.f65573f = zVar;
        this.f65574g = bVar;
    }

    public final Object call() {
        C70338di diVar;
        C23948af afVar = this.f65568a;
        C58471gg<Integer> ggVar = this.f65569b;
        Context context = this.f65570c;
        Account account = this.f65571d;
        C55960bg bgVar = this.f65572e;
        C63088z zVar = this.f65573f;
        C55912b bVar = this.f65574g;
        if (!ggVar.isEmpty() || C68820a.f184897a.mo6453a().mo60509g()) {
            C55961bh bhVar = (C55961bh) C55964bk.f149032g.createBuilder();
            C55979o d = C23948af.m44535d(context, bgVar);
            bhVar.copyOnWrite();
            C55964bk bkVar = (C55964bk) bhVar.instance;
            d.getClass();
            bkVar.f149036c = d;
            bkVar.f149034a |= 1;
            bhVar.copyOnWrite();
            C55964bk bkVar2 = (C55964bk) bhVar.instance;
            zVar.getClass();
            bkVar2.f149034a |= 2;
            bkVar2.f149037d = zVar;
            for (Integer intValue : ggVar) {
                C55962bi biVar = (C55962bi) C55963bj.f149027d.createBuilder();
                int intValue2 = intValue.intValue();
                biVar.copyOnWrite();
                C55963bj bjVar = (C55963bj) biVar.instance;
                bjVar.f149029a |= 1;
                bjVar.f149030b = intValue2;
                biVar.copyOnWrite();
                C55963bj bjVar2 = (C55963bj) biVar.instance;
                bjVar2.f149029a |= 2;
                bjVar2.f149031c = true;
                bhVar.mo54306a(biVar);
            }
            bhVar.build();
            C70286co e = afVar.mo29364e();
            try {
                C55936aj ajVar = (C55936aj) ((C55936aj) C70863b.m103730b(e, C70851i.f189015a).mo62574m(new C70136d(C23948af.m44534a(context, account), C70136d.f186958b))).mo62575n(C68820a.m99373b(), TimeUnit.MILLISECONDS);
                C55964bk bkVar3 = (C55964bk) bhVar.build();
                C70888j jVar = ajVar.f189039a;
                C70338di diVar2 = C55938al.f148900b;
                if (diVar2 == null) {
                    synchronized (C55938al.class) {
                        diVar = C55938al.f148900b;
                        if (diVar == null) {
                            C70335df d2 = C70338di.m102603d();
                            d2.f187487c = C70337dh.UNARY;
                            d2.f187488d = C70338di.m102602c("footprints.oneplatform.FootprintsService", "UpdateActivityControlsSettings");
                            d2.f187489e = true;
                            d2.f187485a = C70850d.m103697c(C55964bk.f149032g);
                            d2.f187486b = C70850d.m103697c(C55966bm.f149040b);
                            diVar = d2.mo62040a();
                            C55938al.f148900b = diVar;
                        }
                    }
                    diVar2 = diVar;
                }
                C55966bm bmVar = (C55966bm) C70876o.m103762c(jVar, diVar2, ajVar.f189040b, bkVar3);
                e.mo61975g();
            } catch (C70761fa e2) {
                try {
                    ((C59052c) ((C59052c) C23948af.f65488c.mo56224b()).mo56372aa(47956)).mo56386p("UpdateSettings request to FPOP failed. Increase log verbosity level to get more information or consider debugging via Sherlog.");
                    throw e2;
                } catch (Throwable th) {
                    e.mo61975g();
                    throw th;
                }
            }
        }
        if (!C23948af.f65486a.containsKey(bVar)) {
            return null;
        }
        C146071m a = C23947ae.m44533a(context, account);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new UdcWriteLocalSettingsRequest.SettingChange(((C56116b) C23948af.f65486a.get(bVar)).f149511l, true));
        UdcWriteLocalSettingsRequest udcWriteLocalSettingsRequest = new UdcWriteLocalSettingsRequest((UdcWriteLocalSettingsRequest.SettingChange[]) arrayList.toArray(new UdcWriteLocalSettingsRequest.SettingChange[0]));
        C143851w wVar = a.f389929D;
        C146054g gVar = new C146054g(wVar, udcWriteLocalSettingsRequest);
        wVar.mo119159d(gVar);
        C146021aq.m237853g(C143918bg.m233956b(gVar), C23948af.f65489d, TimeUnit.MILLISECONDS);
        return null;
    }
}
