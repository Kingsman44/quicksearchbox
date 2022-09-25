package com.google.android.apps.search.googleapp.discover.streamui.impl.p10236c;

import android.view.View;
import com.google.android.apps.search.googleapp.promomanager.p10372b.C137007dh;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.googleapp.discover.streamui.impl.c.d */
/* compiled from: PG */
final class C134858d extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C134859e f367124a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C134858d(C134859e eVar) {
        super(1);
        this.f367124a = eVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        Map map;
        Object obj2;
        C137007dh dhVar = (C137007dh) obj;
        C69664n.m101061g(dhVar, "tooltip");
        C134859e eVar = this.f367124a;
        if (eVar.mo112036j() == 3) {
            map = eVar.f367127c;
        } else {
            if (eVar.mo112036j() == 2) {
                map = eVar.f367128d;
            }
            return null;
        }
        Set set = (Set) map.get(Integer.valueOf(C134859e.m218685k(dhVar)));
        if (set != null) {
            View view = eVar.f367126b.getView();
            if (view == null) {
                C59052c cVar = (C59052c) C134859e.f367125a.mo56225c();
                cVar.mo56379ah(new C59094n(40524));
                cVar.mo56386p("Cannot trigger 'maybeTriggerTooltip()' - DiscoverStreamFragment view is null.");
            } else {
                Iterator it = set.iterator();
                if (!it.hasNext()) {
                    obj2 = null;
                } else {
                    obj2 = it.next();
                    if (it.hasNext()) {
                        int l = C134859e.m218686l((View) obj2, view);
                        while (true) {
                            Object next = it.next();
                            int l2 = C134859e.m218686l((View) next, view);
                            int i = l > l2 ? l2 : l;
                            if (l > l2) {
                                obj2 = next;
                            }
                            if (!it.hasNext()) {
                                break;
                            }
                            l = i;
                        }
                    }
                }
                View view2 = (View) obj2;
                if (view2 != null) {
                    return new C134855a(dhVar, view2);
                }
            }
        }
        return null;
    }
}
