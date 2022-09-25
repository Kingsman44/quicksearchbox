package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SizeF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RemoteViews;
import android.widget.TextView;
import androidx.core.p098j.C2050bp;
import com.google.android.apps.gsa.assistant.shared.g.a;
import com.google.android.apps.gsa.assistant.shared.g.b;
import com.google.android.apps.gsa.assistant.shared.g.c;
import com.google.android.apps.gsa.assistant.shared.g.f;
import com.google.android.apps.gsa.assistant.shared.p5816g.C73867g;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.apps.search.assistant.platform.p9139g.p9140a.C120919ao;
import com.google.android.apps.search.assistant.platform.p9139g.p9140a.C120926av;
import com.google.android.apps.search.assistant.platform.p9139g.p9140a.C120931b;
import com.google.android.apps.search.assistant.platform.p9139g.p9140a.C120934bc;
import com.google.android.apps.search.assistant.platform.p9139g.p9140a.C120939bh;
import com.google.android.apps.search.assistant.platform.p9139g.p9140a.C120940bi;
import com.google.android.apps.search.assistant.platform.p9139g.p9140a.C120942bk;
import com.google.android.apps.search.assistant.platform.p9139g.p9140a.C120947c;
import com.google.android.apps.search.assistant.platform.p9139g.p9140a.C120948d;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.inject.C47266f;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.Iterator;
import p5462h.p5473f.p5475b.C69664n;

/* compiled from: PG */
public final class OpaAppActionsServiceCard extends LinearLayout implements C73867g, C120931b {

    /* renamed from: a */
    public C68214a f300896a;

    /* renamed from: b */
    public Runnable f300897b;

    /* renamed from: c */
    private final C120926av f300898c;

    /* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.OpaAppActionsServiceCard$a */
    /* compiled from: PG */
    public interface C108187a {
        /* renamed from: qD */
        void mo96553qD(OpaAppActionsServiceCard opaAppActionsServiceCard);
    }

    public OpaAppActionsServiceCard(Context context) {
        super(context);
        this.f300898c = new C120926av(context);
    }

    /* renamed from: a */
    public final C60870cx mo65343a(C90931ca caVar) {
        c createBuilder = f.d.createBuilder();
        a createBuilder2 = b.f.createBuilder();
        createBuilder2.copyOnWrite();
        b bVar = createBuilder2.instance;
        bVar.a |= 1;
        bVar.b = "App Actions Service Host View";
        b build = createBuilder2.build();
        createBuilder.copyOnWrite();
        f fVar = createBuilder.instance;
        build.getClass();
        fVar.b = build;
        fVar.a |= 1;
        return C60856cj.m92900i(createBuilder.build());
    }

    /* renamed from: b */
    public final void mo96545b(C120940bi biVar) {
        View view;
        C120926av avVar = this.f300898c;
        int i = biVar.f336253a;
        C69664n.m101061g(avVar, "<this>");
        Iterator a = C2050bp.m5609a(avVar).mo5191a();
        while (true) {
            if (!a.hasNext()) {
                view = null;
                break;
            }
            view = C120934bc.m200196a((View) a.next(), i, AbsListView.class);
            if (view != null) {
                break;
            }
        }
        AbsListView absListView = (AbsListView) view;
        if (absListView != null) {
            absListView.setAdapter(new C120942bk(getContext(), biVar.f336254b));
        }
    }

    /* renamed from: c */
    public final void mo96546c() {
        TextView textView = (TextView) findViewById(R.id.app_actions_service_title_text);
        textView.setVisibility(0);
        textView.setText(getContext().getText(R.string.actions_service_error_text));
    }

    /* renamed from: d */
    public final void mo96547d(RemoteViews remoteViews, SizeF sizeF) {
        C120948d dVar;
        C120947c cVar;
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.app_actions_service_wrapper);
        linearLayout.removeView(this.f300898c);
        this.f300898c.setLayoutParams(new FrameLayout.LayoutParams(-1, (int) C120919ao.m200120a(getContext(), sizeF.getHeight())));
        linearLayout.addView(this.f300898c);
        this.f300898c.updateAppWidget(remoteViews);
        C68214a aVar = this.f300896a;
        if (aVar != null && (dVar = (C120948d) aVar.mo27525b()) != null && (cVar = (C120947c) dVar.mo105012a().get()) != null) {
            C120926av avVar = this.f300898c;
            C69664n.m101061g(avVar, "<this>");
            ArrayList arrayList = new ArrayList();
            Iterator a = C2050bp.m5609a(avVar).mo5191a();
            while (a.hasNext()) {
                C120934bc.m200197b((View) a.next(), arrayList);
            }
            cVar.mo104962c(new C120939bh(arrayList));
        }
    }

    /* renamed from: e */
    public final void mo96548e(String str) {
        TextView textView = (TextView) findViewById(R.id.app_actions_service_title_text);
        textView.getClass();
        textView.setText(str);
        textView.setVisibility(0);
    }

    /* renamed from: f */
    public final void mo96549f() {
        getViewTreeObserver().addOnGlobalLayoutListener(new C108346fh(this));
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f300897b;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        ((C108187a) C47266f.m84076a(getContext(), C108187a.class)).mo96553qD(this);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ViewParent parent = getParent();
        if (parent == null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        parent.requestDisallowInterceptTouchEvent(true);
        return false;
    }

    public OpaAppActionsServiceCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f300898c = new C120926av(context);
    }

    public OpaAppActionsServiceCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f300898c = new C120926av(context);
    }
}
