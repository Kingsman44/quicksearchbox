package com.google.android.apps.search.googleapp.discover.p10178b;

import android.view.MotionEvent;
import android.view.View;
import com.facebook.litho.C6103an;
import com.facebook.litho.C6143bx;
import com.facebook.litho.C6154cb;
import com.facebook.litho.C6168cp;
import com.facebook.litho.C6177cy;
import com.facebook.litho.C6393hr;
import com.facebook.litho.C6394hs;
import com.facebook.litho.C6395i;
import com.facebook.litho.C6407q;
import com.facebook.litho.C6411u;
import com.facebook.litho.p323b.C6117a;
import com.facebook.litho.p323b.C6118b;
import com.facebook.litho.p323b.C6119c;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import java.util.List;

/* renamed from: com.google.android.apps.search.googleapp.discover.b.g */
/* compiled from: PG */
public final class C134101g extends C6407q {
    @C6117a(mo12871a = 13)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: a */
    C134097c f365291a;
    @C6117a(mo12871a = 6)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: b */
    List f365292b;

    public C134101g() {
        super("TouchInterceptingAd");
    }

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public final Object mo12796O(C6154cb cbVar, Object obj) {
        int i = cbVar.f18198c;
        if (i == -1048037474) {
            C6103an.m15875b((C6411u) cbVar.f18199d[0], (C6143bx) obj);
            return null;
        } else if (i != 123673758) {
            return null;
        } else {
            C6177cy cyVar = (C6177cy) obj;
            C6168cp cpVar = cbVar.f18197b;
            C6411u uVar = (C6411u) cbVar.f18199d[0];
            View view = cyVar.f18223a;
            MotionEvent motionEvent = cyVar.f18224b;
            C134097c cVar = ((C134101g) cpVar).f365291a;
            C46459k.m82829b(cVar.f365282a.mo19399b(C47810es.m84978r(new C134096b(cVar, motionEvent))), "Failed to handle touch event.", new Object[0]);
            return Boolean.valueOf(view.onTouchEvent(motionEvent));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C6407q mo12835c(C6411u uVar) {
        C6407q qVar;
        List list = this.f365292b;
        if (list == null) {
            ((C59052c) ((C59052c) C134102h.f365293a.mo56225c()).mo56372aa(40236)).mo56386p("Nullable list of children to wrap, using empty component.");
            qVar = C6395i.m17143b(uVar).f18849a;
        } else if (list.isEmpty()) {
            ((C59052c) ((C59052c) C134102h.f365293a.mo56225c()).mo56372aa(40235)).mo56386p("Empty list of children to wrap, using empty component.");
            qVar = C6395i.m17143b(uVar).f18849a;
        } else {
            if (list.size() > 1) {
                ((C59052c) ((C59052c) C134102h.f365293a.mo56225c()).mo56372aa(40234)).mo56386p("> 1 children to wrap, using first child.");
            }
            qVar = (C6407q) list.get(0);
        }
        C6393hr b = C6394hs.m17136b(uVar);
        b.mo13404d(qVar);
        b.f18980c.mo13456J().mo13411E().mo13052V(m15817L(C134101g.class, "TouchInterceptingAd", uVar, 123673758, new Object[]{uVar}));
        return b.mo13259a();
    }
}
