package com.google.android.libraries.search.rendering.xuikit.bubbles;

import android.content.Context;
import androidx.core.p097i.C1967b;
import com.google.android.apps.gsa.binaries.satin.app.apv;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3121c.C40111d;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3121c.C40113f;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3122d.C40124j;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3122d.C40125k;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.C40164aj;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.C40165ak;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.C40171aq;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.C40173as;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.C40230k;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.p3124a.C40137i;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.p3125b.C40182a;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.p3125b.C40201l;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.p3125b.p3126a.C40183a;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.p3128d.C40219b;
import com.google.android.libraries.search.rendering.xuikit.bubbles.view.BackButtonFrameLayout;
import com.google.android.libraries.search.rendering.xuikit.bubbles.view.BubbleView;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3137f.C40364q;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.bubbles.g */
/* compiled from: PG */
public final class C40253g {

    /* renamed from: a */
    public static final C59071e f105724a = C59071e.m91332i("com.google.android.libraries.search.rendering.xuikit.bubbles.g");

    /* renamed from: b */
    public final C40164aj f105725b;

    /* renamed from: c */
    public final Context f105726c;

    /* renamed from: d */
    public final C21370a f105727d;

    /* renamed from: e */
    public final C40113f f105728e;

    /* renamed from: f */
    public C40107c f105729f;

    /* renamed from: g */
    public C40165ak f105730g;

    /* renamed from: h */
    public C40246f f105731h = C40246f.DESTROYED;

    /* renamed from: i */
    public final apv f105732i;

    public C40253g(apv apv, C40164aj ajVar, Context context, C21370a aVar, C40113f fVar) {
        this.f105732i = apv;
        this.f105725b = ajVar;
        this.f105726c = context;
        this.f105727d = aVar;
        this.f105728e = fVar;
    }

    /* renamed from: a */
    public final void mo42354a() {
        C58485gu a;
        if (this.f105731h != C40246f.CREATED) {
            ((C59052c) ((C59052c) f105724a.mo56225c()).mo56372aa(53205)).mo56389s("destroy() called on bubble with state [%s]", this.f105731h);
        }
        C40165ak akVar = this.f105730g;
        if (akVar != null) {
            C28439i iVar = akVar.f105508o;
            if (iVar != null) {
                akVar.f105504k.mo33921e(iVar);
                akVar.f105504k.mo33922f();
            }
            C40219b bVar = akVar.f105498e;
            if (bVar != null) {
                C40201l lVar = (C40201l) bVar;
                lVar.f105618a.onStop();
                lVar.f105619b.onStop();
                C40111d d = lVar.f105622e.mo42195d();
                if (lVar.f105620c.f105562b.remove(d) == null) {
                    ((C59052c) ((C59052c) C40182a.f105561a.mo56226d()).mo56372aa(53281)).mo56386p("Cannot remove a Bubble Datastore because it does not exist.");
                }
                C40183a aVar = lVar.f105621d;
                C69664n.m101061g(d, "bubbleId");
                synchronized (aVar.f105565c) {
                    if (aVar.f105566d.remove(d) == null) {
                        C59052c cVar = (C59052c) C40183a.f105563a.mo56226d();
                        cVar.mo56378ag(C40364q.f106014a, aVar.f105564b.mo42422a());
                        cVar.mo56379ah(new C59094n(53286));
                        cVar.mo56386p("Cannot remove an entry from BubbleResponseStore because it does not exist.");
                    }
                }
            }
            C40230k kVar = akVar.f105511r;
            if (kVar != null) {
                kVar.f105687a.mo42295b();
            }
            C40137i iVar2 = akVar.f105512s;
            if (iVar2 != null) {
                iVar2.f105434o = 2;
                iVar2.f105425f.mo42217a();
                iVar2.f105424e.f105470a.remove(iVar2);
            }
            C40173as asVar = akVar.f105515v;
            if (asVar != null) {
                asVar.f105536c.mo42217a();
                asVar.f105535b.mo42362c((C1967b) null);
                BubbleView bubbleView = asVar.f105535b;
                bubbleView.f105746a = null;
                asVar.f105534a.removeView(bubbleView);
            }
            BubbleView bubbleView2 = akVar.f105517x;
            if (bubbleView2 != null) {
                akVar.f105496c.removeView(bubbleView2);
            }
            BubbleView bubbleView3 = akVar.f105518y;
            if (bubbleView3 != null) {
                akVar.f105496c.removeView(bubbleView3);
            }
            BackButtonFrameLayout backButtonFrameLayout = akVar.f105516w;
            if (backButtonFrameLayout != null) {
                akVar.f105496c.removeView(backButtonFrameLayout);
            }
            C40171aq aqVar = akVar.f105491B;
            if (aqVar != null) {
                aqVar.mo42289a();
            }
            C40124j jVar = akVar.f105502i;
            C40111d d2 = akVar.f105500g.mo42195d();
            C40125k kVar2 = jVar.f105377a;
            synchronized (kVar2.f105382a) {
                kVar2.f105383b.remove(d2);
                if (kVar2.f105383b.isEmpty()) {
                    kVar2.f105384c.mo57356n((Object) null);
                }
                a = kVar2.mo42215a();
            }
            jVar.mo42214a(a);
            akVar.f105509p.mo42217a();
        }
        this.f105731h = C40246f.DESTROYED;
    }
}
