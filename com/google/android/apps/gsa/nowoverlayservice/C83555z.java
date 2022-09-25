package com.google.android.apps.gsa.nowoverlayservice;

import android.animation.ObjectAnimator;
import android.animation.RectEvaluator;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import org.chromium.net.PrivateKeyType;

/* renamed from: com.google.android.apps.gsa.nowoverlayservice.z */
/* compiled from: PG */
public final /* synthetic */ class C83555z implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C83426aa f227856a;

    /* renamed from: b */
    public final /* synthetic */ Intent f227857b;

    /* renamed from: c */
    public final /* synthetic */ Rect f227858c;

    /* renamed from: d */
    public final /* synthetic */ String f227859d;

    public /* synthetic */ C83555z(C83426aa aaVar, Intent intent, Rect rect, String str) {
        this.f227856a = aaVar;
        this.f227857b = intent;
        this.f227858c = rect;
        this.f227859d = str;
    }

    public final void run() {
        C83426aa aaVar = this.f227856a;
        Intent intent = this.f227857b;
        Rect rect = this.f227858c;
        int i = 1;
        aaVar.f227400a.f227849t.mo81818n(this.f227859d, true);
        aaVar.f227400a.f227849t.mo81827w(Query.f252741b, true);
        if (intent.getBooleanExtra("suppress_animations", false)) {
            aaVar.f227400a.mo76886j(1112);
            aaVar.f227400a.f227841l.mo76801j();
            return;
        }
        boolean booleanExtra = intent.getBooleanExtra("use_fade_animation", false);
        if (booleanExtra) {
            i = 2;
        }
        if (booleanExtra) {
            aaVar.f227400a.mo76886j(1109);
        } else {
            aaVar.f227400a.mo76886j(886);
        }
        C83553y yVar = aaVar.f227400a;
        C83468bb bbVar = yVar.f227841l;
        View view = yVar.f227798N;
        Point point = (Point) intent.getParcelableExtra("source_logo_offset");
        Point point2 = (Point) intent.getParcelableExtra("source_mic_offset");
        float floatExtra = intent.getFloatExtra("source_mic_alpha", 1.0f);
        C58976aa aaVar2 = C58975e.f156826a;
        if (bbVar.f227545K) {
            bbVar.f227545K = false;
            bbVar.f227554e.f227587i = false;
            bbVar.f227574y.setOnTouchListener(bbVar.f227572w);
            bbVar.f227554e.mo81779L();
            view.findViewById(R.id.search_suggestions_linear).setTranslationY(0.0f);
            C83475bi biVar = bbVar.f227569t;
            biVar.getClass();
            biVar.mo76816b();
            bbVar.f227569t.mo76817c(false, false);
            C83475bi biVar2 = bbVar.f227569t;
            biVar2.f227598a.setBackground(biVar2.f227607j);
            ((ViewGroup.MarginLayoutParams) bbVar.f227574y.getLayoutParams()).topMargin = 0;
        }
        bbVar.f227553d.getClass();
        View findViewById = view.findViewById(R.id.search_overlay);
        View findViewById2 = view.findViewById(R.id.navigation_button);
        View findViewById3 = view.findViewById(R.id.clear_or_voice_button);
        View findViewById4 = view.findViewById(R.id.search_box);
        View findViewById5 = view.findViewById(R.id.search_plate);
        View findViewById6 = view.findViewById(R.id.search_plate_container);
        C83444as asVar = (C83444as) bbVar.f227553d;
        asVar.f227451b = view;
        asVar.f227452c = (ViewGroup) findViewById;
        asVar.f227453d = findViewById2;
        asVar.f227454e = findViewById3;
        asVar.f227455f = findViewById4;
        asVar.f227456g = findViewById5;
        asVar.f227457h = findViewById6;
        asVar.f227459j = new Rect();
        asVar.f227460k = new RectEvaluator(asVar.f227459j);
        asVar.f227458i = new C83440ao(asVar);
        asVar.f227444H = ObjectAnimator.ofInt(asVar.f227451b.getBackground(), "alpha", new int[]{0, PrivateKeyType.INVALID});
        bbVar.f227553d.mo76780e(i);
        bbVar.f227563n = rect;
        bbVar.f227564o = point;
        bbVar.f227566q = point2;
        bbVar.f227567r = floatExtra;
        bbVar.f227556g = false;
        bbVar.mo76800i(findViewById2);
    }
}
