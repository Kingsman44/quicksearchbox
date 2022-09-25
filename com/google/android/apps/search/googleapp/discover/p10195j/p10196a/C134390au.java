package com.google.android.apps.search.googleapp.discover.p10195j.p10196a;

import android.view.View;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.elements.interfaces.C21312s;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3133b.C40335z;
import com.google.android.libraries.search.video.conductor.AutoplayConductorImpl;
import com.google.android.libraries.search.video.conductor.C41482e;
import com.google.android.libraries.search.video.p3194d.C41500k;
import com.google.protobuf.C62917ay;
import com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4916c.p4921c.p4922a.C64198at;
import com.google.protos.youtube.elements.C66059au;
import java.util.HashMap;
import java.util.Map;
import p5488io.p5490b.C69794a;
import p5488io.p5490b.p5496d.C69822d;
import p5488io.p5490b.p5497e.p5502e.p5503a.C69874i;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: com.google.android.apps.search.googleapp.discover.j.a.au */
/* compiled from: PG */
public final class C134390au implements C21312s {

    /* renamed from: a */
    public final C40335z f366094a;

    /* renamed from: b */
    public final C41482e f366095b;

    public C134390au(C41482e eVar, C40335z zVar) {
        this.f366095b = eVar;
        this.f366094a = zVar;
    }

    /* renamed from: a */
    public final C62917ay mo25802a() {
        return C64198at.f173577h;
    }

    /* renamed from: b */
    public final /* synthetic */ C66059au mo25803b() {
        return null;
    }

    /* renamed from: c */
    public final /* synthetic */ C69794a mo25804c(Object obj, C21311r rVar) {
        C64198at atVar = (C64198at) obj;
        View b = rVar.mo26732b();
        if (b == null) {
            return C69794a.m101254f(new IllegalArgumentException("CommandHandler requires eventData to have a view"));
        }
        AutoplayConductorImpl a = this.f366095b.mo44003a(atVar.f173583e);
        if (!atVar.f173580b) {
            Map map = (Map) b.getTag(R.id.googleapp_tag_autoplay_tracking_map);
            if (map != null && !map.isEmpty()) {
                if ((atVar.f173579a & 16) == 0) {
                    return C69794a.m101254f(new IllegalArgumentException("SetAutoplayCommand was started with an anchor view and conductor id, it must be stopped with a conductor id"));
                }
                View view = (View) map.remove(atVar.f173584f);
                if (view != null) {
                    b = view;
                }
            }
            a.mo43995c(b);
            C69794a aVar = C69874i.f186267a;
            C69822d dVar = C70101a.f186847o;
            return aVar;
        }
        View a2 = rVar.mo26731a();
        if (!(a2 == null || (atVar.f173579a & 16) == 0)) {
            Map map2 = (Map) b.getTag(R.id.googleapp_tag_autoplay_tracking_map);
            if (map2 == null) {
                map2 = new HashMap();
                b.setTag(R.id.googleapp_tag_autoplay_tracking_map, map2);
            }
            map2.put(atVar.f173584f, a2);
            b = a2;
        }
        a.mo43997e(b, new C134389at(this, atVar, rVar), (C41500k) null);
        C69794a aVar2 = C69874i.f186267a;
        C69822d dVar2 = C70101a.f186847o;
        return aVar2;
    }
}
