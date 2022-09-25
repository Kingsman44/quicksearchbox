package com.google.android.apps.gsa.staticplugins.opa.imageviewer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.viewpager.widget.C4268a;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.shared.p7195y.C91193ay;
import com.google.android.apps.gsa.shared.p7195y.C91196ba;
import com.google.android.apps.gsa.shared.p7195y.C91222n;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3897e.p3921j.C52223ju;
import com.google.common.p4526f.C59071e;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.imageviewer.b */
/* compiled from: PG */
public final class C109280b extends C4268a {

    /* renamed from: c */
    public static final C59071e f304414c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.imageviewer.b");

    /* renamed from: d */
    private final Context f304415d;

    /* renamed from: e */
    private final C91189au f304416e;

    /* renamed from: f */
    private final C22871g f304417f;

    /* renamed from: g */
    private final List f304418g;

    /* renamed from: h */
    private final List f304419h;

    public C109280b(Context context, List list, List list2, C91189au auVar, C22871g gVar) {
        this.f304415d = context;
        this.f304418g = list;
        this.f304419h = list2;
        this.f304416e = auVar;
        this.f304417f = gVar;
    }

    /* renamed from: d */
    public final void mo646d(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    /* renamed from: gw */
    public final Object mo649gw(ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(this.f304415d).inflate(R.layout.imageviewerpage_layout, viewGroup, false);
        RelativeLayout relativeLayout = (RelativeLayout) viewGroup2.findViewById(R.id.progress_bar);
        relativeLayout.setVisibility(0);
        ImageView imageView = (ImageView) viewGroup2.findViewById(R.id.photo_thumbnail);
        C91189au auVar = this.f304416e;
        C91193ay q = C91196ba.m149039q();
        C91222n nVar = (C91222n) q;
        nVar.f254620a = ((C52223ju) this.f304418g.get(i)).f137041b;
        if (i < this.f304419h.size()) {
            nVar.f254623d = ((ImageView) this.f304419h.get(i)).getDrawable();
        }
        this.f304417f.mo28211k(auVar.mo85420h(q.mo85445c(), imageView), "Photo load callback", new C109279a(relativeLayout));
        viewGroup.addView(viewGroup2);
        return viewGroup2;
    }

    /* renamed from: i */
    public final boolean mo652i(View view, Object obj) {
        return view == obj;
    }

    /* renamed from: k */
    public final int mo9175k() {
        return this.f304418g.size();
    }
}
