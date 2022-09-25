package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.gsa.assistant.shared.g.a;
import com.google.android.apps.gsa.assistant.shared.g.b;
import com.google.android.apps.gsa.assistant.shared.g.c;
import com.google.android.apps.gsa.assistant.shared.g.f;
import com.google.android.apps.gsa.assistant.shared.p5816g.C73867g;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.apps.search.assistant.platform.p9139g.p9140a.C120920ap;
import com.google.android.apps.search.assistant.platform.p9139g.p9140a.C120921aq;
import com.google.android.apps.search.assistant.platform.p9139g.p9140a.C120923as;
import com.google.android.apps.search.assistant.platform.p9139g.p9140a.C120928ax;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.inject.C47266f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;

/* compiled from: PG */
public class OpaAppWidgetCard extends LinearLayout implements C73867g, C108359fu {

    /* renamed from: f */
    private static final C59071e f300915f = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.chatui.OpaAppWidgetCard");

    /* renamed from: a */
    public final SettableFuture f300916a = new SettableFuture();

    /* renamed from: b */
    public C120921aq f300917b;

    /* renamed from: c */
    C120923as f300918c = null;

    /* renamed from: d */
    public final Context f300919d;

    /* renamed from: e */
    public final AppWidgetManager f300920e;

    /* renamed from: g */
    private Drawable f300921g;

    /* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.OpaAppWidgetCard$a */
    /* compiled from: PG */
    public interface C108189a {
        /* renamed from: BT */
        void mo96566BT();
    }

    public OpaAppWidgetCard(Context context) {
        super(context);
        this.f300919d = context;
        this.f300920e = AppWidgetManager.getInstance(context);
    }

    /* renamed from: f */
    private static boolean m179605f(ViewGroup viewGroup) {
        if (viewGroup instanceof AdapterView) {
            return true;
        }
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof ViewGroup) && m179605f((ViewGroup) childAt)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final C60870cx mo65343a(C90931ca caVar) {
        c createBuilder = f.d.createBuilder();
        a createBuilder2 = b.f.createBuilder();
        createBuilder2.copyOnWrite();
        b bVar = createBuilder2.instance;
        bVar.a |= 1;
        bVar.b = "App Widget Card";
        b build = createBuilder2.build();
        createBuilder.copyOnWrite();
        f fVar = createBuilder.instance;
        build.getClass();
        fVar.b = build;
        fVar.a |= 1;
        return C60856cj.m92900i(createBuilder.build());
    }

    /* renamed from: b */
    public final Drawable mo96559b() {
        C120921aq aqVar;
        if (this.f300921g == null && (aqVar = this.f300917b) != null) {
            String i = aqVar.mo104987i();
            try {
                this.f300921g = this.f300919d.getPackageManager().getApplicationIcon(i);
            } catch (PackageManager.NameNotFoundException e) {
                ((C59052c) ((C59052c) ((C59052c) f300915f.mo56225c()).mo56382g(e)).mo56372aa(24020)).mo56389s("Could not find application icon for widget provider package %s", i);
                return null;
            }
        }
        return this.f300921g;
    }

    /* renamed from: c */
    public final C60870cx mo96560c(C120920ap apVar) {
        Context context = this.f300919d;
        if (context != null) {
            ((C120928ax) apVar).f336218a = context;
            apVar.mo104976l(Build.VERSION.SDK_INT < 31);
            C120921aq c = apVar.mo104967c();
            this.f300917b = c;
            c.mo104987i();
            return this.f300916a;
        }
        throw new NullPointerException("Null context");
    }

    /* renamed from: d */
    public final void mo96561d(String str) {
        TextView textView = (TextView) findViewById(R.id.app_widget_text);
        textView.getClass();
        textView.setVisibility(0);
        textView.setText(str);
    }

    /* renamed from: e */
    public final boolean mo96562e() {
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.widget_card_wrapper);
        return viewGroup != null && m179605f(viewGroup);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C120923as asVar = this.f300918c;
        if (asVar != null) {
            asVar.mo104996e();
            this.f300918c = null;
        }
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        ((C108189a) C47266f.m84076a(this.f300919d, C108189a.class)).mo96566BT();
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ViewGroup viewGroup;
        if (!mo96562e() || (viewGroup = (ViewGroup) getParent()) == null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        viewGroup.requestDisallowInterceptTouchEvent(true);
        return false;
    }

    public OpaAppWidgetCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f300919d = context;
        this.f300920e = AppWidgetManager.getInstance(context);
    }

    public OpaAppWidgetCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f300919d = context;
        this.f300920e = AppWidgetManager.getInstance(context);
    }
}
