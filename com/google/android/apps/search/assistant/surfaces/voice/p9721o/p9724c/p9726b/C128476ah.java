package com.google.android.apps.search.assistant.surfaces.voice.p9721o.p9724c.p9726b;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.FragmentManager;
import android.widget.RelativeLayout;
import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79570b;
import com.google.android.apps.search.assistant.surfaces.voice.p9721o.p9724c.p9728d.C128541f;
import com.google.android.apps.search.assistant.surfaces.voice.p9721o.p9724c.p9728d.C128543h;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import dagger.hilt.android.internal.managers.C68324h;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.o.c.b.ah */
/* compiled from: PG */
public final class C128476ah implements C46792di {

    /* renamed from: a */
    final /* synthetic */ C128483ao f353338a;

    /* renamed from: b */
    final /* synthetic */ RelativeLayout f353339b;

    public C128476ah(C128483ao aoVar, RelativeLayout relativeLayout) {
        this.f353338a = aoVar;
        this.f353339b = relativeLayout;
    }

    /* renamed from: a */
    public final void mo18077a(Throwable th) {
        C69664n.m101061g(th, C42181t.f110467a);
        C59052c cVar = (C59052c) ((C59052c) C128483ao.f353347a.mo56225c()).mo56382g(th);
        cVar.mo56379ah(new C59094n(38866));
        cVar.mo56386p("#MWW Failed to update UI.");
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
        C128543h hVar = (C128543h) obj;
        C69664n.m101061g(hVar, "data");
        C128543h hVar2 = (C128543h) this.f353338a.f353358k.get();
        if (C128495b.m209692a(hVar) && !hVar.f353473h) {
            C128483ao.m209656m(this.f353338a, hVar, 0, 6);
        }
        C128541f a = C128541f.m209785a(hVar.f353467b);
        if (a == null) {
            a = C128541f.WARM_ACTIONS_UI_BEHAVIOR_UNSPECIFIED;
        }
        if (a == C128541f.ANSWERING) {
            C128541f a2 = C128541f.m209785a(hVar2.f353467b);
            if (a2 == null) {
                a2 = C128541f.WARM_ACTIONS_UI_BEHAVIOR_UNSPECIFIED;
            }
            if (a2 != C128541f.ANSWERING) {
                if (this.f353338a.mo108465d().getVisibility() == 0) {
                    this.f353338a.mo108470i(C128472ad.f353334a);
                }
                C128483ao aoVar = this.f353338a;
                Drawable background = aoVar.mo108464c().getBackground();
                C69664n.m101059e(background, "null cannot be cast to non-null type android.graphics.drawable.RippleDrawable");
                RippleDrawable rippleDrawable = (RippleDrawable) background;
                Rect bounds = rippleDrawable.getBounds();
                C69664n.m101060f(bounds, "ripple.getBounds()");
                rippleDrawable.setHotspot(bounds.exactCenterX(), (float) bounds.bottom);
                rippleDrawable.setState(new int[]{16842919, 16842910});
                aoVar.mo108468g();
                aoVar.mo108469h();
                FragmentManager childFragmentManager = aoVar.f353352e.getChildFragmentManager();
                C69664n.m101060f(childFragmentManager, "fragment.childFragmentManager");
                C0154a aVar = new C0154a(childFragmentManager);
                aVar.mo691x(17432576, 0, 0, 0);
                C128528t tVar = new C128528t();
                C68324h.m98669f(tVar);
                aVar.mo689v(R.id.assistant_guacamole_pill_container, tVar, (String) null);
                aVar.mo509f();
                rippleDrawable.setState(new int[0]);
                C69664n.m101060f(hVar2, "lastData");
                if (!C128495b.m209692a(hVar2)) {
                    C128483ao aoVar2 = this.f353338a;
                    aoVar2.f353357j = aoVar2.mo108462a(this.f353339b, aoVar2.f353357j);
                }
                this.f353338a.f353358k.set(hVar);
            }
        }
        if (C128495b.m209692a(hVar)) {
            C128541f a3 = C128541f.m209785a(hVar.f353467b);
            if (a3 == null) {
                a3 = C128541f.WARM_ACTIONS_UI_BEHAVIOR_UNSPECIFIED;
            }
            C128541f fVar = C128541f.ANSWERING;
            if (a3 != fVar) {
                C128541f a4 = C128541f.m209785a(hVar2.f353467b);
                if (a4 == null) {
                    a4 = C128541f.WARM_ACTIONS_UI_BEHAVIOR_UNSPECIFIED;
                }
                if (a4 == fVar) {
                    FragmentManager childFragmentManager2 = this.f353338a.f353352e.getChildFragmentManager();
                    C69664n.m101060f(childFragmentManager2, "fragment.childFragmentManager");
                    C0154a aVar2 = new C0154a(childFragmentManager2);
                    aVar2.mo691x(17432576, 0, 0, 0);
                    aVar2.mo689v(R.id.assistant_guacamole_pill_container, C128489au.m209678f(), (String) null);
                    aVar2.mo509f();
                    this.f353338a.f353358k.set(hVar);
                }
            }
        }
        C69664n.m101060f(hVar2, "lastData");
        if (C128495b.m209692a(hVar2) || !C128495b.m209692a(hVar)) {
            if (C128495b.m209692a(hVar2) && !C128495b.m209692a(hVar)) {
                C128483ao aoVar3 = this.f353338a;
                if (aoVar3.f353352e.getView() != null) {
                    aoVar3.f353357j = aoVar3.mo108463b(aoVar3.mo108466e(), aoVar3.f353357j, new C128473ae(aoVar3));
                }
            }
            this.f353338a.f353358k.set(hVar);
        }
        C128483ao aoVar4 = this.f353338a;
        C79570b a5 = C79570b.m127648a(hVar.f353468c);
        if (a5 == null) {
            a5 = C79570b.CONTEXT_TYPE_UNSPECIFIED;
        }
        C69664n.m101060f(a5, "data.contextType");
        FragmentManager childFragmentManager3 = aoVar4.f353352e.getChildFragmentManager();
        C69664n.m101060f(childFragmentManager3, "fragment.childFragmentManager");
        C0154a aVar3 = new C0154a(childFragmentManager3);
        aVar3.mo689v(R.id.assistant_guacamole_pill_container, C128489au.m209678f(), (String) null);
        aVar3.mo509f();
        aoVar4.f353357j = aoVar4.mo108462a(aoVar4.mo108466e(), aoVar4.f353357j);
        int ordinal = a5.ordinal();
        if (ordinal == 1) {
            aoVar4.f353356i.mo108809a(155778, aoVar4.mo108464c());
        } else if (ordinal == 2) {
            aoVar4.f353356i.mo108809a(155779, aoVar4.mo108464c());
        } else if (ordinal == 7 || ordinal == 8 || ordinal == 12 || ordinal == 13) {
            aoVar4.f353356i.mo108809a(155780, aoVar4.mo108464c());
        } else {
            C59052c cVar = (C59052c) C128483ao.f353347a.mo56226d();
            cVar.mo56379ah(new C59094n(38867));
            cVar.mo56386p("#MWW VE logging not happening for particular context type.");
        }
        this.f353338a.f353358k.set(hVar);
    }

    /* renamed from: c */
    public final /* synthetic */ void mo18079c() {
    }
}
