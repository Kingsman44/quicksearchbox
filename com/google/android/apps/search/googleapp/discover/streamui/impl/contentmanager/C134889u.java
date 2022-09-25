package com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager;

import android.app.PendingIntent;
import android.content.Intent;
import android.view.LayoutInflater;
import com.facebook.litho.C6411u;
import com.facebook.litho.widget.C6491cw;
import com.facebook.litho.widget.C6535em;
import com.facebook.litho.widget.C6544i;
import com.facebook.litho.widget.C6546k;
import com.google.android.apps.search.googleapp.discover.p10181d.C134228q;
import com.google.android.apps.search.googleapp.discover.p10214s.C134540ae;
import com.google.android.apps.search.googleapp.discover.p10214s.C134543ah;
import com.google.android.apps.search.googleapp.discover.p10214s.C134544ai;
import com.google.android.apps.search.googleapp.discover.p10214s.C134588f;
import com.google.android.apps.search.googleapp.discover.p10214s.C134589g;
import com.google.android.apps.search.googleapp.discover.p10248y.C135245bf;
import com.google.android.apps.search.googleapp.discover.p10248y.C135246bg;
import com.google.android.apps.search.googleapp.discover.p10248y.C135251bl;
import com.google.android.apps.search.googleapp.discover.p10248y.C135252c;
import com.google.android.apps.search.googleapp.discover.p10248y.C135254e;
import com.google.android.apps.search.googleapp.discover.p10248y.C135256g;
import com.google.android.apps.search.googleapp.discover.p10248y.C135260k;
import com.google.android.apps.search.googleapp.discover.p10248y.C135261l;
import com.google.android.apps.search.googleapp.discover.p10248y.C135262m;
import com.google.android.apps.search.googleapp.discover.p10248y.C135264o;
import com.google.android.apps.search.googleapp.discover.p10248y.C135265p;
import com.google.android.apps.search.googleapp.discover.p10248y.C135266q;
import com.google.android.apps.search.googleapp.discover.p10248y.C135267r;
import com.google.android.apps.search.googleapp.discover.p10248y.C135268s;
import com.google.android.apps.search.googleapp.discover.p10249z.C135359p;
import com.google.android.apps.search.googleapp.discover.streamui.impl.p10234a.C134780a;
import com.google.android.apps.search.googleapp.discover.streamui.impl.p10234a.C134781aa;
import com.google.android.apps.search.googleapp.discover.streamui.impl.p10234a.C134782b;
import com.google.android.apps.search.googleapp.discover.streamui.impl.p10234a.C134783c;
import com.google.android.apps.search.googleapp.discover.streamui.impl.p10234a.C134784d;
import com.google.android.apps.search.googleapp.discover.streamui.impl.p10234a.C134785e;
import com.google.android.apps.search.googleapp.discover.streamui.impl.p10234a.C134791k;
import com.google.android.apps.search.googleapp.discover.streamui.impl.p10234a.C134792l;
import com.google.android.apps.search.googleapp.discover.streamui.impl.p10234a.C134793m;
import com.google.android.apps.search.googleapp.discover.streamui.impl.p10234a.C134794n;
import com.google.android.apps.search.googleapp.discover.streamui.impl.p10234a.C134795o;
import com.google.android.apps.search.googleapp.discover.streamui.impl.p10234a.C134797q;
import com.google.android.apps.search.googleapp.discover.streamui.impl.p10234a.C134798r;
import com.google.android.apps.search.googleapp.discover.streamui.impl.p10234a.C134799s;
import com.google.android.apps.search.googleapp.discover.streamui.impl.p10234a.C134800t;
import com.google.android.apps.search.googleapp.discover.streamui.impl.p10234a.C134801u;
import com.google.android.apps.search.googleapp.discover.streamui.impl.p10234a.C134802v;
import com.google.android.apps.search.googleapp.discover.streamui.impl.p10234a.C134803w;
import com.google.android.apps.search.googleapp.discover.streamui.impl.p10234a.C134804x;
import com.google.android.apps.search.googleapp.discover.streamui.impl.p10234a.C134805y;
import com.google.android.apps.search.googleapp.discover.streamui.impl.p10234a.C134806z;
import com.google.android.apps.search.googleapp.discover.streamui.impl.p10235b.C134836c;
import com.google.android.apps.search.googleapp.discover.streamui.impl.p10235b.C134838e;
import com.google.android.apps.search.googleapp.discover.streamui.impl.p10235b.C134839f;
import com.google.android.apps.search.googleapp.discover.streamui.p10227c.C134707e;
import com.google.android.apps.search.googleapp.discover.streamui.p10227c.C134709g;
import com.google.android.apps.search.googleapp.discover.streamui.p10228d.C134717c;
import com.google.android.apps.search.googleapp.discover.streamui.p10228d.C134718d;
import com.google.android.apps.search.googleapp.discover.streamui.p10228d.C134719e;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.elements.interfaces.C21249as;
import com.google.android.libraries.elements.interfaces.C21319z;
import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.android.libraries.search.rendering.xuikit.p3097a.C39906a;
import com.google.android.libraries.search.rendering.xuikit.p3097a.C40062d;
import com.google.android.libraries.search.rendering.xuikit.p3097a.C40075o;
import com.google.android.libraries.search.rendering.xuikit.p3097a.C40076p;
import com.google.android.libraries.search.rendering.xuikit.p3097a.C40083w;
import com.google.android.libraries.search.rendering.xuikit.p3131d.C40303a;
import com.google.android.libraries.search.rendering.xuikit.p3131d.C40306b;
import com.google.android.libraries.search.rendering.xuikit.p3131d.C40341d;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4552o.p4566l.C60216p;
import com.google.common.p4552o.p4566l.C60217q;
import com.google.common.p4552o.p4566l.C60218r;
import com.google.common.p4552o.p4566l.C60220t;
import com.google.p4283bv.p4354e.C57528m;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57776h;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57784p;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63070h;
import java.util.Map;
import p5462h.C69677g;
import p5462h.p5472e.C69598b;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.p5490b.p5494b.C69802a;

