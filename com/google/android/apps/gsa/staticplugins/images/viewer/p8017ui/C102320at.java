package com.google.android.apps.gsa.staticplugins.images.viewer.p8017ui;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewpager.widget.C4268a;
import com.google.android.apps.gsa.staticplugins.images.viewer.p8016b.C102288a;
import com.google.android.apps.gsa.staticplugins.images.viewer.p8016b.C102289b;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protos.p5146w.p5147a.p5148a.C65926d;
import com.google.protos.p5146w.p5147a.p5148a.C65928f;
import com.google.protos.p5146w.p5147a.p5148a.C65930h;
import com.google.protos.p5146w.p5147a.p5148a.C65937o;
import com.google.protos.p5146w.p5149b.p5157c.p5158a.C65949b;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.images.viewer.ui.at */
/* compiled from: PG */
public final class C102320at extends C4268a {

    /* renamed from: c */
    public C65926d f285563c;

    /* renamed from: d */
    private final View f285564d;

    /* renamed from: e */
    private final Map f285565e;

    /* renamed from: f */
    private final C102358cd f285566f;

    /* renamed from: g */
    private final C102360cf f285567g;

    /* renamed from: h */
    private boolean f285568h = false;

    /* renamed from: i */
    private int f285569i = -1;

    public C102320at(View view, Map map, C65926d dVar, C102358cd cdVar, C102360cf cfVar) {
        this.f285564d = view;
        this.f285565e = map;
        this.f285563c = dVar;
        this.f285566f = cdVar;
        this.f285567g = cfVar;
    }

    /* renamed from: b */
    private final String m169613b() {
        int i = this.f285569i;
        if (i < 0 || i >= this.f285563c.f179291a.size()) {
            return null;
        }
        C65926d dVar = this.f285563c;
        C65928f fVar = ((C65930h) dVar.f179291a.get(this.f285569i)).f179305d;
        if (fVar == null) {
            fVar = C65928f.f179293f;
        }
        return fVar.f179296b;
    }

    /* renamed from: o */
    private final String m169614o() {
        Object obj;
        int i = this.f285569i;
        if (i >= 0 && i < this.f285563c.f179291a.size()) {
            C65926d dVar = this.f285563c;
            C65930h hVar = (C65930h) dVar.f179291a.get(this.f285569i);
            C62940bt r2 = C62942bv.checkIsLite(C65937o.f179333l);
            hVar.mo58887l(r2);
            if (hVar.f169962ag.mo58857o(r2.f169971d)) {
                C62940bt r1 = C62942bv.checkIsLite(C65937o.f179333l);
                hVar.mo58887l(r1);
                Object l = hVar.f169962ag.mo58854l(r1.f169971d);
                if (l == null) {
                    obj = r1.f169969b;
                } else {
                    obj = r1.mo58889c(l);
                }
                return ((C65937o) obj).f179338d;
            }
        }
        return null;
    }

    /* renamed from: d */
    public final void mo646d(ViewGroup viewGroup, int i, Object obj) {
        C102378t tVar = (C102378t) this.f285565e.get(Integer.valueOf(i));
        if (tVar != null && tVar.mo28297il() != null) {
            viewGroup.removeView(tVar.mo28297il());
        }
    }

    /* renamed from: g */
    public final void mo647g(ViewGroup viewGroup, int i, Object obj) {
        if (i != this.f285569i) {
            C102378t tVar = (C102378t) this.f285565e.get(Integer.valueOf(i));
            if (tVar != null) {
                C102288a aVar = tVar.f285702d;
                ((C102289b) aVar).f285407a.mo28345s("onPrimaryItem", "ImagePageEventsDispatcher", new Bundle());
                tVar.f285699a.mo93075f();
                if (!((C65949b) ((C102339bl) tVar.f285700b).f285610c.f63720e).equals(C65949b.f179368e)) {
                    RelatedContentHeader relatedContentHeader = tVar.f285699a.f285459f;
                    if (relatedContentHeader.f285508g != null && !relatedContentHeader.f285509h) {
                        relatedContentHeader.f285509h = true;
                        for (ImageView imageView : relatedContentHeader.f285510i.keySet()) {
                            relatedContentHeader.f285505d.f285680b.mo85421i((String) relatedContentHeader.f285510i.get(imageView), imageView);
                        }
                        relatedContentHeader.mo93097b();
                    }
                }
                View il = tVar.mo28297il();
                if (il != null) {
                    this.f285567g.mo93136c(il, this.f285564d);
                    if (this.f285568h) {
                        int i2 = this.f285569i;
                        if (i < i2) {
                            C102358cd cdVar = this.f285566f;
                            cdVar.f285657a.mo93141h(cdVar.f285660d, 22, m169613b(), m169614o());
                        } else if (i > i2) {
                            C102358cd cdVar2 = this.f285566f;
                            cdVar2.f285657a.mo93141h(cdVar2.f285659c, 22, m169613b(), m169614o());
                        }
                    }
                }
            }
            this.f285568h = true;
            this.f285569i = i;
        }
    }

    /* renamed from: gw */
    public final Object mo649gw(ViewGroup viewGroup, int i) {
        View il;
        Map map = this.f285565e;
        Integer valueOf = Integer.valueOf(i);
        C102378t tVar = (C102378t) map.get(valueOf);
        if (!(tVar == null || (il = tVar.mo28297il()) == null)) {
            ViewGroup viewGroup2 = (ViewGroup) il.getParent();
            if (viewGroup2 != null) {
                viewGroup2.removeView(il);
            }
            viewGroup.addView(il);
            C28292j jVar = new C28292j(22806);
            jVar.mo33795i(31);
            C28295m.m52919e(il, jVar);
        }
        return valueOf;
    }

    /* renamed from: i */
    public final boolean mo652i(View view, Object obj) {
        Integer num = (Integer) obj;
        return this.f285565e.containsKey(num) && view.equals(((C102378t) this.f285565e.get(num)).mo28297il());
    }

    /* renamed from: k */
    public final int mo9175k() {
        return this.f285563c.f179291a.size();
    }
}
