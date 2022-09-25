package com.google.android.libraries.p579ar.faceviewer.p580a.p586f;

import android.content.Intent;
import android.net.Uri;
import android.util.Base64;
import com.google.android.libraries.p579ar.faceviewer.C10649c;
import com.google.android.libraries.p579ar.faceviewer.p580a.p582b.C10570d;
import com.google.android.libraries.p579ar.faceviewer.p580a.p585e.C10598as;
import com.google.android.libraries.p579ar.faceviewer.p580a.p585e.C10599at;
import com.google.android.libraries.p579ar.faceviewer.p580a.p585e.C10600au;
import com.google.android.libraries.p579ar.faceviewer.p587b.C10645j;
import com.google.android.libraries.p579ar.faceviewer.p587b.C10646k;
import com.google.android.libraries.p579ar.faceviewer.p588c.C10650a;
import com.google.android.libraries.p579ar.faceviewer.p588c.C10653d;
import com.google.android.libraries.p579ar.faceviewer.p588c.C10654e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.SettableFuture;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protos.youtube.p5162a.p5163a.C65972ab;
import com.google.protos.youtube.p5162a.p5163a.C65997n;
import com.google.protos.youtube.p5162a.p5163a.C65998o;
import com.google.protos.youtube.p5162a.p5163a.C65999p;
import com.google.protos.youtube.p5162a.p5163a.C66001r;
import com.google.protos.youtube.p5162a.p5163a.C66007x;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.libraries.ar.faceviewer.a.f.b */
/* compiled from: PG */
public final class C10627b implements C10645j {

    /* renamed from: a */
    public static final C59071e f35504a = C59071e.m91332i("com.google.android.libraries.ar.faceviewer.a.f.b");

    /* renamed from: b */
    public final C10646k f35505b;

    /* renamed from: c */
    public final SettableFuture f35506c = new SettableFuture();

    /* renamed from: d */
    public C10653d f35507d;

    public C10627b(C10646k kVar) {
        this.f35505b = kVar;
        kVar.mo18674j(this);
    }

