package com.google.android.libraries.gsa.p1859d.p1860a;

import android.appwidget.AppWidgetHostView;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Process;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.RemoteViews;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.staticplugins.p7816dl.p7820d.C99701i;
import com.google.android.apps.gsa.staticplugins.p7816dl.p7820d.C99702j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.gsa.d.a.r */
/* compiled from: PG */
public final class C22747r extends AppWidgetHostView {

    /* renamed from: a */
    protected final Context f62592a;

    /* renamed from: b */
    private final View f62593b;

    /* renamed from: c */
    private final View f62594c;

    /* renamed from: d */
    private boolean f62595d = false;

    /* renamed from: e */
    private final C99701i f62596e;

    public C22747r(Context context, Executor executor, RemoteViews remoteViews, View view, View view2, C99701i iVar) {
        super(context);
        AppWidgetProviderInfo appWidgetProviderInfo;
        this.f62592a = context;
        this.f62593b = view;
        this.f62594c = view2;
        this.f62596e = iVar;
        if (executor != null) {
            setExecutor(executor);
        }
        AppWidgetManager instance = AppWidgetManager.getInstance(context);
        List<AppWidgetProviderInfo> installedProvidersForPackage = instance.getInstalledProvidersForPackage(context.getPackageName(), Process.myUserHandle());
        if (installedProvidersForPackage.isEmpty()) {
            Iterator<AppWidgetProviderInfo> it = instance.getInstalledProviders().iterator();
            while (true) {
                if (!it.hasNext()) {
                    Log.d("RemoteViewsHost", "Unable to fake AppWidgetProviderInfo.");
                    appWidgetProviderInfo = null;
                    break;
                }
                AppWidgetProviderInfo next = it.next();
                if (this.f62592a.getPackageName().equals(next.provider.getPackageName())) {
                    appWidgetProviderInfo = next;
                    break;
                }
            }
        } else {
            appWidgetProviderInfo = installedProvidersForPackage.get(0);
        }
        setAppWidget(-1, appWidgetProviderInfo);
        setPadding(0, 0, 0, 0);
        updateAppWidget(remoteViews);
    }

    public final void addView(View view) {
        C99701i iVar = this.f62596e;
        if (iVar != null) {
            C99702j jVar = iVar.f278991a;
            C22747r rVar = iVar.f278992b;
            if (jVar.f279002j.getChildCount() > 0 && jVar.f279002j.getChildAt(0) == rVar) {
                jVar.f279002j.removeViewAt(0);
                jVar.mo91572e();
            }
        }
        super.addView(view);
    }

    public final void clearChildFocus(View view) {
        super.clearChildFocus(view);
        setSelected(false);
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f62595d || keyEvent.getKeyCode() != 111 || keyEvent.getAction() != 1) {
            return super.dispatchKeyEvent(keyEvent);
        }
        this.f62595d = false;
        requestFocus();
        Log.d("RemoteViewsHost", "Release focus from child.");
        return true;
    }

    public final boolean dispatchUnhandledMove(View view, int i) {
        return this.f62595d;
    }

    /* access modifiers changed from: protected */
    public final boolean drawChild(Canvas canvas, View view, long j) {
        try {
            return super.drawChild(canvas, view, j);
        } catch (RuntimeException e) {
            Log.e("RemoteViewsHost", "Error occurred when drawing RemoteViews.", e);
            post(new C22745p(this));
            return false;
        }
    }

    public final View getDefaultView() {
        View view = this.f62593b;
        return view != null ? view : super.getDefaultView();
    }

    public final int getDescendantFocusability() {
        if (this.f62595d) {
            return C89885b.S3REQUEST_VALUE;
        }
        return 393216;
    }

    public final View getErrorView() {
        View view = this.f62594c;
        return view != null ? view : super.getErrorView();
    }

    /* access modifiers changed from: protected */
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        if (z) {
            this.f62595d = false;
            setSelected(false);
            Log.d("RemoteViewsHost", "Focus gained.");
        }
        super.onFocusChanged(z, i, rect);
    }

    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (keyEvent.isTracking() && !this.f62595d && i == 66) {
            this.f62595d = true;
            ArrayList focusables = getFocusables(2);
            focusables.remove(this);
            if (!focusables.isEmpty()) {
                ((View) focusables.get(0)).requestFocus();
                Log.d("RemoteViewsHost", "Grant focus to first child.");
                return true;
            }
            this.f62595d = false;
            Log.d("RemoteViewsHost", "No focusable children detected.");
            i = 66;
        }
        return super.onKeyUp(i, keyEvent);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        try {
            super.onLayout(z, i, i2, i3, i4);
        } catch (RuntimeException unused) {
            post(new C22745p(this));
        }
    }

    public final void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        setSelected(this.f62595d && view2 != null);
        if (view2 != null) {
            view2.setFocusableInTouchMode(false);
        }
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f62595d || i != 66) {
            return super.onKeyDown(i, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }
}