/* renamed from: com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.u */
/* compiled from: PG */
public final class C134889u {

    /* renamed from: a */
    private final C134782b f367203a;

    /* renamed from: b */
    private final C134873e f367204b;

    /* renamed from: c */
    private final C134784d f367205c;

    /* renamed from: d */
    private final C134793m f367206d;

    /* renamed from: e */
    private final C134719e f367207e;

    /* renamed from: f */
    private final C134795o f367208f;

    /* renamed from: g */
    private final C134799s f367209g;

    /* renamed from: h */
    private final C134801u f367210h;

    /* renamed from: i */
    private final C134839f f367211i;

    /* renamed from: j */
    private final C134803w f367212j;

    /* renamed from: k */
    private final C134805y f367213k;

    /* renamed from: l */
    private final C134781aa f367214l;

    public C134889u(C134782b bVar, C134873e eVar, C134784d dVar, C134793m mVar, C134719e eVar2, C134795o oVar, C134799s sVar, C134801u uVar, C134839f fVar, C134803w wVar, C134805y yVar, C134781aa aaVar) {
        this.f367203a = bVar;
        this.f367204b = eVar;
        this.f367205c = dVar;
        this.f367206d = mVar;
        this.f367207e = eVar2;
        this.f367208f = oVar;
        this.f367209g = sVar;
        this.f367210h = uVar;
        this.f367211i = fVar;
        this.f367212j = wVar;
        this.f367213k = yVar;
        this.f367214l = aaVar;
    }