    /* renamed from: a */
    public final void mo18663a(String str) {
        C65972ab abVar;
        C66007x xVar;
        if (str != null) {
            int i = 2;
            try {
                C65997n nVar = (C65997n) C62942bv.parseFrom((C62942bv) C65997n.f179488c, Base64.decode(str, 2), C62921ba.m95368a());
                C10653d dVar = this.f35507d;
                if (dVar == null) {
                    ((C59052c) ((C59052c) f35504a.mo56225c()).mo56372aa(42297)).mo56386p("handleMessageFromWeb before context initialized.");
                    return;
                }
                int i2 = nVar.f179490a;
                if (i2 == 0) {
                    i = 8;
                } else if (i2 == 1) {
                    i = 1;
                } else if (i2 != 2) {
                    i = 3;
                    if (i2 != 3) {
                        i = i2 != 7 ? i2 != 8 ? i2 != 14 ? i2 != 18 ? 0 : 7 : 6 : 5 : 4;
                    }
                }
                int i3 = i - 1;
                if (i != 0) {
                    switch (i3) {
                        case 0:
                            C10649c cVar = ((C10650a) dVar).f35549e;
                            cVar.f35542a.mo18635d(cVar.f35543b.mo18626a());
                            ((C10650a) this.f35507d).f35549e.f35542a.mo18638g(C10654e.ASSET_SWITCH);
                            if (nVar.f179490a == 1) {
                                abVar = (C65972ab) nVar.f179491b;
                            } else {
                                abVar = C65972ab.f179440b;
                            }
                            String str2 = abVar.f179442a;
                            C10653d dVar2 = this.f35507d;
                            if (dVar2 != null) {
                                C10600au auVar = ((C10650a) dVar2).f35549e.f35544c.f35565f;
                                List singletonList = Collections.singletonList(str2);
                                C10653d dVar3 = auVar.f35441k;
                                if (dVar3 != null) {
                                    C10649c cVar2 = ((C10650a) dVar3).f35549e;
                                    SettableFuture settableFuture = cVar2.f35544c.f35563d.f35361d;
                                    cVar2.f35542a.mo18638g(C10654e.RENDER_INIT);
                                    C60856cj.m92911t(auVar.f35440j.mo18712b(new C10598as(auVar, settableFuture, singletonList)), new C10599at(auVar, singletonList), ((C10650a) auVar.f35441k).f35547c);
                                    return;
                                }
                                return;
                            }
                            ((C59052c) ((C59052c) f35504a.mo56225c()).mo56372aa(42299)).mo56386p("Cannot set effect when faceViewerContext is null.");
                            return;
                        case 1:
                            ((C59052c) ((C59052c) f35504a.mo56224b()).mo56372aa(42295)).mo56386p("handle log");
                            return;
                        case 2:
                            C10570d dVar4 = ((C10650a) dVar).f35549e.f35544c.f35563d;
                            dVar4.f35363f = true;
                            dVar4.mo18631d();
                            return;
                        case 3:
                            ((C59052c) ((C59052c) f35504a.mo56224b()).mo56372aa(42296)).mo56386p("handle open link");
                            C10570d dVar5 = ((C10650a) this.f35507d).f35549e.f35544c.f35563d;
                            if (nVar.f179490a == 7) {
                                xVar = (C66007x) nVar.f179491b;
                            } else {
                                xVar = C66007x.f179502b;
                            }
                            String str3 = xVar.f179504a;
                            Intent intent = new Intent("android.intent.action.VIEW");
                            intent.setData(Uri.parse(str3));
                            dVar5.f35359b.startActivity(intent);
                            return;
                        case 4:
                            this.f35506c.mo57356n(true);
                            return;
                        case 5:
                            C10570d dVar6 = ((C10650a) dVar).f35549e.f35544c.f35563d;
                            dVar6.f35363f = false;
                            if (((C10650a) dVar6.f35362e).f35545a.mo18694c()) {
                                C10627b bVar = ((C10650a) dVar6.f35362e).f35549e.f35544c.f35566g.f35514b;
                                C65998o oVar = (C65998o) C65999p.f179492c.createBuilder();
                                C66001r rVar = C66001r.f179496a;
                                oVar.copyOnWrite();
                                C65999p pVar = (C65999p) oVar.instance;
                                rVar.getClass();
                                pVar.f179495b = rVar;
                                pVar.f179494a = 13;
                                bVar.mo18664b((C65999p) oVar.build());
                            }
                            ((C10650a) dVar6.f35362e).f35549e.f35544c.f35565f.f35438h.mo18659d();
                            return;
                        case 6:
                            C10570d dVar7 = ((C10650a) dVar).f35549e.f35544c.f35563d;
                            dVar7.f35363f = true;
                            Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                            intent2.setData(Uri.fromParts("package", dVar7.f35359b.getPackageName(), (String) null));
                            dVar7.f35359b.startActivity(intent2);
                            return;
                        default:
                            return;
                    }
                } else {
                    throw null;
                }
            } catch (C62974ct e) {
                ((C59052c) ((C59052c) ((C59052c) f35504a.mo56225c()).mo56382g(e)).mo56372aa(42294)).mo56386p("Unable to parse protocol buffer from Web Message");
            }
        }
    }

    /* renamed from: b */
    public final void mo18664b(C65999p pVar) {
        C10653d dVar = this.f35507d;
        if (dVar == null) {
            ((C59052c) ((C59052c) f35504a.mo56225c()).mo56372aa(42298)).mo56386p("sendMessageToWeb before context initialized.");
        } else {
            C60856cj.m92911t(this.f35506c, new C10626a(this, pVar), ((C10650a) dVar).f35547c);
        }
    }
}
