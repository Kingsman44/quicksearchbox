package com.google.android.apps.search.transcription.p10670f;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.search.transcription.p10669e.C141766a;
import com.google.android.apps.search.transcription.p10670f.p10676e.C141864a;
import com.google.android.apps.search.transcription.p10670f.p10676e.C141865b;
import com.google.android.libraries.p590as.p591a.C10771e;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4526f.C59052c;
import com.google.common.p4541l.C59332o;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C63088z;
import com.google.speech.p5208h.C66549af;
import com.google.speech.p5208h.C66550ag;
import com.google.speech.p5208h.C66596bv;
import com.google.speech.p5208h.C66597bw;
import com.google.speech.p5208h.C66598bx;
import com.google.speech.p5208h.C66599by;
import com.google.speech.p5208h.C66606cd;
import com.google.speech.p5208h.C66607ce;
import com.google.speech.p5208h.C66614cl;
import com.google.speech.p5208h.C66615cm;
import com.google.speech.p5208h.C66619cq;
import com.google.speech.p5208h.C66620cr;
import com.google.speech.p5208h.C66675i;
import com.google.speech.p5208h.C66676j;
import com.google.speech.p5208h.C66677k;
import com.google.speech.p5208h.C66678l;
import com.google.speech.p5224k.p5225a.C67239q;
import com.google.speech.p5224k.p5225a.C67244v;
import com.google.speech.recognizer.p5233a.C67451at;
import java.io.InputStream;
import java.util.Locale;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.transcription.f.ah */
/* compiled from: PG */
public final /* synthetic */ class C141789ah implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C141794am f384788a;

    /* renamed from: b */
    public final /* synthetic */ int f384789b;

    /* renamed from: c */
    public final /* synthetic */ int f384790c;

    /* renamed from: d */
    public final /* synthetic */ InputStream f384791d;

    public /* synthetic */ C141789ah(C141794am amVar, int i, int i2, InputStream inputStream) {
        this.f384788a = amVar;
        this.f384789b = i;
        this.f384790c = i2;
        this.f384791d = inputStream;
    }

    public final C60870cx apply(Object obj) {
        C141794am amVar = this.f384788a;
        int i = this.f384789b;
        int i2 = this.f384790c;
        InputStream inputStream = this.f384791d;
        Void voidR = (Void) obj;
        C70862aj ajVar = amVar.f384807g;
        ajVar.getClass();
        C141851bs bsVar = amVar.f384804d;
        Context context = amVar.f384803c;
        C66606cd cdVar = (C66606cd) C66607ce.f181191f.createBuilder();
        cdVar.copyOnWrite();
        C66607ce ceVar = (C66607ce) cdVar.instance;
        ceVar.f181193a |= 2;
        ceVar.f181195c = true;
        String str = true != bsVar.mo116822d().isEmpty() ? "multi-recognizer" : "recognizer";
        cdVar.copyOnWrite();
        C66607ce ceVar2 = (C66607ce) cdVar.instance;
        ceVar2.f181193a |= 1;
        ceVar2.f181194b = str;
        int x = bsVar.mo116842x();
        if (true == bsVar.mo116836r()) {
            x = 4;
        }
        String a = C141849bq.m230195a(x);
        if (x != 0) {
            String replace = a.toLowerCase(Locale.US).replace('_', '-');
            C66598bx bxVar = (C66598bx) C66599by.f181159p.createBuilder();
            String n = bsVar.mo116832n();
            bxVar.copyOnWrite();
            C66599by byVar = (C66599by) bxVar.instance;
            n.getClass();
            byVar.f181162a |= 2048;
            byVar.f181175n = n;
            bxVar.copyOnWrite();
            C66599by byVar2 = (C66599by) bxVar.instance;
            byVar2.f181162a |= 4;
            byVar2.f181167f = "Android";
            String str2 = Build.DISPLAY;
            bxVar.copyOnWrite();
            C66599by byVar3 = (C66599by) bxVar.instance;
            str2.getClass();
            byVar3.f181162a |= 8;
            byVar3.f181168g = str2;
            String str3 = Build.MODEL;
            bxVar.copyOnWrite();
            C66599by byVar4 = (C66599by) bxVar.instance;
            str3.getClass();
            byVar4.f181162a |= 64;
            byVar4.f181171j = str3;
            bxVar.copyOnWrite();
            C66599by byVar5 = (C66599by) bxVar.instance;
            replace.getClass();
            byVar5.f181162a |= 16;
            byVar5.f181169h = replace;
            try {
                String num = Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
                bxVar.copyOnWrite();
                C66599by byVar6 = (C66599by) bxVar.instance;
                num.getClass();
                byVar6.f181162a |= 32;
                byVar6.f181170i = num;
                C141864a aVar = new C141864a(C66599by.f181160q, (C66599by) bxVar.build());
                C66614cl clVar = (C66614cl) C66615cm.f181220j.createBuilder();
                C66596bv bvVar = (C66596bv) C66597bw.f181154d.createBuilder();
                bvVar.copyOnWrite();
                C66597bw bwVar = (C66597bw) bvVar.instance;
                bwVar.f181156a |= 2;
                bwVar.f181158c = 1;
                String l = bsVar.mo116830l();
                bvVar.copyOnWrite();
                C66597bw bwVar2 = (C66597bw) bvVar.instance;
                l.getClass();
                bwVar2.f181156a |= 1;
                bwVar2.f181157b = l;
                C66597bw bwVar3 = (C66597bw) bvVar.build();
                clVar.copyOnWrite();
                C66615cm cmVar = (C66615cm) clVar.instance;
                bwVar3.getClass();
                cmVar.f181226d = bwVar3;
                cmVar.f181223a |= 1;
                C58485gu d = bsVar.mo116822d();
                int size = d.size();
                int i3 = 0;
                while (i3 < size) {
                    String str4 = (String) d.get(i3);
                    C66596bv bvVar2 = (C66596bv) C66597bw.f181154d.createBuilder();
                    bvVar2.copyOnWrite();
                    C66597bw bwVar4 = (C66597bw) bvVar2.instance;
                    bwVar4.f181156a |= 2;
                    bwVar4.f181158c = 1;
                    bvVar2.copyOnWrite();
                    C66597bw bwVar5 = (C66597bw) bvVar2.instance;
                    str4.getClass();
                    C58485gu guVar = d;
                    bwVar5.f181156a |= 1;
                    bwVar5.f181157b = str4;
                    C66597bw bwVar6 = (C66597bw) bvVar2.build();
                    clVar.copyOnWrite();
                    C66615cm cmVar2 = (C66615cm) clVar.instance;
                    bwVar6.getClass();
                    cmVar2.mo59692b();
                    cmVar2.f181227e.add(bwVar6);
                    i3++;
                    d = guVar;
                }
                C141864a aVar2 = new C141864a(C66615cm.f181221k, (C66615cm) clVar.build());
                C66549af afVar = (C66549af) C66550ag.f180992c.createBuilder();
                afVar.copyOnWrite();
                C66550ag agVar = (C66550ag) afVar.instance;
                agVar.f180995a |= 1;
                agVar.f180996b = true;
                C141864a aVar3 = new C141864a(C66550ag.f180993d, (C66550ag) afVar.build());
                C66677k kVar = (C66677k) C66678l.f181384f.createBuilder();
                C67451at atVar = C67451at.OGG_OPUS;
                kVar.copyOnWrite();
                C66678l lVar = (C66678l) kVar.instance;
                lVar.f181389b = atVar.f183321p;
                lVar.f181388a |= 1;
                kVar.copyOnWrite();
                C66678l lVar2 = (C66678l) kVar.instance;
                lVar2.f181388a |= 2;
                lVar2.f181390c = (float) i;
                kVar.copyOnWrite();
                C66678l lVar3 = (C66678l) kVar.instance;
                lVar3.f181388a |= 4;
                lVar3.f181391d = i2;
                C141864a aVar4 = new C141864a(C66678l.f181385g, (C66678l) kVar.build());
                if (bsVar.mo116819a() > 0) {
                    C67239q qVar = (C67239q) C67244v.f182771s.createBuilder();
                    boolean p = bsVar.mo116834p();
                    qVar.copyOnWrite();
                    C67244v vVar = (C67244v) qVar.instance;
                    vVar.f182774a |= 8;
                    vVar.f182779f = p;
                    boolean p2 = bsVar.mo116834p();
                    qVar.copyOnWrite();
                    C67244v vVar2 = (C67244v) qVar.instance;
                    vVar2.f182774a |= 32;
                    vVar2.f182780g = p2;
                    qVar.copyOnWrite();
                    C67244v vVar3 = (C67244v) qVar.instance;
                    vVar3.f182774a |= 33554432;
                    vVar3.f182786m = true;
                    qVar.copyOnWrite();
                    C67244v vVar4 = (C67244v) qVar.instance;
                    vVar4.f182774a |= C89885b.HTTP_VALUE;
                    vVar4.f182785l = true;
                    int i4 = true != bsVar.mo116840v() ? 0 : 2;
                    qVar.copyOnWrite();
                    C67244v vVar5 = (C67244v) qVar.instance;
                    vVar5.f182774a |= 1024;
                    vVar5.f182782i = i4;
                    int a2 = bsVar.mo116819a();
                    qVar.copyOnWrite();
                    C67244v vVar6 = (C67244v) qVar.instance;
                    vVar6.f182774a |= 2;
                    vVar6.f182777d = a2;
                    C141864a aVar5 = new C141864a(C67244v.f182772t, (C67244v) qVar.build());
                    C66619cq cqVar = (C66619cq) C66620cr.f181239c.createBuilder();
                    cqVar.copyOnWrite();
                    C66620cr crVar = (C66620cr) cqVar.instance;
                    crVar.f181242a |= 1;
                    crVar.f181243b = 1000;
                    C58485gu s = C58485gu.m89851s(aVar, aVar2, aVar3, aVar4, aVar5, new C141864a(C66620cr.f181240d, (C66620cr) cqVar.build()));
                    int i5 = ((C58724pq) s).f156474d;
                    for (int i6 = 0; i6 < i5; i6++) {
                        ((C141864a) s.get(i6)).accept(cdVar);
                    }
                    C66607ce ceVar3 = (C66607ce) cdVar.build();
                    ((C59052c) ((C59052c) C141865b.f384966a.mo56224b()).mo56372aa(41928)).mo56389s("S3Request:\n%s", ceVar3);
                    ((C141766a) ajVar).mo20123c(ceVar3);
                    InputStream d2 = C10771e.m25767d(inputStream, 24000, i, i2);
                    byte[] bArr = new byte[224];
                    while (true) {
                        if (!amVar.f384806f.get()) {
                            int a3 = C59332o.m92210a(d2, bArr, 0, 224);
                            if (a3 > 0) {
                                C66675i iVar = (C66675i) C66676j.f181378c.createBuilder();
                                C63088z D = C63088z.m96142D(bArr, 0, a3);
                                iVar.copyOnWrite();
                                C66676j jVar = (C66676j) iVar.instance;
                                jVar.f181382a |= 1;
                                jVar.f181383b = D;
                                C70862aj ajVar2 = amVar.f384807g;
                                C66606cd cdVar2 = (C66606cd) C66607ce.f181191f.createBuilder();
                                cdVar2.mo58885m(C66676j.f181379d, (C66676j) iVar.build());
                                ((C141766a) ajVar2).mo20123c((C66607ce) cdVar2.build());
                                continue;
                            }
                            if (a3 != 224) {
                                C70862aj ajVar3 = amVar.f384807g;
                                C66606cd cdVar3 = (C66606cd) C66607ce.f181191f.createBuilder();
                                cdVar3.copyOnWrite();
                                C66607ce ceVar4 = (C66607ce) cdVar3.instance;
                                ceVar4.f181193a |= 8;
                                ceVar4.f181197e = true;
                                ((C141766a) ajVar3).mo20123c((C66607ce) cdVar3.build());
                                amVar.f384807g.mo20121a();
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    return C60866ct.f164955a;
                }
                throw new IllegalStateException("Illegal Max Results param, should be >= 1");
            } catch (PackageManager.NameNotFoundException e) {
                throw new IllegalStateException(e);
            }
        } else {
            throw null;
        }
    }
}
