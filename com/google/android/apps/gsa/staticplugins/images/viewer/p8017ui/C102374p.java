package com.google.android.apps.gsa.staticplugins.images.viewer.p8017ui;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.staticplugins.images.viewer.p8016b.C102288a;
import com.google.android.apps.gsa.staticplugins.images.viewer.p8016b.C102289b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protos.p4972d.p4973a.p4974a.p4975a.p4976a.p4977a.p4978a.p4979a.C64629b;
import com.google.protos.p5146w.p5147a.p5148a.C65928f;
import com.google.protos.p5146w.p5147a.p5148a.C65930h;
import com.google.protos.p5146w.p5147a.p5148a.C65937o;

/* renamed from: com.google.android.apps.gsa.staticplugins.images.viewer.ui.p */
/* compiled from: PG */
final class C102374p {

    /* renamed from: a */
    public final C102288a f285679a;

    /* renamed from: b */
    public final C91189au f285680b;

    /* renamed from: c */
    public final C65930h f285681c;

    /* renamed from: d */
    public final View f285682d;

    /* renamed from: e */
    public final C22871g f285683e;

    /* renamed from: f */
    public final AlertDialog.Builder f285684f;

    /* renamed from: g */
    public final C102331bd f285685g;

    /* renamed from: h */
    public final C102360cf f285686h;

    /* renamed from: i */
    public View f285687i;

    /* renamed from: j */
    public C102358cd f285688j;

    /* renamed from: k */
    public final boolean f285689k;

    /* renamed from: l */
    public final boolean f285690l;

    /* renamed from: m */
    public final boolean f285691m;

    /* renamed from: n */
    public final boolean f285692n;

    /* renamed from: o */
    public boolean f285693o = false;

    /* renamed from: p */
    private final C21370a f285694p;

    /* renamed from: q */
    private long f285695q = 0;

    public C102374p(C21370a aVar, C102288a aVar2, C91189au auVar, C64629b bVar, View view, C22871g gVar, C102360cf cfVar) {
        boolean z = false;
        this.f285694p = aVar;
        this.f285679a = aVar2;
        this.f285680b = auVar;
        C65930h hVar = bVar.f175189b;
        this.f285681c = hVar == null ? C65930h.f179300i : hVar;
        this.f285682d = view;
        this.f285683e = gVar;
        this.f285686h = cfVar;
        this.f285689k = bVar.f175194g;
        this.f285690l = bVar.f175193f;
        this.f285691m = Runtime.getRuntime().maxMemory() <= 268435456 ? true : z;
        this.f285692n = bVar.f175195h;
        this.f285684f = new AlertDialog.Builder(view.getContext());
        this.f285685g = new C102331bd(view.findViewById(R.id.image_viewer_page_visual_elements), cfVar);
    }

    /* renamed from: a */
    static String m169701a(C65930h hVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C65937o.f179333l);
        hVar.mo58887l(r0);
        if (!hVar.f169962ag.mo58857o(r0.f169971d)) {
            return BuildConfig.FLAVOR;
        }
        C62940bt r02 = C62942bv.checkIsLite(C65937o.f179333l);
        hVar.mo58887l(r02);
        Object l = hVar.f169962ag.mo58854l(r02.f169971d);
        if (l == null) {
            obj = r02.f169969b;
        } else {
            obj = r02.mo58889c(l);
        }
        C65937o oVar = (C65937o) obj;
        return oVar.f179343i.isEmpty() ? oVar.f179338d : oVar.f179343i;
    }

    /* renamed from: b */
    static void m169702b(View view) {
        if (view != null) {
            view.bringToFront();
        }
    }

    /* renamed from: h */
    static boolean m169703h(C65930h hVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C65937o.f179333l);
        hVar.mo58887l(r0);
        if (!hVar.f169962ag.mo58857o(r0.f169971d)) {
            return false;
        }
        C62940bt r02 = C62942bv.checkIsLite(C65937o.f179333l);
        hVar.mo58887l(r02);
        Object l = hVar.f169962ag.mo58854l(r02.f169971d);
        if (l == null) {
            obj = r02.f169969b;
        } else {
            obj = r02.mo58889c(l);
        }
        return (((C65937o) obj).f179335a & 32) != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo93172c() {
        String str;
        Object obj;
        C102358cd cdVar = this.f285688j;
        if (cdVar != null) {
            C65928f fVar = this.f285681c.f179305d;
            if (fVar == null) {
                fVar = C65928f.f179293f;
            }
            String str2 = fVar.f179296b;
            C65930h hVar = this.f285681c;
            C62940bt r3 = C62942bv.checkIsLite(C65937o.f179333l);
            hVar.mo58887l(r3);
            if (hVar.f169962ag.mo58857o(r3.f169971d)) {
                C65930h hVar2 = this.f285681c;
                C62940bt r32 = C62942bv.checkIsLite(C65937o.f179333l);
                hVar2.mo58887l(r32);
                Object l = hVar2.f169962ag.mo58854l(r32.f169971d);
                if (l == null) {
                    obj = r32.f169969b;
                } else {
                    obj = r32.mo58889c(l);
                }
                str = ((C65937o) obj).f179338d;
            } else {
                str = null;
            }
            cdVar.f285657a.mo93141h(cdVar.f285658b, 22, str2, str);
        }
        C102288a aVar = this.f285679a;
        ((C102289b) aVar).f285407a.mo28345s("close", "ImagePageEventsDispatcher", new Bundle());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo93173d(String str) {
        if (mo93176g()) {
            C102288a aVar = this.f285679a;
            Bundle bundle = new Bundle();
            bundle.putString("url", str);
            ((C102289b) aVar).f285407a.mo28345s("openUrl_java.lang.String", "ImagePageEventsDispatcher", bundle);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo93174e() {
        if (mo93176g()) {
            C102288a aVar = this.f285679a;
            ((C102289b) aVar).f285407a.mo28345s("shareImageSearchResult", "ImagePageEventsDispatcher", new Bundle());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo93175f(C65930h hVar, boolean z) {
        C102288a aVar = this.f285679a;
        Bundle bundle = new Bundle();
        C65930h.f179300i.getParserForType();
        C62921ba.m95368a();
        bundle.putParcelable("image", C23245b.m43556a(hVar));
        bundle.putBoolean("save", Boolean.valueOf(z).booleanValue());
        ((C102289b) aVar).f285407a.mo28345s("updateSavedState_com.google.protos.gws.common.images.ImageMetadataOuterClass.ImageMetadata_boolean", "ImagePageEventsDispatcher", bundle);
    }

    /* renamed from: g */
    public final boolean mo93176g() {
        if (this.f285694p.mo26870b() <= this.f285695q + 500) {
            return false;
        }
        this.f285695q = this.f285694p.mo26870b();
        return true;
    }
}
