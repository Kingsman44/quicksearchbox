package com.google.android.libraries.p579ar.faceviewer.p580a.p583c;

import android.util.Log;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.libraries.p579ar.faceviewer.p588c.C10650a;
import com.google.android.libraries.p579ar.faceviewer.p588c.C10652c;
import com.google.android.libraries.p579ar.faceviewer.p588c.C10653d;
import com.google.android.libraries.p579ar.faceviewer.p588c.C10654e;
import com.google.android.libraries.p579ar.faceviewer.p588c.C10655f;
import com.google.common.android.p4521a.C58274c;
import com.google.common.base.C58872ci;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p363ad.p364a.C6683g;
import com.google.p363ad.p364a.C6684h;
import com.google.p363ad.p364a.C6685i;
import com.google.p363ad.p364a.C6689m;
import com.google.p363ad.p364a.C6690n;
import com.google.p363ad.p364a.C6693q;
import com.google.p363ad.p364a.C6694r;
import com.google.p363ad.p364a.C6696t;
import com.google.p363ad.p364a.C6697u;
import com.google.p363ad.p364a.C6702z;
import java.util.EnumMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.ar.faceviewer.a.c.b */
/* compiled from: PG */
public final class C10577b implements C10652c, C10655f {

    /* renamed from: g */
    private static final C59071e f35386g = C59071e.m91332i("com.google.android.libraries.ar.faceviewer.a.c.b");

    /* renamed from: h */
    private static final C58495hd f35387h;

    /* renamed from: a */
    public final long f35388a;

    /* renamed from: b */
    public final C10662f f35389b;

    /* renamed from: c */
    public C10653d f35390c;

    /* renamed from: d */
    public String f35391d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public int f35392e = 0;

    /* renamed from: f */
    public final Map f35393f;

