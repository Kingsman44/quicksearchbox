package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.p9794a;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import com.google.android.libraries.elements.interfaces.C21232ab;
import com.google.android.libraries.search.assistant.p2828y.p2838g.p2839a.C36909c;
import com.google.android.libraries.search.assistant.p2828y.p2838g.p2839a.C36910d;
import com.google.android.libraries.search.assistant.p2828y.p2838g.p2839a.C36911e;
import com.google.android.libraries.search.assistant.performer.p2757g.p2758a.C36030m;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3132a.C40305b;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57778j;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57780l;
import com.google.p4283bv.p4380j.p4385b.p4386a.p4392b.p4403c.p4404a.p4405a.C57741e;
import com.google.p4283bv.p4380j.p4385b.p4386a.p4392b.p4403c.p4404a.p4405a.C57743g;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63070h;
import com.google.protobuf.C63087y;
import com.google.protobuf.C63088z;
import p3186j$.util.Optional;
import p5488io.p5490b.C70128t;
import p5488io.p5490b.C70129u;
import p5488io.p5490b.p5494b.C69802a;
import p5488io.p5490b.p5496d.C69822d;
import p5488io.p5490b.p5517i.C70101a;
import p5488io.p5490b.p5518j.C70111i;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.a.ak */
/* compiled from: PG */
public final class C129037ak implements C129061t, C36909c {

    /* renamed from: a */
    public static final C59071e f354499a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.a.ak");

    /* renamed from: b */
    public final Context f354500b;

    /* renamed from: c */
    public final C69802a f354501c = new C69802a();

    /* renamed from: d */
    public final C21232ab f354502d;

    /* renamed from: e */
    public final C36911e f354503e;

    /* renamed from: f */
    public Optional f354504f = Optional.empty();

    /* renamed from: g */
    public C58833ax f354505g;

    /* renamed from: h */
    public C58833ax f354506h;

    /* renamed from: i */
    private final C36030m f354507i;

    public C129037ak(C40305b bVar, Context context, C36911e eVar, C36030m mVar) {
        C58836b bVar2 = C58836b.f156633a;
        this.f354505g = bVar2;
        this.f354506h = bVar2;
        this.f354502d = bVar.mo32545d();
        this.f354500b = context;
        this.f354503e = eVar;
        this.f354507i = mVar;
    }

    /* renamed from: c */
    public static C63088z m210623c(Bitmap bitmap) {
        C63087y v = C63088z.m96150v();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, v);
        return v.mo59165b();
    }

    /* renamed from: a */
    public final void mo40463a(C36910d dVar) {
        C59071e eVar = f354499a;
        ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(38111)).mo56389s("#MediaStateObserverImpl, onContextChanged, key: %s.", dVar);
        C58833ax b = mo108812b();
        if (b.mo56113h()) {
            this.f354506h = b;
            mo108813d((MediaController) b.mo56107c());
        } else if (this.f354506h.mo56113h()) {
            ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(38112)).mo56386p("#MediaStateObserverImpl, current active session has been destroyed.");
            if (this.f354502d == null || !this.f354505g.mo56113h() || ((C57778j) this.f354505g.mo56107c()).f154371a.isEmpty()) {
                this.f354501c.mo61461a();
                this.f354501c.dispose();
                return;
            }
            String str = ((C57778j) this.f354505g.mo56107c()).f154371a;
            C70129u j = this.f354502d.mo26139b(str).mo61651i(C129062u.f354550a).mo61652l(C129028ab.f354488a).mo61652l(C129029ac.f354489a).mo61657s().mo61671k(new C129034ah(this)).mo61670j(C129035ai.f354496a);
            C70128t tVar = C70111i.f186862c;
            C69822d dVar2 = C70101a.f186841i;
            this.f354501c.mo61462b(j.mo61672l(tVar).mo61668f(new C129036aj(this, str)).mo61665c(new C129063v(this)).mo61673m());
        }
    }

    /* renamed from: b */
    public final C58833ax mo108812b() {
        String str;
        Object obj;
        MediaController b = this.f354507i.mo39948b();
        if (b == null) {
            ((C59052c) ((C59052c) f354499a.mo56224b()).mo56372aa(38105)).mo56386p("#MediaStateObserverImpl, connectToMediaController failed, reason: mediaController is null.");
            return C58836b.f156633a;
        }
        String packageName = b.getPackageName();
        if (!this.f354505g.mo56113h()) {
            str = null;
        } else {
            C57780l lVar = ((C57778j) this.f354505g.mo56107c()).f154373c;
            if (lVar == null) {
                lVar = C57780l.f154376c;
            }
            C62940bt r3 = C62942bv.checkIsLite(C57743g.f154270c);
            lVar.mo58887l(r3);
            Object l = lVar.f169962ag.mo58854l(r3.f169971d);
            if (l == null) {
                obj = r3.f169969b;
            } else {
                obj = r3.mo58889c(l);
            }
            str = ((C57743g) obj).f154272a;
        }
        if (packageName.equals(str)) {
            return C58833ax.m90834k(b);
        }
        ((C59052c) ((C59052c) f354499a.mo56224b()).mo56372aa(38104)).mo56386p("#MediaStateObserverImpl, connectToMediaController failed, reason: user required media provider is inactive.");
        return C58836b.f156633a;
    }

    /* renamed from: d */
    public final void mo108813d(MediaController mediaController) {
        C59071e eVar = f354499a;
        ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(38114)).mo56386p("#MediaStateObserverImpl, saveLatestMetadataToDatastore.");
        MediaMetadata metadata = mediaController.getMetadata();
        if (this.f354502d == null) {
            ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(38117)).mo56386p("#MediaStateObserverImpl, saveLatestMetadataToDatastore failed, reason: XUikit datastore is null.");
        } else if (!this.f354505g.mo56113h() || ((C57778j) this.f354505g.mo56107c()).f154371a.isEmpty()) {
            ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(38115)).mo56386p("#MediaStateObserverImpl, saveLatestMetadataToDatastore failed, reason: couldn't find datastore key in mutation sent from server.");
        } else {
            String str = ((C57778j) this.f354505g.mo56107c()).f154371a;
            try {
                C57780l lVar = ((C57778j) this.f354505g.mo56107c()).f154373c;
                if (lVar == null) {
                    lVar = C57780l.f154376c;
                }
                C63070h hVar = lVar.f154379b;
                if (hVar == null) {
                    hVar = C63070h.f170215c;
                }
                C57741e eVar2 = (C57741e) C62942bv.parseFrom((C62942bv) C57741e.f154257j, hVar.f170218b, C62921ba.m95368a());
                C70129u j = this.f354502d.mo26139b(str).mo61651i(C129062u.f354550a).mo61652l(C129028ab.f354488a).mo61652l(C129029ac.f354489a).mo61657s().mo61671k(new C129064w(eVar2)).mo61670j(new C129065x(this, eVar2, metadata, mediaController));
                C70128t tVar = C70111i.f186862c;
                C69822d dVar = C70101a.f186841i;
                this.f354501c.mo61462b(j.mo61672l(tVar).mo61668f(new C129066y(this, str)).mo61667e(C129067z.f354559a).mo61666d(new C129027aa(this, mediaController)).mo61673m());
            } catch (C62974ct e) {
                ((C59052c) ((C59052c) ((C59052c) f354499a.mo56225c()).mo56382g(e)).mo56372aa(38116)).mo56386p("#MediaStateObserverImpl, saveLatestMetadataToDatastore failed, reason: Invalid MediaDetails format.");
            }
        }
    }
}
