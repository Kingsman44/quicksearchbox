package com.google.android.libraries.p1969j.p1970a.p1974b;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.common.internal.C143918bg;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.tasks.C146021aq;
import com.google.android.gms.udc.C146070l;
import com.google.android.gms.udc.UdcCacheRequest;
import com.google.android.gms.udc.UdcCacheResponse;
import com.google.android.gms.udc.p10875a.C146057j;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import com.google.p4184bj.p4193c.p4194a.C55912b;
import com.google.p4184bj.p4193c.p4197c.C55927aa;
import com.google.p4184bj.p4193c.p4197c.C55928ab;
import com.google.p4184bj.p4193c.p4197c.C55936aj;
import com.google.p4184bj.p4193c.p4197c.C55938al;
import com.google.p4184bj.p4193c.p4197c.C55945as;
import com.google.p4184bj.p4193c.p4197c.C55946at;
import com.google.p4184bj.p4193c.p4197c.C55951ay;
import com.google.p4184bj.p4193c.p4197c.C55960bg;
import com.google.p4184bj.p4193c.p4197c.C55979o;
import com.google.p4230bn.p4234b.p4235a.p4236a.p4237a.C56116b;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import p5304e.p5305a.p5306a.p5388m.p5389a.C68820a;
import p5488io.grpc.C70286co;
import p5488io.grpc.C70761fa;
import p5488io.grpc.C70851i;
import p5488io.grpc.p5520a.C70136d;
import p5488io.grpc.p5533i.C70863b;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.libraries.j.a.b.v */
/* compiled from: PG */
public final /* synthetic */ class C23972v implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C23948af f65555a;

    /* renamed from: b */
    public final /* synthetic */ C55912b f65556b;

    /* renamed from: c */
    public final /* synthetic */ String f65557c;

    /* renamed from: d */
    public final /* synthetic */ Context f65558d;

    /* renamed from: e */
    public final /* synthetic */ C55960bg f65559e;

    /* renamed from: f */
    public final /* synthetic */ Account f65560f;

    public /* synthetic */ C23972v(C23948af afVar, C55912b bVar, String str, Context context, C55960bg bgVar, Account account) {
        this.f65555a = afVar;
        this.f65556b = bVar;
        this.f65557c = str;
        this.f65558d = context;
        this.f65559e = bgVar;
        this.f65560f = account;
    }

    public final Object call() {
        C58833ax axVar;
        C23948af afVar = this.f65555a;
        C55912b bVar = this.f65556b;
        String str = this.f65557c;
        Context context = this.f65558d;
        C55960bg bgVar = this.f65559e;
        Account account = this.f65560f;
        C70286co e = afVar.mo29364e();
        try {
            C55945as asVar = (C55945as) C55946at.f148915f.createBuilder();
            int i = bVar.f148826V;
            asVar.copyOnWrite();
            C55946at atVar = (C55946at) asVar.instance;
            atVar.f148917a |= 1;
            atVar.f148918b = i;
            asVar.copyOnWrite();
            C55946at atVar2 = (C55946at) asVar.instance;
            str.getClass();
            atVar2.f148917a |= 4;
            atVar2.f148920d = str;
            C55979o d = C23948af.m44535d(context, bgVar);
            asVar.copyOnWrite();
            C55946at atVar3 = (C55946at) asVar.instance;
            d.getClass();
            atVar3.f148921e = d;
            atVar3.f148917a |= 8;
            C56116b bVar2 = (C56116b) C23948af.f65486a.get(bVar);
            if (bVar2 == null) {
                axVar = C58836b.f156633a;
            } else {
                C146006ab c = C143918bg.m233957c(C146057j.m237909a(C23947ae.m44533a(context, account).f389929D, new UdcCacheRequest(new int[]{bVar2.f149511l})), new C146070l());
                C146021aq.m237853g(c, C23948af.f65489d, TimeUnit.MILLISECONDS);
                if (c.mo122491j()) {
                    UdcCacheResponse udcCacheResponse = (UdcCacheResponse) c.mo122488g();
                    C58838bb.m90867b(udcCacheResponse, "UDC returned empty result for device level bit %s", bVar2);
                    for (UdcCacheResponse.UdcSetting udcSetting : udcCacheResponse.f394770a) {
                        if (udcSetting.f394774a == bVar2.f149511l) {
                            int i2 = udcSetting.f394775b;
                            Boolean bool = (Boolean) C23948af.f65487b.get(Integer.valueOf(i2));
                            C58838bb.m90862C(bool, "Invalid state of the device level bit %s", i2);
                            C55927aa aaVar = (C55927aa) C55928ab.f148876d.createBuilder();
                            if (bVar.f148826V == 3) {
                                boolean booleanValue = bool.booleanValue();
                                aaVar.copyOnWrite();
                                C55928ab abVar = (C55928ab) aaVar.instance;
                                abVar.f148878a |= 1;
                                abVar.f148879b = booleanValue;
                            }
                            axVar = C58833ax.m90834k((C55928ab) aaVar.build());
                        }
                    }
                    throw new IllegalStateException("Could not find in UDC cache device level bit " + bVar2.f149511l);
                }
                throw new ExecutionException("Could not load device level bit  " + bVar2.f149511l, c.mo122487f());
            }
            if (axVar.mo56113h()) {
                C55928ab abVar2 = (C55928ab) axVar.mo56107c();
                asVar.copyOnWrite();
                C55946at atVar4 = (C55946at) asVar.instance;
                abVar2.getClass();
                atVar4.f148919c = abVar2;
                atVar4.f148917a |= 2;
            }
            asVar.build();
            C55936aj ajVar = (C55936aj) ((C55936aj) C70863b.m103730b(e, C70851i.f189015a).mo62574m(new C70136d(C23948af.m44534a(context, account), C70136d.f186958b))).mo62575n(C68820a.m99373b(), TimeUnit.MILLISECONDS);
            C55951ay ayVar = (C55951ay) C70876o.m103762c(ajVar.f189039a, C55938al.m87864b(), ajVar.f189040b, (C55946at) asVar.build());
            e.mo61975g();
            return ayVar;
        } catch (C70761fa e2) {
            ((C59052c) ((C59052c) C23948af.f65488c.mo56224b()).mo56372aa(47952)).mo56386p("GetSettingText request to FPOP failed. Increase log verbosity level to get more information or consider debugging via Sherlog.");
            throw e2;
        } catch (Throwable th) {
            e.mo61975g();
            throw th;
        }
    }
}