    /* renamed from: a */
    public final C6491cw mo112045a(C135268s sVar) {
        C134785e eVar;
        Throwable th;
        C57784p pVar;
        C69802a aVar;
        C40076p pVar2;
        UserRecoverableAuthException userRecoverableAuthException;
        C47388b bVar;
        C134785e eVar2;
        Intent a;
        C135268s sVar2 = sVar;
        C69664n.m101061g(sVar2, "slice");
        if (sVar2 instanceof C135252c) {
            C134782b bVar2 = this.f367203a;
            C135252c cVar = (C135252c) sVar2;
            C69664n.m101061g(cVar, "slice");
            Throwable th2 = cVar.f368454a;
            while (true) {
                if (th2 == null) {
                    userRecoverableAuthException = null;
                    break;
                } else if (th2 instanceof UserRecoverableAuthException) {
                    userRecoverableAuthException = (UserRecoverableAuthException) th2;
                    break;
                } else {
                    th2 = th2.getCause();
                }
            }
            if (userRecoverableAuthException == null || (a = userRecoverableAuthException.mo117772a()) == null) {
                bVar = new C134709g(C134228q.AUTHENTICATION_ERROR);
            } else {
                bVar = new C134707e(a, C134228q.AUTHENTICATION_ERROR);
            }
            boolean l = C69664n.m101066l(userRecoverableAuthException != null ? userRecoverableAuthException.getMessage() : null, "DeviceManagementRequired");
            if (!bVar2.f366985b || !l) {
                eVar2 = bVar2.f366986c;
            } else {
                C134785e eVar3 = bVar2.f366986c;
                eVar2 = new C134785e(eVar3.f366990a, eVar3.f366991b, Integer.valueOf(R.string.googleapp_discover_error_card_device_management_user_title), R.string.googleapp_discover_error_card_device_management_user_message, eVar3.f366994e, eVar3.f366995f, eVar3.f366996g);
            }
            return C134791k.m218632a(bVar2.f366984a, eVar2, cVar.f368454a, (String) null, new C134780a(bVar), (C69626l) null, (C69626l) null, (C69626l) null, 116);
        } else if (sVar2 instanceof C135254e) {
            C134873e eVar4 = this.f367204b;
            C135254e eVar5 = (C135254e) sVar2;
            C69664n.m101061g(eVar5, "slice");
            C47558bi s = C47831fm.m85024s("ContentRenderInfoFactory#create");
            try {
                C134544ai aiVar = eVar5.f368466a;
                if (aiVar.f366396b == 2) {
                    pVar = (C57784p) aiVar.f366397c;
                } else {
                    pVar = C57784p.f154382f;
                }
                C69664n.m101060f(pVar, "slice.content.elementsOutput");
                if ((pVar.f154384a & 4) != 0) {
                    C134866a aVar2 = eVar4.f367173i;
                    String str = eVar5.f368467b;
                    C69664n.m101061g(str, "contentId");
                    if (!aVar2.f367151a.contains(str)) {
                        C134866a aVar3 = eVar4.f367173i;
                        String str2 = eVar5.f368467b;
                        C69664n.m101061g(str2, "contentId");
                        aVar3.f367151a.add(str2);
                        C40062d i = eVar4.f367169e.mo32550i();
                        C57776h hVar = pVar.f154387d;
                        if (hVar == null) {
                            hVar = C57776h.f154365b;
                        }
                        i.mo42164a(hVar);
                    }
                }
                ContentDisposableManager contentDisposableManager = eVar4.f367166b;
                String str3 = eVar5.f368466a.f366399e;
                if (contentDisposableManager.f367149a.containsKey(str3)) {
                    aVar = (C69802a) contentDisposableManager.f367149a.get(str3);
                } else {
                    C69802a aVar4 = new C69802a();
                    contentDisposableManager.f367149a.put(str3, aVar4);
                    aVar = aVar4;
                }
                C6544i iVar = new C6544i();
                C21249as e = eVar4.f367169e.mo32546e();
                C6411u uVar = eVar4.f367167c;
                C21319z zVar = eVar4.f367168d;
                C63070h hVar2 = pVar.f154385b;
                if (hVar2 == null) {
                    hVar2 = C63070h.f170215c;
                }
                byte[] N = hVar2.f170218b.mo59174N();
                C40083w wVar = eVar4.f367170f;
                C69664n.m101061g(eVar5, "slice");
                C134588f fVar = (C134588f) C134589g.f366528d.createBuilder();
                C69664n.m101060f(fVar, "newBuilder()");
                C69664n.m101061g(fVar, "builder");
                String str4 = eVar5.f368466a.f366399e;
                C69664n.m101060f(str4, "slice.content.contentId");
                C69664n.m101061g(str4, "value");
                fVar.copyOnWrite();
                C134589g gVar = (C134589g) fVar.instance;
                str4.getClass();
                gVar.f366531a |= 2;
                gVar.f366533c = str4;
                String str5 = eVar5.f368470e;
                C69664n.m101061g(str5, "value");
                fVar.copyOnWrite();
                C134589g gVar2 = (C134589g) fVar.instance;
                str5.getClass();
                gVar2.f366531a |= 1;
                gVar2.f366532b = str5;
                C62942bv build = fVar.build();
                C69664n.m101060f(build, "_builder.build()");
                C40303a aVar5 = (C40303a) C40306b.f105885a.createBuilder();
                C69664n.m101060f(aVar5, "newBuilder()");
                C40341d a2 = C69664n.m101061g(aVar5, "builder");
                C62940bt btVar = C134589g.f366529e;
                C69664n.m101060f(btVar, "discoverClientContext");
                a2.mo42405b(btVar, (C134589g) build);
                C40306b a3 = a2.mo42404a();
                if (C69664n.m101066l(eVar5.f368469d, C60220t.f162931e)) {
                    C59052c cVar2 = (C59052c) C134873e.f367165a.mo56226d();
                    cVar2.mo56378ag(C38505d.f101864b, 245745218);
                    C134543ah a4 = C134543ah.m218281a(eVar5.f368466a.f366398d);
                    if (a4 == null) {
                        a4 = C134543ah.UNKNOWN_CONTENT;
                    }
                    cVar2.mo56379ah(new C59094n(40517));
                    cVar2.mo56389s("Missing event ID for client context. Content slice type %s", a4);
                    C40075o c = C40076p.m69597c();
                    c.mo42068b(a3);
                    pVar2 = c.mo42067a();
                    C69664n.m101060f(pVar2, "builder().setClientContext(clientContext).build()");
                } else {
                    Map map = eVar4.f367172h;
                    C60217q qVar = (C60217q) C60218r.f162925d.createBuilder();
                    C69664n.m101060f(qVar, "newBuilder()");
                    C60216p a5 = C69664n.m101061g(qVar, "builder");
                    a5.mo57075b(eVar5.f368469d);
                    C60218r a6 = a5.mo57074a();
                    C57528m mVar = eVar4.f367176l.f366956e;
                    C69664n.m101061g(map, "discoverVeViewMap");
                    C69664n.m101061g(a6, "responseEventId");
                    C69664n.m101061g(mVar, "surface");
                    C134871c cVar3 = new C134871c(map, a6, mVar);
                    C40075o c2 = C40076p.m69597c();
                    c2.mo42068b(a3);
                    ((C39906a) c2).f104922a = cVar3;
                    pVar2 = c2.mo42067a();
                    C69664n.m101060f(pVar2, "builder()\n      .setClie…tyTracker)\n      .build()");
                }
                iVar.f19488b = e.mo26712b(uVar, zVar, N, wVar.mo42171a(pVar2, eVar4.f367171g, eVar4.f367174j.mo111555a(eVar4.f367176l), new C134872d(eVar4, eVar5)), aVar);
                iVar.mo13493a("contentId", eVar5.f368466a.f366399e);
                iVar.mo13493a("topLevelIndex", Integer.valueOf(eVar5.f368468c));
                C134540ae a7 = C134540ae.m218279a(eVar5.f368466a.f366401g);
                if (a7 == null) {
                    a7 = C134540ae.ALIGNMENT_UNSPECIFIED;
                }
                iVar.mo13494b(a7 == C134540ae.CENTER);
                C6546k kVar = new C6546k(iVar);
                C69598b.m101013a(s, (Throwable) null);
                return kVar;
            } catch (Throwable th3) {
                Throwable th4 = th3;
                C69598b.m101013a(s, th);
                throw th4;
            }
        } else if (sVar2 instanceof C135265p) {
            C134801u uVar2 = this.f367210h;
            return C134791k.m218632a(uVar2.f367041a, uVar2.f367042b, (Throwable) null, (String) null, C134800t.f367040a, (C69626l) null, (C69626l) null, (C69626l) null, 118);
        } else {
            if (sVar2 instanceof C135264o) {
                C134799s sVar3 = this.f367209g;
                C135264o oVar = (C135264o) sVar2;
                C69664n.m101061g(oVar, "slice");
                return C134791k.m218632a(sVar3.f367035c, sVar3.f367038f, (Throwable) null, (String) null, (C69626l) null, (C69626l) null, new C134797q(sVar3, oVar), new C134798r(sVar3), 30);
            } else if (sVar2 instanceof C135260k) {
                C134793m mVar2 = this.f367206d;
                C135260k kVar2 = (C135260k) sVar2;
                C69664n.m101061g(kVar2, "slice");
                Intent intent = kVar2.f368487b;
                C134792l lVar = intent != null ? new C134792l(intent) : null;
                C134791k kVar3 = mVar2.f367023g;
                int i2 = kVar2.f368486a;
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            eVar = C134793m.f367019c;
                        } else if (i2 == 9) {
                            eVar = C134793m.f367020d;
                        } else if (i2 != 18) {
                            eVar = i2 != 19 ? C134793m.f367022f : C134793m.f367021e;
                        }
                    }
                    eVar = C134793m.f367017a;
                } else {
                    eVar = C134793m.f367018b;
                }
                return C134791k.m218632a(kVar3, eVar, (Throwable) null, new ConnectionResult(1, i2, (PendingIntent) null, (String) null).toString(), lVar, (C69626l) null, (C69626l) null, (C69626l) null, 114);
            } else if (sVar2 instanceof C135246bg) {
                C134805y yVar = this.f367213k;
                return C134791k.m218632a(yVar.f367047a, yVar.f367048b, (Throwable) null, (String) null, C134804x.f367046a, (C69626l) null, (C69626l) null, (C69626l) null, 118);
            } else if (sVar2 instanceof C135261l) {
                C134719e eVar6 = this.f367207e;
                int i3 = ((C135261l) sVar2).f368488a;
                C6535em emVar = new C6535em();
                emVar.f19456b = new C134717c(eVar6);
                emVar.f19457c = new C134718d(eVar6, i3);
                emVar.mo13618f(-3);
                return emVar.mo13617e();
            } else if (sVar2 instanceof C135266q) {
                C134839f fVar2 = this.f367211i;
                C135359p pVar3 = ((C135266q) sVar2).f368495a;
                C57528m mVar3 = fVar2.f367090e.f366956e;
                LayoutInflater from = LayoutInflater.from(fVar2.f367086a.f19009b);
                C6535em emVar2 = new C6535em();
                emVar2.f19456b = new C134836c(pVar3, fVar2, mVar3);
                emVar2.f19457c = new C134838e(from, fVar2, mVar3);
                emVar2.mo13618f(-2);
                return emVar2.mo13617e();
            } else if (sVar2 instanceof C135267r) {
                throw new IllegalArgumentException("Invalid RenderableSlice type");
            } else if (sVar2 instanceof C135245bf) {
                C134803w wVar2 = this.f367212j;
                C135245bf bfVar = (C135245bf) sVar2;
                C69664n.m101061g(bfVar, "slice");
                return C134791k.m218632a(wVar2.f367044a, wVar2.f367045b, bfVar.f368433a, (String) null, C134802v.f367043a, (C69626l) null, (C69626l) null, (C69626l) null, 116);
            } else if (sVar2 instanceof C135251bl) {
                C134781aa aaVar = this.f367214l;
                C135251bl blVar = (C135251bl) sVar2;
                C69664n.m101061g(blVar, "slice");
                return C134791k.m218632a(aaVar.f366982a, aaVar.f366983b, blVar.f368452a, (String) null, C134806z.f367049a, (C69626l) null, (C69626l) null, (C69626l) null, 116);
            } else if (sVar2 instanceof C135256g) {
                C134784d dVar = this.f367205c;
                return C134791k.m218632a(dVar.f366988a, dVar.f366989b, (Throwable) null, (String) null, (C69626l) null, C134783c.f366987a, (C69626l) null, (C69626l) null, 110);
            } else if (sVar2 instanceof C135262m) {
                C134795o oVar2 = this.f367208f;
                return C134791k.m218632a(oVar2.f367025a, oVar2.f367026b, (Throwable) null, (String) null, C134794n.f367024a, (C69626l) null, (C69626l) null, (C69626l) null, 118);
            } else {
                throw new C69677g();
            }
        }
    }
}
