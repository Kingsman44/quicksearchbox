package com.google.android.libraries.search.rendering.xuikit.p3131d.p3138g;

import android.content.Context;
import com.google.android.libraries.elements.interfaces.C21252av;
import com.google.android.libraries.elements.interfaces.C21259bb;
import com.google.android.libraries.elements.p1707b.C20694a;
import com.google.android.libraries.elements.p1729h.C21203af;
import com.google.android.libraries.elements.p1729h.C21211i;
import com.google.android.libraries.elements.p1729h.C21217o;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3137f.C40353f;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3137f.C40354g;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3137f.C40355h;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3137f.C40358k;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3137f.C40359l;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3137f.C40361n;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58528ij;
import java.util.concurrent.Executor;
import p5304e.p5305a.p5306a.p5346al.p5347a.p5348a.C68445d;
import p5304e.p5305a.p5306a.p5346al.p5347a.p5348a.C68451j;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.d.g.ab */
/* compiled from: PG */
public final class C40370ab {
    /* renamed from: b */
    public static C40354g m70038b(C40354g gVar) {
        return gVar != null ? gVar : new C40354g((byte[]) null);
    }

    /* renamed from: c */
    public static C40355h m70039c(C40358k kVar) {
        kVar.mo42416c("Runtime.Created");
        return C40355h.f105992a;
    }

    /* renamed from: d */
    public static C58833ax m70040d(Context context, C40358k kVar) {
        C58833ax axVar;
        if (C68445d.f184764a.mo6453a().mo60392a(context)) {
            axVar = C58833ax.m90834k(new C21217o());
        } else {
            axVar = C58836b.f156633a;
        }
        return C68451j.f184773a.mo60398b().mo60400b(context) ? C58833ax.m90834k(new C40353f(kVar, (C21203af) axVar.mo56109e(C21203af.f59490a), context)) : axVar;
    }

    /* renamed from: e */
    public static C21252av m70041e(C21370a aVar, Executor executor, C58833ax axVar) {
        return axVar.mo56113h() ? new C21211i(new C40369aa(aVar), (C21203af) axVar.mo56107c(), executor) : C21252av.f59573a;
    }

    /* renamed from: f */
    public static C21259bb m70042f(C40361n nVar, C40359l lVar) {
        return new C20694a(C58528ij.m90011K(lVar, nVar));
    }
}