    /* renamed from: i */
    private boolean f35394i = false;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(C10654e.ASSET, C10576a.ASSET);
        gzVar.mo55429h(C10654e.RENDER_INIT, C10576a.RENDER_INIT);
        gzVar.mo55429h(C10654e.CAMERA_INIT, C10576a.CAMERA_INIT);
        gzVar.mo55429h(C10654e.ASSET_DOWNLOAD, C10576a.ASSET_DOWNLOAD);
        gzVar.mo55429h(C10654e.PROTO_DOWNLOAD_AND_INIT, C10576a.PROTO_DOWNLOAD_AND_INIT);
        gzVar.mo55429h(C10654e.ASSET_SWITCH, C10576a.ASSET_SWITCH);
        f35387h = gzVar.mo55427f(true);
    }

    public C10577b(C10662f fVar) {
        EnumMap enumMap = new EnumMap(C10576a.class);
        this.f35393f = enumMap;
        this.f35389b = fVar;
        this.f35388a = new Random().nextLong();
        enumMap.put(C10576a.STARTUP, C58872ci.m90947d(C58274c.f155808a));
        enumMap.put(C10576a.EXPERIENCE, C58872ci.m90947d(C58274c.f155808a));
    }

    /* renamed from: h */
    private final int m25552h(C10576a aVar) {
        long a = ((C58872ci) this.f35393f.get(aVar)).mo56158a(TimeUnit.MILLISECONDS);
        this.f35393f.remove(aVar);
        return (int) a;
    }

    /* renamed from: a */
    public final C6685i mo18634a() {
        C6685i iVar = (C6685i) C6702z.f20007e.createBuilder();
        long j = this.f35388a;
        iVar.copyOnWrite();
        C6702z zVar = (C6702z) iVar.instance;
        zVar.f20009a |= 1;
        zVar.f20012d = j;
        return iVar;
    }

    /* renamed from: b */
    public final void mo18627b() {
        if (this.f35394i) {
            ((C59052c) ((C59052c) f35386g.mo56226d()).mo56372aa(42283)).mo56386p("Already logged leaving experience.");
            return;
        }
        if (((C58872ci) this.f35393f.get(C10576a.EXPERIENCE)).f156708a) {
            ((C58872ci) this.f35393f.get(C10576a.EXPERIENCE)).mo56162g();
        }
        long a = ((C58872ci) this.f35393f.get(C10576a.EXPERIENCE)).mo56158a(TimeUnit.MILLISECONDS);
        C6696t tVar = (C6696t) C6697u.f19998d.createBuilder();
        tVar.copyOnWrite();
        C6697u uVar = (C6697u) tVar.instance;
        uVar.f20000a |= 1;
        uVar.f20001b = (int) a;
        tVar.copyOnWrite();
        C6697u uVar2 = (C6697u) tVar.instance;
        uVar2.f20002c = 0;
        uVar2.f20000a |= 2;
        C6697u uVar3 = (C6697u) tVar.build();
        C10662f fVar = this.f35389b;
        C6685i a2 = mo18634a();
        a2.copyOnWrite();
        C6702z zVar = (C6702z) a2.instance;
        C6702z zVar2 = C6702z.f20007e;
        uVar3.getClass();
        zVar.f20011c = uVar3;
        zVar.f20010b = 8;
        fVar.mo18697a(a2);
        if (Log.isLoggable(C10662f.f35572a, 3)) {
            ((C59052c) ((C59052c) C10662f.f35573b.mo56224b()).mo56372aa(42278)).mo56386p("DefaultPlatformLogger: logVeLeftExperience.");
        }
        this.f35394i = true;
    }

    /* renamed from: c */
    public final void mo18628c(C10653d dVar) {
        this.f35390c = dVar;
    }

    /* renamed from: d */
    public final void mo18635d(C6693q qVar) {
        if (this.f35393f.containsKey(C10576a.ASSET)) {
            int i = this.f35392e;
            qVar.copyOnWrite();
            C6694r rVar = (C6694r) qVar.instance;
            C6694r rVar2 = C6694r.f19986j;
            rVar.f19988a |= 64;
            rVar.f19995h = i;
            if (this.f35393f.containsKey(C10576a.ASSET)) {
                int h = m25552h(C10576a.ASSET);
                qVar.copyOnWrite();
                C6694r rVar3 = (C6694r) qVar.instance;
                rVar3.f19988a |= 128;
                rVar3.f19996i = h;
            }
            C6683g gVar = (C6683g) C6684h.f19960e.createBuilder();
            String str = this.f35391d;
            gVar.copyOnWrite();
            C6684h hVar = (C6684h) gVar.instance;
            str.getClass();
            hVar.f19962a |= 1;
            hVar.f19963b = str;
            if (this.f35393f.containsKey(C10576a.ASSET_SWITCH)) {
                int h2 = m25552h(C10576a.ASSET_SWITCH);
                gVar.copyOnWrite();
                C6684h hVar2 = (C6684h) gVar.instance;
                hVar2.f19962a |= 4;
                hVar2.f19965d = h2;
            }
            C6694r rVar4 = (C6694r) qVar.build();
            gVar.copyOnWrite();
            C6684h hVar3 = (C6684h) gVar.instance;
            rVar4.getClass();
            hVar3.f19964c = rVar4;
            hVar3.f19962a |= 2;
            C10662f fVar = this.f35389b;
            C6685i a = mo18634a();
            a.copyOnWrite();
            C6702z zVar = (C6702z) a.instance;
            C6684h hVar4 = (C6684h) gVar.build();
            C6702z zVar2 = C6702z.f20007e;
            hVar4.getClass();
            zVar.f20011c = hVar4;
            zVar.f20010b = 5;
            fVar.mo18697a(a);
        }
    }

    /* renamed from: e */
    public final void mo18636e() {
        if (this.f35393f.containsKey(C10576a.STARTUP) || this.f35393f.containsKey(C10576a.CAMERA_INIT)) {
            C6689m mVar = (C6689m) C6690n.f19970i.createBuilder();
            boolean z = true;
            if (this.f35393f.containsKey(C10576a.STARTUP)) {
                int h = m25552h(C10576a.STARTUP);
                mVar.copyOnWrite();
                C6690n nVar = (C6690n) mVar.instance;
                nVar.f19972a |= 1;
                nVar.f19973b = h;
            }
            if (this.f35393f.containsKey(C10576a.CAMERA_INIT)) {
                int h2 = m25552h(C10576a.CAMERA_INIT);
                mVar.copyOnWrite();
                C6690n nVar2 = (C6690n) mVar.instance;
                nVar2.f19972a |= 16;
                nVar2.f19977f = h2;
            }
            if (this.f35393f.containsKey(C10576a.ASSET_DOWNLOAD)) {
                int h3 = m25552h(C10576a.ASSET_DOWNLOAD);
                mVar.copyOnWrite();
                C6690n nVar3 = (C6690n) mVar.instance;
                nVar3.f19972a |= 8;
                nVar3.f19976e = h3;
            }
            if (this.f35393f.containsKey(C10576a.PROTO_DOWNLOAD_AND_INIT)) {
                int h4 = m25552h(C10576a.PROTO_DOWNLOAD_AND_INIT);
                mVar.copyOnWrite();
                C6690n nVar4 = (C6690n) mVar.instance;
                nVar4.f19972a |= 64;
                nVar4.f19979h = h4;
            }
            if (this.f35393f.containsKey(C10576a.RENDER_INIT)) {
                int h5 = m25552h(C10576a.RENDER_INIT);
                mVar.copyOnWrite();
                C6690n nVar5 = (C6690n) mVar.instance;
                nVar5.f19972a |= 32;
                nVar5.f19978g = h5;
            }
            C10653d dVar = this.f35390c;
            if (dVar != null) {
                int i = ((C10650a) dVar).f35549e.f35544c.f35564e.f35396b;
                if (!(i == 4 || i == 5)) {
                    z = false;
                }
                mVar.copyOnWrite();
                C6690n nVar6 = (C6690n) mVar.instance;
                nVar6.f19972a |= 2;
                nVar6.f19974c = z;
                mVar.copyOnWrite();
                C6690n nVar7 = (C6690n) mVar.instance;
                int i2 = i - 1;
                if (i != 0) {
                    nVar7.f19975d = i2;
                    nVar7.f19972a |= 4;
                } else {
                    throw null;
                }
            }
            C10662f fVar = this.f35389b;
            C6685i a = mo18634a();
            C6690n nVar8 = (C6690n) mVar.build();
            a.copyOnWrite();
            C6702z zVar = (C6702z) a.instance;
            C6702z zVar2 = C6702z.f20007e;
            nVar8.getClass();
            zVar.f20011c = nVar8;
            zVar.f20010b = 3;
            fVar.mo18697a(a);
        }
    }

    /* renamed from: f */
    public final void mo18637f(C10654e eVar) {
        Map map = this.f35393f;
        C58495hd hdVar = f35387h;
        if (!map.containsKey(hdVar.get(eVar))) {
            C59071e eVar2 = f35386g;
            ((C59052c) ((C59052c) eVar2.mo56226d()).mo56372aa(42286)).mo56386p("Timer doesn't exist for event, nothing to complete: ");
            ((C59052c) ((C59052c) eVar2.mo56226d()).mo56372aa(42287)).mo56385o(eVar);
            return;
        }
        if (((C58872ci) this.f35393f.get(hdVar.get(eVar))).f156708a) {
            ((C58872ci) this.f35393f.get(hdVar.get(eVar))).mo56162g();
        } else {
            C59071e eVar3 = f35386g;
            ((C59052c) ((C59052c) eVar3.mo56226d()).mo56372aa(42284)).mo56386p("Timer not running for event, nothing to stop: ");
            ((C59052c) ((C59052c) eVar3.mo56226d()).mo56372aa(42285)).mo56385o(eVar);
        }
        if (eVar == C10654e.CAMERA_INIT && !this.f35393f.containsKey(C10576a.STARTUP)) {
            mo18636e();
        }
    }

    /* renamed from: g */
    public final void mo18638g(C10654e eVar) {
        Map map = this.f35393f;
        C58495hd hdVar = f35387h;
        if (map.containsKey(hdVar.get(eVar))) {
            C59071e eVar2 = f35386g;
            ((C59052c) ((C59052c) eVar2.mo56226d()).mo56372aa(42288)).mo56386p("Event already exists, resetting timer: ");
            ((C59052c) ((C59052c) eVar2.mo56226d()).mo56372aa(42289)).mo56385o(eVar);
            ((C58872ci) this.f35393f.get(hdVar.get(eVar))).mo56160e();
            ((C58872ci) this.f35393f.get(hdVar.get(eVar))).mo56161f();
            return;
        }
        this.f35393f.put((C10576a) hdVar.get(eVar), C58872ci.m90947d(C58274c.f155808a));
    }
}
